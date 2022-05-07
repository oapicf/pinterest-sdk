package apimodels;

import apimodels.AdsAnalyticsFilterColumn;
import apimodels.AdsAnalyticsFilterOperator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * AdsAnalyticsMetricsFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-07T06:39:52.689511Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdsAnalyticsMetricsFilter   {
  @JsonProperty("field")
  @Valid

  private AdsAnalyticsFilterColumn field;

  @JsonProperty("operator")
  @Valid

  private AdsAnalyticsFilterOperator operator;

  @JsonProperty("values")
  @Size(min=1)
@Valid

  private List<BigDecimal> values = null;

  public AdsAnalyticsMetricsFilter field(AdsAnalyticsFilterColumn field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  public AdsAnalyticsFilterColumn getField() {
    return field;
  }

  public void setField(AdsAnalyticsFilterColumn field) {
    this.field = field;
  }

  public AdsAnalyticsMetricsFilter operator(AdsAnalyticsFilterOperator operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  public AdsAnalyticsFilterOperator getOperator() {
    return operator;
  }

  public void setOperator(AdsAnalyticsFilterOperator operator) {
    this.operator = operator;
  }

  public AdsAnalyticsMetricsFilter values(List<BigDecimal> values) {
    this.values = values;
    return this;
  }

  public AdsAnalyticsMetricsFilter addValuesItem(BigDecimal valuesItem) {
    if (values == null) {
      values = new ArrayList<>();
    }
    values.add(valuesItem);
    return this;
  }

   /**
   * List of values for filtering
   * @return values
  **/
  public List<BigDecimal> getValues() {
    return values;
  }

  public void setValues(List<BigDecimal> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsAnalyticsMetricsFilter adsAnalyticsMetricsFilter = (AdsAnalyticsMetricsFilter) o;
    return Objects.equals(field, adsAnalyticsMetricsFilter.field) &&
        Objects.equals(operator, adsAnalyticsMetricsFilter.operator) &&
        Objects.equals(values, adsAnalyticsMetricsFilter.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, values);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalyticsMetricsFilter {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

