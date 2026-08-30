package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsAiContentDisclosure;
import org.openapitools.model.CatalogsHotelAddress;
import org.openapitools.model.CatalogsHotelGuestRatings;
import org.openapitools.model.CatalogsHotelMainImage;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CatalogsHotelAttributes implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Hotel address
   */
  @JsonProperty("address")
  private CatalogsHotelAddress address;

  /**
   * Base price of the hotel room per night followed by the ISO currency code
   */
  @JsonProperty("base_price")
  private String basePrice;

  /**
   * The brand to which this hotel belongs to.
   */
  @JsonProperty("brand")
  private String brand;

  /**
   * The type of property. The category can be any type of internal description desired.
   */
  @JsonProperty("category")
  private String category;

  /**
   * Custom grouping of hotels
   */
  @JsonProperty("custom_label_0")
  private String customLabel0;

  /**
   * Custom grouping of hotels
   */
  @JsonProperty("custom_label_1")
  private String customLabel1;

  /**
   * Custom grouping of hotels
   */
  @JsonProperty("custom_label_2")
  private String customLabel2;

  /**
   * Custom grouping of hotels
   */
  @JsonProperty("custom_label_3")
  private String customLabel3;

  /**
   * Custom grouping of hotels
   */
  @JsonProperty("custom_label_4")
  private String customLabel4;

  /**
   * Brief description of the hotel.
   */
  @JsonProperty("description")
  private String description;

  /**
   * If specified, you must provide all properties
   */
  @JsonProperty("guest_ratings")
  private CatalogsHotelGuestRatings guestRatings;

  /**
   * Latitude of the hotel.
   */
  @JsonProperty("latitude")
  private BigDecimal latitude;

  /**
   * Link to the product page
   */
  @JsonProperty("link")
  private String link;

  /**
   * Longitude of the hotel.
   */
  @JsonProperty("longitude")
  private BigDecimal longitude;

  /**
   * The hotel&#39;s name.
   */
  @JsonProperty("name")
  private String name;

  /**
   * A list of neighborhoods where the hotel is located
   */
  @JsonProperty("neighborhood")
  private List<String> neighborhood;

  /**
   * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
   */
  @JsonProperty("sale_price")
  private String salePrice;

  /**
   * &lt;&#x3D; 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.
   */
  @JsonProperty("additional_image_link")
  private List<String> additionalImageLink;

  /**
   * AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL.
   */
  @JsonProperty("ai_disclosures")
  private List<CatalogsAiContentDisclosure> aiDisclosures = new ArrayList<>();

  /**
   * The main hotel image
   */
  @JsonProperty("main_image")
  private CatalogsHotelMainImage mainImage;

  /**
   * Hotel address
   * @return address
   */
  public CatalogsHotelAddress getAddress() {
    return address;
  }

  public void setAddress(CatalogsHotelAddress address) {
    this.address = address;
  }

  /**
   * Base price of the hotel room per night followed by the ISO currency code
   * @return basePrice
   */
  public String getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
  }

  /**
   * The brand to which this hotel belongs to.
   * @return brand
   */
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * The type of property. The category can be any type of internal description desired.
   * @return category
   */
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * Custom grouping of hotels
   * @return customLabel0
   */
  public String getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  /**
   * Custom grouping of hotels
   * @return customLabel1
   */
  public String getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  /**
   * Custom grouping of hotels
   * @return customLabel2
   */
  public String getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  /**
   * Custom grouping of hotels
   * @return customLabel3
   */
  public String getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  /**
   * Custom grouping of hotels
   * @return customLabel4
   */
  public String getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  /**
   * Brief description of the hotel.
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * If specified, you must provide all properties
   * @return guestRatings
   */
  public CatalogsHotelGuestRatings getGuestRatings() {
    return guestRatings;
  }

  public void setGuestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
  }

  /**
   * Latitude of the hotel.
   * @return latitude
   */
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  /**
   * Link to the product page
   * @return link
   */
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  /**
   * Longitude of the hotel.
   * @return longitude
   */
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  /**
   * The hotel&#39;s name.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A list of neighborhoods where the hotel is located
   * @return neighborhood
   */
  public List<String> getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(List<String> neighborhood) {
    this.neighborhood = neighborhood;
  }

  /**
   * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
   * @return salePrice
   */
  public String getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  /**
   * &lt;&#x3D; 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.
   * @return additionalImageLink
   */
  public List<String> getAdditionalImageLink() {
    return additionalImageLink;
  }

  public void setAdditionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
  }

  /**
   * AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL.
   * @return aiDisclosures
   */
  public List<CatalogsAiContentDisclosure> getAiDisclosures() {
    return aiDisclosures;
  }

  public void setAiDisclosures(List<CatalogsAiContentDisclosure> aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  /**
   * The main hotel image
   * @return mainImage
   */
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
    return Objects.equals(this.address, catalogsHotelAttributes.address) &&
        Objects.equals(this.basePrice, catalogsHotelAttributes.basePrice) &&
        Objects.equals(this.brand, catalogsHotelAttributes.brand) &&
        Objects.equals(this.category, catalogsHotelAttributes.category) &&
        Objects.equals(this.customLabel0, catalogsHotelAttributes.customLabel0) &&
        Objects.equals(this.customLabel1, catalogsHotelAttributes.customLabel1) &&
        Objects.equals(this.customLabel2, catalogsHotelAttributes.customLabel2) &&
        Objects.equals(this.customLabel3, catalogsHotelAttributes.customLabel3) &&
        Objects.equals(this.customLabel4, catalogsHotelAttributes.customLabel4) &&
        Objects.equals(this.description, catalogsHotelAttributes.description) &&
        Objects.equals(this.guestRatings, catalogsHotelAttributes.guestRatings) &&
        Objects.equals(this.latitude, catalogsHotelAttributes.latitude) &&
        Objects.equals(this.link, catalogsHotelAttributes.link) &&
        Objects.equals(this.longitude, catalogsHotelAttributes.longitude) &&
        Objects.equals(this.name, catalogsHotelAttributes.name) &&
        Objects.equals(this.neighborhood, catalogsHotelAttributes.neighborhood) &&
        Objects.equals(this.salePrice, catalogsHotelAttributes.salePrice) &&
        Objects.equals(this.additionalImageLink, catalogsHotelAttributes.additionalImageLink) &&
        Objects.equals(this.aiDisclosures, catalogsHotelAttributes.aiDisclosures) &&
        Objects.equals(this.mainImage, catalogsHotelAttributes.mainImage);
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
