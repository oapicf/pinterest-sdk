package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdPreviewShopping;
import org.openapitools.model.AdPreviewSourceImage;
import org.openapitools.model.AdPreviewSourcePinId;
import org.openapitools.model.AdShoppingPreviewCreativeType;
import org.openapitools.model.BasePreferredMediaType;
import org.openapitools.model.CustomizableCTAType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AdPreviewRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Image URL.
   */
  @JsonProperty("image_url")
  private String imageUrl;

  /**
   * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
   */
  @JsonProperty("promotion_id")
  private String promotionId;

  /**
   * Title displayed below ad.
   */
  @JsonProperty("title")
  private String title;

  /**
   * Ad format of the shopping ad preview.
   */
  @JsonProperty("creative_type")
  private AdShoppingPreviewCreativeType creativeType;

  /**
   * Pin ID.
   */
  @JsonProperty("pin_id")
  private String pinId;

  /**
   * Catalog Product Group Id.
   */
  @JsonProperty("catalog_product_group_id")
  private String catalogProductGroupId;

  /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60;
   */
  @JsonProperty("customizable_cta_type")
  private CustomizableCTAType customizableCtaType;

  /**
   * Title displayed below ad.
   */
  @JsonProperty("hero_image_title")
  private String heroImageTitle;

  /**
   * Hero image URL.
   */
  @JsonProperty("hero_image_url")
  private String heroImageUrl;

  /**
   * Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
   */
  @JsonProperty("hero_pin_id")
  private String heroPinId;

  /**
   * Multi image template tag.
   */
  @JsonProperty("image_tag")
  private String imageTag;

  /**
   * Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
   */
  @JsonProperty("item_id")
  private String itemId;

  /**
   * Preferred media type.
   */
  @JsonProperty("preferred_media_type")
  private BasePreferredMediaType preferredMediaType;

  /**
   * Include promotion data in preview when available on catalog item. Defaults to false.
   */
  @JsonProperty("show_promotion")
  private Boolean showPromotion;

  /**
   * Multi video template tag, image_tag and video_tag are mutual exclusive.
   */
  @JsonProperty("video_tag")
  private String videoTag;

  /**
   * Image URL.
   * @return imageUrl
   */
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
   * @return promotionId
   */
  public String getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  /**
   * Title displayed below ad.
   * @return title
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Ad format of the shopping ad preview.
   * @return creativeType
   */
  public AdShoppingPreviewCreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(AdShoppingPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Pin ID.
   * @return pinId
   */
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  /**
   * Catalog Product Group Id.
   * @return catalogProductGroupId
   */
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }

  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60;
   * @return customizableCtaType
   */
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }

  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  /**
   * Title displayed below ad.
   * @return heroImageTitle
   */
  public String getHeroImageTitle() {
    return heroImageTitle;
  }

  public void setHeroImageTitle(String heroImageTitle) {
    this.heroImageTitle = heroImageTitle;
  }

  /**
   * Hero image URL.
   * @return heroImageUrl
   */
  public String getHeroImageUrl() {
    return heroImageUrl;
  }

  public void setHeroImageUrl(String heroImageUrl) {
    this.heroImageUrl = heroImageUrl;
  }

  /**
   * Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
   * @return heroPinId
   */
  public String getHeroPinId() {
    return heroPinId;
  }

  public void setHeroPinId(String heroPinId) {
    this.heroPinId = heroPinId;
  }

  /**
   * Multi image template tag.
   * @return imageTag
   */
  public String getImageTag() {
    return imageTag;
  }

  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }

  /**
   * Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
   * @return itemId
   */
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Preferred media type.
   * @return preferredMediaType
   */
  public BasePreferredMediaType getPreferredMediaType() {
    return preferredMediaType;
  }

  public void setPreferredMediaType(BasePreferredMediaType preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

  /**
   * Include promotion data in preview when available on catalog item. Defaults to false.
   * @return showPromotion
   */
  public Boolean getShowPromotion() {
    return showPromotion;
  }

  public void setShowPromotion(Boolean showPromotion) {
    this.showPromotion = showPromotion;
  }

  /**
   * Multi video template tag, image_tag and video_tag are mutual exclusive.
   * @return videoTag
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
