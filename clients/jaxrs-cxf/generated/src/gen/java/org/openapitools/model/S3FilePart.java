package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class S3FilePart  {
  
 /**
  * Part number for upload.
  */
  @ApiModelProperty(example = "1", required = true, value = "Part number for upload.")

  private Integer partNumber;

 /**
  * Pre-signed URL.
  */
  @ApiModelProperty(required = true, value = "Pre-signed URL.")

  private String presignedUrl;
 /**
   * Part number for upload.
   * @return partNumber
  **/
  @JsonProperty("part_number")
  @NotNull
  public Integer getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(Integer partNumber) {
    this.partNumber = partNumber;
  }

  public S3FilePart partNumber(Integer partNumber) {
    this.partNumber = partNumber;
    return this;
  }

 /**
   * Pre-signed URL.
   * @return presignedUrl
  **/
  @JsonProperty("presigned_url")
  @NotNull
  public String getPresignedUrl() {
    return presignedUrl;
  }

  public void setPresignedUrl(String presignedUrl) {
    this.presignedUrl = presignedUrl;
  }

  public S3FilePart presignedUrl(String presignedUrl) {
    this.presignedUrl = presignedUrl;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

