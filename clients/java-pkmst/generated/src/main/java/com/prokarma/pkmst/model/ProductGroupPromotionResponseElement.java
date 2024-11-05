package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CreativeType;
import com.prokarma.pkmst.model.EntityStatus;
import com.prokarma.pkmst.model.GridClickType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ProductGroupPromotionResponseElement
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductGroupPromotionResponseElement   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("ad_group_id")
  private String adGroupId;

  @JsonProperty("bid_in_micro_currency")
  private Integer bidInMicroCurrency;

  @JsonProperty("included")
  private Boolean included;

  @JsonProperty("definition")
  private String definition;

  @JsonProperty("relative_definition")
  private String relativeDefinition;

  @JsonProperty("parent_id")
  private String parentId;

  @JsonProperty("slideshow_collections_title")
  private String slideshowCollectionsTitle;

  @JsonProperty("slideshow_collections_description")
  private String slideshowCollectionsDescription;

  @JsonProperty("is_mdl")
  private Boolean isMdl;

  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("tracking_url")
  private String trackingUrl;

  @JsonProperty("catalog_product_group_id")
  private String catalogProductGroupId;

  @JsonProperty("catalog_product_group_name")
  private String catalogProductGroupName;

  @JsonProperty("collections_hero_pin_id")
  private String collectionsHeroPinId;

  @JsonProperty("collections_hero_destination_url")
  private String collectionsHeroDestinationUrl;

  @JsonProperty("grid_click_type")
  private GridClickType gridClickType;

  @JsonProperty("creative_type")
  private CreativeType creativeType;

  public ProductGroupPromotionResponseElement id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the product group promotion.
   * @return id
   */
  @ApiModelProperty(example = "2680059592705", value = "ID of the product group promotion.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductGroupPromotionResponseElement adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * ID of the ad group the product group belongs to.
   * @return adGroupId
   */
  @ApiModelProperty(example = "2680059592705", value = "ID of the ad group the product group belongs to.")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ProductGroupPromotionResponseElement bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

  /**
   * The bid in micro currency.
   * @return bidInMicroCurrency
   */
  @ApiModelProperty(example = "14000000", value = "The bid in micro currency.")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public ProductGroupPromotionResponseElement included(Boolean included) {
    this.included = included;
    return this;
  }

  /**
   * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
   * @return included
   */
  @ApiModelProperty(example = "true", value = "True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.")
  public Boolean getIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public ProductGroupPromotionResponseElement definition(String definition) {
    this.definition = definition;
    return this;
  }

  /**
   * The full product group definition path
   * @return definition
   */
  @ApiModelProperty(example = "*_/product_type_0='kitchen'/product_type_1='beverage appliances'", value = "The full product group definition path")
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public ProductGroupPromotionResponseElement relativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
    return this;
  }

  /**
   * The definition of the product group, relative to its parent - an attribute name/value pair
   * @return relativeDefinition
   */
  @ApiModelProperty(example = "product_type_1='beverage appliances'", value = "The definition of the product group, relative to its parent - an attribute name/value pair")
  public String getRelativeDefinition() {
    return relativeDefinition;
  }

  public void setRelativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
  }

  public ProductGroupPromotionResponseElement parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * The parent Product Group ID of this Product Group
   * @return parentId
   */
  @ApiModelProperty(example = "1231234", value = "The parent Product Group ID of this Product Group")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public ProductGroupPromotionResponseElement slideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
    return this;
  }

  /**
   * Slideshow Collections Title
   * @return slideshowCollectionsTitle
   */
  @ApiModelProperty(example = "slideshow title", value = "Slideshow Collections Title")
  public String getSlideshowCollectionsTitle() {
    return slideshowCollectionsTitle;
  }

  public void setSlideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
  }

  public ProductGroupPromotionResponseElement slideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
    return this;
  }

  /**
   * Slideshow Collections Description
   * @return slideshowCollectionsDescription
   */
  @ApiModelProperty(example = "slideshow description", value = "Slideshow Collections Description")
  public String getSlideshowCollectionsDescription() {
    return slideshowCollectionsDescription;
  }

  public void setSlideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
  }

  public ProductGroupPromotionResponseElement isMdl(Boolean isMdl) {
    this.isMdl = isMdl;
    return this;
  }

  /**
   * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
   * @return isMdl
   */
  @ApiModelProperty(example = "true", value = "If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog")
  public Boolean getIsMdl() {
    return isMdl;
  }

  public void setIsMdl(Boolean isMdl) {
    this.isMdl = isMdl;
  }

  public ProductGroupPromotionResponseElement status(EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public ProductGroupPromotionResponseElement trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  /**
   * Tracking template for proudct group promotions. 4000 limit
   * @return trackingUrl
   */
  @ApiModelProperty(example = "https://www.pinterest.com", value = "Tracking template for proudct group promotions. 4000 limit")
  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public ProductGroupPromotionResponseElement catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
    return this;
  }

  /**
   * ID of the catalogs product group that this product group promotion references
   * @return catalogProductGroupId
   */
  @ApiModelProperty(example = "1231235", value = "ID of the catalogs product group that this product group promotion references")
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }

  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  public ProductGroupPromotionResponseElement catalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
    return this;
  }

  /**
   * Catalogs product group name
   * @return catalogProductGroupName
   */
  @ApiModelProperty(example = "catalogProductGroupName", value = "Catalogs product group name")
  public String getCatalogProductGroupName() {
    return catalogProductGroupName;
  }

  public void setCatalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
  }

  public ProductGroupPromotionResponseElement collectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
    return this;
  }

  /**
   * Hero Pin ID if this PG is promoted as a Collection
   * @return collectionsHeroPinId
   */
  @ApiModelProperty(example = "123123", value = "Hero Pin ID if this PG is promoted as a Collection")
  public String getCollectionsHeroPinId() {
    return collectionsHeroPinId;
  }

  public void setCollectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
  }

  public ProductGroupPromotionResponseElement collectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
    return this;
  }

  /**
   * Collections Hero Destination Url
   * @return collectionsHeroDestinationUrl
   */
  @ApiModelProperty(example = "http://www.pinterest.com", value = "Collections Hero Destination Url")
  public String getCollectionsHeroDestinationUrl() {
    return collectionsHeroDestinationUrl;
  }

  public void setCollectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
  }

  public ProductGroupPromotionResponseElement gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

  /**
   * Get gridClickType
   * @return gridClickType
   */
  @ApiModelProperty(value = "")
  public GridClickType getGridClickType() {
    return gridClickType;
  }

  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  public ProductGroupPromotionResponseElement creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  /**
   * Get creativeType
   * @return creativeType
   */
  @ApiModelProperty(value = "")
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
    ProductGroupPromotionResponseElement productGroupPromotionResponseElement = (ProductGroupPromotionResponseElement) o;
    return Objects.equals(this.id, productGroupPromotionResponseElement.id) &&
        Objects.equals(this.adGroupId, productGroupPromotionResponseElement.adGroupId) &&
        Objects.equals(this.bidInMicroCurrency, productGroupPromotionResponseElement.bidInMicroCurrency) &&
        Objects.equals(this.included, productGroupPromotionResponseElement.included) &&
        Objects.equals(this.definition, productGroupPromotionResponseElement.definition) &&
        Objects.equals(this.relativeDefinition, productGroupPromotionResponseElement.relativeDefinition) &&
        Objects.equals(this.parentId, productGroupPromotionResponseElement.parentId) &&
        Objects.equals(this.slideshowCollectionsTitle, productGroupPromotionResponseElement.slideshowCollectionsTitle) &&
        Objects.equals(this.slideshowCollectionsDescription, productGroupPromotionResponseElement.slideshowCollectionsDescription) &&
        Objects.equals(this.isMdl, productGroupPromotionResponseElement.isMdl) &&
        Objects.equals(this.status, productGroupPromotionResponseElement.status) &&
        Objects.equals(this.trackingUrl, productGroupPromotionResponseElement.trackingUrl) &&
        Objects.equals(this.catalogProductGroupId, productGroupPromotionResponseElement.catalogProductGroupId) &&
        Objects.equals(this.catalogProductGroupName, productGroupPromotionResponseElement.catalogProductGroupName) &&
        Objects.equals(this.collectionsHeroPinId, productGroupPromotionResponseElement.collectionsHeroPinId) &&
        Objects.equals(this.collectionsHeroDestinationUrl, productGroupPromotionResponseElement.collectionsHeroDestinationUrl) &&
        Objects.equals(this.gridClickType, productGroupPromotionResponseElement.gridClickType) &&
        Objects.equals(this.creativeType, productGroupPromotionResponseElement.creativeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, adGroupId, bidInMicroCurrency, included, definition, relativeDefinition, parentId, slideshowCollectionsTitle, slideshowCollectionsDescription, isMdl, status, trackingUrl, catalogProductGroupId, catalogProductGroupName, collectionsHeroPinId, collectionsHeroDestinationUrl, gridClickType, creativeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupPromotionResponseElement {\n");
    
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

