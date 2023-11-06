package com.thehecklers.sburrestdemo.Domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//유저 정보
@Document(collection = "Users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    //사용자 Email
    private String _id;

    private String Name;

    private String Channel_Name;

    private String Locale;

    private String Picture;
}