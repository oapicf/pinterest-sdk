package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibStatus204;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignAdPreviewDelete200ResponseInnerStatus  {
  
public enum StatusCodeEnum {

    @JsonProperty(new BigDecimal("204")) NUMBER_204(BigDecimal.valueOf(new BigDecimal("204")));

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
  @Valid
  private StatusCodeEnum statusCode;

  @ApiModelProperty(required = true, value = "")
  private Integer code;

  @ApiModelProperty(required = true, value = "")
  private String message;
 /**
  * Get statusCode
  * @return statusCode
  */
  @JsonProperty("statusCode")
  @NotNull
  public BigDecimal getStatusCode() {
    return statusCode == null ? null : statusCode.value();
  }

  /**
   * Sets the <code>statusCode</code> property.
   */
 public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * Sets the <code>statusCode</code> property.
   */
  public CampaignAdPreviewDelete200ResponseInnerStatus statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }

 /**
  * Get code
  * @return code
  */
  @JsonProperty("code")
  @NotNull
  public Integer getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
 public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public CampaignAdPreviewDelete200ResponseInnerStatus code(Integer code) {
    this.code = code;
    return this;
  }

 /**
  * Get message
  * @return message
  */
  @JsonProperty("message")
  @NotNull
  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public CampaignAdPreviewDelete200ResponseInnerStatus message(String message) {
    this.message = message;
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
    CampaignAdPreviewDelete200ResponseInnerStatus campaignAdPreviewDelete200ResponseInnerStatus = (CampaignAdPreviewDelete200ResponseInnerStatus) o;
    return Objects.equals(this.statusCode, campaignAdPreviewDelete200ResponseInnerStatus.statusCode) &&
        Objects.equals(this.code, campaignAdPreviewDelete200ResponseInnerStatus.code) &&
        Objects.equals(this.message, campaignAdPreviewDelete200ResponseInnerStatus.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAdPreviewDelete200ResponseInnerStatus {\n");
    
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

