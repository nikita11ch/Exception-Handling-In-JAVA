package Exception_Handling;

public class MyAutoClosable implements AutoCloseable {
    
    @Override
    public void close() throws Exception {
        System.out.println("Resource closed");
    }
    
    public void display(String str) {
        if (str == null) {
            throw new RuntimeException("Input string cannot be null");
        } else {
            System.out.println("Yeh, I don't have exception");
        }
    }
    
    public static void main(String args[]) throws Exception {
        try (MyAutoClosable m = new MyAutoClosable()) {
            m.display(null);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
