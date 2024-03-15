package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@ApiModel(description="Pin fields for updates")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinUpdate   {
  
  private String altText;
  private String boardId;
  private String boardSectionId;
  private String description;
  private String link;
  private String title;
  private List<@Valid PinUpdateCarouselSlotsInner> carouselSlots;
  private String note;

  /**
   * Pin&#39;s alternative text.
   **/
  
  @ApiModelProperty(value = "Pin's alternative text.")
  @JsonProperty("alt_text")
 @Size(max=500)  public String getAltText() {
    return altText;
  }
  public void setAltText(String altText) {
    this.altText = altText;
  }

  /**
   * The id of the board to move the Pin onto.
   **/
  
  @ApiModelProperty(value = "The id of the board to move the Pin onto.")
  @JsonProperty("board_id")
 @Pattern(regexp="^\\d+$")  public String getBoardId() {
    return boardId;
  }
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  /**
   * &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/create-a-board-section\&quot;&gt;Board section&lt;/a&gt; ID.
   **/
  
  @ApiModelProperty(value = "<a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.")
  @JsonProperty("board_section_id")
 @Pattern(regexp="^\\d+$")  public String getBoardSectionId() {
    return boardSectionId;
  }
  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  /**
   * Pin description - 800 characters maximum.
   **/
  
  @ApiModelProperty(value = "Pin description - 800 characters maximum.")
  @JsonProperty("description")
 @Size(max=800)  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * URL viewer is taken to when they click pin.
   **/
  
  @ApiModelProperty(example = "https://www.pinterest.com/", value = "URL viewer is taken to when they click pin.")
  @JsonProperty("link")
 @Size(max=2048)  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   * The native pin title that creators explicitly prefer to display.
   **/
  
  @ApiModelProperty(value = "The native pin title that creators explicitly prefer to display.")
  @JsonProperty("title")
 @Size(max=100)  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Carousel Pin slots data.
   **/
  
  @ApiModelProperty(value = "Carousel Pin slots data.")
  @JsonProperty("carousel_slots")
  public List<@Valid PinUpdateCarouselSlotsInner> getCarouselSlots() {
    return carouselSlots;
  }
  public void setCarouselSlots(List<@Valid PinUpdateCarouselSlotsInner> carouselSlots) {
    this.carouselSlots = carouselSlots;
  }

  /**
   * Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.
   **/
  
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

