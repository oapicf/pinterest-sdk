package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibStatus204;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("campaign_ad_preview_delete_200_response_inner_status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignAdPreviewDelete200ResponseInnerStatus   {
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into BigDecimal, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static StatusCodeEnum fromString(String s) {
        for (StatusCodeEnum b : StatusCodeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
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
  private Integer code;
  private String message;

  public CampaignAdPreviewDelete200ResponseInnerStatus() {
  }

  @JsonCreator
  public CampaignAdPreviewDelete200ResponseInnerStatus(
    @JsonProperty(required = true, value = "statusCode") StatusCodeEnum statusCode,
    @JsonProperty(required = true, value = "code") Integer code,
    @JsonProperty(required = true, value = "message") String message
  ) {
    this.statusCode = statusCode;
    this.code = code;
    this.message = message;
  }

  /**
   **/
  public CampaignAdPreviewDelete200ResponseInnerStatus statusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "statusCode")
  @NotNull public StatusCodeEnum getStatusCode() {
    return statusCode;
  }

  @JsonProperty(required = true, value = "statusCode")
  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

  /**
   **/
  public CampaignAdPreviewDelete200ResponseInnerStatus code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "code")
  @NotNull public Integer getCode() {
    return code;
  }

  @JsonProperty(required = true, value = "code")
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   **/
  public CampaignAdPreviewDelete200ResponseInnerStatus message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "message")
  @NotNull public String getMessage() {
    return message;
  }

  @JsonProperty(required = true, value = "message")
  public void setMessage(String message) {
    this.message = message;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
