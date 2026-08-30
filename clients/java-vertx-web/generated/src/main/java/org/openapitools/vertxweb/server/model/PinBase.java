package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AiDisclosures;
import org.openapitools.vertxweb.server.model.BoardOwner;
import org.openapitools.vertxweb.server.model.CreativeType;
import org.openapitools.vertxweb.server.model.PinMedia;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinBase   {
  
  private AiDisclosures aiDisclosures;
  private String boardId;
  private BoardOwner boardOwner;
  private String boardSectionId;
  private OffsetDateTime createdAt;
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

  public PinBase () {

  }

  public PinBase (AiDisclosures aiDisclosures, String boardId, BoardOwner boardOwner, String boardSectionId, OffsetDateTime createdAt, CreativeType creativeType, String dominantColor, Boolean hasBeenPromoted, String id, Boolean isOwner, Boolean isProduct, Boolean isStandard, PinMedia media, String parentPinId, Object pinMetrics) {
    this.aiDisclosures = aiDisclosures;
    this.boardId = boardId;
    this.boardOwner = boardOwner;
    this.boardSectionId = boardSectionId;
    this.createdAt = createdAt;
    this.creativeType = creativeType;
    this.dominantColor = dominantColor;
    this.hasBeenPromoted = hasBeenPromoted;
    this.id = id;
    this.isOwner = isOwner;
    this.isProduct = isProduct;
    this.isStandard = isStandard;
    this.media = media;
    this.parentPinId = parentPinId;
    this.pinMetrics = pinMetrics;
  }

    
  @JsonProperty("ai_disclosures")
  public AiDisclosures getAiDisclosures() {
    return aiDisclosures;
  }
  public void setAiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

    
  @JsonProperty("board_id")
  public String getBoardId() {
    return boardId;
  }
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

    
  @JsonProperty("board_owner")
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }
  public void setBoardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
  }

    
  @JsonProperty("board_section_id")
  public String getBoardSectionId() {
    return boardSectionId;
  }
  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

    
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

    
  @JsonProperty("dominant_color")
  public String getDominantColor() {
    return dominantColor;
  }
  public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

    
  @JsonProperty("has_been_promoted")
  public Boolean getHasBeenPromoted() {
    return hasBeenPromoted;
  }
  public void setHasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("is_owner")
  public Boolean getIsOwner() {
    return isOwner;
  }
  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

    
  @JsonProperty("is_product")
  public Boolean getIsProduct() {
    return isProduct;
  }
  public void setIsProduct(Boolean isProduct) {
    this.isProduct = isProduct;
  }

    
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

    
  @JsonProperty("media")
  public PinMedia getMedia() {
    return media;
  }
  public void setMedia(PinMedia media) {
    this.media = media;
  }

    
  @JsonProperty("parent_pin_id")
  public String getParentPinId() {
    return parentPinId;
  }
  public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

    
  @JsonProperty("pin_metrics")
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
