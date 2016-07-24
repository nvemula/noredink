import java.util.*;

class Standard extends Element {
    List<Question> questions;

    Standard(int id, String name){
        this.id = id;
        this.name = name;
        this.questions = new ArrayList<Question>();
    }
}
