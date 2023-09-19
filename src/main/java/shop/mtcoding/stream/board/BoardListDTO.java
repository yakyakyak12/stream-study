package shop.mtcoding.stream.board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class BoardListDTO {
    private Integer id;
    private String title;
    private String author;

    public BoardListDTO(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.author = board.getAuthor();
    }

}
