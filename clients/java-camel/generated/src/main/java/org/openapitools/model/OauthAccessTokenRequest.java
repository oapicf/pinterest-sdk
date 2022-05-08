package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Describes the valid schema for possible OAuth access token requests.
 */

@Schema(name = "OauthAccessTokenRequest", description = "Describes the valid schema for possible OAuth access token requests.")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "grant_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = OauthAccessTokenRequestCode.class, name = "authorization_code"),
  @JsonSubTypes.Type(value = OauthAccessTokenRequestRefresh.class, name = "refresh_token"),
})
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2022-05-08T00:32:37.756477Z[Etc/UTC]")
public class OauthAccessTokenRequest   {

  /**
   * Gets or Sets grantType
   */
  public enum GrantTypeEnum {
    AUTHORIZATION_CODE("authorization_code"),
    
    REFRESH_TOKEN("refresh_token");

    private String value;

    GrantTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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
  private GrantTypeEnum grantType;

  public OauthAccessTokenRequest grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

  /**
   * Get grantType
   * @return grantType
  */
  @NotNull 
  @Schema(name = "grant_type", required = true)
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
    OauthAccessTokenRequest oauthAccessTokenRequest = (OauthAccessTokenRequest) o;
    return Objects.equals(this.grantType, oauthAccessTokenRequest.grantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthAccessTokenRequest {\n");
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

