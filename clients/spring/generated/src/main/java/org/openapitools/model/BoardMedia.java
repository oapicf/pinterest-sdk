package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Board media.
 */

@Schema(name = "Board_media", description = "Board media.")
@JsonTypeName("Board_media")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BoardMedia {

  private JsonNullable<String> imageCoverUrl = JsonNullable.<String>undefined();

  @Valid
  private List<String> pinThumbnailUrls = new ArrayList<>();

  public BoardMedia imageCoverUrl(String imageCoverUrl) {
    this.imageCoverUrl = JsonNullable.of(imageCoverUrl);
    return this;
  }

  /**
   * Board cover image.
   * @return imageCoverUrl
   */
  
  @Schema(name = "image_cover_url", example = "https://i.pinimg.com/400x300/fd/cd/d5/fdcdd5a6d8a80824add0d054125cd957.jpg", description = "Board cover image.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_cover_url")
  public JsonNullable<String> getImageCoverUrl() {
    return imageCoverUrl;
  }

  public void setImageCoverUrl(JsonNullable<String> imageCoverUrl) {
    this.imageCoverUrl = imageCoverUrl;
  }

  public BoardMedia pinThumbnailUrls(List<String> pinThumbnailUrls) {
    this.pinThumbnailUrls = pinThumbnailUrls;
    return this;
  }

  public BoardMedia addPinThumbnailUrlsItem(String pinThumbnailUrlsItem) {
    if (this.pinThumbnailUrls == null) {
      this.pinThumbnailUrls = new ArrayList<>();
    }
    this.pinThumbnailUrls.add(pinThumbnailUrlsItem);
    return this;
  }

  /**
   * Board pin thumbnail urls.
   * @return pinThumbnailUrls
   */
  
  @Schema(name = "pin_thumbnail_urls", example = "[\"https://i.pinimg.com/150x150/b4/57/10/b45710f1ede96af55230f4b43935c4af.jpg\",\"https://i.pinimg.com/150x150/dd/ff/46/ddff4616e39c1935cd05738794fa860e.jpg\",\"https://i.pinimg.com/150x150/84/ac/59/84ac59b670ccb5b903dace480a98930c.jpg\",\"https://i.pinimg.com/150x150/4c/54/6f/4c546f521be85e30838fb742bfff6936.jpg\"]", description = "Board pin thumbnail urls.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_thumbnail_urls")
  public List<String> getPinThumbnailUrls() {
    return pinThumbnailUrls;
  }

  public void setPinThumbnailUrls(List<String> pinThumbnailUrls) {
    this.pinThumbnailUrls = pinThumbnailUrls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardMedia boardMedia = (BoardMedia) o;
    return equalsNullable(this.imageCoverUrl, boardMedia.imageCoverUrl) &&
        Objects.equals(this.pinThumbnailUrls, boardMedia.pinThumbnailUrls);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(imageCoverUrl), pinThumbnailUrls);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardMedia {\n");
    sb.append("    imageCoverUrl: ").append(toIndentedString(imageCoverUrl)).append("\n");
    sb.append("    pinThumbnailUrls: ").append(toIndentedString(pinThumbnailUrls)).append("\n");
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

