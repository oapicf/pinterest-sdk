package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ProductGroupAnalyticsResponseInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ProductGroupAnalyticsResponseInner extends HashMap<String, Object>  {
  @JsonProperty("PRODUCT_GROUP_ID")
  private String PRODUCT_GROUP_ID;

  @JsonProperty("DATE")
  private LocalDate DATE;

  public ProductGroupAnalyticsResponseInner PRODUCT_GROUP_ID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
    return this;
  }

   /**
   * The ID of the product group that this metrics belongs to.
   * @return PRODUCT_GROUP_ID
  **/
  @ApiModelProperty(required = true, value = "The ID of the product group that this metrics belongs to.")
  public String getPRODUCTGROUPID() {
    return PRODUCT_GROUP_ID;
  }

  public void setPRODUCTGROUPID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
  }

  public ProductGroupAnalyticsResponseInner DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

   /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   * @return DATE
  **/
  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
  public LocalDate getDATE() {
    return DATE;
  }

  public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

