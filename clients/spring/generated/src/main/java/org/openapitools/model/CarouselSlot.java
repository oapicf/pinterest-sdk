package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CarouselSlot
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CarouselSlot {

  private @Nullable String description;

  private @Nullable String link;

  private @Nullable String title;

  public CarouselSlot description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Carousel Pin slot description.
   * @return description
   */
  
  @Schema(name = "description", description = "Carousel Pin slot description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public CarouselSlot link(@Nullable String link) {
    this.link = link;
    return this;
  }

  /**
   * Carousel Pin slot link.
   * @return link
   */
  
  @Schema(name = "link", description = "Carousel Pin slot link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public @Nullable String getLink() {
    return link;
  }

  public void setLink(@Nullable String link) {
    this.link = link;
  }

  public CarouselSlot title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Carousel Pin slot title.
   * @return title
   */
  
  @Schema(name = "title", description = "Carousel Pin slot title.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  public void setTitle(@Nullable String title) {
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
    CarouselSlot carouselSlot = (CarouselSlot) o;
    return Objects.equals(this.description, carouselSlot.description) &&
        Objects.equals(this.link, carouselSlot.link) &&
        Objects.equals(this.title, carouselSlot.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, link, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarouselSlot {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

