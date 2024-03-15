package org.openapitools.model;

import java.util.HashMap;
import java.util.Map;
import org.joda.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductGroupAnalyticsResponseInner extends HashMap<String, Object> {
  
  @ApiModelProperty(required = true, value = "The ID of the product group that this metrics belongs to.")
 /**
   * The ID of the product group that this metrics belongs to.
  **/
  private String PRODUCT_GROUP_ID;

  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
 /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  **/
  private LocalDate DATE;
 /**
   * The ID of the product group that this metrics belongs to.
   * @return PRODUCT_GROUP_ID
  **/
  @JsonProperty("PRODUCT_GROUP_ID")
  public String getPRODUCTGROUPID() {
    return PRODUCT_GROUP_ID;
  }

  public void setPRODUCTGROUPID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
  }

  public ProductGroupAnalyticsResponseInner PRODUCT_GROUP_ID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
    return this;
  }

 /**
   * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
   * @return DATE
  **/
  @JsonProperty("DATE")
  public LocalDate getDATE() {
    return DATE;
  }

  public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }

  public ProductGroupAnalyticsResponseInner DATE(LocalDate DATE) {
    this.DATE = DATE;
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
    ProductGroupAnalyticsResponseInner productGroupAnalyticsResponseInner = (ProductGroupAnalyticsResponseInner) o;
    return Objects.equals(this.PRODUCT_GROUP_ID, productGroupAnalyticsResponseInner.PRODUCT_GROUP_ID) &&
        Objects.equals(this.DATE, productGroupAnalyticsResponseInner.DATE) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRODUCT_GROUP_ID, DATE, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupAnalyticsResponseInner {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    PRODUCT_GROUP_ID: ").append(toIndentedString(PRODUCT_GROUP_ID)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
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

