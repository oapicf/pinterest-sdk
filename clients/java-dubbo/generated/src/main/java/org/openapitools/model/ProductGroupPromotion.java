package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CollectionsHeaderType;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import org.openapitools.model.PreferredMediaType;
import org.openapitools.model.ProductGroupPromotionCustomizableCTAType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ProductGroupPromotion implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * ID of the ad group the product group belongs to.
   */
  @JsonProperty("ad_group_id")
  private String adGroupId;

  /**
   * The bid in micro currency.
   */
  @JsonProperty("bid_in_micro_currency")
  private Integer bidInMicroCurrency;

  /**
   * ID of the catalogs product group that this product group promotion references (required for create operations)
   */
  @JsonProperty("catalog_product_group_id")
  private String catalogProductGroupId;

  /**
   * Catalogs product group name
   */
  @JsonProperty("catalog_product_group_name")
  private String catalogProductGroupName;

  @JsonProperty("collections_header_type")
  private CollectionsHeaderType collectionsHeaderType;

  /**
   * Collections Hero Destination Url
   */
  @JsonProperty("collections_hero_destination_url")
  private String collectionsHeroDestinationUrl;

  /**
   * Hero Pin ID if this PG is promoted as a Collection
   */
  @JsonProperty("collections_hero_pin_id")
  private String collectionsHeroPinId;

  @JsonProperty("creative_type")
  private CreativeType creativeType;

  @JsonProperty("customizable_cta_type")
  private ProductGroupPromotionCustomizableCTAType customizableCtaType;

  /**
   * The full product group definition path
   */
  @JsonProperty("definition")
  private String definition;

  @JsonProperty("grid_click_type")
  private GridClickType gridClickType;

  /**
   * ID of the product group promotion (required for update operations).
   */
  @JsonProperty("id")
  private String id;

  /**
   * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
   */
  @JsonProperty("included")
  private Boolean included;

  /**
   * Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
   */
  @JsonProperty("is_generate_background")
  private Boolean isGenerateBackground;

  /**
   * Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.
   */
  @JsonProperty("is_image_auto_resizing")
  private Boolean isImageAutoResizing;

  /**
   * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
   */
  @JsonProperty("is_mdl")
  private Boolean isMdl;

  /**
   * The parent Product Group ID of this Product Group
   */
  @JsonProperty("parent_id")
  private String parentId;

  @JsonProperty("preferred_media_type")
  private PreferredMediaType preferredMediaType;

  /**
   * The definition of the product group, relative to its parent - an attribute name/value pair
   */
  @JsonProperty("relative_definition")
  private String relativeDefinition;

  /**
   * The ad image tag selected for the product group promotion.
   */
  @JsonProperty("selected_image_tag")
  private String selectedImageTag;

  /**
   * The ad video tag selected for the product group promotion.
   */
  @JsonProperty("selected_video_tag")
  private String selectedVideoTag;

  /**
   * Slideshow Collections Description
   */
  @JsonProperty("slideshow_collections_description")
  private String slideshowCollectionsDescription;

  /**
   * Slideshow Collections Title
   */
  @JsonProperty("slideshow_collections_title")
  private String slideshowCollectionsTitle;

  @JsonProperty("status")
  private EntityStatus status;

  /**
   * Tracking template for proudct group promotions. 4000 limit
   */
  @JsonProperty("tracking_url")
  private String trackingUrl;

  /**
   * ID of the ad group the product group belongs to.
   * @return adGroupId
   */
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * The bid in micro currency.
   * @return bidInMicroCurrency
   */
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  /**
   * ID of the catalogs product group that this product group promotion references (required for create operations)
   * @return catalogProductGroupId
   */
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }

  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  /**
   * Catalogs product group name
   * @return catalogProductGroupName
   */
  public String getCatalogProductGroupName() {
    return catalogProductGroupName;
  }

  public void setCatalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
  }

  /**
   * 
   * @return collectionsHeaderType
   */
  public CollectionsHeaderType getCollectionsHeaderType() {
    return collectionsHeaderType;
  }

  public void setCollectionsHeaderType(CollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

  /**
   * Collections Hero Destination Url
   * @return collectionsHeroDestinationUrl
   */
  public String getCollectionsHeroDestinationUrl() {
    return collectionsHeroDestinationUrl;
  }

  public void setCollectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
  }

  /**
   * Hero Pin ID if this PG is promoted as a Collection
   * @return collectionsHeroPinId
   */
  public String getCollectionsHeroPinId() {
    return collectionsHeroPinId;
  }

  public void setCollectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
  }

  /**
   * 
   * @return creativeType
   */
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * 
   * @return customizableCtaType
   */
  public ProductGroupPromotionCustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }

  public void setCustomizableCtaType(ProductGroupPromotionCustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  /**
   * The full product group definition path
   * @return definition
   */
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  /**
   * 
   * @return gridClickType
   */
  public GridClickType getGridClickType() {
    return gridClickType;
  }

  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  /**
   * ID of the product group promotion (required for update operations).
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
   * @return included
   */
  public Boolean getIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  /**
   * Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
   * @return isGenerateBackground
   */
  public Boolean getIsGenerateBackground() {
    return isGenerateBackground;
  }

  public void setIsGenerateBackground(Boolean isGenerateBackground) {
    this.isGenerateBackground = isGenerateBackground;
  }

  /**
   * Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.
   * @return isImageAutoResizing
   */
  public Boolean getIsImageAutoResizing() {
    return isImageAutoResizing;
  }

  public void setIsImageAutoResizing(Boolean isImageAutoResizing) {
    this.isImageAutoResizing = isImageAutoResizing;
  }

  /**
   * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
   * @return isMdl
   */
  public Boolean getIsMdl() {
    return isMdl;
  }

  public void setIsMdl(Boolean isMdl) {
    this.isMdl = isMdl;
  }

  /**
   * The parent Product Group ID of this Product Group
   * @return parentId
   */
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * 
   * @return preferredMediaType
   */
  public PreferredMediaType getPreferredMediaType() {
    return preferredMediaType;
  }

  public void setPreferredMediaType(PreferredMediaType preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

  /**
   * The definition of the product group, relative to its parent - an attribute name/value pair
   * @return relativeDefinition
   */
  public String getRelativeDefinition() {
    return relativeDefinition;
  }

  public void setRelativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
  }

  /**
   * The ad image tag selected for the product group promotion.
   * @return selectedImageTag
   */
  public String getSelectedImageTag() {
    return selectedImageTag;
  }

  public void setSelectedImageTag(String selectedImageTag) {
    this.selectedImageTag = selectedImageTag;
  }

  /**
   * The ad video tag selected for the product group promotion.
   * @return selectedVideoTag
   */
  public String getSelectedVideoTag() {
    return selectedVideoTag;
  }

  public void setSelectedVideoTag(String selectedVideoTag) {
    this.selectedVideoTag = selectedVideoTag;
  }

  /**
   * Slideshow Collections Description
   * @return slideshowCollectionsDescription
   */
  public String getSlideshowCollectionsDescription() {
    return slideshowCollectionsDescription;
  }

  public void setSlideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
  }

  /**
   * Slideshow Collections Title
   * @return slideshowCollectionsTitle
   */
  public String getSlideshowCollectionsTitle() {
    return slideshowCollectionsTitle;
  }

  public void setSlideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
  }

  /**
   * 
   * @return status
   */
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Tracking template for proudct group promotions. 4000 limit
   * @return trackingUrl
   */
  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
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
        Objects.equals(this.collectionsHeaderType, productGroupPromotion.collectionsHeaderType) &&
        Objects.equals(this.collectionsHeroDestinationUrl, productGroupPromotion.collectionsHeroDestinationUrl) &&
        Objects.equals(this.collectionsHeroPinId, productGroupPromotion.collectionsHeroPinId) &&
        Objects.equals(this.creativeType, productGroupPromotion.creativeType) &&
        Objects.equals(this.customizableCtaType, productGroupPromotion.customizableCtaType) &&
        Objects.equals(this.definition, productGroupPromotion.definition) &&
        Objects.equals(this.gridClickType, productGroupPromotion.gridClickType) &&
        Objects.equals(this.id, productGroupPromotion.id) &&
        Objects.equals(this.included, productGroupPromotion.included) &&
        Objects.equals(this.isGenerateBackground, productGroupPromotion.isGenerateBackground) &&
        Objects.equals(this.isImageAutoResizing, productGroupPromotion.isImageAutoResizing) &&
        Objects.equals(this.isMdl, productGroupPromotion.isMdl) &&
        Objects.equals(this.parentId, productGroupPromotion.parentId) &&
        Objects.equals(this.preferredMediaType, productGroupPromotion.preferredMediaType) &&
        Objects.equals(this.relativeDefinition, productGroupPromotion.relativeDefinition) &&
        Objects.equals(this.selectedImageTag, productGroupPromotion.selectedImageTag) &&
        Objects.equals(this.selectedVideoTag, productGroupPromotion.selectedVideoTag) &&
        Objects.equals(this.slideshowCollectionsDescription, productGroupPromotion.slideshowCollectionsDescription) &&
        Objects.equals(this.slideshowCollectionsTitle, productGroupPromotion.slideshowCollectionsTitle) &&
        Objects.equals(this.status, productGroupPromotion.status) &&
        Objects.equals(this.trackingUrl, productGroupPromotion.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, bidInMicroCurrency, catalogProductGroupId, catalogProductGroupName, collectionsHeaderType, collectionsHeroDestinationUrl, collectionsHeroPinId, creativeType, customizableCtaType, definition, gridClickType, id, included, isGenerateBackground, isImageAutoResizing, isMdl, parentId, preferredMediaType, relativeDefinition, selectedImageTag, selectedVideoTag, slideshowCollectionsDescription, slideshowCollectionsTitle, status, trackingUrl);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
