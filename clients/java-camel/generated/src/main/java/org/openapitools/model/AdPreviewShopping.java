package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdShoppingPreviewCreativeType;
import org.openapitools.model.BasePreferredMediaType;
import org.openapitools.model.CustomizableCTAType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Ad preview from a catalog product group (shopping).
 */

@Schema(name = "AdPreviewShopping", description = "Ad preview from a catalog product group (shopping).")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdPreviewShopping implements AdPreviewRequest {

  private String catalogProductGroupId;

  private AdShoppingPreviewCreativeType creativeType;

  private JsonNullable<CustomizableCTAType> customizableCtaType = JsonNullable.<CustomizableCTAType>undefined();

  private String heroImageTitle;

  private String heroImageUrl;

  private String heroPinId;

  private String imageTag;

  private String itemId;

  private BasePreferredMediaType preferredMediaType;

  private Boolean showPromotion;

  private String videoTag;

  public AdPreviewShopping() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdPreviewShopping(String catalogProductGroupId, AdShoppingPreviewCreativeType creativeType) {
    this.catalogProductGroupId = catalogProductGroupId;
    this.creativeType = creativeType;
  }

  public AdPreviewShopping catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
    return this;
  }

  /**
   * Catalog Product Group Id.
   * @return catalogProductGroupId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_product_group_id", example = "123456789", description = "Catalog Product Group Id.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_product_group_id")
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
   */
  @NotNull @Valid 
  @Schema(name = "creative_type", example = "SHOPPING", description = "Ad format of the shopping ad preview.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creative_type")
  public AdShoppingPreviewCreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(AdShoppingPreviewCreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public AdPreviewShopping customizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = JsonNullable.of(customizableCtaType);
    return this;
  }

  /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
   * @return customizableCtaType
   */
  @Valid 
  @Schema(name = "customizable_cta_type", description = "Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customizable_cta_type")
  public JsonNullable<CustomizableCTAType> getCustomizableCtaType() {
    return customizableCtaType;
  }

  public void setCustomizableCtaType(JsonNullable<CustomizableCTAType> customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  public AdPreviewShopping heroImageTitle(String heroImageTitle) {
    this.heroImageTitle = heroImageTitle;
    return this;
  }

  /**
   * Title displayed below ad.
   * @return heroImageTitle
   */
  
  @Schema(name = "hero_image_title", example = "My Preview Image", description = "Title displayed below ad.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hero_image_title")
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
   */
  
  @Schema(name = "hero_image_url", example = "https://somewebsite.com/someimage.jpg", description = "Hero image URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hero_image_url")
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
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "hero_pin_id", example = "987654321", description = "Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hero_pin_id")
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
   */
  
  @Schema(name = "image_tag", example = "Christmas Sale", description = "Multi image template tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_tag")
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
   */
  
  @Schema(name = "item_id", example = "111111111", description = "Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_id")
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
   */
  @Valid 
  @Schema(name = "preferred_media_type", example = "IMAGE", description = "Preferred media type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferred_media_type")
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
   */
  
  @Schema(name = "show_promotion", description = "Include promotion data in preview when available on catalog item. Defaults to false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("show_promotion")
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
   */
  
  @Schema(name = "video_tag", example = "Black Friday Sale", description = "Multi video template tag, image_tag and video_tag are mutual exclusive.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.catalogProductGroupId, adPreviewShopping.catalogProductGroupId) &&
        Objects.equals(this.creativeType, adPreviewShopping.creativeType) &&
        equalsNullable(this.customizableCtaType, adPreviewShopping.customizableCtaType) &&
        Objects.equals(this.heroImageTitle, adPreviewShopping.heroImageTitle) &&
        Objects.equals(this.heroImageUrl, adPreviewShopping.heroImageUrl) &&
        Objects.equals(this.heroPinId, adPreviewShopping.heroPinId) &&
        Objects.equals(this.imageTag, adPreviewShopping.imageTag) &&
        Objects.equals(this.itemId, adPreviewShopping.itemId) &&
        Objects.equals(this.preferredMediaType, adPreviewShopping.preferredMediaType) &&
        Objects.equals(this.showPromotion, adPreviewShopping.showPromotion) &&
        Objects.equals(this.videoTag, adPreviewShopping.videoTag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogProductGroupId, creativeType, hashCodeNullable(customizableCtaType), heroImageTitle, heroImageUrl, heroPinId, imageTag, itemId, preferredMediaType, showPromotion, videoTag);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

