package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdatableItemAttributes  {
  
  @ApiModelProperty(example = "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest", value = "Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.")
 /**
   * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
  **/
  private String adLink;

  @ApiModelProperty(example = "true", value = "Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.")
 /**
   * Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
  **/
  private Boolean adult;

  @ApiModelProperty(example = "newborn", value = "The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.")
 /**
   * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
  **/
  private String ageGroup;

  @ApiModelProperty(example = "in stock", value = "The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.")
 /**
   * The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
  **/
  private String availability;

  @ApiModelProperty(example = "5", value = "Average reviews for the item. Can be a number from 1-5.")
  @Valid
 /**
   * Average reviews for the item. Can be a number from 1-5.
  **/
  private BigDecimal averageReviewRating;

  @ApiModelProperty(example = "Josie’s Denim", value = "The brand of the product.")
 /**
   * The brand of the product.
  **/
  private String brand;

  @ApiModelProperty(example = "false", value = "This attribute is not supported anymore.")
 /**
   * This attribute is not supported anymore.
  **/
  private Boolean checkoutEnabled;

  @ApiModelProperty(example = "blue", value = "The primary color of the product.")
 /**
   * The primary color of the product.
  **/
  private String color;

  @ApiModelProperty(example = "new", value = "The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.")
 /**
   * The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
  **/
  private String condition;

  @ApiModelProperty(example = "Best sellers", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
 /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  **/
  private String customLabel0;

  @ApiModelProperty(example = "Summer promotion", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
 /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  **/
  private String customLabel1;

  @ApiModelProperty(example = "Winter sales", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
 /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  **/
  private String customLabel2;

  @ApiModelProperty(example = "Woman dress", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
 /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  **/
  private String customLabel3;

  @ApiModelProperty(example = "Man hat", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
 /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  **/
  private String customLabel4;

  @ApiModelProperty(example = "Casual fit denim shirt made with the finest quality Japanese denim.", value = "<p><= 10000 characters</p> <p>The description of the product.</p>")
 /**
   * <p><= 10000 characters</p> <p>The description of the product.</p>
  **/
  private String description;

  @ApiModelProperty(example = "true", value = "The item is free to ship.")
 /**
   * The item is free to ship.
  **/
  private Boolean freeShippingLabel;

  @ApiModelProperty(example = "35 USD", value = "The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.")
 /**
   * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
  **/
  private String freeShippingLimit;

  @ApiModelProperty(example = "unisex", value = "The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.")
 /**
   * The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
  **/
  private String gender;

  @ApiModelProperty(example = "Apparel & Accessories > Clothing > Shirts & Tops", value = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.")
 /**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  **/
  private String googleProductCategory;

  @ApiModelProperty(example = "3234567890126", value = "The unique universal product identifier.")
 /**
   * The unique universal product identifier.
  **/
  private Integer gtin;

  @ApiModelProperty(example = "DS0294-L", value = "<p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>")
 /**
   * <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
  **/
  private String id;

  @ApiModelProperty(example = "DS0294", value = "<p><= 127 characters</p> <p>The parent ID of the product.</p>")
 /**
   * <p><= 127 characters</p> <p>The parent ID of the product.</p>
  **/
  private String itemGroupId;

  @ApiModelProperty(example = "1641483432072", value = "The millisecond timestamp when the item was lastly modified by the merchant.")
 /**
   * The millisecond timestamp when the item was lastly modified by the merchant.
  **/
  private Long lastUpdatedTime;

  @ApiModelProperty(example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294", value = "<p><= 511 characters</p> <p>The landing page for the product.</p>")
 /**
   * <p><= 511 characters</p> <p>The landing page for the product.</p>
  **/
  private String link;

  @ApiModelProperty(example = "cotton", value = "The material used to make the product.")
 /**
   * The material used to make the product.
  **/
  private String material;

  @ApiModelProperty(example = "19.99 USD", value = "The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.")
 /**
   * The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
  **/
  private String minAdPrice;

  @ApiModelProperty(example = "https://m.example.com/cat/womens-clothing/denim-shirt-0294", value = "The mobile-optimized version of your landing page. Must begin with http:// or https://.")
 /**
   * The mobile-optimized version of your landing page. Must begin with http:// or https://.
  **/
  private String mobileLink;

  @ApiModelProperty(example = "PI12345NTEREST", value = "Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.")
 /**
   * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
  **/
  private String mpn;

  @ApiModelProperty(example = "10", value = "The number of ratings for the item.")
 /**
   * The number of ratings for the item.
  **/
  private Integer numberOfRatings;

  @ApiModelProperty(example = "10", value = "The number of reviews available for the item.")
 /**
   * The number of reviews available for the item.
  **/
  private Integer numberOfReviews;

  @ApiModelProperty(example = "plaid", value = "The description of the pattern used for the product.")
 /**
   * The description of the pattern used for the product.
  **/
  private String pattern;

  @ApiModelProperty(example = "24.99 USD", value = "The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
 /**
   * The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  **/
  private String price;

  @ApiModelProperty(example = "Clothing > Women’s > Shirts > Denim", value = "<p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>")
 /**
   * <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
  **/
  private String productType;

  @ApiModelProperty(example = "14.99 USD", value = "The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.")
 /**
   * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
  **/
  private String salePrice;

  @ApiModelProperty(example = "US:CA:Ground:0 USD", value = "Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.")
 /**
   * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
  **/
  private String shipping;

  @ApiModelProperty(example = "12 in", value = "The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
 /**
   * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  **/
  private String shippingHeight;

  @ApiModelProperty(example = "3 kg", value = "The weight of the product. Ensure there is a space between the numeric string and the metric.")
 /**
   * The weight of the product. Ensure there is a space between the numeric string and the metric.
  **/
  private String shippingWeight;

  @ApiModelProperty(example = "16 in", value = "The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
 /**
   * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  **/
  private String shippingWidth;

  @ApiModelProperty(example = "M", value = "The size of the product.")
 /**
   * The size of the product.
  **/
  private String size;

  @ApiModelProperty(example = "US", value = "Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.")
 /**
   * Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
  **/
  private String sizeSystem;

  @ApiModelProperty(example = "regular", value = "Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.")
 /**
   * Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
  **/
  private String sizeType;

  @ApiModelProperty(example = "US:1025433:6.00:y", value = "Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.")
 /**
   * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
  **/
  private String tax;

  @ApiModelProperty(example = "Women’s denim shirt, large", value = "<p><= 500 characters</p> <p>The name of the product.</p>")
 /**
   * <p><= 500 characters</p> <p>The name of the product.</p>
  **/
  private String title;

  @ApiModelProperty(example = "[\"Color\",\"Size\"]", value = "Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.")
 /**
   * Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
  **/
  private List<String> variantNames;

  @ApiModelProperty(example = "[\"Red\",\"Small\"]", value = "Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.")
 /**
   * Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
  **/
  private List<String> variantValues;
 /**
   * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
   * @return adLink
  **/
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }

  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  public UpdatableItemAttributes adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

 /**
   * Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.
   * @return adult
  **/
  @JsonProperty("adult")
  public Boolean getAdult() {
    return adult;
  }

  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  public UpdatableItemAttributes adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

 /**
   * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
   * @return ageGroup
  **/
  @JsonProperty("age_group")
  public String getAgeGroup() {
    return ageGroup;
  }

  public void setAgeGroup(String ageGroup) {
    this.ageGroup = ageGroup;
  }

  public UpdatableItemAttributes ageGroup(String ageGroup) {
    this.ageGroup = ageGroup;
    return this;
  }

 /**
   * The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
   * @return availability
  **/
  @JsonProperty("availability")
  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }

  public UpdatableItemAttributes availability(String availability) {
    this.availability = availability;
    return this;
  }

 /**
   * Average reviews for the item. Can be a number from 1-5.
   * @return averageReviewRating
  **/
  @JsonProperty("average_review_rating")
  public BigDecimal getAverageReviewRating() {
    return averageReviewRating;
  }

  public void setAverageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
  }

  public UpdatableItemAttributes averageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
    return this;
  }

 /**
   * The brand of the product.
   * @return brand
  **/
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public UpdatableItemAttributes brand(String brand) {
    this.brand = brand;
    return this;
  }

 /**
   * This attribute is not supported anymore.
   * @return checkoutEnabled
  **/
  @JsonProperty("checkout_enabled")
  public Boolean getCheckoutEnabled() {
    return checkoutEnabled;
  }

  public void setCheckoutEnabled(Boolean checkoutEnabled) {
    this.checkoutEnabled = checkoutEnabled;
  }

  public UpdatableItemAttributes checkoutEnabled(Boolean checkoutEnabled) {
    this.checkoutEnabled = checkoutEnabled;
    return this;
  }

 /**
   * The primary color of the product.
   * @return color
  **/
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public UpdatableItemAttributes color(String color) {
    this.color = color;
    return this;
  }

 /**
   * The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
   * @return condition
  **/
  @JsonProperty("condition")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public UpdatableItemAttributes condition(String condition) {
    this.condition = condition;
    return this;
  }

 /**
   * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
   * @return customLabel0
  **/
  @JsonProperty("custom_label_0")
  public String getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public UpdatableItemAttributes customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

 /**
   * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
   * @return customLabel1
  **/
  @JsonProperty("custom_label_1")
  public String getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public UpdatableItemAttributes customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

 /**
   * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
   * @return customLabel2
  **/
  @JsonProperty("custom_label_2")
  public String getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public UpdatableItemAttributes customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

 /**
   * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
   * @return customLabel3
  **/
  @JsonProperty("custom_label_3")
  public String getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public UpdatableItemAttributes customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

 /**
   * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
   * @return customLabel4
  **/
  @JsonProperty("custom_label_4")
  public String getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public UpdatableItemAttributes customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

 /**
   * &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt;
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdatableItemAttributes description(String description) {
    this.description = description;
    return this;
  }

 /**
   * The item is free to ship.
   * @return freeShippingLabel
  **/
  @JsonProperty("free_shipping_label")
  public Boolean getFreeShippingLabel() {
    return freeShippingLabel;
  }

  public void setFreeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
  }

  public UpdatableItemAttributes freeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
    return this;
  }

 /**
   * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
   * @return freeShippingLimit
  **/
  @JsonProperty("free_shipping_limit")
  public String getFreeShippingLimit() {
    return freeShippingLimit;
  }

  public void setFreeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
  }

  public UpdatableItemAttributes freeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
    return this;
  }

 /**
   * The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
   * @return gender
  **/
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public UpdatableItemAttributes gender(String gender) {
    this.gender = gender;
    return this;
  }

 /**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
   * @return googleProductCategory
  **/
  @JsonProperty("google_product_category")
  public String getGoogleProductCategory() {
    return googleProductCategory;
  }

  public void setGoogleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

  public UpdatableItemAttributes googleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
    return this;
  }

 /**
   * The unique universal product identifier.
   * @return gtin
  **/
  @JsonProperty("gtin")
  public Integer getGtin() {
    return gtin;
  }

  public void setGtin(Integer gtin) {
    this.gtin = gtin;
  }

  public UpdatableItemAttributes gtin(Integer gtin) {
    this.gtin = gtin;
    return this;
  }

 /**
   * &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt;
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdatableItemAttributes id(String id) {
    this.id = id;
    return this;
  }

 /**
   * &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt;
   * @return itemGroupId
  **/
  @JsonProperty("item_group_id")
  public String getItemGroupId() {
    return itemGroupId;
  }

  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  public UpdatableItemAttributes itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

 /**
   * The millisecond timestamp when the item was lastly modified by the merchant.
   * @return lastUpdatedTime
  **/
  @JsonProperty("last_updated_time")
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public UpdatableItemAttributes lastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

 /**
   * &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt;
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public UpdatableItemAttributes link(String link) {
    this.link = link;
    return this;
  }

 /**
   * The material used to make the product.
   * @return material
  **/
  @JsonProperty("material")
  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public UpdatableItemAttributes material(String material) {
    this.material = material;
    return this;
  }

 /**
   * The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.
   * @return minAdPrice
  **/
  @JsonProperty("min_ad_price")
  public String getMinAdPrice() {
    return minAdPrice;
  }

  public void setMinAdPrice(String minAdPrice) {
    this.minAdPrice = minAdPrice;
  }

  public UpdatableItemAttributes minAdPrice(String minAdPrice) {
    this.minAdPrice = minAdPrice;
    return this;
  }

 /**
   * The mobile-optimized version of your landing page. Must begin with http:// or https://.
   * @return mobileLink
  **/
  @JsonProperty("mobile_link")
  public String getMobileLink() {
    return mobileLink;
  }

  public void setMobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
  }

  public UpdatableItemAttributes mobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
    return this;
  }

 /**
   * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
   * @return mpn
  **/
  @JsonProperty("mpn")
  public String getMpn() {
    return mpn;
  }

  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

  public UpdatableItemAttributes mpn(String mpn) {
    this.mpn = mpn;
    return this;
  }

 /**
   * The number of ratings for the item.
   * @return numberOfRatings
  **/
  @JsonProperty("number_of_ratings")
  public Integer getNumberOfRatings() {
    return numberOfRatings;
  }

  public void setNumberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
  }

  public UpdatableItemAttributes numberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
    return this;
  }

 /**
   * The number of reviews available for the item.
   * @return numberOfReviews
  **/
  @JsonProperty("number_of_reviews")
  public Integer getNumberOfReviews() {
    return numberOfReviews;
  }

  public void setNumberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
  }

  public UpdatableItemAttributes numberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
    return this;
  }

 /**
   * The description of the pattern used for the product.
   * @return pattern
  **/
  @JsonProperty("pattern")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public UpdatableItemAttributes pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

 /**
   * The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
   * @return price
  **/
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public UpdatableItemAttributes price(String price) {
    this.price = price;
    return this;
  }

 /**
   * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt;
   * @return productType
  **/
  @JsonProperty("product_type")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public UpdatableItemAttributes productType(String productType) {
    this.productType = productType;
    return this;
  }

 /**
   * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.
   * @return salePrice
  **/
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  public UpdatableItemAttributes salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

 /**
   * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
   * @return shipping
  **/
  @JsonProperty("shipping")
  public String getShipping() {
    return shipping;
  }

  public void setShipping(String shipping) {
    this.shipping = shipping;
  }

  public UpdatableItemAttributes shipping(String shipping) {
    this.shipping = shipping;
    return this;
  }

 /**
   * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingHeight
  **/
  @JsonProperty("shipping_height")
  public String getShippingHeight() {
    return shippingHeight;
  }

  public void setShippingHeight(String shippingHeight) {
    this.shippingHeight = shippingHeight;
  }

  public UpdatableItemAttributes shippingHeight(String shippingHeight) {
    this.shippingHeight = shippingHeight;
    return this;
  }

 /**
   * The weight of the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingWeight
  **/
  @JsonProperty("shipping_weight")
  public String getShippingWeight() {
    return shippingWeight;
  }

  public void setShippingWeight(String shippingWeight) {
    this.shippingWeight = shippingWeight;
  }

  public UpdatableItemAttributes shippingWeight(String shippingWeight) {
    this.shippingWeight = shippingWeight;
    return this;
  }

 /**
   * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingWidth
  **/
  @JsonProperty("shipping_width")
  public String getShippingWidth() {
    return shippingWidth;
  }

  public void setShippingWidth(String shippingWidth) {
    this.shippingWidth = shippingWidth;
  }

  public UpdatableItemAttributes shippingWidth(String shippingWidth) {
    this.shippingWidth = shippingWidth;
    return this;
  }

 /**
   * The size of the product.
   * @return size
  **/
  @JsonProperty("size")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public UpdatableItemAttributes size(String size) {
    this.size = size;
    return this;
  }

 /**
   * Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
   * @return sizeSystem
  **/
  @JsonProperty("size_system")
  public String getSizeSystem() {
    return sizeSystem;
  }

  public void setSizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
  }

  public UpdatableItemAttributes sizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
    return this;
  }

 /**
   * Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
   * @return sizeType
  **/
  @JsonProperty("size_type")
  public String getSizeType() {
    return sizeType;
  }

  public void setSizeType(String sizeType) {
    this.sizeType = sizeType;
  }

  public UpdatableItemAttributes sizeType(String sizeType) {
    this.sizeType = sizeType;
    return this;
  }

 /**
   * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
   * @return tax
  **/
  @JsonProperty("tax")
  public String getTax() {
    return tax;
  }

  public void setTax(String tax) {
    this.tax = tax;
  }

  public UpdatableItemAttributes tax(String tax) {
    this.tax = tax;
    return this;
  }

 /**
   * &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt;
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UpdatableItemAttributes title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
   * @return variantNames
  **/
  @JsonProperty("variant_names")
  public List<String> getVariantNames() {
    return variantNames;
  }

  public void setVariantNames(List<String> variantNames) {
    this.variantNames = variantNames;
  }

  public UpdatableItemAttributes variantNames(List<String> variantNames) {
    this.variantNames = variantNames;
    return this;
  }

  public UpdatableItemAttributes addVariantNamesItem(String variantNamesItem) {
    this.variantNames.add(variantNamesItem);
    return this;
  }

 /**
   * Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
   * @return variantValues
  **/
  @JsonProperty("variant_values")
  public List<String> getVariantValues() {
    return variantValues;
  }

  public void setVariantValues(List<String> variantValues) {
    this.variantValues = variantValues;
  }

  public UpdatableItemAttributes variantValues(List<String> variantValues) {
    this.variantValues = variantValues;
    return this;
  }

  public UpdatableItemAttributes addVariantValuesItem(String variantValuesItem) {
    this.variantValues.add(variantValuesItem);
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
    UpdatableItemAttributes updatableItemAttributes = (UpdatableItemAttributes) o;
    return Objects.equals(this.adLink, updatableItemAttributes.adLink) &&
        Objects.equals(this.adult, updatableItemAttributes.adult) &&
        Objects.equals(this.ageGroup, updatableItemAttributes.ageGroup) &&
        Objects.equals(this.availability, updatableItemAttributes.availability) &&
        Objects.equals(this.averageReviewRating, updatableItemAttributes.averageReviewRating) &&
        Objects.equals(this.brand, updatableItemAttributes.brand) &&
        Objects.equals(this.checkoutEnabled, updatableItemAttributes.checkoutEnabled) &&
        Objects.equals(this.color, updatableItemAttributes.color) &&
        Objects.equals(this.condition, updatableItemAttributes.condition) &&
        Objects.equals(this.customLabel0, updatableItemAttributes.customLabel0) &&
        Objects.equals(this.customLabel1, updatableItemAttributes.customLabel1) &&
        Objects.equals(this.customLabel2, updatableItemAttributes.customLabel2) &&
        Objects.equals(this.customLabel3, updatableItemAttributes.customLabel3) &&
        Objects.equals(this.customLabel4, updatableItemAttributes.customLabel4) &&
        Objects.equals(this.description, updatableItemAttributes.description) &&
        Objects.equals(this.freeShippingLabel, updatableItemAttributes.freeShippingLabel) &&
        Objects.equals(this.freeShippingLimit, updatableItemAttributes.freeShippingLimit) &&
        Objects.equals(this.gender, updatableItemAttributes.gender) &&
        Objects.equals(this.googleProductCategory, updatableItemAttributes.googleProductCategory) &&
        Objects.equals(this.gtin, updatableItemAttributes.gtin) &&
        Objects.equals(this.id, updatableItemAttributes.id) &&
        Objects.equals(this.itemGroupId, updatableItemAttributes.itemGroupId) &&
        Objects.equals(this.lastUpdatedTime, updatableItemAttributes.lastUpdatedTime) &&
        Objects.equals(this.link, updatableItemAttributes.link) &&
        Objects.equals(this.material, updatableItemAttributes.material) &&
        Objects.equals(this.minAdPrice, updatableItemAttributes.minAdPrice) &&
        Objects.equals(this.mobileLink, updatableItemAttributes.mobileLink) &&
        Objects.equals(this.mpn, updatableItemAttributes.mpn) &&
        Objects.equals(this.numberOfRatings, updatableItemAttributes.numberOfRatings) &&
        Objects.equals(this.numberOfReviews, updatableItemAttributes.numberOfReviews) &&
        Objects.equals(this.pattern, updatableItemAttributes.pattern) &&
        Objects.equals(this.price, updatableItemAttributes.price) &&
        Objects.equals(this.productType, updatableItemAttributes.productType) &&
        Objects.equals(this.salePrice, updatableItemAttributes.salePrice) &&
        Objects.equals(this.shipping, updatableItemAttributes.shipping) &&
        Objects.equals(this.shippingHeight, updatableItemAttributes.shippingHeight) &&
        Objects.equals(this.shippingWeight, updatableItemAttributes.shippingWeight) &&
        Objects.equals(this.shippingWidth, updatableItemAttributes.shippingWidth) &&
        Objects.equals(this.size, updatableItemAttributes.size) &&
        Objects.equals(this.sizeSystem, updatableItemAttributes.sizeSystem) &&
        Objects.equals(this.sizeType, updatableItemAttributes.sizeType) &&
        Objects.equals(this.tax, updatableItemAttributes.tax) &&
        Objects.equals(this.title, updatableItemAttributes.title) &&
        Objects.equals(this.variantNames, updatableItemAttributes.variantNames) &&
        Objects.equals(this.variantValues, updatableItemAttributes.variantValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adLink, adult, ageGroup, availability, averageReviewRating, brand, checkoutEnabled, color, condition, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, description, freeShippingLabel, freeShippingLimit, gender, googleProductCategory, gtin, id, itemGroupId, lastUpdatedTime, link, material, minAdPrice, mobileLink, mpn, numberOfRatings, numberOfReviews, pattern, price, productType, salePrice, shipping, shippingHeight, shippingWeight, shippingWidth, size, sizeSystem, sizeType, tax, title, variantNames, variantValues);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

