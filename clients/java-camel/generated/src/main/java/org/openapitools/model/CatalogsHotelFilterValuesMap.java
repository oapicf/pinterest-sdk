package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A map of filter attributes to their available values.
 */

@Schema(name = "catalogs_hotel_filter_values_map", description = "A map of filter attributes to their available values.")
@JsonTypeName("catalogs_hotel_filter_values_map")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsHotelFilterValuesMap {

  @Valid
  private List<String> brand = new ArrayList<>();

  @Valid
  private List<String> customLabel0 = new ArrayList<>();

  @Valid
  private List<String> customLabel1 = new ArrayList<>();

  @Valid
  private List<String> customLabel2 = new ArrayList<>();

  @Valid
  private List<String> customLabel3 = new ArrayList<>();

  @Valid
  private List<String> customLabel4 = new ArrayList<>();

  public CatalogsHotelFilterValuesMap brand(List<String> brand) {
    this.brand = brand;
    return this;
  }

  public CatalogsHotelFilterValuesMap addBrandItem(String brandItem) {
    if (this.brand == null) {
      this.brand = new ArrayList<>();
    }
    this.brand.add(brandItem);
    return this;
  }

  /**
   * Get brand
   * @return brand
   */
  
  @Schema(name = "brand", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brand")
  public List<String> getBrand() {
    return brand;
  }

  public void setBrand(List<String> brand) {
    this.brand = brand;
  }

  public CatalogsHotelFilterValuesMap customLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

  public CatalogsHotelFilterValuesMap addCustomLabel0Item(String customLabel0Item) {
    if (this.customLabel0 == null) {
      this.customLabel0 = new ArrayList<>();
    }
    this.customLabel0.add(customLabel0Item);
    return this;
  }

  /**
   * Get customLabel0
   * @return customLabel0
   */
  
  @Schema(name = "custom_label_0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_0")
  public List<String> getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(List<String> customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public CatalogsHotelFilterValuesMap customLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

  public CatalogsHotelFilterValuesMap addCustomLabel1Item(String customLabel1Item) {
    if (this.customLabel1 == null) {
      this.customLabel1 = new ArrayList<>();
    }
    this.customLabel1.add(customLabel1Item);
    return this;
  }

  /**
   * Get customLabel1
   * @return customLabel1
   */
  
  @Schema(name = "custom_label_1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_1")
  public List<String> getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(List<String> customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public CatalogsHotelFilterValuesMap customLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

  public CatalogsHotelFilterValuesMap addCustomLabel2Item(String customLabel2Item) {
    if (this.customLabel2 == null) {
      this.customLabel2 = new ArrayList<>();
    }
    this.customLabel2.add(customLabel2Item);
    return this;
  }

  /**
   * Get customLabel2
   * @return customLabel2
   */
  
  @Schema(name = "custom_label_2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_2")
  public List<String> getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(List<String> customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public CatalogsHotelFilterValuesMap customLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

  public CatalogsHotelFilterValuesMap addCustomLabel3Item(String customLabel3Item) {
    if (this.customLabel3 == null) {
      this.customLabel3 = new ArrayList<>();
    }
    this.customLabel3.add(customLabel3Item);
    return this;
  }

  /**
   * Get customLabel3
   * @return customLabel3
   */
  
  @Schema(name = "custom_label_3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_3")
  public List<String> getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(List<String> customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public CatalogsHotelFilterValuesMap customLabel4(List<String> customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

  public CatalogsHotelFilterValuesMap addCustomLabel4Item(String customLabel4Item) {
    if (this.customLabel4 == null) {
      this.customLabel4 = new ArrayList<>();
    }
    this.customLabel4.add(customLabel4Item);
    return this;
  }

  /**
   * Get customLabel4
   * @return customLabel4
   */
  
  @Schema(name = "custom_label_4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.brand, catalogsHotelFilterValuesMap.brand) &&
        Objects.equals(this.customLabel0, catalogsHotelFilterValuesMap.customLabel0) &&
        Objects.equals(this.customLabel1, catalogsHotelFilterValuesMap.customLabel1) &&
        Objects.equals(this.customLabel2, catalogsHotelFilterValuesMap.customLabel2) &&
        Objects.equals(this.customLabel3, catalogsHotelFilterValuesMap.customLabel3) &&
        Objects.equals(this.customLabel4, catalogsHotelFilterValuesMap.customLabel4);
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

