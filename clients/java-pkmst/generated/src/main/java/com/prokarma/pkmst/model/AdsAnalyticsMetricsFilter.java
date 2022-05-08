package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AdsAnalyticsFilterColumn;
import com.prokarma.pkmst.model.AdsAnalyticsFilterOperator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AdsAnalyticsMetricsFilter
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-08T00:31:47.777767Z[Etc/UTC]")
public class AdsAnalyticsMetricsFilter   {
  @JsonProperty("field")
  private AdsAnalyticsFilterColumn field;

  @JsonProperty("operator")
  private AdsAnalyticsFilterOperator operator;

  @JsonProperty("values")
  
  private List<BigDecimal> values = null;

  public AdsAnalyticsMetricsFilter field(AdsAnalyticsFilterColumn field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
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
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * List of values for filtering
   * @return values
  **/
  @ApiModelProperty(value = "List of values for filtering")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

