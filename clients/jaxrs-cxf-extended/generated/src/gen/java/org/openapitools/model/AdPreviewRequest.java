package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdPreviewShopping;
import org.openapitools.model.AdPreviewSourceImage;
import org.openapitools.model.AdPreviewSourcePinId;
import org.openapitools.model.AdShoppingPreviewCreativeType;
import org.openapitools.model.BasePreferredMediaType;
import org.openapitools.model.CustomizableCTAType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdPreviewRequest  {
  
 /**
  * Image URL.
  */
  @ApiModelProperty(example = "https://somewebsite.com/someimage.jpg", required = true, value = "Image URL.")
  private String imageUrl;

 /**
  * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
  */
  @ApiModelProperty(example = "7834020404549", value = "Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.")
  private String promotionId;

 /**
  * Title displayed below ad.
  */
  @ApiModelProperty(example = "My Preview Image", required = true, value = "Title displayed below ad.")
  private String title;

 /**
  * Ad format of the shopping ad preview.
  */
  @ApiModelProperty(example = "SHOPPING", required = true, value = "Ad format of the shopping ad preview.")
  @Valid
  private AdShoppingPreviewCreativeType creativeType;

 /**
  * Pin ID.
  */
  @ApiModelProperty(example = "7389479023", required = true, value = "Pin ID.")
  private String pinId;

 /**
  * Catalog Product Group Id.
  */
  @ApiModelProperty(example = "123456789", required = true, value = "Catalog Product Group Id.")
  private String catalogProductGroupId;

 /**
  * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
  */
  @ApiModelProperty(value = "Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`")
  @Valid
  private CustomizableCTAType customizableCtaType;

 /**
  * Title displayed below ad.
  */
  @ApiModelProperty(example = "My Preview Image", value = "Title displayed below ad.")
  private String heroImageTitle;

 /**
  * Hero image URL.
  */
  @ApiModelProperty(example = "https://somewebsite.com/someimage.jpg", value = "Hero image URL.")
  private String heroImageUrl;

 /**
  * Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
  */
  @ApiModelProperty(example = "987654321", value = "Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.")
  private String heroPinId;

 /**
  * Multi image template tag.
  */
  @ApiModelProperty(example = "Christmas Sale", value = "Multi image template tag.")
  private String imageTag;

 /**
  * Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
  */
  @ApiModelProperty(example = "111111111", value = "Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.")
  private String itemId;

 /**
  * Preferred media type.
  */
  @ApiModelProperty(example = "IMAGE", value = "Preferred media type.")
  @Valid
  private BasePreferredMediaType preferredMediaType;

 /**
  * Include promotion data in preview when available on catalog item. Defaults to false.
  */
  @ApiModelProperty(value = "Include promotion data in preview when available on catalog item. Defaults to false.")
  private Boolean showPromotion;

 /**
  * Multi video template tag, image_tag and video_tag are mutual exclusive.
  */
  @ApiModelProperty(example = "Black Friday Sale", value = "Multi video template tag, image_tag and video_tag are mutual exclusive.")
  private String videoTag;
 /**
  * Image URL.
  * @return imageUrl
  */
  @JsonProperty("image_url")
  @NotNull
  public String getImageUrl() {
    return imageUrl;
  }

  /**
   * Sets the <code>imageUrl</code> property.
   */
 public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * Sets the <code>imageUrl</code> property.
   */
  public AdPreviewRequest imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

 /**
  * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
  * @return promotionId
  */
  @JsonProperty("promotion_id")
 @Pattern(regexp="^\\d+$")  public String getPromotionId() {
    return promotionId;
  }

  /**
   * Sets the <code>promotionId</code> property.
   */
 public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  /**
   * Sets the <code>promotionId</code> property.
   */
  public AdPreviewRequest promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

 /**
  * Title displayed below ad.
  * @return title
  */
  @JsonProperty("title")
  @NotNull
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public AdPreviewRequest title(String title) {
    this.title = title;
    return this;
  }

 /**
  * Ad format of the shopping ad preview.
  * @return creativeType
  */
  @JsonProperty("creative_type")
  @NotNull
  public AdShoppingPreviewCreativeType getCreativeType() {
    return creativeType;
  }

  /**
   * Sets the <code>creativeType</code> property.
   */
 public void setCreativeType(AdShoppingPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Sets the <code>creativeType</code> property.
   */
  public AdPreviewRequest creativeType(AdShoppingPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

 /**
  * Pin ID.
  * @return pinId
  */
  @JsonProperty("pin_id")
  @NotNull
  public String getPinId() {
    return pinId;
  }

  /**
   * Sets the <code>pinId</code> property.
   */
 public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  /**
   * Sets the <code>pinId</code> property.
   */
  public AdPreviewRequest pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

 /**
  * Catalog Product Group Id.
  * @return catalogProductGroupId
  */
  @JsonProperty("catalog_product_group_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }

  /**
   * Sets the <code>catalogProductGroupId</code> property.
   */
 public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  /**
   * Sets the <code>catalogProductGroupId</code> property.
   */
  public AdPreviewRequest catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
    return this;
  }

 /**
  * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60;
  * @return customizableCtaType
  */
  @JsonProperty("customizable_cta_type")
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }

  /**
   * Sets the <code>customizableCtaType</code> property.
   */
 public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  /**
   * Sets the <code>customizableCtaType</code> property.
   */
  public AdPreviewRequest customizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

 /**
  * Title displayed below ad.
  * @return heroImageTitle
  */
  @JsonProperty("hero_image_title")
  public String getHeroImageTitle() {
    return heroImageTitle;
  }

  /**
   * Sets the <code>heroImageTitle</code> property.
   */
 public void setHeroImageTitle(String heroImageTitle) {
    this.heroImageTitle = heroImageTitle;
  }

  /**
   * Sets the <code>heroImageTitle</code> property.
   */
  public AdPreviewRequest heroImageTitle(String heroImageTitle) {
    this.heroImageTitle = heroImageTitle;
    return this;
  }

 /**
  * Hero image URL.
  * @return heroImageUrl
  */
  @JsonProperty("hero_image_url")
  public String getHeroImageUrl() {
    return heroImageUrl;
  }

  /**
   * Sets the <code>heroImageUrl</code> property.
   */
 public void setHeroImageUrl(String heroImageUrl) {
    this.heroImageUrl = heroImageUrl;
  }

  /**
   * Sets the <code>heroImageUrl</code> property.
   */
  public AdPreviewRequest heroImageUrl(String heroImageUrl) {
    this.heroImageUrl = heroImageUrl;
    return this;
  }

 /**
  * Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
  * @return heroPinId
  */
  @JsonProperty("hero_pin_id")
 @Pattern(regexp="^\\d+$")  public String getHeroPinId() {
    return heroPinId;
  }

  /**
   * Sets the <code>heroPinId</code> property.
   */
 public void setHeroPinId(String heroPinId) {
    this.heroPinId = heroPinId;
  }

  /**
   * Sets the <code>heroPinId</code> property.
   */
  public AdPreviewRequest heroPinId(String heroPinId) {
    this.heroPinId = heroPinId;
    return this;
  }

 /**
  * Multi image template tag.
  * @return imageTag
  */
  @JsonProperty("image_tag")
  public String getImageTag() {
    return imageTag;
  }

  /**
   * Sets the <code>imageTag</code> property.
   */
 public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }

  /**
   * Sets the <code>imageTag</code> property.
   */
  public AdPreviewRequest imageTag(String imageTag) {
    this.imageTag = imageTag;
    return this;
  }

 /**
  * Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
  * @return itemId
  */
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
 public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
  public AdPreviewRequest itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
  * Preferred media type.
  * @return preferredMediaType
  */
  @JsonProperty("preferred_media_type")
  public BasePreferredMediaType getPreferredMediaType() {
    return preferredMediaType;
  }

  /**
   * Sets the <code>preferredMediaType</code> property.
   */
 public void setPreferredMediaType(BasePreferredMediaType preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

  /**
   * Sets the <code>preferredMediaType</code> property.
   */
  public AdPreviewRequest preferredMediaType(BasePreferredMediaType preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
    return this;
  }

 /**
  * Include promotion data in preview when available on catalog item. Defaults to false.
  * @return showPromotion
  */
  @JsonProperty("show_promotion")
  public Boolean getShowPromotion() {
    return showPromotion;
  }

  /**
   * Sets the <code>showPromotion</code> property.
   */
 public void setShowPromotion(Boolean showPromotion) {
    this.showPromotion = showPromotion;
  }

  /**
   * Sets the <code>showPromotion</code> property.
   */
  public AdPreviewRequest showPromotion(Boolean showPromotion) {
    this.showPromotion = showPromotion;
    return this;
  }

 /**
  * Multi video template tag, image_tag and video_tag are mutual exclusive.
  * @return videoTag
  */
  @JsonProperty("video_tag")
  public String getVideoTag() {
    return videoTag;
  }

  /**
   * Sets the <code>videoTag</code> property.
   */
 public void setVideoTag(String videoTag) {
    this.videoTag = videoTag;
  }

  /**
   * Sets the <code>videoTag</code> property.
   */
  public AdPreviewRequest videoTag(String videoTag) {
    this.videoTag = videoTag;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdPreviewRequest adPreviewRequest = (AdPreviewRequest) o;
    return Objects.equals(this.imageUrl, adPreviewRequest.imageUrl) &&
        Objects.equals(this.promotionId, adPreviewRequest.promotionId) &&
        Objects.equals(this.title, adPreviewRequest.title) &&
        Objects.equals(this.creativeType, adPreviewRequest.creativeType) &&
        Objects.equals(this.pinId, adPreviewRequest.pinId) &&
        Objects.equals(this.catalogProductGroupId, adPreviewRequest.catalogProductGroupId) &&
        Objects.equals(this.customizableCtaType, adPreviewRequest.customizableCtaType) &&
        Objects.equals(this.heroImageTitle, adPreviewRequest.heroImageTitle) &&
        Objects.equals(this.heroImageUrl, adPreviewRequest.heroImageUrl) &&
        Objects.equals(this.heroPinId, adPreviewRequest.heroPinId) &&
        Objects.equals(this.imageTag, adPreviewRequest.imageTag) &&
        Objects.equals(this.itemId, adPreviewRequest.itemId) &&
        Objects.equals(this.preferredMediaType, adPreviewRequest.preferredMediaType) &&
        Objects.equals(this.showPromotion, adPreviewRequest.showPromotion) &&
        Objects.equals(this.videoTag, adPreviewRequest.videoTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, promotionId, title, creativeType, pinId, catalogProductGroupId, customizableCtaType, heroImageTitle, heroImageUrl, heroPinId, imageTag, itemId, preferredMediaType, showPromotion, videoTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPreviewRequest {\n");
    
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("    catalogProductGroupId: ").append(toIndentedString(catalogProductGroupId)).append("\n");
    sb.append("    customizableCtaType: ").append(toIndentedString(customizableCtaType)).append("\n");
    sb.append("    heroImageTitle: ").append(toIndentedString(heroImageTitle)).append("\n");
    sb.append("    heroImageUrl: ").append(toIndentedString(heroImageUrl)).append("\n");
    sb.append("    heroPinId: ").append(toIndentedString(heroPinId)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    preferredMediaType: ").append(toIndentedString(preferredMediaType)).append("\n");
    sb.append("    showPromotion: ").append(toIndentedString(showPromotion)).append("\n");
    sb.append("    videoTag: ").append(toIndentedString(videoTag)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

