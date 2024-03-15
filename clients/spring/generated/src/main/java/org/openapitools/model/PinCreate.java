package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.PinMediaSource;
import org.openapitools.model.SummaryPinMedia;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Pin
 */

@Schema(name = "PinCreate", description = "Pin")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinCreate {

  private String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private JsonNullable<@Size(max = 2048) String> link = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 100) String> title = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 800) String> description = JsonNullable.<String>undefined();

  private JsonNullable<String> dominantColor = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 500) String> altText = JsonNullable.<String>undefined();

  private String boardId;

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> boardSectionId = JsonNullable.<String>undefined();

  private BoardOwner boardOwner;

  private SummaryPinMedia media;

  private PinMediaSource mediaSource;

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> parentPinId = JsonNullable.<String>undefined();

  private JsonNullable<String> note = JsonNullable.<String>undefined();

  public PinCreate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "813744226420795884", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PinCreate createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2020-01-01T20:10:40Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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
  @Schema(name = "link", example = "https://www.pinterest.com/", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public JsonNullable<@Size(max = 2048) String> getLink() {
    return link;
  }

  public void setLink(JsonNullable<String> link) {
    this.link = link;
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
   * Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
   * @return dominantColor
  */
  
  @Schema(name = "dominant_color", example = "#6E7874", description = "Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dominant_color")
  public JsonNullable<String> getDominantColor() {
    return dominantColor;
  }

  public void setDominantColor(JsonNullable<String> dominantColor) {
    this.dominantColor = dominantColor;
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

  public PinCreate boardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
    return this;
  }

  /**
   * Get boardOwner
   * @return boardOwner
  */
  @Valid 
  @Schema(name = "board_owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board_owner")
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }

  public void setBoardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
  }

  public PinCreate media(SummaryPinMedia media) {
    this.media = media;
    return this;
  }

  /**
   * Get media
   * @return media
  */
  @Valid 
  @Schema(name = "media", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media")
  public SummaryPinMedia getMedia() {
    return media;
  }

  public void setMedia(SummaryPinMedia media) {
    this.media = media;
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
   * The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
   * @return parentPinId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "parent_pin_id", description = "The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_pin_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getParentPinId() {
    return parentPinId;
  }

  public void setParentPinId(JsonNullable<String> parentPinId) {
    this.parentPinId = parentPinId;
  }

  public PinCreate note(String note) {
    this.note = JsonNullable.of(note);
    return this;
  }

  /**
   * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
   * @return note
  */
  
  @Schema(name = "note", description = "Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("note")
  public JsonNullable<String> getNote() {
    return note;
  }

  public void setNote(JsonNullable<String> note) {
    this.note = note;
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
    return Objects.equals(this.id, pinCreate.id) &&
        Objects.equals(this.createdAt, pinCreate.createdAt) &&
        equalsNullable(this.link, pinCreate.link) &&
        equalsNullable(this.title, pinCreate.title) &&
        equalsNullable(this.description, pinCreate.description) &&
        equalsNullable(this.dominantColor, pinCreate.dominantColor) &&
        equalsNullable(this.altText, pinCreate.altText) &&
        Objects.equals(this.boardId, pinCreate.boardId) &&
        equalsNullable(this.boardSectionId, pinCreate.boardSectionId) &&
        Objects.equals(this.boardOwner, pinCreate.boardOwner) &&
        Objects.equals(this.media, pinCreate.media) &&
        Objects.equals(this.mediaSource, pinCreate.mediaSource) &&
        equalsNullable(this.parentPinId, pinCreate.parentPinId) &&
        equalsNullable(this.note, pinCreate.note);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, hashCodeNullable(link), hashCodeNullable(title), hashCodeNullable(description), hashCodeNullable(dominantColor), hashCodeNullable(altText), boardId, hashCodeNullable(boardSectionId), boardOwner, media, mediaSource, hashCodeNullable(parentPinId), hashCodeNullable(note));
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dominantColor: ").append(toIndentedString(dominantColor)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
    sb.append("    boardOwner: ").append(toIndentedString(boardOwner)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    mediaSource: ").append(toIndentedString(mediaSource)).append("\n");
    sb.append("    parentPinId: ").append(toIndentedString(parentPinId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

