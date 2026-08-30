package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class S3FilePart   {
  
  private Integer partNumber;
  private String presignedUrl;

  /**
   * Part number for upload.
   **/
  
  @ApiModelProperty(example = "1", required = true, value = "Part number for upload.")
  @JsonProperty("part_number")
  @NotNull
  public Integer getPartNumber() {
    return partNumber;
  }
  public void setPartNumber(Integer partNumber) {
    this.partNumber = partNumber;
  }

  /**
   * Pre-signed URL.
   **/
  
  @ApiModelProperty(required = true, value = "Pre-signed URL.")
  @JsonProperty("presigned_url")
  @NotNull
  public String getPresignedUrl() {
    return presignedUrl;
  }
  public void setPresignedUrl(String presignedUrl) {
    this.presignedUrl = presignedUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3FilePart s3FilePart = (S3FilePart) o;
    return Objects.equals(this.partNumber, s3FilePart.partNumber) &&
        Objects.equals(this.presignedUrl, s3FilePart.presignedUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partNumber, presignedUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3FilePart {\n");
    
    sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
    sb.append("    presignedUrl: ").append(toIndentedString(presignedUrl)).append("\n");
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

