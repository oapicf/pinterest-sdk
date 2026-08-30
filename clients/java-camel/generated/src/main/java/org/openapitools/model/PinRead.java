package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AiDisclosures;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.CreativeType;
import org.openapitools.model.PinMedia;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PinRead
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinRead {

  private AiDisclosures aiDisclosures;

  private String boardId;

  private BoardOwner boardOwner;

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> boardSectionId = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date createdAt;

  private JsonNullable<CreativeType> creativeType = JsonNullable.<CreativeType>undefined();

  private JsonNullable<String> dominantColor = JsonNullable.<String>undefined();

  private Boolean hasBeenPromoted;

  private String id;

  private Boolean isOwner;

  private Boolean isProduct;

  private Boolean isStandard;

  private PinMedia media;

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> parentPinId = JsonNullable.<String>undefined();

  private JsonNullable<Object> pinMetrics = JsonNullable.<Object>undefined();

  private JsonNullable<String> altText = JsonNullable.<String>undefined();

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private JsonNullable<String> link = JsonNullable.<String>undefined();

  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public PinRead() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PinRead(String id) {
    this.id = id;
  }

  public PinRead aiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

  /**
   * AI disclosure declarations the creator has made about this Pin.
   * @return aiDisclosures
   */
  @Valid 
  @Schema(name = "ai_disclosures", description = "AI disclosure declarations the creator has made about this Pin.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ai_disclosures")
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
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "board_id", description = "The board to which this Pin belongs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board_id")
  public String getBoardId() {
    return boardId;
  }

  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  public PinRead boardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
    return this;
  }

  /**
   * Get boardOwner
   * @return boardOwner
   */
  @Valid 
  @Schema(name = "board_owner", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board_owner")
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }

  public void setBoardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
  }

  public PinRead boardSectionId(String boardSectionId) {
    this.boardSectionId = JsonNullable.of(boardSectionId);
    return this;
  }

  /**
   * The board section to which this Pin belongs.
   * @return boardSectionId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "board_section_id", description = "The board section to which this Pin belongs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board_section_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(JsonNullable<String> boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  public PinRead createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public PinRead creativeType(CreativeType creativeType) {
    this.creativeType = JsonNullable.of(creativeType);
    return this;
  }

  /**
   * Get creativeType
   * @return creativeType
   */
  @Valid 
  @Schema(name = "creative_type", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creative_type")
  public JsonNullable<CreativeType> getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(JsonNullable<CreativeType> creativeType) {
    this.creativeType = creativeType;
  }

  public PinRead dominantColor(String dominantColor) {
    this.dominantColor = JsonNullable.of(dominantColor);
    return this;
  }

  /**
   * Dominant pin color. Hex number, e.g. `#6E7874`.
   * @return dominantColor
   */
  
  @Schema(name = "dominant_color", description = "Dominant pin color. Hex number, e.g. `#6E7874`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dominant_color")
  public JsonNullable<String> getDominantColor() {
    return dominantColor;
  }

  public void setDominantColor(JsonNullable<String> dominantColor) {
    this.dominantColor = dominantColor;
  }

  public PinRead hasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
    return this;
  }

  /**
   * Whether the Pin has been promoted or not.
   * @return hasBeenPromoted
   */
  
  @Schema(name = "has_been_promoted", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the Pin has been promoted or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_been_promoted")
  public Boolean getHasBeenPromoted() {
    return hasBeenPromoted;
  }

  public void setHasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
  }

  public PinRead id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PinRead isOwner(Boolean isOwner) {
    this.isOwner = isOwner;
    return this;
  }

  /**
   * Whether the \"operation user_account\" is the Pin owner.
   * @return isOwner
   */
  
  @Schema(name = "is_owner", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the \"operation user_account\" is the Pin owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_owner")
  public Boolean getIsOwner() {
    return isOwner;
  }

  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

  public PinRead isProduct(Boolean isProduct) {
    this.isProduct = isProduct;
    return this;
  }

  /**
   * Whether the Pin is a product Pin.
   * @return isProduct
   */
  
  @Schema(name = "is_product", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the Pin is a product Pin.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_product")
  public Boolean getIsProduct() {
    return isProduct;
  }

  public void setIsProduct(Boolean isProduct) {
    this.isProduct = isProduct;
  }

  public PinRead isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

  /**
   * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
   * @return isStandard
   */
  
  @Schema(name = "is_standard", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  public PinRead media(PinMedia media) {
    this.media = media;
    return this;
  }

  /**
   * Get media
   * @return media
   */
  @Valid 
  @Schema(name = "media", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media")
  public PinMedia getMedia() {
    return media;
  }

  public void setMedia(PinMedia media) {
    this.media = media;
  }

  public PinRead parentPinId(String parentPinId) {
    this.parentPinId = JsonNullable.of(parentPinId);
    return this;
  }

  /**
   * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
   * @return parentPinId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "parent_pin_id", description = "The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_pin_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getParentPinId() {
    return parentPinId;
  }

  public void setParentPinId(JsonNullable<String> parentPinId) {
    this.parentPinId = parentPinId;
  }

  public PinRead pinMetrics(Object pinMetrics) {
    this.pinMetrics = JsonNullable.of(pinMetrics);
    return this;
  }

  /**
   * Pin metrics with associated time intervals if any.
   * @return pinMetrics
   */
  
  @Schema(name = "pin_metrics", accessMode = Schema.AccessMode.READ_ONLY, example = "{90d={pin_click=7, impression=2, clickthrough=3}, lifetime_metrics={pin_click=7, impression=2, clickthrough=3, reaction=10, comment=2}}", description = "Pin metrics with associated time intervals if any.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_metrics")
  public JsonNullable<Object> getPinMetrics() {
    return pinMetrics;
  }

  public void setPinMetrics(JsonNullable<Object> pinMetrics) {
    this.pinMetrics = pinMetrics;
  }

  public PinRead altText(String altText) {
    this.altText = JsonNullable.of(altText);
    return this;
  }

  /**
   * Get altText
   * @return altText
   */
  
  @Schema(name = "alt_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alt_text")
  public JsonNullable<String> getAltText() {
    return altText;
  }

  public void setAltText(JsonNullable<String> altText) {
    this.altText = altText;
  }

  public PinRead description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public PinRead link(String link) {
    this.link = JsonNullable.of(link);
    return this;
  }

  /**
   * Get link
   * @return link
   */
  
  @Schema(name = "link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public JsonNullable<String> getLink() {
    return link;
  }

  public void setLink(JsonNullable<String> link) {
    this.link = link;
  }

  public PinRead title(String title) {
    this.title = JsonNullable.of(title);
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public JsonNullable<String> getTitle() {
    return title;
  }

  public void setTitle(JsonNullable<String> title) {
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
        equalsNullable(this.boardSectionId, pinRead.boardSectionId) &&
        Objects.equals(this.createdAt, pinRead.createdAt) &&
        equalsNullable(this.creativeType, pinRead.creativeType) &&
        equalsNullable(this.dominantColor, pinRead.dominantColor) &&
        Objects.equals(this.hasBeenPromoted, pinRead.hasBeenPromoted) &&
        Objects.equals(this.id, pinRead.id) &&
        Objects.equals(this.isOwner, pinRead.isOwner) &&
        Objects.equals(this.isProduct, pinRead.isProduct) &&
        Objects.equals(this.isStandard, pinRead.isStandard) &&
        Objects.equals(this.media, pinRead.media) &&
        equalsNullable(this.parentPinId, pinRead.parentPinId) &&
        equalsNullable(this.pinMetrics, pinRead.pinMetrics) &&
        equalsNullable(this.altText, pinRead.altText) &&
        equalsNullable(this.description, pinRead.description) &&
        equalsNullable(this.link, pinRead.link) &&
        equalsNullable(this.title, pinRead.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiDisclosures, boardId, boardOwner, hashCodeNullable(boardSectionId), createdAt, hashCodeNullable(creativeType), hashCodeNullable(dominantColor), hasBeenPromoted, id, isOwner, isProduct, isStandard, media, hashCodeNullable(parentPinId), hashCodeNullable(pinMetrics), hashCodeNullable(altText), hashCodeNullable(description), hashCodeNullable(link), hashCodeNullable(title));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

