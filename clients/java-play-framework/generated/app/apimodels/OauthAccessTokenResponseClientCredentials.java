package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A successful OAuth client token response for the client token flow.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OauthAccessTokenResponseClientCredentials   {
  /**
   * Gets or Sets responseType
   */
  public enum ResponseTypeEnum {
    AUTHORIZATION_CODE("authorization_code"),
    
    REFRESH_TOKEN("refresh_token"),
    
    CLIENT_CREDENTIALS("client_credentials");

    private final String value;

    ResponseTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResponseTypeEnum fromValue(String value) {
      for (ResponseTypeEnum b : ResponseTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("response_type")
  
  private ResponseTypeEnum responseType;

  @JsonProperty("access_token")
  @NotNull

  private String accessToken;

  @JsonProperty("token_type")
  @NotNull

  private String tokenType = "bearer";

  @JsonProperty("expires_in")
  @NotNull

  private Integer expiresIn;

  @JsonProperty("scope")
  @NotNull

  private String scope;

  public OauthAccessTokenResponseClientCredentials responseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
    return this;
  }

   /**
   * Get responseType
   * @return responseType
  **/
  public ResponseTypeEnum getResponseType() {
    return responseType;
  }

  public void setResponseType(ResponseTypeEnum responseType) {
    this.responseType = responseType;
  }

  public OauthAccessTokenResponseClientCredentials accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public OauthAccessTokenResponseClientCredentials tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public OauthAccessTokenResponseClientCredentials expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Get expiresIn
   * @return expiresIn
  **/
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public OauthAccessTokenResponseClientCredentials scope(String scope) {
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccessTokenResponseClientCredentials oauthAccessTokenResponseClientCredentials = (OauthAccessTokenResponseClientCredentials) o;
    return Objects.equals(responseType, oauthAccessTokenResponseClientCredentials.responseType) &&
        Objects.equals(accessToken, oauthAccessTokenResponseClientCredentials.accessToken) &&
        Objects.equals(tokenType, oauthAccessTokenResponseClientCredentials.tokenType) &&
        Objects.equals(expiresIn, oauthAccessTokenResponseClientCredentials.expiresIn) &&
        Objects.equals(scope, oauthAccessTokenResponseClientCredentials.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseType, accessToken, tokenType, expiresIn, scope);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponseClientCredentials {\n");
    
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

