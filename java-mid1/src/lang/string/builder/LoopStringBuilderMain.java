package lang.string.builder;

public class LoopStringBuilderMain {

    public static void main(String[] args) {

        long stratTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10000000; i++) {
            sb.append("Hello Java ");
        }
        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println("result : " + result);
        System.out.println("time : " + (endTime - stratTime) + "ms");
    }
}
