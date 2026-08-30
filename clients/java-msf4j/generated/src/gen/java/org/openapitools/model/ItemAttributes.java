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
import org.openapitools.model.CatalogsAiContentDisclosure;
import org.openapitools.model.UpdatableItemAttributesGtin;

/**
 * ItemAttributes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ItemAttributes   {
  @JsonProperty("ad_image_0_link")
  private String adImage0Link;

  @JsonProperty("ad_image_0_tag")
  private String adImage0Tag;

  @JsonProperty("ad_image_10_link")
  private String adImage10Link;

  @JsonProperty("ad_image_10_tag")
  private String adImage10Tag;

  @JsonProperty("ad_image_11_link")
  private String adImage11Link;

  @JsonProperty("ad_image_11_tag")
  private String adImage11Tag;

  @JsonProperty("ad_image_12_link")
  private String adImage12Link;

  @JsonProperty("ad_image_12_tag")
  private String adImage12Tag;

  @JsonProperty("ad_image_13_link")
  private String adImage13Link;

  @JsonProperty("ad_image_13_tag")
  private String adImage13Tag;

  @JsonProperty("ad_image_14_link")
  private String adImage14Link;

  @JsonProperty("ad_image_14_tag")
  private String adImage14Tag;

  @JsonProperty("ad_image_15_link")
  private String adImage15Link;

  @JsonProperty("ad_image_15_tag")
  private String adImage15Tag;

  @JsonProperty("ad_image_16_link")
  private String adImage16Link;

  @JsonProperty("ad_image_16_tag")
  private String adImage16Tag;

  @JsonProperty("ad_image_17_link")
  private String adImage17Link;

  @JsonProperty("ad_image_17_tag")
  private String adImage17Tag;

  @JsonProperty("ad_image_18_link")
  private String adImage18Link;

  @JsonProperty("ad_image_18_tag")
  private String adImage18Tag;

  @JsonProperty("ad_image_19_link")
  private String adImage19Link;

  @JsonProperty("ad_image_19_tag")
  private String adImage19Tag;

  @JsonProperty("ad_image_1_link")
  private String adImage1Link;

  @JsonProperty("ad_image_1_tag")
  private String adImage1Tag;

  @JsonProperty("ad_image_2_link")
  private String adImage2Link;

  @JsonProperty("ad_image_2_tag")
  private String adImage2Tag;

  @JsonProperty("ad_image_3_link")
  private String adImage3Link;

  @JsonProperty("ad_image_3_tag")
  private String adImage3Tag;

  @JsonProperty("ad_image_4_link")
  private String adImage4Link;

  @JsonProperty("ad_image_4_tag")
  private String adImage4Tag;

  @JsonProperty("ad_image_5_link")
  private String adImage5Link;

  @JsonProperty("ad_image_5_tag")
  private String adImage5Tag;

  @JsonProperty("ad_image_6_link")
  private String adImage6Link;

  @JsonProperty("ad_image_6_tag")
  private String adImage6Tag;

  @JsonProperty("ad_image_7_link")
  private String adImage7Link;

  @JsonProperty("ad_image_7_tag")
  private String adImage7Tag;

  @JsonProperty("ad_image_8_link")
  private String adImage8Link;

  @JsonProperty("ad_image_8_tag")
  private String adImage8Tag;

  @JsonProperty("ad_image_9_link")
  private String adImage9Link;

  @JsonProperty("ad_image_9_tag")
  private String adImage9Tag;

  @JsonProperty("ad_link")
  private String adLink;

  @JsonProperty("ad_video_0_link")
  private String adVideo0Link;

  @JsonProperty("ad_video_0_tag")
  private String adVideo0Tag;

  @JsonProperty("ad_video_1_link")
  private String adVideo1Link;

  @JsonProperty("ad_video_1_tag")
  private String adVideo1Tag;

  @JsonProperty("ad_video_2_link")
  private String adVideo2Link;

  @JsonProperty("ad_video_2_tag")
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

  @JsonProperty("additional_image_link")
  private List<String> additionalImageLink = null;

  @JsonProperty("ai_disclosures")
  private List<@Valid CatalogsAiContentDisclosure> aiDisclosures = null;

  @JsonProperty("image_link")
  private List<String> imageLink = null;

  @JsonProperty("video_link")
  private String videoLink;

  public ItemAttributes adImage0Link(String adImage0Link) {
    this.adImage0Link = adImage0Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage0Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage0Link() {
    return adImage0Link;
  }

  public void setAdImage0Link(String adImage0Link) {
    this.adImage0Link = adImage0Link;
  }

  public ItemAttributes adImage0Tag(String adImage0Tag) {
    this.adImage0Tag = adImage0Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage0Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage0Tag() {
    return adImage0Tag;
  }

  public void setAdImage0Tag(String adImage0Tag) {
    this.adImage0Tag = adImage0Tag;
  }

  public ItemAttributes adImage10Link(String adImage10Link) {
    this.adImage10Link = adImage10Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage10Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage10Link() {
    return adImage10Link;
  }

  public void setAdImage10Link(String adImage10Link) {
    this.adImage10Link = adImage10Link;
  }

  public ItemAttributes adImage10Tag(String adImage10Tag) {
    this.adImage10Tag = adImage10Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage10Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage10Tag() {
    return adImage10Tag;
  }

  public void setAdImage10Tag(String adImage10Tag) {
    this.adImage10Tag = adImage10Tag;
  }

  public ItemAttributes adImage11Link(String adImage11Link) {
    this.adImage11Link = adImage11Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage11Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage11Link() {
    return adImage11Link;
  }

  public void setAdImage11Link(String adImage11Link) {
    this.adImage11Link = adImage11Link;
  }

  public ItemAttributes adImage11Tag(String adImage11Tag) {
    this.adImage11Tag = adImage11Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage11Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage11Tag() {
    return adImage11Tag;
  }

  public void setAdImage11Tag(String adImage11Tag) {
    this.adImage11Tag = adImage11Tag;
  }

  public ItemAttributes adImage12Link(String adImage12Link) {
    this.adImage12Link = adImage12Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage12Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage12Link() {
    return adImage12Link;
  }

  public void setAdImage12Link(String adImage12Link) {
    this.adImage12Link = adImage12Link;
  }

  public ItemAttributes adImage12Tag(String adImage12Tag) {
    this.adImage12Tag = adImage12Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage12Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage12Tag() {
    return adImage12Tag;
  }

  public void setAdImage12Tag(String adImage12Tag) {
    this.adImage12Tag = adImage12Tag;
  }

  public ItemAttributes adImage13Link(String adImage13Link) {
    this.adImage13Link = adImage13Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage13Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage13Link() {
    return adImage13Link;
  }

  public void setAdImage13Link(String adImage13Link) {
    this.adImage13Link = adImage13Link;
  }

  public ItemAttributes adImage13Tag(String adImage13Tag) {
    this.adImage13Tag = adImage13Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage13Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage13Tag() {
    return adImage13Tag;
  }

  public void setAdImage13Tag(String adImage13Tag) {
    this.adImage13Tag = adImage13Tag;
  }

  public ItemAttributes adImage14Link(String adImage14Link) {
    this.adImage14Link = adImage14Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage14Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage14Link() {
    return adImage14Link;
  }

  public void setAdImage14Link(String adImage14Link) {
    this.adImage14Link = adImage14Link;
  }

  public ItemAttributes adImage14Tag(String adImage14Tag) {
    this.adImage14Tag = adImage14Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage14Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage14Tag() {
    return adImage14Tag;
  }

  public void setAdImage14Tag(String adImage14Tag) {
    this.adImage14Tag = adImage14Tag;
  }

  public ItemAttributes adImage15Link(String adImage15Link) {
    this.adImage15Link = adImage15Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage15Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage15Link() {
    return adImage15Link;
  }

  public void setAdImage15Link(String adImage15Link) {
    this.adImage15Link = adImage15Link;
  }

  public ItemAttributes adImage15Tag(String adImage15Tag) {
    this.adImage15Tag = adImage15Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage15Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage15Tag() {
    return adImage15Tag;
  }

  public void setAdImage15Tag(String adImage15Tag) {
    this.adImage15Tag = adImage15Tag;
  }

  public ItemAttributes adImage16Link(String adImage16Link) {
    this.adImage16Link = adImage16Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage16Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage16Link() {
    return adImage16Link;
  }

  public void setAdImage16Link(String adImage16Link) {
    this.adImage16Link = adImage16Link;
  }

  public ItemAttributes adImage16Tag(String adImage16Tag) {
    this.adImage16Tag = adImage16Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage16Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage16Tag() {
    return adImage16Tag;
  }

  public void setAdImage16Tag(String adImage16Tag) {
    this.adImage16Tag = adImage16Tag;
  }

  public ItemAttributes adImage17Link(String adImage17Link) {
    this.adImage17Link = adImage17Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage17Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage17Link() {
    return adImage17Link;
  }

  public void setAdImage17Link(String adImage17Link) {
    this.adImage17Link = adImage17Link;
  }

  public ItemAttributes adImage17Tag(String adImage17Tag) {
    this.adImage17Tag = adImage17Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage17Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage17Tag() {
    return adImage17Tag;
  }

  public void setAdImage17Tag(String adImage17Tag) {
    this.adImage17Tag = adImage17Tag;
  }

  public ItemAttributes adImage18Link(String adImage18Link) {
    this.adImage18Link = adImage18Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage18Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage18Link() {
    return adImage18Link;
  }

  public void setAdImage18Link(String adImage18Link) {
    this.adImage18Link = adImage18Link;
  }

  public ItemAttributes adImage18Tag(String adImage18Tag) {
    this.adImage18Tag = adImage18Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage18Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage18Tag() {
    return adImage18Tag;
  }

  public void setAdImage18Tag(String adImage18Tag) {
    this.adImage18Tag = adImage18Tag;
  }

  public ItemAttributes adImage19Link(String adImage19Link) {
    this.adImage19Link = adImage19Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage19Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage19Link() {
    return adImage19Link;
  }

  public void setAdImage19Link(String adImage19Link) {
    this.adImage19Link = adImage19Link;
  }

  public ItemAttributes adImage19Tag(String adImage19Tag) {
    this.adImage19Tag = adImage19Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage19Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage19Tag() {
    return adImage19Tag;
  }

  public void setAdImage19Tag(String adImage19Tag) {
    this.adImage19Tag = adImage19Tag;
  }

  public ItemAttributes adImage1Link(String adImage1Link) {
    this.adImage1Link = adImage1Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage1Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage1Link() {
    return adImage1Link;
  }

  public void setAdImage1Link(String adImage1Link) {
    this.adImage1Link = adImage1Link;
  }

  public ItemAttributes adImage1Tag(String adImage1Tag) {
    this.adImage1Tag = adImage1Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage1Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage1Tag() {
    return adImage1Tag;
  }

  public void setAdImage1Tag(String adImage1Tag) {
    this.adImage1Tag = adImage1Tag;
  }

  public ItemAttributes adImage2Link(String adImage2Link) {
    this.adImage2Link = adImage2Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage2Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage2Link() {
    return adImage2Link;
  }

  public void setAdImage2Link(String adImage2Link) {
    this.adImage2Link = adImage2Link;
  }

  public ItemAttributes adImage2Tag(String adImage2Tag) {
    this.adImage2Tag = adImage2Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage2Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage2Tag() {
    return adImage2Tag;
  }

  public void setAdImage2Tag(String adImage2Tag) {
    this.adImage2Tag = adImage2Tag;
  }

  public ItemAttributes adImage3Link(String adImage3Link) {
    this.adImage3Link = adImage3Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage3Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage3Link() {
    return adImage3Link;
  }

  public void setAdImage3Link(String adImage3Link) {
    this.adImage3Link = adImage3Link;
  }

  public ItemAttributes adImage3Tag(String adImage3Tag) {
    this.adImage3Tag = adImage3Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage3Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage3Tag() {
    return adImage3Tag;
  }

  public void setAdImage3Tag(String adImage3Tag) {
    this.adImage3Tag = adImage3Tag;
  }

  public ItemAttributes adImage4Link(String adImage4Link) {
    this.adImage4Link = adImage4Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage4Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage4Link() {
    return adImage4Link;
  }

  public void setAdImage4Link(String adImage4Link) {
    this.adImage4Link = adImage4Link;
  }

  public ItemAttributes adImage4Tag(String adImage4Tag) {
    this.adImage4Tag = adImage4Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage4Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage4Tag() {
    return adImage4Tag;
  }

  public void setAdImage4Tag(String adImage4Tag) {
    this.adImage4Tag = adImage4Tag;
  }

  public ItemAttributes adImage5Link(String adImage5Link) {
    this.adImage5Link = adImage5Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage5Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage5Link() {
    return adImage5Link;
  }

  public void setAdImage5Link(String adImage5Link) {
    this.adImage5Link = adImage5Link;
  }

  public ItemAttributes adImage5Tag(String adImage5Tag) {
    this.adImage5Tag = adImage5Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage5Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage5Tag() {
    return adImage5Tag;
  }

  public void setAdImage5Tag(String adImage5Tag) {
    this.adImage5Tag = adImage5Tag;
  }

  public ItemAttributes adImage6Link(String adImage6Link) {
    this.adImage6Link = adImage6Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage6Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage6Link() {
    return adImage6Link;
  }

  public void setAdImage6Link(String adImage6Link) {
    this.adImage6Link = adImage6Link;
  }

  public ItemAttributes adImage6Tag(String adImage6Tag) {
    this.adImage6Tag = adImage6Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage6Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage6Tag() {
    return adImage6Tag;
  }

  public void setAdImage6Tag(String adImage6Tag) {
    this.adImage6Tag = adImage6Tag;
  }

  public ItemAttributes adImage7Link(String adImage7Link) {
    this.adImage7Link = adImage7Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage7Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage7Link() {
    return adImage7Link;
  }

  public void setAdImage7Link(String adImage7Link) {
    this.adImage7Link = adImage7Link;
  }

  public ItemAttributes adImage7Tag(String adImage7Tag) {
    this.adImage7Tag = adImage7Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage7Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage7Tag() {
    return adImage7Tag;
  }

  public void setAdImage7Tag(String adImage7Tag) {
    this.adImage7Tag = adImage7Tag;
  }

  public ItemAttributes adImage8Link(String adImage8Link) {
    this.adImage8Link = adImage8Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage8Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage8Link() {
    return adImage8Link;
  }

  public void setAdImage8Link(String adImage8Link) {
    this.adImage8Link = adImage8Link;
  }

  public ItemAttributes adImage8Tag(String adImage8Tag) {
    this.adImage8Tag = adImage8Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage8Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage8Tag() {
    return adImage8Tag;
  }

  public void setAdImage8Tag(String adImage8Tag) {
    this.adImage8Tag = adImage8Tag;
  }

  public ItemAttributes adImage9Link(String adImage9Link) {
    this.adImage9Link = adImage9Link;
    return this;
  }

   /**
   * Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adImage9Link
  **/
  @ApiModelProperty(example = "https://www.example.com/image/image_v2.jpg", value = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdImage9Link() {
    return adImage9Link;
  }

  public void setAdImage9Link(String adImage9Link) {
    this.adImage9Link = adImage9Link;
  }

  public ItemAttributes adImage9Tag(String adImage9Tag) {
    this.adImage9Tag = adImage9Tag;
    return this;
  }

   /**
   * Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
   * @return adImage9Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
  public String getAdImage9Tag() {
    return adImage9Tag;
  }

  public void setAdImage9Tag(String adImage9Tag) {
    this.adImage9Tag = adImage9Tag;
  }

  public ItemAttributes adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

   /**
   * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.
   * @return adLink
  **/
  @ApiModelProperty(example = "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest", value = "Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.")
  public String getAdLink() {
    return adLink;
  }

  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  public ItemAttributes adVideo0Link(String adVideo0Link) {
    this.adVideo0Link = adVideo0Link;
    return this;
  }

   /**
   * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adVideo0Link
  **/
  @ApiModelProperty(example = "https://www.example.com/video/video_v2.mov", value = "Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdVideo0Link() {
    return adVideo0Link;
  }

  public void setAdVideo0Link(String adVideo0Link) {
    this.adVideo0Link = adVideo0Link;
  }

  public ItemAttributes adVideo0Tag(String adVideo0Tag) {
    this.adVideo0Tag = adVideo0Tag;
    return this;
  }

   /**
   * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
   * @return adVideo0Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.")
  public String getAdVideo0Tag() {
    return adVideo0Tag;
  }

  public void setAdVideo0Tag(String adVideo0Tag) {
    this.adVideo0Tag = adVideo0Tag;
  }

  public ItemAttributes adVideo1Link(String adVideo1Link) {
    this.adVideo1Link = adVideo1Link;
    return this;
  }

   /**
   * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adVideo1Link
  **/
  @ApiModelProperty(example = "https://www.example.com/video/video_v2.mov", value = "Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdVideo1Link() {
    return adVideo1Link;
  }

  public void setAdVideo1Link(String adVideo1Link) {
    this.adVideo1Link = adVideo1Link;
  }

  public ItemAttributes adVideo1Tag(String adVideo1Tag) {
    this.adVideo1Tag = adVideo1Tag;
    return this;
  }

   /**
   * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
   * @return adVideo1Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.")
  public String getAdVideo1Tag() {
    return adVideo1Tag;
  }

  public void setAdVideo1Tag(String adVideo1Tag) {
    this.adVideo1Tag = adVideo1Tag;
  }

  public ItemAttributes adVideo2Link(String adVideo2Link) {
    this.adVideo2Link = adVideo2Link;
    return this;
  }

   /**
   * Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
   * @return adVideo2Link
  **/
  @ApiModelProperty(example = "https://www.example.com/video/video_v2.mov", value = "Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
  public String getAdVideo2Link() {
    return adVideo2Link;
  }

  public void setAdVideo2Link(String adVideo2Link) {
    this.adVideo2Link = adVideo2Link;
  }

  public ItemAttributes adVideo2Tag(String adVideo2Tag) {
    this.adVideo2Tag = adVideo2Tag;
    return this;
  }

   /**
   * Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
   * @return adVideo2Tag
  **/
  @ApiModelProperty(example = "black friday", value = "Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.")
  public String getAdVideo2Tag() {
    return adVideo2Tag;
  }

  public void setAdVideo2Tag(String adVideo2Tag) {
    this.adVideo2Tag = adVideo2Tag;
  }

  public ItemAttributes adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

   /**
   * Set this attribute to TRUE if you're submitting items that are considered \"adult\". These will not be shown on Pinterest.
   * @return adult
  **/
  @ApiModelProperty(example = "true", value = "Set this attribute to TRUE if you're submitting items that are considered \"adult\". These will not be shown on Pinterest.")
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
   * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): 'newborn', 'infant', 'toddler', 'kids', or 'adult'.
   * @return ageGroup
  **/
  @ApiModelProperty(example = "newborn", value = "The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): 'newborn', 'infant', 'toddler', 'kids', or 'adult'.")
  public String getAgeGroup() {
    return ageGroup;
  }

  public void setAgeGroup(String ageGroup) {
    this.ageGroup = ageGroup;
  }

  public ItemAttributes androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

   /**
   * The deep link to the product on the Android app.
   * @return androidDeepLink
  **/
  @ApiModelProperty(example = "pinterest://item/1234567890", value = "The deep link to the product on the Android app.")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public ItemAttributes availability(String availability) {
    this.availability = availability;
    return this;
  }

   /**
   * The availability of the product. Must be one of the following values (upper or lowercased): 'in stock', 'out of stock', 'preorder'.
   * @return availability
  **/
  @ApiModelProperty(example = "in stock", value = "The availability of the product. Must be one of the following values (upper or lowercased): 'in stock', 'out of stock', 'preorder'.")
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
  @ApiModelProperty(example = "Josie's Denim", value = "The brand of the product.")
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
   * The condition of the product. Must be one of the following values (upper or lowercased): 'new', 'used', or 'refurbished'.
   * @return condition
  **/
  @ApiModelProperty(example = "new", value = "The condition of the product. Must be one of the following values (upper or lowercased): 'new', 'used', or 'refurbished'.")
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
   * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
   * @return customLabel0
  **/
  @ApiModelProperty(example = "Best sellers", value = "<= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.")
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
   * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
   * @return customLabel1
  **/
  @ApiModelProperty(example = "Summer promotion", value = "<= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.")
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
   * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
   * @return customLabel2
  **/
  @ApiModelProperty(example = "Winter sales", value = "<= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.")
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
   * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
   * @return customLabel3
  **/
  @ApiModelProperty(example = "Woman dress", value = "<= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.")
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
   * <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
   * @return customLabel4
  **/
  @ApiModelProperty(example = "Man hat", value = "<= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.")
  public String getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public ItemAttributes customNumber0(Integer customNumber0) {
    this.customNumber0 = customNumber0;
    return this;
  }

   /**
   * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber0
  **/
  @ApiModelProperty(example = "10", value = "An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.")
  public Integer getCustomNumber0() {
    return customNumber0;
  }

  public void setCustomNumber0(Integer customNumber0) {
    this.customNumber0 = customNumber0;
  }

  public ItemAttributes customNumber1(Integer customNumber1) {
    this.customNumber1 = customNumber1;
    return this;
  }

   /**
   * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber1
  **/
  @ApiModelProperty(example = "0", value = "An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.")
  public Integer getCustomNumber1() {
    return customNumber1;
  }

  public void setCustomNumber1(Integer customNumber1) {
    this.customNumber1 = customNumber1;
  }

  public ItemAttributes customNumber2(Integer customNumber2) {
    this.customNumber2 = customNumber2;
    return this;
  }

   /**
   * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber2
  **/
  @ApiModelProperty(example = "1520000000", value = "An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.")
  public Integer getCustomNumber2() {
    return customNumber2;
  }

  public void setCustomNumber2(Integer customNumber2) {
    this.customNumber2 = customNumber2;
  }

  public ItemAttributes customNumber3(Integer customNumber3) {
    this.customNumber3 = customNumber3;
    return this;
  }

   /**
   * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber3
  **/
  @ApiModelProperty(example = "4294967295", value = "An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.")
  public Integer getCustomNumber3() {
    return customNumber3;
  }

  public void setCustomNumber3(Integer customNumber3) {
    this.customNumber3 = customNumber3;
  }

  public ItemAttributes customNumber4(Integer customNumber4) {
    this.customNumber4 = customNumber4;
    return this;
  }

   /**
   * An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber4
  **/
  @ApiModelProperty(example = "50", value = "An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.")
  public Integer getCustomNumber4() {
    return customNumber4;
  }

  public void setCustomNumber4(Integer customNumber4) {
    this.customNumber4 = customNumber4;
  }

  public ItemAttributes description(String description) {
    this.description = description;
    return this;
  }

   /**
   * <= 10000 characters. The description of the product.
   * @return description
  **/
  @ApiModelProperty(example = "Casual fit denim shirt made with the finest quality Japanese denim.", value = "<= 10000 characters. The description of the product.")
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
   * The gender associated with the product. Must be one of the following values (upper or lowercased): 'male', 'female', or 'unisex'.
   * @return gender
  **/
  @ApiModelProperty(example = "unisex", value = "The gender associated with the product. Must be one of the following values (upper or lowercased): 'male', 'female', or 'unisex'.")
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

  public ItemAttributes gtin(UpdatableItemAttributesGtin gtin) {
    this.gtin = gtin;
    return this;
  }

   /**
   * Get gtin
   * @return gtin
  **/
  @ApiModelProperty(value = "")
  public UpdatableItemAttributesGtin getGtin() {
    return gtin;
  }

  public void setGtin(UpdatableItemAttributesGtin gtin) {
    this.gtin = gtin;
  }

  public ItemAttributes id(String id) {
    this.id = id;
    return this;
  }

   /**
   * <= 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.
   * @return id
  **/
  @ApiModelProperty(example = "DS0294-L", value = "<= 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ItemAttributes installmentPrice(String installmentPrice) {
    this.installmentPrice = installmentPrice;
    return this;
  }

   /**
   * Installment price of the product. Expected format: <payment_count>:<payment_amount> <currency>
   * @return installmentPrice
  **/
  @ApiModelProperty(example = "10:10.00 USD", value = "Installment price of the product. Expected format: <payment_count>:<payment_amount> <currency>")
  public String getInstallmentPrice() {
    return installmentPrice;
  }

  public void setInstallmentPrice(String installmentPrice) {
    this.installmentPrice = installmentPrice;
  }

  public ItemAttributes iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

   /**
   * The deep link to the product on the iOS app.
   * @return iosDeepLink
  **/
  @ApiModelProperty(example = "pinterest://item/1234567890", value = "The deep link to the product on the iOS app.")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public ItemAttributes itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

   /**
   * <= 127 characters. The parent ID of the product.
   * @return itemGroupId
  **/
  @ApiModelProperty(example = "DS0294", value = "<= 127 characters. The parent ID of the product.")
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
   * <= 511 characters. The landing page for the product.
   * @return link
  **/
  @ApiModelProperty(example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294", value = "<= 511 characters. The landing page for the product.")
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
   * The minimum advertised price of the product. It supports the following formats: \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
   * @return minAdPrice
  **/
  @ApiModelProperty(example = "19.99 USD", value = "The minimum advertised price of the product. It supports the following formats: \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.")
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
   * The price of the product. It supports the following formats: \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
   * @return price
  **/
  @ApiModelProperty(example = "24.99 USD", value = "The price of the product. It supports the following formats: \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
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
   * <= 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \" > \".
   * @return productType
  **/
  @ApiModelProperty(example = "Clothing > Women's > Shirts > Denim", value = "<= 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \" > \".")
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public ItemAttributes promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

   /**
   * A unique identifier referencing the promotion associated with this catalog item.
   * @return promotionId
  **/
  @ApiModelProperty(example = "promotion_1", value = "A unique identifier referencing the promotion associated with this catalog item.")
  public String getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  public ItemAttributes salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

   /**
   * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \"14.99 USD\", \"14.99USD\" and \"14.99\".
   * @return salePrice
  **/
  @ApiModelProperty(example = "14.99 USD", value = "The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \"14.99 USD\", \"14.99USD\" and \"14.99\".")
  public String getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  public ItemAttributes salePriceEffectiveDate(String salePriceEffectiveDate) {
    this.salePriceEffectiveDate = salePriceEffectiveDate;
    return this;
  }

   /**
   * Sale price effective date. Expected format: <start_date>/<end_date> (ISO 8601 format)
   * @return salePriceEffectiveDate
  **/
  @ApiModelProperty(example = "2025-01-01T00:00:00.000000Z/2025-01-07T00:00:00.000000Z", value = "Sale price effective date. Expected format: <start_date>/<end_date> (ISO 8601 format)")
  public String getSalePriceEffectiveDate() {
    return salePriceEffectiveDate;
  }

  public void setSalePriceEffectiveDate(String salePriceEffectiveDate) {
    this.salePriceEffectiveDate = salePriceEffectiveDate;
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
   * Indicates the country's sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): 'US', 'UK', 'EU', 'DE', 'FR', 'JP', 'CN', 'IT', 'BR', 'MEX', or 'AU'.
   * @return sizeSystem
  **/
  @ApiModelProperty(example = "US", value = "Indicates the country's sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): 'US', 'UK', 'EU', 'DE', 'FR', 'JP', 'CN', 'IT', 'BR', 'MEX', or 'AU'.")
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
   * Additional description for the size. Must be one of the following values (upper or lowercased): 'regular', 'petite', 'plus', 'big_and_tall', or 'maternity'.
   * @return sizeType
  **/
  @ApiModelProperty(example = "regular", value = "Additional description for the size. Must be one of the following values (upper or lowercased): 'regular', 'petite', 'plus', 'big_and_tall', or 'maternity'.")
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
   * <= 500 characters. The name of the product.
   * @return title
  **/
  @ApiModelProperty(example = "Women's denim shirt, large", value = "<= 500 characters. The name of the product.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ItemAttributes unitPricingBaseMeasure(String unitPricingBaseMeasure) {
    this.unitPricingBaseMeasure = unitPricingBaseMeasure;
    return this;
  }

   /**
   * Unit pricing base measure of the product. Expected format: <base_measure> <unit_type>
   * @return unitPricingBaseMeasure
  **/
  @ApiModelProperty(example = "10 ML", value = "Unit pricing base measure of the product. Expected format: <base_measure> <unit_type>")
  public String getUnitPricingBaseMeasure() {
    return unitPricingBaseMeasure;
  }

  public void setUnitPricingBaseMeasure(String unitPricingBaseMeasure) {
    this.unitPricingBaseMeasure = unitPricingBaseMeasure;
  }

  public ItemAttributes unitPricingMeasure(String unitPricingMeasure) {
    this.unitPricingMeasure = unitPricingMeasure;
    return this;
  }

   /**
   * Unit pricing total measure of the product. Expected format: <total_units> <unit_type>
   * @return unitPricingMeasure
  **/
  @ApiModelProperty(example = "10 ML", value = "Unit pricing total measure of the product. Expected format: <total_units> <unit_type>")
  public String getUnitPricingMeasure() {
    return unitPricingMeasure;
  }

  public void setUnitPricingMeasure(String unitPricingMeasure) {
    this.unitPricingMeasure = unitPricingMeasure;
  }

  public ItemAttributes variantNames(List<String> variantNames) {
    this.variantNames = variantNames;
    return this;
  }

  public ItemAttributes addVariantNamesItem(String variantNamesItem) {
    if (this.variantNames == null) {
      this.variantNames = ;
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
      this.variantValues = ;
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
      this.additionalImageLink = ;
    }
    this.additionalImageLink.add(additionalImageLinkItem);
    return this;
  }

   /**
   * <= 2000 characters. The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.
   * @return additionalImageLink
  **/
  @ApiModelProperty(example = "[\"https://scene.example.com/image/image_v2.jpg\",\"https://scene.example.com/image/image_v3.jpg\"]", value = "<= 2000 characters. The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.")
  public List<String> getAdditionalImageLink() {
    return additionalImageLink;
  }

  public void setAdditionalImageLink(List<String> additionalImageLink) {
    this.additionalImageLink = additionalImageLink;
  }

  public ItemAttributes aiDisclosures(List<@Valid CatalogsAiContentDisclosure> aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

  public ItemAttributes addAiDisclosuresItem(CatalogsAiContentDisclosure aiDisclosuresItem) {
    if (this.aiDisclosures == null) {
      this.aiDisclosures = new ArrayList<>();
    }
    this.aiDisclosures.add(aiDisclosuresItem);
    return this;
  }

   /**
   * AI content disclosures for individual assets (image_link, additional_image_link, or video_link) on this item. Each entry declares which disclosure types apply to a single asset URL.
   * @return aiDisclosures
  **/
  @ApiModelProperty(example = "[{\"url\":\"https://scene.example.com/image/image_v3.jpg\",\"disclosure\":[\"ai_modified\"]}]", value = "AI content disclosures for individual assets (image_link, additional_image_link, or video_link) on this item. Each entry declares which disclosure types apply to a single asset URL.")
  public List<@Valid CatalogsAiContentDisclosure> getAiDisclosures() {
    return aiDisclosures;
  }

  public void setAiDisclosures(List<@Valid CatalogsAiContentDisclosure> aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
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
   * <= 2000 characters. The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
   * @return imageLink
  **/
  @ApiModelProperty(example = "[\"https://scene.example.com/image/image.jpg\"]", value = "<= 2000 characters. The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.")
  public List<String> getImageLink() {
    return imageLink;
  }

  public void setImageLink(List<String> imageLink) {
    this.imageLink = imageLink;
  }

  public ItemAttributes videoLink(String videoLink) {
    this.videoLink = videoLink;
    return this;
  }

   /**
   * <= 2,000 characters. Hosted link to the product video. File types must be .mp4, .mov or .m4v. File size cannot exceed 2GB.
   * @return videoLink
  **/
  @ApiModelProperty(example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294.mp4", value = "<= 2,000 characters. Hosted link to the product video. File types must be .mp4, .mov or .m4v. File size cannot exceed 2GB.")
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
    ItemAttributes itemAttributes = (ItemAttributes) o;
    return Objects.equals(this.adImage0Link, itemAttributes.adImage0Link) &&
        Objects.equals(this.adImage0Tag, itemAttributes.adImage0Tag) &&
        Objects.equals(this.adImage10Link, itemAttributes.adImage10Link) &&
        Objects.equals(this.adImage10Tag, itemAttributes.adImage10Tag) &&
        Objects.equals(this.adImage11Link, itemAttributes.adImage11Link) &&
        Objects.equals(this.adImage11Tag, itemAttributes.adImage11Tag) &&
        Objects.equals(this.adImage12Link, itemAttributes.adImage12Link) &&
        Objects.equals(this.adImage12Tag, itemAttributes.adImage12Tag) &&
        Objects.equals(this.adImage13Link, itemAttributes.adImage13Link) &&
        Objects.equals(this.adImage13Tag, itemAttributes.adImage13Tag) &&
        Objects.equals(this.adImage14Link, itemAttributes.adImage14Link) &&
        Objects.equals(this.adImage14Tag, itemAttributes.adImage14Tag) &&
        Objects.equals(this.adImage15Link, itemAttributes.adImage15Link) &&
        Objects.equals(this.adImage15Tag, itemAttributes.adImage15Tag) &&
        Objects.equals(this.adImage16Link, itemAttributes.adImage16Link) &&
        Objects.equals(this.adImage16Tag, itemAttributes.adImage16Tag) &&
        Objects.equals(this.adImage17Link, itemAttributes.adImage17Link) &&
        Objects.equals(this.adImage17Tag, itemAttributes.adImage17Tag) &&
        Objects.equals(this.adImage18Link, itemAttributes.adImage18Link) &&
        Objects.equals(this.adImage18Tag, itemAttributes.adImage18Tag) &&
        Objects.equals(this.adImage19Link, itemAttributes.adImage19Link) &&
        Objects.equals(this.adImage19Tag, itemAttributes.adImage19Tag) &&
        Objects.equals(this.adImage1Link, itemAttributes.adImage1Link) &&
        Objects.equals(this.adImage1Tag, itemAttributes.adImage1Tag) &&
        Objects.equals(this.adImage2Link, itemAttributes.adImage2Link) &&
        Objects.equals(this.adImage2Tag, itemAttributes.adImage2Tag) &&
        Objects.equals(this.adImage3Link, itemAttributes.adImage3Link) &&
        Objects.equals(this.adImage3Tag, itemAttributes.adImage3Tag) &&
        Objects.equals(this.adImage4Link, itemAttributes.adImage4Link) &&
        Objects.equals(this.adImage4Tag, itemAttributes.adImage4Tag) &&
        Objects.equals(this.adImage5Link, itemAttributes.adImage5Link) &&
        Objects.equals(this.adImage5Tag, itemAttributes.adImage5Tag) &&
        Objects.equals(this.adImage6Link, itemAttributes.adImage6Link) &&
        Objects.equals(this.adImage6Tag, itemAttributes.adImage6Tag) &&
        Objects.equals(this.adImage7Link, itemAttributes.adImage7Link) &&
        Objects.equals(this.adImage7Tag, itemAttributes.adImage7Tag) &&
        Objects.equals(this.adImage8Link, itemAttributes.adImage8Link) &&
        Objects.equals(this.adImage8Tag, itemAttributes.adImage8Tag) &&
        Objects.equals(this.adImage9Link, itemAttributes.adImage9Link) &&
        Objects.equals(this.adImage9Tag, itemAttributes.adImage9Tag) &&
        Objects.equals(this.adLink, itemAttributes.adLink) &&
        Objects.equals(this.adVideo0Link, itemAttributes.adVideo0Link) &&
        Objects.equals(this.adVideo0Tag, itemAttributes.adVideo0Tag) &&
        Objects.equals(this.adVideo1Link, itemAttributes.adVideo1Link) &&
        Objects.equals(this.adVideo1Tag, itemAttributes.adVideo1Tag) &&
        Objects.equals(this.adVideo2Link, itemAttributes.adVideo2Link) &&
        Objects.equals(this.adVideo2Tag, itemAttributes.adVideo2Tag) &&
        Objects.equals(this.adult, itemAttributes.adult) &&
        Objects.equals(this.ageGroup, itemAttributes.ageGroup) &&
        Objects.equals(this.androidDeepLink, itemAttributes.androidDeepLink) &&
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
        Objects.equals(this.customNumber0, itemAttributes.customNumber0) &&
        Objects.equals(this.customNumber1, itemAttributes.customNumber1) &&
        Objects.equals(this.customNumber2, itemAttributes.customNumber2) &&
        Objects.equals(this.customNumber3, itemAttributes.customNumber3) &&
        Objects.equals(this.customNumber4, itemAttributes.customNumber4) &&
        Objects.equals(this.description, itemAttributes.description) &&
        Objects.equals(this.freeShippingLabel, itemAttributes.freeShippingLabel) &&
        Objects.equals(this.freeShippingLimit, itemAttributes.freeShippingLimit) &&
        Objects.equals(this.gender, itemAttributes.gender) &&
        Objects.equals(this.googleProductCategory, itemAttributes.googleProductCategory) &&
        Objects.equals(this.gtin, itemAttributes.gtin) &&
        Objects.equals(this.id, itemAttributes.id) &&
        Objects.equals(this.installmentPrice, itemAttributes.installmentPrice) &&
        Objects.equals(this.iosDeepLink, itemAttributes.iosDeepLink) &&
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
        Objects.equals(this.promotionId, itemAttributes.promotionId) &&
        Objects.equals(this.salePrice, itemAttributes.salePrice) &&
        Objects.equals(this.salePriceEffectiveDate, itemAttributes.salePriceEffectiveDate) &&
        Objects.equals(this.shipping, itemAttributes.shipping) &&
        Objects.equals(this.shippingHeight, itemAttributes.shippingHeight) &&
        Objects.equals(this.shippingWeight, itemAttributes.shippingWeight) &&
        Objects.equals(this.shippingWidth, itemAttributes.shippingWidth) &&
        Objects.equals(this.size, itemAttributes.size) &&
        Objects.equals(this.sizeSystem, itemAttributes.sizeSystem) &&
        Objects.equals(this.sizeType, itemAttributes.sizeType) &&
        Objects.equals(this.tax, itemAttributes.tax) &&
        Objects.equals(this.title, itemAttributes.title) &&
        Objects.equals(this.unitPricingBaseMeasure, itemAttributes.unitPricingBaseMeasure) &&
        Objects.equals(this.unitPricingMeasure, itemAttributes.unitPricingMeasure) &&
        Objects.equals(this.variantNames, itemAttributes.variantNames) &&
        Objects.equals(this.variantValues, itemAttributes.variantValues) &&
        Objects.equals(this.additionalImageLink, itemAttributes.additionalImageLink) &&
        Objects.equals(this.aiDisclosures, itemAttributes.aiDisclosures) &&
        Objects.equals(this.imageLink, itemAttributes.imageLink) &&
        Objects.equals(this.videoLink, itemAttributes.videoLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adImage0Link, adImage0Tag, adImage10Link, adImage10Tag, adImage11Link, adImage11Tag, adImage12Link, adImage12Tag, adImage13Link, adImage13Tag, adImage14Link, adImage14Tag, adImage15Link, adImage15Tag, adImage16Link, adImage16Tag, adImage17Link, adImage17Tag, adImage18Link, adImage18Tag, adImage19Link, adImage19Tag, adImage1Link, adImage1Tag, adImage2Link, adImage2Tag, adImage3Link, adImage3Tag, adImage4Link, adImage4Tag, adImage5Link, adImage5Tag, adImage6Link, adImage6Tag, adImage7Link, adImage7Tag, adImage8Link, adImage8Tag, adImage9Link, adImage9Tag, adLink, adVideo0Link, adVideo0Tag, adVideo1Link, adVideo1Tag, adVideo2Link, adVideo2Tag, adult, ageGroup, androidDeepLink, availability, averageReviewRating, brand, checkoutEnabled, color, condition, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, customNumber0, customNumber1, customNumber2, customNumber3, customNumber4, description, freeShippingLabel, freeShippingLimit, gender, googleProductCategory, gtin, id, installmentPrice, iosDeepLink, itemGroupId, lastUpdatedTime, link, material, minAdPrice, mobileLink, mpn, numberOfRatings, numberOfReviews, pattern, price, productType, promotionId, salePrice, salePriceEffectiveDate, shipping, shippingHeight, shippingWeight, shippingWidth, size, sizeSystem, sizeType, tax, title, unitPricingBaseMeasure, unitPricingMeasure, variantNames, variantValues, additionalImageLink, aiDisclosures, imageLink, videoLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAttributes {\n");
    
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
    sb.append("    aiDisclosures: ").append(toIndentedString(aiDisclosures)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

