/* Creator: Wan Adam
   Tester: Nisa*/
public interface IQuiz {
  void loadQuestion(int index);
  boolean checkAnswer(int selectedAnswerIndex);
  void showResult() throws InvalidScoreException; // Throws custom exception
}
