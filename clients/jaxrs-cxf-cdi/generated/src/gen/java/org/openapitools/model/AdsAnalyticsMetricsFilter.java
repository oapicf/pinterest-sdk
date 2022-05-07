package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AdsAnalyticsFilterColumn;
import org.openapitools.model.AdsAnalyticsFilterOperator;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;



public class AdsAnalyticsMetricsFilter   {
  
  private AdsAnalyticsFilterColumn field;

  private AdsAnalyticsFilterOperator operator;

  private List<BigDecimal> values = null;


  /**
   **/
  public AdsAnalyticsMetricsFilter field(AdsAnalyticsFilterColumn field) {
    this.field = field;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("field")
  public AdsAnalyticsFilterColumn getField() {
    return field;
  }
  public void setField(AdsAnalyticsFilterColumn field) {
    this.field = field;
  }


  /**
   **/
  public AdsAnalyticsMetricsFilter operator(AdsAnalyticsFilterOperator operator) {
    this.operator = operator;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("operator")
  public AdsAnalyticsFilterOperator getOperator() {
    return operator;
  }
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

  
  @ApiModelProperty(value = "List of values for filtering")
  @JsonProperty("values")
 @Size(min=1)  public List<BigDecimal> getValues() {
    return values;
  }
  public void setValues(List<BigDecimal> values) {
    this.values = values;
  }

  public AdsAnalyticsMetricsFilter addValuesItem(BigDecimal valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<BigDecimal>();
    }
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

