import java.util.*;

class Strand extends Element{

  List<Standard> standards;

  Strand(int id, String name){
      this.id = id;
      this.name = name;
      this.standards = new ArrayList<Standard>();
  }
}
