package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.openapitools.server.api.model.CreateMMMReportResponseData;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateMMMReportResponse   {
  
  private BigDecimal code;
  private CreateMMMReportResponseData data;

  public CreateMMMReportResponse () {

  }

  public CreateMMMReportResponse (BigDecimal code, CreateMMMReportResponseData data) {
    this.code = code;
    this.data = data;
  }

    
  @JsonProperty("code")
  public BigDecimal getCode() {
    return code;
  }
  public void setCode(BigDecimal code) {
    this.code = code;
  }

    
  @JsonProperty("data")
  public CreateMMMReportResponseData getData() {
    return data;
  }
  public void setData(CreateMMMReportResponseData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMMMReportResponse createMMMReportResponse = (CreateMMMReportResponse) o;
    return Objects.equals(code, createMMMReportResponse.code) &&
        Objects.equals(data, createMMMReportResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMMMReportResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
