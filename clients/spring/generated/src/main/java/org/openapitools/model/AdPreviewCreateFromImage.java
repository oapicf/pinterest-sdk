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
 * AdPreviewCreateFromImage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdPreviewCreateFromImage implements AdPreviewRequest {

  private String imageUrl;

  private String title;

  public AdPreviewCreateFromImage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdPreviewCreateFromImage(String imageUrl, String title) {
    this.imageUrl = imageUrl;
    this.title = title;
  }

  public AdPreviewCreateFromImage imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Image URL.
   * @return imageUrl
   */
  @NotNull 
  @Schema(name = "image_url", example = "https://somewebsite.com/someimage.jpg", description = "Image URL.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public AdPreviewCreateFromImage title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title displayed below ad.
   * @return title
   */
  @NotNull 
  @Schema(name = "title", example = "My Preview Image", description = "Title displayed below ad.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdPreviewCreateFromImage adPreviewCreateFromImage = (AdPreviewCreateFromImage) o;
    return Objects.equals(this.imageUrl, adPreviewCreateFromImage.imageUrl) &&
        Objects.equals(this.title, adPreviewCreateFromImage.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPreviewCreateFromImage {\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

