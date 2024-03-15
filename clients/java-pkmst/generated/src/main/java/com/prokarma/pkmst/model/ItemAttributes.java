package com.prokarma.pkmst.model;

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
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ItemAttributes
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ItemAttributes   {
  @JsonProperty("ad_link")
  private String adLink;

  @JsonProperty("adult")
  private Boolean adult;

  @JsonProperty("age_group")
  private String ageGroup;

  @JsonProperty("availability")
  private String availability;

  @JsonProperty("average_review_rating")
  private BigDecimal averageReviewRating;

  @JsonProperty("brand")
  private String brand;

  @JsonProperty("checkout_enabled")
  private Boolean checkoutEnabled;

  @JsonProperty("color")
  private String color;

  @JsonProperty("condition")
  private String condition;

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

  @JsonProperty("free_shipping_label")
  private Boolean freeShippingLabel;

  @JsonProperty("free_shipping_limit")
  private String freeShippingLimit;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("google_product_category")
  private String googleProductCategory;

  @JsonProperty("gtin")
  private Integer gtin;

  @JsonProperty("id")
  private String id;

  @JsonProperty("item_group_id")
  private String itemGroupId;

  @JsonProperty("last_updated_time")
  private Long lastUpdatedTime;

  @JsonProperty("link")
  private String link;

  @JsonProperty("material")
  private String material;

  @JsonProperty("min_ad_price")
  private String minAdPrice;

  @JsonProperty("mobile_link")
  private String mobileLink;

  @JsonProperty("mpn")
  private String mpn;

  @JsonProperty("number_of_ratings")
  private Integer numberOfRatings;

  @JsonProperty("number_of_reviews")
  private Integer numberOfReviews;

  @JsonProperty("pattern")
  private String pattern;

  @JsonProperty("price")
  private String price;

  @JsonProperty("product_type")
  private String productType;

  @JsonProperty("sale_price")
  private String salePrice;

  @JsonProperty("shipping")
  private String shipping;

  @JsonProperty("shipping_height")
  private String shippingHeight;

  @JsonProperty("shipping_weight")
  private String shippingWeight;

  @JsonProperty("shipping_width")
  private String shippingWidth;

  @JsonProperty("size")
  private String size;

  @JsonProperty("size_system")
  private String sizeSystem;

  @JsonProperty("size_type")
  private String sizeType;

  @JsonProperty("tax")
  private String tax;

  @JsonProperty("title")
  private String title;

  @JsonProperty("variant_names")
  
  private List<String> variantNames = null;

  @JsonProperty("variant_values")
  
  private List<String> variantValues = null;

  @JsonProperty("additional_image_link")
  
  private List<String> additionalImageLink = null;

  @JsonProperty("image_link")
  
  private List<String> imageLink = null;

  public ItemAttributes adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

   /**
   * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
   * @return adLink
  **/
  @ApiModelProperty(example = "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest", value = "Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.")
  public String getAdLink() {
    return adLink;
  }

  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  public ItemAttributes adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

   /**
   * Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
   * @return adult
  **/
  @ApiModelProperty(example = "true", value = "Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.")
  public Boolean getAdult() {
    return adult;
  }

  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  public ItemAttributes ageGroup(String ageGroup) {
    this.ageGroup = ageGroup;
    return this;
  }

   /**
   * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
   * @return ageGroup
  **/
  @ApiModelProperty(example = "newborn", value = "The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.")
  public String getAgeGroup() {
    return ageGroup;
  }

  public void setAgeGroup(String ageGroup) {
    this.ageGroup = ageGroup;
  }

  public ItemAttributes availability(String availability) {
    this.availability = availability;
    return this;
  }

   /**
   * The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
   * @return availability
  **/
  @ApiModelProperty(example = "in stock", value = "The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.")
  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }

  public ItemAttributes averageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
    return this;
  }

   /**
   * Average reviews for the item. Can be a number from 1-5.
   * @return averageReviewRating
  **/
  @ApiModelProperty(example = "5", value = "Average reviews for the item. Can be a number from 1-5.")
  public BigDecimal getAverageReviewRating() {
    return averageReviewRating;
  }

  public void setAverageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
  }

  public ItemAttributes brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the product.
   * @return brand
  **/
  @ApiModelProperty(example = "Josie’s Denim", value = "The brand of the product.")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public ItemAttributes checkoutEnabled(Boolean checkoutEnabled) {
    this.checkoutEnabled = checkoutEnabled;
    return this;
  }

   /**
   * This attribute is not supported anymore.
   * @return checkoutEnabled
  **/
  @ApiModelProperty(example = "false", value = "This attribute is not supported anymore.")
  public Boolean getCheckoutEnabled() {
    return checkoutEnabled;
  }

  public void setCheckoutEnabled(Boolean checkoutEnabled) {
    this.checkoutEnabled = checkoutEnabled;
  }

  public ItemAttributes color(String color) {
    this.color = color;
    return this;
  }

   /**
   * The primary color of the product.
   * @return color
  **/
  @ApiModelProperty(example = "blue", value = "The primary color of the product.")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public ItemAttributes condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
   * @return condition
  **/
  @ApiModelProperty(example = "new", value = "The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public ItemAttributes customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

   /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   * @return customLabel0
  **/
  @ApiModelProperty(example = "Best sellers", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  public String getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public ItemAttributes customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

   /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   * @return customLabel1
  **/
  @ApiModelProperty(example = "Summer promotion", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  public String getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public ItemAttributes customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

   /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   * @return customLabel2
  **/
  @ApiModelProperty(example = "Winter sales", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  public String getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public ItemAttributes customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

   /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   * @return customLabel3
  **/
  @ApiModelProperty(example = "Woman dress", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  public String getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public ItemAttributes customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

   /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   * @return customLabel4
  **/
  @ApiModelProperty(example = "Man hat", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  public String getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public ItemAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * <p><= 10000 characters</p> <p>The description of the product.</p>
   * @return description
  **/
  @ApiModelProperty(example = "Casual fit denim shirt made with the finest quality Japanese denim.", value = "<p><= 10000 characters</p> <p>The description of the product.</p>")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ItemAttributes freeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
    return this;
  }

   /**
   * The item is free to ship.
   * @return freeShippingLabel
  **/
  @ApiModelProperty(example = "true", value = "The item is free to ship.")
  public Boolean getFreeShippingLabel() {
    return freeShippingLabel;
  }

  public void setFreeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
  }

  public ItemAttributes freeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
    return this;
  }

   /**
   * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
   * @return freeShippingLimit
  **/
  @ApiModelProperty(example = "35 USD", value = "The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.")
  public String getFreeShippingLimit() {
    return freeShippingLimit;
  }

  public void setFreeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
  }

  public ItemAttributes gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
   * @return gender
  **/
  @ApiModelProperty(example = "unisex", value = "The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public ItemAttributes googleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
    return this;
  }

   /**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
   * @return googleProductCategory
  **/
  @ApiModelProperty(example = "Apparel & Accessories > Clothing > Shirts & Tops", value = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.")
  public String getGoogleProductCategory() {
    return googleProductCategory;
  }

  public void setGoogleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

  public ItemAttributes gtin(Integer gtin) {
    this.gtin = gtin;
    return this;
  }

   /**
   * The unique universal product identifier.
   * @return gtin
  **/
  @ApiModelProperty(example = "3234567890126", value = "The unique universal product identifier.")
  public Integer getGtin() {
    return gtin;
  }

  public void setGtin(Integer gtin) {
    this.gtin = gtin;
  }

  public ItemAttributes id(String id) {
    this.id = id;
    return this;
  }

   /**
   * <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
   * @return id
  **/
  @ApiModelProperty(example = "DS0294-L", value = "<p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ItemAttributes itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

   /**
   * <p><= 127 characters</p> <p>The parent ID of the product.</p>
   * @return itemGroupId
  **/
  @ApiModelProperty(example = "DS0294", value = "<p><= 127 characters</p> <p>The parent ID of the product.</p>")
  public String getItemGroupId() {
    return itemGroupId;
  }

  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  public ItemAttributes lastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

   /**
   * The millisecond timestamp when the item was lastly modified by the merchant.
   * @return lastUpdatedTime
  **/
  @ApiModelProperty(example = "1641483432072", value = "The millisecond timestamp when the item was lastly modified by the merchant.")
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public ItemAttributes link(String link) {
    this.link = link;
    return this;
  }

   /**
   * <p><= 511 characters</p> <p>The landing page for the product.</p>
   * @return link
  **/
  @ApiModelProperty(example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294", value = "<p><= 511 characters</p> <p>The landing page for the product.</p>")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public ItemAttributes material(String material) {
    this.material = material;
    return this;
  }

   /**
   * The material used to make the product.
   * @return material
  **/
  @ApiModelProperty(example = "cotton", value = "The material used to make the product.")
  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public ItemAttributes minAdPrice(String minAdPrice) {
    this.minAdPrice = minAdPrice;
    return this;
  }

   /**
   * The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
   * @return minAdPrice
  **/
  @ApiModelProperty(example = "19.99 USD", value = "The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.")
  public String getMinAdPrice() {
    return minAdPrice;
  }

  public void setMinAdPrice(String minAdPrice) {
    this.minAdPrice = minAdPrice;
  }

  public ItemAttributes mobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
    return this;
  }

   /**
   * The mobile-optimized version of your landing page. Must begin with http:// or https://.
   * @return mobileLink
  **/
  @ApiModelProperty(example = "https://m.example.com/cat/womens-clothing/denim-shirt-0294", value = "The mobile-optimized version of your landing page. Must begin with http:// or https://.")
  public String getMobileLink() {
    return mobileLink;
  }

  public void setMobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
  }

  public ItemAttributes mpn(String mpn) {
    this.mpn = mpn;
    return this;
  }

   /**
   * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
   * @return mpn
  **/
  @ApiModelProperty(example = "PI12345NTEREST", value = "Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.")
  public String getMpn() {
    return mpn;
  }

  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

  public ItemAttributes numberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
    return this;
  }

   /**
   * The number of ratings for the item.
   * @return numberOfRatings
  **/
  @ApiModelProperty(example = "10", value = "The number of ratings for the item.")
  public Integer getNumberOfRatings() {
    return numberOfRatings;
  }

  public void setNumberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
  }

  public ItemAttributes numberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
    return this;
  }

   /**
   * The number of reviews available for the item.
   * @return numberOfReviews
  **/
  @ApiModelProperty(example = "10", value = "The number of reviews available for the item.")
  public Integer getNumberOfReviews() {
    return numberOfReviews;
  }

  public void setNumberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
  }

  public ItemAttributes pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * The description of the pattern used for the product.
   * @return pattern
  **/
  @ApiModelProperty(example = "plaid", value = "The description of the pattern used for the product.")
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public ItemAttributes price(String price) {
    this.price = price;
    return this;
  }

   /**
   * The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
   * @return price
  **/
  @ApiModelProperty(example = "24.99 USD", value = "The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public ItemAttributes productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
   * @return productType
  **/
  @ApiModelProperty(example = "Clothing > Women’s > Shirts > Denim", value = "<p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public ItemAttributes salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

   /**
   * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
   * @return salePrice
  **/
  @ApiModelProperty(example = "14.99 USD", value = "The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.")
  public String getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  public ItemAttributes shipping(String shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
   * @return shipping
  **/
  @ApiModelProperty(example = "US:CA:Ground:0 USD", value = "Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.")
  public String getShipping() {
    return shipping;
  }

  public void setShipping(String shipping) {
    this.shipping = shipping;
  }

  public ItemAttributes shippingHeight(String shippingHeight) {
    this.shippingHeight = shippingHeight;
    return this;
  }

   /**
   * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingHeight
  **/
  @ApiModelProperty(example = "12 in", value = "The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
  public String getShippingHeight() {
    return shippingHeight;
  }

  public void setShippingHeight(String shippingHeight) {
    this.shippingHeight = shippingHeight;
  }

  public ItemAttributes shippingWeight(String shippingWeight) {
    this.shippingWeight = shippingWeight;
    return this;
  }

   /**
   * The weight of the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingWeight
  **/
  @ApiModelProperty(example = "3 kg", value = "The weight of the product. Ensure there is a space between the numeric string and the metric.")
  public String getShippingWeight() {
    return shippingWeight;
  }

  public void setShippingWeight(String shippingWeight) {
    this.shippingWeight = shippingWeight;
  }

  public ItemAttributes shippingWidth(String shippingWidth) {
    this.shippingWidth = shippingWidth;
    return this;
  }

   /**
   * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingWidth
  **/
  @ApiModelProperty(example = "16 in", value = "The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
  public String getShippingWidth() {
    return shippingWidth;
  }

  public void setShippingWidth(String shippingWidth) {
    this.shippingWidth = shippingWidth;
  }

  public ItemAttributes size(String size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the product.
   * @return size
  **/
  @ApiModelProperty(example = "M", value = "The size of the product.")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public ItemAttributes sizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
    return this;
  }

   /**
   * Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
   * @return sizeSystem
  **/
  @ApiModelProperty(example = "US", value = "Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.")
  public String getSizeSystem() {
    return sizeSystem;
  }

  public void setSizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
  }

  public ItemAttributes sizeType(String sizeType) {
    this.sizeType = sizeType;
    return this;
  }

   /**
   * Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
   * @return sizeType
  **/
  @ApiModelProperty(example = "regular", value = "Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.")
  public String getSizeType() {
    return sizeType;
  }

  public void setSizeType(String sizeType) {
    this.sizeType = sizeType;
  }

  public ItemAttributes tax(String tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
   * @return tax
  **/
  @ApiModelProperty(example = "US:1025433:6.00:y", value = "Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.")
  public String getTax() {
    return tax;
  }

  public void setTax(String tax) {
    this.tax = tax;
  }

  public ItemAttributes title(String title) {
    this.title = title;
    return this;
  }

   /**
   * <p><= 500 characters</p> <p>The name of the product.</p>
   * @return title
  **/
  @ApiModelProperty(example = "Women’s denim shirt, large", value = "<p><= 500 characters</p> <p>The name of the product.</p>")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ItemAttributes variantNames(List<String> variantNames) {
    this.variantNames = variantNames;
    return this;
  }

  public ItemAttributes addVariantNamesItem(String variantNamesItem) {
    if (this.variantNames == null) {
      this.variantNames = new ArrayList<>();
    }
    this.variantNames.add(variantNamesItem);
    return this;
  }

   /**
   * Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
   * @return variantNames
  **/
  @ApiModelProperty(example = "[Color, Size]", value = "Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.")
  public List<String> getVariantNames() {
    return variantNames;
  }

  public void setVariantNames(List<String> variantNames) {
    this.variantNames = variantNames;
  }

  public ItemAttributes variantValues(List<String> variantValues) {
    this.variantValues = variantValues;
    return this;
  }

  public ItemAttributes addVariantValuesItem(String variantValuesItem) {
    if (this.variantValues == null) {
      this.variantValues = new ArrayList<>();
    }
    this.variantValues.add(variantValuesItem);
    return this;
  }

   /**
   * Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
   * @return variantValues
  **/
  @ApiModelProperty(example = "[Red, Small]", value = "Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.")
  public List<String> getVariantValues() {
    return variantValues;
  }

  public void setVariantValues(List<String> variantValues) {
    this.variantValues = variantValues;
  }

  public ItemAttributes additionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
    return this;
  }

  public ItemAttributes addAdditionalImageLinkItem(String additionalImageLinkItem) {
    if (this.additionalImageLink == null) {
      this.additionalImageLink = new ArrayList<>();
    }
    this.additionalImageLink.add(additionalImageLinkItem);
    return this;
  }

   /**
   * <p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>
   * @return additionalImageLink
  **/
  @ApiModelProperty(example = "[\"https://scene.example.com/image/image_v2.jpg\",\"https://scene.example.com/image/image_v3.jpg\"]", value = "<p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>")
  public List<String> getAdditionalImageLink() {
    return additionalImageLink;
  }

  public void setAdditionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
  }

  public ItemAttributes imageLink(List<String> imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  public ItemAttributes addImageLinkItem(String imageLinkItem) {
    if (this.imageLink == null) {
      this.imageLink = new ArrayList<>();
    }
    this.imageLink.add(imageLinkItem);
    return this;
  }

   /**
   * <p><= 2000 characters</p> <p>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
   * @return imageLink
  **/
  @ApiModelProperty(example = "[\"https://scene.example.com/image/image.jpg\"]", value = "<p><= 2000 characters</p> <p>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>")
  public List<String> getImageLink() {
    return imageLink;
  }

  public void setImageLink(List<String> imageLink) {
    this.imageLink = imageLink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemAttributes itemAttributes = (ItemAttributes) o;
    return Objects.equals(this.adLink, itemAttributes.adLink) &&
        Objects.equals(this.adult, itemAttributes.adult) &&
        Objects.equals(this.ageGroup, itemAttributes.ageGroup) &&
        Objects.equals(this.availability, itemAttributes.availability) &&
        Objects.equals(this.averageReviewRating, itemAttributes.averageReviewRating) &&
        Objects.equals(this.brand, itemAttributes.brand) &&
        Objects.equals(this.checkoutEnabled, itemAttributes.checkoutEnabled) &&
        Objects.equals(this.color, itemAttributes.color) &&
        Objects.equals(this.condition, itemAttributes.condition) &&
        Objects.equals(this.customLabel0, itemAttributes.customLabel0) &&
        Objects.equals(this.customLabel1, itemAttributes.customLabel1) &&
        Objects.equals(this.customLabel2, itemAttributes.customLabel2) &&
        Objects.equals(this.customLabel3, itemAttributes.customLabel3) &&
        Objects.equals(this.customLabel4, itemAttributes.customLabel4) &&
        Objects.equals(this.description, itemAttributes.description) &&
        Objects.equals(this.freeShippingLabel, itemAttributes.freeShippingLabel) &&
        Objects.equals(this.freeShippingLimit, itemAttributes.freeShippingLimit) &&
        Objects.equals(this.gender, itemAttributes.gender) &&
        Objects.equals(this.googleProductCategory, itemAttributes.googleProductCategory) &&
        Objects.equals(this.gtin, itemAttributes.gtin) &&
        Objects.equals(this.id, itemAttributes.id) &&
        Objects.equals(this.itemGroupId, itemAttributes.itemGroupId) &&
        Objects.equals(this.lastUpdatedTime, itemAttributes.lastUpdatedTime) &&
        Objects.equals(this.link, itemAttributes.link) &&
        Objects.equals(this.material, itemAttributes.material) &&
        Objects.equals(this.minAdPrice, itemAttributes.minAdPrice) &&
        Objects.equals(this.mobileLink, itemAttributes.mobileLink) &&
        Objects.equals(this.mpn, itemAttributes.mpn) &&
        Objects.equals(this.numberOfRatings, itemAttributes.numberOfRatings) &&
        Objects.equals(this.numberOfReviews, itemAttributes.numberOfReviews) &&
        Objects.equals(this.pattern, itemAttributes.pattern) &&
        Objects.equals(this.price, itemAttributes.price) &&
        Objects.equals(this.productType, itemAttributes.productType) &&
        Objects.equals(this.salePrice, itemAttributes.salePrice) &&
        Objects.equals(this.shipping, itemAttributes.shipping) &&
        Objects.equals(this.shippingHeight, itemAttributes.shippingHeight) &&
        Objects.equals(this.shippingWeight, itemAttributes.shippingWeight) &&
        Objects.equals(this.shippingWidth, itemAttributes.shippingWidth) &&
        Objects.equals(this.size, itemAttributes.size) &&
        Objects.equals(this.sizeSystem, itemAttributes.sizeSystem) &&
        Objects.equals(this.sizeType, itemAttributes.sizeType) &&
        Objects.equals(this.tax, itemAttributes.tax) &&
        Objects.equals(this.title, itemAttributes.title) &&
        Objects.equals(this.variantNames, itemAttributes.variantNames) &&
        Objects.equals(this.variantValues, itemAttributes.variantValues) &&
        Objects.equals(this.additionalImageLink, itemAttributes.additionalImageLink) &&
        Objects.equals(this.imageLink, itemAttributes.imageLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adLink, adult, ageGroup, availability, averageReviewRating, brand, checkoutEnabled, color, condition, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, description, freeShippingLabel, freeShippingLimit, gender, googleProductCategory, gtin, id, itemGroupId, lastUpdatedTime, link, material, minAdPrice, mobileLink, mpn, numberOfRatings, numberOfReviews, pattern, price, productType, salePrice, shipping, shippingHeight, shippingWeight, shippingWidth, size, sizeSystem, sizeType, tax, title, variantNames, variantValues, additionalImageLink, imageLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAttributes {\n");
    
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

