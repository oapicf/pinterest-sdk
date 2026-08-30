package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PinMedia;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Summarized pin information
 */

@Schema(name = "SummaryPin", description = "Summarized pin information")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SummaryPin {

  private JsonNullable<@Size(max = 500) String> altText = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 800) String> description = JsonNullable.<String>undefined();

  private String id;

  private JsonNullable<@Size(max = 2048) String> link = JsonNullable.<String>undefined();

  private PinMedia media;

  private JsonNullable<@Size(max = 100) String> title = JsonNullable.<String>undefined();

  public SummaryPin() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SummaryPin(String id) {
    this.id = id;
  }

  public SummaryPin altText(String altText) {
    this.altText = JsonNullable.of(altText);
    return this;
  }

  /**
   * Get altText
   * @return altText
   */
  @Size(max = 500) 
  @Schema(name = "alt_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alt_text")
  public JsonNullable<@Size(max = 500) String> getAltText() {
    return altText;
  }

  public void setAltText(JsonNullable<String> altText) {
    this.altText = altText;
  }

  public SummaryPin description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @Size(max = 800) 
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<@Size(max = 800) String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public SummaryPin id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SummaryPin link(String link) {
    this.link = JsonNullable.of(link);
    return this;
  }

  /**
   * Get link
   * @return link
   */
  @Size(max = 2048) 
  @Schema(name = "link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public JsonNullable<@Size(max = 2048) String> getLink() {
    return link;
  }

  public void setLink(JsonNullable<String> link) {
    this.link = link;
  }

  public SummaryPin media(PinMedia media) {
    this.media = media;
    return this;
  }

  /**
   * Get media
   * @return media
   */
  @Valid 
  @Schema(name = "media", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media")
  public PinMedia getMedia() {
    return media;
  }

  public void setMedia(PinMedia media) {
    this.media = media;
  }

  public SummaryPin title(String title) {
    this.title = JsonNullable.of(title);
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @Size(max = 100) 
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public JsonNullable<@Size(max = 100) String> getTitle() {
    return title;
  }

  public void setTitle(JsonNullable<String> title) {
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
    SummaryPin summaryPin = (SummaryPin) o;
    return equalsNullable(this.altText, summaryPin.altText) &&
        equalsNullable(this.description, summaryPin.description) &&
        Objects.equals(this.id, summaryPin.id) &&
        equalsNullable(this.link, summaryPin.link) &&
        Objects.equals(this.media, summaryPin.media) &&
        equalsNullable(this.title, summaryPin.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(altText), hashCodeNullable(description), id, hashCodeNullable(link), media, hashCodeNullable(title));
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
    sb.append("class SummaryPin {\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

