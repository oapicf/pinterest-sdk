package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 */

@Schema(name = "CatalogsFeedVideoCounts", description = "Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsFeedVideoCounts {

  private Integer ingestedVideos;

  private Integer notIngestedVideos;

  private Integer totalVideos;

  public CatalogsFeedVideoCounts ingestedVideos(Integer ingestedVideos) {
    this.ingestedVideos = ingestedVideos;
    return this;
  }

  /**
   * The number of videos successfully ingested from the feed file.
   * @return ingestedVideos
   */
  
  @Schema(name = "ingested_videos", description = "The number of videos successfully ingested from the feed file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ingested_videos")
  public Integer getIngestedVideos() {
    return ingestedVideos;
  }

  public void setIngestedVideos(Integer ingestedVideos) {
    this.ingestedVideos = ingestedVideos;
  }

  public CatalogsFeedVideoCounts notIngestedVideos(Integer notIngestedVideos) {
    this.notIngestedVideos = notIngestedVideos;
    return this;
  }

  /**
   * The number of videos that were not ingested from the feed file.
   * @return notIngestedVideos
   */
  
  @Schema(name = "not_ingested_videos", description = "The number of videos that were not ingested from the feed file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("not_ingested_videos")
  public Integer getNotIngestedVideos() {
    return notIngestedVideos;
  }

  public void setNotIngestedVideos(Integer notIngestedVideos) {
    this.notIngestedVideos = notIngestedVideos;
  }

  public CatalogsFeedVideoCounts totalVideos(Integer totalVideos) {
    this.totalVideos = totalVideos;
    return this;
  }

  /**
   * The number of videos in the feed file.
   * @return totalVideos
   */
  
  @Schema(name = "total_videos", description = "The number of videos in the feed file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_videos")
  public Integer getTotalVideos() {
    return totalVideos;
  }

  public void setTotalVideos(Integer totalVideos) {
    this.totalVideos = totalVideos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedVideoCounts catalogsFeedVideoCounts = (CatalogsFeedVideoCounts) o;
    return Objects.equals(this.ingestedVideos, catalogsFeedVideoCounts.ingestedVideos) &&
        Objects.equals(this.notIngestedVideos, catalogsFeedVideoCounts.notIngestedVideos) &&
        Objects.equals(this.totalVideos, catalogsFeedVideoCounts.totalVideos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingestedVideos, notIngestedVideos, totalVideos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedVideoCounts {\n");
    sb.append("    ingestedVideos: ").append(toIndentedString(ingestedVideos)).append("\n");
    sb.append("    notIngestedVideos: ").append(toIndentedString(notIngestedVideos)).append("\n");
    sb.append("    totalVideos: ").append(toIndentedString(totalVideos)).append("\n");
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

