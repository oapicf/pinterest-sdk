package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class DynamicTitlesUploadURL implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
   */
  @JsonProperty("existing_filename")
  private String existingFilename;

  /**
   * Unique identifier for this upload session. Must be passed to the process endpoint.
   */
  @JsonProperty("request_id")
  private String requestId;

  /**
   * Pre-signed S3 PUT URL to upload the reviewed CSV file.
   */
  @JsonProperty("upload_url")
  private String uploadUrl;

  /**
   * If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
   * @return existingFilename
   */
  public String getExistingFilename() {
    return existingFilename;
  }

  public void setExistingFilename(String existingFilename) {
    this.existingFilename = existingFilename;
  }

  /**
   * Unique identifier for this upload session. Must be passed to the process endpoint.
   * @return requestId
   */
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Pre-signed S3 PUT URL to upload the reviewed CSV file.
   * @return uploadUrl
   */
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
