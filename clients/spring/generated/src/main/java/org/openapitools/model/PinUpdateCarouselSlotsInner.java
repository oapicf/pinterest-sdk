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
 * PinUpdateCarouselSlotsInner
 */

@JsonTypeName("PinUpdate_carousel_slots_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinUpdateCarouselSlotsInner {

  private String title;

  private String description;

  private String link;

  public PinUpdateCarouselSlotsInner title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Carousel Pin slot title.
   * @return title
  */
  
  @Schema(name = "title", description = "Carousel Pin slot title.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PinUpdateCarouselSlotsInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Carousel Pin slot description.
   * @return description
  */
  
  @Schema(name = "description", description = "Carousel Pin slot description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PinUpdateCarouselSlotsInner link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Carousel Pin slot link.
   * @return link
  */
  
  @Schema(name = "link", description = "Carousel Pin slot link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinUpdateCarouselSlotsInner pinUpdateCarouselSlotsInner = (PinUpdateCarouselSlotsInner) o;
    return Objects.equals(this.title, pinUpdateCarouselSlotsInner.title) &&
        Objects.equals(this.description, pinUpdateCarouselSlotsInner.description) &&
        Objects.equals(this.link, pinUpdateCarouselSlotsInner.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinUpdateCarouselSlotsInner {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

