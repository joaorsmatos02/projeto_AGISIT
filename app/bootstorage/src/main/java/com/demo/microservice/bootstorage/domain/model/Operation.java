package com.demo.microservice.bootstorage.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document; 


/**
 * Created by Arpit Khandelwal.
 */
@Setter
@Getter
@Accessors(chain = true)
@NoArgsConstructor
@Document(collection = "Operation") 
public class Operation {
    @Id
    private  String id;
    private  Long timestamp;
    private  String num1;
    private  String num2;
    private  String op;
    private  String result;

    @Override
    public String toString() {
        return num1.concat(" ")
                .concat(op)
                .concat(" ")
                .concat(num2)
                .concat(" = ")
                .concat(result);
    }
}
