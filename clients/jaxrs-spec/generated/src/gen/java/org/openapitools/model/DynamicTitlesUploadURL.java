package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("DynamicTitlesUploadURL")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DynamicTitlesUploadURL   {
  private String existingFilename;
  private String requestId;
  private String uploadUrl;

  public DynamicTitlesUploadURL() {
  }

  @JsonCreator
  public DynamicTitlesUploadURL(
    @JsonProperty(required = true, value = "request_id") String requestId,
    @JsonProperty(required = true, value = "upload_url") String uploadUrl
  ) {
    this.requestId = requestId;
    this.uploadUrl = uploadUrl;
  }

  /**
   * If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
   **/
  public DynamicTitlesUploadURL existingFilename(String existingFilename) {
    this.existingFilename = existingFilename;
    return this;
  }

  
  @ApiModelProperty(example = "aid-549755814107/ad_group-1099511703602/validated_approvals.csv", value = "If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.")
  @JsonProperty("existing_filename")
  public String getExistingFilename() {
    return existingFilename;
  }

  @JsonProperty("existing_filename")
  public void setExistingFilename(String existingFilename) {
    this.existingFilename = existingFilename;
  }

  /**
   * Unique identifier for this upload session. Must be passed to the process endpoint.
   **/
  public DynamicTitlesUploadURL requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  
  @ApiModelProperty(example = "549755814107-1099511703602-1714300000-abc123", required = true, value = "Unique identifier for this upload session. Must be passed to the process endpoint.")
  @JsonProperty(required = true, value = "request_id")
  @NotNull public String getRequestId() {
    return requestId;
  }

  @JsonProperty(required = true, value = "request_id")
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Pre-signed S3 PUT URL to upload the reviewed CSV file.
   **/
  public DynamicTitlesUploadURL uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://s3.amazonaws.com/bucket/dynamic_titles/candidate.csv?AWSAccessKeyId=...", required = true, value = "Pre-signed S3 PUT URL to upload the reviewed CSV file.")
  @JsonProperty(required = true, value = "upload_url")
  @NotNull public String getUploadUrl() {
    return uploadUrl;
  }

  @JsonProperty(required = true, value = "upload_url")
  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
