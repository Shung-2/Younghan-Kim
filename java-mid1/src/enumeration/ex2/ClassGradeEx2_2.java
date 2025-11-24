package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();
        // 그런데 객체를 생성해서 처리해버리면? → Private 생성자로 막아버리자.
        // ClassGrade newClassGrade = new ClassGrade();
        // int result = discountService.discount(newClassGrade, price);
        // System.out.println("basic 등급 할인 금액 : " + result);
    }
}
