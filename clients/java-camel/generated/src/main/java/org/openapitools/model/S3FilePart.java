package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * S3FilePart
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class S3FilePart {

  private Integer partNumber;

  private String presignedUrl;

  public S3FilePart() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public S3FilePart(Integer partNumber, String presignedUrl) {
    this.partNumber = partNumber;
    this.presignedUrl = presignedUrl;
  }

  public S3FilePart partNumber(Integer partNumber) {
    this.partNumber = partNumber;
    return this;
  }

  /**
   * Part number for upload.
   * @return partNumber
   */
  @NotNull 
  @Schema(name = "part_number", example = "1", description = "Part number for upload.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("part_number")
  public Integer getPartNumber() {
    return partNumber;
  }

  public void setPartNumber(Integer partNumber) {
    this.partNumber = partNumber;
  }

  public S3FilePart presignedUrl(String presignedUrl) {
    this.presignedUrl = presignedUrl;
    return this;
  }

  /**
   * Pre-signed URL.
   * @return presignedUrl
   */
  @NotNull 
  @Schema(name = "presigned_url", description = "Pre-signed URL.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("presigned_url")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

