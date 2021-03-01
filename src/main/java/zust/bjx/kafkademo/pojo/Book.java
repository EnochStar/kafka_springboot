package zust.bjx.kafkademo.pojo;

import lombok.Data;

/**
 * @author EnochStar
 * @title: Book
 * @projectName kafkademo
 * @description: TODO
 * @date 2021/2/28 15:29
 */
@Data
public class Book {
    private Long id;
    private String name;

    public Book() {
    }

    public Book(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
