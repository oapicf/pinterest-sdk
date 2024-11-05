package apimodels;

import apimodels.PinUpdateCarouselSlotsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Pin fields for updates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinUpdate   {
  @JsonProperty("alt_text")
  @Size(max=500)

  private String altText;

  @JsonProperty("board_id")
  @Pattern(regexp="^\\d+$")

  private String boardId;

  @JsonProperty("board_section_id")
  @Pattern(regexp="^\\d+$")

  private String boardSectionId;

  @JsonProperty("description")
  @Size(max=800)

  private String description;

  @JsonProperty("link")
  @Size(max=2048)

  private String link;

  @JsonProperty("title")
  @Size(max=100)

  private String title;

  @JsonProperty("carousel_slots")
  @Valid

  private List<@Valid PinUpdateCarouselSlotsInner> carouselSlots = null;

  @JsonProperty("note")
  
  private String note;

  public PinUpdate altText(String altText) {
    this.altText = altText;
    return this;
  }

   /**
   * Pin's alternative text.
   * @return altText
  **/
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  public PinUpdate boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

   /**
   * The id of the board to move the Pin onto.
   * @return boardId
  **/
  public String getBoardId() {
    return boardId;
  }

  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  public PinUpdate boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

   /**
   * <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
   * @return boardSectionId
  **/
  public String getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  public PinUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Pin description - 800 characters maximum.
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PinUpdate link(String link) {
    this.link = link;
    return this;
  }

   /**
   * URL viewer is taken to when they click pin.
   * @return link
  **/
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public PinUpdate title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The native pin title that creators explicitly prefer to display.
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
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
  **/
  public List<@Valid PinUpdateCarouselSlotsInner> getCarouselSlots() {
    return carouselSlots;
  }

  public void setCarouselSlots(List<@Valid PinUpdateCarouselSlotsInner> carouselSlots) {
    this.carouselSlots = carouselSlots;
  }

  public PinUpdate note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
   * @return note
  **/
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
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
    return Objects.equals(altText, pinUpdate.altText) &&
        Objects.equals(boardId, pinUpdate.boardId) &&
        Objects.equals(boardSectionId, pinUpdate.boardSectionId) &&
        Objects.equals(description, pinUpdate.description) &&
        Objects.equals(link, pinUpdate.link) &&
        Objects.equals(title, pinUpdate.title) &&
        Objects.equals(carouselSlots, pinUpdate.carouselSlots) &&
        Objects.equals(note, pinUpdate.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(altText, boardId, boardSectionId, description, link, title, carouselSlots, note);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

