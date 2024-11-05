package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ProductGroupPromotionCreateRequestElement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
   **/
  public ProductGroupPromotionCreateRequestElement id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "ID of the product group promotion.")
  @JsonProperty("id")
   @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * ID of the ad group the product group belongs to.
   **/
  public ProductGroupPromotionCreateRequestElement adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "ID of the ad group the product group belongs to.")
  @JsonProperty("ad_group_id")
   @Pattern(regexp="^(AG)?\\d+$")public String getAdGroupId() {
    return adGroupId;
  }

  @JsonProperty("ad_group_id")
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * The bid in micro currency.
   **/
  public ProductGroupPromotionCreateRequestElement bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "14000000", value = "The bid in micro currency.")
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  @JsonProperty("bid_in_micro_currency")
  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  /**
   * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
   **/
  public ProductGroupPromotionCreateRequestElement included(Boolean included) {
    this.included = included;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.")
  @JsonProperty("included")
  public Boolean getIncluded() {
    return included;
  }

  @JsonProperty("included")
  public void setIncluded(Boolean included) {
    this.included = included;
  }

  /**
   * The full product group definition path
   **/
  public ProductGroupPromotionCreateRequestElement definition(String definition) {
    this.definition = definition;
    return this;
  }

  
  @ApiModelProperty(example = "*_/product_type_0='kitchen'/product_type_1='beverage appliances'", value = "The full product group definition path")
  @JsonProperty("definition")
  public String getDefinition() {
    return definition;
  }

  @JsonProperty("definition")
  public void setDefinition(String definition) {
    this.definition = definition;
  }

  /**
   * The definition of the product group, relative to its parent - an attribute name/value pair
   **/
  public ProductGroupPromotionCreateRequestElement relativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
    return this;
  }

  
  @ApiModelProperty(example = "product_type_1='beverage appliances'", value = "The definition of the product group, relative to its parent - an attribute name/value pair")
  @JsonProperty("relative_definition")
  public String getRelativeDefinition() {
    return relativeDefinition;
  }

  @JsonProperty("relative_definition")
  public void setRelativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
  }

  /**
   * The parent Product Group ID of this Product Group
   **/
  public ProductGroupPromotionCreateRequestElement parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(example = "1231234", value = "The parent Product Group ID of this Product Group")
  @JsonProperty("parent_id")
   @Pattern(regexp="^\\d+$")public String getParentId() {
    return parentId;
  }

  @JsonProperty("parent_id")
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * Slideshow Collections Title
   **/
  public ProductGroupPromotionCreateRequestElement slideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
    return this;
  }

  
  @ApiModelProperty(example = "slideshow title", value = "Slideshow Collections Title")
  @JsonProperty("slideshow_collections_title")
  public String getSlideshowCollectionsTitle() {
    return slideshowCollectionsTitle;
  }

  @JsonProperty("slideshow_collections_title")
  public void setSlideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
  }

  /**
   * Slideshow Collections Description
   **/
  public ProductGroupPromotionCreateRequestElement slideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
    return this;
  }

  
  @ApiModelProperty(example = "slideshow description", value = "Slideshow Collections Description")
  @JsonProperty("slideshow_collections_description")
  public String getSlideshowCollectionsDescription() {
    return slideshowCollectionsDescription;
  }

  @JsonProperty("slideshow_collections_description")
  public void setSlideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
  }

  /**
   * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
   **/
  public ProductGroupPromotionCreateRequestElement isMdl(Boolean isMdl) {
    this.isMdl = isMdl;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog")
  @JsonProperty("is_mdl")
  public Boolean getIsMdl() {
    return isMdl;
  }

  @JsonProperty("is_mdl")
  public void setIsMdl(Boolean isMdl) {
    this.isMdl = isMdl;
  }

  /**
   **/
  public ProductGroupPromotionCreateRequestElement status(EntityStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Tracking template for proudct group promotions. 4000 limit
   **/
  public ProductGroupPromotionCreateRequestElement trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.pinterest.com", value = "Tracking template for proudct group promotions. 4000 limit")
  @JsonProperty("tracking_url")
  public String getTrackingUrl() {
    return trackingUrl;
  }

  @JsonProperty("tracking_url")
  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  /**
   * ID of the catalogs product group that this product group promotion references
   **/
  public ProductGroupPromotionCreateRequestElement catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "1231235", value = "ID of the catalogs product group that this product group promotion references")
  @JsonProperty("catalog_product_group_id")
   @Pattern(regexp="^\\d+$")public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }

  @JsonProperty("catalog_product_group_id")
  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  /**
   * Catalogs product group name
   **/
  public ProductGroupPromotionCreateRequestElement catalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
    return this;
  }

  
  @ApiModelProperty(example = "catalogProductGroupName", value = "Catalogs product group name")
  @JsonProperty("catalog_product_group_name")
  public String getCatalogProductGroupName() {
    return catalogProductGroupName;
  }

  @JsonProperty("catalog_product_group_name")
  public void setCatalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
  }

  /**
   * Hero Pin ID if this PG is promoted as a Collection
   **/
  public ProductGroupPromotionCreateRequestElement collectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
    return this;
  }

  
  @ApiModelProperty(example = "123123", value = "Hero Pin ID if this PG is promoted as a Collection")
  @JsonProperty("collections_hero_pin_id")
   @Pattern(regexp="^\\d+$")public String getCollectionsHeroPinId() {
    return collectionsHeroPinId;
  }

  @JsonProperty("collections_hero_pin_id")
  public void setCollectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
  }

  /**
   * Collections Hero Destination Url
   **/
  public ProductGroupPromotionCreateRequestElement collectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
    return this;
  }

  
  @ApiModelProperty(example = "http://www.pinterest.com", value = "Collections Hero Destination Url")
  @JsonProperty("collections_hero_destination_url")
  public String getCollectionsHeroDestinationUrl() {
    return collectionsHeroDestinationUrl;
  }

  @JsonProperty("collections_hero_destination_url")
  public void setCollectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
  }

  /**
   **/
  public ProductGroupPromotionCreateRequestElement gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }

  @JsonProperty("grid_click_type")
  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  /**
   **/
  public ProductGroupPromotionCreateRequestElement creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  @JsonProperty("creative_type")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

