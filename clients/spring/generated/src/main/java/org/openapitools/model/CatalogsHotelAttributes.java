package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsHotelAddress;
import org.openapitools.model.CatalogsHotelAttributesAllOfMainImage;
import org.openapitools.model.CatalogsHotelGuestRatings;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsHotelAttributes
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsHotelAttributes {

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> link = JsonNullable.<String>undefined();

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private JsonNullable<String> brand = JsonNullable.<String>undefined();

  private BigDecimal latitude;

  private JsonNullable<BigDecimal> longitude = JsonNullable.<BigDecimal>undefined();

  @Valid
  private JsonNullable<List<String>> neighborhood = JsonNullable.<List<String>>undefined();

  private CatalogsHotelAddress address;

  private JsonNullable<String> customLabel0 = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel1 = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel2 = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel3 = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel4 = JsonNullable.<String>undefined();

  private JsonNullable<String> category = JsonNullable.<String>undefined();

  private JsonNullable<String> basePrice = JsonNullable.<String>undefined();

  private JsonNullable<String> salePrice = JsonNullable.<String>undefined();

  private CatalogsHotelGuestRatings guestRatings;

  private CatalogsHotelAttributesAllOfMainImage mainImage;

  @Valid
  private JsonNullable<List<String>> additionalImageLink = JsonNullable.<List<String>>undefined();

  public CatalogsHotelAttributes name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * The hotel's name.
   * @return name
  */
  
  @Schema(name = "name", description = "The hotel's name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public CatalogsHotelAttributes link(String link) {
    this.link = JsonNullable.of(link);
    return this;
  }

  /**
   * Link to the product page
   * @return link
  */
  
  @Schema(name = "link", description = "Link to the product page", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public JsonNullable<String> getLink() {
    return link;
  }

  public void setLink(JsonNullable<String> link) {
    this.link = link;
  }

  public CatalogsHotelAttributes description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Brief description of the hotel.
   * @return description
  */
  
  @Schema(name = "description", description = "Brief description of the hotel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public CatalogsHotelAttributes brand(String brand) {
    this.brand = JsonNullable.of(brand);
    return this;
  }

  /**
   * The brand to which this hotel belongs to.
   * @return brand
  */
  
  @Schema(name = "brand", description = "The brand to which this hotel belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brand")
  public JsonNullable<String> getBrand() {
    return brand;
  }

  public void setBrand(JsonNullable<String> brand) {
    this.brand = brand;
  }

  public CatalogsHotelAttributes latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Latitude of the hotel.
   * @return latitude
  */
  @Valid 
  @Schema(name = "latitude", description = "Latitude of the hotel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public CatalogsHotelAttributes longitude(BigDecimal longitude) {
    this.longitude = JsonNullable.of(longitude);
    return this;
  }

  /**
   * Longitude of the hotel.
   * @return longitude
  */
  @Valid 
  @Schema(name = "longitude", description = "Longitude of the hotel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longitude")
  public JsonNullable<BigDecimal> getLongitude() {
    return longitude;
  }

  public void setLongitude(JsonNullable<BigDecimal> longitude) {
    this.longitude = longitude;
  }

  public CatalogsHotelAttributes neighborhood(List<String> neighborhood) {
    this.neighborhood = JsonNullable.of(neighborhood);
    return this;
  }

  public CatalogsHotelAttributes addNeighborhoodItem(String neighborhoodItem) {
    if (this.neighborhood == null || !this.neighborhood.isPresent()) {
      this.neighborhood = JsonNullable.of(new ArrayList<>());
    }
    this.neighborhood.get().add(neighborhoodItem);
    return this;
  }

  /**
   * A list of neighborhoods where the hotel is located
   * @return neighborhood
  */
  
  @Schema(name = "neighborhood", description = "A list of neighborhoods where the hotel is located", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("neighborhood")
  public JsonNullable<List<String>> getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(JsonNullable<List<String>> neighborhood) {
    this.neighborhood = neighborhood;
  }

  public CatalogsHotelAttributes address(CatalogsHotelAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public CatalogsHotelAddress getAddress() {
    return address;
  }

  public void setAddress(CatalogsHotelAddress address) {
    this.address = address;
  }

  public CatalogsHotelAttributes customLabel0(String customLabel0) {
    this.customLabel0 = JsonNullable.of(customLabel0);
    return this;
  }

  /**
   * Custom grouping of hotels
   * @return customLabel0
  */
  
  @Schema(name = "custom_label_0", description = "Custom grouping of hotels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_0")
  public JsonNullable<String> getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(JsonNullable<String> customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public CatalogsHotelAttributes customLabel1(String customLabel1) {
    this.customLabel1 = JsonNullable.of(customLabel1);
    return this;
  }

  /**
   * Custom grouping of hotels
   * @return customLabel1
  */
  
  @Schema(name = "custom_label_1", description = "Custom grouping of hotels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_1")
  public JsonNullable<String> getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(JsonNullable<String> customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public CatalogsHotelAttributes customLabel2(String customLabel2) {
    this.customLabel2 = JsonNullable.of(customLabel2);
    return this;
  }

  /**
   * Custom grouping of hotels
   * @return customLabel2
  */
  
  @Schema(name = "custom_label_2", description = "Custom grouping of hotels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_2")
  public JsonNullable<String> getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(JsonNullable<String> customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public CatalogsHotelAttributes customLabel3(String customLabel3) {
    this.customLabel3 = JsonNullable.of(customLabel3);
    return this;
  }

  /**
   * Custom grouping of hotels
   * @return customLabel3
  */
  
  @Schema(name = "custom_label_3", description = "Custom grouping of hotels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_3")
  public JsonNullable<String> getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(JsonNullable<String> customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public CatalogsHotelAttributes customLabel4(String customLabel4) {
    this.customLabel4 = JsonNullable.of(customLabel4);
    return this;
  }

  /**
   * Custom grouping of hotels
   * @return customLabel4
  */
  
  @Schema(name = "custom_label_4", description = "Custom grouping of hotels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_4")
  public JsonNullable<String> getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(JsonNullable<String> customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public CatalogsHotelAttributes category(String category) {
    this.category = JsonNullable.of(category);
    return this;
  }

  /**
   * The type of property. The category can be any type of internal description desired.
   * @return category
  */
  
  @Schema(name = "category", description = "The type of property. The category can be any type of internal description desired.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public JsonNullable<String> getCategory() {
    return category;
  }

  public void setCategory(JsonNullable<String> category) {
    this.category = category;
  }

  public CatalogsHotelAttributes basePrice(String basePrice) {
    this.basePrice = JsonNullable.of(basePrice);
    return this;
  }

  /**
   * Base price of the hotel room per night followed by the ISO currency code
   * @return basePrice
  */
  
  @Schema(name = "base_price", example = "100 USD", description = "Base price of the hotel room per night followed by the ISO currency code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("base_price")
  public JsonNullable<String> getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(JsonNullable<String> basePrice) {
    this.basePrice = basePrice;
  }

  public CatalogsHotelAttributes salePrice(String salePrice) {
    this.salePrice = JsonNullable.of(salePrice);
    return this;
  }

  /**
   * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
   * @return salePrice
  */
  
  @Schema(name = "sale_price", example = "90 USD", description = "Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sale_price")
  public JsonNullable<String> getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(JsonNullable<String> salePrice) {
    this.salePrice = salePrice;
  }

  public CatalogsHotelAttributes guestRatings(CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
    return this;
  }

  /**
   * Get guestRatings
   * @return guestRatings
  */
  @Valid 
  @Schema(name = "guest_ratings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guest_ratings")
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
  */
  @Valid 
  @Schema(name = "main_image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("main_image")
  public CatalogsHotelAttributesAllOfMainImage getMainImage() {
    return mainImage;
  }

  public void setMainImage(CatalogsHotelAttributesAllOfMainImage mainImage) {
    this.mainImage = mainImage;
  }

  public CatalogsHotelAttributes additionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = JsonNullable.of(additionalImageLink);
    return this;
  }

  public CatalogsHotelAttributes addAdditionalImageLinkItem(String additionalImageLinkItem) {
    if (this.additionalImageLink == null || !this.additionalImageLink.isPresent()) {
      this.additionalImageLink = JsonNullable.of(new ArrayList<>());
    }
    this.additionalImageLink.get().add(additionalImageLinkItem);
    return this;
  }

  /**
   * <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
   * @return additionalImageLink
  */
  
  @Schema(name = "additional_image_link", example = "[\"https://scene.example.com/image/image_v2.jpg\",\"https://scene.example.com/image/image_v3.jpg\"]", description = "<p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additional_image_link")
  public JsonNullable<List<String>> getAdditionalImageLink() {
    return additionalImageLink;
  }

  public void setAdditionalImageLink(JsonNullable<List<String>> additionalImageLink) {
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
    return equalsNullable(this.name, catalogsHotelAttributes.name) &&
        equalsNullable(this.link, catalogsHotelAttributes.link) &&
        equalsNullable(this.description, catalogsHotelAttributes.description) &&
        equalsNullable(this.brand, catalogsHotelAttributes.brand) &&
        Objects.equals(this.latitude, catalogsHotelAttributes.latitude) &&
        equalsNullable(this.longitude, catalogsHotelAttributes.longitude) &&
        equalsNullable(this.neighborhood, catalogsHotelAttributes.neighborhood) &&
        Objects.equals(this.address, catalogsHotelAttributes.address) &&
        equalsNullable(this.customLabel0, catalogsHotelAttributes.customLabel0) &&
        equalsNullable(this.customLabel1, catalogsHotelAttributes.customLabel1) &&
        equalsNullable(this.customLabel2, catalogsHotelAttributes.customLabel2) &&
        equalsNullable(this.customLabel3, catalogsHotelAttributes.customLabel3) &&
        equalsNullable(this.customLabel4, catalogsHotelAttributes.customLabel4) &&
        equalsNullable(this.category, catalogsHotelAttributes.category) &&
        equalsNullable(this.basePrice, catalogsHotelAttributes.basePrice) &&
        equalsNullable(this.salePrice, catalogsHotelAttributes.salePrice) &&
        Objects.equals(this.guestRatings, catalogsHotelAttributes.guestRatings) &&
        Objects.equals(this.mainImage, catalogsHotelAttributes.mainImage) &&
        equalsNullable(this.additionalImageLink, catalogsHotelAttributes.additionalImageLink);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(link), hashCodeNullable(description), hashCodeNullable(brand), latitude, hashCodeNullable(longitude), hashCodeNullable(neighborhood), address, hashCodeNullable(customLabel0), hashCodeNullable(customLabel1), hashCodeNullable(customLabel2), hashCodeNullable(customLabel3), hashCodeNullable(customLabel4), hashCodeNullable(category), hashCodeNullable(basePrice), hashCodeNullable(salePrice), guestRatings, mainImage, hashCodeNullable(additionalImageLink));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

