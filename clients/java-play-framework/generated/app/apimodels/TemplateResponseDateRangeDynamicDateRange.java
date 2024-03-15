package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The dynamic date range of the template
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TemplateResponseDateRangeDynamicDateRange   {
  @JsonProperty("type")
  
  private String type;

  /**
   * The dynamic range type
   */
  public enum RangeEnum {
    YEAR_TO_DATE("YEAR_TO_DATE"),
    
    QUARTER_TO_DATE("QUARTER_TO_DATE"),
    
    MONTH_TO_DATE("MONTH_TO_DATE"),
    
    LAST_MONTH("LAST_MONTH");

    private final String value;

    RangeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RangeEnum fromValue(String value) {
      for (RangeEnum b : RangeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("range")
  
  private RangeEnum range;

  public TemplateResponseDateRangeDynamicDateRange type(String type) {
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

  public TemplateResponseDateRangeDynamicDateRange range(RangeEnum range) {
    this.range = range;
    return this;
  }

   /**
   * The dynamic range type
   * @return range
  **/
  public RangeEnum getRange() {
    return range;
  }

  public void setRange(RangeEnum range) {
    this.range = range;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponseDateRangeDynamicDateRange templateResponseDateRangeDynamicDateRange = (TemplateResponseDateRangeDynamicDateRange) o;
    return Objects.equals(type, templateResponseDateRangeDynamicDateRange.type) &&
        Objects.equals(range, templateResponseDateRangeDynamicDateRange.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, range);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDateRangeDynamicDateRange {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

