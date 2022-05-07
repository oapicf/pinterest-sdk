package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OauthAccessTokenResponse;
import org.openapitools.model.OauthAccessTokenResponseCodeAllOf;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="A successful OAuth access token response for the authorization code flow.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-07T06:42:17.586199Z[Etc/UTC]")
public class OauthAccessTokenResponseCode extends OauthAccessTokenResponse  {
  
  private String refreshToken;
  private Integer refreshTokenExpiresIn;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("refresh_token")
  @NotNull
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("refresh_token_expires_in")
  @NotNull
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
    return Objects.equals(refreshToken, oauthAccessTokenResponseCode.refreshToken) &&
        Objects.equals(refreshTokenExpiresIn, oauthAccessTokenResponseCode.refreshTokenExpiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refreshToken, refreshTokenExpiresIn);
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

