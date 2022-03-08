public class BufferTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

        String lorem1 = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua."+ "\n";
        String lorem2 = "At vero eos et accusam et justo duo dolores et ea rebum."+ "\n";
        String lorem3 = "Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet."+ "\n";
        String lorem4 = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua."+ "\n";
        String lorem5 = "At vero eos et accusam et justo duo dolores et ea rebum."+ "\n";
        String lorem6 = "Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet."+ "\n";

        buffer.append(lorem1);
        buffer.append(lorem2);
        buffer.append(lorem3);
        buffer.append(lorem4);
        buffer.append(lorem5);
        buffer.append(lorem6);

        String completeString = buffer.toString();
        System.out.println(completeString);
    }
}
