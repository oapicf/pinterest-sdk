package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "grant_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = OauthAccessTokenRequestCode.class, name = "authorization_code"),
  @JsonSubTypes.Type(value = OauthAccessTokenRequestRefresh.class, name = "refresh_token"),
})

/**
 * Describes the valid schema for possible OAuth access token requests.
 */
@ApiModel(description="Describes the valid schema for possible OAuth access token requests.")

public class OauthAccessTokenRequest  {
  
public enum GrantTypeEnum {

    @JsonProperty("authorization_code") AUTHORIZATION_CODE(String.valueOf("authorization_code")),
    @JsonProperty("refresh_token") REFRESH_TOKEN(String.valueOf("refresh_token"));

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
  public OauthAccessTokenRequest grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

