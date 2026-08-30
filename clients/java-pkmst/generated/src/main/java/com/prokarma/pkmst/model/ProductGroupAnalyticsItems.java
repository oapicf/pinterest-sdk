package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ProductGroupAnalyticsItems
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductGroupAnalyticsItems   {
  @JsonProperty("DATE")
  private LocalDate DATE;

  @JsonProperty("PRODUCT_GROUP_ID")
  private String PRODUCT_GROUP_ID;

  public ProductGroupAnalyticsItems DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   * @return DATE
   */
  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
  public LocalDate getDATE() {
    return DATE;
  }

  public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }

  public ProductGroupAnalyticsItems PRODUCT_GROUP_ID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
    return this;
  }

  /**
   * The ID of the product group that this metrics belongs to.
   * @return PRODUCT_GROUP_ID
   */
  @ApiModelProperty(required = true, value = "The ID of the product group that this metrics belongs to.")
  public String getPRODUCTGROUPID() {
    return PRODUCT_GROUP_ID;
  }

  public void setPRODUCTGROUPID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductGroupAnalyticsItems productGroupAnalyticsItems = (ProductGroupAnalyticsItems) o;
    return Objects.equals(this.DATE, productGroupAnalyticsItems.DATE) &&
        Objects.equals(this.PRODUCT_GROUP_ID, productGroupAnalyticsItems.PRODUCT_GROUP_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DATE, PRODUCT_GROUP_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupAnalyticsItems {\n");
    
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
    sb.append("    PRODUCT_GROUP_ID: ").append(toIndentedString(PRODUCT_GROUP_ID)).append("\n");
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

