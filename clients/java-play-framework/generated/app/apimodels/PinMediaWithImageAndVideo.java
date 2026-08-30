package apimodels;

import apimodels.PinMediaMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Pin with a mix of images and videos.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinMediaWithImageAndVideo   {
  @JsonProperty("items")
  @Valid

  private List<@Valid PinMediaMetadata> items = null;

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    MULTIPLE_MIXED("multiple_mixed");

    private final String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MediaTypeEnum fromValue(String value) {
      for (MediaTypeEnum b : MediaTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("media_type")
  @NotNull

  private MediaTypeEnum mediaType;

  public PinMediaWithImageAndVideo items(List<@Valid PinMediaMetadata> items) {
    this.items = items;
    return this;
  }

  public PinMediaWithImageAndVideo addItemsItem(PinMediaMetadata itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  public List<@Valid PinMediaMetadata> getItems() {
    return items;
  }

  public void setItems(List<@Valid PinMediaMetadata> items) {
    this.items = items;
  }

  public PinMediaWithImageAndVideo mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaTypeEnum mediaType) {
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
    PinMediaWithImageAndVideo pinMediaWithImageAndVideo = (PinMediaWithImageAndVideo) o;
    return Objects.equals(items, pinMediaWithImageAndVideo.items) &&
        Objects.equals(mediaType, pinMediaWithImageAndVideo.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, mediaType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithImageAndVideo {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

