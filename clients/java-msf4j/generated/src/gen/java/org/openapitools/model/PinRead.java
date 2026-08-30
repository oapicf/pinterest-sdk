package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AiDisclosures;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.CreativeType;
import org.openapitools.model.PinMedia;

/**
 * PinRead
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinRead   {
  @JsonProperty("ai_disclosures")
  private AiDisclosures aiDisclosures;

  @JsonProperty("board_id")
  private String boardId;

  @JsonProperty("board_owner")
  private BoardOwner boardOwner;

  @JsonProperty("board_section_id")
  private String boardSectionId;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("creative_type")
  private CreativeType creativeType;

  @JsonProperty("dominant_color")
  private String dominantColor;

  @JsonProperty("has_been_promoted")
  private Boolean hasBeenPromoted;

  @JsonProperty("id")
  private String id;

  @JsonProperty("is_owner")
  private Boolean isOwner;

  @JsonProperty("is_product")
  private Boolean isProduct;

  @JsonProperty("is_standard")
  private Boolean isStandard;

  @JsonProperty("media")
  private PinMedia media;

  @JsonProperty("parent_pin_id")
  private String parentPinId;

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

  public PinRead aiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

   /**
   * AI disclosure declarations the creator has made about this Pin.
   * @return aiDisclosures
  **/
  @ApiModelProperty(value = "AI disclosure declarations the creator has made about this Pin.")
  public AiDisclosures getAiDisclosures() {
    return aiDisclosures;
  }

  public void setAiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  public PinRead boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

   /**
   * The board to which this Pin belongs.
   * @return boardId
  **/
  @ApiModelProperty(value = "The board to which this Pin belongs.")
  public String getBoardId() {
    return boardId;
  }

  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

   /**
   * Get boardOwner
   * @return boardOwner
  **/
  @ApiModelProperty(value = "")
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }

  public PinRead boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

   /**
   * The board section to which this Pin belongs.
   * @return boardSectionId
  **/
  @ApiModelProperty(value = "The board section to which this Pin belongs.")
  public String getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public Date getCreatedAt() {
    return createdAt;
  }

   /**
   * Get creativeType
   * @return creativeType
  **/
  @ApiModelProperty(value = "")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public PinRead dominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
    return this;
  }

   /**
   * Dominant pin color. Hex number, e.g. `#6E7874`.
   * @return dominantColor
  **/
  @ApiModelProperty(value = "Dominant pin color. Hex number, e.g. `#6E7874`.")
  public String getDominantColor() {
    return dominantColor;
  }

  public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

   /**
   * Whether the Pin has been promoted or not.
   * @return hasBeenPromoted
  **/
  @ApiModelProperty(value = "Whether the Pin has been promoted or not.")
  public Boolean getHasBeenPromoted() {
    return hasBeenPromoted;
  }

  public PinRead id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * Whether the \"operation user_account\" is the Pin owner.
   * @return isOwner
  **/
  @ApiModelProperty(value = "Whether the \"operation user_account\" is the Pin owner.")
  public Boolean getIsOwner() {
    return isOwner;
  }

   /**
   * Whether the Pin is a product Pin.
   * @return isProduct
  **/
  @ApiModelProperty(value = "Whether the Pin is a product Pin.")
  public Boolean getIsProduct() {
    return isProduct;
  }

   /**
   * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
   * @return isStandard
  **/
  @ApiModelProperty(value = "Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.")
  public Boolean getIsStandard() {
    return isStandard;
  }

   /**
   * Get media
   * @return media
  **/
  @ApiModelProperty(value = "")
  public PinMedia getMedia() {
    return media;
  }

  public PinRead parentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
    return this;
  }

   /**
   * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
   * @return parentPinId
  **/
  @ApiModelProperty(value = "The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).")
  public String getParentPinId() {
    return parentPinId;
  }

  public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

   /**
   * Pin metrics with associated time intervals if any.
   * @return pinMetrics
  **/
  @ApiModelProperty(example = "{90d={pin_click=7, impression=2, clickthrough=3}, lifetime_metrics={pin_click=7, impression=2, clickthrough=3, reaction=10, comment=2}}", value = "Pin metrics with associated time intervals if any.")
  public Object getPinMetrics() {
    return pinMetrics;
  }

  public PinRead altText(String altText) {
    this.altText = altText;
    return this;
  }

   /**
   * Get altText
   * @return altText
  **/
  @ApiModelProperty(value = "")
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  public PinRead description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PinRead link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(value = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public PinRead title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
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
    PinRead pinRead = (PinRead) o;
    return Objects.equals(this.aiDisclosures, pinRead.aiDisclosures) &&
        Objects.equals(this.boardId, pinRead.boardId) &&
        Objects.equals(this.boardOwner, pinRead.boardOwner) &&
        Objects.equals(this.boardSectionId, pinRead.boardSectionId) &&
        Objects.equals(this.createdAt, pinRead.createdAt) &&
        Objects.equals(this.creativeType, pinRead.creativeType) &&
        Objects.equals(this.dominantColor, pinRead.dominantColor) &&
        Objects.equals(this.hasBeenPromoted, pinRead.hasBeenPromoted) &&
        Objects.equals(this.id, pinRead.id) &&
        Objects.equals(this.isOwner, pinRead.isOwner) &&
        Objects.equals(this.isProduct, pinRead.isProduct) &&
        Objects.equals(this.isStandard, pinRead.isStandard) &&
        Objects.equals(this.media, pinRead.media) &&
        Objects.equals(this.parentPinId, pinRead.parentPinId) &&
        Objects.equals(this.pinMetrics, pinRead.pinMetrics) &&
        Objects.equals(this.altText, pinRead.altText) &&
        Objects.equals(this.description, pinRead.description) &&
        Objects.equals(this.link, pinRead.link) &&
        Objects.equals(this.title, pinRead.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiDisclosures, boardId, boardOwner, boardSectionId, createdAt, creativeType, dominantColor, hasBeenPromoted, id, isOwner, isProduct, isStandard, media, parentPinId, pinMetrics, altText, description, link, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinRead {\n");
    
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

