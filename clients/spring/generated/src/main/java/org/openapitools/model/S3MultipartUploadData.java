package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.S3FilePart;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * S3MultipartUploadData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class S3MultipartUploadData {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid S3FilePart> fileParts = new ArrayList<>();

  public S3MultipartUploadData fileParts(List<@Valid S3FilePart> fileParts) {
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
  @Valid 
  @Schema(name = "file_parts", description = "Array of file parts with pre-signed URLs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_parts")
  public List<@Valid S3FilePart> getFileParts() {
    return fileParts;
  }

  @JsonProperty("file_parts")
  public void setFileParts(List<@Valid S3FilePart> fileParts) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

