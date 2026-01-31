package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OauthAccessTokenRequestRefresh
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-26T05:36:31.031329119Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OauthAccessTokenRequestRefresh   {
  @JsonProperty("refresh_token")
  @NotNull

  private String refreshToken;

  @JsonProperty("scope")
  
  private String scope;

  @JsonProperty("refresh_on")
  
  private Boolean refreshOn;

  /**
   * Gets or Sets grantType
   */
  public enum GrantTypeEnum {
    AUTHORIZATION_CODE("authorization_code"),
    
    REFRESH_TOKEN("refresh_token"),
    
    CLIENT_CREDENTIALS("client_credentials");

    private final String value;

    GrantTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GrantTypeEnum fromValue(String value) {
      for (GrantTypeEnum b : GrantTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("grant_type")
  @NotNull

  private GrantTypeEnum grantType;

  public OauthAccessTokenRequestRefresh refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OauthAccessTokenRequestRefresh scope(String scope) {
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

  public OauthAccessTokenRequestRefresh refreshOn(Boolean refreshOn) {
    this.refreshOn = refreshOn;
    return this;
  }

   /**
   * Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
   * @return refreshOn
  **/
  public Boolean getRefreshOn() {
    return refreshOn;
  }

  public void setRefreshOn(Boolean refreshOn) {
    this.refreshOn = refreshOn;
  }

  public OauthAccessTokenRequestRefresh grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

   /**
   * Get grantType
   * @return grantType
  **/
  public GrantTypeEnum getGrantType() {
    return grantType;
  }

  public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccessTokenRequestRefresh oauthAccessTokenRequestRefresh = (OauthAccessTokenRequestRefresh) o;
    return Objects.equals(refreshToken, oauthAccessTokenRequestRefresh.refreshToken) &&
        Objects.equals(scope, oauthAccessTokenRequestRefresh.scope) &&
        Objects.equals(refreshOn, oauthAccessTokenRequestRefresh.refreshOn) &&
        Objects.equals(grantType, oauthAccessTokenRequestRefresh.grantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, scope, refreshOn, grantType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequestRefresh {\n");
    
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    refreshOn: ").append(toIndentedString(refreshOn)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
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

