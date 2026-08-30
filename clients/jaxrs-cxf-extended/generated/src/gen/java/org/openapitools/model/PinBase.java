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


public class PinBase  {
  
 /**
  * AI disclosure declarations the creator has made about this Pin.
  */
  @ApiModelProperty(value = "AI disclosure declarations the creator has made about this Pin.")
  @Valid
  private AiDisclosures aiDisclosures;

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
  public PinBase aiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
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
  public PinBase boardId(String boardId) {
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
  public PinBase boardOwner(BoardOwner boardOwner) {
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
  public PinBase boardSectionId(String boardSectionId) {
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
  public PinBase createdAt(Date createdAt) {
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
  public PinBase creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
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
  public PinBase dominantColor(String dominantColor) {
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
  public PinBase hasBeenPromoted(Boolean hasBeenPromoted) {
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
  public PinBase id(String id) {
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
  public PinBase isOwner(Boolean isOwner) {
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
  public PinBase isProduct(Boolean isProduct) {
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
  public PinBase isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
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
  public PinBase media(PinMedia media) {
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
  public PinBase parentPinId(String parentPinId) {
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
  public PinBase pinMetrics(Object pinMetrics) {
    this.pinMetrics = pinMetrics;
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
    PinBase pinBase = (PinBase) o;
    return Objects.equals(this.aiDisclosures, pinBase.aiDisclosures) &&
        Objects.equals(this.boardId, pinBase.boardId) &&
        Objects.equals(this.boardOwner, pinBase.boardOwner) &&
        Objects.equals(this.boardSectionId, pinBase.boardSectionId) &&
        Objects.equals(this.createdAt, pinBase.createdAt) &&
        Objects.equals(this.creativeType, pinBase.creativeType) &&
        Objects.equals(this.dominantColor, pinBase.dominantColor) &&
        Objects.equals(this.hasBeenPromoted, pinBase.hasBeenPromoted) &&
        Objects.equals(this.id, pinBase.id) &&
        Objects.equals(this.isOwner, pinBase.isOwner) &&
        Objects.equals(this.isProduct, pinBase.isProduct) &&
        Objects.equals(this.isStandard, pinBase.isStandard) &&
        Objects.equals(this.media, pinBase.media) &&
        Objects.equals(this.parentPinId, pinBase.parentPinId) &&
        Objects.equals(this.pinMetrics, pinBase.pinMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiDisclosures, boardId, boardOwner, boardSectionId, createdAt, creativeType, dominantColor, hasBeenPromoted, id, isOwner, isProduct, isStandard, media, parentPinId, pinMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinBase {\n");
    
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

