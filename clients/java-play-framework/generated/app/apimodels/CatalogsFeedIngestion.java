package apimodels;

import apimodels.CatalogsFeedProcessingStatus;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsFeedIngestion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsFeedIngestion   {
  @JsonProperty("created_at")
  @NotNull
@Valid

  private OffsetDateTime createdAt;

  @JsonProperty("feed_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String feedId;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("status")
  @NotNull
@Valid

  private CatalogsFeedProcessingStatus status;

  public CatalogsFeedIngestion createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp of the feed ingestion.
   * @return createdAt
  **/
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
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
    return Objects.equals(createdAt, catalogsFeedIngestion.createdAt) &&
        Objects.equals(feedId, catalogsFeedIngestion.feedId) &&
        Objects.equals(id, catalogsFeedIngestion.id) &&
        Objects.equals(status, catalogsFeedIngestion.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, feedId, id, status);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

