package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.CreateMMMReportResponseData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateMMMReportResponse  {
  
  @ApiModelProperty(example = "0", value = "")
  @Valid
  private BigDecimal code;

  @ApiModelProperty(value = "")
  @Valid
  private CreateMMMReportResponseData data;
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

  public CreateMMMReportResponse code(BigDecimal code) {
    this.code = code;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public CreateMMMReportResponseData getData() {
    return data;
  }

  public void setData(CreateMMMReportResponseData data) {
    this.data = data;
  }

  public CreateMMMReportResponse data(CreateMMMReportResponseData data) {
    this.data = data;
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
    CreateMMMReportResponse createMMMReportResponse = (CreateMMMReportResponse) o;
    return Objects.equals(this.code, createMMMReportResponse.code) &&
        Objects.equals(this.data, createMMMReportResponse.data);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

