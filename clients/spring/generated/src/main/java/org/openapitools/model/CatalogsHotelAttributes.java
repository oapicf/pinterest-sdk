package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsAiContentDisclosure;
import org.openapitools.model.CatalogsHotelAddress;
import org.openapitools.model.CatalogsHotelGuestRatings;
import org.openapitools.model.CatalogsHotelMainImage;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CatalogsHotelAttributes
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsHotelAttributes {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsHotelAddress address;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> basePrice = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> brand = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> category = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> customLabel0 = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> customLabel1 = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> customLabel2 = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> customLabel3 = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> customLabel4 = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsHotelGuestRatings guestRatings;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BigDecimal latitude;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> link = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<BigDecimal> longitude = JsonNullable.<BigDecimal>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<List<String>> neighborhood = JsonNullable.<List<String>>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> salePrice = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<List<String>> additionalImageLink = JsonNullable.<List<String>>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CatalogsAiContentDisclosure> aiDisclosures = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CatalogsHotelMainImage mainImage;

  public CatalogsHotelAttributes address(@Nullable CatalogsHotelAddress address) {
    this.address = address;
    return this;
  }

  /**
   * Hotel address
   * @return address
   */
  @Valid 
  @Schema(name = "address", description = "Hotel address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public @Nullable CatalogsHotelAddress getAddress() {
    return address;
  }

  @JsonProperty("address")
  public void setAddress(@Nullable CatalogsHotelAddress address) {
    this.address = address;
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

  public CatalogsHotelAttributes guestRatings(@Nullable CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
    return this;
  }

  /**
   * If specified, you must provide all properties
   * @return guestRatings
   */
  @Valid 
  @Schema(name = "guest_ratings", description = "If specified, you must provide all properties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guest_ratings")
  public @Nullable CatalogsHotelGuestRatings getGuestRatings() {
    return guestRatings;
  }

  @JsonProperty("guest_ratings")
  public void setGuestRatings(@Nullable CatalogsHotelGuestRatings guestRatings) {
    this.guestRatings = guestRatings;
  }

  public CatalogsHotelAttributes latitude(@Nullable BigDecimal latitude) {
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
  public @Nullable BigDecimal getLatitude() {
    return latitude;
  }

  @JsonProperty("latitude")
  public void setLatitude(@Nullable BigDecimal latitude) {
    this.latitude = latitude;
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
   * <= 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.
   * @return additionalImageLink
   */
  
  @Schema(name = "additional_image_link", example = "[\"https://scene.example.com/image/image_v2.jpg\",\"https://scene.example.com/image/image_v3.jpg\"]", description = "<= 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("additional_image_link")
  public JsonNullable<List<String>> getAdditionalImageLink() {
    return additionalImageLink;
  }

  public void setAdditionalImageLink(JsonNullable<List<String>> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
  }

  public CatalogsHotelAttributes aiDisclosures(List<@Valid CatalogsAiContentDisclosure> aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

  public CatalogsHotelAttributes addAiDisclosuresItem(CatalogsAiContentDisclosure aiDisclosuresItem) {
    if (this.aiDisclosures == null) {
      this.aiDisclosures = new ArrayList<>();
    }
    this.aiDisclosures.add(aiDisclosuresItem);
    return this;
  }

  /**
   * AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL.
   * @return aiDisclosures
   */
  @Valid 
  @Schema(name = "ai_disclosures", example = "[{\"url\":\"https://scene.example.com/image/image_v3.jpg\",\"disclosure\":[\"ai_modified\"]}]", description = "AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ai_disclosures")
  public List<@Valid CatalogsAiContentDisclosure> getAiDisclosures() {
    return aiDisclosures;
  }

  @JsonProperty("ai_disclosures")
  public void setAiDisclosures(List<@Valid CatalogsAiContentDisclosure> aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  public CatalogsHotelAttributes mainImage(@Nullable CatalogsHotelMainImage mainImage) {
    this.mainImage = mainImage;
    return this;
  }

  /**
   * The main hotel image
   * @return mainImage
   */
  @Valid 
  @Schema(name = "main_image", description = "The main hotel image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("main_image")
  public @Nullable CatalogsHotelMainImage getMainImage() {
    return mainImage;
  }

  @JsonProperty("main_image")
  public void setMainImage(@Nullable CatalogsHotelMainImage mainImage) {
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
        equalsNullable(this.basePrice, catalogsHotelAttributes.basePrice) &&
        equalsNullable(this.brand, catalogsHotelAttributes.brand) &&
        equalsNullable(this.category, catalogsHotelAttributes.category) &&
        equalsNullable(this.customLabel0, catalogsHotelAttributes.customLabel0) &&
        equalsNullable(this.customLabel1, catalogsHotelAttributes.customLabel1) &&
        equalsNullable(this.customLabel2, catalogsHotelAttributes.customLabel2) &&
        equalsNullable(this.customLabel3, catalogsHotelAttributes.customLabel3) &&
        equalsNullable(this.customLabel4, catalogsHotelAttributes.customLabel4) &&
        equalsNullable(this.description, catalogsHotelAttributes.description) &&
        Objects.equals(this.guestRatings, catalogsHotelAttributes.guestRatings) &&
        Objects.equals(this.latitude, catalogsHotelAttributes.latitude) &&
        equalsNullable(this.link, catalogsHotelAttributes.link) &&
        equalsNullable(this.longitude, catalogsHotelAttributes.longitude) &&
        equalsNullable(this.name, catalogsHotelAttributes.name) &&
        equalsNullable(this.neighborhood, catalogsHotelAttributes.neighborhood) &&
        equalsNullable(this.salePrice, catalogsHotelAttributes.salePrice) &&
        equalsNullable(this.additionalImageLink, catalogsHotelAttributes.additionalImageLink) &&
        Objects.equals(this.aiDisclosures, catalogsHotelAttributes.aiDisclosures) &&
        Objects.equals(this.mainImage, catalogsHotelAttributes.mainImage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, hashCodeNullable(basePrice), hashCodeNullable(brand), hashCodeNullable(category), hashCodeNullable(customLabel0), hashCodeNullable(customLabel1), hashCodeNullable(customLabel2), hashCodeNullable(customLabel3), hashCodeNullable(customLabel4), hashCodeNullable(description), guestRatings, latitude, hashCodeNullable(link), hashCodeNullable(longitude), hashCodeNullable(name), hashCodeNullable(neighborhood), hashCodeNullable(salePrice), hashCodeNullable(additionalImageLink), aiDisclosures, mainImage);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

