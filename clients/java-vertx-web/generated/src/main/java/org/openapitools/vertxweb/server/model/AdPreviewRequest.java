package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AdPreviewCreateFromImage;
import org.openapitools.vertxweb.server.model.AdPreviewCreateFromPin;
import org.openapitools.vertxweb.server.model.AdPreviewShopping;
import org.openapitools.vertxweb.server.model.CustomizableCTAType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdPreviewRequest   {
  
  private String imageUrl;
  private String title;
  private String pinId;
  private String catalogProductGroupId;


  public enum CreativeTypeEnum {
    SHOPPING("SHOPPING"),
    CAROUSEL("CAROUSEL"),
    COLLECTION("COLLECTION"),
    REGULAR("REGULAR");

    private String value;

    CreativeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CreativeTypeEnum creativeType;
  private CustomizableCTAType customizableCtaType;
  private String heroImageTitle;
  private String heroImageUrl;
  private String heroPinId;
  private String imageTag;
  private String itemId;


  public enum PreferredMediaTypeEnum {
    VIDEO("VIDEO"),
    IMAGE("IMAGE");

    private String value;

    PreferredMediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PreferredMediaTypeEnum preferredMediaType;
  private String videoTag;

  public AdPreviewRequest () {

  }

  public AdPreviewRequest (String imageUrl, String title, String pinId, String catalogProductGroupId, CreativeTypeEnum creativeType, CustomizableCTAType customizableCtaType, String heroImageTitle, String heroImageUrl, String heroPinId, String imageTag, String itemId, PreferredMediaTypeEnum preferredMediaType, String videoTag) {
    this.imageUrl = imageUrl;
    this.title = title;
    this.pinId = pinId;
    this.catalogProductGroupId = catalogProductGroupId;
    this.creativeType = creativeType;
    this.customizableCtaType = customizableCtaType;
    this.heroImageTitle = heroImageTitle;
    this.heroImageUrl = heroImageUrl;
    this.heroPinId = heroPinId;
    this.imageTag = imageTag;
    this.itemId = itemId;
    this.preferredMediaType = preferredMediaType;
    this.videoTag = videoTag;
  }

    
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

    
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }
  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

    
  @JsonProperty("catalog_product_group_id")
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }
  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

    
  @JsonProperty("creative_type")
  public CreativeTypeEnum getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeTypeEnum creativeType) {
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
  public PreferredMediaTypeEnum getPreferredMediaType() {
    return preferredMediaType;
  }
  public void setPreferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
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
    AdPreviewRequest adPreviewRequest = (AdPreviewRequest) o;
    return Objects.equals(imageUrl, adPreviewRequest.imageUrl) &&
        Objects.equals(title, adPreviewRequest.title) &&
        Objects.equals(pinId, adPreviewRequest.pinId) &&
        Objects.equals(catalogProductGroupId, adPreviewRequest.catalogProductGroupId) &&
        Objects.equals(creativeType, adPreviewRequest.creativeType) &&
        Objects.equals(customizableCtaType, adPreviewRequest.customizableCtaType) &&
        Objects.equals(heroImageTitle, adPreviewRequest.heroImageTitle) &&
        Objects.equals(heroImageUrl, adPreviewRequest.heroImageUrl) &&
        Objects.equals(heroPinId, adPreviewRequest.heroPinId) &&
        Objects.equals(imageTag, adPreviewRequest.imageTag) &&
        Objects.equals(itemId, adPreviewRequest.itemId) &&
        Objects.equals(preferredMediaType, adPreviewRequest.preferredMediaType) &&
        Objects.equals(videoTag, adPreviewRequest.videoTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, title, pinId, catalogProductGroupId, creativeType, customizableCtaType, heroImageTitle, heroImageUrl, heroPinId, imageTag, itemId, preferredMediaType, videoTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPreviewRequest {\n");
    
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("    catalogProductGroupId: ").append(toIndentedString(catalogProductGroupId)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    customizableCtaType: ").append(toIndentedString(customizableCtaType)).append("\n");
    sb.append("    heroImageTitle: ").append(toIndentedString(heroImageTitle)).append("\n");
    sb.append("    heroImageUrl: ").append(toIndentedString(heroImageUrl)).append("\n");
    sb.append("    heroPinId: ").append(toIndentedString(heroPinId)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    preferredMediaType: ").append(toIndentedString(preferredMediaType)).append("\n");
    sb.append("    videoTag: ").append(toIndentedString(videoTag)).append("\n");
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
