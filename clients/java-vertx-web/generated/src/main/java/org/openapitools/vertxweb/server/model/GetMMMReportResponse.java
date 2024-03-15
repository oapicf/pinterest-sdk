package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.GetMMMReportResponseData;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMMMReportResponse   {
  
  private BigDecimal code;
  private GetMMMReportResponseData data;
  private String message;
  private String status;

  public GetMMMReportResponse () {

  }

  public GetMMMReportResponse (BigDecimal code, GetMMMReportResponseData data, String message, String status) {
    this.code = code;
    this.data = data;
    this.message = message;
    this.status = status;
  }

    
  @JsonProperty("code")
  public BigDecimal getCode() {
    return code;
  }
  public void setCode(BigDecimal code) {
    this.code = code;
  }

    
  @JsonProperty("data")
  public GetMMMReportResponseData getData() {
    return data;
  }
  public void setData(GetMMMReportResponseData data) {
    this.data = data;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

    
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
