package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.vertxweb.server.model.CatalogsFeedProcessingStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedIngestion   {
  
  private String id;
  private String feedId;
  private OffsetDateTime createdAt;
  private CatalogsFeedProcessingStatus status;

  public CatalogsFeedIngestion () {

  }

  public CatalogsFeedIngestion (String id, String feedId, OffsetDateTime createdAt, CatalogsFeedProcessingStatus status) {
    this.id = id;
    this.feedId = feedId;
    this.createdAt = createdAt;
    this.status = status;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

    
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("status")
  public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }
  public void setStatus(CatalogsFeedProcessingStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedIngestion catalogsFeedIngestion = (CatalogsFeedIngestion) o;
    return Objects.equals(id, catalogsFeedIngestion.id) &&
        Objects.equals(feedId, catalogsFeedIngestion.feedId) &&
        Objects.equals(createdAt, catalogsFeedIngestion.createdAt) &&
        Objects.equals(status, catalogsFeedIngestion.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, feedId, createdAt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
