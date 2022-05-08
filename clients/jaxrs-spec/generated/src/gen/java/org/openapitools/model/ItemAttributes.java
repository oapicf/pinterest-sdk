package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ItemAttributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class ItemAttributes   {
  
  private @Valid String adLink;
  private @Valid List<String> additionalImageLink = new ArrayList<String>();
  private @Valid Boolean adult;
  private @Valid String ageGroup;
  private @Valid String availability;
  private @Valid BigDecimal averageReviewRating;
  private @Valid String brand;
  private @Valid String color;
  private @Valid String condition;
  private @Valid String customLabel0;
  private @Valid String customLabel1;
  private @Valid String customLabel2;
  private @Valid String customLabel3;
  private @Valid String customLabel4;
  private @Valid String description;
  private @Valid Boolean freeShippingLabel;
  private @Valid String freeShippingLimit;
  private @Valid String gender;
  private @Valid String googleProductCategory;
  private @Valid Integer gtin;
  private @Valid String id;
  private @Valid List<String> imageLink = new ArrayList<String>();
  private @Valid String itemGroupId;
  private @Valid Long lastUpdatedTime;
  private @Valid String link;
  private @Valid String material;
  private @Valid String minAdPrice;
  private @Valid String mobileLink;
  private @Valid String mpn;
  private @Valid Integer numberOfRatings;
  private @Valid Integer numberOfReviews;
  private @Valid String pattern;
  private @Valid String price;
  private @Valid String productType;
  private @Valid String salePrice;
  private @Valid String shipping;
  private @Valid String shippingHeight;
  private @Valid String shippingWeight;
  private @Valid String shippingWidth;
  private @Valid String size;
  private @Valid String sizeSystem;
  private @Valid String sizeType;
  private @Valid String tax;
  private @Valid String title;

  /**
   * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
   **/
  public ItemAttributes adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

  

  
  @ApiModelProperty(example = "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest", value = "Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.")
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }

  @JsonProperty("ad_link")
  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

/**
   * The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https://
   **/
  public ItemAttributes additionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
    return this;
  }

  

  
  @ApiModelProperty(example = "[\"https://scene.example.com/image/image_v2.jpg\",\"https://scene.example.com/image/image_v3.jpg\"]", value = "The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https://")
  @JsonProperty("additional_image_link")
  public List<String> getAdditionalImageLink() {
    return additionalImageLink;
  }

  @JsonProperty("additional_image_link")
  public void setAdditionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
  }

  public ItemAttributes addAdditionalImageLinkItem(String additionalImageLinkItem) {
    if (this.additionalImageLink == null) {
      this.additionalImageLink = new ArrayList<String>();
    }

    this.additionalImageLink.add(additionalImageLinkItem);
    return this;
  }

  public ItemAttributes removeAdditionalImageLinkItem(String additionalImageLinkItem) {
    if (additionalImageLinkItem != null && this.additionalImageLink != null) {
      this.additionalImageLink.remove(additionalImageLinkItem);
    }

    return this;
  }
/**
   * Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.
   **/
  public ItemAttributes adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

  

  
  @ApiModelProperty(example = "true", value = "Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.")
  @JsonProperty("adult")
  public Boolean getAdult() {
    return adult;
  }

  @JsonProperty("adult")
  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

/**
   * The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.
   **/
  public ItemAttributes ageGroup(String ageGroup) {
    this.ageGroup = ageGroup;
    return this;
  }

  

  
  @ApiModelProperty(example = "newborn", value = "The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.")
  @JsonProperty("age_group")
  public String getAgeGroup() {
    return ageGroup;
  }

  @JsonProperty("age_group")
  public void setAgeGroup(String ageGroup) {
    this.ageGroup = ageGroup;
  }

/**
   * The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.
   **/
  public ItemAttributes availability(String availability) {
    this.availability = availability;
    return this;
  }

  

  
  @ApiModelProperty(example = "in stock", value = "The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.")
  @JsonProperty("availability")
  public String getAvailability() {
    return availability;
  }

  @JsonProperty("availability")
  public void setAvailability(String availability) {
    this.availability = availability;
  }

