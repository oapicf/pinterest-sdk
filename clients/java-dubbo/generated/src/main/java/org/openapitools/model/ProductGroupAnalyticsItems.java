package org.openapitools.model;

import java.time.LocalDate;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ProductGroupAnalyticsItems implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
   */
  @JsonProperty("DATE")
  private LocalDate DATE;

  /**
   * The ID of the product group that this metrics belongs to.
   */
  @JsonProperty("PRODUCT_GROUP_ID")
  private String PRODUCT_GROUP_ID;

  /**
   * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
   * @return DATE
   */
  public LocalDate getDATE() {
    return DATE;
  }

  public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }

  /**
   * The ID of the product group that this metrics belongs to.
   * @return PRODUCT_GROUP_ID
   */
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
