package shop.mtcoding.stream.lab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class StreamEx02Test {

    // 중개연산 여러개 사용해보기
    @Test
    public void ex05() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> newList = list.stream()
                .skip(1)
                .limit(2)
                .map(t -> t * 2)
                .collect(Collectors.toList());
        newList.stream().forEach(t -> System.out.println(t));
    }

    // 뿌릴 수 있는 갯수 제한해보기
    @Test
    public void ex04() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        List<Integer> newList = list.stream()
                .limit(2)
                .collect(Collectors.toList());
        newList.stream().forEach(t -> System.out.println(t));
    }

    // map을 사용해서 함수 가공해보기
    @Test
    public void ex03() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> newList = list.stream()
                .filter(t -> t != 3)
                .map(t -> {
                    Integer r = t * 2;
                    return r;
                })
                .collect(Collectors.toList());
        newList.stream().forEach(t -> System.out.println(t));
    }

    // 3 빼고 출력하기 (true, false)
    @Test
    public void ex02() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> newList = list.stream()
                .filter(t -> t != 3)
                .collect(Collectors.toList());
        newList.stream().forEach(t -> System.out.println(t));
    }

    // 홀수 거르고 짝수만 출력하기
    @Test
    public void ex01() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> newList = list.stream()
                .filter(t -> t % 2 != 0)
                .collect(Collectors.toList());
        newList.stream().forEach(t -> System.out.println(t));
    }
}