/**
   * Average reviews for the item. Can be a number from 1-5.
   **/
  public ItemAttributes averageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
    return this;
  }

  

  
  @ApiModelProperty(example = "5", value = "Average reviews for the item. Can be a number from 1-5.")
  @JsonProperty("average_review_rating")
  public BigDecimal getAverageReviewRating() {
    return averageReviewRating;
  }

  @JsonProperty("average_review_rating")
  public void setAverageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
  }

/**
   * The brand of the product.
   **/
  public ItemAttributes brand(String brand) {
    this.brand = brand;
    return this;
  }

  

  
  @ApiModelProperty(example = "Josie’s Denim", value = "The brand of the product.")
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }

  @JsonProperty("brand")
  public void setBrand(String brand) {
    this.brand = brand;
  }

/**
   * The primary color of the product.
   **/
  public ItemAttributes color(String color) {
    this.color = color;
    return this;
  }

  

  
  @ApiModelProperty(example = "blue", value = "The primary color of the product.")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  @JsonProperty("color")
  public void setColor(String color) {
    this.color = color;
  }

/**
   * The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.
   **/
  public ItemAttributes condition(String condition) {
    this.condition = condition;
    return this;
  }

  

  
  @ApiModelProperty(example = "new", value = "The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.")
  @JsonProperty("condition")
  public String getCondition() {
    return condition;
  }

  @JsonProperty("condition")
  public void setCondition(String condition) {
    this.condition = condition;
  }

/**
   * Custom grouping of products.
   **/
  public ItemAttributes customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

  

  
  @ApiModelProperty(example = "Best sellers", value = "Custom grouping of products.")
  @JsonProperty("custom_label_0")
 @Size(max=1000)  public String getCustomLabel0() {
    return customLabel0;
  }

  @JsonProperty("custom_label_0")
  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

/**
   * Custom grouping of products.
   **/
  public ItemAttributes customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

  

  
  @ApiModelProperty(example = "Summer promotion", value = "Custom grouping of products.")
  @JsonProperty("custom_label_1")
 @Size(max=1000)  public String getCustomLabel1() {
    return customLabel1;
  }

  @JsonProperty("custom_label_1")
  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

/**
   * Custom grouping of products.
   **/
  public ItemAttributes customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

  

  
  @ApiModelProperty(example = "Winter sales", value = "Custom grouping of products.")
  @JsonProperty("custom_label_2")
 @Size(max=1000)  public String getCustomLabel2() {
    return customLabel2;
  }

  @JsonProperty("custom_label_2")
  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

/**
   * Custom grouping of products.
   **/
  public ItemAttributes customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

  

  
  @ApiModelProperty(example = "Woman dress", value = "Custom grouping of products.")
  @JsonProperty("custom_label_3")
 @Size(max=1000)  public String getCustomLabel3() {
    return customLabel3;
  }

  @JsonProperty("custom_label_3")
  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

/**
   * Custom grouping of products.
   **/
  public ItemAttributes customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

  

  
  @ApiModelProperty(example = "Man hat", value = "Custom grouping of products.")
  @JsonProperty("custom_label_4")
 @Size(max=1000)  public String getCustomLabel4() {
    return customLabel4;
  }

  @JsonProperty("custom_label_4")
  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

/**
   * The description of the product.
   **/
  public ItemAttributes description(String description) {
    this.description = description;
    return this;
  }

  

  
  @ApiModelProperty(example = "Casual fit denim shirt made with the finest quality Japanese denim.", value = "The description of the product.")
  @JsonProperty("description")
 @Size(max=10000)  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

/**
   * The item is free to ship.
   **/
  public ItemAttributes freeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
    return this;
  }

  

  
  @ApiModelProperty(example = "true", value = "The item is free to ship.")
  @JsonProperty("free_shipping_label")
  public Boolean getFreeShippingLabel() {
    return freeShippingLabel;
  }

  @JsonProperty("free_shipping_label")
  public void setFreeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
  }

