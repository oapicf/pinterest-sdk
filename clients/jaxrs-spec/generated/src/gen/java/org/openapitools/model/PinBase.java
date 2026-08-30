package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AiDisclosures;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.CreativeType;
import org.openapitools.model.PinMedia;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PinBase")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinBase   {
  private AiDisclosures aiDisclosures;
  private String boardId;
  private BoardOwner boardOwner;
  private String boardSectionId;
  private Date createdAt;
  private CreativeType creativeType;
  private String dominantColor;
  private Boolean hasBeenPromoted;
  private String id;
  private Boolean isOwner;
  private Boolean isProduct;
  private Boolean isStandard;
  private PinMedia media;
  private String parentPinId;
  private Object pinMetrics;

  public PinBase() {
  }

  @JsonCreator
  public PinBase(
    @JsonProperty(required = true, value = "id") String id
  ) {
    this.id = id;
  }

  /**
   * AI disclosure declarations the creator has made about this Pin.
   **/
  public PinBase aiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

  
  @ApiModelProperty(value = "AI disclosure declarations the creator has made about this Pin.")
  @JsonProperty("ai_disclosures")
  @Valid public AiDisclosures getAiDisclosures() {
    return aiDisclosures;
  }

  @JsonProperty("ai_disclosures")
  public void setAiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  /**
   * The board to which this Pin belongs.
   **/
  public PinBase boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

  
  @ApiModelProperty(value = "The board to which this Pin belongs.")
  @JsonProperty("board_id")
   @Pattern(regexp="^\\d+$")public String getBoardId() {
    return boardId;
  }

  @JsonProperty("board_id")
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  /**
   **/
  public PinBase boardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("board_owner")
  @Valid public BoardOwner getBoardOwner() {
    return boardOwner;
  }

  @JsonProperty("board_owner")
  public void setBoardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
  }

  /**
   * The board section to which this Pin belongs.
   **/
  public PinBase boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

  
  @ApiModelProperty(value = "The board section to which this Pin belongs.")
  @JsonProperty("board_section_id")
   @Pattern(regexp="^\\d+$")public String getBoardSectionId() {
    return boardSectionId;
  }

  @JsonProperty("board_section_id")
  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  /**
   **/
  public PinBase createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  @JsonProperty("created_at")
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public PinBase creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  @JsonProperty("creative_type")
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.
   **/
  public PinBase dominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
    return this;
  }

  
  @ApiModelProperty(value = "Dominant pin color. Hex number, e.g. `#6E7874`.")
  @JsonProperty("dominant_color")
  public String getDominantColor() {
    return dominantColor;
  }

  @JsonProperty("dominant_color")
  public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

  /**
   * Whether the Pin has been promoted or not.
   **/
  public PinBase hasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the Pin has been promoted or not.")
  @JsonProperty("has_been_promoted")
  public Boolean getHasBeenPromoted() {
    return hasBeenPromoted;
  }

  @JsonProperty("has_been_promoted")
  public void setHasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
  }

  /**
   **/
  public PinBase id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether the \&quot;operation user_account\&quot; is the Pin owner.
   **/
  public PinBase isOwner(Boolean isOwner) {
    this.isOwner = isOwner;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the \"operation user_account\" is the Pin owner.")
  @JsonProperty("is_owner")
  public Boolean getIsOwner() {
    return isOwner;
  }

  @JsonProperty("is_owner")
  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

  /**
   * Whether the Pin is a product Pin.
   **/
  public PinBase isProduct(Boolean isProduct) {
    this.isProduct = isProduct;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the Pin is a product Pin.")
  @JsonProperty("is_product")
  public Boolean getIsProduct() {
    return isProduct;
  }

  @JsonProperty("is_product")
  public void setIsProduct(Boolean isProduct) {
    this.isProduct = isProduct;
  }

  /**
   * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
   **/
  public PinBase isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.")
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }

  @JsonProperty("is_standard")
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  /**
   **/
  public PinBase media(PinMedia media) {
    this.media = media;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media")
  @Valid public PinMedia getMedia() {
    return media;
  }

  @JsonProperty("media")
  public void setMedia(PinMedia media) {
    this.media = media;
  }

  /**
   * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
   **/
  public PinBase parentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
    return this;
  }

  
  @ApiModelProperty(value = "The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).")
  @JsonProperty("parent_pin_id")
   @Pattern(regexp="^\\d+$")public String getParentPinId() {
    return parentPinId;
  }

  @JsonProperty("parent_pin_id")
  public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

  /**
   * Pin metrics with associated time intervals if any.
   **/
  public PinBase pinMetrics(Object pinMetrics) {
    this.pinMetrics = pinMetrics;
    return this;
  }

  
  @ApiModelProperty(example = "{\"90d\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3},\"lifetime_metrics\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3,\"reaction\":10,\"comment\":2}}", value = "Pin metrics with associated time intervals if any.")
  @JsonProperty("pin_metrics")
  public Object getPinMetrics() {
    return pinMetrics;
  }

  @JsonProperty("pin_metrics")
  public void setPinMetrics(Object pinMetrics) {
    this.pinMetrics = pinMetrics;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
