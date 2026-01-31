package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MediaUploadStatus;
import org.openapitools.model.MediaUploadType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Media upload details
 */

@Schema(name = "MediaUploadDetails", description = "Media upload details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-26T05:48:22.520185154Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MediaUploadDetails {

  private @Nullable String mediaId;

  private @Nullable MediaUploadType mediaType;

  private @Nullable MediaUploadStatus status;

  public MediaUploadDetails mediaId(@Nullable String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * Get mediaId
   * @return mediaId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "media_id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_id")
  public @Nullable String getMediaId() {
    return mediaId;
  }

  public void setMediaId(@Nullable String mediaId) {
    this.mediaId = mediaId;
  }

  public MediaUploadDetails mediaType(@Nullable MediaUploadType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
   */
  @Valid 
  @Schema(name = "media_type", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_type")
  public @Nullable MediaUploadType getMediaType() {
    return mediaType;
  }

  public void setMediaType(@Nullable MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }

  public MediaUploadDetails status(@Nullable MediaUploadStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable MediaUploadStatus getStatus() {
    return status;
  }

  public void setStatus(@Nullable MediaUploadStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUploadDetails mediaUploadDetails = (MediaUploadDetails) o;
    return Objects.equals(this.mediaId, mediaUploadDetails.mediaId) &&
        Objects.equals(this.mediaType, mediaUploadDetails.mediaType) &&
        Objects.equals(this.status, mediaUploadDetails.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaId, mediaType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUploadDetails {\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