/**
   * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
   **/
  public ItemAttributes freeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
    return this;
  }

  

  
  @ApiModelProperty(example = "35 USD", value = "The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.")
  @JsonProperty("free_shipping_limit")
  public String getFreeShippingLimit() {
    return freeShippingLimit;
  }

  @JsonProperty("free_shipping_limit")
  public void setFreeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
  }

/**
   * The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.
   **/
  public ItemAttributes gender(String gender) {
    this.gender = gender;
    return this;
  }

  

  
  @ApiModelProperty(example = "unisex", value = "The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.")
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }

  @JsonProperty("gender")
  public void setGender(String gender) {
    this.gender = gender;
  }

/**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
   **/
  public ItemAttributes googleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
    return this;
  }

  

  
  @ApiModelProperty(example = "Apparel & Accessories > Clothing > Shirts & Tops", value = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.")
  @JsonProperty("google_product_category")
  public String getGoogleProductCategory() {
    return googleProductCategory;
  }

  @JsonProperty("google_product_category")
  public void setGoogleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

/**
   * The unique universal product identifier.
   **/
  public ItemAttributes gtin(Integer gtin) {
    this.gtin = gtin;
    return this;
  }

  

  
  @ApiModelProperty(example = "3234567890126", value = "The unique universal product identifier.")
  @JsonProperty("gtin")
  public Integer getGtin() {
    return gtin;
  }

  @JsonProperty("gtin")
  public void setGtin(Integer gtin) {
    this.gtin = gtin;
  }

/**
   * The user-created unique ID that represents the product. Only Unicode characters are accepted.
   **/
  public ItemAttributes id(String id) {
    this.id = id;
    return this;
  }

  

  
  @ApiModelProperty(example = "DS0294-L", value = "The user-created unique ID that represents the product. Only Unicode characters are accepted.")
  @JsonProperty("id")
 @Size(max=127)  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

/**
   * The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://
   **/
  public ItemAttributes imageLink(List<String> imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  

  
  @ApiModelProperty(example = "[\"https://scene.example.com/image/image.jpg\"]", value = "The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://")
  @JsonProperty("image_link")
 @Size(min=1)  public List<String> getImageLink() {
    return imageLink;
  }

  @JsonProperty("image_link")
  public void setImageLink(List<String> imageLink) {
    this.imageLink = imageLink;
  }

  public ItemAttributes addImageLinkItem(String imageLinkItem) {
    if (this.imageLink == null) {
      this.imageLink = new ArrayList<String>();
    }

    this.imageLink.add(imageLinkItem);
    return this;
  }

  public ItemAttributes removeImageLinkItem(String imageLinkItem) {
    if (imageLinkItem != null && this.imageLink != null) {
      this.imageLink.remove(imageLinkItem);
    }

    return this;
  }
/**
   * The parent ID of the product.
   **/
  public ItemAttributes itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

  

  
  @ApiModelProperty(example = "DS0294", value = "The parent ID of the product.")
  @JsonProperty("item_group_id")
 @Size(max=127)  public String getItemGroupId() {
    return itemGroupId;
  }

  @JsonProperty("item_group_id")
  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

/**
   * The millisecond timestamp when the item was lastly modified by the merchant.
   **/
  public ItemAttributes lastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

  

  
  @ApiModelProperty(example = "1641483432072", value = "The millisecond timestamp when the item was lastly modified by the merchant.")
  @JsonProperty("last_updated_time")
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  @JsonProperty("last_updated_time")
  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

/**
   * The landing page for the product.
   **/
  public ItemAttributes link(String link) {
    this.link = link;
    return this;
  }

  

  
  @ApiModelProperty(example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294", value = "The landing page for the product.")
  @JsonProperty("link")
 @Size(max=511)  public String getLink() {
    return link;
  }

  @JsonProperty("link")
  public void setLink(String link) {
    this.link = link;
  }

/**
   * The material used to make the product.
   **/
  public ItemAttributes material(String material) {
    this.material = material;
    return this;
  }

  

  
  @ApiModelProperty(example = "cotton", value = "The material used to make the product.")
  @JsonProperty("material")
  public String getMaterial() {
    return material;
  }

  @JsonProperty("material")
  public void setMaterial(String material) {
    this.material = material;
  }

/**
   * The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.
   **/
  public ItemAttributes minAdPrice(String minAdPrice) {
    this.minAdPrice = minAdPrice;
    return this;
  }

  

  
  @ApiModelProperty(example = "19.99 USD", value = "The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.")
  @JsonProperty("min_ad_price")
  public String getMinAdPrice() {
    return minAdPrice;
  }

  @JsonProperty("min_ad_price")
  public void setMinAdPrice(String minAdPrice) {
    this.minAdPrice = minAdPrice;
  }

/**
   * The mobile-optimized version of your landing page. Must begin with http:// or https://.
   **/
  public ItemAttributes mobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
    return this;
  }

  

  
  @ApiModelProperty(example = "https://m.example.com/cat/womens-clothing/denim-shirt-0294", value = "The mobile-optimized version of your landing page. Must begin with http:// or https://.")
  @JsonProperty("mobile_link")
  public String getMobileLink() {
    return mobileLink;
  }

  @JsonProperty("mobile_link")
  public void setMobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
  }

/**
   * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
   **/
  public ItemAttributes mpn(String mpn) {
    this.mpn = mpn;
    return this;
  }

  

  
  @ApiModelProperty(example = "PI12345NTEREST", value = "Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.")
  @JsonProperty("mpn")
  public String getMpn() {
    return mpn;
  }

  @JsonProperty("mpn")
  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

/**
   * The number of ratings for the item.
   **/
  public ItemAttributes numberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
    return this;
  }

  

  
  @ApiModelProperty(example = "10", value = "The number of ratings for the item.")
  @JsonProperty("number_of_ratings")
  public Integer getNumberOfRatings() {
    return numberOfRatings;
  }

  @JsonProperty("number_of_ratings")
  public void setNumberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
  }

