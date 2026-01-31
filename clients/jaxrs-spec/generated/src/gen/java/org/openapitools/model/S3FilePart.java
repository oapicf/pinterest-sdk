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



@JsonTypeName("S3FilePart")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class S3FilePart   {
  private Integer partNumber;
  private String presignedUrl;

  public S3FilePart() {
  }

  @JsonCreator
  public S3FilePart(
    @JsonProperty(required = true, value = "part_number") Integer partNumber,
    @JsonProperty(required = true, value = "presigned_url") String presignedUrl
  ) {
    this.partNumber = partNumber;
    this.presignedUrl = presignedUrl;
  }

  /**
   * Part number for upload.
   **/
  public S3FilePart partNumber(Integer partNumber) {
    this.partNumber = partNumber;
    return this;
  }

  
  @ApiModelProperty(example = "1", required = true, value = "Part number for upload.")
  @JsonProperty(required = true, value = "part_number")
  @NotNull public Integer getPartNumber() {
    return partNumber;
  }

  @JsonProperty(required = true, value = "part_number")
  public void setPartNumber(Integer partNumber) {
    this.partNumber = partNumber;
  }

  /**
   * Pre-signed URL.
   **/
  public S3FilePart presignedUrl(String presignedUrl) {
    this.presignedUrl = presignedUrl;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Pre-signed URL.")
  @JsonProperty(required = true, value = "presigned_url")
  @NotNull public String getPresignedUrl() {
    return presignedUrl;
  }

  @JsonProperty(required = true, value = "presigned_url")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

