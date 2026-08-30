package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.PinterestLibError;
import org.openapitools.vertxweb.server.model.PinterestLibStatus204;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignAdPreviewDelete200ResponseInnerStatus   {
  


  public enum StatusCodeEnum {
    NUMBER_204(new BigDecimal("204"));

    private String value;

    StatusCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusCodeEnum statusCode;
  private Integer code;
  private String message;

  public CampaignAdPreviewDelete200ResponseInnerStatus () {

  }

  public CampaignAdPreviewDelete200ResponseInnerStatus (StatusCodeEnum statusCode, Integer code, String message) {
    this.statusCode = statusCode;
    this.code = code;
    this.message = message;
  }

    
  @JsonProperty("statusCode")
  public StatusCodeEnum getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(StatusCodeEnum statusCode) {
    this.statusCode = statusCode;
  }

    
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
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
    return Objects.equals(statusCode, campaignAdPreviewDelete200ResponseInnerStatus.statusCode) &&
        Objects.equals(code, campaignAdPreviewDelete200ResponseInnerStatus.code) &&
        Objects.equals(message, campaignAdPreviewDelete200ResponseInnerStatus.message);
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
