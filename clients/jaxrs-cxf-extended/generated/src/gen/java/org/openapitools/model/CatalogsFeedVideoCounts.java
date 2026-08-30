package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 */
@ApiModel(description="Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.")

public class CatalogsFeedVideoCounts  {
  
 /**
  * The number of videos successfully ingested from the feed file.
  */
  @ApiModelProperty(value = "The number of videos successfully ingested from the feed file.")
  private Integer ingestedVideos;

 /**
  * The number of videos that were not ingested from the feed file.
  */
  @ApiModelProperty(value = "The number of videos that were not ingested from the feed file.")
  private Integer notIngestedVideos;

 /**
  * The number of videos in the feed file.
  */
  @ApiModelProperty(value = "The number of videos in the feed file.")
  private Integer totalVideos;
 /**
  * The number of videos successfully ingested from the feed file.
  * @return ingestedVideos
  */
  @JsonProperty("ingested_videos")
  public Integer getIngestedVideos() {
    return ingestedVideos;
  }

  /**
   * Sets the <code>ingestedVideos</code> property.
   */
 public void setIngestedVideos(Integer ingestedVideos) {
    this.ingestedVideos = ingestedVideos;
  }

  /**
   * Sets the <code>ingestedVideos</code> property.
   */
  public CatalogsFeedVideoCounts ingestedVideos(Integer ingestedVideos) {
    this.ingestedVideos = ingestedVideos;
    return this;
  }

 /**
  * The number of videos that were not ingested from the feed file.
  * @return notIngestedVideos
  */
  @JsonProperty("not_ingested_videos")
  public Integer getNotIngestedVideos() {
    return notIngestedVideos;
  }

  /**
   * Sets the <code>notIngestedVideos</code> property.
   */
 public void setNotIngestedVideos(Integer notIngestedVideos) {
    this.notIngestedVideos = notIngestedVideos;
  }

  /**
   * Sets the <code>notIngestedVideos</code> property.
   */
  public CatalogsFeedVideoCounts notIngestedVideos(Integer notIngestedVideos) {
    this.notIngestedVideos = notIngestedVideos;
    return this;
  }

 /**
  * The number of videos in the feed file.
  * @return totalVideos
  */
  @JsonProperty("total_videos")
  public Integer getTotalVideos() {
    return totalVideos;
  }

  /**
   * Sets the <code>totalVideos</code> property.
   */
 public void setTotalVideos(Integer totalVideos) {
    this.totalVideos = totalVideos;
  }

  /**
   * Sets the <code>totalVideos</code> property.
   */
  public CatalogsFeedVideoCounts totalVideos(Integer totalVideos) {
    this.totalVideos = totalVideos;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

