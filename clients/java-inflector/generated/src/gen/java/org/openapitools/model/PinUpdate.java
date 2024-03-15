package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PinUpdateCarouselSlotsInner;



/**
 * Pin fields for updates
 **/

@ApiModel(description = "Pin fields for updates")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinUpdate   {
  @JsonProperty("alt_text")
  private String altText;

  @JsonProperty("board_id")
  private String boardId;

  @JsonProperty("board_section_id")
  private String boardSectionId;

  @JsonProperty("description")
  private String description;

  @JsonProperty("link")
  private String link;

  @JsonProperty("title")
  private String title;

  @JsonProperty("carousel_slots")
  private List<PinUpdateCarouselSlotsInner> carouselSlots = null;

  @JsonProperty("note")
  private String note;

  /**
   * Pin's alternative text.
   **/
  public PinUpdate altText(String altText) {
    this.altText = altText;
    return this;
  }

  
  @ApiModelProperty(value = "Pin's alternative text.")
  @JsonProperty("alt_text")
  public String getAltText() {
    return altText;
  }
  public void setAltText(String altText) {
    this.altText = altText;
  }

  /**
   * The id of the board to move the Pin onto.
   **/
  public PinUpdate boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

  
  @ApiModelProperty(value = "The id of the board to move the Pin onto.")
  @JsonProperty("board_id")
  public String getBoardId() {
    return boardId;
  }
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  /**
   * <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
   **/
  public PinUpdate boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

  
  @ApiModelProperty(value = "<a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.")
  @JsonProperty("board_section_id")
  public String getBoardSectionId() {
    return boardSectionId;
  }
  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  /**
   * Pin description - 800 characters maximum.
   **/
  public PinUpdate description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Pin description - 800 characters maximum.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * URL viewer is taken to when they click pin.
   **/
  public PinUpdate link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.pinterest.com/", value = "URL viewer is taken to when they click pin.")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   * The native pin title that creators explicitly prefer to display.
   **/
  public PinUpdate title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "The native pin title that creators explicitly prefer to display.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Carousel Pin slots data.
   **/
  public PinUpdate carouselSlots(List<PinUpdateCarouselSlotsInner> carouselSlots) {
    this.carouselSlots = carouselSlots;
    return this;
  }

  
  @ApiModelProperty(value = "Carousel Pin slots data.")
  @JsonProperty("carousel_slots")
  public List<PinUpdateCarouselSlotsInner> getCarouselSlots() {
    return carouselSlots;
  }
  public void setCarouselSlots(List<PinUpdateCarouselSlotsInner> carouselSlots) {
    this.carouselSlots = carouselSlots;
  }

  /**
   * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
   **/
  public PinUpdate note(String note) {
    this.note = note;
    return this;
  }

  
  @ApiModelProperty(value = "Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.")
  @JsonProperty("note")
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

