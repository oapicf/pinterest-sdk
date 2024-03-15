package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductGroupAnalyticsResponseInner extends HashMap<String, Object>  {
  
  private String PRODUCT_GROUP_ID;
  private LocalDate DATE;

  public ProductGroupAnalyticsResponseInner () {

  }

  public ProductGroupAnalyticsResponseInner (String PRODUCT_GROUP_ID, LocalDate DATE) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
    this.DATE = DATE;
  }

    
  @JsonProperty("PRODUCT_GROUP_ID")
  public String getPRODUCTGROUPID() {
    return PRODUCT_GROUP_ID;
  }
  public void setPRODUCTGROUPID(String PRODUCT_GROUP_ID) {
    this.PRODUCT_GROUP_ID = PRODUCT_GROUP_ID;
  }

    
  @JsonProperty("DATE")
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
    return super.equals(o) && Objects.equals(PRODUCT_GROUP_ID, productGroupAnalyticsResponseInner.PRODUCT_GROUP_ID) &&
        Objects.equals(DATE, productGroupAnalyticsResponseInner.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), PRODUCT_GROUP_ID, super.hashCode(), DATE);
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
