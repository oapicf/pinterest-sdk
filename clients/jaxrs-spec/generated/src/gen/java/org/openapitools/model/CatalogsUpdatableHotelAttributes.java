package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAddress;
import org.openapitools.model.CatalogsHotelGuestRatings;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CatalogsUpdatableHotelAttributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsUpdatableHotelAttributes   {
  private String name;
  private String link;
  private String description;
  private String brand;
  private BigDecimal latitude;
  private BigDecimal longitude;
  private @Valid List<String> neighborhood;
  private CatalogsHotelAddress address;
  private String customLabel0;
  private String customLabel1;
  private String customLabel2;
  private String customLabel3;
  private String customLabel4;
  private String category;
  private String basePrice;
  private String salePrice;
  private CatalogsHotelGuestRatings guestRatings;

  /**
   * The hotel&#39;s name.
   **/
  public CatalogsUpdatableHotelAttributes name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The hotel's name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Link to the product page
   **/
  public CatalogsUpdatableHotelAttributes link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(value = "Link to the product page")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  @JsonProperty("link")
  public void setLink(String link) {
    this.link = link;
  }

  /**
   * Brief description of the hotel.
   **/
  public CatalogsUpdatableHotelAttributes description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Brief description of the hotel.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The brand to which this hotel belongs to.
   **/
  public CatalogsUpdatableHotelAttributes brand(String brand) {
    this.brand = brand;
    return this;
  }

  
  @ApiModelProperty(value = "The brand to which this hotel belongs to.")
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  @JsonProperty("brand")
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Latitude of the hotel.
   **/
  public CatalogsUpdatableHotelAttributes latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(value = "Latitude of the hotel.")
  @JsonProperty("latitude")
  @Valid public BigDecimal getLatitude() {
    return latitude;
  }

  @JsonProperty("latitude")
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  /**
   * Longitude of the hotel.
   **/
  public CatalogsUpdatableHotelAttributes longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(value = "Longitude of the hotel.")
  @JsonProperty("longitude")
  @Valid public BigDecimal getLongitude() {
    return longitude;
  }

  @JsonProperty("longitude")
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  /**
   * A list of neighborhoods where the hotel is located
   **/
  public CatalogsUpdatableHotelAttributes neighborhood(List<String> neighborhood) {
    this.neighborhood = neighborhood;
    return this;
  }

  
  @ApiModelProperty(value = "A list of neighborhoods where the hotel is located")
  @JsonProperty("neighborhood")
  public List<String> getNeighborhood() {
    return neighborhood;
  }

  @JsonProperty("neighborhood")
  public void setNeighborhood(List<String> neighborhood) {
    this.neighborhood = neighborhood;
  }

  public CatalogsUpdatableHotelAttributes addNeighborhoodItem(String neighborhoodItem) {
    if (this.neighborhood == null) {
      this.neighborhood = new ArrayList<>();
    }

    this.neighborhood.add(neighborhoodItem);
    return this;
  }

  public CatalogsUpdatableHotelAttributes removeNeighborhoodItem(String neighborhoodItem) {
    if (neighborhoodItem != null && this.neighborhood != null) {
      this.neighborhood.remove(neighborhoodItem);
    }

    return this;
  }
  /**
   **/
  public CatalogsUpdatableHotelAttributes address(CatalogsHotelAddress address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  @Valid public CatalogsHotelAddress getAddress() {
    return address;
  }

  @JsonProperty("address")
  public void setAddress(CatalogsHotelAddress address) {
    this.address = address;
  }

  /**
   * Custom grouping of hotels
   **/
  public CatalogsUpdatableHotelAttributes customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

  
  @ApiModelProperty(value = "Custom grouping of hotels")
  @JsonProperty("custom_label_0")
  public String getCustomLabel0() {
    return customLabel0;
  }

  @JsonProperty("custom_label_0")
  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  /**
   * Custom grouping of hotels
   **/
  public CatalogsUpdatableHotelAttributes customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

  
  @ApiModelProperty(value = "Custom grouping of hotels")
  @JsonProperty("custom_label_1")
  public String getCustomLabel1() {
    return customLabel1;
  }

  @JsonProperty("custom_label_1")
  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  /**
   * Custom grouping of hotels
   **/
  public CatalogsUpdatableHotelAttributes customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

  
  @ApiModelProperty(value = "Custom grouping of hotels")
  @JsonProperty("custom_label_2")
  public String getCustomLabel2() {
    return customLabel2;
  }

  @JsonProperty("custom_label_2")
  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  /**
   * Custom grouping of hotels
   **/
  public CatalogsUpdatableHotelAttributes customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

  
  @ApiModelProperty(value = "Custom grouping of hotels")
  @JsonProperty("custom_label_3")
  public String getCustomLabel3() {
    return customLabel3;
  }

  @JsonProperty("custom_label_3")
  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  /**
   * Custom grouping of hotels
   **/
  public CatalogsUpdatableHotelAttributes customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

  
  @ApiModelProperty(value = "Custom grouping of hotels")
  @JsonProperty("custom_label_4")
  public String getCustomLabel4() {
    return customLabel4;
  }

  @JsonProperty("custom_label_4")
  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  /**
   * The type of property. The category can be any type of internal description desired.
   **/
  public CatalogsUpdatableHotelAttributes category(String category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(value = "The type of property. The category can be any type of internal description desired.")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Base price of the hotel room per night followed by the ISO currency code
   **/
  public CatalogsUpdatableHotelAttributes basePrice(String basePrice) {
    this.basePrice = basePrice;
    return this;
  }

  
  @ApiModelProperty(example = "100 USD", value = "Base price of the hotel room per night followed by the ISO currency code")
  @JsonProperty("base_price")
  public String getBasePrice() {
    return basePrice;
  }

  @JsonProperty("base_price")
  public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
  }

  /**
   * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
   **/
  public CatalogsUpdatableHotelAttributes salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

  
  @ApiModelProperty(example = "90 USD", value = "Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.")
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }

  @JsonProperty("sale_price")
  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  /**
   **/
  public CatalogsUpdatableHotelAttributes guestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("guest_ratings")
  @Valid public CatalogsHotelGuestRatings getGuestRatings() {
    return guestRatings;
  }

  @JsonProperty("guest_ratings")
  public void setGuestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsUpdatableHotelAttributes catalogsUpdatableHotelAttributes = (CatalogsUpdatableHotelAttributes) o;
    return Objects.equals(this.name, catalogsUpdatableHotelAttributes.name) &&
        Objects.equals(this.link, catalogsUpdatableHotelAttributes.link) &&
        Objects.equals(this.description, catalogsUpdatableHotelAttributes.description) &&
        Objects.equals(this.brand, catalogsUpdatableHotelAttributes.brand) &&
        Objects.equals(this.latitude, catalogsUpdatableHotelAttributes.latitude) &&
        Objects.equals(this.longitude, catalogsUpdatableHotelAttributes.longitude) &&
        Objects.equals(this.neighborhood, catalogsUpdatableHotelAttributes.neighborhood) &&
        Objects.equals(this.address, catalogsUpdatableHotelAttributes.address) &&
        Objects.equals(this.customLabel0, catalogsUpdatableHotelAttributes.customLabel0) &&
        Objects.equals(this.customLabel1, catalogsUpdatableHotelAttributes.customLabel1) &&
        Objects.equals(this.customLabel2, catalogsUpdatableHotelAttributes.customLabel2) &&
        Objects.equals(this.customLabel3, catalogsUpdatableHotelAttributes.customLabel3) &&
        Objects.equals(this.customLabel4, catalogsUpdatableHotelAttributes.customLabel4) &&
        Objects.equals(this.category, catalogsUpdatableHotelAttributes.category) &&
        Objects.equals(this.basePrice, catalogsUpdatableHotelAttributes.basePrice) &&
        Objects.equals(this.salePrice, catalogsUpdatableHotelAttributes.salePrice) &&
        Objects.equals(this.guestRatings, catalogsUpdatableHotelAttributes.guestRatings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, link, description, brand, latitude, longitude, neighborhood, address, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, category, basePrice, salePrice, guestRatings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpdatableHotelAttributes {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    customLabel0: ").append(toIndentedString(customLabel0)).append("\n");
    sb.append("    customLabel1: ").append(toIndentedString(customLabel1)).append("\n");
    sb.append("    customLabel2: ").append(toIndentedString(customLabel2)).append("\n");
    sb.append("    customLabel3: ").append(toIndentedString(customLabel3)).append("\n");
    sb.append("    customLabel4: ").append(toIndentedString(customLabel4)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    guestRatings: ").append(toIndentedString(guestRatings)).append("\n");
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

