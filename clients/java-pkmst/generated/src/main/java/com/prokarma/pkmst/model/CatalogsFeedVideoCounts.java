package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 */
@ApiModel(description = "Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsFeedVideoCounts   {
  @JsonProperty("ingested_videos")
  private Integer ingestedVideos;

  @JsonProperty("not_ingested_videos")
  private Integer notIngestedVideos;

  @JsonProperty("total_videos")
  private Integer totalVideos;

  public CatalogsFeedVideoCounts ingestedVideos(Integer ingestedVideos) {
    this.ingestedVideos = ingestedVideos;
    return this;
  }

  /**
   * The number of videos successfully ingested from the feed file.
   * @return ingestedVideos
   */
  @ApiModelProperty(value = "The number of videos successfully ingested from the feed file.")
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
  @ApiModelProperty(value = "The number of videos that were not ingested from the feed file.")
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
  @ApiModelProperty(value = "The number of videos in the feed file.")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

