package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PinMediaSourceImagesURLItemsInner
 */

@JsonTypeName("PinMediaSourceImagesURL_items_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinMediaSourceImagesURLItemsInner {

  private String title;

  private String description;

  private String link;

  private String url;

  public PinMediaSourceImagesURLItemsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PinMediaSourceImagesURLItemsInner(String url) {
    this.url = url;
  }

  public PinMediaSourceImagesURLItemsInner title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PinMediaSourceImagesURLItemsInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PinMediaSourceImagesURLItemsInner link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Destination link for the image.
   * @return link
  */
  
  @Schema(name = "link", description = "Destination link for the image.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public PinMediaSourceImagesURLItemsInner url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of image to upload.
   * @return url
  */
  @NotNull 
  @Schema(name = "url", description = "URL of image to upload.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaSourceImagesURLItemsInner pinMediaSourceImagesURLItemsInner = (PinMediaSourceImagesURLItemsInner) o;
    return Objects.equals(this.title, pinMediaSourceImagesURLItemsInner.title) &&
        Objects.equals(this.description, pinMediaSourceImagesURLItemsInner.description) &&
        Objects.equals(this.link, pinMediaSourceImagesURLItemsInner.link) &&
        Objects.equals(this.url, pinMediaSourceImagesURLItemsInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, link, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImagesURLItemsInner {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

