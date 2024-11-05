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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdatableItemAttributes
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdatableItemAttributes {

  private JsonNullable<String> adLink = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> adult = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> ageGroup = JsonNullable.<String>undefined();

  private String availability;

  private JsonNullable<BigDecimal> averageReviewRating = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<String> brand = JsonNullable.<String>undefined();

  @Deprecated
  private JsonNullable<Boolean> checkoutEnabled = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> color = JsonNullable.<String>undefined();

  private JsonNullable<String> condition = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel0 = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel1 = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel2 = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel3 = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel4 = JsonNullable.<String>undefined();

  private String description;

  private JsonNullable<Boolean> freeShippingLabel = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> freeShippingLimit = JsonNullable.<String>undefined();

  private JsonNullable<String> gender = JsonNullable.<String>undefined();

  private JsonNullable<String> googleProductCategory = JsonNullable.<String>undefined();

  private JsonNullable<Integer> gtin = JsonNullable.<Integer>undefined();

  @Deprecated
  private String id;

  private JsonNullable<String> itemGroupId = JsonNullable.<String>undefined();

  private JsonNullable<Long> lastUpdatedTime = JsonNullable.<Long>undefined();

  private String link;

  private JsonNullable<String> material = JsonNullable.<String>undefined();

  private JsonNullable<String> minAdPrice = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileLink = JsonNullable.<String>undefined();

  private JsonNullable<String> mpn = JsonNullable.<String>undefined();

  private JsonNullable<Integer> numberOfRatings = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> numberOfReviews = JsonNullable.<Integer>undefined();

  private JsonNullable<String> pattern = JsonNullable.<String>undefined();

  private String price;

  private JsonNullable<String> productType = JsonNullable.<String>undefined();

  private JsonNullable<String> salePrice = JsonNullable.<String>undefined();

  private JsonNullable<String> shipping = JsonNullable.<String>undefined();

  private JsonNullable<String> shippingHeight = JsonNullable.<String>undefined();

  private JsonNullable<String> shippingWeight = JsonNullable.<String>undefined();

  private JsonNullable<String> shippingWidth = JsonNullable.<String>undefined();

  private JsonNullable<String> size = JsonNullable.<String>undefined();

  private JsonNullable<String> sizeSystem = JsonNullable.<String>undefined();

  private JsonNullable<String> sizeType = JsonNullable.<String>undefined();

  private JsonNullable<String> tax = JsonNullable.<String>undefined();

  private String title;

  @Valid
  private JsonNullable<List<String>> variantNames = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> variantValues = JsonNullable.<List<String>>undefined();

  public UpdatableItemAttributes adLink(String adLink) {
    this.adLink = JsonNullable.of(adLink);
    return this;
  }

  /**
   * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
   * @return adLink
   */
  
  @Schema(name = "ad_link", example = "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest", description = "Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_link")
  public JsonNullable<String> getAdLink() {
    return adLink;
  }

  public void setAdLink(JsonNullable<String> adLink) {
    this.adLink = adLink;
  }

  public UpdatableItemAttributes adult(Boolean adult) {
    this.adult = JsonNullable.of(adult);
    return this;
  }

  /**
   * Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
   * @return adult
   */
  
  @Schema(name = "adult", example = "true", description = "Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adult")
  public JsonNullable<Boolean> getAdult() {
    return adult;
  }

  public void setAdult(JsonNullable<Boolean> adult) {
    this.adult = adult;
  }

  public UpdatableItemAttributes ageGroup(String ageGroup) {
    this.ageGroup = JsonNullable.of(ageGroup);
    return this;
  }

  /**
   * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
   * @return ageGroup
   */
  
  @Schema(name = "age_group", example = "newborn", description = "The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age_group")
  public JsonNullable<String> getAgeGroup() {
    return ageGroup;
  }

  public void setAgeGroup(JsonNullable<String> ageGroup) {
    this.ageGroup = ageGroup;
  }

  public UpdatableItemAttributes availability(String availability) {
    this.availability = availability;
    return this;
  }

  /**
   * The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.
   * @return availability
   */
  
  @Schema(name = "availability", example = "in stock", description = "The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availability")
  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }

  public UpdatableItemAttributes averageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = JsonNullable.of(averageReviewRating);
    return this;
  }

  /**
   * Average reviews for the item. Can be a number from 1-5.
   * @return averageReviewRating
   */
  @Valid 
  @Schema(name = "average_review_rating", example = "5", description = "Average reviews for the item. Can be a number from 1-5.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("average_review_rating")
  public JsonNullable<BigDecimal> getAverageReviewRating() {
    return averageReviewRating;
  }

  public void setAverageReviewRating(JsonNullable<BigDecimal> averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
  }

  public UpdatableItemAttributes brand(String brand) {
    this.brand = JsonNullable.of(brand);
    return this;
  }

  /**
   * The brand of the product.
   * @return brand
   */
  
  @Schema(name = "brand", example = "Josie’s Denim", description = "The brand of the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brand")
  public JsonNullable<String> getBrand() {
    return brand;
  }

  public void setBrand(JsonNullable<String> brand) {
    this.brand = brand;
  }

  public UpdatableItemAttributes checkoutEnabled(Boolean checkoutEnabled) {
    this.checkoutEnabled = JsonNullable.of(checkoutEnabled);
    return this;
  }

  /**
   * This attribute is not supported anymore.
   * @return checkoutEnabled
   * @deprecated
   */
  
  @Schema(name = "checkout_enabled", example = "false", description = "This attribute is not supported anymore.", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("checkout_enabled")
  @Deprecated
  public JsonNullable<Boolean> getCheckoutEnabled() {
    return checkoutEnabled;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setCheckoutEnabled(JsonNullable<Boolean> checkoutEnabled) {
    this.checkoutEnabled = checkoutEnabled;
  }

  public UpdatableItemAttributes color(String color) {
    this.color = JsonNullable.of(color);
    return this;
  }

  /**
   * The primary color of the product.
   * @return color
   */
  
  @Schema(name = "color", example = "blue", description = "The primary color of the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public JsonNullable<String> getColor() {
    return color;
  }

  public void setColor(JsonNullable<String> color) {
    this.color = color;
  }

  public UpdatableItemAttributes condition(String condition) {
    this.condition = JsonNullable.of(condition);
    return this;
  }

  /**
   * The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
   * @return condition
   */
  
  @Schema(name = "condition", example = "new", description = "The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("condition")
  public JsonNullable<String> getCondition() {
    return condition;
  }

  public void setCondition(JsonNullable<String> condition) {
    this.condition = condition;
  }

  public UpdatableItemAttributes customLabel0(String customLabel0) {
    this.customLabel0 = JsonNullable.of(customLabel0);
    return this;
  }

  /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   * @return customLabel0
   */
  
  @Schema(name = "custom_label_0", example = "Best sellers", description = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_0")
  public JsonNullable<String> getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(JsonNullable<String> customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public UpdatableItemAttributes customLabel1(String customLabel1) {
    this.customLabel1 = JsonNullable.of(customLabel1);
    return this;
  }

  /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   * @return customLabel1
   */
  
  @Schema(name = "custom_label_1", example = "Summer promotion", description = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_1")
  public JsonNullable<String> getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(JsonNullable<String> customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public UpdatableItemAttributes customLabel2(String customLabel2) {
    this.customLabel2 = JsonNullable.of(customLabel2);
    return this;
  }

  /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   * @return customLabel2
   */
  
  @Schema(name = "custom_label_2", example = "Winter sales", description = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_2")
  public JsonNullable<String> getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(JsonNullable<String> customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public UpdatableItemAttributes customLabel3(String customLabel3) {
    this.customLabel3 = JsonNullable.of(customLabel3);
    return this;
  }

  /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   * @return customLabel3
   */
  
  @Schema(name = "custom_label_3", example = "Woman dress", description = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_3")
  public JsonNullable<String> getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(JsonNullable<String> customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public UpdatableItemAttributes customLabel4(String customLabel4) {
    this.customLabel4 = JsonNullable.of(customLabel4);
    return this;
  }

  /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   * @return customLabel4
   */
  
  @Schema(name = "custom_label_4", example = "Man hat", description = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_4")
  public JsonNullable<String> getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(JsonNullable<String> customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public UpdatableItemAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p><= 10000 characters</p> <p>The description of the product.</p>
   * @return description
   */
  
  @Schema(name = "description", example = "Casual fit denim shirt made with the finest quality Japanese denim.", description = "<p><= 10000 characters</p> <p>The description of the product.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdatableItemAttributes freeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = JsonNullable.of(freeShippingLabel);
    return this;
  }

  /**
   * The item is free to ship.
   * @return freeShippingLabel
   */
  
  @Schema(name = "free_shipping_label", example = "true", description = "The item is free to ship.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("free_shipping_label")
  public JsonNullable<Boolean> getFreeShippingLabel() {
    return freeShippingLabel;
  }

  public void setFreeShippingLabel(JsonNullable<Boolean> freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
  }

  public UpdatableItemAttributes freeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = JsonNullable.of(freeShippingLimit);
    return this;
  }

  /**
   * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
   * @return freeShippingLimit
   */
  
  @Schema(name = "free_shipping_limit", example = "35 USD", description = "The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("free_shipping_limit")
  public JsonNullable<String> getFreeShippingLimit() {
    return freeShippingLimit;
  }

  public void setFreeShippingLimit(JsonNullable<String> freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
  }

  public UpdatableItemAttributes gender(String gender) {
    this.gender = JsonNullable.of(gender);
    return this;
  }

  /**
   * The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.
   * @return gender
   */
  
  @Schema(name = "gender", example = "unisex", description = "The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public JsonNullable<String> getGender() {
    return gender;
  }

  public void setGender(JsonNullable<String> gender) {
    this.gender = gender;
  }

  public UpdatableItemAttributes googleProductCategory(String googleProductCategory) {
    this.googleProductCategory = JsonNullable.of(googleProductCategory);
    return this;
  }

  /**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
   * @return googleProductCategory
   */
  
  @Schema(name = "google_product_category", example = "Apparel & Accessories > Clothing > Shirts & Tops", description = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("google_product_category")
  public JsonNullable<String> getGoogleProductCategory() {
    return googleProductCategory;
  }

  public void setGoogleProductCategory(JsonNullable<String> googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

  public UpdatableItemAttributes gtin(Integer gtin) {
    this.gtin = JsonNullable.of(gtin);
    return this;
  }

  /**
   * The unique universal product identifier.
   * @return gtin
   */
  
  @Schema(name = "gtin", example = "3234567890126", description = "The unique universal product identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gtin")
  public JsonNullable<Integer> getGtin() {
    return gtin;
  }

  public void setGtin(JsonNullable<Integer> gtin) {
    this.gtin = gtin;
  }

  public UpdatableItemAttributes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
   * @return id
   * @deprecated
   */
  
  @Schema(name = "id", example = "DS0294-L", description = "<p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  @Deprecated
  public String getId() {
    return id;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setId(String id) {
    this.id = id;
  }

  public UpdatableItemAttributes itemGroupId(String itemGroupId) {
    this.itemGroupId = JsonNullable.of(itemGroupId);
    return this;
  }

  /**
   * <p><= 127 characters</p> <p>The parent ID of the product.</p>
   * @return itemGroupId
   */
  
  @Schema(name = "item_group_id", example = "DS0294", description = "<p><= 127 characters</p> <p>The parent ID of the product.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_group_id")
  public JsonNullable<String> getItemGroupId() {
    return itemGroupId;
  }

  public void setItemGroupId(JsonNullable<String> itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  public UpdatableItemAttributes lastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = JsonNullable.of(lastUpdatedTime);
    return this;
  }

  /**
   * The millisecond timestamp when the item was lastly modified by the merchant.
   * @return lastUpdatedTime
   */
  
  @Schema(name = "last_updated_time", example = "1641483432072", description = "The millisecond timestamp when the item was lastly modified by the merchant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_updated_time")
  public JsonNullable<Long> getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(JsonNullable<Long> lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public UpdatableItemAttributes link(String link) {
    this.link = link;
    return this;
  }

  /**
   * <p><= 511 characters</p> <p>The landing page for the product.</p>
   * @return link
   */
  
  @Schema(name = "link", example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294", description = "<p><= 511 characters</p> <p>The landing page for the product.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public UpdatableItemAttributes material(String material) {
    this.material = JsonNullable.of(material);
    return this;
  }

  /**
   * The material used to make the product.
   * @return material
   */
  
  @Schema(name = "material", example = "cotton", description = "The material used to make the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("material")
  public JsonNullable<String> getMaterial() {
    return material;
  }

  public void setMaterial(JsonNullable<String> material) {
    this.material = material;
  }

  public UpdatableItemAttributes minAdPrice(String minAdPrice) {
    this.minAdPrice = JsonNullable.of(minAdPrice);
    return this;
  }

  /**
   * The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
   * @return minAdPrice
   */
  
  @Schema(name = "min_ad_price", example = "19.99 USD", description = "The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_ad_price")
  public JsonNullable<String> getMinAdPrice() {
    return minAdPrice;
  }

  public void setMinAdPrice(JsonNullable<String> minAdPrice) {
    this.minAdPrice = minAdPrice;
  }

  public UpdatableItemAttributes mobileLink(String mobileLink) {
    this.mobileLink = JsonNullable.of(mobileLink);
    return this;
  }

  /**
   * The mobile-optimized version of your landing page. Must begin with http:// or https://.
   * @return mobileLink
   */
  
  @Schema(name = "mobile_link", example = "https://m.example.com/cat/womens-clothing/denim-shirt-0294", description = "The mobile-optimized version of your landing page. Must begin with http:// or https://.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobile_link")
  public JsonNullable<String> getMobileLink() {
    return mobileLink;
  }

  public void setMobileLink(JsonNullable<String> mobileLink) {
    this.mobileLink = mobileLink;
  }

  public UpdatableItemAttributes mpn(String mpn) {
    this.mpn = JsonNullable.of(mpn);
    return this;
  }

  /**
   * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
   * @return mpn
   */
  
  @Schema(name = "mpn", example = "PI12345NTEREST", description = "Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mpn")
  public JsonNullable<String> getMpn() {
    return mpn;
  }

  public void setMpn(JsonNullable<String> mpn) {
    this.mpn = mpn;
  }

  public UpdatableItemAttributes numberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = JsonNullable.of(numberOfRatings);
    return this;
  }

  /**
   * The number of ratings for the item.
   * @return numberOfRatings
   */
  
  @Schema(name = "number_of_ratings", example = "10", description = "The number of ratings for the item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number_of_ratings")
  public JsonNullable<Integer> getNumberOfRatings() {
    return numberOfRatings;
  }

  public void setNumberOfRatings(JsonNullable<Integer> numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
  }

  public UpdatableItemAttributes numberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = JsonNullable.of(numberOfReviews);
    return this;
  }

  /**
   * The number of reviews available for the item.
   * @return numberOfReviews
   */
  
  @Schema(name = "number_of_reviews", example = "10", description = "The number of reviews available for the item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number_of_reviews")
  public JsonNullable<Integer> getNumberOfReviews() {
    return numberOfReviews;
  }

  public void setNumberOfReviews(JsonNullable<Integer> numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
  }

  public UpdatableItemAttributes pattern(String pattern) {
    this.pattern = JsonNullable.of(pattern);
    return this;
  }

  /**
   * The description of the pattern used for the product.
   * @return pattern
   */
  
  @Schema(name = "pattern", example = "plaid", description = "The description of the pattern used for the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pattern")
  public JsonNullable<String> getPattern() {
    return pattern;
  }

  public void setPattern(JsonNullable<String> pattern) {
    this.pattern = pattern;
  }

  public UpdatableItemAttributes price(String price) {
    this.price = price;
    return this;
  }

  /**
   * The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
   * @return price
   */
  
  @Schema(name = "price", example = "24.99 USD", description = "The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public UpdatableItemAttributes productType(String productType) {
    this.productType = JsonNullable.of(productType);
    return this;
  }

  /**
   * <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
   * @return productType
   */
  
  @Schema(name = "product_type", example = "Clothing > Women’s > Shirts > Denim", description = "<p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_type")
  public JsonNullable<String> getProductType() {
    return productType;
  }

  public void setProductType(JsonNullable<String> productType) {
    this.productType = productType;
  }

  public UpdatableItemAttributes salePrice(String salePrice) {
    this.salePrice = JsonNullable.of(salePrice);
    return this;
  }

  /**
   * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
   * @return salePrice
   */
  
  @Schema(name = "sale_price", example = "14.99 USD", description = "The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sale_price")
  public JsonNullable<String> getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(JsonNullable<String> salePrice) {
    this.salePrice = salePrice;
  }

  public UpdatableItemAttributes shipping(String shipping) {
    this.shipping = JsonNullable.of(shipping);
    return this;
  }

  /**
   * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
   * @return shipping
   */
  
  @Schema(name = "shipping", example = "US:CA:Ground:0 USD", description = "Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipping")
  public JsonNullable<String> getShipping() {
    return shipping;
  }

  public void setShipping(JsonNullable<String> shipping) {
    this.shipping = shipping;
  }

  public UpdatableItemAttributes shippingHeight(String shippingHeight) {
    this.shippingHeight = JsonNullable.of(shippingHeight);
    return this;
  }

  /**
   * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingHeight
   */
  
  @Schema(name = "shipping_height", example = "12 in", description = "The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipping_height")
  public JsonNullable<String> getShippingHeight() {
    return shippingHeight;
  }

  public void setShippingHeight(JsonNullable<String> shippingHeight) {
    this.shippingHeight = shippingHeight;
  }

  public UpdatableItemAttributes shippingWeight(String shippingWeight) {
    this.shippingWeight = JsonNullable.of(shippingWeight);
    return this;
  }

  /**
   * The weight of the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingWeight
   */
  
  @Schema(name = "shipping_weight", example = "3 kg", description = "The weight of the product. Ensure there is a space between the numeric string and the metric.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipping_weight")
  public JsonNullable<String> getShippingWeight() {
    return shippingWeight;
  }

  public void setShippingWeight(JsonNullable<String> shippingWeight) {
    this.shippingWeight = shippingWeight;
  }

  public UpdatableItemAttributes shippingWidth(String shippingWidth) {
    this.shippingWidth = JsonNullable.of(shippingWidth);
    return this;
  }

  /**
   * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingWidth
   */
  
  @Schema(name = "shipping_width", example = "16 in", description = "The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipping_width")
  public JsonNullable<String> getShippingWidth() {
    return shippingWidth;
  }

  public void setShippingWidth(JsonNullable<String> shippingWidth) {
    this.shippingWidth = shippingWidth;
  }

  public UpdatableItemAttributes size(String size) {
    this.size = JsonNullable.of(size);
    return this;
  }

  /**
   * The size of the product.
   * @return size
   */
  
  @Schema(name = "size", example = "M", description = "The size of the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public JsonNullable<String> getSize() {
    return size;
  }

  public void setSize(JsonNullable<String> size) {
    this.size = size;
  }

  public UpdatableItemAttributes sizeSystem(String sizeSystem) {
    this.sizeSystem = JsonNullable.of(sizeSystem);
    return this;
  }

  /**
   * Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.
   * @return sizeSystem
   */
  
  @Schema(name = "size_system", example = "US", description = "Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size_system")
  public JsonNullable<String> getSizeSystem() {
    return sizeSystem;
  }

  public void setSizeSystem(JsonNullable<String> sizeSystem) {
    this.sizeSystem = sizeSystem;
  }

  public UpdatableItemAttributes sizeType(String sizeType) {
    this.sizeType = JsonNullable.of(sizeType);
    return this;
  }

  /**
   * Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.
   * @return sizeType
   */
  
  @Schema(name = "size_type", example = "regular", description = "Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size_type")
  public JsonNullable<String> getSizeType() {
    return sizeType;
  }

  public void setSizeType(JsonNullable<String> sizeType) {
    this.sizeType = sizeType;
  }

  public UpdatableItemAttributes tax(String tax) {
    this.tax = JsonNullable.of(tax);
    return this;
  }

  /**
   * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
   * @return tax
   */
  
  @Schema(name = "tax", example = "US:1025433:6.00:y", description = "Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tax")
  public JsonNullable<String> getTax() {
    return tax;
  }

  public void setTax(JsonNullable<String> tax) {
    this.tax = tax;
  }

  public UpdatableItemAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p><= 500 characters</p> <p>The name of the product.</p>
   * @return title
   */
  
  @Schema(name = "title", example = "Women’s denim shirt, large", description = "<p><= 500 characters</p> <p>The name of the product.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UpdatableItemAttributes variantNames(List<String> variantNames) {
    this.variantNames = JsonNullable.of(variantNames);
    return this;
  }

  public UpdatableItemAttributes addVariantNamesItem(String variantNamesItem) {
    if (this.variantNames == null || !this.variantNames.isPresent()) {
      this.variantNames = JsonNullable.of(new ArrayList<>());
    }
    this.variantNames.get().add(variantNamesItem);
    return this;
  }

  /**
   * Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
   * @return variantNames
   */
  
  @Schema(name = "variant_names", example = "[\"Color\",\"Size\"]", description = "Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variant_names")
  public JsonNullable<List<String>> getVariantNames() {
    return variantNames;
  }

  public void setVariantNames(JsonNullable<List<String>> variantNames) {
    this.variantNames = variantNames;
  }

  public UpdatableItemAttributes variantValues(List<String> variantValues) {
    this.variantValues = JsonNullable.of(variantValues);
    return this;
  }

  public UpdatableItemAttributes addVariantValuesItem(String variantValuesItem) {
    if (this.variantValues == null || !this.variantValues.isPresent()) {
      this.variantValues = JsonNullable.of(new ArrayList<>());
    }
    this.variantValues.get().add(variantValuesItem);
    return this;
  }

  /**
   * Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
   * @return variantValues
   */
  
  @Schema(name = "variant_values", example = "[\"Red\",\"Small\"]", description = "Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variant_values")
  public JsonNullable<List<String>> getVariantValues() {
    return variantValues;
  }

  public void setVariantValues(JsonNullable<List<String>> variantValues) {
    this.variantValues = variantValues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatableItemAttributes updatableItemAttributes = (UpdatableItemAttributes) o;
    return equalsNullable(this.adLink, updatableItemAttributes.adLink) &&
        equalsNullable(this.adult, updatableItemAttributes.adult) &&
        equalsNullable(this.ageGroup, updatableItemAttributes.ageGroup) &&
        Objects.equals(this.availability, updatableItemAttributes.availability) &&
        equalsNullable(this.averageReviewRating, updatableItemAttributes.averageReviewRating) &&
        equalsNullable(this.brand, updatableItemAttributes.brand) &&
        equalsNullable(this.checkoutEnabled, updatableItemAttributes.checkoutEnabled) &&
        equalsNullable(this.color, updatableItemAttributes.color) &&
        equalsNullable(this.condition, updatableItemAttributes.condition) &&
        equalsNullable(this.customLabel0, updatableItemAttributes.customLabel0) &&
        equalsNullable(this.customLabel1, updatableItemAttributes.customLabel1) &&
        equalsNullable(this.customLabel2, updatableItemAttributes.customLabel2) &&
        equalsNullable(this.customLabel3, updatableItemAttributes.customLabel3) &&
        equalsNullable(this.customLabel4, updatableItemAttributes.customLabel4) &&
        Objects.equals(this.description, updatableItemAttributes.description) &&
        equalsNullable(this.freeShippingLabel, updatableItemAttributes.freeShippingLabel) &&
        equalsNullable(this.freeShippingLimit, updatableItemAttributes.freeShippingLimit) &&
        equalsNullable(this.gender, updatableItemAttributes.gender) &&
        equalsNullable(this.googleProductCategory, updatableItemAttributes.googleProductCategory) &&
        equalsNullable(this.gtin, updatableItemAttributes.gtin) &&
        Objects.equals(this.id, updatableItemAttributes.id) &&
        equalsNullable(this.itemGroupId, updatableItemAttributes.itemGroupId) &&
        equalsNullable(this.lastUpdatedTime, updatableItemAttributes.lastUpdatedTime) &&
        Objects.equals(this.link, updatableItemAttributes.link) &&
        equalsNullable(this.material, updatableItemAttributes.material) &&
        equalsNullable(this.minAdPrice, updatableItemAttributes.minAdPrice) &&
        equalsNullable(this.mobileLink, updatableItemAttributes.mobileLink) &&
        equalsNullable(this.mpn, updatableItemAttributes.mpn) &&
        equalsNullable(this.numberOfRatings, updatableItemAttributes.numberOfRatings) &&
        equalsNullable(this.numberOfReviews, updatableItemAttributes.numberOfReviews) &&
        equalsNullable(this.pattern, updatableItemAttributes.pattern) &&
        Objects.equals(this.price, updatableItemAttributes.price) &&
        equalsNullable(this.productType, updatableItemAttributes.productType) &&
        equalsNullable(this.salePrice, updatableItemAttributes.salePrice) &&
        equalsNullable(this.shipping, updatableItemAttributes.shipping) &&
        equalsNullable(this.shippingHeight, updatableItemAttributes.shippingHeight) &&
        equalsNullable(this.shippingWeight, updatableItemAttributes.shippingWeight) &&
        equalsNullable(this.shippingWidth, updatableItemAttributes.shippingWidth) &&
        equalsNullable(this.size, updatableItemAttributes.size) &&
        equalsNullable(this.sizeSystem, updatableItemAttributes.sizeSystem) &&
        equalsNullable(this.sizeType, updatableItemAttributes.sizeType) &&
        equalsNullable(this.tax, updatableItemAttributes.tax) &&
        Objects.equals(this.title, updatableItemAttributes.title) &&
        equalsNullable(this.variantNames, updatableItemAttributes.variantNames) &&
        equalsNullable(this.variantValues, updatableItemAttributes.variantValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(adLink), hashCodeNullable(adult), hashCodeNullable(ageGroup), availability, hashCodeNullable(averageReviewRating), hashCodeNullable(brand), hashCodeNullable(checkoutEnabled), hashCodeNullable(color), hashCodeNullable(condition), hashCodeNullable(customLabel0), hashCodeNullable(customLabel1), hashCodeNullable(customLabel2), hashCodeNullable(customLabel3), hashCodeNullable(customLabel4), description, hashCodeNullable(freeShippingLabel), hashCodeNullable(freeShippingLimit), hashCodeNullable(gender), hashCodeNullable(googleProductCategory), hashCodeNullable(gtin), id, hashCodeNullable(itemGroupId), hashCodeNullable(lastUpdatedTime), link, hashCodeNullable(material), hashCodeNullable(minAdPrice), hashCodeNullable(mobileLink), hashCodeNullable(mpn), hashCodeNullable(numberOfRatings), hashCodeNullable(numberOfReviews), hashCodeNullable(pattern), price, hashCodeNullable(productType), hashCodeNullable(salePrice), hashCodeNullable(shipping), hashCodeNullable(shippingHeight), hashCodeNullable(shippingWeight), hashCodeNullable(shippingWidth), hashCodeNullable(size), hashCodeNullable(sizeSystem), hashCodeNullable(sizeType), hashCodeNullable(tax), title, hashCodeNullable(variantNames), hashCodeNullable(variantValues));
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
    sb.append("class UpdatableItemAttributes {\n");
    sb.append("    adLink: ").append(toIndentedString(adLink)).append("\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    ageGroup: ").append(toIndentedString(ageGroup)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    averageReviewRating: ").append(toIndentedString(averageReviewRating)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    checkoutEnabled: ").append(toIndentedString(checkoutEnabled)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    customLabel0: ").append(toIndentedString(customLabel0)).append("\n");
    sb.append("    customLabel1: ").append(toIndentedString(customLabel1)).append("\n");
    sb.append("    customLabel2: ").append(toIndentedString(customLabel2)).append("\n");
    sb.append("    customLabel3: ").append(toIndentedString(customLabel3)).append("\n");
    sb.append("    customLabel4: ").append(toIndentedString(customLabel4)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    freeShippingLabel: ").append(toIndentedString(freeShippingLabel)).append("\n");
    sb.append("    freeShippingLimit: ").append(toIndentedString(freeShippingLimit)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    googleProductCategory: ").append(toIndentedString(googleProductCategory)).append("\n");
    sb.append("    gtin: ").append(toIndentedString(gtin)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemGroupId: ").append(toIndentedString(itemGroupId)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    material: ").append(toIndentedString(material)).append("\n");
    sb.append("    minAdPrice: ").append(toIndentedString(minAdPrice)).append("\n");
    sb.append("    mobileLink: ").append(toIndentedString(mobileLink)).append("\n");
    sb.append("    mpn: ").append(toIndentedString(mpn)).append("\n");
    sb.append("    numberOfRatings: ").append(toIndentedString(numberOfRatings)).append("\n");
    sb.append("    numberOfReviews: ").append(toIndentedString(numberOfReviews)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    shippingHeight: ").append(toIndentedString(shippingHeight)).append("\n");
    sb.append("    shippingWeight: ").append(toIndentedString(shippingWeight)).append("\n");
    sb.append("    shippingWidth: ").append(toIndentedString(shippingWidth)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeSystem: ").append(toIndentedString(sizeSystem)).append("\n");
    sb.append("    sizeType: ").append(toIndentedString(sizeType)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    variantNames: ").append(toIndentedString(variantNames)).append("\n");
    sb.append("    variantValues: ").append(toIndentedString(variantValues)).append("\n");
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

