/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.Date;
import org.openapitools.client.model.CatalogsFeedProcessingStatus;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CatalogsFeedIngestion {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("feed_id")
  private String feedId = null;
  @SerializedName("created_at")
  private Date createdAt = null;
  @SerializedName("status")
  private CatalogsFeedProcessingStatus status = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFeedId() {
    return feedId;
  }
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    return (this.id == null ? catalogsFeedIngestion.id == null : this.id.equals(catalogsFeedIngestion.id)) &&
        (this.feedId == null ? catalogsFeedIngestion.feedId == null : this.feedId.equals(catalogsFeedIngestion.feedId)) &&
        (this.createdAt == null ? catalogsFeedIngestion.createdAt == null : this.createdAt.equals(catalogsFeedIngestion.createdAt)) &&
        (this.status == null ? catalogsFeedIngestion.status == null : this.status.equals(catalogsFeedIngestion.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.feedId == null ? 0: this.feedId.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedIngestion {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  feedId: ").append(feedId).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
