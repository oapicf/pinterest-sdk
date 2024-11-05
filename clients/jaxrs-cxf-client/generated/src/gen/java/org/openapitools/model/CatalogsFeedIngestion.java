package org.openapitools.model;

import java.util.Date;
import org.openapitools.model.CatalogsFeedProcessingStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsFeedIngestion  {
  
  @ApiModelProperty(example = "01234", required = true, value = "")
  private String id;

  @ApiModelProperty(example = "56789", required = true, value = "")
  private String feedId;

  @ApiModelProperty(example = "2022-03-14T15:16:34Z", required = true, value = "")
  private Date createdAt;

  @ApiModelProperty(required = true, value = "")
  private CatalogsFeedProcessingStatus status;
 /**
   * Get id
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
   * Get feedId
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
   * Get createdAt
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
   * Get status
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
    return Objects.equals(this.id, catalogsFeedIngestion.id) &&
        Objects.equals(this.feedId, catalogsFeedIngestion.feedId) &&
        Objects.equals(this.createdAt, catalogsFeedIngestion.createdAt) &&
        Objects.equals(this.status, catalogsFeedIngestion.status);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

