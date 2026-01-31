package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ItemAttributesRequestAllOfImageLink;
import org.openapitools.vertxweb.server.model.UpdatableItemAttributesGtin;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemAttributesRequest   {
  
  private String adImage0Link;
  private String adImage0Tag;
  private String adImage10Link;
  private String adImage10Tag;
  private String adImage11Link;
  private String adImage11Tag;
  private String adImage12Link;
  private String adImage12Tag;
  private String adImage13Link;
  private String adImage13Tag;
  private String adImage14Link;
  private String adImage14Tag;
  private String adImage15Link;
  private String adImage15Tag;
  private String adImage16Link;
  private String adImage16Tag;
  private String adImage17Link;
  private String adImage17Tag;
  private String adImage18Link;
  private String adImage18Tag;
  private String adImage19Link;
  private String adImage19Tag;
  private String adImage1Link;
  private String adImage1Tag;
  private String adImage2Link;
  private String adImage2Tag;
  private String adImage3Link;
  private String adImage3Tag;
  private String adImage4Link;
  private String adImage4Tag;
  private String adImage5Link;
  private String adImage5Tag;
  private String adImage6Link;
  private String adImage6Tag;
  private String adImage7Link;
  private String adImage7Tag;
  private String adImage8Link;
  private String adImage8Tag;
  private String adImage9Link;
  private String adImage9Tag;
  private String adLink;
  private String adVideo0Link;
  private String adVideo0Tag;
  private String adVideo1Link;
  private String adVideo1Tag;
  private String adVideo2Link;
  private String adVideo2Tag;
  private Boolean adult;
  private String ageGroup;
  private String androidDeepLink;
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
  private Integer customNumber0;
  private Integer customNumber1;
  private Integer customNumber2;
  private Integer customNumber3;
  private Integer customNumber4;
  private String description;
  private Boolean freeShippingLabel;
  private String freeShippingLimit;
  private String gender;
  private String googleProductCategory;
  private UpdatableItemAttributesGtin gtin;
  private String id;
  private String installmentPrice;
  private String iosDeepLink;
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
  private String promotionId;
  private String salePrice;
  private String salePriceEffectiveDate;
  private String shipping;
  private String shippingHeight;
  private String shippingWeight;
  private String shippingWidth;
  private String size;
  private String sizeSystem;
  private String sizeType;
  private String tax;
  private String title;
  private String unitPricingBaseMeasure;
  private String unitPricingMeasure;
  private List<String> variantNames;
  private List<String> variantValues;
  private List<String> additionalImageLink;
  private ItemAttributesRequestAllOfImageLink imageLink;
  private Boolean savePinDisabled = false;
  private String videoLink;

  public ItemAttributesRequest () {

  }

  public ItemAttributesRequest (String adImage0Link, String adImage0Tag, String adImage10Link, String adImage10Tag, String adImage11Link, String adImage11Tag, String adImage12Link, String adImage12Tag, String adImage13Link, String adImage13Tag, String adImage14Link, String adImage14Tag, String adImage15Link, String adImage15Tag, String adImage16Link, String adImage16Tag, String adImage17Link, String adImage17Tag, String adImage18Link, String adImage18Tag, String adImage19Link, String adImage19Tag, String adImage1Link, String adImage1Tag, String adImage2Link, String adImage2Tag, String adImage3Link, String adImage3Tag, String adImage4Link, String adImage4Tag, String adImage5Link, String adImage5Tag, String adImage6Link, String adImage6Tag, String adImage7Link, String adImage7Tag, String adImage8Link, String adImage8Tag, String adImage9Link, String adImage9Tag, String adLink, String adVideo0Link, String adVideo0Tag, String adVideo1Link, String adVideo1Tag, String adVideo2Link, String adVideo2Tag, Boolean adult, String ageGroup, String androidDeepLink, String availability, BigDecimal averageReviewRating, String brand, Boolean checkoutEnabled, String color, String condition, String customLabel0, String customLabel1, String customLabel2, String customLabel3, String customLabel4, Integer customNumber0, Integer customNumber1, Integer customNumber2, Integer customNumber3, Integer customNumber4, String description, Boolean freeShippingLabel, String freeShippingLimit, String gender, String googleProductCategory, UpdatableItemAttributesGtin gtin, String id, String installmentPrice, String iosDeepLink, String itemGroupId, Long lastUpdatedTime, String link, String material, String minAdPrice, String mobileLink, String mpn, Integer numberOfRatings, Integer numberOfReviews, String pattern, String price, String productType, String promotionId, String salePrice, String salePriceEffectiveDate, String shipping, String shippingHeight, String shippingWeight, String shippingWidth, String size, String sizeSystem, String sizeType, String tax, String title, String unitPricingBaseMeasure, String unitPricingMeasure, List<String> variantNames, List<String> variantValues, List<String> additionalImageLink, ItemAttributesRequestAllOfImageLink imageLink, Boolean savePinDisabled, String videoLink) {
    this.adImage0Link = adImage0Link;
    this.adImage0Tag = adImage0Tag;
    this.adImage10Link = adImage10Link;
    this.adImage10Tag = adImage10Tag;
    this.adImage11Link = adImage11Link;
    this.adImage11Tag = adImage11Tag;
    this.adImage12Link = adImage12Link;
    this.adImage12Tag = adImage12Tag;
    this.adImage13Link = adImage13Link;
    this.adImage13Tag = adImage13Tag;
    this.adImage14Link = adImage14Link;
    this.adImage14Tag = adImage14Tag;
    this.adImage15Link = adImage15Link;
    this.adImage15Tag = adImage15Tag;
    this.adImage16Link = adImage16Link;
    this.adImage16Tag = adImage16Tag;
    this.adImage17Link = adImage17Link;
    this.adImage17Tag = adImage17Tag;
    this.adImage18Link = adImage18Link;
    this.adImage18Tag = adImage18Tag;
    this.adImage19Link = adImage19Link;
    this.adImage19Tag = adImage19Tag;
    this.adImage1Link = adImage1Link;
    this.adImage1Tag = adImage1Tag;
    this.adImage2Link = adImage2Link;
    this.adImage2Tag = adImage2Tag;
    this.adImage3Link = adImage3Link;
    this.adImage3Tag = adImage3Tag;
    this.adImage4Link = adImage4Link;
    this.adImage4Tag = adImage4Tag;
    this.adImage5Link = adImage5Link;
    this.adImage5Tag = adImage5Tag;
    this.adImage6Link = adImage6Link;
    this.adImage6Tag = adImage6Tag;
    this.adImage7Link = adImage7Link;
    this.adImage7Tag = adImage7Tag;
    this.adImage8Link = adImage8Link;
    this.adImage8Tag = adImage8Tag;
    this.adImage9Link = adImage9Link;
    this.adImage9Tag = adImage9Tag;
    this.adLink = adLink;
    this.adVideo0Link = adVideo0Link;
    this.adVideo0Tag = adVideo0Tag;
    this.adVideo1Link = adVideo1Link;
    this.adVideo1Tag = adVideo1Tag;
    this.adVideo2Link = adVideo2Link;
    this.adVideo2Tag = adVideo2Tag;
    this.adult = adult;
    this.ageGroup = ageGroup;
    this.androidDeepLink = androidDeepLink;
    this.availability = availability;
    this.averageReviewRating = averageReviewRating;
    this.brand = brand;
    this.checkoutEnabled = checkoutEnabled;
    this.color = color;
    this.condition = condition;
    this.customLabel0 = customLabel0;
    this.customLabel1 = customLabel1;
    this.customLabel2 = customLabel2;
    this.customLabel3 = customLabel3;
    this.customLabel4 = customLabel4;
    this.customNumber0 = customNumber0;
    this.customNumber1 = customNumber1;
    this.customNumber2 = customNumber2;
    this.customNumber3 = customNumber3;
    this.customNumber4 = customNumber4;
    this.description = description;
    this.freeShippingLabel = freeShippingLabel;
    this.freeShippingLimit = freeShippingLimit;
    this.gender = gender;
    this.googleProductCategory = googleProductCategory;
    this.gtin = gtin;
    this.id = id;
    this.installmentPrice = installmentPrice;
    this.iosDeepLink = iosDeepLink;
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
    this.promotionId = promotionId;
    this.salePrice = salePrice;
    this.salePriceEffectiveDate = salePriceEffectiveDate;
    this.shipping = shipping;
    this.shippingHeight = shippingHeight;
    this.shippingWeight = shippingWeight;
    this.shippingWidth = shippingWidth;
    this.size = size;
    this.sizeSystem = sizeSystem;
    this.sizeType = sizeType;
    this.tax = tax;
    this.title = title;
    this.unitPricingBaseMeasure = unitPricingBaseMeasure;
    this.unitPricingMeasure = unitPricingMeasure;
    this.variantNames = variantNames;
    this.variantValues = variantValues;
    this.additionalImageLink = additionalImageLink;
    this.imageLink = imageLink;
    this.savePinDisabled = savePinDisabled;
    this.videoLink = videoLink;
  }

    
  @JsonProperty("ad_image_0_link")
  public String getAdImage0Link() {
    return adImage0Link;
  }
  public void setAdImage0Link(String adImage0Link) {
    this.adImage0Link = adImage0Link;
  }

    
  @JsonProperty("ad_image_0_tag")
  public String getAdImage0Tag() {
    return adImage0Tag;
  }
  public void setAdImage0Tag(String adImage0Tag) {
    this.adImage0Tag = adImage0Tag;
  }

    
  @JsonProperty("ad_image_10_link")
  public String getAdImage10Link() {
    return adImage10Link;
  }
  public void setAdImage10Link(String adImage10Link) {
    this.adImage10Link = adImage10Link;
  }

    
  @JsonProperty("ad_image_10_tag")
  public String getAdImage10Tag() {
    return adImage10Tag;
  }
  public void setAdImage10Tag(String adImage10Tag) {
    this.adImage10Tag = adImage10Tag;
  }

    
  @JsonProperty("ad_image_11_link")
  public String getAdImage11Link() {
    return adImage11Link;
  }
  public void setAdImage11Link(String adImage11Link) {
    this.adImage11Link = adImage11Link;
  }

    
  @JsonProperty("ad_image_11_tag")
  public String getAdImage11Tag() {
    return adImage11Tag;
  }
  public void setAdImage11Tag(String adImage11Tag) {
    this.adImage11Tag = adImage11Tag;
  }

    
  @JsonProperty("ad_image_12_link")
  public String getAdImage12Link() {
    return adImage12Link;
  }
  public void setAdImage12Link(String adImage12Link) {
    this.adImage12Link = adImage12Link;
  }

    
  @JsonProperty("ad_image_12_tag")
  public String getAdImage12Tag() {
    return adImage12Tag;
  }
  public void setAdImage12Tag(String adImage12Tag) {
    this.adImage12Tag = adImage12Tag;
  }

    
  @JsonProperty("ad_image_13_link")
  public String getAdImage13Link() {
    return adImage13Link;
  }
  public void setAdImage13Link(String adImage13Link) {
    this.adImage13Link = adImage13Link;
  }

    
  @JsonProperty("ad_image_13_tag")
  public String getAdImage13Tag() {
    return adImage13Tag;
  }
  public void setAdImage13Tag(String adImage13Tag) {
    this.adImage13Tag = adImage13Tag;
  }

    
  @JsonProperty("ad_image_14_link")
  public String getAdImage14Link() {
    return adImage14Link;
  }
  public void setAdImage14Link(String adImage14Link) {
    this.adImage14Link = adImage14Link;
  }

    
  @JsonProperty("ad_image_14_tag")
  public String getAdImage14Tag() {
    return adImage14Tag;
  }
  public void setAdImage14Tag(String adImage14Tag) {
    this.adImage14Tag = adImage14Tag;
  }

    
  @JsonProperty("ad_image_15_link")
  public String getAdImage15Link() {
    return adImage15Link;
  }
  public void setAdImage15Link(String adImage15Link) {
    this.adImage15Link = adImage15Link;
  }

    
  @JsonProperty("ad_image_15_tag")
  public String getAdImage15Tag() {
    return adImage15Tag;
  }
  public void setAdImage15Tag(String adImage15Tag) {
    this.adImage15Tag = adImage15Tag;
  }

    
  @JsonProperty("ad_image_16_link")
  public String getAdImage16Link() {
    return adImage16Link;
  }
  public void setAdImage16Link(String adImage16Link) {
    this.adImage16Link = adImage16Link;
  }

    
  @JsonProperty("ad_image_16_tag")
  public String getAdImage16Tag() {
    return adImage16Tag;
  }
  public void setAdImage16Tag(String adImage16Tag) {
    this.adImage16Tag = adImage16Tag;
  }

    
  @JsonProperty("ad_image_17_link")
  public String getAdImage17Link() {
    return adImage17Link;
  }
  public void setAdImage17Link(String adImage17Link) {
    this.adImage17Link = adImage17Link;
  }

    
  @JsonProperty("ad_image_17_tag")
  public String getAdImage17Tag() {
    return adImage17Tag;
  }
  public void setAdImage17Tag(String adImage17Tag) {
    this.adImage17Tag = adImage17Tag;
  }

    
  @JsonProperty("ad_image_18_link")
  public String getAdImage18Link() {
    return adImage18Link;
  }
  public void setAdImage18Link(String adImage18Link) {
    this.adImage18Link = adImage18Link;
  }

    
  @JsonProperty("ad_image_18_tag")
  public String getAdImage18Tag() {
    return adImage18Tag;
  }
  public void setAdImage18Tag(String adImage18Tag) {
    this.adImage18Tag = adImage18Tag;
  }

    
  @JsonProperty("ad_image_19_link")
  public String getAdImage19Link() {
    return adImage19Link;
  }
  public void setAdImage19Link(String adImage19Link) {
    this.adImage19Link = adImage19Link;
  }

    
  @JsonProperty("ad_image_19_tag")
  public String getAdImage19Tag() {
    return adImage19Tag;
  }
  public void setAdImage19Tag(String adImage19Tag) {
    this.adImage19Tag = adImage19Tag;
  }

    
  @JsonProperty("ad_image_1_link")
  public String getAdImage1Link() {
    return adImage1Link;
  }
  public void setAdImage1Link(String adImage1Link) {
    this.adImage1Link = adImage1Link;
  }

    
  @JsonProperty("ad_image_1_tag")
  public String getAdImage1Tag() {
    return adImage1Tag;
  }
  public void setAdImage1Tag(String adImage1Tag) {
    this.adImage1Tag = adImage1Tag;
  }

    
  @JsonProperty("ad_image_2_link")
  public String getAdImage2Link() {
    return adImage2Link;
  }
  public void setAdImage2Link(String adImage2Link) {
    this.adImage2Link = adImage2Link;
  }

    
  @JsonProperty("ad_image_2_tag")
  public String getAdImage2Tag() {
    return adImage2Tag;
  }
  public void setAdImage2Tag(String adImage2Tag) {
    this.adImage2Tag = adImage2Tag;
  }

    
  @JsonProperty("ad_image_3_link")
  public String getAdImage3Link() {
    return adImage3Link;
  }
  public void setAdImage3Link(String adImage3Link) {
    this.adImage3Link = adImage3Link;
  }

    
  @JsonProperty("ad_image_3_tag")
  public String getAdImage3Tag() {
    return adImage3Tag;
  }
  public void setAdImage3Tag(String adImage3Tag) {
    this.adImage3Tag = adImage3Tag;
  }

    
  @JsonProperty("ad_image_4_link")
  public String getAdImage4Link() {
    return adImage4Link;
  }
  public void setAdImage4Link(String adImage4Link) {
    this.adImage4Link = adImage4Link;
  }

    
  @JsonProperty("ad_image_4_tag")
  public String getAdImage4Tag() {
    return adImage4Tag;
  }
  public void setAdImage4Tag(String adImage4Tag) {
    this.adImage4Tag = adImage4Tag;
  }

    
  @JsonProperty("ad_image_5_link")
  public String getAdImage5Link() {
    return adImage5Link;
  }
  public void setAdImage5Link(String adImage5Link) {
    this.adImage5Link = adImage5Link;
  }

    
  @JsonProperty("ad_image_5_tag")
  public String getAdImage5Tag() {
    return adImage5Tag;
  }
  public void setAdImage5Tag(String adImage5Tag) {
    this.adImage5Tag = adImage5Tag;
  }

    
  @JsonProperty("ad_image_6_link")
  public String getAdImage6Link() {
    return adImage6Link;
  }
  public void setAdImage6Link(String adImage6Link) {
    this.adImage6Link = adImage6Link;
  }

    
  @JsonProperty("ad_image_6_tag")
  public String getAdImage6Tag() {
    return adImage6Tag;
  }
  public void setAdImage6Tag(String adImage6Tag) {
    this.adImage6Tag = adImage6Tag;
  }

    
  @JsonProperty("ad_image_7_link")
  public String getAdImage7Link() {
    return adImage7Link;
  }
  public void setAdImage7Link(String adImage7Link) {
    this.adImage7Link = adImage7Link;
  }

    
  @JsonProperty("ad_image_7_tag")
  public String getAdImage7Tag() {
    return adImage7Tag;
  }
  public void setAdImage7Tag(String adImage7Tag) {
    this.adImage7Tag = adImage7Tag;
  }

    
  @JsonProperty("ad_image_8_link")
  public String getAdImage8Link() {
    return adImage8Link;
  }
  public void setAdImage8Link(String adImage8Link) {
    this.adImage8Link = adImage8Link;
  }

    
  @JsonProperty("ad_image_8_tag")
  public String getAdImage8Tag() {
    return adImage8Tag;
  }
  public void setAdImage8Tag(String adImage8Tag) {
    this.adImage8Tag = adImage8Tag;
  }

    
  @JsonProperty("ad_image_9_link")
  public String getAdImage9Link() {
    return adImage9Link;
  }
  public void setAdImage9Link(String adImage9Link) {
    this.adImage9Link = adImage9Link;
  }

    
  @JsonProperty("ad_image_9_tag")
  public String getAdImage9Tag() {
    return adImage9Tag;
  }
  public void setAdImage9Tag(String adImage9Tag) {
    this.adImage9Tag = adImage9Tag;
  }

    
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }
  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

    
  @JsonProperty("ad_video_0_link")
  public String getAdVideo0Link() {
    return adVideo0Link;
  }
  public void setAdVideo0Link(String adVideo0Link) {
    this.adVideo0Link = adVideo0Link;
  }

    
  @JsonProperty("ad_video_0_tag")
  public String getAdVideo0Tag() {
    return adVideo0Tag;
  }
  public void setAdVideo0Tag(String adVideo0Tag) {
    this.adVideo0Tag = adVideo0Tag;
  }

    
  @JsonProperty("ad_video_1_link")
  public String getAdVideo1Link() {
    return adVideo1Link;
  }
  public void setAdVideo1Link(String adVideo1Link) {
    this.adVideo1Link = adVideo1Link;
  }

    
  @JsonProperty("ad_video_1_tag")
  public String getAdVideo1Tag() {
    return adVideo1Tag;
  }
  public void setAdVideo1Tag(String adVideo1Tag) {
    this.adVideo1Tag = adVideo1Tag;
  }

    
  @JsonProperty("ad_video_2_link")
  public String getAdVideo2Link() {
    return adVideo2Link;
  }
  public void setAdVideo2Link(String adVideo2Link) {
    this.adVideo2Link = adVideo2Link;
  }

    
  @JsonProperty("ad_video_2_tag")
  public String getAdVideo2Tag() {
    return adVideo2Tag;
  }
  public void setAdVideo2Tag(String adVideo2Tag) {
    this.adVideo2Tag = adVideo2Tag;
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

    
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }
  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
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

    
  @JsonProperty("checkout_enabled")
  public Boolean getCheckoutEnabled() {
    return checkoutEnabled;
  }
  public void setCheckoutEnabled(Boolean checkoutEnabled) {
    this.checkoutEnabled = checkoutEnabled;
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

    
  @JsonProperty("custom_number_0")
  public Integer getCustomNumber0() {
    return customNumber0;
  }
  public void setCustomNumber0(Integer customNumber0) {
    this.customNumber0 = customNumber0;
  }

    
  @JsonProperty("custom_number_1")
  public Integer getCustomNumber1() {
    return customNumber1;
  }
  public void setCustomNumber1(Integer customNumber1) {
    this.customNumber1 = customNumber1;
  }

    
  @JsonProperty("custom_number_2")
  public Integer getCustomNumber2() {
    return customNumber2;
  }
  public void setCustomNumber2(Integer customNumber2) {
    this.customNumber2 = customNumber2;
  }

    
  @JsonProperty("custom_number_3")
  public Integer getCustomNumber3() {
    return customNumber3;
  }
  public void setCustomNumber3(Integer customNumber3) {
    this.customNumber3 = customNumber3;
  }

    
  @JsonProperty("custom_number_4")
  public Integer getCustomNumber4() {
    return customNumber4;
  }
  public void setCustomNumber4(Integer customNumber4) {
    this.customNumber4 = customNumber4;
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
  public UpdatableItemAttributesGtin getGtin() {
    return gtin;
  }
  public void setGtin(UpdatableItemAttributesGtin gtin) {
    this.gtin = gtin;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("installment_price")
  public String getInstallmentPrice() {
    return installmentPrice;
  }
  public void setInstallmentPrice(String installmentPrice) {
    this.installmentPrice = installmentPrice;
  }

    
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }
  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
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

    
  @JsonProperty("promotion_id")
  public String getPromotionId() {
    return promotionId;
  }
  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

    
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }
  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

    
  @JsonProperty("sale_price_effective_date")
  public String getSalePriceEffectiveDate() {
    return salePriceEffectiveDate;
  }
  public void setSalePriceEffectiveDate(String salePriceEffectiveDate) {
    this.salePriceEffectiveDate = salePriceEffectiveDate;
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

    
  @JsonProperty("unit_pricing_base_measure")
  public String getUnitPricingBaseMeasure() {
    return unitPricingBaseMeasure;
  }
  public void setUnitPricingBaseMeasure(String unitPricingBaseMeasure) {
    this.unitPricingBaseMeasure = unitPricingBaseMeasure;
  }

    
  @JsonProperty("unit_pricing_measure")
  public String getUnitPricingMeasure() {
    return unitPricingMeasure;
  }
  public void setUnitPricingMeasure(String unitPricingMeasure) {
    this.unitPricingMeasure = unitPricingMeasure;
  }

    
  @JsonProperty("variant_names")
  public List<String> getVariantNames() {
    return variantNames;
  }
  public void setVariantNames(List<String> variantNames) {
    this.variantNames = variantNames;
  }

    
  @JsonProperty("variant_values")
  public List<String> getVariantValues() {
    return variantValues;
  }
  public void setVariantValues(List<String> variantValues) {
    this.variantValues = variantValues;
  }

    
  @JsonProperty("additional_image_link")
  public List<String> getAdditionalImageLink() {
    return additionalImageLink;
  }
  public void setAdditionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
  }

    
  @JsonProperty("image_link")
  public ItemAttributesRequestAllOfImageLink getImageLink() {
    return imageLink;
  }
  public void setImageLink(ItemAttributesRequestAllOfImageLink imageLink) {
    this.imageLink = imageLink;
  }

    
  @JsonProperty("save_pin_disabled")
  public Boolean getSavePinDisabled() {
    return savePinDisabled;
  }
  public void setSavePinDisabled(Boolean savePinDisabled) {
    this.savePinDisabled = savePinDisabled;
  }

    
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
    return Objects.equals(adImage0Link, itemAttributesRequest.adImage0Link) &&
        Objects.equals(adImage0Tag, itemAttributesRequest.adImage0Tag) &&
        Objects.equals(adImage10Link, itemAttributesRequest.adImage10Link) &&
        Objects.equals(adImage10Tag, itemAttributesRequest.adImage10Tag) &&
        Objects.equals(adImage11Link, itemAttributesRequest.adImage11Link) &&
        Objects.equals(adImage11Tag, itemAttributesRequest.adImage11Tag) &&
        Objects.equals(adImage12Link, itemAttributesRequest.adImage12Link) &&
        Objects.equals(adImage12Tag, itemAttributesRequest.adImage12Tag) &&
        Objects.equals(adImage13Link, itemAttributesRequest.adImage13Link) &&
        Objects.equals(adImage13Tag, itemAttributesRequest.adImage13Tag) &&
        Objects.equals(adImage14Link, itemAttributesRequest.adImage14Link) &&
        Objects.equals(adImage14Tag, itemAttributesRequest.adImage14Tag) &&
        Objects.equals(adImage15Link, itemAttributesRequest.adImage15Link) &&
        Objects.equals(adImage15Tag, itemAttributesRequest.adImage15Tag) &&
        Objects.equals(adImage16Link, itemAttributesRequest.adImage16Link) &&
        Objects.equals(adImage16Tag, itemAttributesRequest.adImage16Tag) &&
        Objects.equals(adImage17Link, itemAttributesRequest.adImage17Link) &&
        Objects.equals(adImage17Tag, itemAttributesRequest.adImage17Tag) &&
        Objects.equals(adImage18Link, itemAttributesRequest.adImage18Link) &&
        Objects.equals(adImage18Tag, itemAttributesRequest.adImage18Tag) &&
        Objects.equals(adImage19Link, itemAttributesRequest.adImage19Link) &&
        Objects.equals(adImage19Tag, itemAttributesRequest.adImage19Tag) &&
        Objects.equals(adImage1Link, itemAttributesRequest.adImage1Link) &&
        Objects.equals(adImage1Tag, itemAttributesRequest.adImage1Tag) &&
        Objects.equals(adImage2Link, itemAttributesRequest.adImage2Link) &&
        Objects.equals(adImage2Tag, itemAttributesRequest.adImage2Tag) &&
        Objects.equals(adImage3Link, itemAttributesRequest.adImage3Link) &&
        Objects.equals(adImage3Tag, itemAttributesRequest.adImage3Tag) &&
        Objects.equals(adImage4Link, itemAttributesRequest.adImage4Link) &&
        Objects.equals(adImage4Tag, itemAttributesRequest.adImage4Tag) &&
        Objects.equals(adImage5Link, itemAttributesRequest.adImage5Link) &&
        Objects.equals(adImage5Tag, itemAttributesRequest.adImage5Tag) &&
        Objects.equals(adImage6Link, itemAttributesRequest.adImage6Link) &&
        Objects.equals(adImage6Tag, itemAttributesRequest.adImage6Tag) &&
        Objects.equals(adImage7Link, itemAttributesRequest.adImage7Link) &&
        Objects.equals(adImage7Tag, itemAttributesRequest.adImage7Tag) &&
        Objects.equals(adImage8Link, itemAttributesRequest.adImage8Link) &&
        Objects.equals(adImage8Tag, itemAttributesRequest.adImage8Tag) &&
        Objects.equals(adImage9Link, itemAttributesRequest.adImage9Link) &&
        Objects.equals(adImage9Tag, itemAttributesRequest.adImage9Tag) &&
        Objects.equals(adLink, itemAttributesRequest.adLink) &&
        Objects.equals(adVideo0Link, itemAttributesRequest.adVideo0Link) &&
        Objects.equals(adVideo0Tag, itemAttributesRequest.adVideo0Tag) &&
        Objects.equals(adVideo1Link, itemAttributesRequest.adVideo1Link) &&
        Objects.equals(adVideo1Tag, itemAttributesRequest.adVideo1Tag) &&
        Objects.equals(adVideo2Link, itemAttributesRequest.adVideo2Link) &&
        Objects.equals(adVideo2Tag, itemAttributesRequest.adVideo2Tag) &&
        Objects.equals(adult, itemAttributesRequest.adult) &&
        Objects.equals(ageGroup, itemAttributesRequest.ageGroup) &&
        Objects.equals(androidDeepLink, itemAttributesRequest.androidDeepLink) &&
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
        Objects.equals(customNumber0, itemAttributesRequest.customNumber0) &&
        Objects.equals(customNumber1, itemAttributesRequest.customNumber1) &&
        Objects.equals(customNumber2, itemAttributesRequest.customNumber2) &&
        Objects.equals(customNumber3, itemAttributesRequest.customNumber3) &&
        Objects.equals(customNumber4, itemAttributesRequest.customNumber4) &&
        Objects.equals(description, itemAttributesRequest.description) &&
        Objects.equals(freeShippingLabel, itemAttributesRequest.freeShippingLabel) &&
        Objects.equals(freeShippingLimit, itemAttributesRequest.freeShippingLimit) &&
        Objects.equals(gender, itemAttributesRequest.gender) &&
        Objects.equals(googleProductCategory, itemAttributesRequest.googleProductCategory) &&
        Objects.equals(gtin, itemAttributesRequest.gtin) &&
        Objects.equals(id, itemAttributesRequest.id) &&
        Objects.equals(installmentPrice, itemAttributesRequest.installmentPrice) &&
        Objects.equals(iosDeepLink, itemAttributesRequest.iosDeepLink) &&
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
        Objects.equals(promotionId, itemAttributesRequest.promotionId) &&
        Objects.equals(salePrice, itemAttributesRequest.salePrice) &&
        Objects.equals(salePriceEffectiveDate, itemAttributesRequest.salePriceEffectiveDate) &&
        Objects.equals(shipping, itemAttributesRequest.shipping) &&
        Objects.equals(shippingHeight, itemAttributesRequest.shippingHeight) &&
        Objects.equals(shippingWeight, itemAttributesRequest.shippingWeight) &&
        Objects.equals(shippingWidth, itemAttributesRequest.shippingWidth) &&
        Objects.equals(size, itemAttributesRequest.size) &&
        Objects.equals(sizeSystem, itemAttributesRequest.sizeSystem) &&
        Objects.equals(sizeType, itemAttributesRequest.sizeType) &&
        Objects.equals(tax, itemAttributesRequest.tax) &&
        Objects.equals(title, itemAttributesRequest.title) &&
        Objects.equals(unitPricingBaseMeasure, itemAttributesRequest.unitPricingBaseMeasure) &&
        Objects.equals(unitPricingMeasure, itemAttributesRequest.unitPricingMeasure) &&
        Objects.equals(variantNames, itemAttributesRequest.variantNames) &&
        Objects.equals(variantValues, itemAttributesRequest.variantValues) &&
        Objects.equals(additionalImageLink, itemAttributesRequest.additionalImageLink) &&
        Objects.equals(imageLink, itemAttributesRequest.imageLink) &&
        Objects.equals(savePinDisabled, itemAttributesRequest.savePinDisabled) &&
        Objects.equals(videoLink, itemAttributesRequest.videoLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adImage0Link, adImage0Tag, adImage10Link, adImage10Tag, adImage11Link, adImage11Tag, adImage12Link, adImage12Tag, adImage13Link, adImage13Tag, adImage14Link, adImage14Tag, adImage15Link, adImage15Tag, adImage16Link, adImage16Tag, adImage17Link, adImage17Tag, adImage18Link, adImage18Tag, adImage19Link, adImage19Tag, adImage1Link, adImage1Tag, adImage2Link, adImage2Tag, adImage3Link, adImage3Tag, adImage4Link, adImage4Tag, adImage5Link, adImage5Tag, adImage6Link, adImage6Tag, adImage7Link, adImage7Tag, adImage8Link, adImage8Tag, adImage9Link, adImage9Tag, adLink, adVideo0Link, adVideo0Tag, adVideo1Link, adVideo1Tag, adVideo2Link, adVideo2Tag, adult, ageGroup, androidDeepLink, availability, averageReviewRating, brand, checkoutEnabled, color, condition, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, customNumber0, customNumber1, customNumber2, customNumber3, customNumber4, description, freeShippingLabel, freeShippingLimit, gender, googleProductCategory, gtin, id, installmentPrice, iosDeepLink, itemGroupId, lastUpdatedTime, link, material, minAdPrice, mobileLink, mpn, numberOfRatings, numberOfReviews, pattern, price, productType, promotionId, salePrice, salePriceEffectiveDate, shipping, shippingHeight, shippingWeight, shippingWidth, size, sizeSystem, sizeType, tax, title, unitPricingBaseMeasure, unitPricingMeasure, variantNames, variantValues, additionalImageLink, imageLink, savePinDisabled, videoLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAttributesRequest {\n");
    
    sb.append("    adImage0Link: ").append(toIndentedString(adImage0Link)).append("\n");
    sb.append("    adImage0Tag: ").append(toIndentedString(adImage0Tag)).append("\n");
    sb.append("    adImage10Link: ").append(toIndentedString(adImage10Link)).append("\n");
    sb.append("    adImage10Tag: ").append(toIndentedString(adImage10Tag)).append("\n");
    sb.append("    adImage11Link: ").append(toIndentedString(adImage11Link)).append("\n");
    sb.append("    adImage11Tag: ").append(toIndentedString(adImage11Tag)).append("\n");
    sb.append("    adImage12Link: ").append(toIndentedString(adImage12Link)).append("\n");
    sb.append("    adImage12Tag: ").append(toIndentedString(adImage12Tag)).append("\n");
    sb.append("    adImage13Link: ").append(toIndentedString(adImage13Link)).append("\n");
    sb.append("    adImage13Tag: ").append(toIndentedString(adImage13Tag)).append("\n");
    sb.append("    adImage14Link: ").append(toIndentedString(adImage14Link)).append("\n");
    sb.append("    adImage14Tag: ").append(toIndentedString(adImage14Tag)).append("\n");
    sb.append("    adImage15Link: ").append(toIndentedString(adImage15Link)).append("\n");
    sb.append("    adImage15Tag: ").append(toIndentedString(adImage15Tag)).append("\n");
    sb.append("    adImage16Link: ").append(toIndentedString(adImage16Link)).append("\n");
    sb.append("    adImage16Tag: ").append(toIndentedString(adImage16Tag)).append("\n");
    sb.append("    adImage17Link: ").append(toIndentedString(adImage17Link)).append("\n");
    sb.append("    adImage17Tag: ").append(toIndentedString(adImage17Tag)).append("\n");
    sb.append("    adImage18Link: ").append(toIndentedString(adImage18Link)).append("\n");
    sb.append("    adImage18Tag: ").append(toIndentedString(adImage18Tag)).append("\n");
    sb.append("    adImage19Link: ").append(toIndentedString(adImage19Link)).append("\n");
    sb.append("    adImage19Tag: ").append(toIndentedString(adImage19Tag)).append("\n");
    sb.append("    adImage1Link: ").append(toIndentedString(adImage1Link)).append("\n");
    sb.append("    adImage1Tag: ").append(toIndentedString(adImage1Tag)).append("\n");
    sb.append("    adImage2Link: ").append(toIndentedString(adImage2Link)).append("\n");
    sb.append("    adImage2Tag: ").append(toIndentedString(adImage2Tag)).append("\n");
    sb.append("    adImage3Link: ").append(toIndentedString(adImage3Link)).append("\n");
    sb.append("    adImage3Tag: ").append(toIndentedString(adImage3Tag)).append("\n");
    sb.append("    adImage4Link: ").append(toIndentedString(adImage4Link)).append("\n");
    sb.append("    adImage4Tag: ").append(toIndentedString(adImage4Tag)).append("\n");
    sb.append("    adImage5Link: ").append(toIndentedString(adImage5Link)).append("\n");
    sb.append("    adImage5Tag: ").append(toIndentedString(adImage5Tag)).append("\n");
    sb.append("    adImage6Link: ").append(toIndentedString(adImage6Link)).append("\n");
    sb.append("    adImage6Tag: ").append(toIndentedString(adImage6Tag)).append("\n");
    sb.append("    adImage7Link: ").append(toIndentedString(adImage7Link)).append("\n");
    sb.append("    adImage7Tag: ").append(toIndentedString(adImage7Tag)).append("\n");
    sb.append("    adImage8Link: ").append(toIndentedString(adImage8Link)).append("\n");
    sb.append("    adImage8Tag: ").append(toIndentedString(adImage8Tag)).append("\n");
    sb.append("    adImage9Link: ").append(toIndentedString(adImage9Link)).append("\n");
    sb.append("    adImage9Tag: ").append(toIndentedString(adImage9Tag)).append("\n");
    sb.append("    adLink: ").append(toIndentedString(adLink)).append("\n");
    sb.append("    adVideo0Link: ").append(toIndentedString(adVideo0Link)).append("\n");
    sb.append("    adVideo0Tag: ").append(toIndentedString(adVideo0Tag)).append("\n");
    sb.append("    adVideo1Link: ").append(toIndentedString(adVideo1Link)).append("\n");
    sb.append("    adVideo1Tag: ").append(toIndentedString(adVideo1Tag)).append("\n");
    sb.append("    adVideo2Link: ").append(toIndentedString(adVideo2Link)).append("\n");
    sb.append("    adVideo2Tag: ").append(toIndentedString(adVideo2Tag)).append("\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    ageGroup: ").append(toIndentedString(ageGroup)).append("\n");
    sb.append("    androidDeepLink: ").append(toIndentedString(androidDeepLink)).append("\n");
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
    sb.append("    customNumber0: ").append(toIndentedString(customNumber0)).append("\n");
    sb.append("    customNumber1: ").append(toIndentedString(customNumber1)).append("\n");
    sb.append("    customNumber2: ").append(toIndentedString(customNumber2)).append("\n");
    sb.append("    customNumber3: ").append(toIndentedString(customNumber3)).append("\n");
    sb.append("    customNumber4: ").append(toIndentedString(customNumber4)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    freeShippingLabel: ").append(toIndentedString(freeShippingLabel)).append("\n");
    sb.append("    freeShippingLimit: ").append(toIndentedString(freeShippingLimit)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    googleProductCategory: ").append(toIndentedString(googleProductCategory)).append("\n");
    sb.append("    gtin: ").append(toIndentedString(gtin)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    installmentPrice: ").append(toIndentedString(installmentPrice)).append("\n");
    sb.append("    iosDeepLink: ").append(toIndentedString(iosDeepLink)).append("\n");
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
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    salePriceEffectiveDate: ").append(toIndentedString(salePriceEffectiveDate)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    shippingHeight: ").append(toIndentedString(shippingHeight)).append("\n");
    sb.append("    shippingWeight: ").append(toIndentedString(shippingWeight)).append("\n");
    sb.append("    shippingWidth: ").append(toIndentedString(shippingWidth)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeSystem: ").append(toIndentedString(sizeSystem)).append("\n");
    sb.append("    sizeType: ").append(toIndentedString(sizeType)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    unitPricingBaseMeasure: ").append(toIndentedString(unitPricingBaseMeasure)).append("\n");
    sb.append("    unitPricingMeasure: ").append(toIndentedString(unitPricingMeasure)).append("\n");
    sb.append("    variantNames: ").append(toIndentedString(variantNames)).append("\n");
    sb.append("    variantValues: ").append(toIndentedString(variantValues)).append("\n");
    sb.append("    additionalImageLink: ").append(toIndentedString(additionalImageLink)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    savePinDisabled: ").append(toIndentedString(savePinDisabled)).append("\n");
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
