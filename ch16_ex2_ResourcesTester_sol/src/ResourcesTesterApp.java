import java.io.*;

public class ResourcesTesterApp {

    @SuppressWarnings("unused")
	public static void main(String[] args) {
        String s1 = readLineWithResources();
        String s2 = readLineWithFinally();
    }

    public static String readLineWithResources() {
        System.out.println("Starting readLineWithResources method.");

        try (BufferedReader in = new BufferedReader(
                    new FileReader("products.txt1"))) {
            String s = in.readLine();
            return s;
        } catch (IOException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public static String readLineWithFinally() {
        System.out.println("Starting readLineWithFinally method.");

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("products.txt1"));
            String s = in.readLine();
            return s;
        } catch (IOException e) {
            System.out.println(e.toString());
            return null;
        } finally {
            try {
                if (in != null) {
                    if (true) {
                        throw new IOException("Test exception");
                    }
                    in.close();
                    System.out.println("File was closed.");
                } else {
                    System.out.println("File was never opened.");
                }
            } catch (IOException e) {
                System.out.println("Unable to close file.");
            }
        }
    }
}
