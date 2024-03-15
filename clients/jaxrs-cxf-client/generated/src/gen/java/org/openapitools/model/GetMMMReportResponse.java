package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.GetMMMReportResponseData;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetMMMReportResponse  {
  
  @ApiModelProperty(example = "0", value = "")
  private BigDecimal code;

  @ApiModelProperty(value = "")
  private GetMMMReportResponseData data;

  @ApiModelProperty(example = "ok", value = "")
  private String message;

  @ApiModelProperty(example = "success", value = "")
  private String status;
 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public BigDecimal getCode() {
    return code;
  }

  public void setCode(BigDecimal code) {
    this.code = code;
  }

  public GetMMMReportResponse code(BigDecimal code) {
    this.code = code;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public GetMMMReportResponseData getData() {
    return data;
  }

  public void setData(GetMMMReportResponseData data) {
    this.data = data;
  }

  public GetMMMReportResponse data(GetMMMReportResponseData data) {
    this.data = data;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public GetMMMReportResponse message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetMMMReportResponse status(String status) {
    this.status = status;
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
    GetMMMReportResponse getMMMReportResponse = (GetMMMReportResponse) o;
    return Objects.equals(this.code, getMMMReportResponse.code) &&
        Objects.equals(this.data, getMMMReportResponse.data) &&
        Objects.equals(this.message, getMMMReportResponse.message) &&
        Objects.equals(this.status, getMMMReportResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data, message, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMMMReportResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

