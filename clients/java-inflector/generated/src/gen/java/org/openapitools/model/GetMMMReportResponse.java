package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.GetMMMReportResponseData;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GetMMMReportResponse   {
  @JsonProperty("code")
  private BigDecimal code;

  @JsonProperty("data")
  private GetMMMReportResponseData data;

  @JsonProperty("message")
  private String message;

  @JsonProperty("status")
  private String status;

  /**
   **/
  public GetMMMReportResponse code(BigDecimal code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty("code")
  public BigDecimal getCode() {
    return code;
  }
  public void setCode(BigDecimal code) {
    this.code = code;
  }

  /**
   **/
  public GetMMMReportResponse data(GetMMMReportResponseData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public GetMMMReportResponseData getData() {
    return data;
  }
  public void setData(GetMMMReportResponseData data) {
    this.data = data;
  }

  /**
   **/
  public GetMMMReportResponse message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(example = "ok", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  public GetMMMReportResponse status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "success", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
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
    return Objects.equals(code, getMMMReportResponse.code) &&
        Objects.equals(data, getMMMReportResponse.data) &&
        Objects.equals(message, getMMMReportResponse.message) &&
        Objects.equals(status, getMMMReportResponse.status);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

