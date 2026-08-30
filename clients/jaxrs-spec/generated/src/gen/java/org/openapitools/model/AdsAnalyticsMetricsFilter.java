package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdsAnalyticsFilterColumn;
import org.openapitools.model.AdsAnalyticsFilterOperator;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AdsAnalyticsMetricsFilter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdsAnalyticsMetricsFilter   {
  private AdsAnalyticsFilterColumn field;
  private AdsAnalyticsFilterOperator operator;
  private @Valid List<BigDecimal> values = new ArrayList<>();

  public AdsAnalyticsMetricsFilter() {
  }

  @JsonCreator
  public AdsAnalyticsMetricsFilter(
    @JsonProperty(required = true, value = "field") AdsAnalyticsFilterColumn field,
    @JsonProperty(required = true, value = "operator") AdsAnalyticsFilterOperator operator,
    @JsonProperty(required = true, value = "values") List<@Valid BigDecimal> values
  ) {
    this.field = field;
    this.operator = operator;
    this.values = values;
  }

  /**
   **/
  public AdsAnalyticsMetricsFilter field(AdsAnalyticsFilterColumn field) {
    this.field = field;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "field")
  @NotNull public AdsAnalyticsFilterColumn getField() {
    return field;
  }

  @JsonProperty(required = true, value = "field")
  public void setField(AdsAnalyticsFilterColumn field) {
    this.field = field;
  }

  /**
   **/
  public AdsAnalyticsMetricsFilter operator(AdsAnalyticsFilterOperator operator) {
    this.operator = operator;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "operator")
  @NotNull public AdsAnalyticsFilterOperator getOperator() {
    return operator;
  }

  @JsonProperty(required = true, value = "operator")
  public void setOperator(AdsAnalyticsFilterOperator operator) {
    this.operator = operator;
  }

  /**
   * List of values for filtering
   **/
  public AdsAnalyticsMetricsFilter values(List<BigDecimal> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of values for filtering")
  @JsonProperty(required = true, value = "values")
  @NotNull @Valid  @Size(min=1)public List<@Valid BigDecimal> getValues() {
    return values;
  }

  @JsonProperty(required = true, value = "values")
  public void setValues(List<BigDecimal> values) {
    this.values = values;
  }

  public AdsAnalyticsMetricsFilter addValuesItem(BigDecimal valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }

    this.values.add(valuesItem);
    return this;
  }

  public AdsAnalyticsMetricsFilter removeValuesItem(BigDecimal valuesItem) {
    if (valuesItem != null && this.values != null) {
      this.values.remove(valuesItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
