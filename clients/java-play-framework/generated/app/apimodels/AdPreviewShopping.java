package apimodels;

import apimodels.AdShoppingPreviewCreativeType;
import apimodels.BasePreferredMediaType;
import apimodels.CustomizableCTAType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ad preview from a catalog product group (shopping).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdPreviewShopping   {
  @JsonProperty("catalog_product_group_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String catalogProductGroupId;

  @JsonProperty("creative_type")
  @NotNull
@Valid

  private AdShoppingPreviewCreativeType creativeType;

  @JsonProperty("customizable_cta_type")
  @Valid

  private CustomizableCTAType customizableCtaType;

  @JsonProperty("hero_image_title")
  
  private String heroImageTitle;

  @JsonProperty("hero_image_url")
  
  private String heroImageUrl;

  @JsonProperty("hero_pin_id")
  @Pattern(regexp="^\\d+$")

  private String heroPinId;

  @JsonProperty("image_tag")
  
  private String imageTag;

  @JsonProperty("item_id")
  
  private String itemId;

  @JsonProperty("preferred_media_type")
  @Valid

  private BasePreferredMediaType preferredMediaType;

  @JsonProperty("show_promotion")
  
  private Boolean showPromotion;

  @JsonProperty("video_tag")
  
  private String videoTag;

  public AdPreviewShopping catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
    return this;
  }

   /**
   * Catalog Product Group Id.
   * @return catalogProductGroupId
  **/
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }

  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  public AdPreviewShopping creativeType(AdShoppingPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Ad format of the shopping ad preview.
   * @return creativeType
  **/
  public AdShoppingPreviewCreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(AdShoppingPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public AdPreviewShopping customizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

   /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
   * @return customizableCtaType
  **/
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }

  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  public AdPreviewShopping heroImageTitle(String heroImageTitle) {
    this.heroImageTitle = heroImageTitle;
    return this;
  }

   /**
   * Title displayed below ad.
   * @return heroImageTitle
  **/
  public String getHeroImageTitle() {
    return heroImageTitle;
  }

  public void setHeroImageTitle(String heroImageTitle) {
    this.heroImageTitle = heroImageTitle;
  }

  public AdPreviewShopping heroImageUrl(String heroImageUrl) {
    this.heroImageUrl = heroImageUrl;
    return this;
  }

   /**
   * Hero image URL.
   * @return heroImageUrl
  **/
  public String getHeroImageUrl() {
    return heroImageUrl;
  }

  public void setHeroImageUrl(String heroImageUrl) {
    this.heroImageUrl = heroImageUrl;
  }

  public AdPreviewShopping heroPinId(String heroPinId) {
    this.heroPinId = heroPinId;
    return this;
  }

   /**
   * Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
   * @return heroPinId
  **/
  public String getHeroPinId() {
    return heroPinId;
  }

  public void setHeroPinId(String heroPinId) {
    this.heroPinId = heroPinId;
  }

  public AdPreviewShopping imageTag(String imageTag) {
    this.imageTag = imageTag;
    return this;
  }

   /**
   * Multi image template tag.
   * @return imageTag
  **/
  public String getImageTag() {
    return imageTag;
  }

  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }

  public AdPreviewShopping itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
   * @return itemId
  **/
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public AdPreviewShopping preferredMediaType(BasePreferredMediaType preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
    return this;
  }

   /**
   * Preferred media type.
   * @return preferredMediaType
  **/
  public BasePreferredMediaType getPreferredMediaType() {
    return preferredMediaType;
  }

  public void setPreferredMediaType(BasePreferredMediaType preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

  public AdPreviewShopping showPromotion(Boolean showPromotion) {
    this.showPromotion = showPromotion;
    return this;
  }

   /**
   * Include promotion data in preview when available on catalog item. Defaults to false.
   * @return showPromotion
  **/
  public Boolean getShowPromotion() {
    return showPromotion;
  }

  public void setShowPromotion(Boolean showPromotion) {
    this.showPromotion = showPromotion;
  }

  public AdPreviewShopping videoTag(String videoTag) {
    this.videoTag = videoTag;
    return this;
  }

   /**
   * Multi video template tag, image_tag and video_tag are mutual exclusive.
   * @return videoTag
  **/
  public String getVideoTag() {
    return videoTag;
  }

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
    return Objects.equals(catalogProductGroupId, adPreviewShopping.catalogProductGroupId) &&
        Objects.equals(creativeType, adPreviewShopping.creativeType) &&
        Objects.equals(customizableCtaType, adPreviewShopping.customizableCtaType) &&
        Objects.equals(heroImageTitle, adPreviewShopping.heroImageTitle) &&
        Objects.equals(heroImageUrl, adPreviewShopping.heroImageUrl) &&
        Objects.equals(heroPinId, adPreviewShopping.heroPinId) &&
        Objects.equals(imageTag, adPreviewShopping.imageTag) &&
        Objects.equals(itemId, adPreviewShopping.itemId) &&
        Objects.equals(preferredMediaType, adPreviewShopping.preferredMediaType) &&
        Objects.equals(showPromotion, adPreviewShopping.showPromotion) &&
        Objects.equals(videoTag, adPreviewShopping.videoTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogProductGroupId, creativeType, customizableCtaType, heroImageTitle, heroImageUrl, heroPinId, imageTag, itemId, preferredMediaType, showPromotion, videoTag);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

