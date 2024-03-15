package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PinUpdateCarouselSlotsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Pin fields for updates
 **/
@ApiModel(description="Pin fields for updates")

public class PinUpdate  {
  
  @ApiModelProperty(value = "Pin's alternative text.")
 /**
   * Pin's alternative text.
  **/
  private String altText;

  @ApiModelProperty(value = "The id of the board to move the Pin onto.")
 /**
   * The id of the board to move the Pin onto.
  **/
  private String boardId;

  @ApiModelProperty(value = "<a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.")
 /**
   * <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
  **/
  private String boardSectionId;

  @ApiModelProperty(value = "Pin description - 800 characters maximum.")
 /**
   * Pin description - 800 characters maximum.
  **/
  private String description;

  @ApiModelProperty(example = "https://www.pinterest.com/", value = "URL viewer is taken to when they click pin.")
 /**
   * URL viewer is taken to when they click pin.
  **/
  private String link;

  @ApiModelProperty(value = "The native pin title that creators explicitly prefer to display.")
 /**
   * The native pin title that creators explicitly prefer to display.
  **/
  private String title;

  @ApiModelProperty(value = "Carousel Pin slots data.")
  @Valid
 /**
   * Carousel Pin slots data.
  **/
  private List<@Valid PinUpdateCarouselSlotsInner> carouselSlots;

  @ApiModelProperty(value = "Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.")
 /**
   * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
  **/
  private String note;
 /**
   * Pin&#39;s alternative text.
   * @return altText
  **/
  @JsonProperty("alt_text")
 @Size(max=500)  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  public PinUpdate altText(String altText) {
    this.altText = altText;
    return this;
  }

 /**
   * The id of the board to move the Pin onto.
   * @return boardId
  **/
  @JsonProperty("board_id")
 @Pattern(regexp="^\\d+$")  public String getBoardId() {
    return boardId;
  }

  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  public PinUpdate boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

 /**
   * &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/create-a-board-section\&quot;&gt;Board section&lt;/a&gt; ID.
   * @return boardSectionId
  **/
  @JsonProperty("board_section_id")
 @Pattern(regexp="^\\d+$")  public String getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  public PinUpdate boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

 /**
   * Pin description - 800 characters maximum.
   * @return description
  **/
  @JsonProperty("description")
 @Size(max=800)  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PinUpdate description(String description) {
    this.description = description;
    return this;
  }

 /**
   * URL viewer is taken to when they click pin.
   * @return link
  **/
  @JsonProperty("link")
 @Size(max=2048)  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public PinUpdate link(String link) {
    this.link = link;
    return this;
  }

 /**
   * The native pin title that creators explicitly prefer to display.
   * @return title
  **/
  @JsonProperty("title")
 @Size(max=100)  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PinUpdate title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Carousel Pin slots data.
   * @return carouselSlots
  **/
  @JsonProperty("carousel_slots")
  public List<@Valid PinUpdateCarouselSlotsInner> getCarouselSlots() {
    return carouselSlots;
  }

  public void setCarouselSlots(List<@Valid PinUpdateCarouselSlotsInner> carouselSlots) {
    this.carouselSlots = carouselSlots;
  }

  public PinUpdate carouselSlots(List<@Valid PinUpdateCarouselSlotsInner> carouselSlots) {
    this.carouselSlots = carouselSlots;
    return this;
  }

  public PinUpdate addCarouselSlotsItem(PinUpdateCarouselSlotsInner carouselSlotsItem) {
    this.carouselSlots.add(carouselSlotsItem);
    return this;
  }

 /**
   * Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.
   * @return note
  **/
  @JsonProperty("note")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public PinUpdate note(String note) {
    this.note = note;
    return this;
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
    return Objects.equals(this.altText, pinUpdate.altText) &&
        Objects.equals(this.boardId, pinUpdate.boardId) &&
        Objects.equals(this.boardSectionId, pinUpdate.boardSectionId) &&
        Objects.equals(this.description, pinUpdate.description) &&
        Objects.equals(this.link, pinUpdate.link) &&
        Objects.equals(this.title, pinUpdate.title) &&
        Objects.equals(this.carouselSlots, pinUpdate.carouselSlots) &&
        Objects.equals(this.note, pinUpdate.note);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

