package apimodels;

import apimodels.AdPreviewShopping;
import apimodels.AdPreviewSourceImage;
import apimodels.AdPreviewSourcePinId;
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
 * AdPreviewRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdPreviewRequest   {
  @JsonProperty("image_url")
  @NotNull

  private String imageUrl;

  @JsonProperty("promotion_id")
  @Pattern(regexp="^\\d+$")

  private String promotionId;

  @JsonProperty("title")
  @NotNull

  private String title;

  @JsonProperty("creative_type")
  @NotNull
@Valid

  private AdShoppingPreviewCreativeType creativeType;

  @JsonProperty("pin_id")
  @NotNull

  private String pinId;

  @JsonProperty("catalog_product_group_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String catalogProductGroupId;

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

  public AdPreviewRequest imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Image URL.
   * @return imageUrl
  **/
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public AdPreviewRequest promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

   /**
   * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
   * @return promotionId
  **/
  public String getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  public AdPreviewRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title displayed below ad.
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AdPreviewRequest creativeType(AdShoppingPreviewCreativeType creativeType) {
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

  public AdPreviewRequest pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

   /**
   * Pin ID.
   * @return pinId
  **/
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public AdPreviewRequest catalogProductGroupId(String catalogProductGroupId) {
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

  public AdPreviewRequest customizableCtaType(CustomizableCTAType customizableCtaType) {
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

  public AdPreviewRequest heroImageTitle(String heroImageTitle) {
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

  public AdPreviewRequest heroImageUrl(String heroImageUrl) {
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

  public AdPreviewRequest heroPinId(String heroPinId) {
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

  public AdPreviewRequest imageTag(String imageTag) {
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

  public AdPreviewRequest itemId(String itemId) {
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

  public AdPreviewRequest preferredMediaType(BasePreferredMediaType preferredMediaType) {
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

  public AdPreviewRequest showPromotion(Boolean showPromotion) {
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

  public AdPreviewRequest videoTag(String videoTag) {
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
    AdPreviewRequest adPreviewRequest = (AdPreviewRequest) o;
    return Objects.equals(imageUrl, adPreviewRequest.imageUrl) &&
        Objects.equals(promotionId, adPreviewRequest.promotionId) &&
        Objects.equals(title, adPreviewRequest.title) &&
        Objects.equals(creativeType, adPreviewRequest.creativeType) &&
        Objects.equals(pinId, adPreviewRequest.pinId) &&
        Objects.equals(catalogProductGroupId, adPreviewRequest.catalogProductGroupId) &&
        Objects.equals(customizableCtaType, adPreviewRequest.customizableCtaType) &&
        Objects.equals(heroImageTitle, adPreviewRequest.heroImageTitle) &&
        Objects.equals(heroImageUrl, adPreviewRequest.heroImageUrl) &&
        Objects.equals(heroPinId, adPreviewRequest.heroPinId) &&
        Objects.equals(imageTag, adPreviewRequest.imageTag) &&
        Objects.equals(itemId, adPreviewRequest.itemId) &&
        Objects.equals(preferredMediaType, adPreviewRequest.preferredMediaType) &&
        Objects.equals(showPromotion, adPreviewRequest.showPromotion) &&
        Objects.equals(videoTag, adPreviewRequest.videoTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, promotionId, title, creativeType, pinId, catalogProductGroupId, customizableCtaType, heroImageTitle, heroImageUrl, heroPinId, imageTag, itemId, preferredMediaType, showPromotion, videoTag);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