/**
   * The number of reviews available for the item.
   **/
  public ItemAttributes numberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
    return this;
  }

  

  
  @ApiModelProperty(example = "10", value = "The number of reviews available for the item.")
  @JsonProperty("number_of_reviews")
  public Integer getNumberOfReviews() {
    return numberOfReviews;
  }

  @JsonProperty("number_of_reviews")
  public void setNumberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
  }

/**
   * The description of the pattern used for the product.
   **/
  public ItemAttributes pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  

  
  @ApiModelProperty(example = "plaid", value = "The description of the pattern used for the product.")
  @JsonProperty("pattern")
  public String getPattern() {
    return pattern;
  }

  @JsonProperty("pattern")
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

/**
   * The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
   **/
  public ItemAttributes price(String price) {
    this.price = price;
    return this;
  }

  

  
  @ApiModelProperty(example = "24.99 USD", value = "The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(String price) {
    this.price = price;
  }

/**
   * The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.
   **/
  public ItemAttributes productType(String productType) {
    this.productType = productType;
    return this;
  }

  

  
  @ApiModelProperty(example = "Clothing > Women’s > Shirts > Denim", value = "The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.")
  @JsonProperty("product_type")
 @Size(max=1000)  public String getProductType() {
    return productType;
  }

  @JsonProperty("product_type")
  public void setProductType(String productType) {
    this.productType = productType;
  }

/**
   * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.
   **/
  public ItemAttributes salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

  

  
  @ApiModelProperty(example = "14.99 USD", value = "The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.")
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }

  @JsonProperty("sale_price")
  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

/**
   * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
   **/
  public ItemAttributes shipping(String shipping) {
    this.shipping = shipping;
    return this;
  }

  

  
  @ApiModelProperty(example = "US:CA:Ground:0 USD", value = "Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.")
  @JsonProperty("shipping")
  public String getShipping() {
    return shipping;
  }

  @JsonProperty("shipping")
  public void setShipping(String shipping) {
    this.shipping = shipping;
  }

