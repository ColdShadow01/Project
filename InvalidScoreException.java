// Creator: Wan Adam
// Tester: Nisa
// Description: Custom exception to catch grading logic errors and prevent invalid data saves
public class InvalidScoreException extends Exception {
  public InvalidScoreException(String message) {
    super(message);
  }
}
