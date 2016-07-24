import java.util.*;

class Quiz{

  public static void main(String[] args){

      System.out.println("Enter number of questions:");
      int total = 0;
      List<Question> questions;
      Quiz q = new Quiz();
      if(number>0){
        questions = q.getQuestions(total);
      }
      else{
        System.out.println("Number of questions must be greater than zero");
      }

      for(Question qu: questions){
        System.out.println(qu.id);
      }
  }

  private List<Question> getQuestions(int total){
        // Returns quiz questions
        List<Questions> questions = new ArrayList<Question>();
        return questions;
  }

  private List<Element> distributeEvenly(List<Element> elements){
      // Distributes the elements evenly and returns a list of elements
      return elements;
  }

  private List<Question> selectQuestions(List<Standard> standard){
      // Returns questions based on the standards
      return questions;
  }


}
