package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.OauthAccessTokenResponse;

/**
 * A successful OAuth access token response for the authorization code flow.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OauthAccessTokenResponseCode extends OauthAccessTokenResponse  {
  
  private String refreshToken;
  private Integer refreshTokenExpiresIn;

  public OauthAccessTokenResponseCode () {

  }

  public OauthAccessTokenResponseCode (String refreshToken, Integer refreshTokenExpiresIn) {
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
    OauthAccessTokenResponseCode oauthAccessTokenResponseCode = (OauthAccessTokenResponseCode) o;
    return super.equals(o) && Objects.equals(refreshToken, oauthAccessTokenResponseCode.refreshToken) &&
        Objects.equals(refreshTokenExpiresIn, oauthAccessTokenResponseCode.refreshTokenExpiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), refreshToken, super.hashCode(), refreshTokenExpiresIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponseCode {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
