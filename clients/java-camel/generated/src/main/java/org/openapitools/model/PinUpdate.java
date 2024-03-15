package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PinUpdateCarouselSlotsInner;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Pin fields for updates
 */

@Schema(name = "PinUpdate", description = "Pin fields for updates")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinUpdate {

  private JsonNullable<@Size(max = 500) String> altText = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> boardId = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> boardSectionId = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 800) String> description = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 2048) String> link = JsonNullable.<String>undefined();

  private JsonNullable<@Size(max = 100) String> title = JsonNullable.<String>undefined();

  @Valid
  private List<@Valid PinUpdateCarouselSlotsInner> carouselSlots;

  private JsonNullable<String> note = JsonNullable.<String>undefined();

  public PinUpdate altText(String altText) {
    this.altText = JsonNullable.of(altText);
    return this;
  }

  /**
   * Pin's alternative text.
   * @return altText
  */
  @Size(max = 500) 
  @Schema(name = "alt_text", description = "Pin's alternative text.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alt_text")
  public JsonNullable<@Size(max = 500) String> getAltText() {
    return altText;
  }

  public void setAltText(JsonNullable<String> altText) {
    this.altText = altText;
  }

  public PinUpdate boardId(String boardId) {
    this.boardId = JsonNullable.of(boardId);
    return this;
  }

  /**
   * The id of the board to move the Pin onto.
   * @return boardId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "board_id", description = "The id of the board to move the Pin onto.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getBoardId() {
    return boardId;
  }

  public void setBoardId(JsonNullable<String> boardId) {
    this.boardId = boardId;
  }

  public PinUpdate boardSectionId(String boardSectionId) {
    this.boardSectionId = JsonNullable.of(boardSectionId);
    return this;
  }

  /**
   * <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
   * @return boardSectionId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "board_section_id", description = "<a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board_section_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(JsonNullable<String> boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  public PinUpdate description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Pin description - 800 characters maximum.
   * @return description
  */
  @Size(max = 800) 
  @Schema(name = "description", description = "Pin description - 800 characters maximum.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<@Size(max = 800) String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public PinUpdate link(String link) {
    this.link = JsonNullable.of(link);
    return this;
  }

  /**
   * URL viewer is taken to when they click pin.
   * @return link
  */
  @Size(max = 2048) 
  @Schema(name = "link", example = "https://www.pinterest.com/", description = "URL viewer is taken to when they click pin.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public JsonNullable<@Size(max = 2048) String> getLink() {
    return link;
  }

  public void setLink(JsonNullable<String> link) {
    this.link = link;
  }

  public PinUpdate title(String title) {
    this.title = JsonNullable.of(title);
    return this;
  }

  /**
   * The native pin title that creators explicitly prefer to display.
   * @return title
  */
  @Size(max = 100) 
  @Schema(name = "title", description = "The native pin title that creators explicitly prefer to display.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public JsonNullable<@Size(max = 100) String> getTitle() {
    return title;
  }

  public void setTitle(JsonNullable<String> title) {
    this.title = title;
  }

  public PinUpdate carouselSlots(List<@Valid PinUpdateCarouselSlotsInner> carouselSlots) {
    this.carouselSlots = carouselSlots;
    return this;
  }

  public PinUpdate addCarouselSlotsItem(PinUpdateCarouselSlotsInner carouselSlotsItem) {
    if (this.carouselSlots == null) {
      this.carouselSlots = new ArrayList<>();
    }
    this.carouselSlots.add(carouselSlotsItem);
    return this;
  }

  /**
   * Carousel Pin slots data.
   * @return carouselSlots
  */
  @Valid 
  @Schema(name = "carousel_slots", description = "Carousel Pin slots data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carousel_slots")
  public List<@Valid PinUpdateCarouselSlotsInner> getCarouselSlots() {
    return carouselSlots;
  }

  public void setCarouselSlots(List<@Valid PinUpdateCarouselSlotsInner> carouselSlots) {
    this.carouselSlots = carouselSlots;
  }

  public PinUpdate note(String note) {
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
    PinUpdate pinUpdate = (PinUpdate) o;
    return equalsNullable(this.altText, pinUpdate.altText) &&
        equalsNullable(this.boardId, pinUpdate.boardId) &&
        equalsNullable(this.boardSectionId, pinUpdate.boardSectionId) &&
        equalsNullable(this.description, pinUpdate.description) &&
        equalsNullable(this.link, pinUpdate.link) &&
        equalsNullable(this.title, pinUpdate.title) &&
        Objects.equals(this.carouselSlots, pinUpdate.carouselSlots) &&
        equalsNullable(this.note, pinUpdate.note);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(altText), hashCodeNullable(boardId), hashCodeNullable(boardSectionId), hashCodeNullable(description), hashCodeNullable(link), hashCodeNullable(title), carouselSlots, hashCodeNullable(note));
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
    sb.append("class PinUpdate {\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    carouselSlots: ").append(toIndentedString(carouselSlots)).append("\n");
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

