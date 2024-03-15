package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.PinUpdateCarouselSlotsInner;

/**
 * Pin fields for updates
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinUpdate   {
  
  private String altText;
  private String boardId;
  private String boardSectionId;
  private String description;
  private String link;
  private String title;
  private List<PinUpdateCarouselSlotsInner> carouselSlots;
  private String note;

  public PinUpdate () {

  }

  public PinUpdate (String altText, String boardId, String boardSectionId, String description, String link, String title, List<PinUpdateCarouselSlotsInner> carouselSlots, String note) {
    this.altText = altText;
    this.boardId = boardId;
    this.boardSectionId = boardSectionId;
    this.description = description;
    this.link = link;
    this.title = title;
    this.carouselSlots = carouselSlots;
    this.note = note;
  }

    
  @JsonProperty("alt_text")
  public String getAltText() {
    return altText;
  }
  public void setAltText(String altText) {
    this.altText = altText;
  }

    
  @JsonProperty("board_id")
  public String getBoardId() {
    return boardId;
  }
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

    
  @JsonProperty("board_section_id")
  public String getBoardSectionId() {
    return boardSectionId;
  }
  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

    
  @JsonProperty("carousel_slots")
  public List<PinUpdateCarouselSlotsInner> getCarouselSlots() {
    return carouselSlots;
  }
  public void setCarouselSlots(List<PinUpdateCarouselSlotsInner> carouselSlots) {
    this.carouselSlots = carouselSlots;
  }

    
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
