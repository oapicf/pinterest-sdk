package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UpdatableItemAttributesGtin;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdatableItemAttributes
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UpdatableItemAttributes {

  private JsonNullable<String> adImage0Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage0Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage10Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage10Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage11Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage11Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage12Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage12Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage13Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage13Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage14Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage14Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage15Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage15Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage16Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage16Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage17Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage17Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage18Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage18Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage19Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage19Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage1Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage1Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage2Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage2Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage3Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage3Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage4Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage4Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage5Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage5Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage6Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage6Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage7Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage7Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage8Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage8Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage9Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adImage9Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adLink = JsonNullable.<String>undefined();

  private JsonNullable<String> adVideo0Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adVideo0Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adVideo1Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adVideo1Tag = JsonNullable.<String>undefined();

  private JsonNullable<String> adVideo2Link = JsonNullable.<String>undefined();

  private JsonNullable<String> adVideo2Tag = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> adult = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> ageGroup = JsonNullable.<String>undefined();

  private @Nullable String androidDeepLink;

  private @Nullable String availability;

  private JsonNullable<BigDecimal> averageReviewRating = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<String> brand = JsonNullable.<String>undefined();

  @Deprecated
  private JsonNullable<Boolean> checkoutEnabled = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> color = JsonNullable.<String>undefined();

  private JsonNullable<String> condition = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 511) String> customLabel0 = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 511) String> customLabel1 = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 511) String> customLabel2 = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 511) String> customLabel3 = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 511) String> customLabel4 = JsonNullable.<String>undefined();

  private JsonNullable<Integer> customNumber0 = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> customNumber1 = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> customNumber2 = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> customNumber3 = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> customNumber4 = JsonNullable.<Integer>undefined();

  private @Nullable String description;

  private JsonNullable<Boolean> freeShippingLabel = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> freeShippingLimit = JsonNullable.<String>undefined();

  private JsonNullable<String> gender = JsonNullable.<String>undefined();

  private JsonNullable<String> googleProductCategory = JsonNullable.<String>undefined();

  private JsonNullable<UpdatableItemAttributesGtin> gtin = JsonNullable.<UpdatableItemAttributesGtin>undefined();

  @Deprecated
  private @Nullable String id;

  private JsonNullable<String> installmentPrice = JsonNullable.<String>undefined();

  private @Nullable String iosDeepLink;

  private JsonNullable<String> itemGroupId = JsonNullable.<String>undefined();

  private JsonNullable<Long> lastUpdatedTime = JsonNullable.<Long>undefined();

  private @Nullable String link;

  private JsonNullable<String> material = JsonNullable.<String>undefined();

  private JsonNullable<String> minAdPrice = JsonNullable.<String>undefined();

  private JsonNullable<String> mobileLink = JsonNullable.<String>undefined();

  private JsonNullable<String> mpn = JsonNullable.<String>undefined();

  private JsonNullable<Integer> numberOfRatings = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> numberOfReviews = JsonNullable.<Integer>undefined();

  private JsonNullable<String> pattern = JsonNullable.<String>undefined();

  private @Nullable String price;

  private JsonNullable<String> productType = JsonNullable.<String>undefined();

  private JsonNullable<String> promotionId = JsonNullable.<String>undefined();

  private JsonNullable<String> salePrice = JsonNullable.<String>undefined();

  private JsonNullable<String> salePriceEffectiveDate = JsonNullable.<String>undefined();

  private JsonNullable<String> shipping = JsonNullable.<String>undefined();

  private JsonNullable<String> shippingHeight = JsonNullable.<String>undefined();

  private JsonNullable<String> shippingWeight = JsonNullable.<String>undefined();

  private JsonNullable<String> shippingWidth = JsonNullable.<String>undefined();

  private JsonNullable<String> size = JsonNullable.<String>undefined();

  private JsonNullable<String> sizeSystem = JsonNullable.<String>undefined();

  private JsonNullable<String> sizeType = JsonNullable.<String>undefined();

  private JsonNullable<String> tax = JsonNullable.<String>undefined();

  private @Nullable String title;

  private JsonNullable<String> unitPricingBaseMeasure = JsonNullable.<String>undefined();

  private JsonNullable<String> unitPricingMeasure = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> variantNames = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> variantValues = JsonNullable.<List<String>>undefined();

  public UpdatableItemAttributes adImage0Link(String adImage0Link) {
    this.adImage0Link = JsonNullable.of(adImage0Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage0Link
   */
  
  @Schema(name = "ad_image_0_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_0_link")
  public JsonNullable<String> getAdImage0Link() {
    return adImage0Link;
  }

  public void setAdImage0Link(JsonNullable<String> adImage0Link) {
    this.adImage0Link = adImage0Link;
  }

  public UpdatableItemAttributes adImage0Tag(String adImage0Tag) {
    this.adImage0Tag = JsonNullable.of(adImage0Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage0Tag
   */
  
  @Schema(name = "ad_image_0_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_0_tag")
  public JsonNullable<String> getAdImage0Tag() {
    return adImage0Tag;
  }

  public void setAdImage0Tag(JsonNullable<String> adImage0Tag) {
    this.adImage0Tag = adImage0Tag;
  }

  public UpdatableItemAttributes adImage10Link(String adImage10Link) {
    this.adImage10Link = JsonNullable.of(adImage10Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage10Link
   */
  
  @Schema(name = "ad_image_10_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_10_link")
  public JsonNullable<String> getAdImage10Link() {
    return adImage10Link;
  }

  public void setAdImage10Link(JsonNullable<String> adImage10Link) {
    this.adImage10Link = adImage10Link;
  }

  public UpdatableItemAttributes adImage10Tag(String adImage10Tag) {
    this.adImage10Tag = JsonNullable.of(adImage10Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage10Tag
   */
  
  @Schema(name = "ad_image_10_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_10_tag")
  public JsonNullable<String> getAdImage10Tag() {
    return adImage10Tag;
  }

  public void setAdImage10Tag(JsonNullable<String> adImage10Tag) {
    this.adImage10Tag = adImage10Tag;
  }

  public UpdatableItemAttributes adImage11Link(String adImage11Link) {
    this.adImage11Link = JsonNullable.of(adImage11Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage11Link
   */
  
  @Schema(name = "ad_image_11_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_11_link")
  public JsonNullable<String> getAdImage11Link() {
    return adImage11Link;
  }

  public void setAdImage11Link(JsonNullable<String> adImage11Link) {
    this.adImage11Link = adImage11Link;
  }

  public UpdatableItemAttributes adImage11Tag(String adImage11Tag) {
    this.adImage11Tag = JsonNullable.of(adImage11Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage11Tag
   */
  
  @Schema(name = "ad_image_11_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_11_tag")
  public JsonNullable<String> getAdImage11Tag() {
    return adImage11Tag;
  }

  public void setAdImage11Tag(JsonNullable<String> adImage11Tag) {
    this.adImage11Tag = adImage11Tag;
  }

  public UpdatableItemAttributes adImage12Link(String adImage12Link) {
    this.adImage12Link = JsonNullable.of(adImage12Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage12Link
   */
  
  @Schema(name = "ad_image_12_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_12_link")
  public JsonNullable<String> getAdImage12Link() {
    return adImage12Link;
  }

  public void setAdImage12Link(JsonNullable<String> adImage12Link) {
    this.adImage12Link = adImage12Link;
  }

  public UpdatableItemAttributes adImage12Tag(String adImage12Tag) {
    this.adImage12Tag = JsonNullable.of(adImage12Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage12Tag
   */
  
  @Schema(name = "ad_image_12_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_12_tag")
  public JsonNullable<String> getAdImage12Tag() {
    return adImage12Tag;
  }

  public void setAdImage12Tag(JsonNullable<String> adImage12Tag) {
    this.adImage12Tag = adImage12Tag;
  }

  public UpdatableItemAttributes adImage13Link(String adImage13Link) {
    this.adImage13Link = JsonNullable.of(adImage13Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage13Link
   */
  
  @Schema(name = "ad_image_13_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_13_link")
  public JsonNullable<String> getAdImage13Link() {
    return adImage13Link;
  }

  public void setAdImage13Link(JsonNullable<String> adImage13Link) {
    this.adImage13Link = adImage13Link;
  }

  public UpdatableItemAttributes adImage13Tag(String adImage13Tag) {
    this.adImage13Tag = JsonNullable.of(adImage13Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage13Tag
   */
  
  @Schema(name = "ad_image_13_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_13_tag")
  public JsonNullable<String> getAdImage13Tag() {
    return adImage13Tag;
  }

  public void setAdImage13Tag(JsonNullable<String> adImage13Tag) {
    this.adImage13Tag = adImage13Tag;
  }

  public UpdatableItemAttributes adImage14Link(String adImage14Link) {
    this.adImage14Link = JsonNullable.of(adImage14Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage14Link
   */
  
  @Schema(name = "ad_image_14_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_14_link")
  public JsonNullable<String> getAdImage14Link() {
    return adImage14Link;
  }

  public void setAdImage14Link(JsonNullable<String> adImage14Link) {
    this.adImage14Link = adImage14Link;
  }

  public UpdatableItemAttributes adImage14Tag(String adImage14Tag) {
    this.adImage14Tag = JsonNullable.of(adImage14Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage14Tag
   */
  
  @Schema(name = "ad_image_14_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_14_tag")
  public JsonNullable<String> getAdImage14Tag() {
    return adImage14Tag;
  }

  public void setAdImage14Tag(JsonNullable<String> adImage14Tag) {
    this.adImage14Tag = adImage14Tag;
  }

  public UpdatableItemAttributes adImage15Link(String adImage15Link) {
    this.adImage15Link = JsonNullable.of(adImage15Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage15Link
   */
  
  @Schema(name = "ad_image_15_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_15_link")
  public JsonNullable<String> getAdImage15Link() {
    return adImage15Link;
  }

  public void setAdImage15Link(JsonNullable<String> adImage15Link) {
    this.adImage15Link = adImage15Link;
  }

  public UpdatableItemAttributes adImage15Tag(String adImage15Tag) {
    this.adImage15Tag = JsonNullable.of(adImage15Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage15Tag
   */
  
  @Schema(name = "ad_image_15_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_15_tag")
  public JsonNullable<String> getAdImage15Tag() {
    return adImage15Tag;
  }

  public void setAdImage15Tag(JsonNullable<String> adImage15Tag) {
    this.adImage15Tag = adImage15Tag;
  }

  public UpdatableItemAttributes adImage16Link(String adImage16Link) {
    this.adImage16Link = JsonNullable.of(adImage16Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage16Link
   */
  
  @Schema(name = "ad_image_16_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_16_link")
  public JsonNullable<String> getAdImage16Link() {
    return adImage16Link;
  }

  public void setAdImage16Link(JsonNullable<String> adImage16Link) {
    this.adImage16Link = adImage16Link;
  }

  public UpdatableItemAttributes adImage16Tag(String adImage16Tag) {
    this.adImage16Tag = JsonNullable.of(adImage16Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage16Tag
   */
  
  @Schema(name = "ad_image_16_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_16_tag")
  public JsonNullable<String> getAdImage16Tag() {
    return adImage16Tag;
  }

  public void setAdImage16Tag(JsonNullable<String> adImage16Tag) {
    this.adImage16Tag = adImage16Tag;
  }

  public UpdatableItemAttributes adImage17Link(String adImage17Link) {
    this.adImage17Link = JsonNullable.of(adImage17Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage17Link
   */
  
  @Schema(name = "ad_image_17_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_17_link")
  public JsonNullable<String> getAdImage17Link() {
    return adImage17Link;
  }

  public void setAdImage17Link(JsonNullable<String> adImage17Link) {
    this.adImage17Link = adImage17Link;
  }

  public UpdatableItemAttributes adImage17Tag(String adImage17Tag) {
    this.adImage17Tag = JsonNullable.of(adImage17Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage17Tag
   */
  
  @Schema(name = "ad_image_17_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_17_tag")
  public JsonNullable<String> getAdImage17Tag() {
    return adImage17Tag;
  }

  public void setAdImage17Tag(JsonNullable<String> adImage17Tag) {
    this.adImage17Tag = adImage17Tag;
  }

  public UpdatableItemAttributes adImage18Link(String adImage18Link) {
    this.adImage18Link = JsonNullable.of(adImage18Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage18Link
   */
  
  @Schema(name = "ad_image_18_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_18_link")
  public JsonNullable<String> getAdImage18Link() {
    return adImage18Link;
  }

  public void setAdImage18Link(JsonNullable<String> adImage18Link) {
    this.adImage18Link = adImage18Link;
  }

  public UpdatableItemAttributes adImage18Tag(String adImage18Tag) {
    this.adImage18Tag = JsonNullable.of(adImage18Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage18Tag
   */
  
  @Schema(name = "ad_image_18_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_18_tag")
  public JsonNullable<String> getAdImage18Tag() {
    return adImage18Tag;
  }

  public void setAdImage18Tag(JsonNullable<String> adImage18Tag) {
    this.adImage18Tag = adImage18Tag;
  }

  public UpdatableItemAttributes adImage19Link(String adImage19Link) {
    this.adImage19Link = JsonNullable.of(adImage19Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage19Link
   */
  
  @Schema(name = "ad_image_19_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_19_link")
  public JsonNullable<String> getAdImage19Link() {
    return adImage19Link;
  }

  public void setAdImage19Link(JsonNullable<String> adImage19Link) {
    this.adImage19Link = adImage19Link;
  }

  public UpdatableItemAttributes adImage19Tag(String adImage19Tag) {
    this.adImage19Tag = JsonNullable.of(adImage19Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage19Tag
   */
  
  @Schema(name = "ad_image_19_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_19_tag")
  public JsonNullable<String> getAdImage19Tag() {
    return adImage19Tag;
  }

  public void setAdImage19Tag(JsonNullable<String> adImage19Tag) {
    this.adImage19Tag = adImage19Tag;
  }

  public UpdatableItemAttributes adImage1Link(String adImage1Link) {
    this.adImage1Link = JsonNullable.of(adImage1Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage1Link
   */
  
  @Schema(name = "ad_image_1_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_1_link")
  public JsonNullable<String> getAdImage1Link() {
    return adImage1Link;
  }

  public void setAdImage1Link(JsonNullable<String> adImage1Link) {
    this.adImage1Link = adImage1Link;
  }

  public UpdatableItemAttributes adImage1Tag(String adImage1Tag) {
    this.adImage1Tag = JsonNullable.of(adImage1Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage1Tag
   */
  
  @Schema(name = "ad_image_1_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_1_tag")
  public JsonNullable<String> getAdImage1Tag() {
    return adImage1Tag;
  }

  public void setAdImage1Tag(JsonNullable<String> adImage1Tag) {
    this.adImage1Tag = adImage1Tag;
  }

  public UpdatableItemAttributes adImage2Link(String adImage2Link) {
    this.adImage2Link = JsonNullable.of(adImage2Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage2Link
   */
  
  @Schema(name = "ad_image_2_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_2_link")
  public JsonNullable<String> getAdImage2Link() {
    return adImage2Link;
  }

  public void setAdImage2Link(JsonNullable<String> adImage2Link) {
    this.adImage2Link = adImage2Link;
  }

  public UpdatableItemAttributes adImage2Tag(String adImage2Tag) {
    this.adImage2Tag = JsonNullable.of(adImage2Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage2Tag
   */
  
  @Schema(name = "ad_image_2_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_2_tag")
  public JsonNullable<String> getAdImage2Tag() {
    return adImage2Tag;
  }

  public void setAdImage2Tag(JsonNullable<String> adImage2Tag) {
    this.adImage2Tag = adImage2Tag;
  }

  public UpdatableItemAttributes adImage3Link(String adImage3Link) {
    this.adImage3Link = JsonNullable.of(adImage3Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage3Link
   */
  
  @Schema(name = "ad_image_3_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_3_link")
  public JsonNullable<String> getAdImage3Link() {
    return adImage3Link;
  }

  public void setAdImage3Link(JsonNullable<String> adImage3Link) {
    this.adImage3Link = adImage3Link;
  }

  public UpdatableItemAttributes adImage3Tag(String adImage3Tag) {
    this.adImage3Tag = JsonNullable.of(adImage3Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage3Tag
   */
  
  @Schema(name = "ad_image_3_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_3_tag")
  public JsonNullable<String> getAdImage3Tag() {
    return adImage3Tag;
  }

  public void setAdImage3Tag(JsonNullable<String> adImage3Tag) {
    this.adImage3Tag = adImage3Tag;
  }

  public UpdatableItemAttributes adImage4Link(String adImage4Link) {
    this.adImage4Link = JsonNullable.of(adImage4Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage4Link
   */
  
  @Schema(name = "ad_image_4_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_4_link")
  public JsonNullable<String> getAdImage4Link() {
    return adImage4Link;
  }

  public void setAdImage4Link(JsonNullable<String> adImage4Link) {
    this.adImage4Link = adImage4Link;
  }

  public UpdatableItemAttributes adImage4Tag(String adImage4Tag) {
    this.adImage4Tag = JsonNullable.of(adImage4Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage4Tag
   */
  
  @Schema(name = "ad_image_4_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_4_tag")
  public JsonNullable<String> getAdImage4Tag() {
    return adImage4Tag;
  }

  public void setAdImage4Tag(JsonNullable<String> adImage4Tag) {
    this.adImage4Tag = adImage4Tag;
  }

  public UpdatableItemAttributes adImage5Link(String adImage5Link) {
    this.adImage5Link = JsonNullable.of(adImage5Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage5Link
   */
  
  @Schema(name = "ad_image_5_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_5_link")
  public JsonNullable<String> getAdImage5Link() {
    return adImage5Link;
  }

  public void setAdImage5Link(JsonNullable<String> adImage5Link) {
    this.adImage5Link = adImage5Link;
  }

  public UpdatableItemAttributes adImage5Tag(String adImage5Tag) {
    this.adImage5Tag = JsonNullable.of(adImage5Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage5Tag
   */
  
  @Schema(name = "ad_image_5_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_5_tag")
  public JsonNullable<String> getAdImage5Tag() {
    return adImage5Tag;
  }

  public void setAdImage5Tag(JsonNullable<String> adImage5Tag) {
    this.adImage5Tag = adImage5Tag;
  }

  public UpdatableItemAttributes adImage6Link(String adImage6Link) {
    this.adImage6Link = JsonNullable.of(adImage6Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage6Link
   */
  
  @Schema(name = "ad_image_6_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_6_link")
  public JsonNullable<String> getAdImage6Link() {
    return adImage6Link;
  }

  public void setAdImage6Link(JsonNullable<String> adImage6Link) {
    this.adImage6Link = adImage6Link;
  }

  public UpdatableItemAttributes adImage6Tag(String adImage6Tag) {
    this.adImage6Tag = JsonNullable.of(adImage6Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage6Tag
   */
  
  @Schema(name = "ad_image_6_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_6_tag")
  public JsonNullable<String> getAdImage6Tag() {
    return adImage6Tag;
  }

  public void setAdImage6Tag(JsonNullable<String> adImage6Tag) {
    this.adImage6Tag = adImage6Tag;
  }

  public UpdatableItemAttributes adImage7Link(String adImage7Link) {
    this.adImage7Link = JsonNullable.of(adImage7Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage7Link
   */
  
  @Schema(name = "ad_image_7_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_7_link")
  public JsonNullable<String> getAdImage7Link() {
    return adImage7Link;
  }

  public void setAdImage7Link(JsonNullable<String> adImage7Link) {
    this.adImage7Link = adImage7Link;
  }

  public UpdatableItemAttributes adImage7Tag(String adImage7Tag) {
    this.adImage7Tag = JsonNullable.of(adImage7Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage7Tag
   */
  
  @Schema(name = "ad_image_7_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_7_tag")
  public JsonNullable<String> getAdImage7Tag() {
    return adImage7Tag;
  }

  public void setAdImage7Tag(JsonNullable<String> adImage7Tag) {
    this.adImage7Tag = adImage7Tag;
  }

  public UpdatableItemAttributes adImage8Link(String adImage8Link) {
    this.adImage8Link = JsonNullable.of(adImage8Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage8Link
   */
  
  @Schema(name = "ad_image_8_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_8_link")
  public JsonNullable<String> getAdImage8Link() {
    return adImage8Link;
  }

  public void setAdImage8Link(JsonNullable<String> adImage8Link) {
    this.adImage8Link = adImage8Link;
  }

  public UpdatableItemAttributes adImage8Tag(String adImage8Tag) {
    this.adImage8Tag = JsonNullable.of(adImage8Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage8Tag
   */
  
  @Schema(name = "ad_image_8_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_8_tag")
  public JsonNullable<String> getAdImage8Tag() {
    return adImage8Tag;
  }

  public void setAdImage8Tag(JsonNullable<String> adImage8Tag) {
    this.adImage8Tag = adImage8Tag;
  }

  public UpdatableItemAttributes adImage9Link(String adImage9Link) {
    this.adImage9Link = JsonNullable.of(adImage9Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adImage9Link
   */
  
  @Schema(name = "ad_image_9_link", example = "https://www.example.com/image/image_v2.jpg", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad image link that supplements main image for shopping campaigns.</p> <p>Image format:</p> <ul>   <li>Pixel size at least 75 x 75</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder images in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_9_link")
  public JsonNullable<String> getAdImage9Link() {
    return adImage9Link;
  }

  public void setAdImage9Link(JsonNullable<String> adImage9Link) {
    this.adImage9Link = adImage9Link;
  }

  public UpdatableItemAttributes adImage9Tag(String adImage9Tag) {
    this.adImage9Tag = JsonNullable.of(adImage9Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>
   * @return adImage9Tag
   */
  
  @Schema(name = "ad_image_9_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_image_9_tag")
  public JsonNullable<String> getAdImage9Tag() {
    return adImage9Tag;
  }

  public void setAdImage9Tag(JsonNullable<String> adImage9Tag) {
    this.adImage9Tag = adImage9Tag;
  }

  public UpdatableItemAttributes adLink(String adLink) {
    this.adLink = JsonNullable.of(adLink);
    return this;
  }

  /**
   * Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
   * @return adLink
   */
  
  @Schema(name = "ad_link", example = "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest", description = "Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_link")
  public JsonNullable<String> getAdLink() {
    return adLink;
  }

  public void setAdLink(JsonNullable<String> adLink) {
    this.adLink = adLink;
  }

  public UpdatableItemAttributes adVideo0Link(String adVideo0Link) {
    this.adVideo0Link = JsonNullable.of(adVideo0Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adVideo0Link
   */
  
  @Schema(name = "ad_video_0_link", example = "https://www.example.com/video/video_v2.mov", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_video_0_link")
  public JsonNullable<String> getAdVideo0Link() {
    return adVideo0Link;
  }

  public void setAdVideo0Link(JsonNullable<String> adVideo0Link) {
    this.adVideo0Link = adVideo0Link;
  }

  public UpdatableItemAttributes adVideo0Tag(String adVideo0Tag) {
    this.adVideo0Tag = JsonNullable.of(adVideo0Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
   * @return adVideo0Tag
   */
  
  @Schema(name = "ad_video_0_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_video_0_tag")
  public JsonNullable<String> getAdVideo0Tag() {
    return adVideo0Tag;
  }

  public void setAdVideo0Tag(JsonNullable<String> adVideo0Tag) {
    this.adVideo0Tag = adVideo0Tag;
  }

  public UpdatableItemAttributes adVideo1Link(String adVideo1Link) {
    this.adVideo1Link = JsonNullable.of(adVideo1Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adVideo1Link
   */
  
  @Schema(name = "ad_video_1_link", example = "https://www.example.com/video/video_v2.mov", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_video_1_link")
  public JsonNullable<String> getAdVideo1Link() {
    return adVideo1Link;
  }

  public void setAdVideo1Link(JsonNullable<String> adVideo1Link) {
    this.adVideo1Link = adVideo1Link;
  }

  public UpdatableItemAttributes adVideo1Tag(String adVideo1Tag) {
    this.adVideo1Tag = JsonNullable.of(adVideo1Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
   * @return adVideo1Tag
   */
  
  @Schema(name = "ad_video_1_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_video_1_tag")
  public JsonNullable<String> getAdVideo1Tag() {
    return adVideo1Tag;
  }

  public void setAdVideo1Tag(JsonNullable<String> adVideo1Tag) {
    this.adVideo1Tag = adVideo1Tag;
  }

  public UpdatableItemAttributes adVideo2Link(String adVideo2Link) {
    this.adVideo2Link = JsonNullable.of(adVideo2Link);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>
   * @return adVideo2Link
   */
  
  @Schema(name = "ad_video_2_link", example = "https://www.example.com/video/video_v2.mov", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 2000 characters</p> <p>Ad video link that supplements main video for shopping campaigns.</p> <p>Video format:</p> <ul>   <li>Pixel size between 75 x 75 and 9450 x 9450</li>   <li>File size smaller than 2 GB</li>   <li>Time span between 4 seconds and 15 minutes</li>   <li>Accepted formats: .MP4, .MOV, .M4V</li> </ul> <p>Link guidelines:</p> <ul>   <li>Include extension in file name</li>   <li>Do not include template or placeholder videos in link</li>   <li>Make URL accessible to Pinterest user-agent</li>   <li>Must start with http:// or https://</li> </ul>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_video_2_link")
  public JsonNullable<String> getAdVideo2Link() {
    return adVideo2Link;
  }

  public void setAdVideo2Link(JsonNullable<String> adVideo2Link) {
    this.adVideo2Link = adVideo2Link;
  }

  public UpdatableItemAttributes adVideo2Tag(String adVideo2Tag) {
    this.adVideo2Tag = JsonNullable.of(adVideo2Tag);
    return this;
  }

  /**
   * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>
   * @return adVideo2Tag
   */
  
  @Schema(name = "ad_video_2_tag", example = "black friday", description = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a> <p><= 511 characters</p> <p>If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_video_2_tag")
  public JsonNullable<String> getAdVideo2Tag() {
    return adVideo2Tag;
  }

  public void setAdVideo2Tag(JsonNullable<String> adVideo2Tag) {
    this.adVideo2Tag = adVideo2Tag;
  }

  public UpdatableItemAttributes adult(Boolean adult) {
    this.adult = JsonNullable.of(adult);
    return this;
  }

  /**
   * Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
   * @return adult
   */
  
  @Schema(name = "adult", example = "true", description = "Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("adult")
  public JsonNullable<Boolean> getAdult() {
    return adult;
  }

  public void setAdult(JsonNullable<Boolean> adult) {
    this.adult = adult;
  }

  public UpdatableItemAttributes ageGroup(String ageGroup) {
    this.ageGroup = JsonNullable.of(ageGroup);
    return this;
  }

  /**
   * The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
   * @return ageGroup
   */
  
  @Schema(name = "age_group", example = "newborn", description = "The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age_group")
  public JsonNullable<String> getAgeGroup() {
    return ageGroup;
  }

  public void setAgeGroup(JsonNullable<String> ageGroup) {
    this.ageGroup = ageGroup;
  }

  public UpdatableItemAttributes androidDeepLink(@Nullable String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

  /**
   * The deep link to the product on the Android app.
   * @return androidDeepLink
   */
  
  @Schema(name = "android_deep_link", example = "pinterest://item/1234567890", description = "The deep link to the product on the Android app.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("android_deep_link")
  public @Nullable String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(@Nullable String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public UpdatableItemAttributes availability(@Nullable String availability) {
    this.availability = availability;
    return this;
  }

  /**
   * The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.
   * @return availability
   */
  
  @Schema(name = "availability", example = "in stock", description = "The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’, ‘preorder’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availability")
  public @Nullable String getAvailability() {
    return availability;
  }

  public void setAvailability(@Nullable String availability) {
    this.availability = availability;
  }

  public UpdatableItemAttributes averageReviewRating(BigDecimal averageReviewRating) {
    this.averageReviewRating = JsonNullable.of(averageReviewRating);
    return this;
  }

  /**
   * Average reviews for the item. Can be a number from 1-5.
   * @return averageReviewRating
   */
  @Valid 
  @Schema(name = "average_review_rating", example = "5", description = "Average reviews for the item. Can be a number from 1-5.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("average_review_rating")
  public JsonNullable<BigDecimal> getAverageReviewRating() {
    return averageReviewRating;
  }

  public void setAverageReviewRating(JsonNullable<BigDecimal> averageReviewRating) {
    this.averageReviewRating = averageReviewRating;
  }

  public UpdatableItemAttributes brand(String brand) {
    this.brand = JsonNullable.of(brand);
    return this;
  }

  /**
   * The brand of the product.
   * @return brand
   */
  
  @Schema(name = "brand", example = "Josie’s Denim", description = "The brand of the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brand")
  public JsonNullable<String> getBrand() {
    return brand;
  }

  public void setBrand(JsonNullable<String> brand) {
    this.brand = brand;
  }

  public UpdatableItemAttributes checkoutEnabled(Boolean checkoutEnabled) {
    this.checkoutEnabled = JsonNullable.of(checkoutEnabled);
    return this;
  }

  /**
   * This attribute is not supported anymore.
   * @return checkoutEnabled
   * @deprecated
   */
  
  @Schema(name = "checkout_enabled", example = "false", description = "This attribute is not supported anymore.", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("checkout_enabled")
  @Deprecated
  public JsonNullable<Boolean> getCheckoutEnabled() {
    return checkoutEnabled;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setCheckoutEnabled(JsonNullable<Boolean> checkoutEnabled) {
    this.checkoutEnabled = checkoutEnabled;
  }

  public UpdatableItemAttributes color(String color) {
    this.color = JsonNullable.of(color);
    return this;
  }

  /**
   * The primary color of the product.
   * @return color
   */
  
  @Schema(name = "color", example = "blue", description = "The primary color of the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public JsonNullable<String> getColor() {
    return color;
  }

  public void setColor(JsonNullable<String> color) {
    this.color = color;
  }

  public UpdatableItemAttributes condition(String condition) {
    this.condition = JsonNullable.of(condition);
    return this;
  }

  /**
   * The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
   * @return condition
   */
  
  @Schema(name = "condition", example = "new", description = "The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("condition")
  public JsonNullable<String> getCondition() {
    return condition;
  }

  public void setCondition(JsonNullable<String> condition) {
    this.condition = condition;
  }

  public UpdatableItemAttributes customLabel0(String customLabel0) {
    this.customLabel0 = JsonNullable.of(customLabel0);
    return this;
  }

  /**
   * <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
   * @return customLabel0
   */
  @Size(max = 511) 
  @Schema(name = "custom_label_0", example = "Best sellers", description = "<p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_0")
  public JsonNullable<@Size(max = 511) String> getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(JsonNullable<String> customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public UpdatableItemAttributes customLabel1(String customLabel1) {
    this.customLabel1 = JsonNullable.of(customLabel1);
    return this;
  }

  /**
   * <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
   * @return customLabel1
   */
  @Size(max = 511) 
  @Schema(name = "custom_label_1", example = "Summer promotion", description = "<p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_1")
  public JsonNullable<@Size(max = 511) String> getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(JsonNullable<String> customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public UpdatableItemAttributes customLabel2(String customLabel2) {
    this.customLabel2 = JsonNullable.of(customLabel2);
    return this;
  }

  /**
   * <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
   * @return customLabel2
   */
  @Size(max = 511) 
  @Schema(name = "custom_label_2", example = "Winter sales", description = "<p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_2")
  public JsonNullable<@Size(max = 511) String> getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(JsonNullable<String> customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public UpdatableItemAttributes customLabel3(String customLabel3) {
    this.customLabel3 = JsonNullable.of(customLabel3);
    return this;
  }

  /**
   * <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
   * @return customLabel3
   */
  @Size(max = 511) 
  @Schema(name = "custom_label_3", example = "Woman dress", description = "<p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_3")
  public JsonNullable<@Size(max = 511) String> getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(JsonNullable<String> customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public UpdatableItemAttributes customLabel4(String customLabel4) {
    this.customLabel4 = JsonNullable.of(customLabel4);
    return this;
  }

  /**
   * <p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>
   * @return customLabel4
   */
  @Size(max = 511) 
  @Schema(name = "custom_label_4", example = "Man hat", description = "<p><= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs</p> <p>Custom grouping of products.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_4")
  public JsonNullable<@Size(max = 511) String> getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(JsonNullable<String> customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public UpdatableItemAttributes customNumber0(Integer customNumber0) {
    this.customNumber0 = JsonNullable.of(customNumber0);
    return this;
  }

  /**
   * an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber0
   */
  
  @Schema(name = "custom_number_0", example = "10", description = "an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_number_0")
  public JsonNullable<Integer> getCustomNumber0() {
    return customNumber0;
  }

  public void setCustomNumber0(JsonNullable<Integer> customNumber0) {
    this.customNumber0 = customNumber0;
  }

  public UpdatableItemAttributes customNumber1(Integer customNumber1) {
    this.customNumber1 = JsonNullable.of(customNumber1);
    return this;
  }

  /**
   * an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber1
   */
  
  @Schema(name = "custom_number_1", example = "0", description = "an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_number_1")
  public JsonNullable<Integer> getCustomNumber1() {
    return customNumber1;
  }

  public void setCustomNumber1(JsonNullable<Integer> customNumber1) {
    this.customNumber1 = customNumber1;
  }

  public UpdatableItemAttributes customNumber2(Integer customNumber2) {
    this.customNumber2 = JsonNullable.of(customNumber2);
    return this;
  }

  /**
   * an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber2
   */
  
  @Schema(name = "custom_number_2", example = "1520000000", description = "an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_number_2")
  public JsonNullable<Integer> getCustomNumber2() {
    return customNumber2;
  }

  public void setCustomNumber2(JsonNullable<Integer> customNumber2) {
    this.customNumber2 = customNumber2;
  }

  public UpdatableItemAttributes customNumber3(Integer customNumber3) {
    this.customNumber3 = JsonNullable.of(customNumber3);
    return this;
  }

  /**
   * an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber3
   */
  
  @Schema(name = "custom_number_3", example = "4294967295", description = "an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_number_3")
  public JsonNullable<Integer> getCustomNumber3() {
    return customNumber3;
  }

  public void setCustomNumber3(JsonNullable<Integer> customNumber3) {
    this.customNumber3 = customNumber3;
  }

  public UpdatableItemAttributes customNumber4(Integer customNumber4) {
    this.customNumber4 = JsonNullable.of(customNumber4);
    return this;
  }

  /**
   * an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
   * @return customNumber4
   */
  
  @Schema(name = "custom_number_4", example = "50", description = "an attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_number_4")
  public JsonNullable<Integer> getCustomNumber4() {
    return customNumber4;
  }

  public void setCustomNumber4(JsonNullable<Integer> customNumber4) {
    this.customNumber4 = customNumber4;
  }

  public UpdatableItemAttributes description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * <p><= 10000 characters</p> <p>The description of the product.</p>
   * @return description
   */
  
  @Schema(name = "description", example = "Casual fit denim shirt made with the finest quality Japanese denim.", description = "<p><= 10000 characters</p> <p>The description of the product.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public UpdatableItemAttributes freeShippingLabel(Boolean freeShippingLabel) {
    this.freeShippingLabel = JsonNullable.of(freeShippingLabel);
    return this;
  }

  /**
   * The item is free to ship.
   * @return freeShippingLabel
   */
  
  @Schema(name = "free_shipping_label", example = "true", description = "The item is free to ship.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("free_shipping_label")
  public JsonNullable<Boolean> getFreeShippingLabel() {
    return freeShippingLabel;
  }

  public void setFreeShippingLabel(JsonNullable<Boolean> freeShippingLabel) {
    this.freeShippingLabel = freeShippingLabel;
  }

  public UpdatableItemAttributes freeShippingLimit(String freeShippingLimit) {
    this.freeShippingLimit = JsonNullable.of(freeShippingLimit);
    return this;
  }

  /**
   * The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
   * @return freeShippingLimit
   */
  
  @Schema(name = "free_shipping_limit", example = "35 USD", description = "The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("free_shipping_limit")
  public JsonNullable<String> getFreeShippingLimit() {
    return freeShippingLimit;
  }

  public void setFreeShippingLimit(JsonNullable<String> freeShippingLimit) {
    this.freeShippingLimit = freeShippingLimit;
  }

  public UpdatableItemAttributes gender(String gender) {
    this.gender = JsonNullable.of(gender);
    return this;
  }

  /**
   * The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.
   * @return gender
   */
  
  @Schema(name = "gender", example = "unisex", description = "The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’, or ‘unisex’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public JsonNullable<String> getGender() {
    return gender;
  }

  public void setGender(JsonNullable<String> gender) {
    this.gender = gender;
  }

  public UpdatableItemAttributes googleProductCategory(String googleProductCategory) {
    this.googleProductCategory = JsonNullable.of(googleProductCategory);
    return this;
  }

  /**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
   * @return googleProductCategory
   */
  
  @Schema(name = "google_product_category", example = "Apparel & Accessories > Clothing > Shirts & Tops", description = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("google_product_category")
  public JsonNullable<String> getGoogleProductCategory() {
    return googleProductCategory;
  }

  public void setGoogleProductCategory(JsonNullable<String> googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

  public UpdatableItemAttributes gtin(UpdatableItemAttributesGtin gtin) {
    this.gtin = JsonNullable.of(gtin);
    return this;
  }

  /**
   * Get gtin
   * @return gtin
   */
  @Valid 
  @Schema(name = "gtin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gtin")
  public JsonNullable<UpdatableItemAttributesGtin> getGtin() {
    return gtin;
  }

  public void setGtin(JsonNullable<UpdatableItemAttributesGtin> gtin) {
    this.gtin = gtin;
  }

  public UpdatableItemAttributes id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
   * @return id
   * @deprecated
   */
  
  @Schema(name = "id", example = "DS0294-L", description = "<p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  @Deprecated
  public @Nullable String getId() {
    return id;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public UpdatableItemAttributes installmentPrice(String installmentPrice) {
    this.installmentPrice = JsonNullable.of(installmentPrice);
    return this;
  }

  /**
   * Installment price of the product. This data will only be shown to pinners in the enabled countries. Expected format: <payment_count>:<payment_amount> <currency>
   * @return installmentPrice
   */
  
  @Schema(name = "installment_price", example = "10:10.00 USD", description = "Installment price of the product. This data will only be shown to pinners in the enabled countries. Expected format: <payment_count>:<payment_amount> <currency>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("installment_price")
  public JsonNullable<String> getInstallmentPrice() {
    return installmentPrice;
  }

  public void setInstallmentPrice(JsonNullable<String> installmentPrice) {
    this.installmentPrice = installmentPrice;
  }

  public UpdatableItemAttributes iosDeepLink(@Nullable String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

  /**
   * The deep link to the product on the iOS app.
   * @return iosDeepLink
   */
  
  @Schema(name = "ios_deep_link", example = "pinterest://item/1234567890", description = "The deep link to the product on the iOS app.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ios_deep_link")
  public @Nullable String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(@Nullable String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public UpdatableItemAttributes itemGroupId(String itemGroupId) {
    this.itemGroupId = JsonNullable.of(itemGroupId);
    return this;
  }

  /**
   * <p><= 127 characters</p> <p>The parent ID of the product.</p>
   * @return itemGroupId
   */
  
  @Schema(name = "item_group_id", example = "DS0294", description = "<p><= 127 characters</p> <p>The parent ID of the product.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_group_id")
  public JsonNullable<String> getItemGroupId() {
    return itemGroupId;
  }

  public void setItemGroupId(JsonNullable<String> itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  public UpdatableItemAttributes lastUpdatedTime(Long lastUpdatedTime) {
    this.lastUpdatedTime = JsonNullable.of(lastUpdatedTime);
    return this;
  }

  /**
   * The millisecond timestamp when the item was lastly modified by the merchant.
   * @return lastUpdatedTime
   */
  
  @Schema(name = "last_updated_time", example = "1641483432072", description = "The millisecond timestamp when the item was lastly modified by the merchant.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_updated_time")
  public JsonNullable<Long> getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(JsonNullable<Long> lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public UpdatableItemAttributes link(@Nullable String link) {
    this.link = link;
    return this;
  }

  /**
   * <p><= 511 characters</p> <p>The landing page for the product.</p>
   * @return link
   */
  
  @Schema(name = "link", example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294", description = "<p><= 511 characters</p> <p>The landing page for the product.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public @Nullable String getLink() {
    return link;
  }

  public void setLink(@Nullable String link) {
    this.link = link;
  }

  public UpdatableItemAttributes material(String material) {
    this.material = JsonNullable.of(material);
    return this;
  }

  /**
   * The material used to make the product.
   * @return material
   */
  
  @Schema(name = "material", example = "cotton", description = "The material used to make the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("material")
  public JsonNullable<String> getMaterial() {
    return material;
  }

  public void setMaterial(JsonNullable<String> material) {
    this.material = material;
  }

  public UpdatableItemAttributes minAdPrice(String minAdPrice) {
    this.minAdPrice = JsonNullable.of(minAdPrice);
    return this;
  }

  /**
   * The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
   * @return minAdPrice
   */
  
  @Schema(name = "min_ad_price", example = "19.99 USD", description = "The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("min_ad_price")
  public JsonNullable<String> getMinAdPrice() {
    return minAdPrice;
  }

  public void setMinAdPrice(JsonNullable<String> minAdPrice) {
    this.minAdPrice = minAdPrice;
  }

  public UpdatableItemAttributes mobileLink(String mobileLink) {
    this.mobileLink = JsonNullable.of(mobileLink);
    return this;
  }

  /**
   * The mobile-optimized version of your landing page. Must begin with http:// or https://.
   * @return mobileLink
   */
  
  @Schema(name = "mobile_link", example = "https://m.example.com/cat/womens-clothing/denim-shirt-0294", description = "The mobile-optimized version of your landing page. Must begin with http:// or https://.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobile_link")
  public JsonNullable<String> getMobileLink() {
    return mobileLink;
  }

  public void setMobileLink(JsonNullable<String> mobileLink) {
    this.mobileLink = mobileLink;
  }

  public UpdatableItemAttributes mpn(String mpn) {
    this.mpn = JsonNullable.of(mpn);
    return this;
  }

  /**
   * Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
   * @return mpn
   */
  
  @Schema(name = "mpn", example = "PI12345NTEREST", description = "Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mpn")
  public JsonNullable<String> getMpn() {
    return mpn;
  }

  public void setMpn(JsonNullable<String> mpn) {
    this.mpn = mpn;
  }

  public UpdatableItemAttributes numberOfRatings(Integer numberOfRatings) {
    this.numberOfRatings = JsonNullable.of(numberOfRatings);
    return this;
  }

  /**
   * The number of ratings for the item.
   * @return numberOfRatings
   */
  
  @Schema(name = "number_of_ratings", example = "10", description = "The number of ratings for the item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number_of_ratings")
  public JsonNullable<Integer> getNumberOfRatings() {
    return numberOfRatings;
  }

  public void setNumberOfRatings(JsonNullable<Integer> numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
  }

  public UpdatableItemAttributes numberOfReviews(Integer numberOfReviews) {
    this.numberOfReviews = JsonNullable.of(numberOfReviews);
    return this;
  }

  /**
   * The number of reviews available for the item.
   * @return numberOfReviews
   */
  
  @Schema(name = "number_of_reviews", example = "10", description = "The number of reviews available for the item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number_of_reviews")
  public JsonNullable<Integer> getNumberOfReviews() {
    return numberOfReviews;
  }

  public void setNumberOfReviews(JsonNullable<Integer> numberOfReviews) {
    this.numberOfReviews = numberOfReviews;
  }

  public UpdatableItemAttributes pattern(String pattern) {
    this.pattern = JsonNullable.of(pattern);
    return this;
  }

  /**
   * The description of the pattern used for the product.
   * @return pattern
   */
  
  @Schema(name = "pattern", example = "plaid", description = "The description of the pattern used for the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pattern")
  public JsonNullable<String> getPattern() {
    return pattern;
  }

  public void setPattern(JsonNullable<String> pattern) {
    this.pattern = pattern;
  }

  public UpdatableItemAttributes price(@Nullable String price) {
    this.price = price;
    return this;
  }

  /**
   * The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
   * @return price
   */
  
  @Schema(name = "price", example = "24.99 USD", description = "The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public @Nullable String getPrice() {
    return price;
  }

  public void setPrice(@Nullable String price) {
    this.price = price;
  }

  public UpdatableItemAttributes productType(String productType) {
    this.productType = JsonNullable.of(productType);
    return this;
  }

  /**
   * <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
   * @return productType
   */
  
  @Schema(name = "product_type", example = "Clothing > Women’s > Shirts > Denim", description = "<p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_type")
  public JsonNullable<String> getProductType() {
    return productType;
  }

  public void setProductType(JsonNullable<String> productType) {
    this.productType = productType;
  }

  public UpdatableItemAttributes promotionId(String promotionId) {
    this.promotionId = JsonNullable.of(promotionId);
    return this;
  }

  /**
   * A unique identifier referencing the promotion associated with this catalog item.
   * @return promotionId
   */
  
  @Schema(name = "promotion_id", example = "promotion_1", description = "A unique identifier referencing the promotion associated with this catalog item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_id")
  public JsonNullable<String> getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(JsonNullable<String> promotionId) {
    this.promotionId = promotionId;
  }

  public UpdatableItemAttributes salePrice(String salePrice) {
    this.salePrice = JsonNullable.of(salePrice);
    return this;
  }

  /**
   * The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
   * @return salePrice
   */
  
  @Schema(name = "sale_price", example = "14.99 USD", description = "The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sale_price")
  public JsonNullable<String> getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(JsonNullable<String> salePrice) {
    this.salePrice = salePrice;
  }

  public UpdatableItemAttributes salePriceEffectiveDate(String salePriceEffectiveDate) {
    this.salePriceEffectiveDate = JsonNullable.of(salePriceEffectiveDate);
    return this;
  }

  /**
   * Sale price effective date. Expected format: <start_date>/<end_date> (ISO 8601 format)
   * @return salePriceEffectiveDate
   */
  
  @Schema(name = "sale_price_effective_date", example = "2025-01-01T00:00:00.000000Z/2025-01-07T00:00:00.000000Z", description = "Sale price effective date. Expected format: <start_date>/<end_date> (ISO 8601 format)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sale_price_effective_date")
  public JsonNullable<String> getSalePriceEffectiveDate() {
    return salePriceEffectiveDate;
  }

  public void setSalePriceEffectiveDate(JsonNullable<String> salePriceEffectiveDate) {
    this.salePriceEffectiveDate = salePriceEffectiveDate;
  }

  public UpdatableItemAttributes shipping(String shipping) {
    this.shipping = JsonNullable.of(shipping);
    return this;
  }

  /**
   * Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
   * @return shipping
   */
  
  @Schema(name = "shipping", example = "US:CA:Ground:0 USD", description = "Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipping")
  public JsonNullable<String> getShipping() {
    return shipping;
  }

  public void setShipping(JsonNullable<String> shipping) {
    this.shipping = shipping;
  }

  public UpdatableItemAttributes shippingHeight(String shippingHeight) {
    this.shippingHeight = JsonNullable.of(shippingHeight);
    return this;
  }

  /**
   * The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingHeight
   */
  
  @Schema(name = "shipping_height", example = "12 in", description = "The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipping_height")
  public JsonNullable<String> getShippingHeight() {
    return shippingHeight;
  }

  public void setShippingHeight(JsonNullable<String> shippingHeight) {
    this.shippingHeight = shippingHeight;
  }

  public UpdatableItemAttributes shippingWeight(String shippingWeight) {
    this.shippingWeight = JsonNullable.of(shippingWeight);
    return this;
  }

  /**
   * The weight of the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingWeight
   */
  
  @Schema(name = "shipping_weight", example = "3 kg", description = "The weight of the product. Ensure there is a space between the numeric string and the metric.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipping_weight")
  public JsonNullable<String> getShippingWeight() {
    return shippingWeight;
  }

  public void setShippingWeight(JsonNullable<String> shippingWeight) {
    this.shippingWeight = shippingWeight;
  }

  public UpdatableItemAttributes shippingWidth(String shippingWidth) {
    this.shippingWidth = JsonNullable.of(shippingWidth);
    return this;
  }

  /**
   * The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
   * @return shippingWidth
   */
  
  @Schema(name = "shipping_width", example = "16 in", description = "The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipping_width")
  public JsonNullable<String> getShippingWidth() {
    return shippingWidth;
  }

  public void setShippingWidth(JsonNullable<String> shippingWidth) {
    this.shippingWidth = shippingWidth;
  }

  public UpdatableItemAttributes size(String size) {
    this.size = JsonNullable.of(size);
    return this;
  }

  /**
   * The size of the product.
   * @return size
   */
  
  @Schema(name = "size", example = "M", description = "The size of the product.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public JsonNullable<String> getSize() {
    return size;
  }

  public void setSize(JsonNullable<String> size) {
    this.size = size;
  }

  public UpdatableItemAttributes sizeSystem(String sizeSystem) {
    this.sizeSystem = JsonNullable.of(sizeSystem);
    return this;
  }

  /**
   * Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.
   * @return sizeSystem
   */
  
  @Schema(name = "size_system", example = "US", description = "Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’, ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘BR’, ‘MEX’, or ‘AU’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size_system")
  public JsonNullable<String> getSizeSystem() {
    return sizeSystem;
  }

  public void setSizeSystem(JsonNullable<String> sizeSystem) {
    this.sizeSystem = sizeSystem;
  }

  public UpdatableItemAttributes sizeType(String sizeType) {
    this.sizeType = JsonNullable.of(sizeType);
    return this;
  }

  /**
   * Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.
   * @return sizeType
   */
  
  @Schema(name = "size_type", example = "regular", description = "Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, or ‘maternity’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size_type")
  public JsonNullable<String> getSizeType() {
    return sizeType;
  }

  public void setSizeType(JsonNullable<String> sizeType) {
    this.sizeType = sizeType;
  }

  public UpdatableItemAttributes tax(String tax) {
    this.tax = JsonNullable.of(tax);
    return this;
  }

  /**
   * Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
   * @return tax
   */
  
  @Schema(name = "tax", example = "US:1025433:6.00:y", description = "Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tax")
  public JsonNullable<String> getTax() {
    return tax;
  }

  public void setTax(JsonNullable<String> tax) {
    this.tax = tax;
  }

  public UpdatableItemAttributes title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * <p><= 500 characters</p> <p>The name of the product.</p>
   * @return title
   */
  
  @Schema(name = "title", example = "Women’s denim shirt, large", description = "<p><= 500 characters</p> <p>The name of the product.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
    this.title = title;
  }

  public UpdatableItemAttributes unitPricingBaseMeasure(String unitPricingBaseMeasure) {
    this.unitPricingBaseMeasure = JsonNullable.of(unitPricingBaseMeasure);
    return this;
  }

  /**
   * Unit pricing base measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <base_measure> <unit_type>
   * @return unitPricingBaseMeasure
   */
  
  @Schema(name = "unit_pricing_base_measure", example = "10 ML", description = "Unit pricing base measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <base_measure> <unit_type>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unit_pricing_base_measure")
  public JsonNullable<String> getUnitPricingBaseMeasure() {
    return unitPricingBaseMeasure;
  }

  public void setUnitPricingBaseMeasure(JsonNullable<String> unitPricingBaseMeasure) {
    this.unitPricingBaseMeasure = unitPricingBaseMeasure;
  }

  public UpdatableItemAttributes unitPricingMeasure(String unitPricingMeasure) {
    this.unitPricingMeasure = JsonNullable.of(unitPricingMeasure);
    return this;
  }

  /**
   * Unit pricing total measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <total_units> <unit_type>
   * @return unitPricingMeasure
   */
  
  @Schema(name = "unit_pricing_measure", example = "10 ML", description = "Unit pricing total measure of the product. This data will only be shown to pinners in the enabled countries. Expected format: <total_units> <unit_type>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unit_pricing_measure")
  public JsonNullable<String> getUnitPricingMeasure() {
    return unitPricingMeasure;
  }

  public void setUnitPricingMeasure(JsonNullable<String> unitPricingMeasure) {
    this.unitPricingMeasure = unitPricingMeasure;
  }

  public UpdatableItemAttributes variantNames(List<String> variantNames) {
    this.variantNames = JsonNullable.of(variantNames);
    return this;
  }

  public UpdatableItemAttributes addVariantNamesItem(String variantNamesItem) {
    if (this.variantNames == null || !this.variantNames.isPresent()) {
      this.variantNames = JsonNullable.of(new ArrayList<>());
    }
    this.variantNames.get().add(variantNamesItem);
    return this;
  }

  /**
   * Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
   * @return variantNames
   */
  
  @Schema(name = "variant_names", example = "[\"Color\",\"Size\"]", description = "Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variant_names")
  public JsonNullable<List<String>> getVariantNames() {
    return variantNames;
  }

  public void setVariantNames(JsonNullable<List<String>> variantNames) {
    this.variantNames = variantNames;
  }

  public UpdatableItemAttributes variantValues(List<String> variantValues) {
    this.variantValues = JsonNullable.of(variantValues);
    return this;
  }

  public UpdatableItemAttributes addVariantValuesItem(String variantValuesItem) {
    if (this.variantValues == null || !this.variantValues.isPresent()) {
      this.variantValues = JsonNullable.of(new ArrayList<>());
    }
    this.variantValues.get().add(variantValuesItem);
    return this;
  }

  /**
   * Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
   * @return variantValues
   */
  
  @Schema(name = "variant_values", example = "[\"Red\",\"Small\"]", description = "Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variant_values")
  public JsonNullable<List<String>> getVariantValues() {
    return variantValues;
  }

  public void setVariantValues(JsonNullable<List<String>> variantValues) {
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
    return equalsNullable(this.adImage0Link, updatableItemAttributes.adImage0Link) &&
        equalsNullable(this.adImage0Tag, updatableItemAttributes.adImage0Tag) &&
        equalsNullable(this.adImage10Link, updatableItemAttributes.adImage10Link) &&
        equalsNullable(this.adImage10Tag, updatableItemAttributes.adImage10Tag) &&
        equalsNullable(this.adImage11Link, updatableItemAttributes.adImage11Link) &&
        equalsNullable(this.adImage11Tag, updatableItemAttributes.adImage11Tag) &&
        equalsNullable(this.adImage12Link, updatableItemAttributes.adImage12Link) &&
        equalsNullable(this.adImage12Tag, updatableItemAttributes.adImage12Tag) &&
        equalsNullable(this.adImage13Link, updatableItemAttributes.adImage13Link) &&
        equalsNullable(this.adImage13Tag, updatableItemAttributes.adImage13Tag) &&
        equalsNullable(this.adImage14Link, updatableItemAttributes.adImage14Link) &&
        equalsNullable(this.adImage14Tag, updatableItemAttributes.adImage14Tag) &&
        equalsNullable(this.adImage15Link, updatableItemAttributes.adImage15Link) &&
        equalsNullable(this.adImage15Tag, updatableItemAttributes.adImage15Tag) &&
        equalsNullable(this.adImage16Link, updatableItemAttributes.adImage16Link) &&
        equalsNullable(this.adImage16Tag, updatableItemAttributes.adImage16Tag) &&
        equalsNullable(this.adImage17Link, updatableItemAttributes.adImage17Link) &&
        equalsNullable(this.adImage17Tag, updatableItemAttributes.adImage17Tag) &&
        equalsNullable(this.adImage18Link, updatableItemAttributes.adImage18Link) &&
        equalsNullable(this.adImage18Tag, updatableItemAttributes.adImage18Tag) &&
        equalsNullable(this.adImage19Link, updatableItemAttributes.adImage19Link) &&
        equalsNullable(this.adImage19Tag, updatableItemAttributes.adImage19Tag) &&
        equalsNullable(this.adImage1Link, updatableItemAttributes.adImage1Link) &&
        equalsNullable(this.adImage1Tag, updatableItemAttributes.adImage1Tag) &&
        equalsNullable(this.adImage2Link, updatableItemAttributes.adImage2Link) &&
        equalsNullable(this.adImage2Tag, updatableItemAttributes.adImage2Tag) &&
        equalsNullable(this.adImage3Link, updatableItemAttributes.adImage3Link) &&
        equalsNullable(this.adImage3Tag, updatableItemAttributes.adImage3Tag) &&
        equalsNullable(this.adImage4Link, updatableItemAttributes.adImage4Link) &&
        equalsNullable(this.adImage4Tag, updatableItemAttributes.adImage4Tag) &&
        equalsNullable(this.adImage5Link, updatableItemAttributes.adImage5Link) &&
        equalsNullable(this.adImage5Tag, updatableItemAttributes.adImage5Tag) &&
        equalsNullable(this.adImage6Link, updatableItemAttributes.adImage6Link) &&
        equalsNullable(this.adImage6Tag, updatableItemAttributes.adImage6Tag) &&
        equalsNullable(this.adImage7Link, updatableItemAttributes.adImage7Link) &&
        equalsNullable(this.adImage7Tag, updatableItemAttributes.adImage7Tag) &&
        equalsNullable(this.adImage8Link, updatableItemAttributes.adImage8Link) &&
        equalsNullable(this.adImage8Tag, updatableItemAttributes.adImage8Tag) &&
        equalsNullable(this.adImage9Link, updatableItemAttributes.adImage9Link) &&
        equalsNullable(this.adImage9Tag, updatableItemAttributes.adImage9Tag) &&
        equalsNullable(this.adLink, updatableItemAttributes.adLink) &&
        equalsNullable(this.adVideo0Link, updatableItemAttributes.adVideo0Link) &&
        equalsNullable(this.adVideo0Tag, updatableItemAttributes.adVideo0Tag) &&
        equalsNullable(this.adVideo1Link, updatableItemAttributes.adVideo1Link) &&
        equalsNullable(this.adVideo1Tag, updatableItemAttributes.adVideo1Tag) &&
        equalsNullable(this.adVideo2Link, updatableItemAttributes.adVideo2Link) &&
        equalsNullable(this.adVideo2Tag, updatableItemAttributes.adVideo2Tag) &&
        equalsNullable(this.adult, updatableItemAttributes.adult) &&
        equalsNullable(this.ageGroup, updatableItemAttributes.ageGroup) &&
        Objects.equals(this.androidDeepLink, updatableItemAttributes.androidDeepLink) &&
        Objects.equals(this.availability, updatableItemAttributes.availability) &&
        equalsNullable(this.averageReviewRating, updatableItemAttributes.averageReviewRating) &&
        equalsNullable(this.brand, updatableItemAttributes.brand) &&
        equalsNullable(this.checkoutEnabled, updatableItemAttributes.checkoutEnabled) &&
        equalsNullable(this.color, updatableItemAttributes.color) &&
        equalsNullable(this.condition, updatableItemAttributes.condition) &&
        equalsNullable(this.customLabel0, updatableItemAttributes.customLabel0) &&
        equalsNullable(this.customLabel1, updatableItemAttributes.customLabel1) &&
        equalsNullable(this.customLabel2, updatableItemAttributes.customLabel2) &&
        equalsNullable(this.customLabel3, updatableItemAttributes.customLabel3) &&
        equalsNullable(this.customLabel4, updatableItemAttributes.customLabel4) &&
        equalsNullable(this.customNumber0, updatableItemAttributes.customNumber0) &&
        equalsNullable(this.customNumber1, updatableItemAttributes.customNumber1) &&
        equalsNullable(this.customNumber2, updatableItemAttributes.customNumber2) &&
        equalsNullable(this.customNumber3, updatableItemAttributes.customNumber3) &&
        equalsNullable(this.customNumber4, updatableItemAttributes.customNumber4) &&
        Objects.equals(this.description, updatableItemAttributes.description) &&
        equalsNullable(this.freeShippingLabel, updatableItemAttributes.freeShippingLabel) &&
        equalsNullable(this.freeShippingLimit, updatableItemAttributes.freeShippingLimit) &&
        equalsNullable(this.gender, updatableItemAttributes.gender) &&
        equalsNullable(this.googleProductCategory, updatableItemAttributes.googleProductCategory) &&
        equalsNullable(this.gtin, updatableItemAttributes.gtin) &&
        Objects.equals(this.id, updatableItemAttributes.id) &&
        equalsNullable(this.installmentPrice, updatableItemAttributes.installmentPrice) &&
        Objects.equals(this.iosDeepLink, updatableItemAttributes.iosDeepLink) &&
        equalsNullable(this.itemGroupId, updatableItemAttributes.itemGroupId) &&
        equalsNullable(this.lastUpdatedTime, updatableItemAttributes.lastUpdatedTime) &&
        Objects.equals(this.link, updatableItemAttributes.link) &&
        equalsNullable(this.material, updatableItemAttributes.material) &&
        equalsNullable(this.minAdPrice, updatableItemAttributes.minAdPrice) &&
        equalsNullable(this.mobileLink, updatableItemAttributes.mobileLink) &&
        equalsNullable(this.mpn, updatableItemAttributes.mpn) &&
        equalsNullable(this.numberOfRatings, updatableItemAttributes.numberOfRatings) &&
        equalsNullable(this.numberOfReviews, updatableItemAttributes.numberOfReviews) &&
        equalsNullable(this.pattern, updatableItemAttributes.pattern) &&
        Objects.equals(this.price, updatableItemAttributes.price) &&
        equalsNullable(this.productType, updatableItemAttributes.productType) &&
        equalsNullable(this.promotionId, updatableItemAttributes.promotionId) &&
        equalsNullable(this.salePrice, updatableItemAttributes.salePrice) &&
        equalsNullable(this.salePriceEffectiveDate, updatableItemAttributes.salePriceEffectiveDate) &&
        equalsNullable(this.shipping, updatableItemAttributes.shipping) &&
        equalsNullable(this.shippingHeight, updatableItemAttributes.shippingHeight) &&
        equalsNullable(this.shippingWeight, updatableItemAttributes.shippingWeight) &&
        equalsNullable(this.shippingWidth, updatableItemAttributes.shippingWidth) &&
        equalsNullable(this.size, updatableItemAttributes.size) &&
        equalsNullable(this.sizeSystem, updatableItemAttributes.sizeSystem) &&
        equalsNullable(this.sizeType, updatableItemAttributes.sizeType) &&
        equalsNullable(this.tax, updatableItemAttributes.tax) &&
        Objects.equals(this.title, updatableItemAttributes.title) &&
        equalsNullable(this.unitPricingBaseMeasure, updatableItemAttributes.unitPricingBaseMeasure) &&
        equalsNullable(this.unitPricingMeasure, updatableItemAttributes.unitPricingMeasure) &&
        equalsNullable(this.variantNames, updatableItemAttributes.variantNames) &&
        equalsNullable(this.variantValues, updatableItemAttributes.variantValues);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(adImage0Link), hashCodeNullable(adImage0Tag), hashCodeNullable(adImage10Link), hashCodeNullable(adImage10Tag), hashCodeNullable(adImage11Link), hashCodeNullable(adImage11Tag), hashCodeNullable(adImage12Link), hashCodeNullable(adImage12Tag), hashCodeNullable(adImage13Link), hashCodeNullable(adImage13Tag), hashCodeNullable(adImage14Link), hashCodeNullable(adImage14Tag), hashCodeNullable(adImage15Link), hashCodeNullable(adImage15Tag), hashCodeNullable(adImage16Link), hashCodeNullable(adImage16Tag), hashCodeNullable(adImage17Link), hashCodeNullable(adImage17Tag), hashCodeNullable(adImage18Link), hashCodeNullable(adImage18Tag), hashCodeNullable(adImage19Link), hashCodeNullable(adImage19Tag), hashCodeNullable(adImage1Link), hashCodeNullable(adImage1Tag), hashCodeNullable(adImage2Link), hashCodeNullable(adImage2Tag), hashCodeNullable(adImage3Link), hashCodeNullable(adImage3Tag), hashCodeNullable(adImage4Link), hashCodeNullable(adImage4Tag), hashCodeNullable(adImage5Link), hashCodeNullable(adImage5Tag), hashCodeNullable(adImage6Link), hashCodeNullable(adImage6Tag), hashCodeNullable(adImage7Link), hashCodeNullable(adImage7Tag), hashCodeNullable(adImage8Link), hashCodeNullable(adImage8Tag), hashCodeNullable(adImage9Link), hashCodeNullable(adImage9Tag), hashCodeNullable(adLink), hashCodeNullable(adVideo0Link), hashCodeNullable(adVideo0Tag), hashCodeNullable(adVideo1Link), hashCodeNullable(adVideo1Tag), hashCodeNullable(adVideo2Link), hashCodeNullable(adVideo2Tag), hashCodeNullable(adult), hashCodeNullable(ageGroup), androidDeepLink, availability, hashCodeNullable(averageReviewRating), hashCodeNullable(brand), hashCodeNullable(checkoutEnabled), hashCodeNullable(color), hashCodeNullable(condition), hashCodeNullable(customLabel0), hashCodeNullable(customLabel1), hashCodeNullable(customLabel2), hashCodeNullable(customLabel3), hashCodeNullable(customLabel4), hashCodeNullable(customNumber0), hashCodeNullable(customNumber1), hashCodeNullable(customNumber2), hashCodeNullable(customNumber3), hashCodeNullable(customNumber4), description, hashCodeNullable(freeShippingLabel), hashCodeNullable(freeShippingLimit), hashCodeNullable(gender), hashCodeNullable(googleProductCategory), hashCodeNullable(gtin), id, hashCodeNullable(installmentPrice), iosDeepLink, hashCodeNullable(itemGroupId), hashCodeNullable(lastUpdatedTime), link, hashCodeNullable(material), hashCodeNullable(minAdPrice), hashCodeNullable(mobileLink), hashCodeNullable(mpn), hashCodeNullable(numberOfRatings), hashCodeNullable(numberOfReviews), hashCodeNullable(pattern), price, hashCodeNullable(productType), hashCodeNullable(promotionId), hashCodeNullable(salePrice), hashCodeNullable(salePriceEffectiveDate), hashCodeNullable(shipping), hashCodeNullable(shippingHeight), hashCodeNullable(shippingWeight), hashCodeNullable(shippingWidth), hashCodeNullable(size), hashCodeNullable(sizeSystem), hashCodeNullable(sizeType), hashCodeNullable(tax), title, hashCodeNullable(unitPricingBaseMeasure), hashCodeNullable(unitPricingMeasure), hashCodeNullable(variantNames), hashCodeNullable(variantValues));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

