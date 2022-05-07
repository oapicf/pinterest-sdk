package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OauthAccessTokenResponseCodeAllOf   {
  
  private String refreshToken;
  private Integer refreshTokenExpiresIn;

  public OauthAccessTokenResponseCodeAllOf () {

  }

  public OauthAccessTokenResponseCodeAllOf (String refreshToken, Integer refreshTokenExpiresIn) {
    this.refreshToken = refreshToken;
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

    
  @JsonProperty("refresh_token")
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

    
  @JsonProperty("refresh_token_expires_in")
  public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }
  public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccessTokenResponseCodeAllOf oauthAccessTokenResponseCodeAllOf = (OauthAccessTokenResponseCodeAllOf) o;
    return Objects.equals(refreshToken, oauthAccessTokenResponseCodeAllOf.refreshToken) &&
        Objects.equals(refreshTokenExpiresIn, oauthAccessTokenResponseCodeAllOf.refreshTokenExpiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, refreshTokenExpiresIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponseCodeAllOf {\n");
    
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
