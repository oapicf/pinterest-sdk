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
public class PinRead   {
  
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
  private String altText;
  private String description;
  private String link;
  private String title;

  public PinRead () {

  }

  public PinRead (AiDisclosures aiDisclosures, String boardId, BoardOwner boardOwner, String boardSectionId, OffsetDateTime createdAt, CreativeType creativeType, String dominantColor, Boolean hasBeenPromoted, String id, Boolean isOwner, Boolean isProduct, Boolean isStandard, PinMedia media, String parentPinId, Object pinMetrics, String altText, String description, String link, String title) {
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
    this.altText = altText;
    this.description = description;
    this.link = link;
    this.title = title;
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

    
  @JsonProperty("alt_text")
  public String getAltText() {
    return altText;
  }
  public void setAltText(String altText) {
    this.altText = altText;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

    
  @JsonProperty("title")
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
    return Objects.equals(aiDisclosures, pinRead.aiDisclosures) &&
        Objects.equals(boardId, pinRead.boardId) &&
        Objects.equals(boardOwner, pinRead.boardOwner) &&
        Objects.equals(boardSectionId, pinRead.boardSectionId) &&
        Objects.equals(createdAt, pinRead.createdAt) &&
        Objects.equals(creativeType, pinRead.creativeType) &&
        Objects.equals(dominantColor, pinRead.dominantColor) &&
        Objects.equals(hasBeenPromoted, pinRead.hasBeenPromoted) &&
        Objects.equals(id, pinRead.id) &&
        Objects.equals(isOwner, pinRead.isOwner) &&
        Objects.equals(isProduct, pinRead.isProduct) &&
        Objects.equals(isStandard, pinRead.isStandard) &&
        Objects.equals(media, pinRead.media) &&
        Objects.equals(parentPinId, pinRead.parentPinId) &&
        Objects.equals(pinMetrics, pinRead.pinMetrics) &&
        Objects.equals(altText, pinRead.altText) &&
        Objects.equals(description, pinRead.description) &&
        Objects.equals(link, pinRead.link) &&
        Objects.equals(title, pinRead.title);
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
