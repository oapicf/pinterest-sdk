/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.S3FilePart;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class S3MultipartUploadData   {
  
  private List<S3FilePart> fileParts = new ArrayList<>();

  /**
   * Array of file parts with pre-signed URLs.
   */
  public S3MultipartUploadData fileParts(List<S3FilePart> fileParts) {
    this.fileParts = fileParts;
    return this;
  }

  
  @ApiModelProperty(value = "Array of file parts with pre-signed URLs.")
  @JsonProperty("file_parts")
  public List<S3FilePart> getFileParts() {
    return fileParts;
  }
  public void setFileParts(List<S3FilePart> fileParts) {
    this.fileParts = fileParts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3MultipartUploadData s3MultipartUploadData = (S3MultipartUploadData) o;
    return Objects.equals(fileParts, s3MultipartUploadData.fileParts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileParts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3MultipartUploadData {\n");
    
    sb.append("    fileParts: ").append(toIndentedString(fileParts)).append("\n");
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

