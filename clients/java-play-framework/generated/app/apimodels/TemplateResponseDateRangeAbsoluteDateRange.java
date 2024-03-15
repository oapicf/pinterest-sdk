package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The absolute date range of the template
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TemplateResponseDateRangeAbsoluteDateRange   {
  @JsonProperty("type")
  
  private String type;

  @JsonProperty("start_date")
  @Valid

  private BigDecimal startDate;

  @JsonProperty("end_date")
  @Valid

  private BigDecimal endDate;

  public TemplateResponseDateRangeAbsoluteDateRange type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The date range type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TemplateResponseDateRangeAbsoluteDateRange startDate(BigDecimal startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the date range
   * @return startDate
  **/
  public BigDecimal getStartDate() {
    return startDate;
  }

  public void setStartDate(BigDecimal startDate) {
    this.startDate = startDate;
  }

  public TemplateResponseDateRangeAbsoluteDateRange endDate(BigDecimal endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the date range
   * @return endDate
  **/
  public BigDecimal getEndDate() {
    return endDate;
  }

  public void setEndDate(BigDecimal endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponseDateRangeAbsoluteDateRange templateResponseDateRangeAbsoluteDateRange = (TemplateResponseDateRangeAbsoluteDateRange) o;
    return Objects.equals(type, templateResponseDateRangeAbsoluteDateRange.type) &&
        Objects.equals(startDate, templateResponseDateRangeAbsoluteDateRange.startDate) &&
        Objects.equals(endDate, templateResponseDateRangeAbsoluteDateRange.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, startDate, endDate);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDateRangeAbsoluteDateRange {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

