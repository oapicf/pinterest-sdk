package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CollectionsHeaderType;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import org.openapitools.model.PreferredMediaType;
import org.openapitools.model.ProductGroupPromotionCustomizableCTAType;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ProductGroupPromotion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductGroupPromotion {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String adGroupId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer bidInMicroCurrency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String catalogProductGroupId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String catalogProductGroupName;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<CollectionsHeaderType> collectionsHeaderType = JsonNullable.<CollectionsHeaderType>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> collectionsHeroDestinationUrl = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<@Pattern(regexp = "^\\d+$") String> collectionsHeroPinId = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CreativeType creativeType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ProductGroupPromotionCustomizableCTAType customizableCtaType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String definition;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<GridClickType> gridClickType = JsonNullable.<GridClickType>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean included;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isGenerateBackground = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isImageAutoResizing = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isMdl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String parentId;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<PreferredMediaType> preferredMediaType = JsonNullable.<PreferredMediaType>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String relativeDefinition;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> selectedImageTag = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> selectedVideoTag = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> slideshowCollectionsDescription = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> slideshowCollectionsTitle = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable EntityStatus status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String trackingUrl;

  public ProductGroupPromotion adGroupId(@Nullable String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * ID of the ad group the product group belongs to.
   * @return adGroupId
   */
  @Pattern(regexp = "^(AG)?\\d+$") 
  @Schema(name = "ad_group_id", example = "2680059592705", description = "ID of the ad group the product group belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_group_id")
  public @Nullable String getAdGroupId() {
    return adGroupId;
  }

  @JsonProperty("ad_group_id")
  public void setAdGroupId(@Nullable String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ProductGroupPromotion bidInMicroCurrency(@Nullable Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

  /**
   * The bid in micro currency.
   * @return bidInMicroCurrency
   */
  
  @Schema(name = "bid_in_micro_currency", example = "14000000", description = "The bid in micro currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_in_micro_currency")
  public @Nullable Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  @JsonProperty("bid_in_micro_currency")
  public void setBidInMicroCurrency(@Nullable Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public ProductGroupPromotion catalogProductGroupId(@Nullable String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
    return this;
  }

  /**
   * ID of the catalogs product group that this product group promotion references (required for create operations)
   * @return catalogProductGroupId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_product_group_id", example = "1231235", description = "ID of the catalogs product group that this product group promotion references (required for create operations)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_product_group_id")
  public @Nullable String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }

  @JsonProperty("catalog_product_group_id")
  public void setCatalogProductGroupId(@Nullable String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  public ProductGroupPromotion catalogProductGroupName(@Nullable String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
    return this;
  }

  /**
   * Catalogs product group name
   * @return catalogProductGroupName
   */
  
  @Schema(name = "catalog_product_group_name", example = "catalogProductGroupName", description = "Catalogs product group name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_product_group_name")
  public @Nullable String getCatalogProductGroupName() {
    return catalogProductGroupName;
  }

  @JsonProperty("catalog_product_group_name")
  public void setCatalogProductGroupName(@Nullable String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
  }

  public ProductGroupPromotion collectionsHeaderType(CollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = JsonNullable.of(collectionsHeaderType);
    return this;
  }

  /**
   * Get collectionsHeaderType
   * @return collectionsHeaderType
   */
  @Valid 
  @Schema(name = "collections_header_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collections_header_type")
  public JsonNullable<CollectionsHeaderType> getCollectionsHeaderType() {
    return collectionsHeaderType;
  }

  public void setCollectionsHeaderType(JsonNullable<CollectionsHeaderType> collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

  public ProductGroupPromotion collectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = JsonNullable.of(collectionsHeroDestinationUrl);
    return this;
  }

  /**
   * Collections Hero Destination Url
   * @return collectionsHeroDestinationUrl
   */
  
  @Schema(name = "collections_hero_destination_url", example = "http://www.pinterest.com", description = "Collections Hero Destination Url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collections_hero_destination_url")
  public JsonNullable<String> getCollectionsHeroDestinationUrl() {
    return collectionsHeroDestinationUrl;
  }

  public void setCollectionsHeroDestinationUrl(JsonNullable<String> collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
  }

  public ProductGroupPromotion collectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = JsonNullable.of(collectionsHeroPinId);
    return this;
  }

  /**
   * Hero Pin ID if this PG is promoted as a Collection
   * @return collectionsHeroPinId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "collections_hero_pin_id", example = "123123", description = "Hero Pin ID if this PG is promoted as a Collection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collections_hero_pin_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getCollectionsHeroPinId() {
    return collectionsHeroPinId;
  }

  public void setCollectionsHeroPinId(JsonNullable<String> collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
  }

  public ProductGroupPromotion creativeType(@Nullable CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  /**
   * Get creativeType
   * @return creativeType
   */
  @Valid 
  @Schema(name = "creative_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creative_type")
  public @Nullable CreativeType getCreativeType() {
    return creativeType;
  }

  @JsonProperty("creative_type")
  public void setCreativeType(@Nullable CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public ProductGroupPromotion customizableCtaType(@Nullable ProductGroupPromotionCustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

  /**
   * Get customizableCtaType
   * @return customizableCtaType
   */
  @Valid 
  @Schema(name = "customizable_cta_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customizable_cta_type")
  public @Nullable ProductGroupPromotionCustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }

  @JsonProperty("customizable_cta_type")
  public void setCustomizableCtaType(@Nullable ProductGroupPromotionCustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  public ProductGroupPromotion definition(@Nullable String definition) {
    this.definition = definition;
    return this;
  }

  /**
   * The full product group definition path
   * @return definition
   */
  
  @Schema(name = "definition", example = "*_/product_type_0='kitchen'/product_type_1='beverage appliances'", description = "The full product group definition path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("definition")
  public @Nullable String getDefinition() {
    return definition;
  }

  @JsonProperty("definition")
  public void setDefinition(@Nullable String definition) {
    this.definition = definition;
  }

  public ProductGroupPromotion gridClickType(GridClickType gridClickType) {
    this.gridClickType = JsonNullable.of(gridClickType);
    return this;
  }

  /**
   * Get gridClickType
   * @return gridClickType
   */
  @Valid 
  @Schema(name = "grid_click_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("grid_click_type")
  public JsonNullable<GridClickType> getGridClickType() {
    return gridClickType;
  }

  public void setGridClickType(JsonNullable<GridClickType> gridClickType) {
    this.gridClickType = gridClickType;
  }

  public ProductGroupPromotion id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the product group promotion (required for update operations).
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "2680059592705", description = "ID of the product group promotion (required for update operations).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public ProductGroupPromotion included(@Nullable Boolean included) {
    this.included = included;
    return this;
  }

  /**
   * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
   * @return included
   */
  
  @Schema(name = "included", example = "true", description = "True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("included")
  public @Nullable Boolean getIncluded() {
    return included;
  }

  @JsonProperty("included")
  public void setIncluded(@Nullable Boolean included) {
    this.included = included;
  }

  public ProductGroupPromotion isGenerateBackground(Boolean isGenerateBackground) {
    this.isGenerateBackground = JsonNullable.of(isGenerateBackground);
    return this;
  }

  /**
   * Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
   * @return isGenerateBackground
   */
  
  @Schema(name = "is_generate_background", example = "true", description = "Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_generate_background")
  public JsonNullable<Boolean> getIsGenerateBackground() {
    return isGenerateBackground;
  }

  public void setIsGenerateBackground(JsonNullable<Boolean> isGenerateBackground) {
    this.isGenerateBackground = isGenerateBackground;
  }

  public ProductGroupPromotion isImageAutoResizing(Boolean isImageAutoResizing) {
    this.isImageAutoResizing = JsonNullable.of(isImageAutoResizing);
    return this;
  }

  /**
   * Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.
   * @return isImageAutoResizing
   */
  
  @Schema(name = "is_image_auto_resizing", example = "true", description = "Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_image_auto_resizing")
  public JsonNullable<Boolean> getIsImageAutoResizing() {
    return isImageAutoResizing;
  }

  public void setIsImageAutoResizing(JsonNullable<Boolean> isImageAutoResizing) {
    this.isImageAutoResizing = isImageAutoResizing;
  }

  public ProductGroupPromotion isMdl(@Nullable Boolean isMdl) {
    this.isMdl = isMdl;
    return this;
  }

  /**
   * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
   * @return isMdl
   */
  
  @Schema(name = "is_mdl", example = "true", description = "If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_mdl")
  public @Nullable Boolean getIsMdl() {
    return isMdl;
  }

  @JsonProperty("is_mdl")
  public void setIsMdl(@Nullable Boolean isMdl) {
    this.isMdl = isMdl;
  }

  public ProductGroupPromotion parentId(@Nullable String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * The parent Product Group ID of this Product Group
   * @return parentId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "parent_id", example = "1231234", description = "The parent Product Group ID of this Product Group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_id")
  public @Nullable String getParentId() {
    return parentId;
  }

  @JsonProperty("parent_id")
  public void setParentId(@Nullable String parentId) {
    this.parentId = parentId;
  }

  public ProductGroupPromotion preferredMediaType(PreferredMediaType preferredMediaType) {
    this.preferredMediaType = JsonNullable.of(preferredMediaType);
    return this;
  }

  /**
   * Get preferredMediaType
   * @return preferredMediaType
   */
  @Valid 
  @Schema(name = "preferred_media_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferred_media_type")
  public JsonNullable<PreferredMediaType> getPreferredMediaType() {
    return preferredMediaType;
  }

  public void setPreferredMediaType(JsonNullable<PreferredMediaType> preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

  public ProductGroupPromotion relativeDefinition(@Nullable String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
    return this;
  }

  /**
   * The definition of the product group, relative to its parent - an attribute name/value pair
   * @return relativeDefinition
   */
  
  @Schema(name = "relative_definition", example = "product_type_1='beverage appliances'", description = "The definition of the product group, relative to its parent - an attribute name/value pair", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relative_definition")
  public @Nullable String getRelativeDefinition() {
    return relativeDefinition;
  }

  @JsonProperty("relative_definition")
  public void setRelativeDefinition(@Nullable String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
  }

  public ProductGroupPromotion selectedImageTag(String selectedImageTag) {
    this.selectedImageTag = JsonNullable.of(selectedImageTag);
    return this;
  }

  /**
   * The ad image tag selected for the product group promotion.
   * @return selectedImageTag
   */
  
  @Schema(name = "selected_image_tag", example = "holiday_sale", description = "The ad image tag selected for the product group promotion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selected_image_tag")
  public JsonNullable<String> getSelectedImageTag() {
    return selectedImageTag;
  }

  public void setSelectedImageTag(JsonNullable<String> selectedImageTag) {
    this.selectedImageTag = selectedImageTag;
  }

  public ProductGroupPromotion selectedVideoTag(String selectedVideoTag) {
    this.selectedVideoTag = JsonNullable.of(selectedVideoTag);
    return this;
  }

  /**
   * The ad video tag selected for the product group promotion.
   * @return selectedVideoTag
   */
  
  @Schema(name = "selected_video_tag", example = "holiday_sale", description = "The ad video tag selected for the product group promotion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selected_video_tag")
  public JsonNullable<String> getSelectedVideoTag() {
    return selectedVideoTag;
  }

  public void setSelectedVideoTag(JsonNullable<String> selectedVideoTag) {
    this.selectedVideoTag = selectedVideoTag;
  }

  public ProductGroupPromotion slideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = JsonNullable.of(slideshowCollectionsDescription);
    return this;
  }

  /**
   * Slideshow Collections Description
   * @return slideshowCollectionsDescription
   */
  
  @Schema(name = "slideshow_collections_description", example = "slideshow description", description = "Slideshow Collections Description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slideshow_collections_description")
  public JsonNullable<String> getSlideshowCollectionsDescription() {
    return slideshowCollectionsDescription;
  }

  public void setSlideshowCollectionsDescription(JsonNullable<String> slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
  }

  public ProductGroupPromotion slideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = JsonNullable.of(slideshowCollectionsTitle);
    return this;
  }

  /**
   * Slideshow Collections Title
   * @return slideshowCollectionsTitle
   */
  
  @Schema(name = "slideshow_collections_title", example = "slideshow title", description = "Slideshow Collections Title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slideshow_collections_title")
  public JsonNullable<String> getSlideshowCollectionsTitle() {
    return slideshowCollectionsTitle;
  }

  public void setSlideshowCollectionsTitle(JsonNullable<String> slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
  }

  public ProductGroupPromotion status(@Nullable EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable EntityStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable EntityStatus status) {
    this.status = status;
  }

  public ProductGroupPromotion trackingUrl(@Nullable String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  /**
   * Tracking template for proudct group promotions. 4000 limit
   * @return trackingUrl
   */
  
  @Schema(name = "tracking_url", example = "https://www.pinterest.com", description = "Tracking template for proudct group promotions. 4000 limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracking_url")
  public @Nullable String getTrackingUrl() {
    return trackingUrl;
  }

  @JsonProperty("tracking_url")
  public void setTrackingUrl(@Nullable String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductGroupPromotion productGroupPromotion = (ProductGroupPromotion) o;
    return Objects.equals(this.adGroupId, productGroupPromotion.adGroupId) &&
        Objects.equals(this.bidInMicroCurrency, productGroupPromotion.bidInMicroCurrency) &&
        Objects.equals(this.catalogProductGroupId, productGroupPromotion.catalogProductGroupId) &&
        Objects.equals(this.catalogProductGroupName, productGroupPromotion.catalogProductGroupName) &&
        equalsNullable(this.collectionsHeaderType, productGroupPromotion.collectionsHeaderType) &&
        equalsNullable(this.collectionsHeroDestinationUrl, productGroupPromotion.collectionsHeroDestinationUrl) &&
        equalsNullable(this.collectionsHeroPinId, productGroupPromotion.collectionsHeroPinId) &&
        Objects.equals(this.creativeType, productGroupPromotion.creativeType) &&
        Objects.equals(this.customizableCtaType, productGroupPromotion.customizableCtaType) &&
        Objects.equals(this.definition, productGroupPromotion.definition) &&
        equalsNullable(this.gridClickType, productGroupPromotion.gridClickType) &&
        Objects.equals(this.id, productGroupPromotion.id) &&
        Objects.equals(this.included, productGroupPromotion.included) &&
        equalsNullable(this.isGenerateBackground, productGroupPromotion.isGenerateBackground) &&
        equalsNullable(this.isImageAutoResizing, productGroupPromotion.isImageAutoResizing) &&
        Objects.equals(this.isMdl, productGroupPromotion.isMdl) &&
        Objects.equals(this.parentId, productGroupPromotion.parentId) &&
        equalsNullable(this.preferredMediaType, productGroupPromotion.preferredMediaType) &&
        Objects.equals(this.relativeDefinition, productGroupPromotion.relativeDefinition) &&
        equalsNullable(this.selectedImageTag, productGroupPromotion.selectedImageTag) &&
        equalsNullable(this.selectedVideoTag, productGroupPromotion.selectedVideoTag) &&
        equalsNullable(this.slideshowCollectionsDescription, productGroupPromotion.slideshowCollectionsDescription) &&
        equalsNullable(this.slideshowCollectionsTitle, productGroupPromotion.slideshowCollectionsTitle) &&
        Objects.equals(this.status, productGroupPromotion.status) &&
        Objects.equals(this.trackingUrl, productGroupPromotion.trackingUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, bidInMicroCurrency, catalogProductGroupId, catalogProductGroupName, hashCodeNullable(collectionsHeaderType), hashCodeNullable(collectionsHeroDestinationUrl), hashCodeNullable(collectionsHeroPinId), creativeType, customizableCtaType, definition, hashCodeNullable(gridClickType), id, included, hashCodeNullable(isGenerateBackground), hashCodeNullable(isImageAutoResizing), isMdl, parentId, hashCodeNullable(preferredMediaType), relativeDefinition, hashCodeNullable(selectedImageTag), hashCodeNullable(selectedVideoTag), hashCodeNullable(slideshowCollectionsDescription), hashCodeNullable(slideshowCollectionsTitle), status, trackingUrl);
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
    sb.append("class ProductGroupPromotion {\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
    sb.append("    catalogProductGroupId: ").append(toIndentedString(catalogProductGroupId)).append("\n");
    sb.append("    catalogProductGroupName: ").append(toIndentedString(catalogProductGroupName)).append("\n");
    sb.append("    collectionsHeaderType: ").append(toIndentedString(collectionsHeaderType)).append("\n");
    sb.append("    collectionsHeroDestinationUrl: ").append(toIndentedString(collectionsHeroDestinationUrl)).append("\n");
    sb.append("    collectionsHeroPinId: ").append(toIndentedString(collectionsHeroPinId)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    customizableCtaType: ").append(toIndentedString(customizableCtaType)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    gridClickType: ").append(toIndentedString(gridClickType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    isGenerateBackground: ").append(toIndentedString(isGenerateBackground)).append("\n");
    sb.append("    isImageAutoResizing: ").append(toIndentedString(isImageAutoResizing)).append("\n");
    sb.append("    isMdl: ").append(toIndentedString(isMdl)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    preferredMediaType: ").append(toIndentedString(preferredMediaType)).append("\n");
    sb.append("    relativeDefinition: ").append(toIndentedString(relativeDefinition)).append("\n");
    sb.append("    selectedImageTag: ").append(toIndentedString(selectedImageTag)).append("\n");
    sb.append("    selectedVideoTag: ").append(toIndentedString(selectedVideoTag)).append("\n");
    sb.append("    slideshowCollectionsDescription: ").append(toIndentedString(slideshowCollectionsDescription)).append("\n");
    sb.append("    slideshowCollectionsTitle: ").append(toIndentedString(slideshowCollectionsTitle)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

