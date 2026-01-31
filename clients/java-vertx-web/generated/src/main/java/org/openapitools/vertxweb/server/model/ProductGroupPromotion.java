package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CreativeType;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.GridClickType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductGroupPromotion   {
  
  private String adGroupId;
  private Integer bidInMicroCurrency;
  private String catalogProductGroupId;
  private String catalogProductGroupName;


  public enum CollectionsHeaderTypeEnum {
    SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
    EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
    NO_HEADER("NO_HEADER"),
    ON_SALE("ON_SALE"),
    GET_DEAL("GET_DEAL");

    private String value;

    CollectionsHeaderTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CollectionsHeaderTypeEnum collectionsHeaderType;
  private String collectionsHeroDestinationUrl;
  private String collectionsHeroPinId;
  private CreativeType creativeType;


  public enum CustomizableCtaTypeEnum {
    SHOP_NOW("SHOP_NOW"),
    BOOK_NOW("BOOK_NOW"),
    ON_SALE("ON_SALE"),
    GET_DEAL("GET_DEAL"),
    BUY_ONLINE_PICKUP_IN_STORE("BUY_ONLINE_PICKUP_IN_STORE");

    private String value;

    CustomizableCtaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CustomizableCtaTypeEnum customizableCtaType;
  private String definition;
  private GridClickType gridClickType;
  private String id;
  private Boolean included;
  private Boolean isGenerateBackground;
  private Boolean isMdl;
  private String parentId;


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
  private String relativeDefinition;
  private String selectedImageTag;
  private String selectedVideoTag;
  private String slideshowCollectionsDescription;
  private String slideshowCollectionsTitle;
  private EntityStatus status;
  private String trackingUrl;

  public ProductGroupPromotion () {

  }

  public ProductGroupPromotion (String adGroupId, Integer bidInMicroCurrency, String catalogProductGroupId, String catalogProductGroupName, CollectionsHeaderTypeEnum collectionsHeaderType, String collectionsHeroDestinationUrl, String collectionsHeroPinId, CreativeType creativeType, CustomizableCtaTypeEnum customizableCtaType, String definition, GridClickType gridClickType, String id, Boolean included, Boolean isGenerateBackground, Boolean isMdl, String parentId, PreferredMediaTypeEnum preferredMediaType, String relativeDefinition, String selectedImageTag, String selectedVideoTag, String slideshowCollectionsDescription, String slideshowCollectionsTitle, EntityStatus status, String trackingUrl) {
    this.adGroupId = adGroupId;
    this.bidInMicroCurrency = bidInMicroCurrency;
    this.catalogProductGroupId = catalogProductGroupId;
    this.catalogProductGroupName = catalogProductGroupName;
    this.collectionsHeaderType = collectionsHeaderType;
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
    this.collectionsHeroPinId = collectionsHeroPinId;
    this.creativeType = creativeType;
    this.customizableCtaType = customizableCtaType;
    this.definition = definition;
    this.gridClickType = gridClickType;
    this.id = id;
    this.included = included;
    this.isGenerateBackground = isGenerateBackground;
    this.isMdl = isMdl;
    this.parentId = parentId;
    this.preferredMediaType = preferredMediaType;
    this.relativeDefinition = relativeDefinition;
    this.selectedImageTag = selectedImageTag;
    this.selectedVideoTag = selectedVideoTag;
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
    this.status = status;
    this.trackingUrl = trackingUrl;
  }

    
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

    
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }
  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

    
  @JsonProperty("catalog_product_group_id")
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }
  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

    
  @JsonProperty("catalog_product_group_name")
  public String getCatalogProductGroupName() {
    return catalogProductGroupName;
  }
  public void setCatalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
  }

    
  @JsonProperty("collections_header_type")
  public CollectionsHeaderTypeEnum getCollectionsHeaderType() {
    return collectionsHeaderType;
  }
  public void setCollectionsHeaderType(CollectionsHeaderTypeEnum collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

    
  @JsonProperty("collections_hero_destination_url")
  public String getCollectionsHeroDestinationUrl() {
    return collectionsHeroDestinationUrl;
  }
  public void setCollectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
  }

    
  @JsonProperty("collections_hero_pin_id")
  public String getCollectionsHeroPinId() {
    return collectionsHeroPinId;
  }
  public void setCollectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
  }

    
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

    
  @JsonProperty("customizable_cta_type")
  public CustomizableCtaTypeEnum getCustomizableCtaType() {
    return customizableCtaType;
  }
  public void setCustomizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

    
  @JsonProperty("definition")
  public String getDefinition() {
    return definition;
  }
  public void setDefinition(String definition) {
    this.definition = definition;
  }

    
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }
  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("included")
  public Boolean getIncluded() {
    return included;
  }
  public void setIncluded(Boolean included) {
    this.included = included;
  }

    
  @JsonProperty("is_generate_background")
  public Boolean getIsGenerateBackground() {
    return isGenerateBackground;
  }
  public void setIsGenerateBackground(Boolean isGenerateBackground) {
    this.isGenerateBackground = isGenerateBackground;
  }

    
  @JsonProperty("is_mdl")
  public Boolean getIsMdl() {
    return isMdl;
  }
  public void setIsMdl(Boolean isMdl) {
    this.isMdl = isMdl;
  }

    
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

    
  @JsonProperty("preferred_media_type")
  public PreferredMediaTypeEnum getPreferredMediaType() {
    return preferredMediaType;
  }
  public void setPreferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

    
  @JsonProperty("relative_definition")
  public String getRelativeDefinition() {
    return relativeDefinition;
  }
  public void setRelativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
  }

    
  @JsonProperty("selected_image_tag")
  public String getSelectedImageTag() {
    return selectedImageTag;
  }
  public void setSelectedImageTag(String selectedImageTag) {
    this.selectedImageTag = selectedImageTag;
  }

    
  @JsonProperty("selected_video_tag")
  public String getSelectedVideoTag() {
    return selectedVideoTag;
  }
  public void setSelectedVideoTag(String selectedVideoTag) {
    this.selectedVideoTag = selectedVideoTag;
  }

    
  @JsonProperty("slideshow_collections_description")
  public String getSlideshowCollectionsDescription() {
    return slideshowCollectionsDescription;
  }
  public void setSlideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
  }

    
  @JsonProperty("slideshow_collections_title")
  public String getSlideshowCollectionsTitle() {
    return slideshowCollectionsTitle;
  }
  public void setSlideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
  }

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("tracking_url")
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
    return Objects.equals(adGroupId, productGroupPromotion.adGroupId) &&
        Objects.equals(bidInMicroCurrency, productGroupPromotion.bidInMicroCurrency) &&
        Objects.equals(catalogProductGroupId, productGroupPromotion.catalogProductGroupId) &&
        Objects.equals(catalogProductGroupName, productGroupPromotion.catalogProductGroupName) &&
        Objects.equals(collectionsHeaderType, productGroupPromotion.collectionsHeaderType) &&
        Objects.equals(collectionsHeroDestinationUrl, productGroupPromotion.collectionsHeroDestinationUrl) &&
        Objects.equals(collectionsHeroPinId, productGroupPromotion.collectionsHeroPinId) &&
        Objects.equals(creativeType, productGroupPromotion.creativeType) &&
        Objects.equals(customizableCtaType, productGroupPromotion.customizableCtaType) &&
        Objects.equals(definition, productGroupPromotion.definition) &&
        Objects.equals(gridClickType, productGroupPromotion.gridClickType) &&
        Objects.equals(id, productGroupPromotion.id) &&
        Objects.equals(included, productGroupPromotion.included) &&
        Objects.equals(isGenerateBackground, productGroupPromotion.isGenerateBackground) &&
        Objects.equals(isMdl, productGroupPromotion.isMdl) &&
        Objects.equals(parentId, productGroupPromotion.parentId) &&
        Objects.equals(preferredMediaType, productGroupPromotion.preferredMediaType) &&
        Objects.equals(relativeDefinition, productGroupPromotion.relativeDefinition) &&
        Objects.equals(selectedImageTag, productGroupPromotion.selectedImageTag) &&
        Objects.equals(selectedVideoTag, productGroupPromotion.selectedVideoTag) &&
        Objects.equals(slideshowCollectionsDescription, productGroupPromotion.slideshowCollectionsDescription) &&
        Objects.equals(slideshowCollectionsTitle, productGroupPromotion.slideshowCollectionsTitle) &&
        Objects.equals(status, productGroupPromotion.status) &&
        Objects.equals(trackingUrl, productGroupPromotion.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, bidInMicroCurrency, catalogProductGroupId, catalogProductGroupName, collectionsHeaderType, collectionsHeroDestinationUrl, collectionsHeroPinId, creativeType, customizableCtaType, definition, gridClickType, id, included, isGenerateBackground, isMdl, parentId, preferredMediaType, relativeDefinition, selectedImageTag, selectedVideoTag, slideshowCollectionsDescription, slideshowCollectionsTitle, status, trackingUrl);
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
