package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AdShoppingPreviewCreativeType;
import org.openapitools.vertxweb.server.model.BasePreferredMediaType;
import org.openapitools.vertxweb.server.model.CustomizableCTAType;

/**
 * Ad preview from a catalog product group (shopping).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public AdPreviewShopping () {

  }

  public AdPreviewShopping (String catalogProductGroupId, AdShoppingPreviewCreativeType creativeType, CustomizableCTAType customizableCtaType, String heroImageTitle, String heroImageUrl, String heroPinId, String imageTag, String itemId, BasePreferredMediaType preferredMediaType, Boolean showPromotion, String videoTag) {
    this.catalogProductGroupId = catalogProductGroupId;
    this.creativeType = creativeType;
    this.customizableCtaType = customizableCtaType;
    this.heroImageTitle = heroImageTitle;
    this.heroImageUrl = heroImageUrl;
    this.heroPinId = heroPinId;
    this.imageTag = imageTag;
    this.itemId = itemId;
    this.preferredMediaType = preferredMediaType;
    this.showPromotion = showPromotion;
    this.videoTag = videoTag;
  }

    
  @JsonProperty("catalog_product_group_id")
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }
  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

    
  @JsonProperty("creative_type")
  public AdShoppingPreviewCreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(AdShoppingPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
  }

    
  @JsonProperty("customizable_cta_type")
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }
  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

    
  @JsonProperty("hero_image_title")
  public String getHeroImageTitle() {
    return heroImageTitle;
  }
  public void setHeroImageTitle(String heroImageTitle) {
    this.heroImageTitle = heroImageTitle;
  }

    
  @JsonProperty("hero_image_url")
  public String getHeroImageUrl() {
    return heroImageUrl;
  }
  public void setHeroImageUrl(String heroImageUrl) {
    this.heroImageUrl = heroImageUrl;
  }

    
  @JsonProperty("hero_pin_id")
  public String getHeroPinId() {
    return heroPinId;
  }
  public void setHeroPinId(String heroPinId) {
    this.heroPinId = heroPinId;
  }

    
  @JsonProperty("image_tag")
  public String getImageTag() {
    return imageTag;
  }
  public void setImageTag(String imageTag) {
    this.imageTag = imageTag;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("preferred_media_type")
  public BasePreferredMediaType getPreferredMediaType() {
    return preferredMediaType;
  }
  public void setPreferredMediaType(BasePreferredMediaType preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

    
  @JsonProperty("show_promotion")
  public Boolean getShowPromotion() {
    return showPromotion;
  }
  public void setShowPromotion(Boolean showPromotion) {
    this.showPromotion = showPromotion;
  }

    
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
