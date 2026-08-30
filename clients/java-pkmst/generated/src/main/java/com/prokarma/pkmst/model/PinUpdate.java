package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AiDisclosuresUpdate;
import com.prokarma.pkmst.model.CarouselSlot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Resource create or update operation model.
 */
@ApiModel(description = "Resource create or update operation model.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinUpdate   {
  @JsonProperty("ai_disclosures")
  private AiDisclosuresUpdate aiDisclosures;

  @JsonProperty("alt_text")
  private String altText;

  @JsonProperty("board_id")
  private String boardId;

  @JsonProperty("board_section_id")
  private String boardSectionId;

  @JsonProperty("carousel_slots")
  
  private List<CarouselSlot> carouselSlots = null;

  @JsonProperty("description")
  private String description;

  @JsonProperty("link")
  private String link;

  @JsonProperty("title")
  private String title;

  public PinUpdate aiDisclosures(AiDisclosuresUpdate aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

  /**
   * AI disclosure declarations the creator has made about this Pin.
   * @return aiDisclosures
   */
  @ApiModelProperty(value = "AI disclosure declarations the creator has made about this Pin.")
  public AiDisclosuresUpdate getAiDisclosures() {
    return aiDisclosures;
  }

  public void setAiDisclosures(AiDisclosuresUpdate aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  public PinUpdate altText(String altText) {
    this.altText = altText;
    return this;
  }

  /**
   * Get altText
   * @return altText
   */
  @ApiModelProperty(value = "")
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
   * The board to which this Pin belongs.
   * @return boardId
   */
  @ApiModelProperty(value = "The board to which this Pin belongs.")
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
   * The board section to which this Pin belongs.
   * @return boardSectionId
   */
  @ApiModelProperty(value = "The board section to which this Pin belongs.")
  public String getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  public PinUpdate carouselSlots(List<CarouselSlot> carouselSlots) {
    this.carouselSlots = carouselSlots;
    return this;
  }

  public PinUpdate addCarouselSlotsItem(CarouselSlot carouselSlotsItem) {
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
  @ApiModelProperty(value = "Carousel Pin slots data.")
  public List<CarouselSlot> getCarouselSlots() {
    return carouselSlots;
  }

  public void setCarouselSlots(List<CarouselSlot> carouselSlots) {
    this.carouselSlots = carouselSlots;
  }

  public PinUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @ApiModelProperty(value = "")
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
   * Get link
   * @return link
   */
  @ApiModelProperty(value = "")
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
   * Get title
   * @return title
   */
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

