package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * A map of filter attributes to their available values.
 **/

@ApiModel(description = "A map of filter attributes to their available values.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsHotelFilterValuesMap   {
  @JsonProperty("brand")
  private List<String> brand = null;

  @JsonProperty("custom_label_0")
  private List<String> customLabel0 = null;

  @JsonProperty("custom_label_1")
  private List<String> customLabel1 = null;

  @JsonProperty("custom_label_2")
  private List<String> customLabel2 = null;

  @JsonProperty("custom_label_3")
  private List<String> customLabel3 = null;

  @JsonProperty("custom_label_4")
  private List<String> customLabel4 = null;

  /**
   **/
  public CatalogsHotelFilterValuesMap brand(List<String> brand) {
    this.brand = brand;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("brand")
  public List<String> getBrand() {
    return brand;
  }
  public void setBrand(List<String> brand) {
    this.brand = brand;
  }

  /**
   **/
  public CatalogsHotelFilterValuesMap customLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_0")
  public List<String> getCustomLabel0() {
    return customLabel0;
  }
  public void setCustomLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
  }

  /**
   **/
  public CatalogsHotelFilterValuesMap customLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_1")
  public List<String> getCustomLabel1() {
    return customLabel1;
  }
  public void setCustomLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
  }

  /**
   **/
  public CatalogsHotelFilterValuesMap customLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_2")
  public List<String> getCustomLabel2() {
    return customLabel2;
  }
  public void setCustomLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
  }

  /**
   **/
  public CatalogsHotelFilterValuesMap customLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_3")
  public List<String> getCustomLabel3() {
    return customLabel3;
  }
  public void setCustomLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
  }

  /**
   **/
  public CatalogsHotelFilterValuesMap customLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_label_4")
  public List<String> getCustomLabel4() {
    return customLabel4;
  }
  public void setCustomLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsHotelFilterValuesMap catalogsHotelFilterValuesMap = (CatalogsHotelFilterValuesMap) o;
    return Objects.equals(brand, catalogsHotelFilterValuesMap.brand) &&
        Objects.equals(customLabel0, catalogsHotelFilterValuesMap.customLabel0) &&
        Objects.equals(customLabel1, catalogsHotelFilterValuesMap.customLabel1) &&
        Objects.equals(customLabel2, catalogsHotelFilterValuesMap.customLabel2) &&
        Objects.equals(customLabel3, catalogsHotelFilterValuesMap.customLabel3) &&
        Objects.equals(customLabel4, catalogsHotelFilterValuesMap.customLabel4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelFilterValuesMap {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    customLabel0: ").append(toIndentedString(customLabel0)).append("\n");
    sb.append("    customLabel1: ").append(toIndentedString(customLabel1)).append("\n");
    sb.append("    customLabel2: ").append(toIndentedString(customLabel2)).append("\n");
    sb.append("    customLabel3: ").append(toIndentedString(customLabel3)).append("\n");
    sb.append("    customLabel4: ").append(toIndentedString(customLabel4)).append("\n");
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

