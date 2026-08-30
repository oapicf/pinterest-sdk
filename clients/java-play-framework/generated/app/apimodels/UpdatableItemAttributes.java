package apimodels;

import apimodels.UpdatableItemAttributesGtin;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdatableItemAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdatableItemAttributes   {
  @JsonProperty("ad_image_0_link")
  @Size(max=2000)

  private String adImage0Link;

  @JsonProperty("ad_image_0_tag")
  @Size(max=511)

  private String adImage0Tag;

  @JsonProperty("ad_image_10_link")
  @Size(max=2000)

  private String adImage10Link;

  @JsonProperty("ad_image_10_tag")
  @Size(max=511)

  private String adImage10Tag;

  @JsonProperty("ad_image_11_link")
  @Size(max=2000)

  private String adImage11Link;

  @JsonProperty("ad_image_11_tag")
  @Size(max=511)

  private String adImage11Tag;

  @JsonProperty("ad_image_12_link")
  @Size(max=2000)

  private String adImage12Link;

  @JsonProperty("ad_image_12_tag")
  @Size(max=511)

  private String adImage12Tag;

  @JsonProperty("ad_image_13_link")
  @Size(max=2000)

  private String adImage13Link;

  @JsonProperty("ad_image_13_tag")
  @Size(max=511)

  private String adImage13Tag;

  @JsonProperty("ad_image_14_link")
  @Size(max=2000)

  private String adImage14Link;

  @JsonProperty("ad_image_14_tag")
  @Size(max=511)

  private String adImage14Tag;

  @JsonProperty("ad_image_15_link")
  @Size(max=2000)

  private String adImage15Link;

  @JsonProperty("ad_image_15_tag")
  @Size(max=511)

  private String adImage15Tag;

  @JsonProperty("ad_image_16_link")
  @Size(max=2000)

  private String adImage16Link;

  @JsonProperty("ad_image_16_tag")
  @Size(max=511)

  private String adImage16Tag;

  @JsonProperty("ad_image_17_link")
  @Size(max=2000)

  private String adImage17Link;

  @JsonProperty("ad_image_17_tag")
  @Size(max=511)

  private String adImage17Tag;

  @JsonProperty("ad_image_18_link")
  @Size(max=2000)

  private String adImage18Link;

  @JsonProperty("ad_image_18_tag")
  @Size(max=511)

  private String adImage18Tag;

  @JsonProperty("ad_image_19_link")
  @Size(max=2000)

  private String adImage19Link;

  @JsonProperty("ad_image_19_tag")
  @Size(max=511)

  private String adImage19Tag;

  @JsonProperty("ad_image_1_link")
  @Size(max=2000)

  private String adImage1Link;

  @JsonProperty("ad_image_1_tag")
  @Size(max=511)

  private String adImage1Tag;

  @JsonProperty("ad_image_2_link")
  @Size(max=2000)

  private String adImage2Link;

  @JsonProperty("ad_image_2_tag")
  @Size(max=511)

  private String adImage2Tag;

  @JsonProperty("ad_image_3_link")
  @Size(max=2000)

  private String adImage3Link;

  @JsonProperty("ad_image_3_tag")
  @Size(max=511)

  private String adImage3Tag;

  @JsonProperty("ad_image_4_link")
  @Size(max=2000)

  private String adImage4Link;

  @JsonProperty("ad_image_4_tag")
  @Size(max=511)

  private String adImage4Tag;

  @JsonProperty("ad_image_5_link")
  @Size(max=2000)

  private String adImage5Link;

  @JsonProperty("ad_image_5_tag")
  @Size(max=511)

  private String adImage5Tag;

  @JsonProperty("ad_image_6_link")
  @Size(max=2000)

  private String adImage6Link;

  @JsonProperty("ad_image_6_tag")
  @Size(max=511)

  private String adImage6Tag;

  @JsonProperty("ad_image_7_link")
  @Size(max=2000)

  private String adImage7Link;

  @JsonProperty("ad_image_7_tag")
  @Size(max=511)

  private String adImage7Tag;

  @JsonProperty("ad_image_8_link")
  @Size(max=2000)

  private String adImage8Link;

  @JsonProperty("ad_image_8_tag")
  @Size(max=511)

  private String adImage8Tag;

  @JsonProperty("ad_image_9_link")
  @Size(max=2000)

  private String adImage9Link;

  @JsonProperty("ad_image_9_tag")
  @Size(max=511)

  private String adImage9Tag;

  @JsonProperty("ad_link")
  
  private String adLink;

  @JsonProperty("ad_video_0_link")
  @Size(max=2000)

  private String adVideo0Link;

  @JsonProperty("ad_video_0_tag")
  @Size(max=511)

  private String adVideo0Tag;

  @JsonProperty("ad_video_1_link")
  @Size(max=2000)

  private String adVideo1Link;

  @JsonProperty("ad_video_1_tag")
  @Size(max=511)

  private String adVideo1Tag;

  @JsonProperty("ad_video_2_link")
  @Size(max=2000)

  private String adVideo2Link;

  @JsonProperty("ad_video_2_tag")
  @Size(max=511)

  private String adVideo2Tag;

  @JsonProperty("adult")
  
  private Boolean adult;

  @JsonProperty("age_group")
  
  private String ageGroup;

  @JsonProperty("android_deep_link")
  
  private String androidDeepLink;

  @JsonProperty("availability")
  
  private String availability;

  @JsonProperty("average_review_rating")
  @Valid

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
  @Size(max=511)

  private String customLabel0;

  @JsonProperty("custom_label_1")
  @Size(max=511)

  private String customLabel1;

  @JsonProperty("custom_label_2")
  @Size(max=511)

  private String customLabel2;

  @JsonProperty("custom_label_3")
  @Size(max=511)

  private String customLabel3;

  @JsonProperty("custom_label_4")
  @Size(max=511)

  private String customLabel4;

  @JsonProperty("custom_number_0")
  
  private Integer customNumber0;

  @JsonProperty("custom_number_1")
  
  private Integer customNumber1;

  @JsonProperty("custom_number_2")
  
  private Integer customNumber2;

  @JsonProperty("custom_number_3")
  
  private Integer customNumber3;

  @JsonProperty("custom_number_4")
  
  private Integer customNumber4;

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
  @Valid

  private UpdatableItemAttributesGtin gtin;

  @JsonProperty("id")
  
  private String id;

  @JsonProperty("installment_price")
  
  private String installmentPrice;

  @JsonProperty("ios_deep_link")
  
  private String iosDeepLink;

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

  @JsonProperty("promotion_id")
  
  private String promotionId;

  @JsonProperty("sale_price")
  
  private String salePrice;

  @JsonProperty("sale_price_effective_date")
  
  private String salePriceEffectiveDate;

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

  @JsonProperty("unit_pricing_base_measure")
  
  private String unitPricingBaseMeasure;

  @JsonProperty("unit_pricing_measure")
  
  private String unitPricingMeasure;

  @JsonProperty("variant_names")
  
  private List<String> variantNames = null;

  @JsonProperty("variant_values")
  
  private List<String> variantValues = null;

  public UpdatableItemAttributes adImage0Link(String adImage0Link) {
    this.adImage0Link = adImage0Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage0Link
  **/
  public String getAdImage0Link() {
    return adImage0Link;
  }

  public void setAdImage0Link(String adImage0Link) {
    this.adImage0Link = adImage0Link;
  }

  public UpdatableItemAttributes adImage0Tag(String adImage0Tag) {
    this.adImage0Tag = adImage0Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage0Tag
  **/
  public String getAdImage0Tag() {
    return adImage0Tag;
  }

  public void setAdImage0Tag(String adImage0Tag) {
    this.adImage0Tag = adImage0Tag;
  }

  public UpdatableItemAttributes adImage10Link(String adImage10Link) {
    this.adImage10Link = adImage10Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage10Link
  **/
  public String getAdImage10Link() {
    return adImage10Link;
  }

  public void setAdImage10Link(String adImage10Link) {
    this.adImage10Link = adImage10Link;
  }

  public UpdatableItemAttributes adImage10Tag(String adImage10Tag) {
    this.adImage10Tag = adImage10Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage10Tag
  **/
  public String getAdImage10Tag() {
    return adImage10Tag;
  }

  public void setAdImage10Tag(String adImage10Tag) {
    this.adImage10Tag = adImage10Tag;
  }

  public UpdatableItemAttributes adImage11Link(String adImage11Link) {
    this.adImage11Link = adImage11Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage11Link
  **/
  public String getAdImage11Link() {
    return adImage11Link;
  }

  public void setAdImage11Link(String adImage11Link) {
    this.adImage11Link = adImage11Link;
  }

  public UpdatableItemAttributes adImage11Tag(String adImage11Tag) {
    this.adImage11Tag = adImage11Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage11Tag
  **/
  public String getAdImage11Tag() {
    return adImage11Tag;
  }

  public void setAdImage11Tag(String adImage11Tag) {
    this.adImage11Tag = adImage11Tag;
  }

  public UpdatableItemAttributes adImage12Link(String adImage12Link) {
    this.adImage12Link = adImage12Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage12Link
  **/
  public String getAdImage12Link() {
    return adImage12Link;
  }

  public void setAdImage12Link(String adImage12Link) {
    this.adImage12Link = adImage12Link;
  }

  public UpdatableItemAttributes adImage12Tag(String adImage12Tag) {
    this.adImage12Tag = adImage12Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage12Tag
  **/
  public String getAdImage12Tag() {
    return adImage12Tag;
  }

  public void setAdImage12Tag(String adImage12Tag) {
    this.adImage12Tag = adImage12Tag;
  }

  public UpdatableItemAttributes adImage13Link(String adImage13Link) {
    this.adImage13Link = adImage13Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage13Link
  **/
  public String getAdImage13Link() {
    return adImage13Link;
  }

  public void setAdImage13Link(String adImage13Link) {
    this.adImage13Link = adImage13Link;
  }

  public UpdatableItemAttributes adImage13Tag(String adImage13Tag) {
    this.adImage13Tag = adImage13Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage13Tag
  **/
  public String getAdImage13Tag() {
    return adImage13Tag;
  }

  public void setAdImage13Tag(String adImage13Tag) {
    this.adImage13Tag = adImage13Tag;
  }

  public UpdatableItemAttributes adImage14Link(String adImage14Link) {
    this.adImage14Link = adImage14Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage14Link
  **/
  public String getAdImage14Link() {
    return adImage14Link;
  }

  public void setAdImage14Link(String adImage14Link) {
    this.adImage14Link = adImage14Link;
  }

  public UpdatableItemAttributes adImage14Tag(String adImage14Tag) {
    this.adImage14Tag = adImage14Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage14Tag
  **/
  public String getAdImage14Tag() {
    return adImage14Tag;
  }

  public void setAdImage14Tag(String adImage14Tag) {
    this.adImage14Tag = adImage14Tag;
  }

  public UpdatableItemAttributes adImage15Link(String adImage15Link) {
    this.adImage15Link = adImage15Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage15Link
  **/
  public String getAdImage15Link() {
    return adImage15Link;
  }

  public void setAdImage15Link(String adImage15Link) {
    this.adImage15Link = adImage15Link;
  }

  public UpdatableItemAttributes adImage15Tag(String adImage15Tag) {
    this.adImage15Tag = adImage15Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage15Tag
  **/
  public String getAdImage15Tag() {
    return adImage15Tag;
  }

  public void setAdImage15Tag(String adImage15Tag) {
    this.adImage15Tag = adImage15Tag;
  }

  public UpdatableItemAttributes adImage16Link(String adImage16Link) {
    this.adImage16Link = adImage16Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage16Link
  **/
  public String getAdImage16Link() {
    return adImage16Link;
  }

  public void setAdImage16Link(String adImage16Link) {
    this.adImage16Link = adImage16Link;
  }

  public UpdatableItemAttributes adImage16Tag(String adImage16Tag) {
    this.adImage16Tag = adImage16Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage16Tag
  **/
  public String getAdImage16Tag() {
    return adImage16Tag;
  }

  public void setAdImage16Tag(String adImage16Tag) {
    this.adImage16Tag = adImage16Tag;
  }

  public UpdatableItemAttributes adImage17Link(String adImage17Link) {
    this.adImage17Link = adImage17Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage17Link
  **/
  public String getAdImage17Link() {
    return adImage17Link;
  }

  public void setAdImage17Link(String adImage17Link) {
    this.adImage17Link = adImage17Link;
  }

  public UpdatableItemAttributes adImage17Tag(String adImage17Tag) {
    this.adImage17Tag = adImage17Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage17Tag
  **/
  public String getAdImage17Tag() {
    return adImage17Tag;
  }

  public void setAdImage17Tag(String adImage17Tag) {
    this.adImage17Tag = adImage17Tag;
  }

  public UpdatableItemAttributes adImage18Link(String adImage18Link) {
    this.adImage18Link = adImage18Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage18Link
  **/
  public String getAdImage18Link() {
    return adImage18Link;
  }

  public void setAdImage18Link(String adImage18Link) {
    this.adImage18Link = adImage18Link;
  }

  public UpdatableItemAttributes adImage18Tag(String adImage18Tag) {
    this.adImage18Tag = adImage18Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage18Tag
  **/
  public String getAdImage18Tag() {
    return adImage18Tag;
  }

  public void setAdImage18Tag(String adImage18Tag) {
    this.adImage18Tag = adImage18Tag;
  }

  public UpdatableItemAttributes adImage19Link(String adImage19Link) {
    this.adImage19Link = adImage19Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage19Link
  **/
  public String getAdImage19Link() {
    return adImage19Link;
  }

  public void setAdImage19Link(String adImage19Link) {
    this.adImage19Link = adImage19Link;
  }

  public UpdatableItemAttributes adImage19Tag(String adImage19Tag) {
    this.adImage19Tag = adImage19Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage19Tag
  **/
  public String getAdImage19Tag() {
    return adImage19Tag;
  }

  public void setAdImage19Tag(String adImage19Tag) {
    this.adImage19Tag = adImage19Tag;
  }

  public UpdatableItemAttributes adImage1Link(String adImage1Link) {
    this.adImage1Link = adImage1Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage1Link
  **/
  public String getAdImage1Link() {
    return adImage1Link;
  }

  public void setAdImage1Link(String adImage1Link) {
    this.adImage1Link = adImage1Link;
  }

  public UpdatableItemAttributes adImage1Tag(String adImage1Tag) {
    this.adImage1Tag = adImage1Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage1Tag
  **/
  public String getAdImage1Tag() {
    return adImage1Tag;
  }

  public void setAdImage1Tag(String adImage1Tag) {
    this.adImage1Tag = adImage1Tag;
  }

  public UpdatableItemAttributes adImage2Link(String adImage2Link) {
    this.adImage2Link = adImage2Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage2Link
  **/
  public String getAdImage2Link() {
    return adImage2Link;
  }

  public void setAdImage2Link(String adImage2Link) {
    this.adImage2Link = adImage2Link;
  }

  public UpdatableItemAttributes adImage2Tag(String adImage2Tag) {
    this.adImage2Tag = adImage2Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage2Tag
  **/
  public String getAdImage2Tag() {
    return adImage2Tag;
  }

  public void setAdImage2Tag(String adImage2Tag) {
    this.adImage2Tag = adImage2Tag;
  }

  public UpdatableItemAttributes adImage3Link(String adImage3Link) {
    this.adImage3Link = adImage3Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage3Link
  **/
  public String getAdImage3Link() {
    return adImage3Link;
  }

  public void setAdImage3Link(String adImage3Link) {
    this.adImage3Link = adImage3Link;
  }

  public UpdatableItemAttributes adImage3Tag(String adImage3Tag) {
    this.adImage3Tag = adImage3Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage3Tag
  **/
  public String getAdImage3Tag() {
    return adImage3Tag;
  }

  public void setAdImage3Tag(String adImage3Tag) {
    this.adImage3Tag = adImage3Tag;
  }

  public UpdatableItemAttributes adImage4Link(String adImage4Link) {
    this.adImage4Link = adImage4Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage4Link
  **/
  public String getAdImage4Link() {
    return adImage4Link;
  }

  public void setAdImage4Link(String adImage4Link) {
    this.adImage4Link = adImage4Link;
  }

  public UpdatableItemAttributes adImage4Tag(String adImage4Tag) {
    this.adImage4Tag = adImage4Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage4Tag
  **/
  public String getAdImage4Tag() {
    return adImage4Tag;
  }

  public void setAdImage4Tag(String adImage4Tag) {
    this.adImage4Tag = adImage4Tag;
  }

  public UpdatableItemAttributes adImage5Link(String adImage5Link) {
    this.adImage5Link = adImage5Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage5Link
  **/
  public String getAdImage5Link() {
    return adImage5Link;
  }

  public void setAdImage5Link(String adImage5Link) {
    this.adImage5Link = adImage5Link;
  }

  public UpdatableItemAttributes adImage5Tag(String adImage5Tag) {
    this.adImage5Tag = adImage5Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage5Tag
  **/
  public String getAdImage5Tag() {
    return adImage5Tag;
  }

  public void setAdImage5Tag(String adImage5Tag) {
    this.adImage5Tag = adImage5Tag;
  }

  public UpdatableItemAttributes adImage6Link(String adImage6Link) {
    this.adImage6Link = adImage6Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage6Link
  **/
  public String getAdImage6Link() {
    return adImage6Link;
  }

  public void setAdImage6Link(String adImage6Link) {
    this.adImage6Link = adImage6Link;
  }

  public UpdatableItemAttributes adImage6Tag(String adImage6Tag) {
    this.adImage6Tag = adImage6Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage6Tag
  **/
  public String getAdImage6Tag() {
    return adImage6Tag;
  }

  public void setAdImage6Tag(String adImage6Tag) {
    this.adImage6Tag = adImage6Tag;
  }

  public UpdatableItemAttributes adImage7Link(String adImage7Link) {
    this.adImage7Link = adImage7Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage7Link
  **/
  public String getAdImage7Link() {
    return adImage7Link;
  }

  public void setAdImage7Link(String adImage7Link) {
    this.adImage7Link = adImage7Link;
  }

  public UpdatableItemAttributes adImage7Tag(String adImage7Tag) {
    this.adImage7Tag = adImage7Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage7Tag
  **/
  public String getAdImage7Tag() {
    return adImage7Tag;
  }

  public void setAdImage7Tag(String adImage7Tag) {
    this.adImage7Tag = adImage7Tag;
  }

  public UpdatableItemAttributes adImage8Link(String adImage8Link) {
    this.adImage8Link = adImage8Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage8Link
  **/
  public String getAdImage8Link() {
    return adImage8Link;
  }

  public void setAdImage8Link(String adImage8Link) {
    this.adImage8Link = adImage8Link;
  }

  public UpdatableItemAttributes adImage8Tag(String adImage8Tag) {
    this.adImage8Tag = adImage8Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage8Tag
  **/
  public String getAdImage8Tag() {
    return adImage8Tag;
  }

  public void setAdImage8Tag(String adImage8Tag) {
    this.adImage8Tag = adImage8Tag;
  }

  public UpdatableItemAttributes adImage9Link(String adImage9Link) {
    this.adImage9Link = adImage9Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage9Link
  **/
  public String getAdImage9Link() {
    return adImage9Link;
  }

  public void setAdImage9Link(String adImage9Link) {
    this.adImage9Link = adImage9Link;
  }

  public UpdatableItemAttributes adImage9Tag(String adImage9Tag) {
    this.adImage9Tag = adImage9Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage9Tag
  **/
  public String getAdImage9Tag() {
    return adImage9Tag;
  }

  public void setAdImage9Tag(String adImage9Tag) {
    this.adImage9Tag = adImage9Tag;
  }

  public UpdatableItemAttributes adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

   /**
   * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.
   * @return adLink
  **/
  public String getAdLink() {
    return adLink;
  }

  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  public UpdatableItemAttributes adVideo0Link(String adVideo0Link) {
    this.adVideo0Link = adVideo0Link;
    return this;
  }

   /**
   * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adVideo0Link
  **/
  public String getAdVideo0Link() {
    return adVideo0Link;
  }

  public void setAdVideo0Link(String adVideo0Link) {
    this.adVideo0Link = adVideo0Link;
  }

  public UpdatableItemAttributes adVideo0Tag(String adVideo0Tag) {
    this.adVideo0Tag = adVideo0Tag;
    return this;
  }

   /**
   * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
   * @return adVideo0Tag
  **/
  public String getAdVideo0Tag() {
    return adVideo0Tag;
  }

  public void setAdVideo0Tag(String adVideo0Tag) {
    this.adVideo0Tag = adVideo0Tag;
  }

  public UpdatableItemAttributes adVideo1Link(String adVideo1Link) {
    this.adVideo1Link = adVideo1Link;
    return this;
  }

   /**
   * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adVideo1Link
  **/
  public String getAdVideo1Link() {
    return adVideo1Link;
  }

  public void setAdVideo1Link(String adVideo1Link) {
    this.adVideo1Link = adVideo1Link;
  }

  public UpdatableItemAttributes adVideo1Tag(String adVideo1Tag) {
    this.adVideo1Tag = adVideo1Tag;
    return this;
  }

   /**
   * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
   * @return adVideo1Tag
  **/
  public String getAdVideo1Tag() {
    return adVideo1Tag;
  }

  public void setAdVideo1Tag(String adVideo1Tag) {
    this.adVideo1Tag = adVideo1Tag;
  }

  public UpdatableItemAttributes adVideo2Link(String adVideo2Link) {
    this.adVideo2Link = adVideo2Link;
    return this;
  }

   /**
   * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adVideo2Link
  **/
  public String getAdVideo2Link() {
    return adVideo2Link;
  }

  public void setAdVideo2Link(String adVideo2Link) {
    this.adVideo2Link = adVideo2Link;
  }

  public UpdatableItemAttributes adVideo2Tag(String adVideo2Tag) {
    this.adVideo2Tag = adVideo2Tag;
    return this;
  }

   /**
   * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
   * @return adVideo2Tag
  **/
  public String getAdVideo2Tag() {
    return adVideo2Tag;
  }

  public void setAdVideo2Tag(String adVideo2Tag) {
    this.adVideo2Tag = adVideo2Tag;
  }

  public UpdatableItemAttributes adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

   /**
   * Set this attribute to TRUE if you're submitting items that are considered \"adult\". These will not be shown on Pinterest.
   * @return adult
  **/
  public Boolean getAdult() {
    return adult;
  }

  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  public UpdatableItemAttributes ageGroup(String ageGroup) {
    this.ageGroup = ageGroup;
    return this;
  }

   /**
   * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): 'newborn', 'infant', 'toddler', 'kids', or 'adult'.
   * @return ageGroup
  **/
  public String getAgeGroup() {
    return ageGroup;
  }

  public void setAgeGroup(String ageGroup) {
    this.ageGroup = ageGroup;
  }

  public UpdatableItemAttributes androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

   /**
   * The deep link to the product on the Android app.
   * @return androidDeepLink
  **/
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public UpdatableItemAttributes availability(String availability) {
    this.availability = availability;
    return this;
  }

   /**
   * The availability of the product. Must be one of the following values (upper or lowercased): 'in stock', 'out of stock', 'preorder'.
   * @return availability
  **/
  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }

  public UpdatableItemAttributes averageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
    return this;
  }

   /**
   * Average reviews for the item. Can be a number from 1-5.
   * @return averageReviewRating
  **/
  public BigDecimal getAverageReviewRating() {
    return averageReviewRating;
  }

  public void setAverageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
  }

  public UpdatableItemAttributes brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The brand of the product.
   * @return brand
  **/
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public UpdatableItemAttributes checkoutEnabled(Boolean checkoutEnabled) {
    this.checkoutEnabled = checkoutEnabled;
    return this;
  }

   /**
   * This attribute is not supported anymore.
   * @return checkoutEnabled
  **/
  public Boolean getCheckoutEnabled() {
    return checkoutEnabled;
  }

  public void setCheckoutEnabled(Boolean checkoutEnabled) {
    this.checkoutEnabled = checkoutEnabled;
  }

  public UpdatableItemAttributes color(String color) {
    this.color = color;
    return this;
  }

   /**
   * The primary color of the product.
   * @return color
  **/
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public UpdatableItemAttributes condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * The condition of the product. Must be one of the following values (upper or lowercased): 'new', 'used', or 'refurbished'.
   * @return condition
  **/
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public UpdatableItemAttributes customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

   /**
   * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
   * @return customLabel0
  **/
  public String getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public UpdatableItemAttributes customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

   /**
   * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
   * @return customLabel1
  **/
  public String getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public UpdatableItemAttributes customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

   /**
   * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
   * @return customLabel2
  **/
  public String getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public UpdatableItemAttributes customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

   /**
   * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
   * @return customLabel3
  **/
  public String getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public UpdatableItemAttributes customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

   /**
   * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
   * @return customLabel4
  **/
  public String getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public UpdatableItemAttributes customNumber0(Integer customNumber0) {
    this.customNumber0 = customNumber0;
    return this;
  }

   /**
   * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber0
  **/
  public Integer getCustomNumber0() {
    return customNumber0;
  }

  public void setCustomNumber0(Integer customNumber0) {
    this.customNumber0 = customNumber0;
  }

  public UpdatableItemAttributes customNumber1(Integer customNumber1) {
    this.customNumber1 = customNumber1;
    return this;
  }

   /**
   * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber1
  **/
  public Integer getCustomNumber1() {
    return customNumber1;
  }

  public void setCustomNumber1(Integer customNumber1) {
    this.customNumber1 = customNumber1;
  }

  public UpdatableItemAttributes customNumber2(Integer customNumber2) {
    this.customNumber2 = customNumber2;
    return this;
  }

   /**
   * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber2
  **/
  public Integer getCustomNumber2() {
    return customNumber2;
  }

  public void setCustomNumber2(Integer customNumber2) {
    this.customNumber2 = customNumber2;
  }

  public UpdatableItemAttributes customNumber3(Integer customNumber3) {
    this.customNumber3 = customNumber3;
    return this;
  }

   /**
   * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber3
  **/
  public Integer getCustomNumber3() {
    return customNumber3;
  }

  public void setCustomNumber3(Integer customNumber3) {
    this.customNumber3 = customNumber3;
  }

  public UpdatableItemAttributes customNumber4(Integer customNumber4) {
    this.customNumber4 = customNumber4;
    return this;
  }

   /**
   * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber4
  **/
  public Integer getCustomNumber4() {
    return customNumber4;
  }

  public void setCustomNumber4(Integer customNumber4) {
    this.customNumber4 = customNumber4;
  }

  public UpdatableItemAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * <= 10000 characters. The description of the product.
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdatableItemAttributes freeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
    return this;
  }

   /**
   * The item is free to ship.
   * @return freeShippingLabel
  **/
  public Boolean getFreeShippingLabel() {
    return freeShippingLabel;
  }

  public void setFreeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
  }

  public UpdatableItemAttributes freeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
    return this;
  }

   /**
   * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
   * @return freeShippingLimit
  **/
  public String getFreeShippingLimit() {
    return freeShippingLimit;
  }

  public void setFreeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
  }

  public UpdatableItemAttributes gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The gender associated with the product. Must be one of the following values (upper or lowercased): 'male', 'female', or 'unisex'.
   * @return gender
  **/
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public UpdatableItemAttributes googleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
    return this;
  }

   /**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
   * @return googleProductCategory
  **/
  public String getGoogleProductCategory() {
    return googleProductCategory;
  }

  public void setGoogleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

  public UpdatableItemAttributes gtin(UpdatableItemAttributesGtin gtin) {
    this.gtin = gtin;
    return this;
  }

   /**
   * Get gtin
   * @return gtin
  **/
  public UpdatableItemAttributesGtin getGtin() {
    return gtin;
  }

  public void setGtin(UpdatableItemAttributesGtin gtin) {
    this.gtin = gtin;
  }

  public UpdatableItemAttributes id(String id) {
    this.id = id;
    return this;
  }

   /**
   * <= 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdatableItemAttributes installmentPrice(String installmentPrice) {
    this.installmentPrice = installmentPrice;
    return this;
  }

   /**
   * Installment price of the product. Expected format: <payment_count>:<payment_amount> <currency>
   * @return installmentPrice
  **/
  public String getInstallmentPrice() {
    return installmentPrice;
  }

  public void setInstallmentPrice(String installmentPrice) {
    this.installmentPrice = installmentPrice;
  }

  public UpdatableItemAttributes iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

   /**
   * The deep link to the product on the iOS app.
   * @return iosDeepLink
  **/
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public UpdatableItemAttributes itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

   /**
   * <= 127 characters. The parent ID of the product.
   * @return itemGroupId
  **/
  public String getItemGroupId() {
    return itemGroupId;
  }

  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  public UpdatableItemAttributes lastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

   /**
   * The millisecond timestamp when the item was lastly modified by the merchant.
   * @return lastUpdatedTime
  **/
  public Long getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public UpdatableItemAttributes link(String link) {
    this.link = link;
    return this;
  }

   /**
   * <= 511 characters. The landing page for the product.
   * @return link
  **/
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public UpdatableItemAttributes material(String material) {
    this.material = material;
    return this;
  }

   /**
   * The material used to make the product.
   * @return material
  **/
  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public UpdatableItemAttributes minAdPrice(String minAdPrice) {
    this.minAdPrice = minAdPrice;
    return this;
  }

   /**
   * The minimum advertised price of the product. It supports the following formats: \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
   * @return minAdPrice
  **/
  public String getMinAdPrice() {
    return minAdPrice;
  }

  public void setMinAdPrice(String minAdPrice) {
    this.minAdPrice = minAdPrice;
  }

  public UpdatableItemAttributes mobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
    return this;
  }

   /**
   * The mobile-optimized version of your landing page. Must begin with http:// or https://.
   * @return mobileLink
  **/
  public String getMobileLink() {
    return mobileLink;
  }

  public void setMobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
  }

  public UpdatableItemAttributes mpn(String mpn) {
    this.mpn = mpn;
    return this;
  }

   /**
   * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
   * @return mpn
  **/
  public String getMpn() {
    return mpn;
  }

  public void setMpn(String mpn) {
    this.mpn = mpn;
  }

  public UpdatableItemAttributes numberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
    return this;
  }

   /**
   * The number of ratings for the item.
   * @return numberOfRatings
  **/
  public Integer getNumberOfRatings() {
    return numberOfRatings;
  }

  public void setNumberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
  }

  public UpdatableItemAttributes numberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
    return this;
  }

   /**
   * The number of reviews available for the item.
   * @return numberOfReviews
  **/
  public Integer getNumberOfReviews() {
    return numberOfReviews;
  }

  public void setNumberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
  }

  public UpdatableItemAttributes pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * The description of the pattern used for the product.
   * @return pattern
  **/
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  public UpdatableItemAttributes price(String price) {
    this.price = price;
    return this;
  }

   /**
   * The price of the product. It supports the following formats: \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
   * @return price
  **/
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public UpdatableItemAttributes productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * <= 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \" > \".
   * @return productType
  **/
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public UpdatableItemAttributes promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

   /**
   * A unique identifier referencing the promotion associated with this catalog item.
   * @return promotionId
  **/
  public String getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  public UpdatableItemAttributes salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

   /**
   * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \"14.99 USD\", \"14.99USD\" and \"14.99\".
   * @return salePrice
  **/
  public String getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  public UpdatableItemAttributes salePriceEffectiveDate(String salePriceEffectiveDate) {
    this.salePriceEffectiveDate = salePriceEffectiveDate;
    return this;
  }

   /**
   * Sale price effective date. Expected format: <start_date>/<end_date> (ISO 8601 format)
   * @return salePriceEffectiveDate
  **/
  public String getSalePriceEffectiveDate() {
    return salePriceEffectiveDate;
  }

  public void setSalePriceEffectiveDate(String salePriceEffectiveDate) {
    this.salePriceEffectiveDate = salePriceEffectiveDate;
  }

  public UpdatableItemAttributes shipping(String shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
   * @return shipping
  **/
  public String getShipping() {
    return shipping;
  }

  public void setShipping(String shipping) {
    this.shipping = shipping;
  }

  public UpdatableItemAttributes shippingHeight(String shippingHeight) {
    this.shippingHeight = shippingHeight;
    return this;
  }

   /**
   * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingHeight
  **/
  public String getShippingHeight() {
    return shippingHeight;
  }

  public void setShippingHeight(String shippingHeight) {
    this.shippingHeight = shippingHeight;
  }

  public UpdatableItemAttributes shippingWeight(String shippingWeight) {
    this.shippingWeight = shippingWeight;
    return this;
  }

   /**
   * The weight of the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingWeight
  **/
  public String getShippingWeight() {
    return shippingWeight;
  }

  public void setShippingWeight(String shippingWeight) {
    this.shippingWeight = shippingWeight;
  }

  public UpdatableItemAttributes shippingWidth(String shippingWidth) {
    this.shippingWidth = shippingWidth;
    return this;
  }

   /**
   * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingWidth
  **/
  public String getShippingWidth() {
    return shippingWidth;
  }

  public void setShippingWidth(String shippingWidth) {
    this.shippingWidth = shippingWidth;
  }

  public UpdatableItemAttributes size(String size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the product.
   * @return size
  **/
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public UpdatableItemAttributes sizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
    return this;
  }

   /**
   * Indicates the country's sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): 'US', 'UK', 'EU', 'DE', 'FR', 'JP', 'CN', 'IT', 'BR', 'MEX', or 'AU'.
   * @return sizeSystem
  **/
  public String getSizeSystem() {
    return sizeSystem;
  }

  public void setSizeSystem(String sizeSystem) {
    this.sizeSystem = sizeSystem;
  }

  public UpdatableItemAttributes sizeType(String sizeType) {
    this.sizeType = sizeType;
    return this;
  }

   /**
   * Additional description for the size. Must be one of the following values (upper or lowercased): 'regular', 'petite', 'plus', 'big_and_tall', or 'maternity'.
   * @return sizeType
  **/
  public String getSizeType() {
    return sizeType;
  }

  public void setSizeType(String sizeType) {
    this.sizeType = sizeType;
  }

  public UpdatableItemAttributes tax(String tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
   * @return tax
  **/
  public String getTax() {
    return tax;
  }

  public void setTax(String tax) {
    this.tax = tax;
  }

  public UpdatableItemAttributes title(String title) {
    this.title = title;
    return this;
  }

   /**
   * <= 500 characters. The name of the product.
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UpdatableItemAttributes unitPricingBaseMeasure(String unitPricingBaseMeasure) {
    this.unitPricingBaseMeasure = unitPricingBaseMeasure;
    return this;
  }

   /**
   * Unit pricing base measure of the product. Expected format: <base_measure> <unit_type>
   * @return unitPricingBaseMeasure
  **/
  public String getUnitPricingBaseMeasure() {
    return unitPricingBaseMeasure;
  }

  public void setUnitPricingBaseMeasure(String unitPricingBaseMeasure) {
    this.unitPricingBaseMeasure = unitPricingBaseMeasure;
  }

  public UpdatableItemAttributes unitPricingMeasure(String unitPricingMeasure) {
    this.unitPricingMeasure = unitPricingMeasure;
    return this;
  }

   /**
   * Unit pricing total measure of the product. Expected format: <total_units> <unit_type>
   * @return unitPricingMeasure
  **/
  public String getUnitPricingMeasure() {
    return unitPricingMeasure;
  }

  public void setUnitPricingMeasure(String unitPricingMeasure) {
    this.unitPricingMeasure = unitPricingMeasure;
  }

  public UpdatableItemAttributes variantNames(List<String> variantNames) {
    this.variantNames = variantNames;
    return this;
  }

  public UpdatableItemAttributes addVariantNamesItem(String variantNamesItem) {
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
  public List<String> getVariantNames() {
    return variantNames;
  }

  public void setVariantNames(List<String> variantNames) {
    this.variantNames = variantNames;
  }

  public UpdatableItemAttributes variantValues(List<String> variantValues) {
    this.variantValues = variantValues;
    return this;
  }

  public UpdatableItemAttributes addVariantValuesItem(String variantValuesItem) {
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
  public List<String> getVariantValues() {
    return variantValues;
  }

  public void setVariantValues(List<String> variantValues) {
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
    return Objects.equals(adImage0Link, updatableItemAttributes.adImage0Link) &&
        Objects.equals(adImage0Tag, updatableItemAttributes.adImage0Tag) &&
        Objects.equals(adImage10Link, updatableItemAttributes.adImage10Link) &&
        Objects.equals(adImage10Tag, updatableItemAttributes.adImage10Tag) &&
        Objects.equals(adImage11Link, updatableItemAttributes.adImage11Link) &&
        Objects.equals(adImage11Tag, updatableItemAttributes.adImage11Tag) &&
        Objects.equals(adImage12Link, updatableItemAttributes.adImage12Link) &&
        Objects.equals(adImage12Tag, updatableItemAttributes.adImage12Tag) &&
        Objects.equals(adImage13Link, updatableItemAttributes.adImage13Link) &&
        Objects.equals(adImage13Tag, updatableItemAttributes.adImage13Tag) &&
        Objects.equals(adImage14Link, updatableItemAttributes.adImage14Link) &&
        Objects.equals(adImage14Tag, updatableItemAttributes.adImage14Tag) &&
        Objects.equals(adImage15Link, updatableItemAttributes.adImage15Link) &&
        Objects.equals(adImage15Tag, updatableItemAttributes.adImage15Tag) &&
        Objects.equals(adImage16Link, updatableItemAttributes.adImage16Link) &&
        Objects.equals(adImage16Tag, updatableItemAttributes.adImage16Tag) &&
        Objects.equals(adImage17Link, updatableItemAttributes.adImage17Link) &&
        Objects.equals(adImage17Tag, updatableItemAttributes.adImage17Tag) &&
        Objects.equals(adImage18Link, updatableItemAttributes.adImage18Link) &&
        Objects.equals(adImage18Tag, updatableItemAttributes.adImage18Tag) &&
        Objects.equals(adImage19Link, updatableItemAttributes.adImage19Link) &&
        Objects.equals(adImage19Tag, updatableItemAttributes.adImage19Tag) &&
        Objects.equals(adImage1Link, updatableItemAttributes.adImage1Link) &&
        Objects.equals(adImage1Tag, updatableItemAttributes.adImage1Tag) &&
        Objects.equals(adImage2Link, updatableItemAttributes.adImage2Link) &&
        Objects.equals(adImage2Tag, updatableItemAttributes.adImage2Tag) &&
        Objects.equals(adImage3Link, updatableItemAttributes.adImage3Link) &&
        Objects.equals(adImage3Tag, updatableItemAttributes.adImage3Tag) &&
        Objects.equals(adImage4Link, updatableItemAttributes.adImage4Link) &&
        Objects.equals(adImage4Tag, updatableItemAttributes.adImage4Tag) &&
        Objects.equals(adImage5Link, updatableItemAttributes.adImage5Link) &&
        Objects.equals(adImage5Tag, updatableItemAttributes.adImage5Tag) &&
        Objects.equals(adImage6Link, updatableItemAttributes.adImage6Link) &&
        Objects.equals(adImage6Tag, updatableItemAttributes.adImage6Tag) &&
        Objects.equals(adImage7Link, updatableItemAttributes.adImage7Link) &&
        Objects.equals(adImage7Tag, updatableItemAttributes.adImage7Tag) &&
        Objects.equals(adImage8Link, updatableItemAttributes.adImage8Link) &&
        Objects.equals(adImage8Tag, updatableItemAttributes.adImage8Tag) &&
        Objects.equals(adImage9Link, updatableItemAttributes.adImage9Link) &&
        Objects.equals(adImage9Tag, updatableItemAttributes.adImage9Tag) &&
        Objects.equals(adLink, updatableItemAttributes.adLink) &&
        Objects.equals(adVideo0Link, updatableItemAttributes.adVideo0Link) &&
        Objects.equals(adVideo0Tag, updatableItemAttributes.adVideo0Tag) &&
        Objects.equals(adVideo1Link, updatableItemAttributes.adVideo1Link) &&
        Objects.equals(adVideo1Tag, updatableItemAttributes.adVideo1Tag) &&
        Objects.equals(adVideo2Link, updatableItemAttributes.adVideo2Link) &&
        Objects.equals(adVideo2Tag, updatableItemAttributes.adVideo2Tag) &&
        Objects.equals(adult, updatableItemAttributes.adult) &&
        Objects.equals(ageGroup, updatableItemAttributes.ageGroup) &&
        Objects.equals(androidDeepLink, updatableItemAttributes.androidDeepLink) &&
        Objects.equals(availability, updatableItemAttributes.availability) &&
        Objects.equals(averageReviewRating, updatableItemAttributes.averageReviewRating) &&
        Objects.equals(brand, updatableItemAttributes.brand) &&
        Objects.equals(checkoutEnabled, updatableItemAttributes.checkoutEnabled) &&
        Objects.equals(color, updatableItemAttributes.color) &&
        Objects.equals(condition, updatableItemAttributes.condition) &&
        Objects.equals(customLabel0, updatableItemAttributes.customLabel0) &&
        Objects.equals(customLabel1, updatableItemAttributes.customLabel1) &&
        Objects.equals(customLabel2, updatableItemAttributes.customLabel2) &&
        Objects.equals(customLabel3, updatableItemAttributes.customLabel3) &&
        Objects.equals(customLabel4, updatableItemAttributes.customLabel4) &&
        Objects.equals(customNumber0, updatableItemAttributes.customNumber0) &&
        Objects.equals(customNumber1, updatableItemAttributes.customNumber1) &&
        Objects.equals(customNumber2, updatableItemAttributes.customNumber2) &&
        Objects.equals(customNumber3, updatableItemAttributes.customNumber3) &&
        Objects.equals(customNumber4, updatableItemAttributes.customNumber4) &&
        Objects.equals(description, updatableItemAttributes.description) &&
        Objects.equals(freeShippingLabel, updatableItemAttributes.freeShippingLabel) &&
        Objects.equals(freeShippingLimit, updatableItemAttributes.freeShippingLimit) &&
        Objects.equals(gender, updatableItemAttributes.gender) &&
        Objects.equals(googleProductCategory, updatableItemAttributes.googleProductCategory) &&
        Objects.equals(gtin, updatableItemAttributes.gtin) &&
        Objects.equals(id, updatableItemAttributes.id) &&
        Objects.equals(installmentPrice, updatableItemAttributes.installmentPrice) &&
        Objects.equals(iosDeepLink, updatableItemAttributes.iosDeepLink) &&
        Objects.equals(itemGroupId, updatableItemAttributes.itemGroupId) &&
        Objects.equals(lastUpdatedTime, updatableItemAttributes.lastUpdatedTime) &&
        Objects.equals(link, updatableItemAttributes.link) &&
        Objects.equals(material, updatableItemAttributes.material) &&
        Objects.equals(minAdPrice, updatableItemAttributes.minAdPrice) &&
        Objects.equals(mobileLink, updatableItemAttributes.mobileLink) &&
        Objects.equals(mpn, updatableItemAttributes.mpn) &&
        Objects.equals(numberOfRatings, updatableItemAttributes.numberOfRatings) &&
        Objects.equals(numberOfReviews, updatableItemAttributes.numberOfReviews) &&
        Objects.equals(pattern, updatableItemAttributes.pattern) &&
        Objects.equals(price, updatableItemAttributes.price) &&
        Objects.equals(productType, updatableItemAttributes.productType) &&
        Objects.equals(promotionId, updatableItemAttributes.promotionId) &&
        Objects.equals(salePrice, updatableItemAttributes.salePrice) &&
        Objects.equals(salePriceEffectiveDate, updatableItemAttributes.salePriceEffectiveDate) &&
        Objects.equals(shipping, updatableItemAttributes.shipping) &&
        Objects.equals(shippingHeight, updatableItemAttributes.shippingHeight) &&
        Objects.equals(shippingWeight, updatableItemAttributes.shippingWeight) &&
        Objects.equals(shippingWidth, updatableItemAttributes.shippingWidth) &&
        Objects.equals(size, updatableItemAttributes.size) &&
        Objects.equals(sizeSystem, updatableItemAttributes.sizeSystem) &&
        Objects.equals(sizeType, updatableItemAttributes.sizeType) &&
        Objects.equals(tax, updatableItemAttributes.tax) &&
        Objects.equals(title, updatableItemAttributes.title) &&
        Objects.equals(unitPricingBaseMeasure, updatableItemAttributes.unitPricingBaseMeasure) &&
        Objects.equals(unitPricingMeasure, updatableItemAttributes.unitPricingMeasure) &&
        Objects.equals(variantNames, updatableItemAttributes.variantNames) &&
        Objects.equals(variantValues, updatableItemAttributes.variantValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adImage0Link, adImage0Tag, adImage10Link, adImage10Tag, adImage11Link, adImage11Tag, adImage12Link, adImage12Tag, adImage13Link, adImage13Tag, adImage14Link, adImage14Tag, adImage15Link, adImage15Tag, adImage16Link, adImage16Tag, adImage17Link, adImage17Tag, adImage18Link, adImage18Tag, adImage19Link, adImage19Tag, adImage1Link, adImage1Tag, adImage2Link, adImage2Tag, adImage3Link, adImage3Tag, adImage4Link, adImage4Tag, adImage5Link, adImage5Tag, adImage6Link, adImage6Tag, adImage7Link, adImage7Tag, adImage8Link, adImage8Tag, adImage9Link, adImage9Tag, adLink, adVideo0Link, adVideo0Tag, adVideo1Link, adVideo1Tag, adVideo2Link, adVideo2Tag, adult, ageGroup, androidDeepLink, availability, averageReviewRating, brand, checkoutEnabled, color, condition, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, customNumber0, customNumber1, customNumber2, customNumber3, customNumber4, description, freeShippingLabel, freeShippingLimit, gender, googleProductCategory, gtin, id, installmentPrice, iosDeepLink, itemGroupId, lastUpdatedTime, link, material, minAdPrice, mobileLink, mpn, numberOfRatings, numberOfReviews, pattern, price, productType, promotionId, salePrice, salePriceEffectiveDate, shipping, shippingHeight, shippingWeight, shippingWidth, size, sizeSystem, sizeType, tax, title, unitPricingBaseMeasure, unitPricingMeasure, variantNames, variantValues);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatableItemAttributes {\n");
    
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

