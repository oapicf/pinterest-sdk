package apimodels;

import apimodels.AiDisclosures;
import apimodels.BoardOwner;
import apimodels.CreativeType;
import apimodels.PinMedia;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PinBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinBase   {
  @JsonProperty("ai_disclosures")
  @Valid

  private AiDisclosures aiDisclosures;

  @JsonProperty("board_id")
  @Pattern(regexp="^\\d+$")

  private String boardId;

  @JsonProperty("board_owner")
  @Valid

  private BoardOwner boardOwner;

  @JsonProperty("board_section_id")
  @Pattern(regexp="^\\d+$")

  private String boardSectionId;

  @JsonProperty("created_at")
  @Valid

  private OffsetDateTime createdAt;

  @JsonProperty("creative_type")
  @Valid

  private CreativeType creativeType;

  @JsonProperty("dominant_color")
  
  private String dominantColor;

  @JsonProperty("has_been_promoted")
  
  private Boolean hasBeenPromoted;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("is_owner")
  
  private Boolean isOwner;

  @JsonProperty("is_product")
  
  private Boolean isProduct;

  @JsonProperty("is_standard")
  
  private Boolean isStandard;

  @JsonProperty("media")
  @Valid

  private PinMedia media;

  @JsonProperty("parent_pin_id")
  @Pattern(regexp="^\\d+$")

  private String parentPinId;

  @JsonProperty("pin_metrics")
  
  private Object pinMetrics;

  public PinBase aiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

   /**
   * AI disclosure declarations the creator has made about this Pin.
   * @return aiDisclosures
  **/
  public AiDisclosures getAiDisclosures() {
    return aiDisclosures;
  }

  public void setAiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  public PinBase boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

   /**
   * The board to which this Pin belongs.
   * @return boardId
  **/
  public String getBoardId() {
    return boardId;
  }

  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  public PinBase boardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
    return this;
  }

   /**
   * Get boardOwner
   * @return boardOwner
  **/
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }

  public void setBoardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
  }

  public PinBase boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

   /**
   * The board section to which this Pin belongs.
   * @return boardSectionId
  **/
  public String getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  public PinBase createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public PinBase creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Get creativeType
   * @return creativeType
  **/
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public PinBase dominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
    return this;
  }

   /**
   * Dominant pin color. Hex number, e.g. `#6E7874`.
   * @return dominantColor
  **/
  public String getDominantColor() {
    return dominantColor;
  }

  public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

  public PinBase hasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
    return this;
  }

   /**
   * Whether the Pin has been promoted or not.
   * @return hasBeenPromoted
  **/
  public Boolean getHasBeenPromoted() {
    return hasBeenPromoted;
  }

  public void setHasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
  }

  public PinBase id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PinBase isOwner(Boolean isOwner) {
    this.isOwner = isOwner;
    return this;
  }

   /**
   * Whether the \"operation user_account\" is the Pin owner.
   * @return isOwner
  **/
  public Boolean getIsOwner() {
    return isOwner;
  }

  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

  public PinBase isProduct(Boolean isProduct) {
    this.isProduct = isProduct;
    return this;
  }

   /**
   * Whether the Pin is a product Pin.
   * @return isProduct
  **/
  public Boolean getIsProduct() {
    return isProduct;
  }

  public void setIsProduct(Boolean isProduct) {
    this.isProduct = isProduct;
  }

  public PinBase isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

   /**
   * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
   * @return isStandard
  **/
  public Boolean getIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  public PinBase media(PinMedia media) {
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  public PinMedia getMedia() {
    return media;
  }

  public void setMedia(PinMedia media) {
    this.media = media;
  }

  public PinBase parentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
    return this;
  }

   /**
   * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
   * @return parentPinId
  **/
  public String getParentPinId() {
    return parentPinId;
  }

  public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

  public PinBase pinMetrics(Object pinMetrics) {
    this.pinMetrics = pinMetrics;
    return this;
  }

   /**
   * Pin metrics with associated time intervals if any.
   * @return pinMetrics
  **/
  public Object getPinMetrics() {
    return pinMetrics;
  }

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
    return Objects.equals(aiDisclosures, pinBase.aiDisclosures) &&
        Objects.equals(boardId, pinBase.boardId) &&
        Objects.equals(boardOwner, pinBase.boardOwner) &&
        Objects.equals(boardSectionId, pinBase.boardSectionId) &&
        Objects.equals(createdAt, pinBase.createdAt) &&
        Objects.equals(creativeType, pinBase.creativeType) &&
        Objects.equals(dominantColor, pinBase.dominantColor) &&
        Objects.equals(hasBeenPromoted, pinBase.hasBeenPromoted) &&
        Objects.equals(id, pinBase.id) &&
        Objects.equals(isOwner, pinBase.isOwner) &&
        Objects.equals(isProduct, pinBase.isProduct) &&
        Objects.equals(isStandard, pinBase.isStandard) &&
        Objects.equals(media, pinBase.media) &&
        Objects.equals(parentPinId, pinBase.parentPinId) &&
        Objects.equals(pinMetrics, pinBase.pinMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiDisclosures, boardId, boardOwner, boardSectionId, createdAt, creativeType, dominantColor, hasBeenPromoted, id, isOwner, isProduct, isStandard, media, parentPinId, pinMetrics);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

