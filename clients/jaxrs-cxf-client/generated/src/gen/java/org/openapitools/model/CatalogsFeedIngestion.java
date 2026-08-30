package org.openapitools.model;

import java.util.Date;
import org.openapitools.model.CatalogsFeedProcessingStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedIngestion  {
  
 /**
  * Timestamp of the feed ingestion.
  */
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "Timestamp of the feed ingestion.")

  private Date createdAt;

 /**
  * Catalog Feed id pertaining to the feed ingestion.
  */
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog Feed id pertaining to the feed ingestion.")

  private String feedId;

 /**
  * Unique identifier of a feed ingestion.
  */
  @ApiModelProperty(example = "2680059592705", required = true, value = "Unique identifier of a feed ingestion.")

  private String id;

 /**
  * Status of the feed ingestion.
  */
  @ApiModelProperty(required = true, value = "Status of the feed ingestion.")

  private CatalogsFeedProcessingStatus status;
 /**
   * Timestamp of the feed ingestion.
   * @return createdAt
  **/
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogsFeedIngestion createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * Catalog Feed id pertaining to the feed ingestion.
   * @return feedId
  **/
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsFeedIngestion feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

 /**
   * Unique identifier of a feed ingestion.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsFeedIngestion id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Status of the feed ingestion.
   * @return status
  **/
  @JsonProperty("status")
  public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }

  public void setStatus(CatalogsFeedProcessingStatus status) {
    this.status = status;
  }

  public CatalogsFeedIngestion status(CatalogsFeedProcessingStatus status) {
    this.status = status;
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
    CatalogsFeedIngestion catalogsFeedIngestion = (CatalogsFeedIngestion) o;
    return Objects.equals(this.createdAt, catalogsFeedIngestion.createdAt) &&
        Objects.equals(this.feedId, catalogsFeedIngestion.feedId) &&
        Objects.equals(this.id, catalogsFeedIngestion.id) &&
        Objects.equals(this.status, catalogsFeedIngestion.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, feedId, id, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestion {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

