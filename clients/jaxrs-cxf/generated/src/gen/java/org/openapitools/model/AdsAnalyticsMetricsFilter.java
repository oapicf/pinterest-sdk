package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdsAnalyticsFilterColumn;
import org.openapitools.model.AdsAnalyticsFilterOperator;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdsAnalyticsMetricsFilter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private AdsAnalyticsFilterColumn field;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AdsAnalyticsFilterOperator operator;

  @ApiModelProperty(required = true, value = "List of values for filtering")
  @Valid
 /**
   * List of values for filtering
  **/
  private List<BigDecimal> values = new ArrayList<>();
 /**
   * Get field
   * @return field
  **/
  @JsonProperty("field")
  @NotNull
  public AdsAnalyticsFilterColumn getField() {
    return field;
  }

  public void setField(AdsAnalyticsFilterColumn field) {
    this.field = field;
  }

  public AdsAnalyticsMetricsFilter field(AdsAnalyticsFilterColumn field) {
    this.field = field;
    return this;
  }

 /**
   * Get operator
   * @return operator
  **/
  @JsonProperty("operator")
  @NotNull
  public AdsAnalyticsFilterOperator getOperator() {
    return operator;
  }

  public void setOperator(AdsAnalyticsFilterOperator operator) {
    this.operator = operator;
  }

  public AdsAnalyticsMetricsFilter operator(AdsAnalyticsFilterOperator operator) {
    this.operator = operator;
    return this;
  }

 /**
   * List of values for filtering
   * @return values
  **/
  @JsonProperty("values")
  @NotNull
 @Size(min=1)  public List<BigDecimal> getValues() {
    return values;
  }

  public void setValues(List<BigDecimal> values) {
    this.values = values;
  }

  public AdsAnalyticsMetricsFilter values(List<BigDecimal> values) {
    this.values = values;
    return this;
  }

  public AdsAnalyticsMetricsFilter addValuesItem(BigDecimal valuesItem) {
    this.values.add(valuesItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

