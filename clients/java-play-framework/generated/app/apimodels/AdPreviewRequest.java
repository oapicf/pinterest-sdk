package apimodels;

import apimodels.AdPreviewCreateFromImage;
import apimodels.AdPreviewCreateFromPin;
import apimodels.AdPreviewShopping;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdPreviewRequest   {
  @JsonProperty("image_url")
  @NotNull

  private String imageUrl;

  @JsonProperty("title")
  @NotNull

  private String title;

  @JsonProperty("pin_id")
  @NotNull

  private String pinId;

  @JsonProperty("catalog_product_group_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String catalogProductGroupId;

  /**
   * Ad format of the shopping ad preview.
   */
  public enum CreativeTypeEnum {
    SHOPPING("SHOPPING"),
    
    CAROUSEL("CAROUSEL"),
    
    COLLECTION("COLLECTION"),
    
    REGULAR("REGULAR");

    private final String value;

    CreativeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CreativeTypeEnum fromValue(String value) {
      for (CreativeTypeEnum b : CreativeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("creative_type")
  @NotNull

  private CreativeTypeEnum creativeType;

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

  /**
   * Preferred media type.
   */
  public enum PreferredMediaTypeEnum {
    VIDEO("VIDEO"),
    
    IMAGE("IMAGE");

    private final String value;

    PreferredMediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PreferredMediaTypeEnum fromValue(String value) {
      for (PreferredMediaTypeEnum b : PreferredMediaTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

  public AdPreviewRequest creativeType(CreativeTypeEnum creativeType) {
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Ad format of the shopping ad preview.
   * @return creativeType
  **/
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

  public AdPreviewRequest preferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
    return this;
  }

   /**
   * Preferred media type.
   * @return preferredMediaType
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

