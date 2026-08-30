package org.openapitools.model;

import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AiDisclosures;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.CreativeType;
import org.openapitools.model.PinMedia;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PinBase  {
  
 /**
  * AI disclosure declarations the creator has made about this Pin.
  */
  @ApiModelProperty(value = "AI disclosure declarations the creator has made about this Pin.")

  private AiDisclosures aiDisclosures;

 /**
  * The board to which this Pin belongs.
  */
  @ApiModelProperty(value = "The board to which this Pin belongs.")

  private String boardId;

  @ApiModelProperty(value = "")

  private BoardOwner boardOwner;

 /**
  * The board section to which this Pin belongs.
  */
  @ApiModelProperty(value = "The board section to which this Pin belongs.")

  private String boardSectionId;

  @ApiModelProperty(value = "")

  private Date createdAt;

  @ApiModelProperty(value = "")

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
  **/
  @JsonProperty("ai_disclosures")
  public AiDisclosures getAiDisclosures() {
    return aiDisclosures;
  }

  public void setAiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  public PinBase aiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

 /**
   * The board to which this Pin belongs.
   * @return boardId
  **/
  @JsonProperty("board_id")
  public String getBoardId() {
    return boardId;
  }

  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  public PinBase boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

 /**
   * Get boardOwner
   * @return boardOwner
  **/
  @JsonProperty("board_owner")
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }


 /**
   * The board section to which this Pin belongs.
   * @return boardSectionId
  **/
  @JsonProperty("board_section_id")
  public String getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  public PinBase boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

 /**
   * Get createdAt
   * @return createdAt
  **/
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }


 /**
   * Get creativeType
   * @return creativeType
  **/
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }


 /**
   * Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.
   * @return dominantColor
  **/
  @JsonProperty("dominant_color")
  public String getDominantColor() {
    return dominantColor;
  }

  public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

  public PinBase dominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
    return this;
  }

 /**
   * Whether the Pin has been promoted or not.
   * @return hasBeenPromoted
  **/
  @JsonProperty("has_been_promoted")
  public Boolean getHasBeenPromoted() {
    return hasBeenPromoted;
  }


 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PinBase id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Whether the \&quot;operation user_account\&quot; is the Pin owner.
   * @return isOwner
  **/
  @JsonProperty("is_owner")
  public Boolean getIsOwner() {
    return isOwner;
  }


 /**
   * Whether the Pin is a product Pin.
   * @return isProduct
  **/
  @JsonProperty("is_product")
  public Boolean getIsProduct() {
    return isProduct;
  }


 /**
   * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
   * @return isStandard
  **/
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }


 /**
   * Get media
   * @return media
  **/
  @JsonProperty("media")
  public PinMedia getMedia() {
    return media;
  }


 /**
   * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
   * @return parentPinId
  **/
  @JsonProperty("parent_pin_id")
  public String getParentPinId() {
    return parentPinId;
  }

  public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

  public PinBase parentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
    return this;
  }

 /**
   * Pin metrics with associated time intervals if any.
   * @return pinMetrics
  **/
  @JsonProperty("pin_metrics")
  public Object getPinMetrics() {
    return pinMetrics;
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

