package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsFeedVideoCounts   {
  
  private Integer ingestedVideos;
  private Integer notIngestedVideos;
  private Integer totalVideos;

  public CatalogsFeedVideoCounts () {

  }

  public CatalogsFeedVideoCounts (Integer ingestedVideos, Integer notIngestedVideos, Integer totalVideos) {
    this.ingestedVideos = ingestedVideos;
    this.notIngestedVideos = notIngestedVideos;
    this.totalVideos = totalVideos;
  }

    
  @JsonProperty("ingested_videos")
  public Integer getIngestedVideos() {
    return ingestedVideos;
  }
  public void setIngestedVideos(Integer ingestedVideos) {
    this.ingestedVideos = ingestedVideos;
  }

    
  @JsonProperty("not_ingested_videos")
  public Integer getNotIngestedVideos() {
    return notIngestedVideos;
  }
  public void setNotIngestedVideos(Integer notIngestedVideos) {
    this.notIngestedVideos = notIngestedVideos;
  }

    
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
    return Objects.equals(ingestedVideos, catalogsFeedVideoCounts.ingestedVideos) &&
        Objects.equals(notIngestedVideos, catalogsFeedVideoCounts.notIngestedVideos) &&
        Objects.equals(totalVideos, catalogsFeedVideoCounts.totalVideos);
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
