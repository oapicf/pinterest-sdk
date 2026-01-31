package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdPreviewCreateFromImage;
import org.openapitools.model.AdPreviewCreateFromPin;
import org.openapitools.model.AdPreviewShopping;
import org.openapitools.model.CustomizableCTAType;

/**
 * AdPreviewRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-31T04:52:33.064583645Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdPreviewRequest   {
  @JsonProperty("image_url")
  private String imageUrl;

  @JsonProperty("title")
  private String title;

  @JsonProperty("pin_id")
  private String pinId;

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

  public AdPreviewRequest imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Image URL.
   * @return imageUrl
  **/
  @ApiModelProperty(example = "https://somewebsite.com/someimage.jpg", required = true, value = "Image URL.")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public AdPreviewRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title displayed below ad.
   * @return title
  **/
  @ApiModelProperty(example = "My Preview Image", required = true, value = "Title displayed below ad.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AdPreviewRequest pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

   /**
   * Pin ID.
   * @return pinId
  **/
  @ApiModelProperty(example = "7389479023", required = true, value = "Pin ID.")
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
  @ApiModelProperty(example = "123456789", required = true, value = "Catalog Product Group Id.")
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }

  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  public AdPreviewRequest creativeType(CreativeTypeEnum creativeType) {
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Ad format of the shopping ad preview.
   * @return creativeType
  **/
  @ApiModelProperty(example = "SHOPPING", required = true, value = "Ad format of the shopping ad preview.")
  public CreativeTypeEnum getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeTypeEnum creativeType) {
    this.creativeType = creativeType;
  }

  public AdPreviewRequest customizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

   /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
   * @return customizableCtaType
  **/
  @ApiModelProperty(value = "Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`")
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
  @ApiModelProperty(example = "My Preview Image", value = "Title displayed below ad.")
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
  @ApiModelProperty(example = "https://somewebsite.com/someimage.jpg", value = "Hero image URL.")
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
  @ApiModelProperty(example = "987654321", value = "Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.")
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
  @ApiModelProperty(example = "Christmas Sale", value = "Multi image template tag.")
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
  @ApiModelProperty(example = "111111111", value = "Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public AdPreviewRequest preferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
    return this;
  }

   /**
   * Preferred media type.
   * @return preferredMediaType
  **/
  @ApiModelProperty(example = "IMAGE", value = "Preferred media type.")
  public PreferredMediaTypeEnum getPreferredMediaType() {
    return preferredMediaType;
  }

  public void setPreferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

  public AdPreviewRequest videoTag(String videoTag) {
    this.videoTag = videoTag;
    return this;
  }

   /**
   * Multi video template tag, image_tag and video_tag are mutual exclusive.
   * @return videoTag
  **/
  @ApiModelProperty(example = "Black Friday Sale", value = "Multi video template tag, image_tag and video_tag are mutual exclusive.")
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
        Objects.equals(this.title, adPreviewRequest.title) &&
        Objects.equals(this.pinId, adPreviewRequest.pinId) &&
        Objects.equals(this.catalogProductGroupId, adPreviewRequest.catalogProductGroupId) &&
        Objects.equals(this.creativeType, adPreviewRequest.creativeType) &&
        Objects.equals(this.customizableCtaType, adPreviewRequest.customizableCtaType) &&
        Objects.equals(this.heroImageTitle, adPreviewRequest.heroImageTitle) &&
        Objects.equals(this.heroImageUrl, adPreviewRequest.heroImageUrl) &&
        Objects.equals(this.heroPinId, adPreviewRequest.heroPinId) &&
        Objects.equals(this.imageTag, adPreviewRequest.imageTag) &&
        Objects.equals(this.itemId, adPreviewRequest.itemId) &&
        Objects.equals(this.preferredMediaType, adPreviewRequest.preferredMediaType) &&
        Objects.equals(this.videoTag, adPreviewRequest.videoTag);
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

