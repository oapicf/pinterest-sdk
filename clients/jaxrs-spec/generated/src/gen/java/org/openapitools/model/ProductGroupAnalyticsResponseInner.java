package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProductGroupAnalyticsResponse_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ProductGroupAnalyticsResponseInner extends HashMap<String, Object>  {
  private @Valid String PRODUCT_GROUP_ID;
  private @Valid LocalDate DATE;

  /**
   * The ID of the product group that this metrics belongs to.
   **/
  public ProductGroupAnalyticsResponseInner PRODUCT_GROUP_ID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the product group that this metrics belongs to.")
  @JsonProperty("PRODUCT_GROUP_ID")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getPRODUCTGROUPID() {
    return PRODUCT_GROUP_ID;
  }

  @JsonProperty("PRODUCT_GROUP_ID")
  public void setPRODUCTGROUPID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
   **/
  public ProductGroupAnalyticsResponseInner DATE(LocalDate DATE) {
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

