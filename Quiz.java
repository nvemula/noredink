import java.util.*;

class Quiz{
  private List<Strand> strands;

  public static void main(String[] args){


      System.out.println("Enter number of questions:");
      int total = 0;
      List<Question> questions = new ArrayList<Question>();
      Quiz q = new Quiz();
      if(total>0){
        questions = q.getQuestions(total);
      }
      else{
        System.out.println("Number of questions must be greater than zero");
      }

      for(Question qu: questions){
        System.out.println(qu.id);
      }
  }

  private void mockData(){

      this.strands = new ArrayList<Strand>();
      Strand strand1 = new Strand(1,"Nouns");

      Standard std1 = new Standard(1,"Common Nouns");

      Question q1 = new Question(1,0.7);
      Question q2 = new Question(2,0.6);
      std1.questions.add(q1);
      std1.questions.add(q2);
      strand1.standards.add(std1);

      Standard std2 = new Standard(2,"Abstract Nouns");
      Question q3 = new Question(3,0.8);
      std2.questions.add(q3);
      strand1.standards.add(std2);

      Standard std3 = new Standard(3,"Proper Nouns");
      Question q4 = new Question(4,0.2);
      Question q5 = new Question(5,0.5);
      Question q6 = new Question(6,0.4);

      std3.questions.add(q4);
      std3.questions.add(q5);
      std3.questions.add(q6);

      strand1.standards.add(std3);


      Strand strand2 = new Strand(2,"Verbs");
      Standard std21 = new Standard(4,"Action Verbs");
      Question q7 = new Question(7,0.9);
      Question q8 = new Question(8,0.1);

      std21.questions.add(q7);
      std21.questions.add(q8);
      strand2.standards.add(std21);

      Standard std22 = new Standard(4,"Transitive Verbs");
      Question q9 = new Question(9,0.3);
      Question q10 = new Question(10,0.6);
      Question q11 = new Question(11,0.4);
      std22.questions.add(q9);
      std22.questions.add(q10);
      std22.questions.add(q11);
      strand2.standards.add(std22);

      Standard std23 = new Standard(4,"Reflexive Verbs");
      Question q12 = new Question(12,0.2);
      std23.questions.add(q12);
      strand2.standards.add(std23);

      strands.add(strand1);
      strands.add(strand2);
  }

  private List<Question> getQuestions(int total){
        // Returns quiz questions
        List<Strand> filtered = distributeEvenly(this.strands), total);
        List<Question> questions = new ArrayList<Question>();

        return questions;
  }

  private List<Integer> distributeEvenly(List<Element> elements, int total){
      // Distributes the elements evenly and returns a list of elements
      HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
      boolean allzeroes = false;
      int zerocount = 0;
      List<Integer> ids = new ArrayList<Integer>();
      for(Element e:elements){
          if(map.containsKey(e.id)){
                int val = map.get(e.id);
                val++;
                map.put(e.id,val);
          }
          else{
            map.put(e.id,1);
          }
      }

      while(true){
        for(int i: map.keySet()){
          int val = map.get(i);
          if((val>0 && !allzeroes) || (val<=0 && allzeroes)){
              ids.add(i);
              total--;
              val--;
              if(val==0){
                zerocount++;
              }
              map.put(i,val);
          }
        }
        if(zerocount >= map.keySet().size()){
            allzeroes = true;
        }

        if(total==0){
          break;
        }
    }
      return ids;
  }

  private List<Question> selectQuestions(List<Standard> stds){
      // Returns questions based on the standards
      return new ArrayList<Question>();
  }


}
