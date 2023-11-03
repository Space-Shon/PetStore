package ru.hh.Pets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.hh.request.PetRequest;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    private Integer id;
    private String name;
    private Integer age;
    private String type;
    private Integer cost;

    public void create(PetRequest petRequest, Integer id){
        this.id = id;
        this.name = petRequest.getName();
        this.age = petRequest.getAge();
        this.type = petRequest.getType();
        this.cost = petRequest.getCost();
    }
}
