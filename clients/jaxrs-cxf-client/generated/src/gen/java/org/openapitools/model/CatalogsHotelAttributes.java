package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAddress;
import org.openapitools.model.CatalogsHotelAttributesAllOfMainImage;
import org.openapitools.model.CatalogsHotelGuestRatings;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsHotelAttributes  {
  
  @ApiModelProperty(value = "The hotel's name.")
 /**
   * The hotel's name.
  **/
  private String name;

  @ApiModelProperty(value = "Link to the product page")
 /**
   * Link to the product page
  **/
  private String link;

  @ApiModelProperty(value = "Brief description of the hotel.")
 /**
   * Brief description of the hotel.
  **/
  private String description;

  @ApiModelProperty(value = "The brand to which this hotel belongs to.")
 /**
   * The brand to which this hotel belongs to.
  **/
  private String brand;

  @ApiModelProperty(value = "Latitude of the hotel.")
 /**
   * Latitude of the hotel.
  **/
  private BigDecimal latitude;

  @ApiModelProperty(value = "Longitude of the hotel.")
 /**
   * Longitude of the hotel.
  **/
  private BigDecimal longitude;

  @ApiModelProperty(value = "A list of neighborhoods where the hotel is located")
 /**
   * A list of neighborhoods where the hotel is located
  **/
  private List<String> neighborhood;

  @ApiModelProperty(value = "")
  private CatalogsHotelAddress address;

  @ApiModelProperty(value = "Custom grouping of hotels")
 /**
   * Custom grouping of hotels
  **/
  private String customLabel0;

  @ApiModelProperty(value = "Custom grouping of hotels")
 /**
   * Custom grouping of hotels
  **/
  private String customLabel1;

  @ApiModelProperty(value = "Custom grouping of hotels")
 /**
   * Custom grouping of hotels
  **/
  private String customLabel2;

  @ApiModelProperty(value = "Custom grouping of hotels")
 /**
   * Custom grouping of hotels
  **/
  private String customLabel3;

  @ApiModelProperty(value = "Custom grouping of hotels")
 /**
   * Custom grouping of hotels
  **/
  private String customLabel4;

  @ApiModelProperty(value = "The type of property. The category can be any type of internal description desired.")
 /**
   * The type of property. The category can be any type of internal description desired.
  **/
  private String category;

  @ApiModelProperty(example = "100 USD", value = "Base price of the hotel room per night followed by the ISO currency code")
 /**
   * Base price of the hotel room per night followed by the ISO currency code
  **/
  private String basePrice;

  @ApiModelProperty(example = "90 USD", value = "Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.")
 /**
   * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
  **/
  private String salePrice;

  @ApiModelProperty(value = "")
  private CatalogsHotelGuestRatings guestRatings;

  @ApiModelProperty(value = "")
  private CatalogsHotelAttributesAllOfMainImage mainImage;

  @ApiModelProperty(example = "[\"https://scene.example.com/image/image_v2.jpg\",\"https://scene.example.com/image/image_v3.jpg\"]", value = "<p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>")
 /**
   * <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
  **/
  private List<String> additionalImageLink;
 /**
   * The hotel&#39;s name.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsHotelAttributes name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Link to the product page
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public CatalogsHotelAttributes link(String link) {
    this.link = link;
    return this;
  }

 /**
   * Brief description of the hotel.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogsHotelAttributes description(String description) {
    this.description = description;
    return this;
  }

 /**
   * The brand to which this hotel belongs to.
   * @return brand
  **/
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public CatalogsHotelAttributes brand(String brand) {
    this.brand = brand;
    return this;
  }

 /**
   * Latitude of the hotel.
   * @return latitude
  **/
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public CatalogsHotelAttributes latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

 /**
   * Longitude of the hotel.
   * @return longitude
  **/
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public CatalogsHotelAttributes longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

 /**
   * A list of neighborhoods where the hotel is located
   * @return neighborhood
  **/
  @JsonProperty("neighborhood")
  public List<String> getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(List<String> neighborhood) {
    this.neighborhood = neighborhood;
  }

  public CatalogsHotelAttributes neighborhood(List<String> neighborhood) {
    this.neighborhood = neighborhood;
    return this;
  }

  public CatalogsHotelAttributes addNeighborhoodItem(String neighborhoodItem) {
    this.neighborhood.add(neighborhoodItem);
    return this;
  }

 /**
   * Get address
   * @return address
  **/
  @JsonProperty("address")
  public CatalogsHotelAddress getAddress() {
    return address;
  }

  public void setAddress(CatalogsHotelAddress address) {
    this.address = address;
  }

  public CatalogsHotelAttributes address(CatalogsHotelAddress address) {
    this.address = address;
    return this;
  }

 /**
   * Custom grouping of hotels
   * @return customLabel0
  **/
  @JsonProperty("custom_label_0")
  public String getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public CatalogsHotelAttributes customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

 /**
   * Custom grouping of hotels
   * @return customLabel1
  **/
  @JsonProperty("custom_label_1")
  public String getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public CatalogsHotelAttributes customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

 /**
   * Custom grouping of hotels
   * @return customLabel2
  **/
  @JsonProperty("custom_label_2")
  public String getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public CatalogsHotelAttributes customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

 /**
   * Custom grouping of hotels
   * @return customLabel3
  **/
  @JsonProperty("custom_label_3")
  public String getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public CatalogsHotelAttributes customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

 /**
   * Custom grouping of hotels
   * @return customLabel4
  **/
  @JsonProperty("custom_label_4")
  public String getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public CatalogsHotelAttributes customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

 /**
   * The type of property. The category can be any type of internal description desired.
   * @return category
  **/
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CatalogsHotelAttributes category(String category) {
    this.category = category;
    return this;
  }

 /**
   * Base price of the hotel room per night followed by the ISO currency code
   * @return basePrice
  **/
  @JsonProperty("base_price")
  public String getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
  }

  public CatalogsHotelAttributes basePrice(String basePrice) {
    this.basePrice = basePrice;
    return this;
  }

 /**
   * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
   * @return salePrice
  **/
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  public CatalogsHotelAttributes salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

 /**
   * Get guestRatings
   * @return guestRatings
  **/
  @JsonProperty("guest_ratings")
  public CatalogsHotelGuestRatings getGuestRatings() {
    return guestRatings;
  }

  public void setGuestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
  }

  public CatalogsHotelAttributes guestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
    return this;
  }

 /**
   * Get mainImage
   * @return mainImage
  **/
  @JsonProperty("main_image")
  public CatalogsHotelAttributesAllOfMainImage getMainImage() {
    return mainImage;
  }

  public void setMainImage(CatalogsHotelAttributesAllOfMainImage mainImage) {
    this.mainImage = mainImage;
  }

  public CatalogsHotelAttributes mainImage(CatalogsHotelAttributesAllOfMainImage mainImage) {
    this.mainImage = mainImage;
    return this;
  }

 /**
   * &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.&lt;/p&gt;
   * @return additionalImageLink
  **/
  @JsonProperty("additional_image_link")
  public List<String> getAdditionalImageLink() {
    return additionalImageLink;
  }

  public void setAdditionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
  }

  public CatalogsHotelAttributes additionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
    return this;
  }

  public CatalogsHotelAttributes addAdditionalImageLinkItem(String additionalImageLinkItem) {
    this.additionalImageLink.add(additionalImageLinkItem);
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
    CatalogsHotelAttributes catalogsHotelAttributes = (CatalogsHotelAttributes) o;
    return Objects.equals(this.name, catalogsHotelAttributes.name) &&
        Objects.equals(this.link, catalogsHotelAttributes.link) &&
        Objects.equals(this.description, catalogsHotelAttributes.description) &&
        Objects.equals(this.brand, catalogsHotelAttributes.brand) &&
        Objects.equals(this.latitude, catalogsHotelAttributes.latitude) &&
        Objects.equals(this.longitude, catalogsHotelAttributes.longitude) &&
        Objects.equals(this.neighborhood, catalogsHotelAttributes.neighborhood) &&
        Objects.equals(this.address, catalogsHotelAttributes.address) &&
        Objects.equals(this.customLabel0, catalogsHotelAttributes.customLabel0) &&
        Objects.equals(this.customLabel1, catalogsHotelAttributes.customLabel1) &&
        Objects.equals(this.customLabel2, catalogsHotelAttributes.customLabel2) &&
        Objects.equals(this.customLabel3, catalogsHotelAttributes.customLabel3) &&
        Objects.equals(this.customLabel4, catalogsHotelAttributes.customLabel4) &&
        Objects.equals(this.category, catalogsHotelAttributes.category) &&
        Objects.equals(this.basePrice, catalogsHotelAttributes.basePrice) &&
        Objects.equals(this.salePrice, catalogsHotelAttributes.salePrice) &&
        Objects.equals(this.guestRatings, catalogsHotelAttributes.guestRatings) &&
        Objects.equals(this.mainImage, catalogsHotelAttributes.mainImage) &&
        Objects.equals(this.additionalImageLink, catalogsHotelAttributes.additionalImageLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, link, description, brand, latitude, longitude, neighborhood, address, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, category, basePrice, salePrice, guestRatings, mainImage, additionalImageLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelAttributes {\n");
    
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
    sb.append("    mainImage: ").append(toIndentedString(mainImage)).append("\n");
    sb.append("    additionalImageLink: ").append(toIndentedString(additionalImageLink)).append("\n");
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

