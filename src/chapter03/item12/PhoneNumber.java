package chapter03.item12;

public class PhoneNumber {
    private final int areaCode;
    private final int prefix;
    private final int lineNum;

    public int getAreaCode() {
        return areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public int getLineNum() {
        return lineNum;
    }

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNum = lineNum;
    }

    /**
     * 이 전화번호의 문자열 표현을 반환한다.
     * 이 문자열은 "XXX-YYY-ZZZZ" 형태의 12글자로 구성된다.
     * XXX는 지역 코드, YYY는 프리픽스, ZZZZ는 가입자 번호다.
     * 각 부분이 너무 작아 자릿수를 채울 수 없다면 앞에 0을 붙인다.
     * 예: 가입자 번호가 123이면 마지막 네 문자는 "0123"이 된다.
     */
    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d", areaCode, prefix, lineNum);
    }

    /**
     * 이 객체의 대략적인 설명을 반환한다.
     * 반환되는 문자열 형식은 정해지지 않았으며, 향후 변경될 수 있다.
     */
   /* @Override
    public String toString() {
        return String.format("[PhoneNumber: 지역 코드=%d, 프리픽스=%d, 번호=%d]", areaCode, prefix, lineNum);
    }*/


}
