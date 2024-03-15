package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PinUpdateCarouselSlotsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Pin fields for updates
 **/
@ApiModel(description = "Pin fields for updates")
@JsonTypeName("PinUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinUpdate   {
  private @Valid String altText;
  private @Valid String boardId;
  private @Valid String boardSectionId;
  private @Valid String description;
  private @Valid String link;
  private @Valid String title;
  private @Valid List<@Valid PinUpdateCarouselSlotsInner> carouselSlots;
  private @Valid String note;

  /**
   * Pin&#39;s alternative text.
   **/
  public PinUpdate altText(String altText) {
    this.altText = altText;
    return this;
  }

  
  @ApiModelProperty(value = "Pin's alternative text.")
  @JsonProperty("alt_text")
 @Size(max=500)  public String getAltText() {
    return altText;
  }

  @JsonProperty("alt_text")
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
 @Pattern(regexp="^\\d+$")  public String getBoardId() {
    return boardId;
  }

  @JsonProperty("board_id")
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  /**
   * &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/create-a-board-section\&quot;&gt;Board section&lt;/a&gt; ID.
   **/
  public PinUpdate boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

  
  @ApiModelProperty(value = "<a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.")
  @JsonProperty("board_section_id")
 @Pattern(regexp="^\\d+$")  public String getBoardSectionId() {
    return boardSectionId;
  }

  @JsonProperty("board_section_id")
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
 @Size(max=800)  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
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
 @Size(max=2048)  public String getLink() {
    return link;
  }

  @JsonProperty("link")
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
 @Size(max=100)  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Carousel Pin slots data.
   **/
  public PinUpdate carouselSlots(List<@Valid PinUpdateCarouselSlotsInner> carouselSlots) {
    this.carouselSlots = carouselSlots;
    return this;
  }

  
  @ApiModelProperty(value = "Carousel Pin slots data.")
  @JsonProperty("carousel_slots")
  public List<PinUpdateCarouselSlotsInner> getCarouselSlots() {
    return carouselSlots;
  }

  @JsonProperty("carousel_slots")
  public void setCarouselSlots(List<@Valid PinUpdateCarouselSlotsInner> carouselSlots) {
    this.carouselSlots = carouselSlots;
  }

  public PinUpdate addCarouselSlotsItem(PinUpdateCarouselSlotsInner carouselSlotsItem) {
    if (this.carouselSlots == null) {
      this.carouselSlots = new ArrayList<>();
    }

    this.carouselSlots.add(carouselSlotsItem);
    return this;
  }

  public PinUpdate removeCarouselSlotsItem(PinUpdateCarouselSlotsInner carouselSlotsItem) {
    if (carouselSlotsItem != null && this.carouselSlots != null) {
      this.carouselSlots.remove(carouselSlotsItem);
    }

    return this;
  }
  /**
   * Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.
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

  @JsonProperty("note")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

