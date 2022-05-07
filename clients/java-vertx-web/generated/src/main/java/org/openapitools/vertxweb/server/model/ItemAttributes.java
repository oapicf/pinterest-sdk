package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemAttributes   {
  
  private String adLink;
  private List<String> additionalImageLink = new ArrayList<>();
  private Boolean adult;
  private String ageGroup;
  private String availability;
  private BigDecimal averageReviewRating;
  private String brand;
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
  private List<String> imageLink = new ArrayList<>();
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

  public ItemAttributes () {

  }

  public ItemAttributes (String adLink, List<String> additionalImageLink, Boolean adult, String ageGroup, String availability, BigDecimal averageReviewRating, String brand, String color, String condition, String customLabel0, String customLabel1, String customLabel2, String customLabel3, String customLabel4, String description, Boolean freeShippingLabel, String freeShippingLimit, String gender, String googleProductCategory, Integer gtin, String id, List<String> imageLink, String itemGroupId, Long lastUpdatedTime, String link, String material, String minAdPrice, String mobileLink, String mpn, Integer numberOfRatings, Integer numberOfReviews, String pattern, String price, String productType, String salePrice, String shipping, String shippingHeight, String shippingWeight, String shippingWidth, String size, String sizeSystem, String sizeType, String tax, String title) {
    this.adLink = adLink;
    this.additionalImageLink = additionalImageLink;
    this.adult = adult;
    this.ageGroup = ageGroup;
    this.availability = availability;
    this.averageReviewRating = averageReviewRating;
    this.brand = brand;
    this.color = color;
    this.condition = condition;
    this.customLabel0 = customLabel0;
    this.customLabel1 = customLabel1;
    this.customLabel2 = customLabel2;
    this.customLabel3 = customLabel3;
    this.customLabel4 = customLabel4;
    this.description = description;
    this.freeShippingLabel = freeShippingLabel;
    this.freeShippingLimit = freeShippingLimit;
    this.gender = gender;
    this.googleProductCategory = googleProductCategory;
    this.gtin = gtin;
    this.id = id;
    this.imageLink = imageLink;
    this.itemGroupId = itemGroupId;
    this.lastUpdatedTime = lastUpdatedTime;
    this.link = link;
    this.material = material;
    this.minAdPrice = minAdPrice;
    this.mobileLink = mobileLink;
    this.mpn = mpn;
    this.numberOfRatings = numberOfRatings;
    this.numberOfReviews = numberOfReviews;
    this.pattern = pattern;
    this.price = price;
    this.productType = productType;
    this.salePrice = salePrice;
    this.shipping = shipping;
    this.shippingHeight = shippingHeight;
    this.shippingWeight = shippingWeight;
    this.shippingWidth = shippingWidth;
    this.size = size;
    this.sizeSystem = sizeSystem;
    this.sizeType = sizeType;
    this.tax = tax;
    this.title = title;
  }

    
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }
  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

    
  @JsonProperty("additional_image_link")
  public List<String> getAdditionalImageLink() {
    return additionalImageLink;
  }
  public void setAdditionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
  }

    
  @JsonProperty("adult")
  public Boolean getAdult() {
    return adult;
  }
  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

    
  @JsonProperty("age_group")
  public String getAgeGroup() {
    return ageGroup;
  }
  public void setAgeGroup(String ageGroup) {
    this.ageGroup = ageGroup;
  }

    
  @JsonProperty("availability")
  public String getAvailability() {
    return availability;
  }
  public void setAvailability(String availability) {
    this.availability = availability;
  }

    
  @JsonProperty("average_review_rating")
  public BigDecimal getAverageReviewRating() {
    return averageReviewRating;
  }
  public void setAverageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
  }

    
  @JsonProperty("brand")
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }

    
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

    
  @JsonProperty("condition")
  public String getCondition() {
    return condition;
  }
  public void setCondition(String condition) {
    this.condition = condition;
  }

    
  @JsonProperty("custom_label_0")
  public String getCustomLabel0() {
    return customLabel0;
  }
  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

    
  @JsonProperty("custom_label_1")
  public String getCustomLabel1() {
    return customLabel1;
  }
  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

    
  @JsonProperty("custom_label_2")
  public String getCustomLabel2() {
    return customLabel2;
  }
  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

    
  @JsonProperty("custom_label_3")
  public String getCustomLabel3() {
    return customLabel3;
  }
  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

    
  @JsonProperty("custom_label_4")
  public String getCustomLabel4() {
    return customLabel4;
  }
  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("free_shipping_label")
  public Boolean getFreeShippingLabel() {
    return freeShippingLabel;
  }
  public void setFreeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
  }

    
  @JsonProperty("free_shipping_limit")
  public String getFreeShippingLimit() {
    return freeShippingLimit;
  }
  public void setFreeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
  }

    
  @JsonProperty("gender")
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }

    
  @JsonProperty("google_product_category")
  public String getGoogleProductCategory() {
    return googleProductCategory;
  }
  public void setGoogleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

    
  @JsonProperty("gtin")
  public Integer getGtin() {
    return gtin;
  }
  public void setGtin(Integer gtin) {
    this.gtin = gtin;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("image_link")
  public List<String> getImageLink() {
    return imageLink;
  }
  public void setImageLink(List<String> imageLink) {
    this.imageLink = imageLink;
  }

    
  @JsonProperty("item_group_id")
  public String getItemGroupId() {
    return itemGroupId;
  }
  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

    
  @JsonProperty("last_updated_time")
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }
  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

    
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

    
  @JsonProperty("material")
  public String getMaterial() {
    return material;
  }
  public void setMaterial(String material) {
    this.material = material;
  }

    
  @JsonProperty("min_ad_price")
  public String getMinAdPrice() {
    return minAdPrice;
  }
  public void setMinAdPrice(String minAdPrice) {
    this.minAdPrice = minAdPrice;
  }

    
  @JsonProperty("mobile_link")
  public String getMobileLink() {
    return mobileLink;
  }
  public void setMobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
  }

    
  @JsonProperty("mpn")
  public String getMpn() {
    return mpn;
  }
  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

    
  @JsonProperty("number_of_ratings")
  public Integer getNumberOfRatings() {
    return numberOfRatings;
  }
  public void setNumberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
  }

    
  @JsonProperty("number_of_reviews")
  public Integer getNumberOfReviews() {
    return numberOfReviews;
  }
  public void setNumberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
  }

    
  @JsonProperty("pattern")
  public String getPattern() {
    return pattern;
  }
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

    
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

    
  @JsonProperty("product_type")
  public String getProductType() {
    return productType;
  }
  public void setProductType(String productType) {
    this.productType = productType;
  }

    
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }
  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

    
  @JsonProperty("shipping")
  public String getShipping() {
    return shipping;
  }
  public void setShipping(String shipping) {
    this.shipping = shipping;
  }

    
  @JsonProperty("shipping_height")
  public String getShippingHeight() {
    return shippingHeight;
  }
  public void setShippingHeight(String shippingHeight) {
    this.shippingHeight = shippingHeight;
  }

    
  @JsonProperty("shipping_weight")
  public String getShippingWeight() {
    return shippingWeight;
  }
  public void setShippingWeight(String shippingWeight) {
    this.shippingWeight = shippingWeight;
  }

    
  @JsonProperty("shipping_width")
  public String getShippingWidth() {
    return shippingWidth;
  }
  public void setShippingWidth(String shippingWidth) {
    this.shippingWidth = shippingWidth;
  }

    
  @JsonProperty("size")
  public String getSize() {
    return size;
  }
  public void setSize(String size) {
    this.size = size;
  }

    
  @JsonProperty("size_system")
  public String getSizeSystem() {
    return sizeSystem;
  }
  public void setSizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
  }

    
  @JsonProperty("size_type")
  public String getSizeType() {
    return sizeType;
  }
  public void setSizeType(String sizeType) {
    this.sizeType = sizeType;
  }

    
  @JsonProperty("tax")
  public String getTax() {
    return tax;
  }
  public void setTax(String tax) {
    this.tax = tax;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
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
    return Objects.equals(adLink, itemAttributes.adLink) &&
        Objects.equals(additionalImageLink, itemAttributes.additionalImageLink) &&
        Objects.equals(adult, itemAttributes.adult) &&
        Objects.equals(ageGroup, itemAttributes.ageGroup) &&
        Objects.equals(availability, itemAttributes.availability) &&
        Objects.equals(averageReviewRating, itemAttributes.averageReviewRating) &&
        Objects.equals(brand, itemAttributes.brand) &&
        Objects.equals(color, itemAttributes.color) &&
        Objects.equals(condition, itemAttributes.condition) &&
        Objects.equals(customLabel0, itemAttributes.customLabel0) &&
        Objects.equals(customLabel1, itemAttributes.customLabel1) &&
        Objects.equals(customLabel2, itemAttributes.customLabel2) &&
        Objects.equals(customLabel3, itemAttributes.customLabel3) &&
        Objects.equals(customLabel4, itemAttributes.customLabel4) &&
        Objects.equals(description, itemAttributes.description) &&
        Objects.equals(freeShippingLabel, itemAttributes.freeShippingLabel) &&
        Objects.equals(freeShippingLimit, itemAttributes.freeShippingLimit) &&
        Objects.equals(gender, itemAttributes.gender) &&
        Objects.equals(googleProductCategory, itemAttributes.googleProductCategory) &&
        Objects.equals(gtin, itemAttributes.gtin) &&
        Objects.equals(id, itemAttributes.id) &&
        Objects.equals(imageLink, itemAttributes.imageLink) &&
        Objects.equals(itemGroupId, itemAttributes.itemGroupId) &&
        Objects.equals(lastUpdatedTime, itemAttributes.lastUpdatedTime) &&
        Objects.equals(link, itemAttributes.link) &&
        Objects.equals(material, itemAttributes.material) &&
        Objects.equals(minAdPrice, itemAttributes.minAdPrice) &&
        Objects.equals(mobileLink, itemAttributes.mobileLink) &&
        Objects.equals(mpn, itemAttributes.mpn) &&
        Objects.equals(numberOfRatings, itemAttributes.numberOfRatings) &&
        Objects.equals(numberOfReviews, itemAttributes.numberOfReviews) &&
        Objects.equals(pattern, itemAttributes.pattern) &&
        Objects.equals(price, itemAttributes.price) &&
        Objects.equals(productType, itemAttributes.productType) &&
        Objects.equals(salePrice, itemAttributes.salePrice) &&
        Objects.equals(shipping, itemAttributes.shipping) &&
        Objects.equals(shippingHeight, itemAttributes.shippingHeight) &&
        Objects.equals(shippingWeight, itemAttributes.shippingWeight) &&
        Objects.equals(shippingWidth, itemAttributes.shippingWidth) &&
        Objects.equals(size, itemAttributes.size) &&
        Objects.equals(sizeSystem, itemAttributes.sizeSystem) &&
        Objects.equals(sizeType, itemAttributes.sizeType) &&
        Objects.equals(tax, itemAttributes.tax) &&
        Objects.equals(title, itemAttributes.title);
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
