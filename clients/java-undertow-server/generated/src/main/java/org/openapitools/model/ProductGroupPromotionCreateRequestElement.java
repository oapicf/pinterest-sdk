/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

  /**
   * ID of the product group promotion.
   */
  public ProductGroupPromotionCreateRequestElement id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "ID of the product group promotion.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * ID of the ad group the product group belongs to.
   */
  public ProductGroupPromotionCreateRequestElement adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "ID of the ad group the product group belongs to.")
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * The bid in micro currency.
   */
  public ProductGroupPromotionCreateRequestElement bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "14000000", value = "The bid in micro currency.")
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }
  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  /**
   * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
   */
  public ProductGroupPromotionCreateRequestElement included(Boolean included) {
    this.included = included;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.")
  @JsonProperty("included")
  public Boolean getIncluded() {
    return included;
  }
  public void setIncluded(Boolean included) {
    this.included = included;
  }

  /**
   * The full product group definition path
   */
  public ProductGroupPromotionCreateRequestElement definition(String definition) {
    this.definition = definition;
    return this;
  }

  
  @ApiModelProperty(example = "*_/product_type_0='kitchen'/product_type_1='beverage appliances'", value = "The full product group definition path")
  @JsonProperty("definition")
  public String getDefinition() {
    return definition;
  }
  public void setDefinition(String definition) {
    this.definition = definition;
  }

  /**
   * The definition of the product group, relative to its parent - an attribute name/value pair
   */
  public ProductGroupPromotionCreateRequestElement relativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
    return this;
  }

  
  @ApiModelProperty(example = "product_type_1='beverage appliances'", value = "The definition of the product group, relative to its parent - an attribute name/value pair")
  @JsonProperty("relative_definition")
  public String getRelativeDefinition() {
    return relativeDefinition;
  }
  public void setRelativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
  }

  /**
   * The parent Product Group ID of this Product Group
   */
  public ProductGroupPromotionCreateRequestElement parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(example = "1231234", value = "The parent Product Group ID of this Product Group")
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * Slideshow Collections Title
   */
  public ProductGroupPromotionCreateRequestElement slideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
    return this;
  }

  
  @ApiModelProperty(example = "slideshow title", value = "Slideshow Collections Title")
  @JsonProperty("slideshow_collections_title")
  public String getSlideshowCollectionsTitle() {
    return slideshowCollectionsTitle;
  }
  public void setSlideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
  }

  /**
   * Slideshow Collections Description
   */
  public ProductGroupPromotionCreateRequestElement slideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
    return this;
  }

  
  @ApiModelProperty(example = "slideshow description", value = "Slideshow Collections Description")
  @JsonProperty("slideshow_collections_description")
  public String getSlideshowCollectionsDescription() {
    return slideshowCollectionsDescription;
  }
  public void setSlideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
  }

  /**
   * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
   */
  public ProductGroupPromotionCreateRequestElement isMdl(Boolean isMdl) {
    this.isMdl = isMdl;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog")
  @JsonProperty("is_mdl")
  public Boolean getIsMdl() {
    return isMdl;
  }
  public void setIsMdl(Boolean isMdl) {
    this.isMdl = isMdl;
  }

  /**
   */
  public ProductGroupPromotionCreateRequestElement status(EntityStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Tracking template for proudct group promotions. 4000 limit
   */
  public ProductGroupPromotionCreateRequestElement trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.pinterest.com", value = "Tracking template for proudct group promotions. 4000 limit")
  @JsonProperty("tracking_url")
  public String getTrackingUrl() {
    return trackingUrl;
  }
  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  /**
   * ID of the catalogs product group that this product group promotion references
   */
  public ProductGroupPromotionCreateRequestElement catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "1231235", value = "ID of the catalogs product group that this product group promotion references")
  @JsonProperty("catalog_product_group_id")
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }
  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  /**
   * Catalogs product group name
   */
  public ProductGroupPromotionCreateRequestElement catalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
    return this;
  }

  
  @ApiModelProperty(example = "catalogProductGroupName", value = "Catalogs product group name")
  @JsonProperty("catalog_product_group_name")
  public String getCatalogProductGroupName() {
    return catalogProductGroupName;
  }
  public void setCatalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
  }

  /**
   * Hero Pin ID if this PG is promoted as a Collection
   */
  public ProductGroupPromotionCreateRequestElement collectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
    return this;
  }

  
  @ApiModelProperty(example = "123123", value = "Hero Pin ID if this PG is promoted as a Collection")
  @JsonProperty("collections_hero_pin_id")
  public String getCollectionsHeroPinId() {
    return collectionsHeroPinId;
  }
  public void setCollectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
  }

  /**
   * Collections Hero Destination Url
   */
  public ProductGroupPromotionCreateRequestElement collectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
    return this;
  }

  
  @ApiModelProperty(example = "http://www.pinterest.com", value = "Collections Hero Destination Url")
  @JsonProperty("collections_hero_destination_url")
  public String getCollectionsHeroDestinationUrl() {
    return collectionsHeroDestinationUrl;
  }
  public void setCollectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
  }

  /**
   */
  public ProductGroupPromotionCreateRequestElement gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }
  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  /**
   */
  public ProductGroupPromotionCreateRequestElement creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

