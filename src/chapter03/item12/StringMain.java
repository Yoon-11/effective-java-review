package chapter03.item12;

public class StringMain {
    public static void main(String[] args) {
     /*
        // ❌ 잘못된 사용 방식: toString()을 파싱해서 필드 값 추출

        PhoneNumber phone = new PhoneNumber(31, 867, 5309);
        String phoneString = phone.toString(); // "031-867-5309"

        String[] parts = phoneString.split("-"); // ["031", "867", "5309"]
        int areaCode = Integer.parseInt(parts[0]);  // 31 (정수 변환)
        int prefix = Integer.parseInt(parts[1]);    // 867
        int lineNum = Integer.parseInt(parts[2]);   // 5309

        System.out.println("지역 코드: " + areaCode);
        System.out.println("프리픽스: " + prefix);
        System.out.println("가입자 번호: " + lineNum);*/
        /**
         * toString()은 사람이 읽기 쉽게 만든 것인데, 코드가 toString()의 포맷에 의존하게 됨.
         * 만약 toString() 포맷이 "031 (867) 5309"로 변경되면? → 기존 파싱 코드가 깨짐!
         * toString()의 출력이 변할 경우, 이를 사용하는 모든 코드가 수정되어야 하는 문제 발생.
         */


        // ✅ 접근자 메서드 사용 (toString() 파싱 X)

        PhoneNumber phone = new PhoneNumber(567, 867, 5309);

        int areaCode = phone.getAreaCode();
        int prefix = phone.getPrefix();
        int lineNum = phone.getLineNum();

        System.out.println("지역 코드: " + areaCode);
        System.out.println("프리픽스: " + prefix);
        System.out.println("가입자 번호: " + lineNum);

        /**
         * toString()의 포맷이 바뀌더라도 코드가 깨지지 않음.
         * toString()은 사람이 읽기 쉽게, 접근자 메서드는 데이터를 안전하게 가져오도록 사용 가능.
         * 코드가 유지보수하기 쉬워짐.
         */



    }
}
