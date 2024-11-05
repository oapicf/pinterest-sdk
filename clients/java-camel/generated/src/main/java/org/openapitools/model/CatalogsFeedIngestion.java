package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.CatalogsFeedProcessingStatus;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsFeedIngestion
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsFeedIngestion {

  private String id;

  private String feedId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date createdAt;

  private CatalogsFeedProcessingStatus status;

  public CatalogsFeedIngestion() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsFeedIngestion(String id, String feedId, Date createdAt, CatalogsFeedProcessingStatus status) {
    this.id = id;
    this.feedId = feedId;
    this.createdAt = createdAt;
    this.status = status;
  }

  public CatalogsFeedIngestion id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull 
  @Schema(name = "id", example = "01234", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogsFeedIngestion feedId(String feedId) {
    this.feedId = feedId;
    return this;
  }

  /**
   * Get feedId
   * @return feedId
   */
  @NotNull 
  @Schema(name = "feed_id", example = "56789", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("feed_id")
  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public CatalogsFeedIngestion createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @NotNull @Valid 
  @Schema(name = "created_at", example = "2022-03-14T15:16:34Z", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogsFeedIngestion status(CatalogsFeedProcessingStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

