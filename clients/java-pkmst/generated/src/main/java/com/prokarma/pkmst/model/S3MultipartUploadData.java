package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.S3FilePart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * S3MultipartUploadData
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class S3MultipartUploadData   {
  @JsonProperty("file_parts")
  
  private List<S3FilePart> fileParts = null;

  public S3MultipartUploadData fileParts(List<S3FilePart> fileParts) {
    this.fileParts = fileParts;
    return this;
  }

  public S3MultipartUploadData addFilePartsItem(S3FilePart filePartsItem) {
    if (this.fileParts == null) {
      this.fileParts = new ArrayList<>();
    }
    this.fileParts.add(filePartsItem);
    return this;
  }

  /**
   * Array of file parts with pre-signed URLs.
   * @return fileParts
   */
  @ApiModelProperty(value = "Array of file parts with pre-signed URLs.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

