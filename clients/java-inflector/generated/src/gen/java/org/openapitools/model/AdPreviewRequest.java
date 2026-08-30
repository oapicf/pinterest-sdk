package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdPreviewShopping;
import org.openapitools.model.AdPreviewSourceImage;
import org.openapitools.model.AdPreviewSourcePinId;
import org.openapitools.model.AdShoppingPreviewCreativeType;
import org.openapitools.model.BasePreferredMediaType;
import org.openapitools.model.CustomizableCTAType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdPreviewRequest   {
  @JsonProperty("image_url")
  private String imageUrl;

  @JsonProperty("promotion_id")
  private String promotionId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("creative_type")
  private AdShoppingPreviewCreativeType creativeType;

  @JsonProperty("pin_id")
  private String pinId;

  @JsonProperty("catalog_product_group_id")
  private String catalogProductGroupId;

  @JsonProperty("customizable_cta_type")
  private CustomizableCTAType customizableCtaType;

  @JsonProperty("hero_image_title")
  private String heroImageTitle;

  @JsonProperty("hero_image_url")
  private String heroImageUrl;

  @JsonProperty("hero_pin_id")
  private String heroPinId;

  @JsonProperty("image_tag")
  private String imageTag;

  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("preferred_media_type")
  private BasePreferredMediaType preferredMediaType;

  @JsonProperty("show_promotion")
  private Boolean showPromotion;

  @JsonProperty("video_tag")
  private String videoTag;

  /**
   * Image URL.
   **/
  public AdPreviewRequest imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://somewebsite.com/someimage.jpg", required = true, value = "Image URL.")
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
   **/
  public AdPreviewRequest promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

  
  @ApiModelProperty(example = "7834020404549", value = "Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.")
  @JsonProperty("promotion_id")
  public String getPromotionId() {
    return promotionId;
  }
  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  /**
   * Title displayed below ad.
   **/
  public AdPreviewRequest title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(example = "My Preview Image", required = true, value = "Title displayed below ad.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Ad format of the shopping ad preview.
   **/
  public AdPreviewRequest creativeType(AdShoppingPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  
  @ApiModelProperty(example = "SHOPPING", required = true, value = "Ad format of the shopping ad preview.")
  @JsonProperty("creative_type")
  public AdShoppingPreviewCreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(AdShoppingPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Pin ID.
   **/
  public AdPreviewRequest pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  
  @ApiModelProperty(example = "7389479023", required = true, value = "Pin ID.")
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }
  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  /**
   * Catalog Product Group Id.
   **/
  public AdPreviewRequest catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "123456789", required = true, value = "Catalog Product Group Id.")
  @JsonProperty("catalog_product_group_id")
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }
  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
   **/
  public AdPreviewRequest customizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

  
  @ApiModelProperty(value = "Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`")
  @JsonProperty("customizable_cta_type")
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }
  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  /**
   * Title displayed below ad.
   **/
  public AdPreviewRequest heroImageTitle(String heroImageTitle) {
    this.heroImageTitle = heroImageTitle;
    return this;
  }

  
  @ApiModelProperty(example = "My Preview Image", value = "Title displayed below ad.")
  @JsonProperty("hero_image_title")
  public String getHeroImageTitle() {
    return heroImageTitle;
  }
  public void setHeroImageTitle(String heroImageTitle) {
    this.heroImageTitle = heroImageTitle;
  }

  /**
   * Hero image URL.
   **/
  public AdPreviewRequest heroImageUrl(String heroImageUrl) {
    this.heroImageUrl = heroImageUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://somewebsite.com/someimage.jpg", value = "Hero image URL.")
  @JsonProperty("hero_image_url")
  public String getHeroImageUrl() {
    return heroImageUrl;
  }
  public void setHeroImageUrl(String heroImageUrl) {
    this.heroImageUrl = heroImageUrl;
  }

  /**
   * Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
   **/
  public AdPreviewRequest heroPinId(String heroPinId) {
    this.heroPinId = heroPinId;
    return this;
  }

  
  @ApiModelProperty(example = "987654321", value = "Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.")
  @JsonProperty("hero_pin_id")
  public String getHeroPinId() {
    return heroPinId;
  }
  public void setHeroPinId(String heroPinId) {
    this.heroPinId = heroPinId;
  }

  /**
   * Multi image template tag.
   **/
  public AdPreviewRequest imageTag(String imageTag) {
    this.imageTag = imageTag;
    return this;
  }

  
  @ApiModelProperty(example = "Christmas Sale", value = "Multi image template tag.")
  @JsonProperty("image_tag")
  public String getImageTag() {
    return imageTag;
  }
  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }

  /**
   * Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
   **/
  public AdPreviewRequest itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "111111111", value = "Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.")
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Preferred media type.
   **/
  public AdPreviewRequest preferredMediaType(BasePreferredMediaType preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
    return this;
  }

  
  @ApiModelProperty(example = "IMAGE", value = "Preferred media type.")
  @JsonProperty("preferred_media_type")
  public BasePreferredMediaType getPreferredMediaType() {
    return preferredMediaType;
  }
  public void setPreferredMediaType(BasePreferredMediaType preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

  /**
   * Include promotion data in preview when available on catalog item. Defaults to false.
   **/
  public AdPreviewRequest showPromotion(Boolean showPromotion) {
    this.showPromotion = showPromotion;
    return this;
  }

  
  @ApiModelProperty(value = "Include promotion data in preview when available on catalog item. Defaults to false.")
  @JsonProperty("show_promotion")
  public Boolean getShowPromotion() {
    return showPromotion;
  }
  public void setShowPromotion(Boolean showPromotion) {
    this.showPromotion = showPromotion;
  }

  /**
   * Multi video template tag, image_tag and video_tag are mutual exclusive.
   **/
  public AdPreviewRequest videoTag(String videoTag) {
    this.videoTag = videoTag;
    return this;
  }

  
  @ApiModelProperty(example = "Black Friday Sale", value = "Multi video template tag, image_tag and video_tag are mutual exclusive.")
  @JsonProperty("video_tag")
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

