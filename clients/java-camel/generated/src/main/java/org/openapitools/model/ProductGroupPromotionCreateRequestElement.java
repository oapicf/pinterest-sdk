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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProductGroupPromotionCreateRequestElement
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductGroupPromotionCreateRequestElement {

  private String id;

  private String adGroupId;

  private JsonNullable<Integer> bidInMicroCurrency = JsonNullable.<Integer>undefined();

  private JsonNullable<Boolean> included = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> definition = JsonNullable.<String>undefined();

  private JsonNullable<String> relativeDefinition = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> parentId = JsonNullable.<String>undefined();

  private JsonNullable<String> slideshowCollectionsTitle = JsonNullable.<String>undefined();

  private JsonNullable<String> slideshowCollectionsDescription = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> isMdl = JsonNullable.<Boolean>undefined();

  private EntityStatus status;

  private JsonNullable<String> trackingUrl = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> catalogProductGroupId = JsonNullable.<String>undefined();

  private JsonNullable<String> catalogProductGroupName = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> collectionsHeroPinId = JsonNullable.<String>undefined();

  private JsonNullable<String> collectionsHeroDestinationUrl = JsonNullable.<String>undefined();

  private JsonNullable<GridClickType> gridClickType = JsonNullable.<GridClickType>undefined();

  private CreativeType creativeType;

  public ProductGroupPromotionCreateRequestElement id(String id) {
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
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductGroupPromotionCreateRequestElement adGroupId(String adGroupId) {
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
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ProductGroupPromotionCreateRequestElement bidInMicroCurrency(Integer bidInMicroCurrency) {
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

  public ProductGroupPromotionCreateRequestElement included(Boolean included) {
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

  public ProductGroupPromotionCreateRequestElement definition(String definition) {
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

  public ProductGroupPromotionCreateRequestElement relativeDefinition(String relativeDefinition) {
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

  public ProductGroupPromotionCreateRequestElement parentId(String parentId) {
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

  public ProductGroupPromotionCreateRequestElement slideshowCollectionsTitle(String slideshowCollectionsTitle) {
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

  public ProductGroupPromotionCreateRequestElement slideshowCollectionsDescription(String slideshowCollectionsDescription) {
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

  public ProductGroupPromotionCreateRequestElement isMdl(Boolean isMdl) {
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

  public ProductGroupPromotionCreateRequestElement status(EntityStatus status) {
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
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public ProductGroupPromotionCreateRequestElement trackingUrl(String trackingUrl) {
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

  public ProductGroupPromotionCreateRequestElement catalogProductGroupId(String catalogProductGroupId) {
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

  public ProductGroupPromotionCreateRequestElement catalogProductGroupName(String catalogProductGroupName) {
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

  public ProductGroupPromotionCreateRequestElement collectionsHeroPinId(String collectionsHeroPinId) {
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

  public ProductGroupPromotionCreateRequestElement collectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
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

  public ProductGroupPromotionCreateRequestElement gridClickType(GridClickType gridClickType) {
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

  public ProductGroupPromotionCreateRequestElement creativeType(CreativeType creativeType) {
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
    return Objects.equals(this.id, productGroupPromotionCreateRequestElement.id) &&
        Objects.equals(this.adGroupId, productGroupPromotionCreateRequestElement.adGroupId) &&
        equalsNullable(this.bidInMicroCurrency, productGroupPromotionCreateRequestElement.bidInMicroCurrency) &&
        equalsNullable(this.included, productGroupPromotionCreateRequestElement.included) &&
        equalsNullable(this.definition, productGroupPromotionCreateRequestElement.definition) &&
        equalsNullable(this.relativeDefinition, productGroupPromotionCreateRequestElement.relativeDefinition) &&
        equalsNullable(this.parentId, productGroupPromotionCreateRequestElement.parentId) &&
        equalsNullable(this.slideshowCollectionsTitle, productGroupPromotionCreateRequestElement.slideshowCollectionsTitle) &&
        equalsNullable(this.slideshowCollectionsDescription, productGroupPromotionCreateRequestElement.slideshowCollectionsDescription) &&
        equalsNullable(this.isMdl, productGroupPromotionCreateRequestElement.isMdl) &&
        Objects.equals(this.status, productGroupPromotionCreateRequestElement.status) &&
        equalsNullable(this.trackingUrl, productGroupPromotionCreateRequestElement.trackingUrl) &&
        equalsNullable(this.catalogProductGroupId, productGroupPromotionCreateRequestElement.catalogProductGroupId) &&
        equalsNullable(this.catalogProductGroupName, productGroupPromotionCreateRequestElement.catalogProductGroupName) &&
        equalsNullable(this.collectionsHeroPinId, productGroupPromotionCreateRequestElement.collectionsHeroPinId) &&
        equalsNullable(this.collectionsHeroDestinationUrl, productGroupPromotionCreateRequestElement.collectionsHeroDestinationUrl) &&
        equalsNullable(this.gridClickType, productGroupPromotionCreateRequestElement.gridClickType) &&
        Objects.equals(this.creativeType, productGroupPromotionCreateRequestElement.creativeType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, adGroupId, hashCodeNullable(bidInMicroCurrency), hashCodeNullable(included), hashCodeNullable(definition), hashCodeNullable(relativeDefinition), hashCodeNullable(parentId), hashCodeNullable(slideshowCollectionsTitle), hashCodeNullable(slideshowCollectionsDescription), hashCodeNullable(isMdl), status, hashCodeNullable(trackingUrl), hashCodeNullable(catalogProductGroupId), hashCodeNullable(catalogProductGroupName), hashCodeNullable(collectionsHeroPinId), hashCodeNullable(collectionsHeroDestinationUrl), hashCodeNullable(gridClickType), creativeType);
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

