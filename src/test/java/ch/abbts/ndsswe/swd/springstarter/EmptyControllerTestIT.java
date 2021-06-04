public class EmptyControllerTestIT {
  @Test
  @DisplayName("/empty/ returns 200")
  public void empty_returns_200() {
    when().
        get("/empty/").
        then().
        statusCode(200)
    );
  }
}