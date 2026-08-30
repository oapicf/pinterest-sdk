package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CatalogsFeedIngestion")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsFeedIngestion   {
  private Date createdAt;
  private String feedId;
  private String id;
  private CatalogsFeedProcessingStatus status;

  public CatalogsFeedIngestion() {
  }

  @JsonCreator
  public CatalogsFeedIngestion(
    @JsonProperty(required = true, value = "created_at") Date createdAt,
    @JsonProperty(required = true, value = "feed_id") String feedId,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "status") CatalogsFeedProcessingStatus status
  ) {
    this.createdAt = createdAt;
    this.feedId = feedId;
    this.id = id;
    this.status = status;
  }

  /**
   * Timestamp of the feed ingestion.
   **/
  public CatalogsFeedIngestion createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "2022-03-14T15:15:22Z", required = true, value = "Timestamp of the feed ingestion.")
  @JsonProperty(required = true, value = "created_at")
  @NotNull public Date getCreatedAt() {
    return createdAt;
  }

  @JsonProperty(required = true, value = "created_at")
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Catalog Feed id pertaining to the feed ingestion.
   **/
  public CatalogsFeedIngestion feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Catalog Feed id pertaining to the feed ingestion.")
  @JsonProperty(required = true, value = "feed_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getFeedId() {
    return feedId;
  }

  @JsonProperty(required = true, value = "feed_id")
  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  /**
   * Unique identifier of a feed ingestion.
   **/
  public CatalogsFeedIngestion id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", required = true, value = "Unique identifier of a feed ingestion.")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Status of the feed ingestion.
   **/
  public CatalogsFeedIngestion status(CatalogsFeedProcessingStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Status of the feed ingestion.")
  @JsonProperty(required = true, value = "status")
  @NotNull public CatalogsFeedProcessingStatus getStatus() {
    return status;
  }

  @JsonProperty(required = true, value = "status")
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
