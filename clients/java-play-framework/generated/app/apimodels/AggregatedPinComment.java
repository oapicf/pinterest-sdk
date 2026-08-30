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
 * AggregatedPinComment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AggregatedPinComment   {
  @JsonProperty("ai_disclosures")
  @Valid

  private AiDisclosures aiDisclosures;

  @JsonProperty("alt_text")
  @Size(max=500)

  private String altText;

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

  @JsonProperty("description")
  @Size(max=800)

  private String description;

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

  @JsonProperty("link")
  @Size(max=2048)

  private String link;

  @JsonProperty("media")
  @Valid

  private PinMedia media;

  @JsonProperty("parent_pin_id")
  @Pattern(regexp="^\\d+$")

  private String parentPinId;

  @JsonProperty("pin_metrics")
  
  private Object pinMetrics;

  @JsonProperty("title")
  @Size(max=100)

  private String title;

  public AggregatedPinComment aiDisclosures(AiDisclosures aiDisclosures) {
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

  public AggregatedPinComment altText(String altText) {
    this.altText = altText;
    return this;
  }

   /**
   * Get altText
   * @return altText
  **/
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  public AggregatedPinComment boardId(String boardId) {
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

  public AggregatedPinComment boardOwner(BoardOwner boardOwner) {
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

  public AggregatedPinComment boardSectionId(String boardSectionId) {
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

  public AggregatedPinComment createdAt(OffsetDateTime createdAt) {
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

  public AggregatedPinComment creativeType(CreativeType creativeType) {
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

  public AggregatedPinComment description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AggregatedPinComment dominantColor(String dominantColor) {
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

  public AggregatedPinComment hasBeenPromoted(Boolean hasBeenPromoted) {
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

  public AggregatedPinComment id(String id) {
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

  public AggregatedPinComment isOwner(Boolean isOwner) {
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

  public AggregatedPinComment isProduct(Boolean isProduct) {
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

  public AggregatedPinComment isStandard(Boolean isStandard) {
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

  public AggregatedPinComment link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public AggregatedPinComment media(PinMedia media) {
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

  public AggregatedPinComment parentPinId(String parentPinId) {
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

  public AggregatedPinComment pinMetrics(Object pinMetrics) {
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

  public AggregatedPinComment title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
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
    AggregatedPinComment aggregatedPinComment = (AggregatedPinComment) o;
    return Objects.equals(aiDisclosures, aggregatedPinComment.aiDisclosures) &&
        Objects.equals(altText, aggregatedPinComment.altText) &&
        Objects.equals(boardId, aggregatedPinComment.boardId) &&
        Objects.equals(boardOwner, aggregatedPinComment.boardOwner) &&
        Objects.equals(boardSectionId, aggregatedPinComment.boardSectionId) &&
        Objects.equals(createdAt, aggregatedPinComment.createdAt) &&
        Objects.equals(creativeType, aggregatedPinComment.creativeType) &&
        Objects.equals(description, aggregatedPinComment.description) &&
        Objects.equals(dominantColor, aggregatedPinComment.dominantColor) &&
        Objects.equals(hasBeenPromoted, aggregatedPinComment.hasBeenPromoted) &&
        Objects.equals(id, aggregatedPinComment.id) &&
        Objects.equals(isOwner, aggregatedPinComment.isOwner) &&
        Objects.equals(isProduct, aggregatedPinComment.isProduct) &&
        Objects.equals(isStandard, aggregatedPinComment.isStandard) &&
        Objects.equals(link, aggregatedPinComment.link) &&
        Objects.equals(media, aggregatedPinComment.media) &&
        Objects.equals(parentPinId, aggregatedPinComment.parentPinId) &&
        Objects.equals(pinMetrics, aggregatedPinComment.pinMetrics) &&
        Objects.equals(title, aggregatedPinComment.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiDisclosures, altText, boardId, boardOwner, boardSectionId, createdAt, creativeType, description, dominantColor, hasBeenPromoted, id, isOwner, isProduct, isStandard, link, media, parentPinId, pinMetrics, title);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

