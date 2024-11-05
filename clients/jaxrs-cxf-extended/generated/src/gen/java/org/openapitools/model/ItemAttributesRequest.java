package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ItemAttributesRequestAllOfImageLink;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemAttributesRequest  {
  
 /**
  * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
  */
  @ApiModelProperty(example = "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest", value = "Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.")
  private String adLink;

 /**
  * Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
  */
  @ApiModelProperty(example = "true", value = "Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.")
  private Boolean adult;

 /**
  * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
  */
  @ApiModelProperty(example = "newborn", value = "The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.")
  private String ageGroup;

 /**
  * The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.
  */
  @ApiModelProperty(example = "in stock", value = "The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.")
  private String availability;

 /**
  * Average reviews for the item. Can be a number from 1-5.
  */
  @ApiModelProperty(example = "5", value = "Average reviews for the item. Can be a number from 1-5.")
  @Valid
  private BigDecimal averageReviewRating;

 /**
  * The brand of the product.
  */
  @ApiModelProperty(example = "Josie’s Denim", value = "The brand of the product.")
  private String brand;

 /**
  * This attribute is not supported anymore.
  */
  @ApiModelProperty(example = "false", value = "This attribute is not supported anymore.")
  private Boolean checkoutEnabled;

 /**
  * The primary color of the product.
  */
  @ApiModelProperty(example = "blue", value = "The primary color of the product.")
  private String color;

 /**
  * The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
  */
  @ApiModelProperty(example = "new", value = "The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.")
  private String condition;

 /**
  * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  */
  @ApiModelProperty(example = "Best sellers", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  private String customLabel0;

 /**
  * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  */
  @ApiModelProperty(example = "Summer promotion", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  private String customLabel1;

 /**
  * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  */
  @ApiModelProperty(example = "Winter sales", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  private String customLabel2;

 /**
  * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  */
  @ApiModelProperty(example = "Woman dress", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  private String customLabel3;

 /**
  * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
  */
  @ApiModelProperty(example = "Man hat", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  private String customLabel4;

 /**
  * <p><= 10000 characters</p> <p>The description of the product.</p>
  */
  @ApiModelProperty(example = "Casual fit denim shirt made with the finest quality Japanese denim.", value = "<p><= 10000 characters</p> <p>The description of the product.</p>")
  private String description;

 /**
  * The item is free to ship.
  */
  @ApiModelProperty(example = "true", value = "The item is free to ship.")
  private Boolean freeShippingLabel;

 /**
  * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
  */
  @ApiModelProperty(example = "35 USD", value = "The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.")
  private String freeShippingLimit;

 /**
  * The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.
  */
  @ApiModelProperty(example = "unisex", value = "The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.")
  private String gender;

 /**
  * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  */
  @ApiModelProperty(example = "Apparel & Accessories > Clothing > Shirts & Tops", value = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.")
  private String googleProductCategory;

 /**
  * The unique universal product identifier.
  */
  @ApiModelProperty(example = "3234567890126", value = "The unique universal product identifier.")
  private Integer gtin;

 /**
  * <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
  */
  @ApiModelProperty(example = "DS0294-L", value = "<p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>")
  private String id;

 /**
  * <p><= 127 characters</p> <p>The parent ID of the product.</p>
  */
  @ApiModelProperty(example = "DS0294", value = "<p><= 127 characters</p> <p>The parent ID of the product.</p>")
  private String itemGroupId;

 /**
  * The millisecond timestamp when the item was lastly modified by the merchant.
  */
  @ApiModelProperty(example = "1641483432072", value = "The millisecond timestamp when the item was lastly modified by the merchant.")
  private Long lastUpdatedTime;

 /**
  * <p><= 511 characters</p> <p>The landing page for the product.</p>
  */
  @ApiModelProperty(example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294", value = "<p><= 511 characters</p> <p>The landing page for the product.</p>")
  private String link;

 /**
  * The material used to make the product.
  */
  @ApiModelProperty(example = "cotton", value = "The material used to make the product.")
  private String material;

 /**
  * The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
  */
  @ApiModelProperty(example = "19.99 USD", value = "The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.")
  private String minAdPrice;

 /**
  * The mobile-optimized version of your landing page. Must begin with http:// or https://.
  */
  @ApiModelProperty(example = "https://m.example.com/cat/womens-clothing/denim-shirt-0294", value = "The mobile-optimized version of your landing page. Must begin with http:// or https://.")
  private String mobileLink;

 /**
  * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
  */
  @ApiModelProperty(example = "PI12345NTEREST", value = "Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.")
  private String mpn;

 /**
  * The number of ratings for the item.
  */
  @ApiModelProperty(example = "10", value = "The number of ratings for the item.")
  private Integer numberOfRatings;

 /**
  * The number of reviews available for the item.
  */
  @ApiModelProperty(example = "10", value = "The number of reviews available for the item.")
  private Integer numberOfReviews;

 /**
  * The description of the pattern used for the product.
  */
  @ApiModelProperty(example = "plaid", value = "The description of the pattern used for the product.")
  private String pattern;

 /**
  * The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  */
  @ApiModelProperty(example = "24.99 USD", value = "The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
  private String price;

 /**
  * <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
  */
  @ApiModelProperty(example = "Clothing > Women’s > Shirts > Denim", value = "<p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>")
  private String productType;

 /**
  * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
  */
  @ApiModelProperty(example = "14.99 USD", value = "The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.")
  private String salePrice;

 /**
  * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
  */
  @ApiModelProperty(example = "US:CA:Ground:0 USD", value = "Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.")
  private String shipping;

 /**
  * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  */
  @ApiModelProperty(example = "12 in", value = "The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
  private String shippingHeight;

 /**
  * The weight of the product. Ensure there is a space between the numeric string and the metric.
  */
  @ApiModelProperty(example = "3 kg", value = "The weight of the product. Ensure there is a space between the numeric string and the metric.")
  private String shippingWeight;

 /**
  * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  */
  @ApiModelProperty(example = "16 in", value = "The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
  private String shippingWidth;

 /**
  * The size of the product.
  */
  @ApiModelProperty(example = "M", value = "The size of the product.")
  private String size;

 /**
  * Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.
  */
  @ApiModelProperty(example = "US", value = "Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.")
  private String sizeSystem;

 /**
  * Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.
  */
  @ApiModelProperty(example = "regular", value = "Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.")
  private String sizeType;

 /**
  * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
  */
  @ApiModelProperty(example = "US:1025433:6.00:y", value = "Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.")
  private String tax;

 /**
  * <p><= 500 characters</p> <p>The name of the product.</p>
  */
  @ApiModelProperty(example = "Women’s denim shirt, large", value = "<p><= 500 characters</p> <p>The name of the product.</p>")
  private String title;

 /**
  * Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
  */
  @ApiModelProperty(example = "[Color, Size]", value = "Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.")
  private List<String> variantNames;

 /**
  * Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
  */
  @ApiModelProperty(example = "[Red, Small]", value = "Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.")
  private List<String> variantValues;

 /**
  * <p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>
  */
  @ApiModelProperty(example = "[\"https://scene.example.com/image/image_v2.jpg\",\"https://scene.example.com/image/image_v3.jpg\"]", value = "<p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>")
  private List<String> additionalImageLink;

  @ApiModelProperty(value = "")
  @Valid
  private ItemAttributesRequestAllOfImageLink imageLink;

 /**
  * <p><= 2,000 characters</p> <p>Hosted link to the product video.</p> <p>File types for linked videos must be .mp4, .mov or .m4v.</p> <p>File size cannot exceed 2GB.</p>
  */
  @ApiModelProperty(example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294.mp4", value = "<p><= 2,000 characters</p> <p>Hosted link to the product video.</p> <p>File types for linked videos must be .mp4, .mov or .m4v.</p> <p>File size cannot exceed 2GB.</p>")
  private String videoLink;
 /**
  * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
  * @return adLink
  */
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }

  /**
   * Sets the <code>adLink</code> property.
   */
 public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  /**
   * Sets the <code>adLink</code> property.
   */
  public ItemAttributesRequest adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

 /**
  * Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.
  * @return adult
  */
  @JsonProperty("adult")
  public Boolean getAdult() {
    return adult;
  }

  /**
   * Sets the <code>adult</code> property.
   */
 public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  /**
   * Sets the <code>adult</code> property.
   */
  public ItemAttributesRequest adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

 /**
  * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
  * @return ageGroup
  */
  @JsonProperty("age_group")
  public String getAgeGroup() {
    return ageGroup;
  }

  /**
   * Sets the <code>ageGroup</code> property.
   */
 public void setAgeGroup(String ageGroup) {
    this.ageGroup = ageGroup;
  }

  /**
   * Sets the <code>ageGroup</code> property.
   */
  public ItemAttributesRequest ageGroup(String ageGroup) {
    this.ageGroup = ageGroup;
    return this;
  }

 /**
  * The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.
  * @return availability
  */
  @JsonProperty("availability")
  public String getAvailability() {
    return availability;
  }

  /**
   * Sets the <code>availability</code> property.
   */
 public void setAvailability(String availability) {
    this.availability = availability;
  }

  /**
   * Sets the <code>availability</code> property.
   */
  public ItemAttributesRequest availability(String availability) {
    this.availability = availability;
    return this;
  }

 /**
  * Average reviews for the item. Can be a number from 1-5.
  * @return averageReviewRating
  */
  @JsonProperty("average_review_rating")
  public BigDecimal getAverageReviewRating() {
    return averageReviewRating;
  }

  /**
   * Sets the <code>averageReviewRating</code> property.
   */
 public void setAverageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
  }

  /**
   * Sets the <code>averageReviewRating</code> property.
   */
  public ItemAttributesRequest averageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
    return this;
  }

 /**
  * The brand of the product.
  * @return brand
  */
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  /**
   * Sets the <code>brand</code> property.
   */
 public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * Sets the <code>brand</code> property.
   */
  public ItemAttributesRequest brand(String brand) {
    this.brand = brand;
    return this;
  }

 /**
  * This attribute is not supported anymore.
  * @return checkoutEnabled
  */
  @JsonProperty("checkout_enabled")
  public Boolean getCheckoutEnabled() {
    return checkoutEnabled;
  }

  /**
   * Sets the <code>checkoutEnabled</code> property.
   */
 public void setCheckoutEnabled(Boolean checkoutEnabled) {
    this.checkoutEnabled = checkoutEnabled;
  }

  /**
   * Sets the <code>checkoutEnabled</code> property.
   */
  public ItemAttributesRequest checkoutEnabled(Boolean checkoutEnabled) {
    this.checkoutEnabled = checkoutEnabled;
    return this;
  }

 /**
  * The primary color of the product.
  * @return color
  */
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  /**
   * Sets the <code>color</code> property.
   */
 public void setColor(String color) {
    this.color = color;
  }

  /**
   * Sets the <code>color</code> property.
   */
  public ItemAttributesRequest color(String color) {
    this.color = color;
    return this;
  }

 /**
  * The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
  * @return condition
  */
  @JsonProperty("condition")
  public String getCondition() {
    return condition;
  }

  /**
   * Sets the <code>condition</code> property.
   */
 public void setCondition(String condition) {
    this.condition = condition;
  }

  /**
   * Sets the <code>condition</code> property.
   */
  public ItemAttributesRequest condition(String condition) {
    this.condition = condition;
    return this;
  }

 /**
  * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
  * @return customLabel0
  */
  @JsonProperty("custom_label_0")
  public String getCustomLabel0() {
    return customLabel0;
  }

  /**
   * Sets the <code>customLabel0</code> property.
   */
 public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  /**
   * Sets the <code>customLabel0</code> property.
   */
  public ItemAttributesRequest customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

 /**
  * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
  * @return customLabel1
  */
  @JsonProperty("custom_label_1")
  public String getCustomLabel1() {
    return customLabel1;
  }

  /**
   * Sets the <code>customLabel1</code> property.
   */
 public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  /**
   * Sets the <code>customLabel1</code> property.
   */
  public ItemAttributesRequest customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

 /**
  * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
  * @return customLabel2
  */
  @JsonProperty("custom_label_2")
  public String getCustomLabel2() {
    return customLabel2;
  }

  /**
   * Sets the <code>customLabel2</code> property.
   */
 public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  /**
   * Sets the <code>customLabel2</code> property.
   */
  public ItemAttributesRequest customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

 /**
  * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
  * @return customLabel3
  */
  @JsonProperty("custom_label_3")
  public String getCustomLabel3() {
    return customLabel3;
  }

  /**
   * Sets the <code>customLabel3</code> property.
   */
 public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  /**
   * Sets the <code>customLabel3</code> property.
   */
  public ItemAttributesRequest customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

 /**
  * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
  * @return customLabel4
  */
  @JsonProperty("custom_label_4")
  public String getCustomLabel4() {
    return customLabel4;
  }

  /**
   * Sets the <code>customLabel4</code> property.
   */
 public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  /**
   * Sets the <code>customLabel4</code> property.
   */
  public ItemAttributesRequest customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

 /**
  * &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt;
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public ItemAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

 /**
  * The item is free to ship.
  * @return freeShippingLabel
  */
  @JsonProperty("free_shipping_label")
  public Boolean getFreeShippingLabel() {
    return freeShippingLabel;
  }

  /**
   * Sets the <code>freeShippingLabel</code> property.
   */
 public void setFreeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
  }

  /**
   * Sets the <code>freeShippingLabel</code> property.
   */
  public ItemAttributesRequest freeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
    return this;
  }

 /**
  * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
  * @return freeShippingLimit
  */
  @JsonProperty("free_shipping_limit")
  public String getFreeShippingLimit() {
    return freeShippingLimit;
  }

  /**
   * Sets the <code>freeShippingLimit</code> property.
   */
 public void setFreeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
  }

  /**
   * Sets the <code>freeShippingLimit</code> property.
   */
  public ItemAttributesRequest freeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
    return this;
  }

 /**
  * The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.
  * @return gender
  */
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  /**
   * Sets the <code>gender</code> property.
   */
 public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * Sets the <code>gender</code> property.
   */
  public ItemAttributesRequest gender(String gender) {
    this.gender = gender;
    return this;
  }

 /**
  * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  * @return googleProductCategory
  */
  @JsonProperty("google_product_category")
  public String getGoogleProductCategory() {
    return googleProductCategory;
  }

  /**
   * Sets the <code>googleProductCategory</code> property.
   */
 public void setGoogleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

  /**
   * Sets the <code>googleProductCategory</code> property.
   */
  public ItemAttributesRequest googleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
    return this;
  }

 /**
  * The unique universal product identifier.
  * @return gtin
  */
  @JsonProperty("gtin")
  public Integer getGtin() {
    return gtin;
  }

  /**
   * Sets the <code>gtin</code> property.
   */
 public void setGtin(Integer gtin) {
    this.gtin = gtin;
  }

  /**
   * Sets the <code>gtin</code> property.
   */
  public ItemAttributesRequest gtin(Integer gtin) {
    this.gtin = gtin;
    return this;
  }

 /**
  * &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt;
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public ItemAttributesRequest id(String id) {
    this.id = id;
    return this;
  }

 /**
  * &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt;
  * @return itemGroupId
  */
  @JsonProperty("item_group_id")
  public String getItemGroupId() {
    return itemGroupId;
  }

  /**
   * Sets the <code>itemGroupId</code> property.
   */
 public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  /**
   * Sets the <code>itemGroupId</code> property.
   */
  public ItemAttributesRequest itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

 /**
  * The millisecond timestamp when the item was lastly modified by the merchant.
  * @return lastUpdatedTime
  */
  @JsonProperty("last_updated_time")
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  /**
   * Sets the <code>lastUpdatedTime</code> property.
   */
 public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  /**
   * Sets the <code>lastUpdatedTime</code> property.
   */
  public ItemAttributesRequest lastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

 /**
  * &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt;
  * @return link
  */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * Sets the <code>link</code> property.
   */
 public void setLink(String link) {
    this.link = link;
  }

  /**
   * Sets the <code>link</code> property.
   */
  public ItemAttributesRequest link(String link) {
    this.link = link;
    return this;
  }

 /**
  * The material used to make the product.
  * @return material
  */
  @JsonProperty("material")
  public String getMaterial() {
    return material;
  }

  /**
   * Sets the <code>material</code> property.
   */
 public void setMaterial(String material) {
    this.material = material;
  }

  /**
   * Sets the <code>material</code> property.
   */
  public ItemAttributesRequest material(String material) {
    this.material = material;
    return this;
  }

 /**
  * The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.
  * @return minAdPrice
  */
  @JsonProperty("min_ad_price")
  public String getMinAdPrice() {
    return minAdPrice;
  }

  /**
   * Sets the <code>minAdPrice</code> property.
   */
 public void setMinAdPrice(String minAdPrice) {
    this.minAdPrice = minAdPrice;
  }

  /**
   * Sets the <code>minAdPrice</code> property.
   */
  public ItemAttributesRequest minAdPrice(String minAdPrice) {
    this.minAdPrice = minAdPrice;
    return this;
  }

 /**
  * The mobile-optimized version of your landing page. Must begin with http:// or https://.
  * @return mobileLink
  */
  @JsonProperty("mobile_link")
  public String getMobileLink() {
    return mobileLink;
  }

  /**
   * Sets the <code>mobileLink</code> property.
   */
 public void setMobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
  }

  /**
   * Sets the <code>mobileLink</code> property.
   */
  public ItemAttributesRequest mobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
    return this;
  }

 /**
  * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
  * @return mpn
  */
  @JsonProperty("mpn")
  public String getMpn() {
    return mpn;
  }

  /**
   * Sets the <code>mpn</code> property.
   */
 public void setMpn(String mpn) {
    this.mpn = mpn;
  }

  /**
   * Sets the <code>mpn</code> property.
   */
  public ItemAttributesRequest mpn(String mpn) {
    this.mpn = mpn;
    return this;
  }

 /**
  * The number of ratings for the item.
  * @return numberOfRatings
  */
  @JsonProperty("number_of_ratings")
  public Integer getNumberOfRatings() {
    return numberOfRatings;
  }

  /**
   * Sets the <code>numberOfRatings</code> property.
   */
 public void setNumberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
  }

  /**
   * Sets the <code>numberOfRatings</code> property.
   */
  public ItemAttributesRequest numberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
    return this;
  }

 /**
  * The number of reviews available for the item.
  * @return numberOfReviews
  */
  @JsonProperty("number_of_reviews")
  public Integer getNumberOfReviews() {
    return numberOfReviews;
  }

  /**
   * Sets the <code>numberOfReviews</code> property.
   */
 public void setNumberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
  }

  /**
   * Sets the <code>numberOfReviews</code> property.
   */
  public ItemAttributesRequest numberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
    return this;
  }

 /**
  * The description of the pattern used for the product.
  * @return pattern
  */
  @JsonProperty("pattern")
  public String getPattern() {
    return pattern;
  }

  /**
   * Sets the <code>pattern</code> property.
   */
 public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  /**
   * Sets the <code>pattern</code> property.
   */
  public ItemAttributesRequest pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

 /**
  * The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
  * @return price
  */
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }

  /**
   * Sets the <code>price</code> property.
   */
 public void setPrice(String price) {
    this.price = price;
  }

  /**
   * Sets the <code>price</code> property.
   */
  public ItemAttributesRequest price(String price) {
    this.price = price;
    return this;
  }

 /**
  * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt;
  * @return productType
  */
  @JsonProperty("product_type")
  public String getProductType() {
    return productType;
  }

  /**
   * Sets the <code>productType</code> property.
   */
 public void setProductType(String productType) {
    this.productType = productType;
  }

  /**
   * Sets the <code>productType</code> property.
   */
  public ItemAttributesRequest productType(String productType) {
    this.productType = productType;
    return this;
  }

 /**
  * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.
  * @return salePrice
  */
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }

  /**
   * Sets the <code>salePrice</code> property.
   */
 public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  /**
   * Sets the <code>salePrice</code> property.
   */
  public ItemAttributesRequest salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

 /**
  * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
  * @return shipping
  */
  @JsonProperty("shipping")
  public String getShipping() {
    return shipping;
  }

  /**
   * Sets the <code>shipping</code> property.
   */
 public void setShipping(String shipping) {
    this.shipping = shipping;
  }

  /**
   * Sets the <code>shipping</code> property.
   */
  public ItemAttributesRequest shipping(String shipping) {
    this.shipping = shipping;
    return this;
  }

 /**
  * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  * @return shippingHeight
  */
  @JsonProperty("shipping_height")
  public String getShippingHeight() {
    return shippingHeight;
  }

  /**
   * Sets the <code>shippingHeight</code> property.
   */
 public void setShippingHeight(String shippingHeight) {
    this.shippingHeight = shippingHeight;
  }

  /**
   * Sets the <code>shippingHeight</code> property.
   */
  public ItemAttributesRequest shippingHeight(String shippingHeight) {
    this.shippingHeight = shippingHeight;
    return this;
  }

 /**
  * The weight of the product. Ensure there is a space between the numeric string and the metric.
  * @return shippingWeight
  */
  @JsonProperty("shipping_weight")
  public String getShippingWeight() {
    return shippingWeight;
  }

  /**
   * Sets the <code>shippingWeight</code> property.
   */
 public void setShippingWeight(String shippingWeight) {
    this.shippingWeight = shippingWeight;
  }

  /**
   * Sets the <code>shippingWeight</code> property.
   */
  public ItemAttributesRequest shippingWeight(String shippingWeight) {
    this.shippingWeight = shippingWeight;
    return this;
  }

 /**
  * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  * @return shippingWidth
  */
  @JsonProperty("shipping_width")
  public String getShippingWidth() {
    return shippingWidth;
  }

  /**
   * Sets the <code>shippingWidth</code> property.
   */
 public void setShippingWidth(String shippingWidth) {
    this.shippingWidth = shippingWidth;
  }

  /**
   * Sets the <code>shippingWidth</code> property.
   */
  public ItemAttributesRequest shippingWidth(String shippingWidth) {
    this.shippingWidth = shippingWidth;
    return this;
  }

 /**
  * The size of the product.
  * @return size
  */
  @JsonProperty("size")
  public String getSize() {
    return size;
  }

  /**
   * Sets the <code>size</code> property.
   */
 public void setSize(String size) {
    this.size = size;
  }

  /**
   * Sets the <code>size</code> property.
   */
  public ItemAttributesRequest size(String size) {
    this.size = size;
    return this;
  }

 /**
  * Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.
  * @return sizeSystem
  */
  @JsonProperty("size_system")
  public String getSizeSystem() {
    return sizeSystem;
  }

  /**
   * Sets the <code>sizeSystem</code> property.
   */
 public void setSizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
  }

  /**
   * Sets the <code>sizeSystem</code> property.
   */
  public ItemAttributesRequest sizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
    return this;
  }

 /**
  * Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.
  * @return sizeType
  */
  @JsonProperty("size_type")
  public String getSizeType() {
    return sizeType;
  }

  /**
   * Sets the <code>sizeType</code> property.
   */
 public void setSizeType(String sizeType) {
    this.sizeType = sizeType;
  }

  /**
   * Sets the <code>sizeType</code> property.
   */
  public ItemAttributesRequest sizeType(String sizeType) {
    this.sizeType = sizeType;
    return this;
  }

 /**
  * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
  * @return tax
  */
  @JsonProperty("tax")
  public String getTax() {
    return tax;
  }

  /**
   * Sets the <code>tax</code> property.
   */
 public void setTax(String tax) {
    this.tax = tax;
  }

  /**
   * Sets the <code>tax</code> property.
   */
  public ItemAttributesRequest tax(String tax) {
    this.tax = tax;
    return this;
  }

 /**
  * &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt;
  * @return title
  */
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public ItemAttributesRequest title(String title) {
    this.title = title;
    return this;
  }

 /**
  * Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
  * @return variantNames
  */
  @JsonProperty("variant_names")
  public List<String> getVariantNames() {
    return variantNames;
  }

  /**
   * Sets the <code>variantNames</code> property.
   */
 public void setVariantNames(List<String> variantNames) {
    this.variantNames = variantNames;
  }

  /**
   * Sets the <code>variantNames</code> property.
   */
  public ItemAttributesRequest variantNames(List<String> variantNames) {
    this.variantNames = variantNames;
    return this;
  }

  /**
   * Adds a new item to the <code>variantNames</code> list.
   */
  public ItemAttributesRequest addVariantNamesItem(String variantNamesItem) {
    this.variantNames.add(variantNamesItem);
    return this;
  }

 /**
  * Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
  * @return variantValues
  */
  @JsonProperty("variant_values")
  public List<String> getVariantValues() {
    return variantValues;
  }

  /**
   * Sets the <code>variantValues</code> property.
   */
 public void setVariantValues(List<String> variantValues) {
    this.variantValues = variantValues;
  }

  /**
   * Sets the <code>variantValues</code> property.
   */
  public ItemAttributesRequest variantValues(List<String> variantValues) {
    this.variantValues = variantValues;
    return this;
  }

  /**
   * Adds a new item to the <code>variantValues</code> list.
   */
  public ItemAttributesRequest addVariantValuesItem(String variantValuesItem) {
    this.variantValues.add(variantValuesItem);
    return this;
  }

 /**
  * &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.&lt;/p&gt;
  * @return additionalImageLink
  */
  @JsonProperty("additional_image_link")
  public List<String> getAdditionalImageLink() {
    return additionalImageLink;
  }

  /**
   * Sets the <code>additionalImageLink</code> property.
   */
 public void setAdditionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
  }

  /**
   * Sets the <code>additionalImageLink</code> property.
   */
  public ItemAttributesRequest additionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
    return this;
  }

  /**
   * Adds a new item to the <code>additionalImageLink</code> list.
   */
  public ItemAttributesRequest addAdditionalImageLinkItem(String additionalImageLinkItem) {
    this.additionalImageLink.add(additionalImageLinkItem);
    return this;
  }

 /**
  * Get imageLink
  * @return imageLink
  */
  @JsonProperty("image_link")
  public ItemAttributesRequestAllOfImageLink getImageLink() {
    return imageLink;
  }

  /**
   * Sets the <code>imageLink</code> property.
   */
 public void setImageLink(ItemAttributesRequestAllOfImageLink imageLink) {
    this.imageLink = imageLink;
  }

  /**
   * Sets the <code>imageLink</code> property.
   */
  public ItemAttributesRequest imageLink(ItemAttributesRequestAllOfImageLink imageLink) {
    this.imageLink = imageLink;
    return this;
  }

 /**
  * &lt;p&gt;&lt;&#x3D; 2,000 characters&lt;/p&gt; &lt;p&gt;Hosted link to the product video.&lt;/p&gt; &lt;p&gt;File types for linked videos must be .mp4, .mov or .m4v.&lt;/p&gt; &lt;p&gt;File size cannot exceed 2GB.&lt;/p&gt;
  * @return videoLink
  */
  @JsonProperty("video_link")
  public String getVideoLink() {
    return videoLink;
  }

  /**
   * Sets the <code>videoLink</code> property.
   */
 public void setVideoLink(String videoLink) {
    this.videoLink = videoLink;
  }

  /**
   * Sets the <code>videoLink</code> property.
   */
  public ItemAttributesRequest videoLink(String videoLink) {
    this.videoLink = videoLink;
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
    ItemAttributesRequest itemAttributesRequest = (ItemAttributesRequest) o;
    return Objects.equals(this.adLink, itemAttributesRequest.adLink) &&
        Objects.equals(this.adult, itemAttributesRequest.adult) &&
        Objects.equals(this.ageGroup, itemAttributesRequest.ageGroup) &&
        Objects.equals(this.availability, itemAttributesRequest.availability) &&
        Objects.equals(this.averageReviewRating, itemAttributesRequest.averageReviewRating) &&
        Objects.equals(this.brand, itemAttributesRequest.brand) &&
        Objects.equals(this.checkoutEnabled, itemAttributesRequest.checkoutEnabled) &&
        Objects.equals(this.color, itemAttributesRequest.color) &&
        Objects.equals(this.condition, itemAttributesRequest.condition) &&
        Objects.equals(this.customLabel0, itemAttributesRequest.customLabel0) &&
        Objects.equals(this.customLabel1, itemAttributesRequest.customLabel1) &&
        Objects.equals(this.customLabel2, itemAttributesRequest.customLabel2) &&
        Objects.equals(this.customLabel3, itemAttributesRequest.customLabel3) &&
        Objects.equals(this.customLabel4, itemAttributesRequest.customLabel4) &&
        Objects.equals(this.description, itemAttributesRequest.description) &&
        Objects.equals(this.freeShippingLabel, itemAttributesRequest.freeShippingLabel) &&
        Objects.equals(this.freeShippingLimit, itemAttributesRequest.freeShippingLimit) &&
        Objects.equals(this.gender, itemAttributesRequest.gender) &&
        Objects.equals(this.googleProductCategory, itemAttributesRequest.googleProductCategory) &&
        Objects.equals(this.gtin, itemAttributesRequest.gtin) &&
        Objects.equals(this.id, itemAttributesRequest.id) &&
        Objects.equals(this.itemGroupId, itemAttributesRequest.itemGroupId) &&
        Objects.equals(this.lastUpdatedTime, itemAttributesRequest.lastUpdatedTime) &&
        Objects.equals(this.link, itemAttributesRequest.link) &&
        Objects.equals(this.material, itemAttributesRequest.material) &&
        Objects.equals(this.minAdPrice, itemAttributesRequest.minAdPrice) &&
        Objects.equals(this.mobileLink, itemAttributesRequest.mobileLink) &&
        Objects.equals(this.mpn, itemAttributesRequest.mpn) &&
        Objects.equals(this.numberOfRatings, itemAttributesRequest.numberOfRatings) &&
        Objects.equals(this.numberOfReviews, itemAttributesRequest.numberOfReviews) &&
        Objects.equals(this.pattern, itemAttributesRequest.pattern) &&
        Objects.equals(this.price, itemAttributesRequest.price) &&
        Objects.equals(this.productType, itemAttributesRequest.productType) &&
        Objects.equals(this.salePrice, itemAttributesRequest.salePrice) &&
        Objects.equals(this.shipping, itemAttributesRequest.shipping) &&
        Objects.equals(this.shippingHeight, itemAttributesRequest.shippingHeight) &&
        Objects.equals(this.shippingWeight, itemAttributesRequest.shippingWeight) &&
        Objects.equals(this.shippingWidth, itemAttributesRequest.shippingWidth) &&
        Objects.equals(this.size, itemAttributesRequest.size) &&
        Objects.equals(this.sizeSystem, itemAttributesRequest.sizeSystem) &&
        Objects.equals(this.sizeType, itemAttributesRequest.sizeType) &&
        Objects.equals(this.tax, itemAttributesRequest.tax) &&
        Objects.equals(this.title, itemAttributesRequest.title) &&
        Objects.equals(this.variantNames, itemAttributesRequest.variantNames) &&
        Objects.equals(this.variantValues, itemAttributesRequest.variantValues) &&
        Objects.equals(this.additionalImageLink, itemAttributesRequest.additionalImageLink) &&
        Objects.equals(this.imageLink, itemAttributesRequest.imageLink) &&
        Objects.equals(this.videoLink, itemAttributesRequest.videoLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adLink, adult, ageGroup, availability, averageReviewRating, brand, checkoutEnabled, color, condition, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, description, freeShippingLabel, freeShippingLimit, gender, googleProductCategory, gtin, id, itemGroupId, lastUpdatedTime, link, material, minAdPrice, mobileLink, mpn, numberOfRatings, numberOfReviews, pattern, price, productType, salePrice, shipping, shippingHeight, shippingWeight, shippingWidth, size, sizeSystem, sizeType, tax, title, variantNames, variantValues, additionalImageLink, imageLink, videoLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAttributesRequest {\n");
    
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
    sb.append("    additionalImageLink: ").append(toIndentedString(additionalImageLink)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    videoLink: ").append(toIndentedString(videoLink)).append("\n");
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

