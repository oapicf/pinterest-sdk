package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A request to exchange a refresh token for a new access token.
 */
@ApiModel(description="A request to exchange a refresh token for a new access token.")

public class OauthAccessTokenRequestRefresh  {
  
public enum GrantTypeEnum {

    @JsonProperty("authorization_code") AUTHORIZATION_CODE(String.valueOf("authorization_code")),
    @JsonProperty("refresh_token") REFRESH_TOKEN(String.valueOf("refresh_token")),
    @JsonProperty("client_credentials") CLIENT_CREDENTIALS(String.valueOf("client_credentials"));

    private String value;

    GrantTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GrantTypeEnum fromValue(String value) {
        for (GrantTypeEnum b : GrantTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private GrantTypeEnum grantType;

  @ApiModelProperty(required = true, value = "")
  private String refreshToken;

  @ApiModelProperty(value = "")
  private String scope;

 /**
  * Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
  */
  @ApiModelProperty(value = "Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".")
  private Boolean refreshOn;
 /**
  * Get grantType
  * @return grantType
  */
  @JsonProperty("grant_type")
  @NotNull
  public String getGrantType() {
    return grantType == null ? null : grantType.value();
  }

  /**
   * Sets the <code>grantType</code> property.
   */
 public void setGrantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
  }

  /**
   * Sets the <code>grantType</code> property.
   */
  public OauthAccessTokenRequestRefresh grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

 /**
  * Get refreshToken
  * @return refreshToken
  */
  @JsonProperty("refresh_token")
  @NotNull
  public String getRefreshToken() {
    return refreshToken;
  }

  /**
   * Sets the <code>refreshToken</code> property.
   */
 public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  /**
   * Sets the <code>refreshToken</code> property.
   */
  public OauthAccessTokenRequestRefresh refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

 /**
  * Get scope
  * @return scope
  */
  @JsonProperty("scope")
  public String getScope() {
    return scope;
  }

  /**
   * Sets the <code>scope</code> property.
   */
 public void setScope(String scope) {
    this.scope = scope;
  }

  /**
   * Sets the <code>scope</code> property.
   */
  public OauthAccessTokenRequestRefresh scope(String scope) {
    this.scope = scope;
    return this;
  }

 /**
  * Setting this field to &lt;code&gt;true&lt;/code&gt; will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \&quot;everlasting_refresh\&quot;.
  * @return refreshOn
  */
  @JsonProperty("refresh_on")
  public Boolean getRefreshOn() {
    return refreshOn;
  }

  /**
   * Sets the <code>refreshOn</code> property.
   */
 public void setRefreshOn(Boolean refreshOn) {
    this.refreshOn = refreshOn;
  }

  /**
   * Sets the <code>refreshOn</code> property.
   */
  public OauthAccessTokenRequestRefresh refreshOn(Boolean refreshOn) {
    this.refreshOn = refreshOn;
    return this;
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
    return Objects.equals(this.grantType, oauthAccessTokenRequestRefresh.grantType) &&
        Objects.equals(this.refreshToken, oauthAccessTokenRequestRefresh.refreshToken) &&
        Objects.equals(this.scope, oauthAccessTokenRequestRefresh.scope) &&
        Objects.equals(this.refreshOn, oauthAccessTokenRequestRefresh.refreshOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, refreshToken, scope, refreshOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequestRefresh {\n");
    
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    refreshOn: ").append(toIndentedString(refreshOn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

