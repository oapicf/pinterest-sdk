package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProductGroupPromotion
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProductGroupPromotion {

  private @Nullable String adGroupId;

  private JsonNullable<Integer> bidInMicroCurrency = JsonNullable.<Integer>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> catalogProductGroupId = JsonNullable.<String>undefined();

  private JsonNullable<String> catalogProductGroupName = JsonNullable.<String>undefined();

  /**
   * Collections ad header type
   */
  public enum CollectionsHeaderTypeEnum {
    SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
    
    EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
    
    NO_HEADER("NO_HEADER"),
    
    ON_SALE("ON_SALE"),
    
    GET_DEAL("GET_DEAL");

    private final String value;

    CollectionsHeaderTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CollectionsHeaderTypeEnum fromValue(String value) {
      for (CollectionsHeaderTypeEnum b : CollectionsHeaderTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private JsonNullable<CollectionsHeaderTypeEnum> collectionsHeaderType = JsonNullable.<CollectionsHeaderTypeEnum>undefined();

  private JsonNullable<String> collectionsHeroDestinationUrl = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> collectionsHeroPinId = JsonNullable.<String>undefined();

  private @Nullable CreativeType creativeType;

  /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
   */
  public enum CustomizableCtaTypeEnum {
    SHOP_NOW("SHOP_NOW"),
    
    BOOK_NOW("BOOK_NOW"),
    
    ON_SALE("ON_SALE"),
    
    GET_DEAL("GET_DEAL"),
    
    BUY_ONLINE_PICKUP_IN_STORE("BUY_ONLINE_PICKUP_IN_STORE");

    private final String value;

    CustomizableCtaTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomizableCtaTypeEnum fromValue(String value) {
      for (CustomizableCtaTypeEnum b : CustomizableCtaTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private JsonNullable<CustomizableCtaTypeEnum> customizableCtaType = JsonNullable.<CustomizableCtaTypeEnum>undefined();

  private JsonNullable<String> definition = JsonNullable.<String>undefined();

  private JsonNullable<GridClickType> gridClickType = JsonNullable.<GridClickType>undefined();

  private @Nullable String id;

  private JsonNullable<Boolean> included = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isGenerateBackground = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isMdl = JsonNullable.<Boolean>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> parentId = JsonNullable.<String>undefined();

  /**
   * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
   */
  public enum PreferredMediaTypeEnum {
    VIDEO("VIDEO"),
    
    IMAGE("IMAGE");

    private final String value;

    PreferredMediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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
      return null;
    }
  }

  private JsonNullable<PreferredMediaTypeEnum> preferredMediaType = JsonNullable.<PreferredMediaTypeEnum>undefined();

  private JsonNullable<String> relativeDefinition = JsonNullable.<String>undefined();

  private JsonNullable<String> selectedImageTag = JsonNullable.<String>undefined();

  private JsonNullable<String> selectedVideoTag = JsonNullable.<String>undefined();

  private JsonNullable<String> slideshowCollectionsDescription = JsonNullable.<String>undefined();

  private JsonNullable<String> slideshowCollectionsTitle = JsonNullable.<String>undefined();

  private @Nullable EntityStatus status;

  private JsonNullable<String> trackingUrl = JsonNullable.<String>undefined();

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

  public void setAdGroupId(@Nullable String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ProductGroupPromotion bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = JsonNullable.of(bidInMicroCurrency);
    return this;
  }

  /**
   * The bid in micro currency.
   * @return bidInMicroCurrency
   */
  
  @Schema(name = "bid_in_micro_currency", example = "14000000", description = "The bid in micro currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_in_micro_currency")
  public JsonNullable<Integer> getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(JsonNullable<Integer> bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public ProductGroupPromotion catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = JsonNullable.of(catalogProductGroupId);
    return this;
  }

  /**
   * ID of the catalogs product group that this product group promotion references
   * @return catalogProductGroupId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "catalog_product_group_id", example = "1231235", description = "ID of the catalogs product group that this product group promotion references", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_product_group_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getCatalogProductGroupId() {
    return catalogProductGroupId;
  }

  public void setCatalogProductGroupId(JsonNullable<String> catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  public ProductGroupPromotion catalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = JsonNullable.of(catalogProductGroupName);
    return this;
  }

  /**
   * Catalogs product group name
   * @return catalogProductGroupName
   */
  
  @Schema(name = "catalog_product_group_name", example = "catalogProductGroupName", description = "Catalogs product group name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catalog_product_group_name")
  public JsonNullable<String> getCatalogProductGroupName() {
    return catalogProductGroupName;
  }

  public void setCatalogProductGroupName(JsonNullable<String> catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
  }

  public ProductGroupPromotion collectionsHeaderType(CollectionsHeaderTypeEnum collectionsHeaderType) {
    this.collectionsHeaderType = JsonNullable.of(collectionsHeaderType);
    return this;
  }

  /**
   * Collections ad header type
   * @return collectionsHeaderType
   */
  
  @Schema(name = "collections_header_type", example = "SHOP_THIS_COLLECTION", description = "Collections ad header type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collections_header_type")
  public JsonNullable<CollectionsHeaderTypeEnum> getCollectionsHeaderType() {
    return collectionsHeaderType;
  }

  public void setCollectionsHeaderType(JsonNullable<CollectionsHeaderTypeEnum> collectionsHeaderType) {
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

  public void setCreativeType(@Nullable CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public ProductGroupPromotion customizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = JsonNullable.of(customizableCtaType);
    return this;
  }

  /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
   * @return customizableCtaType
   */
  
  @Schema(name = "customizable_cta_type", example = "SHOP_NOW", description = "Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customizable_cta_type")
  public JsonNullable<CustomizableCtaTypeEnum> getCustomizableCtaType() {
    return customizableCtaType;
  }

  public void setCustomizableCtaType(JsonNullable<CustomizableCtaTypeEnum> customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  public ProductGroupPromotion definition(String definition) {
    this.definition = JsonNullable.of(definition);
    return this;
  }

  /**
   * The full product group definition path
   * @return definition
   */
  
  @Schema(name = "definition", example = "*_/product_type_0='kitchen'/product_type_1='beverage appliances'", description = "The full product group definition path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("definition")
  public JsonNullable<String> getDefinition() {
    return definition;
  }

  public void setDefinition(JsonNullable<String> definition) {
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
   * ID of the product group promotion.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "2680059592705", description = "ID of the product group promotion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public ProductGroupPromotion included(Boolean included) {
    this.included = JsonNullable.of(included);
    return this;
  }

  /**
   * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
   * @return included
   */
  
  @Schema(name = "included", example = "true", description = "True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("included")
  public JsonNullable<Boolean> getIncluded() {
    return included;
  }

  public void setIncluded(JsonNullable<Boolean> included) {
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

  public ProductGroupPromotion isMdl(Boolean isMdl) {
    this.isMdl = JsonNullable.of(isMdl);
    return this;
  }

  /**
   * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
   * @return isMdl
   */
  
  @Schema(name = "is_mdl", example = "true", description = "If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_mdl")
  public JsonNullable<Boolean> getIsMdl() {
    return isMdl;
  }

  public void setIsMdl(JsonNullable<Boolean> isMdl) {
    this.isMdl = isMdl;
  }

  public ProductGroupPromotion parentId(String parentId) {
    this.parentId = JsonNullable.of(parentId);
    return this;
  }

  /**
   * The parent Product Group ID of this Product Group
   * @return parentId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "parent_id", example = "1231234", description = "The parent Product Group ID of this Product Group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getParentId() {
    return parentId;
  }

  public void setParentId(JsonNullable<String> parentId) {
    this.parentId = parentId;
  }

  public ProductGroupPromotion preferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = JsonNullable.of(preferredMediaType);
    return this;
  }

  /**
   * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
   * @return preferredMediaType
   */
  
  @Schema(name = "preferred_media_type", example = "VIDEO", description = "Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferred_media_type")
  public JsonNullable<PreferredMediaTypeEnum> getPreferredMediaType() {
    return preferredMediaType;
  }

  public void setPreferredMediaType(JsonNullable<PreferredMediaTypeEnum> preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

  public ProductGroupPromotion relativeDefinition(String relativeDefinition) {
    this.relativeDefinition = JsonNullable.of(relativeDefinition);
    return this;
  }

  /**
   * The definition of the product group, relative to its parent - an attribute name/value pair
   * @return relativeDefinition
   */
  
  @Schema(name = "relative_definition", example = "product_type_1='beverage appliances'", description = "The definition of the product group, relative to its parent - an attribute name/value pair", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("relative_definition")
  public JsonNullable<String> getRelativeDefinition() {
    return relativeDefinition;
  }

  public void setRelativeDefinition(JsonNullable<String> relativeDefinition) {
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

  public void setStatus(@Nullable EntityStatus status) {
    this.status = status;
  }

  public ProductGroupPromotion trackingUrl(String trackingUrl) {
    this.trackingUrl = JsonNullable.of(trackingUrl);
    return this;
  }

  /**
   * Tracking template for proudct group promotions. 4000 limit
   * @return trackingUrl
   */
  
  @Schema(name = "tracking_url", example = "https://www.pinterest.com", description = "Tracking template for proudct group promotions. 4000 limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracking_url")
  public JsonNullable<String> getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(JsonNullable<String> trackingUrl) {
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
        equalsNullable(this.bidInMicroCurrency, productGroupPromotion.bidInMicroCurrency) &&
        equalsNullable(this.catalogProductGroupId, productGroupPromotion.catalogProductGroupId) &&
        equalsNullable(this.catalogProductGroupName, productGroupPromotion.catalogProductGroupName) &&
        equalsNullable(this.collectionsHeaderType, productGroupPromotion.collectionsHeaderType) &&
        equalsNullable(this.collectionsHeroDestinationUrl, productGroupPromotion.collectionsHeroDestinationUrl) &&
        equalsNullable(this.collectionsHeroPinId, productGroupPromotion.collectionsHeroPinId) &&
        Objects.equals(this.creativeType, productGroupPromotion.creativeType) &&
        equalsNullable(this.customizableCtaType, productGroupPromotion.customizableCtaType) &&
        equalsNullable(this.definition, productGroupPromotion.definition) &&
        equalsNullable(this.gridClickType, productGroupPromotion.gridClickType) &&
        Objects.equals(this.id, productGroupPromotion.id) &&
        equalsNullable(this.included, productGroupPromotion.included) &&
        equalsNullable(this.isGenerateBackground, productGroupPromotion.isGenerateBackground) &&
        equalsNullable(this.isMdl, productGroupPromotion.isMdl) &&
        equalsNullable(this.parentId, productGroupPromotion.parentId) &&
        equalsNullable(this.preferredMediaType, productGroupPromotion.preferredMediaType) &&
        equalsNullable(this.relativeDefinition, productGroupPromotion.relativeDefinition) &&
        equalsNullable(this.selectedImageTag, productGroupPromotion.selectedImageTag) &&
        equalsNullable(this.selectedVideoTag, productGroupPromotion.selectedVideoTag) &&
        equalsNullable(this.slideshowCollectionsDescription, productGroupPromotion.slideshowCollectionsDescription) &&
        equalsNullable(this.slideshowCollectionsTitle, productGroupPromotion.slideshowCollectionsTitle) &&
        Objects.equals(this.status, productGroupPromotion.status) &&
        equalsNullable(this.trackingUrl, productGroupPromotion.trackingUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, hashCodeNullable(bidInMicroCurrency), hashCodeNullable(catalogProductGroupId), hashCodeNullable(catalogProductGroupName), hashCodeNullable(collectionsHeaderType), hashCodeNullable(collectionsHeroDestinationUrl), hashCodeNullable(collectionsHeroPinId), creativeType, hashCodeNullable(customizableCtaType), hashCodeNullable(definition), hashCodeNullable(gridClickType), id, hashCodeNullable(included), hashCodeNullable(isGenerateBackground), hashCodeNullable(isMdl), hashCodeNullable(parentId), hashCodeNullable(preferredMediaType), hashCodeNullable(relativeDefinition), hashCodeNullable(selectedImageTag), hashCodeNullable(selectedVideoTag), hashCodeNullable(slideshowCollectionsDescription), hashCodeNullable(slideshowCollectionsTitle), status, hashCodeNullable(trackingUrl));
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

