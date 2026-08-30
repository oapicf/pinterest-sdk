package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AiDisclosuresUpdate;
import org.openapitools.model.CarouselSlot;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create or update operation model.
 */
public class PinUpdate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * AI disclosure declarations the creator has made about this Pin.
   */
  @JsonProperty("ai_disclosures")
  private AiDisclosuresUpdate aiDisclosures;

  @JsonProperty("alt_text")
  private String altText;

  /**
   * The board to which this Pin belongs.
   */
  @JsonProperty("board_id")
  private String boardId;

  /**
   * The board section to which this Pin belongs.
   */
  @JsonProperty("board_section_id")
  private String boardSectionId;

  /**
   * Carousel Pin slots data.
   */
  @JsonProperty("carousel_slots")
  private List<CarouselSlot> carouselSlots = new ArrayList<>();

  @JsonProperty("description")
  private String description;

  @JsonProperty("link")
  private String link;

  @JsonProperty("title")
  private String title;

  /**
   * AI disclosure declarations the creator has made about this Pin.
   * @return aiDisclosures
   */
  public AiDisclosuresUpdate getAiDisclosures() {
    return aiDisclosures;
  }

  public void setAiDisclosures(AiDisclosuresUpdate aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  /**
   * 
   * @return altText
   */
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  /**
   * The board to which this Pin belongs.
   * @return boardId
   */
  public String getBoardId() {
    return boardId;
  }

  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  /**
   * The board section to which this Pin belongs.
   * @return boardSectionId
   */
  public String getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  /**
   * Carousel Pin slots data.
   * @return carouselSlots
   */
  public List<CarouselSlot> getCarouselSlots() {
    return carouselSlots;
  }

  public void setCarouselSlots(List<CarouselSlot> carouselSlots) {
    this.carouselSlots = carouselSlots;
  }

  /**
   * 
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * 
   * @return link
   */
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  /**
   * 
   * @return title
   */
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
