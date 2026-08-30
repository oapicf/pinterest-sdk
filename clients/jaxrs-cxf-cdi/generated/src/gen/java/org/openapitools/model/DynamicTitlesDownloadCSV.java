package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class DynamicTitlesDownloadCSV   {
  
  private String downloadUrl;

  /**
   * Pre-signed S3 URL to download the CSV file.
   **/
  public DynamicTitlesDownloadCSV downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://s3.amazonaws.com/bucket/dynamic_titles/review.csv?AWSAccessKeyId=...", value = "Pre-signed S3 URL to download the CSV file.")
  @JsonProperty("download_url")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicTitlesDownloadCSV dynamicTitlesDownloadCSV = (DynamicTitlesDownloadCSV) o;
    return Objects.equals(this.downloadUrl, dynamicTitlesDownloadCSV.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTitlesDownloadCSV {\n");
    
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

