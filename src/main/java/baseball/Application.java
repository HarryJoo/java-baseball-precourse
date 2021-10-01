package baseball;

import baseball.domain.Judgement;
import baseball.domain.NumberGenerator;
import baseball.domain.Referee;

import java.util.Arrays;
import java.util.List;

// 객체 지향 프로그래밍
// 1. 기능을 가지고 있는 클래스를 인스턴스화(=객체)한다.
// 2. 필요한 기능을 (역할에 맞는) 각 인스턴스가 수행하게 한다.(의인화)
// 3. 각 결과를 종합한다.
public class Application {
    public static void main(String[] args) {
        //final NumberGenerator generator = new NumberGenerator();
        //final List<Integer> numbers = generator.createRandomNumbers();
        //System.out.println(numbers);

        //Judgement judgement = new Judgement();
        //final int count = judgement.correctCount(Arrays.asList(1, 8, 9), Arrays.asList(1, 2, 3));
        //System.out.println(count);

        //final boolean place = judgement.hasPlace(Arrays.asList(7, 8, 9), 1, 7);
        //System.out.println(place);

        final Referee referee = new Referee();
        final String result = referee.compare(Arrays.asList(7, 8, 9), Arrays.asList(1, 2, 3));
        System.out.println(result);
    }
}
