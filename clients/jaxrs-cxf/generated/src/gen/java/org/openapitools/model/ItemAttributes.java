package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemAttributes  {
  
  @ApiModelProperty(example = "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest", value = "Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.")
 /**
   * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
  **/
  private String adLink;

  @ApiModelProperty(example = "[\"https://scene.example.com/image/image_v2.jpg\",\"https://scene.example.com/image/image_v3.jpg\"]", value = "The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https://")
 /**
   * The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https://
  **/
  private List<String> additionalImageLink = null;

  @ApiModelProperty(example = "true", value = "Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.")
 /**
   * Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
  **/
  private Boolean adult;

  @ApiModelProperty(example = "newborn", value = "The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.")
 /**
   * The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.
  **/
  private String ageGroup;

  @ApiModelProperty(example = "in stock", value = "The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.")
 /**
   * The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.
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

  @ApiModelProperty(example = "blue", value = "The primary color of the product.")
 /**
   * The primary color of the product.
  **/
  private String color;

  @ApiModelProperty(example = "new", value = "The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.")
 /**
   * The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.
  **/
  private String condition;

  @ApiModelProperty(example = "Best sellers", value = "Custom grouping of products.")
 /**
   * Custom grouping of products.
  **/
  private String customLabel0;

  @ApiModelProperty(example = "Summer promotion", value = "Custom grouping of products.")
 /**
   * Custom grouping of products.
  **/
  private String customLabel1;

  @ApiModelProperty(example = "Winter sales", value = "Custom grouping of products.")
 /**
   * Custom grouping of products.
  **/
  private String customLabel2;

  @ApiModelProperty(example = "Woman dress", value = "Custom grouping of products.")
 /**
   * Custom grouping of products.
  **/
  private String customLabel3;

  @ApiModelProperty(example = "Man hat", value = "Custom grouping of products.")
 /**
   * Custom grouping of products.
  **/
  private String customLabel4;

  @ApiModelProperty(example = "Casual fit denim shirt made with the finest quality Japanese denim.", value = "The description of the product.")
 /**
   * The description of the product.
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

  @ApiModelProperty(example = "unisex", value = "The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.")
 /**
   * The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.
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

  @ApiModelProperty(example = "DS0294-L", value = "The user-created unique ID that represents the product. Only Unicode characters are accepted.")
 /**
   * The user-created unique ID that represents the product. Only Unicode characters are accepted.
  **/
  private String id;

  @ApiModelProperty(example = "[\"https://scene.example.com/image/image.jpg\"]", value = "The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://")
 /**
   * The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://
  **/
  private List<String> imageLink = null;

  @ApiModelProperty(example = "DS0294", value = "The parent ID of the product.")
 /**
   * The parent ID of the product.
  **/
  private String itemGroupId;

  @ApiModelProperty(example = "1641483432072", value = "The millisecond timestamp when the item was lastly modified by the merchant.")
 /**
   * The millisecond timestamp when the item was lastly modified by the merchant.
  **/
  private Long lastUpdatedTime;

  @ApiModelProperty(example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294", value = "The landing page for the product.")
 /**
   * The landing page for the product.
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

  @ApiModelProperty(example = "Clothing > Women’s > Shirts > Denim", value = "The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.")
 /**
   * The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.
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

  @ApiModelProperty(example = "US", value = "Indicates the country’s sizing system in which you are submitting your product.")
 /**
   * Indicates the country’s sizing system in which you are submitting your product.
  **/
  private String sizeSystem;

  @ApiModelProperty(example = "regular", value = "Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.")
 /**
   * Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.
  **/
  private String sizeType;

  @ApiModelProperty(example = "US:1025433:6.00:y", value = "Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.")
 /**
   * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
  **/
  private String tax;

  @ApiModelProperty(example = "Women’s denim shirt, large", value = "The name of the product.")
 /**
   * The name of the product.
  **/
  private String title;
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

  public ItemAttributes adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

 /**
   * The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https://
   * @return additionalImageLink
  **/
  @JsonProperty("additional_image_link")
  public List<String> getAdditionalImageLink() {
    return additionalImageLink;
  }

  public void setAdditionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
  }

  public ItemAttributes additionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
    return this;
  }

  public ItemAttributes addAdditionalImageLinkItem(String additionalImageLinkItem) {
    this.additionalImageLink.add(additionalImageLinkItem);
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

  public ItemAttributes adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

 /**
   * The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.
   * @return ageGroup
  **/
  @JsonProperty("age_group")
  public String getAgeGroup() {
    return ageGroup;
  }

  public void setAgeGroup(String ageGroup) {
    this.ageGroup = ageGroup;
  }

  public ItemAttributes ageGroup(String ageGroup) {
    this.ageGroup = ageGroup;
    return this;
  }

 /**
   * The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.
   * @return availability
  **/
  @JsonProperty("availability")
  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }

  public ItemAttributes availability(String availability) {
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

  public ItemAttributes averageReviewRating(BigDecimal averageReviewRating) {
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

  public ItemAttributes brand(String brand) {
    this.brand = brand;
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

  public ItemAttributes color(String color) {
    this.color = color;
    return this;
  }

 /**
   * The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.
   * @return condition
  **/
  @JsonProperty("condition")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public ItemAttributes condition(String condition) {
    this.condition = condition;
    return this;
  }

 /**
   * Custom grouping of products.
   * @return customLabel0
  **/
  @JsonProperty("custom_label_0")
 @Size(max=1000)  public String getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public ItemAttributes customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

 /**
   * Custom grouping of products.
   * @return customLabel1
  **/
  @JsonProperty("custom_label_1")
 @Size(max=1000)  public String getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public ItemAttributes customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

 /**
   * Custom grouping of products.
   * @return customLabel2
  **/
  @JsonProperty("custom_label_2")
 @Size(max=1000)  public String getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public ItemAttributes customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

 /**
   * Custom grouping of products.
   * @return customLabel3
  **/
  @JsonProperty("custom_label_3")
 @Size(max=1000)  public String getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public ItemAttributes customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

 /**
   * Custom grouping of products.
   * @return customLabel4
  **/
  @JsonProperty("custom_label_4")
 @Size(max=1000)  public String getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public ItemAttributes customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

 /**
   * The description of the product.
   * @return description
  **/
  @JsonProperty("description")
 @Size(max=10000)  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ItemAttributes description(String description) {
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

  public ItemAttributes freeShippingLabel(Boolean freeShippingLabel) {
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

  public ItemAttributes freeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
    return this;
  }

 /**
   * The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.
   * @return gender
  **/
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public ItemAttributes gender(String gender) {
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

  public ItemAttributes googleProductCategory(String googleProductCategory) {
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

  public ItemAttributes gtin(Integer gtin) {
    this.gtin = gtin;
    return this;
  }

 /**
   * The user-created unique ID that represents the product. Only Unicode characters are accepted.
   * @return id
  **/
  @JsonProperty("id")
 @Size(max=127)  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ItemAttributes id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://
   * @return imageLink
  **/
  @JsonProperty("image_link")
 @Size(min=1)  public List<String> getImageLink() {
    return imageLink;
  }

  public void setImageLink(List<String> imageLink) {
    this.imageLink = imageLink;
  }

  public ItemAttributes imageLink(List<String> imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  public ItemAttributes addImageLinkItem(String imageLinkItem) {
    this.imageLink.add(imageLinkItem);
    return this;
  }

 /**
   * The parent ID of the product.
   * @return itemGroupId
  **/
  @JsonProperty("item_group_id")
 @Size(max=127)  public String getItemGroupId() {
    return itemGroupId;
  }

  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  public ItemAttributes itemGroupId(String itemGroupId) {
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

  public ItemAttributes lastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

 /**
   * The landing page for the product.
   * @return link
  **/
  @JsonProperty("link")
 @Size(max=511)  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public ItemAttributes link(String link) {
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

  public ItemAttributes material(String material) {
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

  public ItemAttributes minAdPrice(String minAdPrice) {
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

  public ItemAttributes mobileLink(String mobileLink) {
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

  public ItemAttributes mpn(String mpn) {
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

  public ItemAttributes numberOfRatings(Integer numberOfRatings) {
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

  public ItemAttributes numberOfReviews(Integer numberOfReviews) {
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

  public ItemAttributes pattern(String pattern) {
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

  public ItemAttributes price(String price) {
    this.price = price;
    return this;
  }

 /**
   * The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.
   * @return productType
  **/
  @JsonProperty("product_type")
 @Size(max=1000)  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public ItemAttributes productType(String productType) {
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

  public ItemAttributes salePrice(String salePrice) {
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

  public ItemAttributes shipping(String shipping) {
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

  public ItemAttributes shippingHeight(String shippingHeight) {
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

  public ItemAttributes shippingWeight(String shippingWeight) {
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

  public ItemAttributes shippingWidth(String shippingWidth) {
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

  public ItemAttributes size(String size) {
    this.size = size;
    return this;
  }

 /**
   * Indicates the country’s sizing system in which you are submitting your product.
   * @return sizeSystem
  **/
  @JsonProperty("size_system")
  public String getSizeSystem() {
    return sizeSystem;
  }

  public void setSizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
  }

  public ItemAttributes sizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
    return this;
  }

 /**
   * Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.
   * @return sizeType
  **/
  @JsonProperty("size_type")
  public String getSizeType() {
    return sizeType;
  }

  public void setSizeType(String sizeType) {
    this.sizeType = sizeType;
  }

  public ItemAttributes sizeType(String sizeType) {
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

  public ItemAttributes tax(String tax) {
    this.tax = tax;
    return this;
  }

 /**
   * The name of the product.
   * @return title
  **/
  @JsonProperty("title")
 @Size(max=500)  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ItemAttributes title(String title) {
    this.title = title;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAttributes {\n");
    
    sb.append("    adLink: ").append(toIndentedString(adLink)).append("\n");
    sb.append("    additionalImageLink: ").append(toIndentedString(additionalImageLink)).append("\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    ageGroup: ").append(toIndentedString(ageGroup)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    averageReviewRating: ").append(toIndentedString(averageReviewRating)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
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
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
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

