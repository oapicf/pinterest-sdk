package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CustomizableCTAType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdPreviewShopping   {
  @JsonProperty("catalog_product_group_id")
  private String catalogProductGroupId;

  /**
   * Ad format of the shopping ad preview.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static CreativeTypeEnum fromValue(String text) {
      for (CreativeTypeEnum b : CreativeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("creative_type")
  private CreativeTypeEnum creativeType;

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

  /**
   * Preferred media type.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static PreferredMediaTypeEnum fromValue(String text) {
      for (PreferredMediaTypeEnum b : PreferredMediaTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("preferred_media_type")
  private PreferredMediaTypeEnum preferredMediaType;

  @JsonProperty("video_tag")
  private String videoTag;

  /**
   * Catalog Product Group Id.
   **/
  public AdPreviewShopping catalogProductGroupId(String catalogProductGroupId) {
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
   * Ad format of the shopping ad preview.
   **/
  public AdPreviewShopping creativeType(CreativeTypeEnum creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  
  @ApiModelProperty(example = "SHOPPING", required = true, value = "Ad format of the shopping ad preview.")
  @JsonProperty("creative_type")
  public CreativeTypeEnum getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeTypeEnum creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
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
  public String getHeroPinId() {
    return heroPinId;
  }
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
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Preferred media type.
   **/
  public AdPreviewShopping preferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
    return this;
  }

  
  @ApiModelProperty(example = "IMAGE", value = "Preferred media type.")
  @JsonProperty("preferred_media_type")
  public PreferredMediaTypeEnum getPreferredMediaType() {
    return preferredMediaType;
  }
  public void setPreferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
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
        Objects.equals(videoTag, adPreviewShopping.videoTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogProductGroupId, creativeType, customizableCtaType, heroImageTitle, heroImageUrl, heroPinId, imageTag, itemId, preferredMediaType, videoTag);
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

