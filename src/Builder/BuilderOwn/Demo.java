package Builder.BuilderOwn;

import Builder.BuilderOwn.builder.DTOResponseBuilder;
import Builder.BuilderOwn.director.Director;
import Builder.BuilderOwn.dto.DTOResponse;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        DTOResponseBuilder dto = new DTOResponseBuilder();

        director.constructorDesarrolladores(dto);
        DTOResponse obj = dto.getResult();
        obj.getInfo();
    }
}
