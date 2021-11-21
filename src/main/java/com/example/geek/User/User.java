package com.example.geek.User;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@NoArgsConstructor
@Document(collection = "Users")
public class User {
    @Id
    private ObjectId id;
    private String name;
    private Long age;

    @Builder
    public User(ObjectId id, String name, Long age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
