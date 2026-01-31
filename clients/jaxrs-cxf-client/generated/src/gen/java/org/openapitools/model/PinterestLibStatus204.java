package org.openapitools.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The resource was successfully deleted.
 */
@ApiModel(description="The resource was successfully deleted.")

public class PinterestLibStatus204  {
  
public enum StatusCodeEnum {

NUMBER_204(BigDecimal.valueOf(new BigDecimal("204")));


    private BigDecimal value;

    StatusCodeEnum (BigDecimal v) {
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

  @ApiModelProperty(required = true, value = "")

  private StatusCodeEnum statusCode;
 /**
   * Get statusCode
   * @return statusCode
  **/
  @JsonProperty("statusCode")
  public BigDecimal getStatusCode() {
    if (statusCode == null) {
      return null;
    }
    return statusCode.value();
  }

  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  public PinterestLibStatus204 statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

