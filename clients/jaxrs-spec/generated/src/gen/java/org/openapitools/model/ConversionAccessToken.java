package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A successful conversion access token response.
 **/
@ApiModel(description = "A successful conversion access token response.")
@JsonTypeName("ConversionAccessToken")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionAccessToken   {
  private String accessToken;
  private String tokenType = "conversion";

  public ConversionAccessToken() {
  }

  @JsonCreator
  public ConversionAccessToken(
    @JsonProperty(required = true, value = "access_token") String accessToken
  ) {
    this.accessToken = accessToken;
  }

  /**
   **/
  public ConversionAccessToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "access_token")
  @NotNull public String getAccessToken() {
    return accessToken;
  }

  @JsonProperty(required = true, value = "access_token")
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   **/
  public ConversionAccessToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("token_type")
  public String getTokenType() {
    return tokenType;
  }

  @JsonProperty("token_type")
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
