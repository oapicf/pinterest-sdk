package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.AdsAnalyticsFilterColumn;
import org.openapitools.model.AdsAnalyticsFilterOperator;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AdsAnalyticsMetricsFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("field")
  private AdsAnalyticsFilterColumn field;

  @JsonProperty("operator")
  private AdsAnalyticsFilterOperator operator;

  /**
   * List of values for filtering
   */
  @JsonProperty("values")
  private List<BigDecimal> values = new ArrayList<>();

  /**
   * 
   * @return field
   */
  public AdsAnalyticsFilterColumn getField() {
    return field;
  }

  public void setField(AdsAnalyticsFilterColumn field) {
    this.field = field;
  }

  /**
   * 
   * @return operator
   */
  public AdsAnalyticsFilterOperator getOperator() {
    return operator;
  }

  public void setOperator(AdsAnalyticsFilterOperator operator) {
    this.operator = operator;
  }

  /**
   * List of values for filtering
   * @return values
   */
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
    return Objects.equals(this.field, adsAnalyticsMetricsFilter.field) &&
        Objects.equals(this.operator, adsAnalyticsMetricsFilter.operator) &&
        Objects.equals(this.values, adsAnalyticsMetricsFilter.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, values);
  }

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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
