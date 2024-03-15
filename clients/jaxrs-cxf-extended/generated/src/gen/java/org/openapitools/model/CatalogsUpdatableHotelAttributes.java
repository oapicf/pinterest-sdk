package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAddress;
import org.openapitools.model.CatalogsHotelGuestRatings;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsUpdatableHotelAttributes  {
  
 /**
  * The hotel's name.
  */
  @ApiModelProperty(value = "The hotel's name.")
  private String name;

 /**
  * Link to the product page
  */
  @ApiModelProperty(value = "Link to the product page")
  private String link;

 /**
  * Brief description of the hotel.
  */
  @ApiModelProperty(value = "Brief description of the hotel.")
  private String description;

 /**
  * The brand to which this hotel belongs to.
  */
  @ApiModelProperty(value = "The brand to which this hotel belongs to.")
  private String brand;

 /**
  * Latitude of the hotel.
  */
  @ApiModelProperty(value = "Latitude of the hotel.")
  @Valid
  private BigDecimal latitude;

 /**
  * Longitude of the hotel.
  */
  @ApiModelProperty(value = "Longitude of the hotel.")
  @Valid
  private BigDecimal longitude;

 /**
  * A list of neighborhoods where the hotel is located
  */
  @ApiModelProperty(value = "A list of neighborhoods where the hotel is located")
  private List<String> neighborhood;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsHotelAddress address;

 /**
  * Custom grouping of hotels
  */
  @ApiModelProperty(value = "Custom grouping of hotels")
  private String customLabel0;

 /**
  * Custom grouping of hotels
  */
  @ApiModelProperty(value = "Custom grouping of hotels")
  private String customLabel1;

 /**
  * Custom grouping of hotels
  */
  @ApiModelProperty(value = "Custom grouping of hotels")
  private String customLabel2;

 /**
  * Custom grouping of hotels
  */
  @ApiModelProperty(value = "Custom grouping of hotels")
  private String customLabel3;

 /**
  * Custom grouping of hotels
  */
  @ApiModelProperty(value = "Custom grouping of hotels")
  private String customLabel4;

 /**
  * The type of property. The category can be any type of internal description desired.
  */
  @ApiModelProperty(value = "The type of property. The category can be any type of internal description desired.")
  private String category;

 /**
  * Base price of the hotel room per night followed by the ISO currency code
  */
  @ApiModelProperty(example = "100 USD", value = "Base price of the hotel room per night followed by the ISO currency code")
  private String basePrice;

 /**
  * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
  */
  @ApiModelProperty(example = "90 USD", value = "Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.")
  private String salePrice;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsHotelGuestRatings guestRatings;
 /**
  * The hotel&#39;s name.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public CatalogsUpdatableHotelAttributes name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Link to the product page
  * @return link
  */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * Sets the <code>link</code> property.
   */
 public void setLink(String link) {
    this.link = link;
  }

  /**
   * Sets the <code>link</code> property.
   */
  public CatalogsUpdatableHotelAttributes link(String link) {
    this.link = link;
    return this;
  }

 /**
  * Brief description of the hotel.
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public CatalogsUpdatableHotelAttributes description(String description) {
    this.description = description;
    return this;
  }

 /**
  * The brand to which this hotel belongs to.
  * @return brand
  */
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  /**
   * Sets the <code>brand</code> property.
   */
 public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Sets the <code>brand</code> property.
   */
  public CatalogsUpdatableHotelAttributes brand(String brand) {
    this.brand = brand;
    return this;
  }

 /**
  * Latitude of the hotel.
  * @return latitude
  */
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }

  /**
   * Sets the <code>latitude</code> property.
   */
 public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  /**
   * Sets the <code>latitude</code> property.
   */
  public CatalogsUpdatableHotelAttributes latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
  * Longitude of the hotel.
  * @return longitude
  */
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }

  /**
   * Sets the <code>longitude</code> property.
   */
 public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  /**
   * Sets the <code>longitude</code> property.
   */
  public CatalogsUpdatableHotelAttributes longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
  * A list of neighborhoods where the hotel is located
  * @return neighborhood
  */
  @JsonProperty("neighborhood")
  public List<String> getNeighborhood() {
    return neighborhood;
  }

  /**
   * Sets the <code>neighborhood</code> property.
   */
 public void setNeighborhood(List<String> neighborhood) {
    this.neighborhood = neighborhood;
  }

  /**
   * Sets the <code>neighborhood</code> property.
   */
  public CatalogsUpdatableHotelAttributes neighborhood(List<String> neighborhood) {
    this.neighborhood = neighborhood;
    return this;
  }

  /**
   * Adds a new item to the <code>neighborhood</code> list.
   */
  public CatalogsUpdatableHotelAttributes addNeighborhoodItem(String neighborhoodItem) {
    this.neighborhood.add(neighborhoodItem);
    return this;
  }

 /**
  * Get address
  * @return address
  */
  @JsonProperty("address")
  public CatalogsHotelAddress getAddress() {
    return address;
  }

  /**
   * Sets the <code>address</code> property.
   */
 public void setAddress(CatalogsHotelAddress address) {
    this.address = address;
  }

  /**
   * Sets the <code>address</code> property.
   */
  public CatalogsUpdatableHotelAttributes address(CatalogsHotelAddress address) {
    this.address = address;
    return this;
  }

 /**
  * Custom grouping of hotels
  * @return customLabel0
  */
  @JsonProperty("custom_label_0")
  public String getCustomLabel0() {
    return customLabel0;
  }

  /**
   * Sets the <code>customLabel0</code> property.
   */
 public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  /**
   * Sets the <code>customLabel0</code> property.
   */
  public CatalogsUpdatableHotelAttributes customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

 /**
  * Custom grouping of hotels
  * @return customLabel1
  */
  @JsonProperty("custom_label_1")
  public String getCustomLabel1() {
    return customLabel1;
  }

  /**
   * Sets the <code>customLabel1</code> property.
   */
 public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  /**
   * Sets the <code>customLabel1</code> property.
   */
  public CatalogsUpdatableHotelAttributes customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

 /**
  * Custom grouping of hotels
  * @return customLabel2
  */
  @JsonProperty("custom_label_2")
  public String getCustomLabel2() {
    return customLabel2;
  }

  /**
   * Sets the <code>customLabel2</code> property.
   */
 public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  /**
   * Sets the <code>customLabel2</code> property.
   */
  public CatalogsUpdatableHotelAttributes customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

 /**
  * Custom grouping of hotels
  * @return customLabel3
  */
  @JsonProperty("custom_label_3")
  public String getCustomLabel3() {
    return customLabel3;
  }

  /**
   * Sets the <code>customLabel3</code> property.
   */
 public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  /**
   * Sets the <code>customLabel3</code> property.
   */
  public CatalogsUpdatableHotelAttributes customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

 /**
  * Custom grouping of hotels
  * @return customLabel4
  */
  @JsonProperty("custom_label_4")
  public String getCustomLabel4() {
    return customLabel4;
  }

  /**
   * Sets the <code>customLabel4</code> property.
   */
 public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  /**
   * Sets the <code>customLabel4</code> property.
   */
  public CatalogsUpdatableHotelAttributes customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

 /**
  * The type of property. The category can be any type of internal description desired.
  * @return category
  */
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  /**
   * Sets the <code>category</code> property.
   */
 public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Sets the <code>category</code> property.
   */
  public CatalogsUpdatableHotelAttributes category(String category) {
    this.category = category;
    return this;
  }

 /**
  * Base price of the hotel room per night followed by the ISO currency code
  * @return basePrice
  */
  @JsonProperty("base_price")
  public String getBasePrice() {
    return basePrice;
  }

  /**
   * Sets the <code>basePrice</code> property.
   */
 public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
  }

  /**
   * Sets the <code>basePrice</code> property.
   */
  public CatalogsUpdatableHotelAttributes basePrice(String basePrice) {
    this.basePrice = basePrice;
    return this;
  }

 /**
  * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
  * @return salePrice
  */
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }

  /**
   * Sets the <code>salePrice</code> property.
   */
 public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  /**
   * Sets the <code>salePrice</code> property.
   */
  public CatalogsUpdatableHotelAttributes salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

 /**
  * Get guestRatings
  * @return guestRatings
  */
  @JsonProperty("guest_ratings")
  public CatalogsHotelGuestRatings getGuestRatings() {
    return guestRatings;
  }

  /**
   * Sets the <code>guestRatings</code> property.
   */
 public void setGuestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
  }

  /**
   * Sets the <code>guestRatings</code> property.
   */
  public CatalogsUpdatableHotelAttributes guestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

