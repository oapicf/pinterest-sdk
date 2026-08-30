package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.CatalogsFeedProcessingStatus;

/**
 * CatalogsFeedIngestion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsFeedIngestion   {
  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("feed_id")
  private String feedId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("status")
  private CatalogsFeedProcessingStatus status;

  public CatalogsFeedIngestion createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of the feed ingestion.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "Timestamp of the feed ingestion.")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogsFeedIngestion feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

   /**
   * Catalog Feed id pertaining to the feed ingestion.
   * @return feedId
  **/
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog Feed id pertaining to the feed ingestion.")
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsFeedIngestion id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of a feed ingestion.
   * @return id
  **/
  @ApiModelProperty(example = "2680059592705", required = true, value = "Unique identifier of a feed ingestion.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsFeedIngestion status(CatalogsFeedProcessingStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the feed ingestion.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the feed ingestion.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

