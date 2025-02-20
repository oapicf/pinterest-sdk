/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import java.util.*;
import org.openapitools.client.model.CatalogsHotelAddress;
import org.openapitools.client.model.CatalogsHotelAttributesAllOfMainImage;
import org.openapitools.client.model.CatalogsHotelGuestRatings;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CatalogsHotelAttributes {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("link")
  private String link = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("brand")
  private String brand = null;
  @SerializedName("latitude")
  private BigDecimal latitude = null;
  @SerializedName("longitude")
  private BigDecimal longitude = null;
  @SerializedName("neighborhood")
  private List<String> neighborhood = null;
  @SerializedName("address")
  private CatalogsHotelAddress address = null;
  @SerializedName("custom_label_0")
  private String customLabel0 = null;
  @SerializedName("custom_label_1")
  private String customLabel1 = null;
  @SerializedName("custom_label_2")
  private String customLabel2 = null;
  @SerializedName("custom_label_3")
  private String customLabel3 = null;
  @SerializedName("custom_label_4")
  private String customLabel4 = null;
  @SerializedName("category")
  private String category = null;
  @SerializedName("base_price")
  private String basePrice = null;
  @SerializedName("sale_price")
  private String salePrice = null;
  @SerializedName("guest_ratings")
  private CatalogsHotelGuestRatings guestRatings = null;
  @SerializedName("main_image")
  private CatalogsHotelAttributesAllOfMainImage mainImage = null;
  @SerializedName("additional_image_link")
  private List<String> additionalImageLink = null;

  /**
   * The hotel's name.
   **/
  @ApiModelProperty(value = "The hotel's name.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Link to the product page
   **/
  @ApiModelProperty(value = "Link to the product page")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   * Brief description of the hotel.
   **/
  @ApiModelProperty(value = "Brief description of the hotel.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The brand to which this hotel belongs to.
   **/
  @ApiModelProperty(value = "The brand to which this hotel belongs to.")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Latitude of the hotel.
   **/
  @ApiModelProperty(value = "Latitude of the hotel.")
  public BigDecimal getLatitude() {
    return latitude;
  }
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  /**
   * Longitude of the hotel.
   **/
  @ApiModelProperty(value = "Longitude of the hotel.")
  public BigDecimal getLongitude() {
    return longitude;
  }
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  /**
   * A list of neighborhoods where the hotel is located
   **/
  @ApiModelProperty(value = "A list of neighborhoods where the hotel is located")
  public List<String> getNeighborhood() {
    return neighborhood;
  }
  public void setNeighborhood(List<String> neighborhood) {
    this.neighborhood = neighborhood;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CatalogsHotelAddress getAddress() {
    return address;
  }
  public void setAddress(CatalogsHotelAddress address) {
    this.address = address;
  }

  /**
   * Custom grouping of hotels
   **/
  @ApiModelProperty(value = "Custom grouping of hotels")
  public String getCustomLabel0() {
    return customLabel0;
  }
  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  /**
   * Custom grouping of hotels
   **/
  @ApiModelProperty(value = "Custom grouping of hotels")
  public String getCustomLabel1() {
    return customLabel1;
  }
  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  /**
   * Custom grouping of hotels
   **/
  @ApiModelProperty(value = "Custom grouping of hotels")
  public String getCustomLabel2() {
    return customLabel2;
  }
  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  /**
   * Custom grouping of hotels
   **/
  @ApiModelProperty(value = "Custom grouping of hotels")
  public String getCustomLabel3() {
    return customLabel3;
  }
  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  /**
   * Custom grouping of hotels
   **/
  @ApiModelProperty(value = "Custom grouping of hotels")
  public String getCustomLabel4() {
    return customLabel4;
  }
  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  /**
   * The type of property. The category can be any type of internal description desired.
   **/
  @ApiModelProperty(value = "The type of property. The category can be any type of internal description desired.")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Base price of the hotel room per night followed by the ISO currency code
   **/
  @ApiModelProperty(value = "Base price of the hotel room per night followed by the ISO currency code")
  public String getBasePrice() {
    return basePrice;
  }
  public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
  }

  /**
   * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
   **/
  @ApiModelProperty(value = "Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.")
  public String getSalePrice() {
    return salePrice;
  }
  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CatalogsHotelGuestRatings getGuestRatings() {
    return guestRatings;
  }
  public void setGuestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CatalogsHotelAttributesAllOfMainImage getMainImage() {
    return mainImage;
  }
  public void setMainImage(CatalogsHotelAttributesAllOfMainImage mainImage) {
    this.mainImage = mainImage;
  }

  /**
   * <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
   **/
  @ApiModelProperty(value = "<p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>")
  public List<String> getAdditionalImageLink() {
    return additionalImageLink;
  }
  public void setAdditionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
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
    return (this.name == null ? catalogsHotelAttributes.name == null : this.name.equals(catalogsHotelAttributes.name)) &&
        (this.link == null ? catalogsHotelAttributes.link == null : this.link.equals(catalogsHotelAttributes.link)) &&
        (this.description == null ? catalogsHotelAttributes.description == null : this.description.equals(catalogsHotelAttributes.description)) &&
        (this.brand == null ? catalogsHotelAttributes.brand == null : this.brand.equals(catalogsHotelAttributes.brand)) &&
        (this.latitude == null ? catalogsHotelAttributes.latitude == null : this.latitude.equals(catalogsHotelAttributes.latitude)) &&
        (this.longitude == null ? catalogsHotelAttributes.longitude == null : this.longitude.equals(catalogsHotelAttributes.longitude)) &&
        (this.neighborhood == null ? catalogsHotelAttributes.neighborhood == null : this.neighborhood.equals(catalogsHotelAttributes.neighborhood)) &&
        (this.address == null ? catalogsHotelAttributes.address == null : this.address.equals(catalogsHotelAttributes.address)) &&
        (this.customLabel0 == null ? catalogsHotelAttributes.customLabel0 == null : this.customLabel0.equals(catalogsHotelAttributes.customLabel0)) &&
        (this.customLabel1 == null ? catalogsHotelAttributes.customLabel1 == null : this.customLabel1.equals(catalogsHotelAttributes.customLabel1)) &&
        (this.customLabel2 == null ? catalogsHotelAttributes.customLabel2 == null : this.customLabel2.equals(catalogsHotelAttributes.customLabel2)) &&
        (this.customLabel3 == null ? catalogsHotelAttributes.customLabel3 == null : this.customLabel3.equals(catalogsHotelAttributes.customLabel3)) &&
        (this.customLabel4 == null ? catalogsHotelAttributes.customLabel4 == null : this.customLabel4.equals(catalogsHotelAttributes.customLabel4)) &&
        (this.category == null ? catalogsHotelAttributes.category == null : this.category.equals(catalogsHotelAttributes.category)) &&
        (this.basePrice == null ? catalogsHotelAttributes.basePrice == null : this.basePrice.equals(catalogsHotelAttributes.basePrice)) &&
        (this.salePrice == null ? catalogsHotelAttributes.salePrice == null : this.salePrice.equals(catalogsHotelAttributes.salePrice)) &&
        (this.guestRatings == null ? catalogsHotelAttributes.guestRatings == null : this.guestRatings.equals(catalogsHotelAttributes.guestRatings)) &&
        (this.mainImage == null ? catalogsHotelAttributes.mainImage == null : this.mainImage.equals(catalogsHotelAttributes.mainImage)) &&
        (this.additionalImageLink == null ? catalogsHotelAttributes.additionalImageLink == null : this.additionalImageLink.equals(catalogsHotelAttributes.additionalImageLink));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.link == null ? 0: this.link.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.brand == null ? 0: this.brand.hashCode());
    result = 31 * result + (this.latitude == null ? 0: this.latitude.hashCode());
    result = 31 * result + (this.longitude == null ? 0: this.longitude.hashCode());
    result = 31 * result + (this.neighborhood == null ? 0: this.neighborhood.hashCode());
    result = 31 * result + (this.address == null ? 0: this.address.hashCode());
    result = 31 * result + (this.customLabel0 == null ? 0: this.customLabel0.hashCode());
    result = 31 * result + (this.customLabel1 == null ? 0: this.customLabel1.hashCode());
    result = 31 * result + (this.customLabel2 == null ? 0: this.customLabel2.hashCode());
    result = 31 * result + (this.customLabel3 == null ? 0: this.customLabel3.hashCode());
    result = 31 * result + (this.customLabel4 == null ? 0: this.customLabel4.hashCode());
    result = 31 * result + (this.category == null ? 0: this.category.hashCode());
    result = 31 * result + (this.basePrice == null ? 0: this.basePrice.hashCode());
    result = 31 * result + (this.salePrice == null ? 0: this.salePrice.hashCode());
    result = 31 * result + (this.guestRatings == null ? 0: this.guestRatings.hashCode());
    result = 31 * result + (this.mainImage == null ? 0: this.mainImage.hashCode());
    result = 31 * result + (this.additionalImageLink == null ? 0: this.additionalImageLink.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelAttributes {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  link: ").append(link).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  brand: ").append(brand).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  neighborhood: ").append(neighborhood).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  customLabel0: ").append(customLabel0).append("\n");
    sb.append("  customLabel1: ").append(customLabel1).append("\n");
    sb.append("  customLabel2: ").append(customLabel2).append("\n");
    sb.append("  customLabel3: ").append(customLabel3).append("\n");
    sb.append("  customLabel4: ").append(customLabel4).append("\n");
    sb.append("  category: ").append(category).append("\n");
    sb.append("  basePrice: ").append(basePrice).append("\n");
    sb.append("  salePrice: ").append(salePrice).append("\n");
    sb.append("  guestRatings: ").append(guestRatings).append("\n");
    sb.append("  mainImage: ").append(mainImage).append("\n");
    sb.append("  additionalImageLink: ").append(additionalImageLink).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
