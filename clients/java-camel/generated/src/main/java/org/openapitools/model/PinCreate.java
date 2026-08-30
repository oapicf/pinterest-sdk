package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AiDisclosures;
import org.openapitools.model.PinMediaSource;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "PinCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinCreate {

  private AiDisclosures aiDisclosures;

  private JsonNullable<@Size(max = 500) String> altText = JsonNullable.<String>undefined();

  private String boardId;

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> boardSectionId = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 800) String> description = JsonNullable.<String>undefined();

  private JsonNullable<String> dominantColor = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 2048) String> link = JsonNullable.<String>undefined();

  private PinMediaSource mediaSource;

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> parentPinId = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> sponsorId = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 100) String> title = JsonNullable.<String>undefined();

  public PinCreate aiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

  /**
   * AI disclosure declarations the creator has made about this Pin.
   * @return aiDisclosures
   */
  @Valid 
  @Schema(name = "ai_disclosures", description = "AI disclosure declarations the creator has made about this Pin.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ai_disclosures")
  public AiDisclosures getAiDisclosures() {
    return aiDisclosures;
  }

  public void setAiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  public PinCreate altText(String altText) {
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

  public PinCreate boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

  /**
   * The board to which this Pin belongs.
   * @return boardId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "board_id", description = "The board to which this Pin belongs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board_id")
  public String getBoardId() {
    return boardId;
  }

  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  public PinCreate boardSectionId(String boardSectionId) {
    this.boardSectionId = JsonNullable.of(boardSectionId);
    return this;
  }

  /**
   * The board section to which this Pin belongs.
   * @return boardSectionId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "board_section_id", description = "The board section to which this Pin belongs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board_section_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(JsonNullable<String> boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  public PinCreate description(String description) {
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

  public PinCreate dominantColor(String dominantColor) {
    this.dominantColor = JsonNullable.of(dominantColor);
    return this;
  }

  /**
   * Dominant pin color. Hex number, e.g. `#6E7874`.
   * @return dominantColor
   */
  
  @Schema(name = "dominant_color", description = "Dominant pin color. Hex number, e.g. `#6E7874`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dominant_color")
  public JsonNullable<String> getDominantColor() {
    return dominantColor;
  }

  public void setDominantColor(JsonNullable<String> dominantColor) {
    this.dominantColor = dominantColor;
  }

  public PinCreate link(String link) {
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

  public PinCreate mediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
    return this;
  }

  /**
   * Get mediaSource
   * @return mediaSource
   */
  @Valid 
  @Schema(name = "media_source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_source")
  public PinMediaSource getMediaSource() {
    return mediaSource;
  }

  public void setMediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
  }

  public PinCreate parentPinId(String parentPinId) {
    this.parentPinId = JsonNullable.of(parentPinId);
    return this;
  }

  /**
   * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
   * @return parentPinId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "parent_pin_id", description = "The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_pin_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getParentPinId() {
    return parentPinId;
  }

  public void setParentPinId(JsonNullable<String> parentPinId) {
    this.parentPinId = parentPinId;
  }

  public PinCreate sponsorId(String sponsorId) {
    this.sponsorId = JsonNullable.of(sponsorId);
    return this;
  }

  /**
   * The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
   * @return sponsorId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "sponsor_id", description = "The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sponsor_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getSponsorId() {
    return sponsorId;
  }

  public void setSponsorId(JsonNullable<String> sponsorId) {
    this.sponsorId = sponsorId;
  }

  public PinCreate title(String title) {
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
    PinCreate pinCreate = (PinCreate) o;
    return Objects.equals(this.aiDisclosures, pinCreate.aiDisclosures) &&
        equalsNullable(this.altText, pinCreate.altText) &&
        Objects.equals(this.boardId, pinCreate.boardId) &&
        equalsNullable(this.boardSectionId, pinCreate.boardSectionId) &&
        equalsNullable(this.description, pinCreate.description) &&
        equalsNullable(this.dominantColor, pinCreate.dominantColor) &&
        equalsNullable(this.link, pinCreate.link) &&
        Objects.equals(this.mediaSource, pinCreate.mediaSource) &&
        equalsNullable(this.parentPinId, pinCreate.parentPinId) &&
        equalsNullable(this.sponsorId, pinCreate.sponsorId) &&
        equalsNullable(this.title, pinCreate.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiDisclosures, hashCodeNullable(altText), boardId, hashCodeNullable(boardSectionId), hashCodeNullable(description), hashCodeNullable(dominantColor), hashCodeNullable(link), mediaSource, hashCodeNullable(parentPinId), hashCodeNullable(sponsorId), hashCodeNullable(title));
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
    sb.append("class PinCreate {\n");
    sb.append("    aiDisclosures: ").append(toIndentedString(aiDisclosures)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dominantColor: ").append(toIndentedString(dominantColor)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    mediaSource: ").append(toIndentedString(mediaSource)).append("\n");
    sb.append("    parentPinId: ").append(toIndentedString(parentPinId)).append("\n");
    sb.append("    sponsorId: ").append(toIndentedString(sponsorId)).append("\n");
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

