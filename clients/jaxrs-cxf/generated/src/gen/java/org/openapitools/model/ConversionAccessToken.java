package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A successful conversion access token response.
 */
@ApiModel(description="A successful conversion access token response.")

public class ConversionAccessToken  {
  
  @ApiModelProperty(required = true, value = "")

  private String accessToken;

  @ApiModelProperty(value = "")

  private String tokenType = "conversion";
 /**
   * Get accessToken
   * @return accessToken
  **/
  @JsonProperty("access_token")
  @NotNull
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public ConversionAccessToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

 /**
   * Get tokenType
   * @return tokenType
  **/
  @JsonProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public ConversionAccessToken tokenType(String tokenType) {
    this.tokenType = tokenType;
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
    ConversionAccessToken conversionAccessToken = (ConversionAccessToken) o;
    return Objects.equals(this.accessToken, conversionAccessToken.accessToken) &&
        Objects.equals(this.tokenType, conversionAccessToken.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionAccessToken {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

