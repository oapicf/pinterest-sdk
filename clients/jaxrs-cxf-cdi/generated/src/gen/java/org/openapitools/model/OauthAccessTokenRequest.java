package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Describes the valid schema for possible OAuth access token requests.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Describes the valid schema for possible OAuth access token requests.")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "grant_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = OauthAccessTokenRequestCode.class, name = "authorization_code"),
  @JsonSubTypes.Type(value = OauthAccessTokenRequestRefresh.class, name = "refresh_token"),
})

public class OauthAccessTokenRequest   {
  

public enum GrantTypeEnum {

    AUTHORIZATION_CODE(String.valueOf("authorization_code")), REFRESH_TOKEN(String.valueOf("refresh_token"));


    private String value;

    GrantTypeEnum(String v) {
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

  private GrantTypeEnum grantType;


  /**
   **/
  public OauthAccessTokenRequest grantType(GrantTypeEnum grantType) {
    this.grantType = grantType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("grant_type")
  @NotNull
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
    return Objects.equals(grantType, oauthAccessTokenRequest.grantType);
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

