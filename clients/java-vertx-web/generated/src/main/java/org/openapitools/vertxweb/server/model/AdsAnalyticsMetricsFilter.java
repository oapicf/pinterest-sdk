package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdsAnalyticsFilterColumn;
import org.openapitools.vertxweb.server.model.AdsAnalyticsFilterOperator;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdsAnalyticsMetricsFilter   {
  
  private AdsAnalyticsFilterColumn field;
  private AdsAnalyticsFilterOperator operator;
  private List<BigDecimal> values = new ArrayList<>();

  public AdsAnalyticsMetricsFilter () {

  }

  public AdsAnalyticsMetricsFilter (AdsAnalyticsFilterColumn field, AdsAnalyticsFilterOperator operator, List<BigDecimal> values) {
    this.field = field;
    this.operator = operator;
    this.values = values;
  }

    
  @JsonProperty("field")
  public AdsAnalyticsFilterColumn getField() {
    return field;
  }
  public void setField(AdsAnalyticsFilterColumn field) {
    this.field = field;
  }

    
  @JsonProperty("operator")
  public AdsAnalyticsFilterOperator getOperator() {
    return operator;
  }
  public void setOperator(AdsAnalyticsFilterOperator operator) {
    this.operator = operator;
  }

    
  @JsonProperty("values")
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
