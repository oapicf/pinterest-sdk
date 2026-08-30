package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DynamicTitlesUploadURL  {
  
 /**
  * If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
  */
  @ApiModelProperty(example = "aid-549755814107/ad_group-1099511703602/validated_approvals.csv", value = "If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.")

  private String existingFilename;

 /**
  * Unique identifier for this upload session. Must be passed to the process endpoint.
  */
  @ApiModelProperty(example = "549755814107-1099511703602-1714300000-abc123", required = true, value = "Unique identifier for this upload session. Must be passed to the process endpoint.")

  private String requestId;

 /**
  * Pre-signed S3 PUT URL to upload the reviewed CSV file.
  */
  @ApiModelProperty(example = "https://s3.amazonaws.com/bucket/dynamic_titles/candidate.csv?AWSAccessKeyId=...", required = true, value = "Pre-signed S3 PUT URL to upload the reviewed CSV file.")

  private String uploadUrl;
 /**
   * If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
   * @return existingFilename
  **/
  @JsonProperty("existing_filename")
  public String getExistingFilename() {
    return existingFilename;
  }

  public void setExistingFilename(String existingFilename) {
    this.existingFilename = existingFilename;
  }

  public DynamicTitlesUploadURL existingFilename(String existingFilename) {
    this.existingFilename = existingFilename;
    return this;
  }

 /**
   * Unique identifier for this upload session. Must be passed to the process endpoint.
   * @return requestId
  **/
  @JsonProperty("request_id")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DynamicTitlesUploadURL requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

 /**
   * Pre-signed S3 PUT URL to upload the reviewed CSV file.
   * @return uploadUrl
  **/
  @JsonProperty("upload_url")
  public String getUploadUrl() {
    return uploadUrl;
  }

  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }

  public DynamicTitlesUploadURL uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
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
    DynamicTitlesUploadURL dynamicTitlesUploadURL = (DynamicTitlesUploadURL) o;
    return Objects.equals(this.existingFilename, dynamicTitlesUploadURL.existingFilename) &&
        Objects.equals(this.requestId, dynamicTitlesUploadURL.requestId) &&
        Objects.equals(this.uploadUrl, dynamicTitlesUploadURL.uploadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(existingFilename, requestId, uploadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTitlesUploadURL {\n");
    
    sb.append("    existingFilename: ").append(toIndentedString(existingFilename)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
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

