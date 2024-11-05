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
import org.openapitools.model.ItemAttributesRequestAllOfImageLink;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ItemAttributesRequest   {
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
  private ItemAttributesRequestAllOfImageLink imageLink;

  @JsonProperty("video_link")
  private String videoLink;

  /**
   * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
   **/
  public ItemAttributesRequest adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest", value = "Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.")
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }
  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  /**
   * Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
   **/
  public ItemAttributesRequest adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.")
  @JsonProperty("adult")
  public Boolean getAdult() {
    return adult;
  }
  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  /**
   * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
   **/
  public ItemAttributesRequest ageGroup(String ageGroup) {
    this.ageGroup = ageGroup;
    return this;
  }

  
  @ApiModelProperty(example = "newborn", value = "The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.")
  @JsonProperty("age_group")
  public String getAgeGroup() {
    return ageGroup;
  }
  public void setAgeGroup(String ageGroup) {
    this.ageGroup = ageGroup;
  }

  /**
   * The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.
   **/
  public ItemAttributesRequest availability(String availability) {
    this.availability = availability;
    return this;
  }

  
  @ApiModelProperty(example = "in stock", value = "The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.")
  @JsonProperty("availability")
  public String getAvailability() {
    return availability;
  }
  public void setAvailability(String availability) {
    this.availability = availability;
  }

  /**
   * Average reviews for the item. Can be a number from 1-5.
   **/
  public ItemAttributesRequest averageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
    return this;
  }

  
  @ApiModelProperty(example = "5", value = "Average reviews for the item. Can be a number from 1-5.")
  @JsonProperty("average_review_rating")
  public BigDecimal getAverageReviewRating() {
    return averageReviewRating;
  }
  public void setAverageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
  }

  /**
   * The brand of the product.
   **/
  public ItemAttributesRequest brand(String brand) {
    this.brand = brand;
    return this;
  }

  
  @ApiModelProperty(example = "Josie’s Denim", value = "The brand of the product.")
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

  /**
   * This attribute is not supported anymore.
   **/
  public ItemAttributesRequest checkoutEnabled(Boolean checkoutEnabled) {
    this.checkoutEnabled = checkoutEnabled;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "This attribute is not supported anymore.")
  @JsonProperty("checkout_enabled")
  public Boolean getCheckoutEnabled() {
    return checkoutEnabled;
  }
  public void setCheckoutEnabled(Boolean checkoutEnabled) {
    this.checkoutEnabled = checkoutEnabled;
  }

  /**
   * The primary color of the product.
   **/
  public ItemAttributesRequest color(String color) {
    this.color = color;
    return this;
  }

  
  @ApiModelProperty(example = "blue", value = "The primary color of the product.")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
   **/
  public ItemAttributesRequest condition(String condition) {
    this.condition = condition;
    return this;
  }

  
  @ApiModelProperty(example = "new", value = "The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.")
  @JsonProperty("condition")
  public String getCondition() {
    return condition;
  }
  public void setCondition(String condition) {
    this.condition = condition;
  }

  /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   **/
  public ItemAttributesRequest customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

  
  @ApiModelProperty(example = "Best sellers", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  @JsonProperty("custom_label_0")
  public String getCustomLabel0() {
    return customLabel0;
  }
  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   **/
  public ItemAttributesRequest customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

  
  @ApiModelProperty(example = "Summer promotion", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  @JsonProperty("custom_label_1")
  public String getCustomLabel1() {
    return customLabel1;
  }
  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   **/
  public ItemAttributesRequest customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

  
  @ApiModelProperty(example = "Winter sales", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  @JsonProperty("custom_label_2")
  public String getCustomLabel2() {
    return customLabel2;
  }
  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   **/
  public ItemAttributesRequest customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

  
  @ApiModelProperty(example = "Woman dress", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  @JsonProperty("custom_label_3")
  public String getCustomLabel3() {
    return customLabel3;
  }
  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  /**
   * <p><= 1000 characters</p> <p>Custom grouping of products.</p>
   **/
  public ItemAttributesRequest customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

  
  @ApiModelProperty(example = "Man hat", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  @JsonProperty("custom_label_4")
  public String getCustomLabel4() {
    return customLabel4;
  }
  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  /**
   * <p><= 10000 characters</p> <p>The description of the product.</p>
   **/
  public ItemAttributesRequest description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "Casual fit denim shirt made with the finest quality Japanese denim.", value = "<p><= 10000 characters</p> <p>The description of the product.</p>")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The item is free to ship.
   **/
  public ItemAttributesRequest freeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "The item is free to ship.")
  @JsonProperty("free_shipping_label")
  public Boolean getFreeShippingLabel() {
    return freeShippingLabel;
  }
  public void setFreeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
  }

  /**
   * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
   **/
  public ItemAttributesRequest freeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
    return this;
  }

  
  @ApiModelProperty(example = "35 USD", value = "The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.")
  @JsonProperty("free_shipping_limit")
  public String getFreeShippingLimit() {
    return freeShippingLimit;
  }
  public void setFreeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
  }

  /**
   * The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.
   **/
  public ItemAttributesRequest gender(String gender) {
    this.gender = gender;
    return this;
  }

  
  @ApiModelProperty(example = "unisex", value = "The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.")
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

  /**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
   **/
  public ItemAttributesRequest googleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
    return this;
  }

  
  @ApiModelProperty(example = "Apparel & Accessories > Clothing > Shirts & Tops", value = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.")
  @JsonProperty("google_product_category")
  public String getGoogleProductCategory() {
    return googleProductCategory;
  }
  public void setGoogleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

  /**
   * The unique universal product identifier.
   **/
  public ItemAttributesRequest gtin(Integer gtin) {
    this.gtin = gtin;
    return this;
  }

  
  @ApiModelProperty(example = "3234567890126", value = "The unique universal product identifier.")
  @JsonProperty("gtin")
  public Integer getGtin() {
    return gtin;
  }
  public void setGtin(Integer gtin) {
    this.gtin = gtin;
  }

  /**
   * <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
   **/
  public ItemAttributesRequest id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-L", value = "<p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * <p><= 127 characters</p> <p>The parent ID of the product.</p>
   **/
  public ItemAttributesRequest itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294", value = "<p><= 127 characters</p> <p>The parent ID of the product.</p>")
  @JsonProperty("item_group_id")
  public String getItemGroupId() {
    return itemGroupId;
  }
  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  /**
   * The millisecond timestamp when the item was lastly modified by the merchant.
   **/
  public ItemAttributesRequest lastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  
  @ApiModelProperty(example = "1641483432072", value = "The millisecond timestamp when the item was lastly modified by the merchant.")
  @JsonProperty("last_updated_time")
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }
  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  /**
   * <p><= 511 characters</p> <p>The landing page for the product.</p>
   **/
  public ItemAttributesRequest link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294", value = "<p><= 511 characters</p> <p>The landing page for the product.</p>")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   * The material used to make the product.
   **/
  public ItemAttributesRequest material(String material) {
    this.material = material;
    return this;
  }

  
  @ApiModelProperty(example = "cotton", value = "The material used to make the product.")
  @JsonProperty("material")
  public String getMaterial() {
    return material;
  }
  public void setMaterial(String material) {
    this.material = material;
  }

  /**
   * The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
   **/
  public ItemAttributesRequest minAdPrice(String minAdPrice) {
    this.minAdPrice = minAdPrice;
    return this;
  }

  
  @ApiModelProperty(example = "19.99 USD", value = "The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.")
  @JsonProperty("min_ad_price")
  public String getMinAdPrice() {
    return minAdPrice;
  }
  public void setMinAdPrice(String minAdPrice) {
    this.minAdPrice = minAdPrice;
  }

  /**
   * The mobile-optimized version of your landing page. Must begin with http:// or https://.
   **/
  public ItemAttributesRequest mobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
    return this;
  }

  
  @ApiModelProperty(example = "https://m.example.com/cat/womens-clothing/denim-shirt-0294", value = "The mobile-optimized version of your landing page. Must begin with http:// or https://.")
  @JsonProperty("mobile_link")
  public String getMobileLink() {
    return mobileLink;
  }
  public void setMobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
  }

  /**
   * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
   **/
  public ItemAttributesRequest mpn(String mpn) {
    this.mpn = mpn;
    return this;
  }

  
  @ApiModelProperty(example = "PI12345NTEREST", value = "Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.")
  @JsonProperty("mpn")
  public String getMpn() {
    return mpn;
  }
  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

  /**
   * The number of ratings for the item.
   **/
  public ItemAttributesRequest numberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
    return this;
  }

  
  @ApiModelProperty(example = "10", value = "The number of ratings for the item.")
  @JsonProperty("number_of_ratings")
  public Integer getNumberOfRatings() {
    return numberOfRatings;
  }
  public void setNumberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
  }

  /**
   * The number of reviews available for the item.
   **/
  public ItemAttributesRequest numberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
    return this;
  }

  
  @ApiModelProperty(example = "10", value = "The number of reviews available for the item.")
  @JsonProperty("number_of_reviews")
  public Integer getNumberOfReviews() {
    return numberOfReviews;
  }
  public void setNumberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
  }

  /**
   * The description of the pattern used for the product.
   **/
  public ItemAttributesRequest pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  
  @ApiModelProperty(example = "plaid", value = "The description of the pattern used for the product.")
  @JsonProperty("pattern")
  public String getPattern() {
    return pattern;
  }
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  /**
   * The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
   **/
  public ItemAttributesRequest price(String price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(example = "24.99 USD", value = "The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
   **/
  public ItemAttributesRequest productType(String productType) {
    this.productType = productType;
    return this;
  }

  
  @ApiModelProperty(example = "Clothing > Women’s > Shirts > Denim", value = "<p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>")
  @JsonProperty("product_type")
  public String getProductType() {
    return productType;
  }
  public void setProductType(String productType) {
    this.productType = productType;
  }

  /**
   * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
   **/
  public ItemAttributesRequest salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

  
  @ApiModelProperty(example = "14.99 USD", value = "The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.")
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }
  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  /**
   * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
   **/
  public ItemAttributesRequest shipping(String shipping) {
    this.shipping = shipping;
    return this;
  }

  
  @ApiModelProperty(example = "US:CA:Ground:0 USD", value = "Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.")
  @JsonProperty("shipping")
  public String getShipping() {
    return shipping;
  }
  public void setShipping(String shipping) {
    this.shipping = shipping;
  }

  /**
   * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   **/
  public ItemAttributesRequest shippingHeight(String shippingHeight) {
    this.shippingHeight = shippingHeight;
    return this;
  }

  
  @ApiModelProperty(example = "12 in", value = "The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
  @JsonProperty("shipping_height")
  public String getShippingHeight() {
    return shippingHeight;
  }
  public void setShippingHeight(String shippingHeight) {
    this.shippingHeight = shippingHeight;
  }

  /**
   * The weight of the product. Ensure there is a space between the numeric string and the metric.
   **/
  public ItemAttributesRequest shippingWeight(String shippingWeight) {
    this.shippingWeight = shippingWeight;
    return this;
  }

  
  @ApiModelProperty(example = "3 kg", value = "The weight of the product. Ensure there is a space between the numeric string and the metric.")
  @JsonProperty("shipping_weight")
  public String getShippingWeight() {
    return shippingWeight;
  }
  public void setShippingWeight(String shippingWeight) {
    this.shippingWeight = shippingWeight;
  }

  /**
   * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   **/
  public ItemAttributesRequest shippingWidth(String shippingWidth) {
    this.shippingWidth = shippingWidth;
    return this;
  }

  
  @ApiModelProperty(example = "16 in", value = "The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
  @JsonProperty("shipping_width")
  public String getShippingWidth() {
    return shippingWidth;
  }
  public void setShippingWidth(String shippingWidth) {
    this.shippingWidth = shippingWidth;
  }

  /**
   * The size of the product.
   **/
  public ItemAttributesRequest size(String size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(example = "M", value = "The size of the product.")
  @JsonProperty("size")
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }

  /**
   * Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.
   **/
  public ItemAttributesRequest sizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
    return this;
  }

  
  @ApiModelProperty(example = "US", value = "Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.")
  @JsonProperty("size_system")
  public String getSizeSystem() {
    return sizeSystem;
  }
  public void setSizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
  }

  /**
   * Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.
   **/
  public ItemAttributesRequest sizeType(String sizeType) {
    this.sizeType = sizeType;
    return this;
  }

  
  @ApiModelProperty(example = "regular", value = "Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.")
  @JsonProperty("size_type")
  public String getSizeType() {
    return sizeType;
  }
  public void setSizeType(String sizeType) {
    this.sizeType = sizeType;
  }

  /**
   * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
   **/
  public ItemAttributesRequest tax(String tax) {
    this.tax = tax;
    return this;
  }

  
  @ApiModelProperty(example = "US:1025433:6.00:y", value = "Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.")
  @JsonProperty("tax")
  public String getTax() {
    return tax;
  }
  public void setTax(String tax) {
    this.tax = tax;
  }

  /**
   * <p><= 500 characters</p> <p>The name of the product.</p>
   **/
  public ItemAttributesRequest title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(example = "Women’s denim shirt, large", value = "<p><= 500 characters</p> <p>The name of the product.</p>")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
   **/
  public ItemAttributesRequest variantNames(List<String> variantNames) {
    this.variantNames = variantNames;
    return this;
  }

  
  @ApiModelProperty(example = "[Color, Size]", value = "Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.")
  @JsonProperty("variant_names")
  public List<String> getVariantNames() {
    return variantNames;
  }
  public void setVariantNames(List<String> variantNames) {
    this.variantNames = variantNames;
  }

  /**
   * Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
   **/
  public ItemAttributesRequest variantValues(List<String> variantValues) {
    this.variantValues = variantValues;
    return this;
  }

  
  @ApiModelProperty(example = "[Red, Small]", value = "Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.")
  @JsonProperty("variant_values")
  public List<String> getVariantValues() {
    return variantValues;
  }
  public void setVariantValues(List<String> variantValues) {
    this.variantValues = variantValues;
  }

  /**
   * <p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>
   **/
  public ItemAttributesRequest additionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
    return this;
  }

  
  @ApiModelProperty(example = "[\"https://scene.example.com/image/image_v2.jpg\",\"https://scene.example.com/image/image_v3.jpg\"]", value = "<p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>")
  @JsonProperty("additional_image_link")
  public List<String> getAdditionalImageLink() {
    return additionalImageLink;
  }
  public void setAdditionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
  }

  /**
   **/
  public ItemAttributesRequest imageLink(ItemAttributesRequestAllOfImageLink imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("image_link")
  public ItemAttributesRequestAllOfImageLink getImageLink() {
    return imageLink;
  }
  public void setImageLink(ItemAttributesRequestAllOfImageLink imageLink) {
    this.imageLink = imageLink;
  }

  /**
   * <p><= 2,000 characters</p> <p>Hosted link to the product video.</p> <p>File types for linked videos must be .mp4, .mov or .m4v.</p> <p>File size cannot exceed 2GB.</p>
   **/
  public ItemAttributesRequest videoLink(String videoLink) {
    this.videoLink = videoLink;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294.mp4", value = "<p><= 2,000 characters</p> <p>Hosted link to the product video.</p> <p>File types for linked videos must be .mp4, .mov or .m4v.</p> <p>File size cannot exceed 2GB.</p>")
  @JsonProperty("video_link")
  public String getVideoLink() {
    return videoLink;
  }
  public void setVideoLink(String videoLink) {
    this.videoLink = videoLink;
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
    return Objects.equals(adLink, itemAttributesRequest.adLink) &&
        Objects.equals(adult, itemAttributesRequest.adult) &&
        Objects.equals(ageGroup, itemAttributesRequest.ageGroup) &&
        Objects.equals(availability, itemAttributesRequest.availability) &&
        Objects.equals(averageReviewRating, itemAttributesRequest.averageReviewRating) &&
        Objects.equals(brand, itemAttributesRequest.brand) &&
        Objects.equals(checkoutEnabled, itemAttributesRequest.checkoutEnabled) &&
        Objects.equals(color, itemAttributesRequest.color) &&
        Objects.equals(condition, itemAttributesRequest.condition) &&
        Objects.equals(customLabel0, itemAttributesRequest.customLabel0) &&
        Objects.equals(customLabel1, itemAttributesRequest.customLabel1) &&
        Objects.equals(customLabel2, itemAttributesRequest.customLabel2) &&
        Objects.equals(customLabel3, itemAttributesRequest.customLabel3) &&
        Objects.equals(customLabel4, itemAttributesRequest.customLabel4) &&
        Objects.equals(description, itemAttributesRequest.description) &&
        Objects.equals(freeShippingLabel, itemAttributesRequest.freeShippingLabel) &&
        Objects.equals(freeShippingLimit, itemAttributesRequest.freeShippingLimit) &&
        Objects.equals(gender, itemAttributesRequest.gender) &&
        Objects.equals(googleProductCategory, itemAttributesRequest.googleProductCategory) &&
        Objects.equals(gtin, itemAttributesRequest.gtin) &&
        Objects.equals(id, itemAttributesRequest.id) &&
        Objects.equals(itemGroupId, itemAttributesRequest.itemGroupId) &&
        Objects.equals(lastUpdatedTime, itemAttributesRequest.lastUpdatedTime) &&
        Objects.equals(link, itemAttributesRequest.link) &&
        Objects.equals(material, itemAttributesRequest.material) &&
        Objects.equals(minAdPrice, itemAttributesRequest.minAdPrice) &&
        Objects.equals(mobileLink, itemAttributesRequest.mobileLink) &&
        Objects.equals(mpn, itemAttributesRequest.mpn) &&
        Objects.equals(numberOfRatings, itemAttributesRequest.numberOfRatings) &&
        Objects.equals(numberOfReviews, itemAttributesRequest.numberOfReviews) &&
        Objects.equals(pattern, itemAttributesRequest.pattern) &&
        Objects.equals(price, itemAttributesRequest.price) &&
        Objects.equals(productType, itemAttributesRequest.productType) &&
        Objects.equals(salePrice, itemAttributesRequest.salePrice) &&
        Objects.equals(shipping, itemAttributesRequest.shipping) &&
        Objects.equals(shippingHeight, itemAttributesRequest.shippingHeight) &&
        Objects.equals(shippingWeight, itemAttributesRequest.shippingWeight) &&
        Objects.equals(shippingWidth, itemAttributesRequest.shippingWidth) &&
        Objects.equals(size, itemAttributesRequest.size) &&
        Objects.equals(sizeSystem, itemAttributesRequest.sizeSystem) &&
        Objects.equals(sizeType, itemAttributesRequest.sizeType) &&
        Objects.equals(tax, itemAttributesRequest.tax) &&
        Objects.equals(title, itemAttributesRequest.title) &&
        Objects.equals(variantNames, itemAttributesRequest.variantNames) &&
        Objects.equals(variantValues, itemAttributesRequest.variantValues) &&
        Objects.equals(additionalImageLink, itemAttributesRequest.additionalImageLink) &&
        Objects.equals(imageLink, itemAttributesRequest.imageLink) &&
        Objects.equals(videoLink, itemAttributesRequest.videoLink);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

