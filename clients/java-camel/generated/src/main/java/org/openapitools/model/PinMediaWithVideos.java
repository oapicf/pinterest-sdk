package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.VideoMetadataWithItemType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Pin with multiple videos.
 */

@Schema(name = "PinMediaWithVideos", description = "Pin with multiple videos.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinMediaWithVideos implements PinMedia {

  @Valid
  private List<@Valid VideoMetadataWithItemType> items = new ArrayList<>();

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    MULTIPLE_VIDEOS("multiple_videos");

    private final String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private MediaTypeEnum mediaType;

  public PinMediaWithVideos() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PinMediaWithVideos(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public PinMediaWithVideos items(List<@Valid VideoMetadataWithItemType> items) {
    this.items = items;
    return this;
  }

  public PinMediaWithVideos addItemsItem(VideoMetadataWithItemType itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid VideoMetadataWithItemType> getItems() {
    return items;
  }

  public void setItems(List<@Valid VideoMetadataWithItemType> items) {
    this.items = items;
  }

  public PinMediaWithVideos mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
   */
  @NotNull 
  @Schema(name = "media_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media_type")
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
    PinMediaWithVideos pinMediaWithVideos = (PinMediaWithVideos) o;
    return Objects.equals(this.items, pinMediaWithVideos.items) &&
        Objects.equals(this.mediaType, pinMediaWithVideos.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, mediaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithVideos {\n");
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

