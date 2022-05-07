package apimodels;

import apimodels.MediaUploadType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Media upload request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-07T06:39:52.689511Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class MediaUploadRequest   {
  @JsonProperty("media_type")
  @NotNull
@Valid

  private MediaUploadType mediaType;

  public MediaUploadRequest mediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  public MediaUploadType getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaUploadType mediaType) {
    this.mediaType = mediaType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaUploadRequest mediaUploadRequest = (MediaUploadRequest) o;
    return Objects.equals(mediaType, mediaUploadRequest.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaUploadRequest {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

