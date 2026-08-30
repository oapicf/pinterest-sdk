package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AiDisclosures;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.CreativeType;
import org.openapitools.model.PinMedia;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AggregatedPinComment  {
  
 /**
  * AI disclosure declarations the creator has made about this Pin.
  */
  @ApiModelProperty(value = "AI disclosure declarations the creator has made about this Pin.")
  @Valid
  private AiDisclosures aiDisclosures;

  @ApiModelProperty(value = "")
  private String altText;

 /**
  * The board to which this Pin belongs.
  */
  @ApiModelProperty(value = "The board to which this Pin belongs.")
  private String boardId;

  @ApiModelProperty(value = "")
  @Valid
  private BoardOwner boardOwner;

 /**
  * The board section to which this Pin belongs.
  */
  @ApiModelProperty(value = "The board section to which this Pin belongs.")
  private String boardSectionId;

  @ApiModelProperty(value = "")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date createdAt;

  @ApiModelProperty(value = "")
  @Valid
  private CreativeType creativeType;

  @ApiModelProperty(value = "")
  private String description;

 /**
  * Dominant pin color. Hex number, e.g. `#6E7874`.
  */
  @ApiModelProperty(value = "Dominant pin color. Hex number, e.g. `#6E7874`.")
  private String dominantColor;

 /**
  * Whether the Pin has been promoted or not.
  */
  @ApiModelProperty(value = "Whether the Pin has been promoted or not.")
  private Boolean hasBeenPromoted;

  @ApiModelProperty(required = true, value = "")
  private String id;

 /**
  * Whether the \"operation user_account\" is the Pin owner.
  */
  @ApiModelProperty(value = "Whether the \"operation user_account\" is the Pin owner.")
  private Boolean isOwner;

 /**
  * Whether the Pin is a product Pin.
  */
  @ApiModelProperty(value = "Whether the Pin is a product Pin.")
  private Boolean isProduct;

 /**
  * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
  */
  @ApiModelProperty(value = "Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.")
  private Boolean isStandard;

  @ApiModelProperty(value = "")
  private String link;

  @ApiModelProperty(value = "")
  @Valid
  private PinMedia media;

 /**
  * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
  */
  @ApiModelProperty(value = "The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).")
  private String parentPinId;

 /**
  * Pin metrics with associated time intervals if any.
  */
  @ApiModelProperty(example = "{\"90d\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3},\"lifetime_metrics\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3,\"reaction\":10,\"comment\":2}}", value = "Pin metrics with associated time intervals if any.")
  private Object pinMetrics;

  @ApiModelProperty(value = "")
  private String title;
 /**
  * AI disclosure declarations the creator has made about this Pin.
  * @return aiDisclosures
  */
  @JsonProperty("ai_disclosures")
  public AiDisclosures getAiDisclosures() {
    return aiDisclosures;
  }

  /**
   * Sets the <code>aiDisclosures</code> property.
   */
 public void setAiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  /**
   * Sets the <code>aiDisclosures</code> property.
   */
  public AggregatedPinComment aiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

 /**
  * Get altText
  * @return altText
  */
  @JsonProperty("alt_text")
 @Size(max=500)  public String getAltText() {
    return altText;
  }

  /**
   * Sets the <code>altText</code> property.
   */
 public void setAltText(String altText) {
    this.altText = altText;
  }

  /**
   * Sets the <code>altText</code> property.
   */
  public AggregatedPinComment altText(String altText) {
    this.altText = altText;
    return this;
  }

 /**
  * The board to which this Pin belongs.
  * @return boardId
  */
  @JsonProperty("board_id")
 @Pattern(regexp="^\\d+$")  public String getBoardId() {
    return boardId;
  }

  /**
   * Sets the <code>boardId</code> property.
   */
 public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  /**
   * Sets the <code>boardId</code> property.
   */
  public AggregatedPinComment boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

 /**
  * Get boardOwner
  * @return boardOwner
  */
  @JsonProperty("board_owner")
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }

  /**
   * Sets the <code>boardOwner</code> property.
   * <br><em>N.B. <code>boardOwner</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setBoardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
  }

  /**
   * Sets the <code>boardOwner</code> property.
   * <br><em>N.B. <code>boardOwner</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AggregatedPinComment boardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
    return this;
  }

 /**
  * The board section to which this Pin belongs.
  * @return boardSectionId
  */
  @JsonProperty("board_section_id")
 @Pattern(regexp="^\\d+$")  public String getBoardSectionId() {
    return boardSectionId;
  }

  /**
   * Sets the <code>boardSectionId</code> property.
   */
 public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  /**
   * Sets the <code>boardSectionId</code> property.
   */
  public AggregatedPinComment boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

 /**
  * Get createdAt
  * @return createdAt
  */
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   * <br><em>N.B. <code>createdAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   * <br><em>N.B. <code>createdAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AggregatedPinComment createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Get creativeType
  * @return creativeType
  */
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  /**
   * Sets the <code>creativeType</code> property.
   * <br><em>N.B. <code>creativeType</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Sets the <code>creativeType</code> property.
   * <br><em>N.B. <code>creativeType</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AggregatedPinComment creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

 /**
  * Get description
  * @return description
  */
  @JsonProperty("description")
 @Size(max=800)  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public AggregatedPinComment description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.
  * @return dominantColor
  */
  @JsonProperty("dominant_color")
  public String getDominantColor() {
    return dominantColor;
  }

  /**
   * Sets the <code>dominantColor</code> property.
   */
 public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

  /**
   * Sets the <code>dominantColor</code> property.
   */
  public AggregatedPinComment dominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
    return this;
  }

 /**
  * Whether the Pin has been promoted or not.
  * @return hasBeenPromoted
  */
  @JsonProperty("has_been_promoted")
  public Boolean getHasBeenPromoted() {
    return hasBeenPromoted;
  }

  /**
   * Sets the <code>hasBeenPromoted</code> property.
   * <br><em>N.B. <code>hasBeenPromoted</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setHasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
  }

  /**
   * Sets the <code>hasBeenPromoted</code> property.
   * <br><em>N.B. <code>hasBeenPromoted</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AggregatedPinComment hasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
    return this;
  }

 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public AggregatedPinComment id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Whether the \&quot;operation user_account\&quot; is the Pin owner.
  * @return isOwner
  */
  @JsonProperty("is_owner")
  public Boolean getIsOwner() {
    return isOwner;
  }

  /**
   * Sets the <code>isOwner</code> property.
   * <br><em>N.B. <code>isOwner</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

  /**
   * Sets the <code>isOwner</code> property.
   * <br><em>N.B. <code>isOwner</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AggregatedPinComment isOwner(Boolean isOwner) {
    this.isOwner = isOwner;
    return this;
  }

 /**
  * Whether the Pin is a product Pin.
  * @return isProduct
  */
  @JsonProperty("is_product")
  public Boolean getIsProduct() {
    return isProduct;
  }

  /**
   * Sets the <code>isProduct</code> property.
   * <br><em>N.B. <code>isProduct</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setIsProduct(Boolean isProduct) {
    this.isProduct = isProduct;
  }

  /**
   * Sets the <code>isProduct</code> property.
   * <br><em>N.B. <code>isProduct</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AggregatedPinComment isProduct(Boolean isProduct) {
    this.isProduct = isProduct;
    return this;
  }

 /**
  * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
  * @return isStandard
  */
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }

  /**
   * Sets the <code>isStandard</code> property.
   * <br><em>N.B. <code>isStandard</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  /**
   * Sets the <code>isStandard</code> property.
   * <br><em>N.B. <code>isStandard</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AggregatedPinComment isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

 /**
  * Get link
  * @return link
  */
  @JsonProperty("link")
 @Size(max=2048)  public String getLink() {
    return link;
  }

  /**
   * Sets the <code>link</code> property.
   */
 public void setLink(String link) {
    this.link = link;
  }

  /**
   * Sets the <code>link</code> property.
   */
  public AggregatedPinComment link(String link) {
    this.link = link;
    return this;
  }

 /**
  * Get media
  * @return media
  */
  @JsonProperty("media")
  public PinMedia getMedia() {
    return media;
  }

  /**
   * Sets the <code>media</code> property.
   * <br><em>N.B. <code>media</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setMedia(PinMedia media) {
    this.media = media;
  }

  /**
   * Sets the <code>media</code> property.
   * <br><em>N.B. <code>media</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AggregatedPinComment media(PinMedia media) {
    this.media = media;
    return this;
  }

 /**
  * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
  * @return parentPinId
  */
  @JsonProperty("parent_pin_id")
 @Pattern(regexp="^\\d+$")  public String getParentPinId() {
    return parentPinId;
  }

  /**
   * Sets the <code>parentPinId</code> property.
   */
 public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

  /**
   * Sets the <code>parentPinId</code> property.
   */
  public AggregatedPinComment parentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
    return this;
  }

 /**
  * Pin metrics with associated time intervals if any.
  * @return pinMetrics
  */
  @JsonProperty("pin_metrics")
  public Object getPinMetrics() {
    return pinMetrics;
  }

  /**
   * Sets the <code>pinMetrics</code> property.
   * <br><em>N.B. <code>pinMetrics</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPinMetrics(Object pinMetrics) {
    this.pinMetrics = pinMetrics;
  }

  /**
   * Sets the <code>pinMetrics</code> property.
   * <br><em>N.B. <code>pinMetrics</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AggregatedPinComment pinMetrics(Object pinMetrics) {
    this.pinMetrics = pinMetrics;
    return this;
  }

 /**
  * Get title
  * @return title
  */
  @JsonProperty("title")
 @Size(max=100)  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public AggregatedPinComment title(String title) {
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
    AggregatedPinComment aggregatedPinComment = (AggregatedPinComment) o;
    return Objects.equals(this.aiDisclosures, aggregatedPinComment.aiDisclosures) &&
        Objects.equals(this.altText, aggregatedPinComment.altText) &&
        Objects.equals(this.boardId, aggregatedPinComment.boardId) &&
        Objects.equals(this.boardOwner, aggregatedPinComment.boardOwner) &&
        Objects.equals(this.boardSectionId, aggregatedPinComment.boardSectionId) &&
        Objects.equals(this.createdAt, aggregatedPinComment.createdAt) &&
        Objects.equals(this.creativeType, aggregatedPinComment.creativeType) &&
        Objects.equals(this.description, aggregatedPinComment.description) &&
        Objects.equals(this.dominantColor, aggregatedPinComment.dominantColor) &&
        Objects.equals(this.hasBeenPromoted, aggregatedPinComment.hasBeenPromoted) &&
        Objects.equals(this.id, aggregatedPinComment.id) &&
        Objects.equals(this.isOwner, aggregatedPinComment.isOwner) &&
        Objects.equals(this.isProduct, aggregatedPinComment.isProduct) &&
        Objects.equals(this.isStandard, aggregatedPinComment.isStandard) &&
        Objects.equals(this.link, aggregatedPinComment.link) &&
        Objects.equals(this.media, aggregatedPinComment.media) &&
        Objects.equals(this.parentPinId, aggregatedPinComment.parentPinId) &&
        Objects.equals(this.pinMetrics, aggregatedPinComment.pinMetrics) &&
        Objects.equals(this.title, aggregatedPinComment.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiDisclosures, altText, boardId, boardOwner, boardSectionId, createdAt, creativeType, description, dominantColor, hasBeenPromoted, id, isOwner, isProduct, isStandard, link, media, parentPinId, pinMetrics, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AggregatedPinComment {\n");
    
    sb.append("    aiDisclosures: ").append(toIndentedString(aiDisclosures)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardOwner: ").append(toIndentedString(boardOwner)).append("\n");
    sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dominantColor: ").append(toIndentedString(dominantColor)).append("\n");
    sb.append("    hasBeenPromoted: ").append(toIndentedString(hasBeenPromoted)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    isProduct: ").append(toIndentedString(isProduct)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    parentPinId: ").append(toIndentedString(parentPinId)).append("\n");
    sb.append("    pinMetrics: ").append(toIndentedString(pinMetrics)).append("\n");
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

