package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("ProductGroupAnalyticsItems")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductGroupAnalyticsItems   {
  private LocalDate DATE;
  private String PRODUCT_GROUP_ID;

  public ProductGroupAnalyticsItems() {
  }

  @JsonCreator
  public ProductGroupAnalyticsItems(
    @JsonProperty(required = true, value = "PRODUCT_GROUP_ID") String PRODUCT_GROUP_ID
  ) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
   **/
  public ProductGroupAnalyticsItems DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

  
  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
  @JsonProperty("DATE")
  public LocalDate getDATE() {
    return DATE;
  }

  @JsonProperty("DATE")
  public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }

  /**
   * The ID of the product group that this metrics belongs to.
   **/
  public ProductGroupAnalyticsItems PRODUCT_GROUP_ID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the product group that this metrics belongs to.")
  @JsonProperty(required = true, value = "PRODUCT_GROUP_ID")
  @NotNull  @Pattern(regexp="^\\d+$")public String getPRODUCTGROUPID() {
    return PRODUCT_GROUP_ID;
  }

  @JsonProperty(required = true, value = "PRODUCT_GROUP_ID")
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