/**
   * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   **/
  public ItemAttributes shippingHeight(String shippingHeight) {
    this.shippingHeight = shippingHeight;
    return this;
  }

  

  
  @ApiModelProperty(example = "12 in", value = "The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
  @JsonProperty("shipping_height")
  public String getShippingHeight() {
    return shippingHeight;
  }

  @JsonProperty("shipping_height")
  public void setShippingHeight(String shippingHeight) {
    this.shippingHeight = shippingHeight;
  }

/**
   * The weight of the product. Ensure there is a space between the numeric string and the metric.
   **/
  public ItemAttributes shippingWeight(String shippingWeight) {
    this.shippingWeight = shippingWeight;
    return this;
  }

  

  
  @ApiModelProperty(example = "3 kg", value = "The weight of the product. Ensure there is a space between the numeric string and the metric.")
  @JsonProperty("shipping_weight")
  public String getShippingWeight() {
    return shippingWeight;
  }

  @JsonProperty("shipping_weight")
  public void setShippingWeight(String shippingWeight) {
    this.shippingWeight = shippingWeight;
  }

/**
   * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   **/
  public ItemAttributes shippingWidth(String shippingWidth) {
    this.shippingWidth = shippingWidth;
    return this;
  }

  

  
  @ApiModelProperty(example = "16 in", value = "The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
  @JsonProperty("shipping_width")
  public String getShippingWidth() {
    return shippingWidth;
  }

  @JsonProperty("shipping_width")
  public void setShippingWidth(String shippingWidth) {
    this.shippingWidth = shippingWidth;
  }

/**
   * The size of the product.
   **/
  public ItemAttributes size(String size) {
    this.size = size;
    return this;
  }

  

  
  @ApiModelProperty(example = "M", value = "The size of the product.")
  @JsonProperty("size")
  public String getSize() {
    return size;
  }

  @JsonProperty("size")
  public void setSize(String size) {
    this.size = size;
  }

/**
   * Indicates the country’s sizing system in which you are submitting your product.
   **/
  public ItemAttributes sizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
    return this;
  }

  

  
  @ApiModelProperty(example = "US", value = "Indicates the country’s sizing system in which you are submitting your product.")
  @JsonProperty("size_system")
  public String getSizeSystem() {
    return sizeSystem;
  }

  @JsonProperty("size_system")
  public void setSizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
  }

/**
   * Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.
   **/
  public ItemAttributes sizeType(String sizeType) {
    this.sizeType = sizeType;
    return this;
  }

  

  
  @ApiModelProperty(example = "regular", value = "Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.")
  @JsonProperty("size_type")
  public String getSizeType() {
    return sizeType;
  }

  @JsonProperty("size_type")
  public void setSizeType(String sizeType) {
    this.sizeType = sizeType;
  }

/**
   * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
   **/
  public ItemAttributes tax(String tax) {
    this.tax = tax;
    return this;
  }

  

  
  @ApiModelProperty(example = "US:1025433:6.00:y", value = "Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.")
  @JsonProperty("tax")
  public String getTax() {
    return tax;
  }

  @JsonProperty("tax")
  public void setTax(String tax) {
    this.tax = tax;
  }

/**
   * The name of the product.
   **/
  public ItemAttributes title(String title) {
    this.title = title;
    return this;
  }

  

  
  @ApiModelProperty(example = "Women’s denim shirt, large", value = "The name of the product.")
  @JsonProperty("title")
 @Size(max=500)  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
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
        Objects.equals(this.additionalImageLink, itemAttributes.additionalImageLink) &&
        Objects.equals(this.adult, itemAttributes.adult) &&
        Objects.equals(this.ageGroup, itemAttributes.ageGroup) &&
        Objects.equals(this.availability, itemAttributes.availability) &&
        Objects.equals(this.averageReviewRating, itemAttributes.averageReviewRating) &&
        Objects.equals(this.brand, itemAttributes.brand) &&
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
        Objects.equals(this.imageLink, itemAttributes.imageLink) &&
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
        Objects.equals(this.title, itemAttributes.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adLink, additionalImageLink, adult, ageGroup, availability, averageReviewRating, brand, color, condition, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, description, freeShippingLabel, freeShippingLimit, gender, googleProductCategory, gtin, id, imageLink, itemGroupId, lastUpdatedTime, link, material, minAdPrice, mobileLink, mpn, numberOfRatings, numberOfReviews, pattern, price, productType, salePrice, shipping, shippingHeight, shippingWeight, shippingWidth, size, sizeSystem, sizeType, tax, title);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

