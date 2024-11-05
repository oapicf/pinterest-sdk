package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductGroupPromotionCreateRequestElement  {
  
  @ApiModelProperty(example = "2680059592705", value = "ID of the product group promotion.")
 /**
   * ID of the product group promotion.
  **/
  private String id;

  @ApiModelProperty(example = "2680059592705", value = "ID of the ad group the product group belongs to.")
 /**
   * ID of the ad group the product group belongs to.
  **/
  private String adGroupId;

  @ApiModelProperty(example = "14000000", value = "The bid in micro currency.")
 /**
   * The bid in micro currency.
  **/
  private Integer bidInMicroCurrency;

  @ApiModelProperty(example = "true", value = "True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.")
 /**
   * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
  **/
  private Boolean included;

  @ApiModelProperty(example = "*_/product_type_0='kitchen'/product_type_1='beverage appliances'", value = "The full product group definition path")
 /**
   * The full product group definition path
  **/
  private String definition;

  @ApiModelProperty(example = "product_type_1='beverage appliances'", value = "The definition of the product group, relative to its parent - an attribute name/value pair")
 /**
   * The definition of the product group, relative to its parent - an attribute name/value pair
  **/
  private String relativeDefinition;

  @ApiModelProperty(example = "1231234", value = "The parent Product Group ID of this Product Group")
 /**
   * The parent Product Group ID of this Product Group
  **/
  private String parentId;

  @ApiModelProperty(example = "slideshow title", value = "Slideshow Collections Title")
 /**
   * Slideshow Collections Title
  **/
  private String slideshowCollectionsTitle;

  @ApiModelProperty(example = "slideshow description", value = "Slideshow Collections Description")
 /**
   * Slideshow Collections Description
  **/
  private String slideshowCollectionsDescription;

  @ApiModelProperty(example = "true", value = "If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog")
 /**
   * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
  **/
  private Boolean isMdl;

  @ApiModelProperty(value = "")
  private EntityStatus status;

  @ApiModelProperty(example = "https://www.pinterest.com", value = "Tracking template for proudct group promotions. 4000 limit")
 /**
   * Tracking template for proudct group promotions. 4000 limit
  **/
  private String trackingUrl;

  @ApiModelProperty(example = "1231235", value = "ID of the catalogs product group that this product group promotion references")
 /**
   * ID of the catalogs product group that this product group promotion references
  **/
  private String catalogProductGroupId;

  @ApiModelProperty(example = "catalogProductGroupName", value = "Catalogs product group name")
 /**
   * Catalogs product group name
  **/
  private String catalogProductGroupName;

  @ApiModelProperty(example = "123123", value = "Hero Pin ID if this PG is promoted as a Collection")
 /**
   * Hero Pin ID if this PG is promoted as a Collection
  **/
  private String collectionsHeroPinId;

  @ApiModelProperty(example = "http://www.pinterest.com", value = "Collections Hero Destination Url")
 /**
   * Collections Hero Destination Url
  **/
  private String collectionsHeroDestinationUrl;

  @ApiModelProperty(value = "")
  private GridClickType gridClickType;

  @ApiModelProperty(value = "")
  private CreativeType creativeType;
 /**
   * ID of the product group promotion.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductGroupPromotionCreateRequestElement id(String id) {
    this.id = id;
    return this;
  }

 /**
   * ID of the ad group the product group belongs to.
   * @return adGroupId
  **/
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ProductGroupPromotionCreateRequestElement adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

 /**
   * The bid in micro currency.
   * @return bidInMicroCurrency
  **/
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public ProductGroupPromotionCreateRequestElement bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

 /**
   * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
   * @return included
  **/
  @JsonProperty("included")
  public Boolean getIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public ProductGroupPromotionCreateRequestElement included(Boolean included) {
    this.included = included;
    return this;
  }

 /**
   * The full product group definition path
   * @return definition
  **/
  @JsonProperty("definition")
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public ProductGroupPromotionCreateRequestElement definition(String definition) {
    this.definition = definition;
    return this;
  }

 /**
   * The definition of the product group, relative to its parent - an attribute name/value pair
   * @return relativeDefinition
  **/
  @JsonProperty("relative_definition")
  public String getRelativeDefinition() {
    return relativeDefinition;
  }

  public void setRelativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
  }

  public ProductGroupPromotionCreateRequestElement relativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
    return this;
  }

 /**
   * The parent Product Group ID of this Product Group
   * @return parentId
  **/
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public ProductGroupPromotionCreateRequestElement parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
   * Slideshow Collections Title
   * @return slideshowCollectionsTitle
  **/
  @JsonProperty("slideshow_collections_title")
  public String getSlideshowCollectionsTitle() {
    return slideshowCollectionsTitle;
  }

  public void setSlideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
  }

  public ProductGroupPromotionCreateRequestElement slideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
    return this;
  }

 /**
   * Slideshow Collections Description
   * @return slideshowCollectionsDescription
  **/
  @JsonProperty("slideshow_collections_description")
  public String getSlideshowCollectionsDescription() {
    return slideshowCollectionsDescription;
  }

  public void setSlideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
  }

  public ProductGroupPromotionCreateRequestElement slideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
    return this;
  }

 /**
   * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
   * @return isMdl
  **/
  @JsonProperty("is_mdl")
  public Boolean getIsMdl() {
    return isMdl;
  }

  public void setIsMdl(Boolean isMdl) {
    this.isMdl = isMdl;
  }

  public ProductGroupPromotionCreateRequestElement isMdl(Boolean isMdl) {
    this.isMdl = isMdl;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public ProductGroupPromotionCreateRequestElement status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Tracking template for proudct group promotions. 4000 limit
   * @return trackingUrl
  **/
  @JsonProperty("tracking_url")
  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public ProductGroupPromotionCreateRequestElement trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

 /**
   * ID of the catalogs product group that this product group promotion references
   * @return catalogProductGroupId
  **/
  @JsonProperty("catalog_product_group_id")
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }

  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  public ProductGroupPromotionCreateRequestElement catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
    return this;
  }

 /**
   * Catalogs product group name
   * @return catalogProductGroupName
  **/
  @JsonProperty("catalog_product_group_name")
  public String getCatalogProductGroupName() {
    return catalogProductGroupName;
  }

  public void setCatalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
  }

  public ProductGroupPromotionCreateRequestElement catalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
    return this;
  }

 /**
   * Hero Pin ID if this PG is promoted as a Collection
   * @return collectionsHeroPinId
  **/
  @JsonProperty("collections_hero_pin_id")
  public String getCollectionsHeroPinId() {
    return collectionsHeroPinId;
  }

  public void setCollectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
  }

  public ProductGroupPromotionCreateRequestElement collectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
    return this;
  }

 /**
   * Collections Hero Destination Url
   * @return collectionsHeroDestinationUrl
  **/
  @JsonProperty("collections_hero_destination_url")
  public String getCollectionsHeroDestinationUrl() {
    return collectionsHeroDestinationUrl;
  }

  public void setCollectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
  }

  public ProductGroupPromotionCreateRequestElement collectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
    return this;
  }

 /**
   * Get gridClickType
   * @return gridClickType
  **/
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }

  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  public ProductGroupPromotionCreateRequestElement gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

 /**
   * Get creativeType
   * @return creativeType
  **/
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public ProductGroupPromotionCreateRequestElement creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
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
    return Objects.equals(this.id, productGroupPromotionCreateRequestElement.id) &&
        Objects.equals(this.adGroupId, productGroupPromotionCreateRequestElement.adGroupId) &&
        Objects.equals(this.bidInMicroCurrency, productGroupPromotionCreateRequestElement.bidInMicroCurrency) &&
        Objects.equals(this.included, productGroupPromotionCreateRequestElement.included) &&
        Objects.equals(this.definition, productGroupPromotionCreateRequestElement.definition) &&
        Objects.equals(this.relativeDefinition, productGroupPromotionCreateRequestElement.relativeDefinition) &&
        Objects.equals(this.parentId, productGroupPromotionCreateRequestElement.parentId) &&
        Objects.equals(this.slideshowCollectionsTitle, productGroupPromotionCreateRequestElement.slideshowCollectionsTitle) &&
        Objects.equals(this.slideshowCollectionsDescription, productGroupPromotionCreateRequestElement.slideshowCollectionsDescription) &&
        Objects.equals(this.isMdl, productGroupPromotionCreateRequestElement.isMdl) &&
        Objects.equals(this.status, productGroupPromotionCreateRequestElement.status) &&
        Objects.equals(this.trackingUrl, productGroupPromotionCreateRequestElement.trackingUrl) &&
        Objects.equals(this.catalogProductGroupId, productGroupPromotionCreateRequestElement.catalogProductGroupId) &&
        Objects.equals(this.catalogProductGroupName, productGroupPromotionCreateRequestElement.catalogProductGroupName) &&
        Objects.equals(this.collectionsHeroPinId, productGroupPromotionCreateRequestElement.collectionsHeroPinId) &&
        Objects.equals(this.collectionsHeroDestinationUrl, productGroupPromotionCreateRequestElement.collectionsHeroDestinationUrl) &&
        Objects.equals(this.gridClickType, productGroupPromotionCreateRequestElement.gridClickType) &&
        Objects.equals(this.creativeType, productGroupPromotionCreateRequestElement.creativeType);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

