package apimodels;

import apimodels.CatalogsHotelAddress;
import apimodels.CatalogsHotelAttributesAllOfMainImage;
import apimodels.CatalogsHotelGuestRatings;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsHotelAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsHotelAttributes   {
  @JsonProperty("name")
  
  private String name;

  @JsonProperty("link")
  
  private String link;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("brand")
  
  private String brand;

  @JsonProperty("latitude")
  @Valid

  private BigDecimal latitude;

  @JsonProperty("longitude")
  @Valid

  private BigDecimal longitude;

  @JsonProperty("neighborhood")
  
  private List<String> neighborhood = null;

  @JsonProperty("address")
  @Valid

  private CatalogsHotelAddress address;

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

  @JsonProperty("category")
  
  private String category;

  @JsonProperty("base_price")
  
  private String basePrice;

  @JsonProperty("sale_price")
  
  private String salePrice;

  @JsonProperty("guest_ratings")
  @Valid

  private CatalogsHotelGuestRatings guestRatings;

  @JsonProperty("main_image")
  @Valid

  private CatalogsHotelAttributesAllOfMainImage mainImage;

  @JsonProperty("additional_image_link")
  
  private List<String> additionalImageLink = null;

  public CatalogsHotelAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The hotel's name.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogsHotelAttributes link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Link to the product page
   * @return link
  **/
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public CatalogsHotelAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Brief description of the hotel.
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogsHotelAttributes brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The brand to which this hotel belongs to.
   * @return brand
  **/
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public CatalogsHotelAttributes latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude of the hotel.
   * @return latitude
  **/
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public CatalogsHotelAttributes longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude of the hotel.
   * @return longitude
  **/
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public CatalogsHotelAttributes neighborhood(List<String> neighborhood) {
    this.neighborhood = neighborhood;
    return this;
  }

  public CatalogsHotelAttributes addNeighborhoodItem(String neighborhoodItem) {
    if (this.neighborhood == null) {
      this.neighborhood = new ArrayList<>();
    }
    this.neighborhood.add(neighborhoodItem);
    return this;
  }

   /**
   * A list of neighborhoods where the hotel is located
   * @return neighborhood
  **/
  public List<String> getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(List<String> neighborhood) {
    this.neighborhood = neighborhood;
  }

  public CatalogsHotelAttributes address(CatalogsHotelAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  public CatalogsHotelAddress getAddress() {
    return address;
  }

  public void setAddress(CatalogsHotelAddress address) {
    this.address = address;
  }

  public CatalogsHotelAttributes customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

   /**
   * Custom grouping of hotels
   * @return customLabel0
  **/
  public String getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public CatalogsHotelAttributes customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

   /**
   * Custom grouping of hotels
   * @return customLabel1
  **/
  public String getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public CatalogsHotelAttributes customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

   /**
   * Custom grouping of hotels
   * @return customLabel2
  **/
  public String getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public CatalogsHotelAttributes customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

   /**
   * Custom grouping of hotels
   * @return customLabel3
  **/
  public String getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public CatalogsHotelAttributes customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

   /**
   * Custom grouping of hotels
   * @return customLabel4
  **/
  public String getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public CatalogsHotelAttributes category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The type of property. The category can be any type of internal description desired.
   * @return category
  **/
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CatalogsHotelAttributes basePrice(String basePrice) {
    this.basePrice = basePrice;
    return this;
  }

   /**
   * Base price of the hotel room per night followed by the ISO currency code
   * @return basePrice
  **/
  public String getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
  }

  public CatalogsHotelAttributes salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

   /**
   * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
   * @return salePrice
  **/
  public String getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  public CatalogsHotelAttributes guestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
    return this;
  }

   /**
   * Get guestRatings
   * @return guestRatings
  **/
  public CatalogsHotelGuestRatings getGuestRatings() {
    return guestRatings;
  }

  public void setGuestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
  }

  public CatalogsHotelAttributes mainImage(CatalogsHotelAttributesAllOfMainImage mainImage) {
    this.mainImage = mainImage;
    return this;
  }

   /**
   * Get mainImage
   * @return mainImage
  **/
  public CatalogsHotelAttributesAllOfMainImage getMainImage() {
    return mainImage;
  }

  public void setMainImage(CatalogsHotelAttributesAllOfMainImage mainImage) {
    this.mainImage = mainImage;
  }

  public CatalogsHotelAttributes additionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
    return this;
  }

  public CatalogsHotelAttributes addAdditionalImageLinkItem(String additionalImageLinkItem) {
    if (this.additionalImageLink == null) {
      this.additionalImageLink = new ArrayList<>();
    }
    this.additionalImageLink.add(additionalImageLinkItem);
    return this;
  }

   /**
   * <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
   * @return additionalImageLink
  **/
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
    return Objects.equals(name, catalogsHotelAttributes.name) &&
        Objects.equals(link, catalogsHotelAttributes.link) &&
        Objects.equals(description, catalogsHotelAttributes.description) &&
        Objects.equals(brand, catalogsHotelAttributes.brand) &&
        Objects.equals(latitude, catalogsHotelAttributes.latitude) &&
        Objects.equals(longitude, catalogsHotelAttributes.longitude) &&
        Objects.equals(neighborhood, catalogsHotelAttributes.neighborhood) &&
        Objects.equals(address, catalogsHotelAttributes.address) &&
        Objects.equals(customLabel0, catalogsHotelAttributes.customLabel0) &&
        Objects.equals(customLabel1, catalogsHotelAttributes.customLabel1) &&
        Objects.equals(customLabel2, catalogsHotelAttributes.customLabel2) &&
        Objects.equals(customLabel3, catalogsHotelAttributes.customLabel3) &&
        Objects.equals(customLabel4, catalogsHotelAttributes.customLabel4) &&
        Objects.equals(category, catalogsHotelAttributes.category) &&
        Objects.equals(basePrice, catalogsHotelAttributes.basePrice) &&
        Objects.equals(salePrice, catalogsHotelAttributes.salePrice) &&
        Objects.equals(guestRatings, catalogsHotelAttributes.guestRatings) &&
        Objects.equals(mainImage, catalogsHotelAttributes.mainImage) &&
        Objects.equals(additionalImageLink, catalogsHotelAttributes.additionalImageLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, link, description, brand, latitude, longitude, neighborhood, address, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, category, basePrice, salePrice, guestRatings, mainImage, additionalImageLink);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

