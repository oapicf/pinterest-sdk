package apimodels;

import apimodels.Board;
import apimodels.EntityStatus;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * non-promoted catalog product group entity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogProductGroup   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("merchant_id")
  @Pattern(regexp="^\\d+$")

  private String merchantId;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("filters")
  
  private Object filters;

  @JsonProperty("filter_v2")
  
  private Object filterV2;

  @JsonProperty("type")
  @Valid

  private Board type;

  @JsonProperty("status")
  @Valid

  private EntityStatus status;

  @JsonProperty("feed_profile_id")
  @Pattern(regexp="^\\d+$")

  private String feedProfileId;

  @JsonProperty("created_at")
  
  private Integer createdAt;

  @JsonProperty("last_update")
  
  private Integer lastUpdate;

  @JsonProperty("product_count")
  
  private Integer productCount;

  @JsonProperty("featured_position")
  
  private Integer featuredPosition;

  public CatalogProductGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the catalog product group.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogProductGroup merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Merchant ID pertaining to the owner of the catalog product group.
   * @return merchantId
  **/
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public CatalogProductGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of catalog product group
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogProductGroup filters(Object filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Object holding a list of filters
   * @return filters
  **/
  public Object getFilters() {
    return filters;
  }

  public void setFilters(Object filters) {
    this.filters = filters;
  }

  public CatalogProductGroup filterV2(Object filterV2) {
    this.filterV2 = filterV2;
    return this;
  }

   /**
   * Object holding a list of filters
   * @return filterV2
  **/
  public Object getFilterV2() {
    return filterV2;
  }

  public void setFilterV2(Object filterV2) {
    this.filterV2 = filterV2;
  }

  public CatalogProductGroup type(Board type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public Board getType() {
    return type;
  }

  public void setType(Board type) {
    this.type = type;
  }

  public CatalogProductGroup status(EntityStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public CatalogProductGroup feedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
    return this;
  }

   /**
   * id of the feed profile belonging to this catalog product group
   * @return feedProfileId
  **/
  public String getFeedProfileId() {
    return feedProfileId;
  }

  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

  public CatalogProductGroup createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Unix timestamp in seconds of when catalog product group was created.
   * @return createdAt
  **/
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogProductGroup lastUpdate(Integer lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Unix timestamp in seconds of last time catalog product group was updated.
   * @return lastUpdate
  **/
  public Integer getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Integer lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public CatalogProductGroup productCount(Integer productCount) {
    this.productCount = productCount;
    return this;
  }

   /**
   * Amount of products in the catalog product group
   * @return productCount
  **/
  public Integer getProductCount() {
    return productCount;
  }

  public void setProductCount(Integer productCount) {
    this.productCount = productCount;
  }

  public CatalogProductGroup featuredPosition(Integer featuredPosition) {
    this.featuredPosition = featuredPosition;
    return this;
  }

   /**
   * index of the featured position of the catalog product group
   * @return featuredPosition
  **/
  public Integer getFeaturedPosition() {
    return featuredPosition;
  }

  public void setFeaturedPosition(Integer featuredPosition) {
    this.featuredPosition = featuredPosition;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogProductGroup catalogProductGroup = (CatalogProductGroup) o;
    return Objects.equals(id, catalogProductGroup.id) &&
        Objects.equals(merchantId, catalogProductGroup.merchantId) &&
        Objects.equals(name, catalogProductGroup.name) &&
        Objects.equals(filters, catalogProductGroup.filters) &&
        Objects.equals(filterV2, catalogProductGroup.filterV2) &&
        Objects.equals(type, catalogProductGroup.type) &&
        Objects.equals(status, catalogProductGroup.status) &&
        Objects.equals(feedProfileId, catalogProductGroup.feedProfileId) &&
        Objects.equals(createdAt, catalogProductGroup.createdAt) &&
        Objects.equals(lastUpdate, catalogProductGroup.lastUpdate) &&
        Objects.equals(productCount, catalogProductGroup.productCount) &&
        Objects.equals(featuredPosition, catalogProductGroup.featuredPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, merchantId, name, filters, filterV2, type, status, feedProfileId, createdAt, lastUpdate, productCount, featuredPosition);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogProductGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    filterV2: ").append(toIndentedString(filterV2)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    feedProfileId: ").append(toIndentedString(feedProfileId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    productCount: ").append(toIndentedString(productCount)).append("\n");
    sb.append("    featuredPosition: ").append(toIndentedString(featuredPosition)).append("\n");
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

