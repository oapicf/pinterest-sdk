package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AiDisclosuresUpdate;
import org.openapitools.model.CarouselSlot;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create or update operation model.
 */
@ApiModel(description="Resource create or update operation model.")

public class PinUpdate  {
  
 /**
  * AI disclosure declarations the creator has made about this Pin.
  */
  @ApiModelProperty(value = "AI disclosure declarations the creator has made about this Pin.")

  @Valid

  private AiDisclosuresUpdate aiDisclosures;

  @ApiModelProperty(value = "")

  private String altText;

 /**
  * The board to which this Pin belongs.
  */
  @ApiModelProperty(value = "The board to which this Pin belongs.")

  private String boardId;

 /**
  * The board section to which this Pin belongs.
  */
  @ApiModelProperty(value = "The board section to which this Pin belongs.")

  private String boardSectionId;

 /**
  * Carousel Pin slots data.
  */
  @ApiModelProperty(value = "Carousel Pin slots data.")

  @Valid

  private List<@Valid CarouselSlot> carouselSlots = new ArrayList<>();

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String link;

  @ApiModelProperty(value = "")

  private String title;
 /**
   * AI disclosure declarations the creator has made about this Pin.
   * @return aiDisclosures
  **/
  @JsonProperty("ai_disclosures")
  public AiDisclosuresUpdate getAiDisclosures() {
    return aiDisclosures;
  }

  public void setAiDisclosures(AiDisclosuresUpdate aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  public PinUpdate aiDisclosures(AiDisclosuresUpdate aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

 /**
   * Get altText
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
   * The board to which this Pin belongs.
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
   * The board section to which this Pin belongs.
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
   * Carousel Pin slots data.
   * @return carouselSlots
  **/
  @JsonProperty("carousel_slots")
  public List<@Valid CarouselSlot> getCarouselSlots() {
    return carouselSlots;
  }

  public void setCarouselSlots(List<@Valid CarouselSlot> carouselSlots) {
    this.carouselSlots = carouselSlots;
  }

  public PinUpdate carouselSlots(List<@Valid CarouselSlot> carouselSlots) {
    this.carouselSlots = carouselSlots;
    return this;
  }

  public PinUpdate addCarouselSlotsItem(CarouselSlot carouselSlotsItem) {
    this.carouselSlots.add(carouselSlotsItem);
    return this;
  }

 /**
   * Get description
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
   * Get link
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
   * Get title
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinUpdate pinUpdate = (PinUpdate) o;
    return Objects.equals(this.aiDisclosures, pinUpdate.aiDisclosures) &&
        Objects.equals(this.altText, pinUpdate.altText) &&
        Objects.equals(this.boardId, pinUpdate.boardId) &&
        Objects.equals(this.boardSectionId, pinUpdate.boardSectionId) &&
        Objects.equals(this.carouselSlots, pinUpdate.carouselSlots) &&
        Objects.equals(this.description, pinUpdate.description) &&
        Objects.equals(this.link, pinUpdate.link) &&
        Objects.equals(this.title, pinUpdate.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiDisclosures, altText, boardId, boardSectionId, carouselSlots, description, link, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinUpdate {\n");
    
    sb.append("    aiDisclosures: ").append(toIndentedString(aiDisclosures)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
    sb.append("    carouselSlots: ").append(toIndentedString(carouselSlots)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

