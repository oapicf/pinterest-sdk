package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.S3FilePart;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class S3MultipartUploadData  {
  
 /**
  * Array of file parts with pre-signed URLs.
  */
  @ApiModelProperty(value = "Array of file parts with pre-signed URLs.")

  private List<S3FilePart> fileParts = new ArrayList<>();
 /**
   * Array of file parts with pre-signed URLs.
   * @return fileParts
  **/
  @JsonProperty("file_parts")
  public List<S3FilePart> getFileParts() {
    return fileParts;
  }

  public void setFileParts(List<S3FilePart> fileParts) {
    this.fileParts = fileParts;
  }

  public S3MultipartUploadData fileParts(List<S3FilePart> fileParts) {
    this.fileParts = fileParts;
    return this;
  }

  public S3MultipartUploadData addFilePartsItem(S3FilePart filePartsItem) {
    this.fileParts.add(filePartsItem);
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
    S3MultipartUploadData s3MultipartUploadData = (S3MultipartUploadData) o;
    return Objects.equals(this.fileParts, s3MultipartUploadData.fileParts);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

