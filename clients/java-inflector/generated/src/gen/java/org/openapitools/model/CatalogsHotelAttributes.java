package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsAiContentDisclosure;
import org.openapitools.model.CatalogsHotelAddress;
import org.openapitools.model.CatalogsHotelGuestRatings;
import org.openapitools.model.CatalogsHotelMainImage;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsHotelAttributes   {
  @JsonProperty("address")
  private CatalogsHotelAddress address;

  @JsonProperty("base_price")
  private String basePrice;

  @JsonProperty("brand")
  private String brand;

  @JsonProperty("category")
  private String category;

  @JsonProperty("custom_label_0")
  private String customLabel0;

  @JsonProperty("custom_label_1")
  private String customLabel1;

  @JsonProperty("custom_label_2")
  private String customLabel2;

  @JsonProperty("custom_label_3")
  private String customLabel3;

  @JsonProperty("custom_label_4")
  private String customLabel4;

  @JsonProperty("description")
  private String description;

  @JsonProperty("guest_ratings")
  private CatalogsHotelGuestRatings guestRatings;

  @JsonProperty("latitude")
  private BigDecimal latitude;

  @JsonProperty("link")
  private String link;

  @JsonProperty("longitude")
  private BigDecimal longitude;

  @JsonProperty("name")
  private String name;

  @JsonProperty("neighborhood")
  private List<String> neighborhood = null;

  @JsonProperty("sale_price")
  private String salePrice;

  @JsonProperty("additional_image_link")
  private List<String> additionalImageLink = null;

  @JsonProperty("ai_disclosures")
  private List<CatalogsAiContentDisclosure> aiDisclosures = null;

  @JsonProperty("main_image")
  private CatalogsHotelMainImage mainImage;

  /**
   * Hotel address
   **/
  public CatalogsHotelAttributes address(CatalogsHotelAddress address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(value = "Hotel address")
  @JsonProperty("address")
  public CatalogsHotelAddress getAddress() {
    return address;
  }
  public void setAddress(CatalogsHotelAddress address) {
    this.address = address;
  }

  /**
   * Base price of the hotel room per night followed by the ISO currency code
   **/
  public CatalogsHotelAttributes basePrice(String basePrice) {
    this.basePrice = basePrice;
    return this;
  }

  
  @ApiModelProperty(example = "100 USD", value = "Base price of the hotel room per night followed by the ISO currency code")
  @JsonProperty("base_price")
  public String getBasePrice() {
    return basePrice;
  }
  public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
  }

  /**
   * The brand to which this hotel belongs to.
   **/
  public CatalogsHotelAttributes brand(String brand) {
    this.brand = brand;
    return this;
  }

  
  @ApiModelProperty(value = "The brand to which this hotel belongs to.")
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * The type of property. The category can be any type of internal description desired.
   **/
  public CatalogsHotelAttributes category(String category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(value = "The type of property. The category can be any type of internal description desired.")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Custom grouping of hotels
   **/
  public CatalogsHotelAttributes customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

  
  @ApiModelProperty(value = "Custom grouping of hotels")
  @JsonProperty("custom_label_0")
  public String getCustomLabel0() {
    return customLabel0;
  }
  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  /**
   * Custom grouping of hotels
   **/
  public CatalogsHotelAttributes customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

  
  @ApiModelProperty(value = "Custom grouping of hotels")
  @JsonProperty("custom_label_1")
  public String getCustomLabel1() {
    return customLabel1;
  }
  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  /**
   * Custom grouping of hotels
   **/
  public CatalogsHotelAttributes customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

  
  @ApiModelProperty(value = "Custom grouping of hotels")
  @JsonProperty("custom_label_2")
  public String getCustomLabel2() {
    return customLabel2;
  }
  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  /**
   * Custom grouping of hotels
   **/
  public CatalogsHotelAttributes customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

  
  @ApiModelProperty(value = "Custom grouping of hotels")
  @JsonProperty("custom_label_3")
  public String getCustomLabel3() {
    return customLabel3;
  }
  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  /**
   * Custom grouping of hotels
   **/
  public CatalogsHotelAttributes customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

  
  @ApiModelProperty(value = "Custom grouping of hotels")
  @JsonProperty("custom_label_4")
  public String getCustomLabel4() {
    return customLabel4;
  }
  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  /**
   * Brief description of the hotel.
   **/
  public CatalogsHotelAttributes description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Brief description of the hotel.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * If specified, you must provide all properties
   **/
  public CatalogsHotelAttributes guestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
    return this;
  }

  
  @ApiModelProperty(value = "If specified, you must provide all properties")
  @JsonProperty("guest_ratings")
  public CatalogsHotelGuestRatings getGuestRatings() {
    return guestRatings;
  }
  public void setGuestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
  }

  /**
   * Latitude of the hotel.
   **/
  public CatalogsHotelAttributes latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(value = "Latitude of the hotel.")
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  /**
   * Link to the product page
   **/
  public CatalogsHotelAttributes link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(value = "Link to the product page")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   * Longitude of the hotel.
   **/
  public CatalogsHotelAttributes longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(value = "Longitude of the hotel.")
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  /**
   * The hotel's name.
   **/
  public CatalogsHotelAttributes name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The hotel's name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A list of neighborhoods where the hotel is located
   **/
  public CatalogsHotelAttributes neighborhood(List<String> neighborhood) {
    this.neighborhood = neighborhood;
    return this;
  }

  
  @ApiModelProperty(value = "A list of neighborhoods where the hotel is located")
  @JsonProperty("neighborhood")
  public List<String> getNeighborhood() {
    return neighborhood;
  }
  public void setNeighborhood(List<String> neighborhood) {
    this.neighborhood = neighborhood;
  }

  /**
   * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
   **/
  public CatalogsHotelAttributes salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

  
  @ApiModelProperty(example = "90 USD", value = "Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.")
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }
  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  /**
   * <= 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.
   **/
  public CatalogsHotelAttributes additionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
    return this;
  }

  
  @ApiModelProperty(example = "[\"https://scene.example.com/image/image_v2.jpg\",\"https://scene.example.com/image/image_v3.jpg\"]", value = "<= 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.")
  @JsonProperty("additional_image_link")
  public List<String> getAdditionalImageLink() {
    return additionalImageLink;
  }
  public void setAdditionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
  }

  /**
   * AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL.
   **/
  public CatalogsHotelAttributes aiDisclosures(List<CatalogsAiContentDisclosure> aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"url\":\"https://scene.example.com/image/image_v3.jpg\",\"disclosure\":[\"ai_modified\"]}]", value = "AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL.")
  @JsonProperty("ai_disclosures")
  public List<CatalogsAiContentDisclosure> getAiDisclosures() {
    return aiDisclosures;
  }
  public void setAiDisclosures(List<CatalogsAiContentDisclosure> aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  /**
   * The main hotel image
   **/
  public CatalogsHotelAttributes mainImage(CatalogsHotelMainImage mainImage) {
    this.mainImage = mainImage;
    return this;
  }

  
  @ApiModelProperty(value = "The main hotel image")
  @JsonProperty("main_image")
  public CatalogsHotelMainImage getMainImage() {
    return mainImage;
  }
  public void setMainImage(CatalogsHotelMainImage mainImage) {
    this.mainImage = mainImage;
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
    return Objects.equals(address, catalogsHotelAttributes.address) &&
        Objects.equals(basePrice, catalogsHotelAttributes.basePrice) &&
        Objects.equals(brand, catalogsHotelAttributes.brand) &&
        Objects.equals(category, catalogsHotelAttributes.category) &&
        Objects.equals(customLabel0, catalogsHotelAttributes.customLabel0) &&
        Objects.equals(customLabel1, catalogsHotelAttributes.customLabel1) &&
        Objects.equals(customLabel2, catalogsHotelAttributes.customLabel2) &&
        Objects.equals(customLabel3, catalogsHotelAttributes.customLabel3) &&
        Objects.equals(customLabel4, catalogsHotelAttributes.customLabel4) &&
        Objects.equals(description, catalogsHotelAttributes.description) &&
        Objects.equals(guestRatings, catalogsHotelAttributes.guestRatings) &&
        Objects.equals(latitude, catalogsHotelAttributes.latitude) &&
        Objects.equals(link, catalogsHotelAttributes.link) &&
        Objects.equals(longitude, catalogsHotelAttributes.longitude) &&
        Objects.equals(name, catalogsHotelAttributes.name) &&
        Objects.equals(neighborhood, catalogsHotelAttributes.neighborhood) &&
        Objects.equals(salePrice, catalogsHotelAttributes.salePrice) &&
        Objects.equals(additionalImageLink, catalogsHotelAttributes.additionalImageLink) &&
        Objects.equals(aiDisclosures, catalogsHotelAttributes.aiDisclosures) &&
        Objects.equals(mainImage, catalogsHotelAttributes.mainImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, basePrice, brand, category, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, description, guestRatings, latitude, link, longitude, name, neighborhood, salePrice, additionalImageLink, aiDisclosures, mainImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsHotelAttributes {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    basePrice: ").append(toIndentedString(basePrice)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    customLabel0: ").append(toIndentedString(customLabel0)).append("\n");
    sb.append("    customLabel1: ").append(toIndentedString(customLabel1)).append("\n");
    sb.append("    customLabel2: ").append(toIndentedString(customLabel2)).append("\n");
    sb.append("    customLabel3: ").append(toIndentedString(customLabel3)).append("\n");
    sb.append("    customLabel4: ").append(toIndentedString(customLabel4)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    guestRatings: ").append(toIndentedString(guestRatings)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    additionalImageLink: ").append(toIndentedString(additionalImageLink)).append("\n");
    sb.append("    aiDisclosures: ").append(toIndentedString(aiDisclosures)).append("\n");
    sb.append("    mainImage: ").append(toIndentedString(mainImage)).append("\n");
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

