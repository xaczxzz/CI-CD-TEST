package com.thehecklers.sburrestdemo.Domain;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Document(collection = "Author")
@Getter
@Setter
@NoArgsConstructor
public class Author {
    @Id
    private String name;
    public int[] All_Emotion3 = new int[3];
    public int[] All_Emotion7 = new int[7];
    public List<Chat> chat = new ArrayList<Chat>();
    @DBRef
    private BroadCast broadCast;
}
