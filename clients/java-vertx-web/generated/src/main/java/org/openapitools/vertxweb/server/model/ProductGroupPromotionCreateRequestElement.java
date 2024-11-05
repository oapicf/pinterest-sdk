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
public class ProductGroupPromotionCreateRequestElement   {
  
  private String id;
  private String adGroupId;
  private Integer bidInMicroCurrency;
  private Boolean included;
  private String definition;
  private String relativeDefinition;
  private String parentId;
  private String slideshowCollectionsTitle;
  private String slideshowCollectionsDescription;
  private Boolean isMdl;
  private EntityStatus status;
  private String trackingUrl;
  private String catalogProductGroupId;
  private String catalogProductGroupName;
  private String collectionsHeroPinId;
  private String collectionsHeroDestinationUrl;
  private GridClickType gridClickType;
  private CreativeType creativeType;

  public ProductGroupPromotionCreateRequestElement () {

  }

  public ProductGroupPromotionCreateRequestElement (String id, String adGroupId, Integer bidInMicroCurrency, Boolean included, String definition, String relativeDefinition, String parentId, String slideshowCollectionsTitle, String slideshowCollectionsDescription, Boolean isMdl, EntityStatus status, String trackingUrl, String catalogProductGroupId, String catalogProductGroupName, String collectionsHeroPinId, String collectionsHeroDestinationUrl, GridClickType gridClickType, CreativeType creativeType) {
    this.id = id;
    this.adGroupId = adGroupId;
    this.bidInMicroCurrency = bidInMicroCurrency;
    this.included = included;
    this.definition = definition;
    this.relativeDefinition = relativeDefinition;
    this.parentId = parentId;
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
    this.isMdl = isMdl;
    this.status = status;
    this.trackingUrl = trackingUrl;
    this.catalogProductGroupId = catalogProductGroupId;
    this.catalogProductGroupName = catalogProductGroupName;
    this.collectionsHeroPinId = collectionsHeroPinId;
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
    this.gridClickType = gridClickType;
    this.creativeType = creativeType;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
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

    
  @JsonProperty("included")
  public Boolean getIncluded() {
    return included;
  }
  public void setIncluded(Boolean included) {
    this.included = included;
  }

    
  @JsonProperty("definition")
  public String getDefinition() {
    return definition;
  }
  public void setDefinition(String definition) {
    this.definition = definition;
  }

    
  @JsonProperty("relative_definition")
  public String getRelativeDefinition() {
    return relativeDefinition;
  }
  public void setRelativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
  }

    
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

    
  @JsonProperty("slideshow_collections_title")
  public String getSlideshowCollectionsTitle() {
    return slideshowCollectionsTitle;
  }
  public void setSlideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
  }

    
  @JsonProperty("slideshow_collections_description")
  public String getSlideshowCollectionsDescription() {
    return slideshowCollectionsDescription;
  }
  public void setSlideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
  }

    
  @JsonProperty("is_mdl")
  public Boolean getIsMdl() {
    return isMdl;
  }
  public void setIsMdl(Boolean isMdl) {
    this.isMdl = isMdl;
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

    
  @JsonProperty("collections_hero_pin_id")
  public String getCollectionsHeroPinId() {
    return collectionsHeroPinId;
  }
  public void setCollectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
  }

    
  @JsonProperty("collections_hero_destination_url")
  public String getCollectionsHeroDestinationUrl() {
    return collectionsHeroDestinationUrl;
  }
  public void setCollectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
  }

    
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }
  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

    
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductGroupPromotionCreateRequestElement productGroupPromotionCreateRequestElement = (ProductGroupPromotionCreateRequestElement) o;
    return Objects.equals(id, productGroupPromotionCreateRequestElement.id) &&
        Objects.equals(adGroupId, productGroupPromotionCreateRequestElement.adGroupId) &&
        Objects.equals(bidInMicroCurrency, productGroupPromotionCreateRequestElement.bidInMicroCurrency) &&
        Objects.equals(included, productGroupPromotionCreateRequestElement.included) &&
        Objects.equals(definition, productGroupPromotionCreateRequestElement.definition) &&
        Objects.equals(relativeDefinition, productGroupPromotionCreateRequestElement.relativeDefinition) &&
        Objects.equals(parentId, productGroupPromotionCreateRequestElement.parentId) &&
        Objects.equals(slideshowCollectionsTitle, productGroupPromotionCreateRequestElement.slideshowCollectionsTitle) &&
        Objects.equals(slideshowCollectionsDescription, productGroupPromotionCreateRequestElement.slideshowCollectionsDescription) &&
        Objects.equals(isMdl, productGroupPromotionCreateRequestElement.isMdl) &&
        Objects.equals(status, productGroupPromotionCreateRequestElement.status) &&
        Objects.equals(trackingUrl, productGroupPromotionCreateRequestElement.trackingUrl) &&
        Objects.equals(catalogProductGroupId, productGroupPromotionCreateRequestElement.catalogProductGroupId) &&
        Objects.equals(catalogProductGroupName, productGroupPromotionCreateRequestElement.catalogProductGroupName) &&
        Objects.equals(collectionsHeroPinId, productGroupPromotionCreateRequestElement.collectionsHeroPinId) &&
        Objects.equals(collectionsHeroDestinationUrl, productGroupPromotionCreateRequestElement.collectionsHeroDestinationUrl) &&
        Objects.equals(gridClickType, productGroupPromotionCreateRequestElement.gridClickType) &&
        Objects.equals(creativeType, productGroupPromotionCreateRequestElement.creativeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, adGroupId, bidInMicroCurrency, included, definition, relativeDefinition, parentId, slideshowCollectionsTitle, slideshowCollectionsDescription, isMdl, status, trackingUrl, catalogProductGroupId, catalogProductGroupName, collectionsHeroPinId, collectionsHeroDestinationUrl, gridClickType, creativeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupPromotionCreateRequestElement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    relativeDefinition: ").append(toIndentedString(relativeDefinition)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    slideshowCollectionsTitle: ").append(toIndentedString(slideshowCollectionsTitle)).append("\n");
    sb.append("    slideshowCollectionsDescription: ").append(toIndentedString(slideshowCollectionsDescription)).append("\n");
    sb.append("    isMdl: ").append(toIndentedString(isMdl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
    sb.append("    catalogProductGroupId: ").append(toIndentedString(catalogProductGroupId)).append("\n");
    sb.append("    catalogProductGroupName: ").append(toIndentedString(catalogProductGroupName)).append("\n");
    sb.append("    collectionsHeroPinId: ").append(toIndentedString(collectionsHeroPinId)).append("\n");
    sb.append("    collectionsHeroDestinationUrl: ").append(toIndentedString(collectionsHeroDestinationUrl)).append("\n");
    sb.append("    gridClickType: ").append(toIndentedString(gridClickType)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
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
