package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OauthAccessTokenResponse;

/**
 * A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
 */
@ApiModel(description = "A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OauthAccessTokenResponseEverlastingRefresh extends OauthAccessTokenResponse  {
  @JsonProperty("refresh_token")
  private String refreshToken;

  @JsonProperty("refresh_token_expires_in")
  private Integer refreshTokenExpiresIn;

  @JsonProperty("refresh_token_expires_at")
  private Integer refreshTokenExpiresAt;

  public OauthAccessTokenResponseEverlastingRefresh refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public OauthAccessTokenResponseEverlastingRefresh refreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

   /**
   * Get refreshTokenExpiresIn
   * @return refreshTokenExpiresIn
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getRefreshTokenExpiresIn() {
    return refreshTokenExpiresIn;
  }

  public void setRefreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
  }

  public OauthAccessTokenResponseEverlastingRefresh refreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
    return this;
  }

   /**
   * Get refreshTokenExpiresAt
   * @return refreshTokenExpiresAt
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getRefreshTokenExpiresAt() {
    return refreshTokenExpiresAt;
  }

  public void setRefreshTokenExpiresAt(Integer refreshTokenExpiresAt) {
    this.refreshTokenExpiresAt = refreshTokenExpiresAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthAccessTokenResponseEverlastingRefresh oauthAccessTokenResponseEverlastingRefresh = (OauthAccessTokenResponseEverlastingRefresh) o;
    return Objects.equals(this.refreshToken, oauthAccessTokenResponseEverlastingRefresh.refreshToken) &&
        Objects.equals(this.refreshTokenExpiresIn, oauthAccessTokenResponseEverlastingRefresh.refreshTokenExpiresIn) &&
        Objects.equals(this.refreshTokenExpiresAt, oauthAccessTokenResponseEverlastingRefresh.refreshTokenExpiresAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, refreshTokenExpiresIn, refreshTokenExpiresAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenResponseEverlastingRefresh {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    refreshTokenExpiresIn: ").append(toIndentedString(refreshTokenExpiresIn)).append("\n");
    sb.append("    refreshTokenExpiresAt: ").append(toIndentedString(refreshTokenExpiresAt)).append("\n");
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

