package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.S3FilePart;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class S3MultipartUploadData   {
  
  private List<@Valid S3FilePart> fileParts = new ArrayList<>();

  /**
   * Array of file parts with pre-signed URLs.
   **/
  public S3MultipartUploadData fileParts(List<@Valid S3FilePart> fileParts) {
    this.fileParts = fileParts;
    return this;
  }

  
  @ApiModelProperty(value = "Array of file parts with pre-signed URLs.")
  @JsonProperty("file_parts")
  public List<@Valid S3FilePart> getFileParts() {
    return fileParts;
  }
  public void setFileParts(List<@Valid S3FilePart> fileParts) {
    this.fileParts = fileParts;
  }

  public S3MultipartUploadData addFilePartsItem(S3FilePart filePartsItem) {
    if (this.fileParts == null) {
      this.fileParts = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

