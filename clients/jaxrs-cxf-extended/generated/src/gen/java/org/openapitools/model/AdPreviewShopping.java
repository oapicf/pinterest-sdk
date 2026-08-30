package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdShoppingPreviewCreativeType;
import org.openapitools.model.BasePreferredMediaType;
import org.openapitools.model.CustomizableCTAType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ad preview from a catalog product group (shopping).
 */
@ApiModel(description="Ad preview from a catalog product group (shopping).")

public class AdPreviewShopping  {
  
 /**
  * Catalog Product Group Id.
  */
  @ApiModelProperty(example = "123456789", required = true, value = "Catalog Product Group Id.")
  private String catalogProductGroupId;

 /**
  * Ad format of the shopping ad preview.
  */
  @ApiModelProperty(example = "SHOPPING", required = true, value = "Ad format of the shopping ad preview.")
  @Valid
  private AdShoppingPreviewCreativeType creativeType;

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
  public AdPreviewShopping catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
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
  public AdPreviewShopping creativeType(AdShoppingPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
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
  public AdPreviewShopping customizableCtaType(CustomizableCTAType customizableCtaType) {
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
  public AdPreviewShopping heroImageTitle(String heroImageTitle) {
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
  public AdPreviewShopping heroImageUrl(String heroImageUrl) {
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
  public AdPreviewShopping heroPinId(String heroPinId) {
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
  public AdPreviewShopping imageTag(String imageTag) {
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
  public AdPreviewShopping itemId(String itemId) {
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
  public AdPreviewShopping preferredMediaType(BasePreferredMediaType preferredMediaType) {
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
  public AdPreviewShopping showPromotion(Boolean showPromotion) {
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
  public AdPreviewShopping videoTag(String videoTag) {
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
    AdPreviewShopping adPreviewShopping = (AdPreviewShopping) o;
    return Objects.equals(this.catalogProductGroupId, adPreviewShopping.catalogProductGroupId) &&
        Objects.equals(this.creativeType, adPreviewShopping.creativeType) &&
        Objects.equals(this.customizableCtaType, adPreviewShopping.customizableCtaType) &&
        Objects.equals(this.heroImageTitle, adPreviewShopping.heroImageTitle) &&
        Objects.equals(this.heroImageUrl, adPreviewShopping.heroImageUrl) &&
        Objects.equals(this.heroPinId, adPreviewShopping.heroPinId) &&
        Objects.equals(this.imageTag, adPreviewShopping.imageTag) &&
        Objects.equals(this.itemId, adPreviewShopping.itemId) &&
        Objects.equals(this.preferredMediaType, adPreviewShopping.preferredMediaType) &&
        Objects.equals(this.showPromotion, adPreviewShopping.showPromotion) &&
        Objects.equals(this.videoTag, adPreviewShopping.videoTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogProductGroupId, creativeType, customizableCtaType, heroImageTitle, heroImageUrl, heroPinId, imageTag, itemId, preferredMediaType, showPromotion, videoTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPreviewShopping {\n");
    
    sb.append("    catalogProductGroupId: ").append(toIndentedString(catalogProductGroupId)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
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

