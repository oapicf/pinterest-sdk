package apimodels;

import apimodels.TemplateResponseDateRangeAbsoluteDateRange;
import apimodels.TemplateResponseDateRangeDynamicDateRange;
import apimodels.TemplateResponseDateRangeRelativeDateRange;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * TemplateResponseDateRange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TemplateResponseDateRange   {
  @JsonProperty("dynamic_date_range")
  @Valid

  private TemplateResponseDateRangeDynamicDateRange dynamicDateRange;

  @JsonProperty("relative_date_range")
  @Valid

  private TemplateResponseDateRangeRelativeDateRange relativeDateRange;

  @JsonProperty("absolute_date_range")
  @Valid

  private TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange;

  public TemplateResponseDateRange dynamicDateRange(TemplateResponseDateRangeDynamicDateRange dynamicDateRange) {
    this.dynamicDateRange = dynamicDateRange;
    return this;
  }

   /**
   * Get dynamicDateRange
   * @return dynamicDateRange
  **/
  public TemplateResponseDateRangeDynamicDateRange getDynamicDateRange() {
    return dynamicDateRange;
  }

  public void setDynamicDateRange(TemplateResponseDateRangeDynamicDateRange dynamicDateRange) {
    this.dynamicDateRange = dynamicDateRange;
  }

  public TemplateResponseDateRange relativeDateRange(TemplateResponseDateRangeRelativeDateRange relativeDateRange) {
    this.relativeDateRange = relativeDateRange;
    return this;
  }

   /**
   * Get relativeDateRange
   * @return relativeDateRange
  **/
  public TemplateResponseDateRangeRelativeDateRange getRelativeDateRange() {
    return relativeDateRange;
  }

  public void setRelativeDateRange(TemplateResponseDateRangeRelativeDateRange relativeDateRange) {
    this.relativeDateRange = relativeDateRange;
  }

  public TemplateResponseDateRange absoluteDateRange(TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange) {
    this.absoluteDateRange = absoluteDateRange;
    return this;
  }

   /**
   * Get absoluteDateRange
   * @return absoluteDateRange
  **/
  public TemplateResponseDateRangeAbsoluteDateRange getAbsoluteDateRange() {
    return absoluteDateRange;
  }

  public void setAbsoluteDateRange(TemplateResponseDateRangeAbsoluteDateRange absoluteDateRange) {
    this.absoluteDateRange = absoluteDateRange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponseDateRange templateResponseDateRange = (TemplateResponseDateRange) o;
    return Objects.equals(dynamicDateRange, templateResponseDateRange.dynamicDateRange) &&
        Objects.equals(relativeDateRange, templateResponseDateRange.relativeDateRange) &&
        Objects.equals(absoluteDateRange, templateResponseDateRange.absoluteDateRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dynamicDateRange, relativeDateRange, absoluteDateRange);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDateRange {\n");
    
    sb.append("    dynamicDateRange: ").append(toIndentedString(dynamicDateRange)).append("\n");
    sb.append("    relativeDateRange: ").append(toIndentedString(relativeDateRange)).append("\n");
    sb.append("    absoluteDateRange: ").append(toIndentedString(absoluteDateRange)).append("\n");
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

