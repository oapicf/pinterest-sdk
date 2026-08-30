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
 * DynamicTitlesUploadURL
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DynamicTitlesUploadURL {

  private String existingFilename;

  private String requestId;

  private String uploadUrl;

  public DynamicTitlesUploadURL() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DynamicTitlesUploadURL(String requestId, String uploadUrl) {
    this.requestId = requestId;
    this.uploadUrl = uploadUrl;
  }

  public DynamicTitlesUploadURL existingFilename(String existingFilename) {
    this.existingFilename = existingFilename;
    return this;
  }

  /**
   * If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
   * @return existingFilename
   */
  
  @Schema(name = "existing_filename", example = "aid-549755814107/ad_group-1099511703602/validated_approvals.csv", description = "If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("existing_filename")
  public String getExistingFilename() {
    return existingFilename;
  }

  public void setExistingFilename(String existingFilename) {
    this.existingFilename = existingFilename;
  }

  public DynamicTitlesUploadURL requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * Unique identifier for this upload session. Must be passed to the process endpoint.
   * @return requestId
   */
  @NotNull 
  @Schema(name = "request_id", example = "549755814107-1099511703602-1714300000-abc123", description = "Unique identifier for this upload session. Must be passed to the process endpoint.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("request_id")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public DynamicTitlesUploadURL uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

  /**
   * Pre-signed S3 PUT URL to upload the reviewed CSV file.
   * @return uploadUrl
   */
  @NotNull 
  @Schema(name = "upload_url", example = "https://s3.amazonaws.com/bucket/dynamic_titles/candidate.csv?AWSAccessKeyId=...", description = "Pre-signed S3 PUT URL to upload the reviewed CSV file.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("upload_url")
  public String getUploadUrl() {
    return uploadUrl;
  }

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

