package apimodels;

import apimodels.CreateMMMReportResponseData;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateMMMReportResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateMMMReportResponse   {
  @JsonProperty("code")
  @Valid

  private BigDecimal code;

  @JsonProperty("data")
  @Valid

  private CreateMMMReportResponseData data;

  public CreateMMMReportResponse code(BigDecimal code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  public BigDecimal getCode() {
    return code;
  }

  public void setCode(BigDecimal code) {
    this.code = code;
  }

  public CreateMMMReportResponse data(CreateMMMReportResponseData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

