package org.openapitools.model;

import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AiDisclosures;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.CreativeType;
import org.openapitools.model.PinMedia;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class Pin implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * AI disclosure declarations the creator has made about this Pin.
   */
  @JsonProperty("ai_disclosures")
  private AiDisclosures aiDisclosures;

  /**
   * The board to which this Pin belongs.
   */
  @JsonProperty("board_id")
  private String boardId;

  @JsonProperty("board_owner")
  private BoardOwner boardOwner;

  /**
   * The board section to which this Pin belongs.
   */
  @JsonProperty("board_section_id")
  private String boardSectionId;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt;

  @JsonProperty("creative_type")
  private CreativeType creativeType;

  /**
   * Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.
   */
  @JsonProperty("dominant_color")
  private String dominantColor;

  /**
   * Whether the Pin has been promoted or not.
   */
  @JsonProperty("has_been_promoted")
  private Boolean hasBeenPromoted;

  @JsonProperty("id")
  private String id;

  /**
   * Whether the \&quot;operation user_account\&quot; is the Pin owner.
   */
  @JsonProperty("is_owner")
  private Boolean isOwner;

  /**
   * Whether the Pin is a product Pin.
   */
  @JsonProperty("is_product")
  private Boolean isProduct;

  /**
   * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
   */
  @JsonProperty("is_standard")
  private Boolean isStandard;

  @JsonProperty("media")
  private PinMedia media;

  /**
   * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
   */
  @JsonProperty("parent_pin_id")
  private String parentPinId;

  /**
   * Pin metrics with associated time intervals if any.
   */
  @JsonProperty("pin_metrics")
  private Object pinMetrics;

  @JsonProperty("alt_text")
  private String altText;

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
  public AiDisclosures getAiDisclosures() {
    return aiDisclosures;
  }

  public void setAiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
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
   * 
   * @return boardOwner
   */
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }

  public void setBoardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
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
   * 
   * @return createdAt
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * 
   * @return creativeType
   */
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.
   * @return dominantColor
   */
  public String getDominantColor() {
    return dominantColor;
  }

  public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

  /**
   * Whether the Pin has been promoted or not.
   * @return hasBeenPromoted
   */
  public Boolean getHasBeenPromoted() {
    return hasBeenPromoted;
  }

  public void setHasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
  }

  /**
   * 
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether the \&quot;operation user_account\&quot; is the Pin owner.
   * @return isOwner
   */
  public Boolean getIsOwner() {
    return isOwner;
  }

  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

  /**
   * Whether the Pin is a product Pin.
   * @return isProduct
   */
  public Boolean getIsProduct() {
    return isProduct;
  }

  public void setIsProduct(Boolean isProduct) {
    this.isProduct = isProduct;
  }

  /**
   * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
   * @return isStandard
   */
  public Boolean getIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  /**
   * 
   * @return media
   */
  public PinMedia getMedia() {
    return media;
  }

  public void setMedia(PinMedia media) {
    this.media = media;
  }

  /**
   * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
   * @return parentPinId
   */
  public String getParentPinId() {
    return parentPinId;
  }

  public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

  /**
   * Pin metrics with associated time intervals if any.
   * @return pinMetrics
   */
  public Object getPinMetrics() {
    return pinMetrics;
  }

  public void setPinMetrics(Object pinMetrics) {
    this.pinMetrics = pinMetrics;
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
    Pin pin = (Pin) o;
    return Objects.equals(this.aiDisclosures, pin.aiDisclosures) &&
        Objects.equals(this.boardId, pin.boardId) &&
        Objects.equals(this.boardOwner, pin.boardOwner) &&
        Objects.equals(this.boardSectionId, pin.boardSectionId) &&
        Objects.equals(this.createdAt, pin.createdAt) &&
        Objects.equals(this.creativeType, pin.creativeType) &&
        Objects.equals(this.dominantColor, pin.dominantColor) &&
        Objects.equals(this.hasBeenPromoted, pin.hasBeenPromoted) &&
        Objects.equals(this.id, pin.id) &&
        Objects.equals(this.isOwner, pin.isOwner) &&
        Objects.equals(this.isProduct, pin.isProduct) &&
        Objects.equals(this.isStandard, pin.isStandard) &&
        Objects.equals(this.media, pin.media) &&
        Objects.equals(this.parentPinId, pin.parentPinId) &&
        Objects.equals(this.pinMetrics, pin.pinMetrics) &&
        Objects.equals(this.altText, pin.altText) &&
        Objects.equals(this.description, pin.description) &&
        Objects.equals(this.link, pin.link) &&
        Objects.equals(this.title, pin.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiDisclosures, boardId, boardOwner, boardSectionId, createdAt, creativeType, dominantColor, hasBeenPromoted, id, isOwner, isProduct, isStandard, media, parentPinId, pinMetrics, altText, description, link, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pin {\n");
    
    sb.append("    aiDisclosures: ").append(toIndentedString(aiDisclosures)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardOwner: ").append(toIndentedString(boardOwner)).append("\n");
    sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    dominantColor: ").append(toIndentedString(dominantColor)).append("\n");
    sb.append("    hasBeenPromoted: ").append(toIndentedString(hasBeenPromoted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    isProduct: ").append(toIndentedString(isProduct)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    parentPinId: ").append(toIndentedString(parentPinId)).append("\n");
    sb.append("    pinMetrics: ").append(toIndentedString(pinMetrics)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
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
