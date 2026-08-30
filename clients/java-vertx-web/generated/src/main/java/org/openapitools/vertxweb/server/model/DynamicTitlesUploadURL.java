package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DynamicTitlesUploadURL   {
  
  private String existingFilename;
  private String requestId;
  private String uploadUrl;

  public DynamicTitlesUploadURL () {

  }

  public DynamicTitlesUploadURL (String existingFilename, String requestId, String uploadUrl) {
    this.existingFilename = existingFilename;
    this.requestId = requestId;
    this.uploadUrl = uploadUrl;
  }

    
  @JsonProperty("existing_filename")
  public String getExistingFilename() {
    return existingFilename;
  }
  public void setExistingFilename(String existingFilename) {
    this.existingFilename = existingFilename;
  }

    
  @JsonProperty("request_id")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

    
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
    return Objects.equals(existingFilename, dynamicTitlesUploadURL.existingFilename) &&
        Objects.equals(requestId, dynamicTitlesUploadURL.requestId) &&
        Objects.equals(uploadUrl, dynamicTitlesUploadURL.uploadUrl);
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
