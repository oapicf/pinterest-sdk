package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ItemAttributes   {
  
  private String adLink;
  private Boolean adult;
  private String ageGroup;
  private String availability;
  private BigDecimal averageReviewRating;
  private String brand;
  private Boolean checkoutEnabled;
  private String color;
  private String condition;
  private String customLabel0;
  private String customLabel1;
  private String customLabel2;
  private String customLabel3;
  private String customLabel4;
  private String description;
  private Boolean freeShippingLabel;
  private String freeShippingLimit;
  private String gender;
  private String googleProductCategory;
  private Integer gtin;
  private String id;
  private String itemGroupId;
  private Long lastUpdatedTime;
  private String link;
  private String material;
  private String minAdPrice;
  private String mobileLink;
  private String mpn;
  private Integer numberOfRatings;
  private Integer numberOfReviews;
  private String pattern;
  private String price;
  private String productType;
  private String salePrice;
  private String shipping;
  private String shippingHeight;
  private String shippingWeight;
  private String shippingWidth;
  private String size;
  private String sizeSystem;
  private String sizeType;
  private String tax;
  private String title;
  private List<String> variantNames;
  private List<String> variantValues;
  private List<String> additionalImageLink;
  private List<String> imageLink;

  /**
   * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
   **/
  
  @ApiModelProperty(example = "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest", value = "Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.")
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }
  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  /**
   * Set this attribute to TRUE if you&#39;re submitting items that are considered “adult”. These will not be shown on Pinterest.
   **/
  
  @ApiModelProperty(example = "true", value = "Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.")
  @JsonProperty("adult")
  public Boolean getAdult() {
    return adult;
  }
  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  /**
   * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
   **/
  
  @ApiModelProperty(example = "newborn", value = "The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.")
  @JsonProperty("age_group")
  public String getAgeGroup() {
    return ageGroup;
  }
  public void setAgeGroup(String ageGroup) {
    this.ageGroup = ageGroup;
  }

  /**
   * The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
   **/
  
  @ApiModelProperty(example = "in stock", value = "The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.")
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
  
  @ApiModelProperty(example = "5", value = "Average reviews for the item. Can be a number from 1-5.")
  @JsonProperty("average_review_rating")
  @Valid
  public BigDecimal getAverageReviewRating() {
    return averageReviewRating;
  }
  public void setAverageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
  }

  /**
   * The brand of the product.
   **/
  
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
  
  @ApiModelProperty(example = "new", value = "The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.")
  @JsonProperty("condition")
  public String getCondition() {
    return condition;
  }
  public void setCondition(String condition) {
    this.condition = condition;
  }

  /**
   * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
   **/
  
  @ApiModelProperty(example = "Best sellers", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  @JsonProperty("custom_label_0")
  public String getCustomLabel0() {
    return customLabel0;
  }
  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  /**
   * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
   **/
  
  @ApiModelProperty(example = "Summer promotion", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  @JsonProperty("custom_label_1")
  public String getCustomLabel1() {
    return customLabel1;
  }
  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  /**
   * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
   **/
  
  @ApiModelProperty(example = "Winter sales", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  @JsonProperty("custom_label_2")
  public String getCustomLabel2() {
    return customLabel2;
  }
  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  /**
   * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
   **/
  
  @ApiModelProperty(example = "Woman dress", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  @JsonProperty("custom_label_3")
  public String getCustomLabel3() {
    return customLabel3;
  }
  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  /**
   * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;Custom grouping of products.&lt;/p&gt;
   **/
  
  @ApiModelProperty(example = "Man hat", value = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
  @JsonProperty("custom_label_4")
  public String getCustomLabel4() {
    return customLabel4;
  }
  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  /**
   * &lt;p&gt;&lt;&#x3D; 10000 characters&lt;/p&gt; &lt;p&gt;The description of the product.&lt;/p&gt;
   **/
  
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
  
  @ApiModelProperty(example = "35 USD", value = "The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.")
  @JsonProperty("free_shipping_limit")
  public String getFreeShippingLimit() {
    return freeShippingLimit;
  }
  public void setFreeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
  }

  /**
   * The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
   **/
  
  @ApiModelProperty(example = "unisex", value = "The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.")
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
  
  @ApiModelProperty(example = "3234567890126", value = "The unique universal product identifier.")
  @JsonProperty("gtin")
  public Integer getGtin() {
    return gtin;
  }
  public void setGtin(Integer gtin) {
    this.gtin = gtin;
  }

  /**
   * &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The user-created unique ID that represents the product. Only Unicode characters are accepted.&lt;/p&gt;
   **/
  
  @ApiModelProperty(example = "DS0294-L", value = "<p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * &lt;p&gt;&lt;&#x3D; 127 characters&lt;/p&gt; &lt;p&gt;The parent ID of the product.&lt;/p&gt;
   **/
  
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
  
  @ApiModelProperty(example = "1641483432072", value = "The millisecond timestamp when the item was lastly modified by the merchant.")
  @JsonProperty("last_updated_time")
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }
  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  /**
   * &lt;p&gt;&lt;&#x3D; 511 characters&lt;/p&gt; &lt;p&gt;The landing page for the product.&lt;/p&gt;
   **/
  
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
  
  @ApiModelProperty(example = "cotton", value = "The material used to make the product.")
  @JsonProperty("material")
  public String getMaterial() {
    return material;
  }
  public void setMaterial(String material) {
    this.material = material;
  }

  /**
   * The minimum advertised price of the product. It supports the following formats, \&quot;19.99 USD\&quot;, \&quot;19.99USD\&quot; and \&quot;19.99\&quot;. If the currency is not included, we default to US dollars.
   **/
  
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
  
  @ApiModelProperty(example = "plaid", value = "The description of the pattern used for the product.")
  @JsonProperty("pattern")
  public String getPattern() {
    return pattern;
  }
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  /**
   * The price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
   **/
  
  @ApiModelProperty(example = "24.99 USD", value = "The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * &lt;p&gt;&lt;&#x3D; 1000 characters&lt;/p&gt; &lt;p&gt;The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ &gt; “. The &gt; must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.&lt;/p&gt;
   **/
  
  @ApiModelProperty(example = "Clothing > Women’s > Shirts > Denim", value = "<p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>")
  @JsonProperty("product_type")
  public String getProductType() {
    return productType;
  }
  public void setProductType(String productType) {
    this.productType = productType;
  }

  /**
   * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \&quot;14.99 USD\&quot;, \&quot;14.99USD\&quot; and \&quot;14.99\&quot;. If the currency is not included, we default to US dollars.
   **/
  
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
  
  @ApiModelProperty(example = "M", value = "The size of the product.")
  @JsonProperty("size")
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }

  /**
   * Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
   **/
  
  @ApiModelProperty(example = "US", value = "Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.")
  @JsonProperty("size_system")
  public String getSizeSystem() {
    return sizeSystem;
  }
  public void setSizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
  }

  /**
   * Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
   **/
  
  @ApiModelProperty(example = "regular", value = "Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.")
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
  
  @ApiModelProperty(example = "US:1025433:6.00:y", value = "Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.")
  @JsonProperty("tax")
  public String getTax() {
    return tax;
  }
  public void setTax(String tax) {
    this.tax = tax;
  }

  /**
   * &lt;p&gt;&lt;&#x3D; 500 characters&lt;/p&gt; &lt;p&gt;The name of the product.&lt;/p&gt;
   **/
  
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
  
  @ApiModelProperty(example = "[Red, Small]", value = "Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.")
  @JsonProperty("variant_values")
  public List<String> getVariantValues() {
    return variantValues;
  }
  public void setVariantValues(List<String> variantValues) {
    this.variantValues = variantValues;
  }

  /**
   * &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.&lt;/p&gt;
   **/
  
  @ApiModelProperty(example = "[\"https://scene.example.com/image/image_v2.jpg\",\"https://scene.example.com/image/image_v3.jpg\"]", value = "<p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>")
  @JsonProperty("additional_image_link")
  public List<String> getAdditionalImageLink() {
    return additionalImageLink;
  }
  public void setAdditionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
  }

  /**
   * &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.&lt;/p&gt;
   **/
  
  @ApiModelProperty(example = "[\"https://scene.example.com/image/image.jpg\"]", value = "<p><= 2000 characters</p> <p>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>")
  @JsonProperty("image_link")
 @Size(min=1)  public List<String> getImageLink() {
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

