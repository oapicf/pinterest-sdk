package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.Board;
import org.openapitools.vertxweb.server.model.EntityStatus;

/**
 * non-promoted catalog product group entity
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogProductGroup   {
  
  private String id;
  private String merchantId;
  private String name;
  private Object filters;
  private Object filterV2;
  private Board type;
  private EntityStatus status;
  private String feedProfileId;
  private Integer createdAt;
  private Integer lastUpdate;
  private Integer productCount;
  private Integer featuredPosition;

  public CatalogProductGroup () {

  }

  public CatalogProductGroup (String id, String merchantId, String name, Object filters, Object filterV2, Board type, EntityStatus status, String feedProfileId, Integer createdAt, Integer lastUpdate, Integer productCount, Integer featuredPosition) {
    this.id = id;
    this.merchantId = merchantId;
    this.name = name;
    this.filters = filters;
    this.filterV2 = filterV2;
    this.type = type;
    this.status = status;
    this.feedProfileId = feedProfileId;
    this.createdAt = createdAt;
    this.lastUpdate = lastUpdate;
    this.productCount = productCount;
    this.featuredPosition = featuredPosition;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("merchant_id")
  public String getMerchantId() {
    return merchantId;
  }
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("filters")
  public Object getFilters() {
    return filters;
  }
  public void setFilters(Object filters) {
    this.filters = filters;
  }

    
  @JsonProperty("filter_v2")
  public Object getFilterV2() {
    return filterV2;
  }
  public void setFilterV2(Object filterV2) {
    this.filterV2 = filterV2;
  }

    
  @JsonProperty("type")
  public Board getType() {
    return type;
  }
  public void setType(Board type) {
    this.type = type;
  }

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("feed_profile_id")
  public String getFeedProfileId() {
    return feedProfileId;
  }
  public void setFeedProfileId(String feedProfileId) {
    this.feedProfileId = feedProfileId;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("last_update")
  public Integer getLastUpdate() {
    return lastUpdate;
  }
  public void setLastUpdate(Integer lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

    
  @JsonProperty("product_count")
  public Integer getProductCount() {
    return productCount;
  }
  public void setProductCount(Integer productCount) {
    this.productCount = productCount;
  }

    
  @JsonProperty("featured_position")
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
