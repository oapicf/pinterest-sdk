package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;



public class OauthAccessTokenResponseCodeAllOf   {
  
  private String refreshToken;

  private Integer refreshTokenExpiresIn;


  /**
   **/
  public OauthAccessTokenResponseCodeAllOf refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  
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
  public OauthAccessTokenResponseCodeAllOf refreshTokenExpiresIn(Integer refreshTokenExpiresIn) {
    this.refreshTokenExpiresIn = refreshTokenExpiresIn;
    return this;
  }

  
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

