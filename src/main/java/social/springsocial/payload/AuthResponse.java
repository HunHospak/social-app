package social.springsocial.payload;

public class AuthResponse {
  private String accesToken;
  private String tokenType = "Bearer ";

  public AuthResponse(String accesToken) {
    this.accesToken = accesToken;
  }

  public String getAccesToken() {
    return accesToken;
  }

  public void setAccesToken(String accesToken) {
    this.accesToken = accesToken;
  }

  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }
}
