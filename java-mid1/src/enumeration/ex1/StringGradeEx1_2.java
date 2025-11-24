package enumeration.ex1;

import enumeration.ex1.DiscountService;

public class StringGradeEx1_2 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 아무리 상수처리 한다고 하더라도 String으로 들어오는 방법을 막을 수 없다.
        int vip = discountService.discount("VIP", price);
        System.out.println("vip 등급의 할인 금액 : " + vip);
    }
}
