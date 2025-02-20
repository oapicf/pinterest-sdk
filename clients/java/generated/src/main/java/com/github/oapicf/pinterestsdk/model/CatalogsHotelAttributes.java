/*
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


package com.github.oapicf.pinterestsdk.model;

import java.util.Objects;
import com.github.oapicf.pinterestsdk.model.CatalogsHotelAddress;
import com.github.oapicf.pinterestsdk.model.CatalogsHotelAttributesAllOfMainImage;
import com.github.oapicf.pinterestsdk.model.CatalogsHotelGuestRatings;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.pinterestsdk.JSON;

/**
 * CatalogsHotelAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-05T02:01:32.024245558Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsHotelAttributes {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private BigDecimal latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private BigDecimal longitude;

  public static final String SERIALIZED_NAME_NEIGHBORHOOD = "neighborhood";
  @SerializedName(SERIALIZED_NAME_NEIGHBORHOOD)
  private List<String> neighborhood;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private CatalogsHotelAddress address;

  public static final String SERIALIZED_NAME_CUSTOM_LABEL0 = "custom_label_0";
  @SerializedName(SERIALIZED_NAME_CUSTOM_LABEL0)
  private String customLabel0;

  public static final String SERIALIZED_NAME_CUSTOM_LABEL1 = "custom_label_1";
  @SerializedName(SERIALIZED_NAME_CUSTOM_LABEL1)
  private String customLabel1;

  public static final String SERIALIZED_NAME_CUSTOM_LABEL2 = "custom_label_2";
  @SerializedName(SERIALIZED_NAME_CUSTOM_LABEL2)
  private String customLabel2;

  public static final String SERIALIZED_NAME_CUSTOM_LABEL3 = "custom_label_3";
  @SerializedName(SERIALIZED_NAME_CUSTOM_LABEL3)
  private String customLabel3;

  public static final String SERIALIZED_NAME_CUSTOM_LABEL4 = "custom_label_4";
  @SerializedName(SERIALIZED_NAME_CUSTOM_LABEL4)
  private String customLabel4;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_BASE_PRICE = "base_price";
  @SerializedName(SERIALIZED_NAME_BASE_PRICE)
  private String basePrice;

  public static final String SERIALIZED_NAME_SALE_PRICE = "sale_price";
  @SerializedName(SERIALIZED_NAME_SALE_PRICE)
  private String salePrice;

  public static final String SERIALIZED_NAME_GUEST_RATINGS = "guest_ratings";
  @SerializedName(SERIALIZED_NAME_GUEST_RATINGS)
  private CatalogsHotelGuestRatings guestRatings;

  public static final String SERIALIZED_NAME_MAIN_IMAGE = "main_image";
  @SerializedName(SERIALIZED_NAME_MAIN_IMAGE)
  private CatalogsHotelAttributesAllOfMainImage mainImage;

  public static final String SERIALIZED_NAME_ADDITIONAL_IMAGE_LINK = "additional_image_link";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_IMAGE_LINK)
  private List<String> additionalImageLink;

  public CatalogsHotelAttributes() {
  }

  public CatalogsHotelAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The hotel&#39;s name.
   * @return name
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
  @javax.annotation.Nullable
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
   * &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.&lt;/p&gt;
   * @return additionalImageLink
   */
  @javax.annotation.Nullable
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, link, description, brand, latitude, longitude, neighborhood, address, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, category, basePrice, salePrice, guestRatings, mainImage, additionalImageLink);
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("name");
    openapiFields.add("link");
    openapiFields.add("description");
    openapiFields.add("brand");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("neighborhood");
    openapiFields.add("address");
    openapiFields.add("custom_label_0");
    openapiFields.add("custom_label_1");
    openapiFields.add("custom_label_2");
    openapiFields.add("custom_label_3");
    openapiFields.add("custom_label_4");
    openapiFields.add("category");
    openapiFields.add("base_price");
    openapiFields.add("sale_price");
    openapiFields.add("guest_ratings");
    openapiFields.add("main_image");
    openapiFields.add("additional_image_link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CatalogsHotelAttributes
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CatalogsHotelAttributes.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CatalogsHotelAttributes is not found in the empty JSON string", CatalogsHotelAttributes.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CatalogsHotelAttributes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CatalogsHotelAttributes` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("neighborhood") != null && !jsonObj.get("neighborhood").isJsonNull() && !jsonObj.get("neighborhood").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `neighborhood` to be an array in the JSON string but got `%s`", jsonObj.get("neighborhood").toString()));
      }
      // validate the optional field `address`
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull()) {
        CatalogsHotelAddress.validateJsonElement(jsonObj.get("address"));
      }
      if ((jsonObj.get("custom_label_0") != null && !jsonObj.get("custom_label_0").isJsonNull()) && !jsonObj.get("custom_label_0").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_label_0` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_label_0").toString()));
      }
      if ((jsonObj.get("custom_label_1") != null && !jsonObj.get("custom_label_1").isJsonNull()) && !jsonObj.get("custom_label_1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_label_1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_label_1").toString()));
      }
      if ((jsonObj.get("custom_label_2") != null && !jsonObj.get("custom_label_2").isJsonNull()) && !jsonObj.get("custom_label_2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_label_2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_label_2").toString()));
      }
      if ((jsonObj.get("custom_label_3") != null && !jsonObj.get("custom_label_3").isJsonNull()) && !jsonObj.get("custom_label_3").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_label_3` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_label_3").toString()));
      }
      if ((jsonObj.get("custom_label_4") != null && !jsonObj.get("custom_label_4").isJsonNull()) && !jsonObj.get("custom_label_4").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_label_4` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_label_4").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("base_price") != null && !jsonObj.get("base_price").isJsonNull()) && !jsonObj.get("base_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `base_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("base_price").toString()));
      }
      if ((jsonObj.get("sale_price") != null && !jsonObj.get("sale_price").isJsonNull()) && !jsonObj.get("sale_price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sale_price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sale_price").toString()));
      }
      // validate the optional field `guest_ratings`
      if (jsonObj.get("guest_ratings") != null && !jsonObj.get("guest_ratings").isJsonNull()) {
        CatalogsHotelGuestRatings.validateJsonElement(jsonObj.get("guest_ratings"));
      }
      // validate the optional field `main_image`
      if (jsonObj.get("main_image") != null && !jsonObj.get("main_image").isJsonNull()) {
        CatalogsHotelAttributesAllOfMainImage.validateJsonElement(jsonObj.get("main_image"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("additional_image_link") != null && !jsonObj.get("additional_image_link").isJsonNull() && !jsonObj.get("additional_image_link").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `additional_image_link` to be an array in the JSON string but got `%s`", jsonObj.get("additional_image_link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CatalogsHotelAttributes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CatalogsHotelAttributes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CatalogsHotelAttributes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CatalogsHotelAttributes.class));

       return (TypeAdapter<T>) new TypeAdapter<CatalogsHotelAttributes>() {
           @Override
           public void write(JsonWriter out, CatalogsHotelAttributes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CatalogsHotelAttributes read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CatalogsHotelAttributes given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CatalogsHotelAttributes
   * @throws IOException if the JSON string is invalid with respect to CatalogsHotelAttributes
   */
  public static CatalogsHotelAttributes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CatalogsHotelAttributes.class);
  }

  /**
   * Convert an instance of CatalogsHotelAttributes to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

