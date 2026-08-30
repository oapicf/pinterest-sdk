package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdShoppingPreviewCreativeType;
import org.openapitools.model.BasePreferredMediaType;
import org.openapitools.model.CustomizableCTAType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Ad preview from a catalog product group (shopping).
 **/
@ApiModel(description = "Ad preview from a catalog product group (shopping).")
@JsonTypeName("AdPreviewShopping")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdPreviewShopping   {
  private String catalogProductGroupId;
  private AdShoppingPreviewCreativeType creativeType;
  private CustomizableCTAType customizableCtaType;
  private String heroImageTitle;
  private String heroImageUrl;
  private String heroPinId;
  private String imageTag;
  private String itemId;
  private BasePreferredMediaType preferredMediaType;
  private Boolean showPromotion;
  private String videoTag;

  public AdPreviewShopping() {
  }

  @JsonCreator
  public AdPreviewShopping(
    @JsonProperty(required = true, value = "catalog_product_group_id") String catalogProductGroupId,
    @JsonProperty(required = true, value = "creative_type") AdShoppingPreviewCreativeType creativeType
  ) {
    this.catalogProductGroupId = catalogProductGroupId;
    this.creativeType = creativeType;
  }

  /**
   * Catalog Product Group Id.
   **/
  public AdPreviewShopping catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "123456789", required = true, value = "Catalog Product Group Id.")
  @JsonProperty(required = true, value = "catalog_product_group_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }

  @JsonProperty(required = true, value = "catalog_product_group_id")
  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  /**
   * Ad format of the shopping ad preview.
   **/
  public AdPreviewShopping creativeType(AdShoppingPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  
  @ApiModelProperty(example = "SHOPPING", required = true, value = "Ad format of the shopping ad preview.")
  @JsonProperty(required = true, value = "creative_type")
  @NotNull public AdShoppingPreviewCreativeType getCreativeType() {
    return creativeType;
  }

  @JsonProperty(required = true, value = "creative_type")
  public void setCreativeType(AdShoppingPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60;
   **/
  public AdPreviewShopping customizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

  
  @ApiModelProperty(value = "Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`")
  @JsonProperty("customizable_cta_type")
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }

  @JsonProperty("customizable_cta_type")
  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  /**
   * Title displayed below ad.
   **/
  public AdPreviewShopping heroImageTitle(String heroImageTitle) {
    this.heroImageTitle = heroImageTitle;
    return this;
  }

  
  @ApiModelProperty(example = "My Preview Image", value = "Title displayed below ad.")
  @JsonProperty("hero_image_title")
  public String getHeroImageTitle() {
    return heroImageTitle;
  }

  @JsonProperty("hero_image_title")
  public void setHeroImageTitle(String heroImageTitle) {
    this.heroImageTitle = heroImageTitle;
  }

  /**
   * Hero image URL.
   **/
  public AdPreviewShopping heroImageUrl(String heroImageUrl) {
    this.heroImageUrl = heroImageUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://somewebsite.com/someimage.jpg", value = "Hero image URL.")
  @JsonProperty("hero_image_url")
  public String getHeroImageUrl() {
    return heroImageUrl;
  }

  @JsonProperty("hero_image_url")
  public void setHeroImageUrl(String heroImageUrl) {
    this.heroImageUrl = heroImageUrl;
  }

  /**
   * Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
   **/
  public AdPreviewShopping heroPinId(String heroPinId) {
    this.heroPinId = heroPinId;
    return this;
  }

  
  @ApiModelProperty(example = "987654321", value = "Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.")
  @JsonProperty("hero_pin_id")
   @Pattern(regexp="^\\d+$")public String getHeroPinId() {
    return heroPinId;
  }

  @JsonProperty("hero_pin_id")
  public void setHeroPinId(String heroPinId) {
    this.heroPinId = heroPinId;
  }

  /**
   * Multi image template tag.
   **/
  public AdPreviewShopping imageTag(String imageTag) {
    this.imageTag = imageTag;
    return this;
  }

  
  @ApiModelProperty(example = "Christmas Sale", value = "Multi image template tag.")
  @JsonProperty("image_tag")
  public String getImageTag() {
    return imageTag;
  }

  @JsonProperty("image_tag")
  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }

  /**
   * Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
   **/
  public AdPreviewShopping itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "111111111", value = "Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.")
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  @JsonProperty("item_id")
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Preferred media type.
   **/
  public AdPreviewShopping preferredMediaType(BasePreferredMediaType preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
    return this;
  }

  
  @ApiModelProperty(example = "IMAGE", value = "Preferred media type.")
  @JsonProperty("preferred_media_type")
  public BasePreferredMediaType getPreferredMediaType() {
    return preferredMediaType;
  }

  @JsonProperty("preferred_media_type")
  public void setPreferredMediaType(BasePreferredMediaType preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

  /**
   * Include promotion data in preview when available on catalog item. Defaults to false.
   **/
  public AdPreviewShopping showPromotion(Boolean showPromotion) {
    this.showPromotion = showPromotion;
    return this;
  }

  
  @ApiModelProperty(value = "Include promotion data in preview when available on catalog item. Defaults to false.")
  @JsonProperty("show_promotion")
  public Boolean getShowPromotion() {
    return showPromotion;
  }

  @JsonProperty("show_promotion")
  public void setShowPromotion(Boolean showPromotion) {
    this.showPromotion = showPromotion;
  }

  /**
   * Multi video template tag, image_tag and video_tag are mutual exclusive.
   **/
  public AdPreviewShopping videoTag(String videoTag) {
    this.videoTag = videoTag;
    return this;
  }

  
  @ApiModelProperty(example = "Black Friday Sale", value = "Multi video template tag, image_tag and video_tag are mutual exclusive.")
  @JsonProperty("video_tag")
  public String getVideoTag() {
    return videoTag;
  }

  @JsonProperty("video_tag")
  public void setVideoTag(String videoTag) {
    this.videoTag = videoTag;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
