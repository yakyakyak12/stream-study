package shop.mtcoding.stream.lab;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import shop.mtcoding.stream.board.Board;
import shop.mtcoding.stream.board.BoardDetailDTO;
import shop.mtcoding.stream.board.BoardListDTO;

public class StreamEx03Test {

    // DTO 입의 값 넣고 중개연산으로 필요한 값 찾기
    @Test
    public void ex02() {
        Board b1 = Board.builder()
                .id(1)
                .title("제목1")
                .content("내용1")
                .author("ssar")
                .build();
        Board b2 = Board.builder()
                .id(2)
                .title("제목2")
                .content("내용2")
                .author("ssar")
                .build();
        Board b3 = Board.builder()
                .id(3)
                .title("제목3")
                .content("내용3")
                .author("cos")
                .build();
        List<Board> boardList = Arrays.asList(b1, b2, b3);
        List<BoardListDTO> responseDtos = boardList.stream()
                .filter(board -> !board.getAuthor().equals("cos"))
                .filter(board -> !board.getContent().contains("1"))
                .map(board -> new BoardListDTO(board))
                // .map(BoardListDTO::new) 이렇게도 사용할 수 있음
                .collect(Collectors.toList());
        System.out.println(responseDtos);
    }

    // DTO로 board 객체안 값 뿌려보기
    @Test
    public void ex01() {
        Board board = Board.builder()
                .id(1)
                .title("제목1")
                .content("내용1")
                .author("ssar")
                .build();

        BoardDetailDTO responscDTO = new BoardDetailDTO(board);
        System.out.println(responscDTO);
    }
}
