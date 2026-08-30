package org.openapitools.model;

import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductGroupAnalyticsItems  {
  
 /**
  * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  */
  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate DATE;

 /**
  * The ID of the product group that this metrics belongs to.
  */
  @ApiModelProperty(required = true, value = "The ID of the product group that this metrics belongs to.")
  private String PRODUCT_GROUP_ID;
 /**
  * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
  * @return DATE
  */
  @JsonProperty("DATE")
  public LocalDate getDATE() {
    return DATE;
  }

  /**
   * Sets the <code>DATE</code> property.
   */
 public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }

  /**
   * Sets the <code>DATE</code> property.
   */
  public ProductGroupAnalyticsItems DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

 /**
  * The ID of the product group that this metrics belongs to.
  * @return PRODUCT_GROUP_ID
  */
  @JsonProperty("PRODUCT_GROUP_ID")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getPRODUCTGROUPID() {
    return PRODUCT_GROUP_ID;
  }

  /**
   * Sets the <code>PRODUCT_GROUP_ID</code> property.
   */
 public void setPRODUCTGROUPID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
  }

  /**
   * Sets the <code>PRODUCT_GROUP_ID</code> property.
   */
  public ProductGroupAnalyticsItems PRODUCT_GROUP_ID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

