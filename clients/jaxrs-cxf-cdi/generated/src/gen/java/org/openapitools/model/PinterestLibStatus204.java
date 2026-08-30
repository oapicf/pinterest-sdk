package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The resource was successfully deleted.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The resource was successfully deleted.")
public class PinterestLibStatus204   {
  

public enum StatusCodeEnum {

    @JsonProperty("new BigDecimal("204")") NUMBER_204(BigDecimal.valueOf(new BigDecimal("204")));


    private BigDecimal value;

    StatusCodeEnum(BigDecimal v) {
        value = v;
    }

    public BigDecimal value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusCodeEnum fromValue(BigDecimal value) {
        for (StatusCodeEnum b : StatusCodeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private StatusCodeEnum statusCode;

  /**
   **/
  public PinterestLibStatus204 statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("statusCode")
  @NotNull
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinterestLibStatus204 pinterestLibStatus204 = (PinterestLibStatus204) o;
    return Objects.equals(this.statusCode, pinterestLibStatus204.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinterestLibStatus204 {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

