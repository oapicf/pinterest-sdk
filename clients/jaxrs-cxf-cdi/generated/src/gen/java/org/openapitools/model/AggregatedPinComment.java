package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AiDisclosures;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.CreativeType;
import org.openapitools.model.PinMedia;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class AggregatedPinComment   {
  
  private AiDisclosures aiDisclosures;

  private String altText;

  private String boardId;

  private BoardOwner boardOwner;

  private String boardSectionId;

  private java.util.Date createdAt;

  private CreativeType creativeType;

  private String description;

  private String dominantColor;

  private Boolean hasBeenPromoted;

  private String id;

  private Boolean isOwner;

  private Boolean isProduct;

  private Boolean isStandard;

  private String link;

  private PinMedia media;

  private String parentPinId;

  private Object pinMetrics;

  private String title;

  /**
   * AI disclosure declarations the creator has made about this Pin.
   **/
  public AggregatedPinComment aiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
    return this;
  }

  
  @ApiModelProperty(value = "AI disclosure declarations the creator has made about this Pin.")
  @JsonProperty("ai_disclosures")
  public AiDisclosures getAiDisclosures() {
    return aiDisclosures;
  }
  public void setAiDisclosures(AiDisclosures aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }


  /**
   **/
  public AggregatedPinComment altText(String altText) {
    this.altText = altText;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("alt_text")
 @Size(max=500)  public String getAltText() {
    return altText;
  }
  public void setAltText(String altText) {
    this.altText = altText;
  }


  /**
   * The board to which this Pin belongs.
   **/
  public AggregatedPinComment boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

  
  @ApiModelProperty(value = "The board to which this Pin belongs.")
  @JsonProperty("board_id")
 @Pattern(regexp="^\\d+$")  public String getBoardId() {
    return boardId;
  }
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }


  /**
   **/
  public AggregatedPinComment boardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("board_owner")
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }
  public void setBoardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
  }


  /**
   * The board section to which this Pin belongs.
   **/
  public AggregatedPinComment boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

  
  @ApiModelProperty(value = "The board section to which this Pin belongs.")
  @JsonProperty("board_section_id")
 @Pattern(regexp="^\\d+$")  public String getBoardSectionId() {
    return boardSectionId;
  }
  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }


  /**
   **/
  public AggregatedPinComment createdAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("created_at")
  public java.util.Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
  }


  /**
   **/
  public AggregatedPinComment creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }


  /**
   **/
  public AggregatedPinComment description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
 @Size(max=800)  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.
   **/
  public AggregatedPinComment dominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
    return this;
  }

  
  @ApiModelProperty(value = "Dominant pin color. Hex number, e.g. `#6E7874`.")
  @JsonProperty("dominant_color")
  public String getDominantColor() {
    return dominantColor;
  }
  public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }


  /**
   * Whether the Pin has been promoted or not.
   **/
  public AggregatedPinComment hasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the Pin has been promoted or not.")
  @JsonProperty("has_been_promoted")
  public Boolean getHasBeenPromoted() {
    return hasBeenPromoted;
  }
  public void setHasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
  }


  /**
   **/
  public AggregatedPinComment id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Whether the \&quot;operation user_account\&quot; is the Pin owner.
   **/
  public AggregatedPinComment isOwner(Boolean isOwner) {
    this.isOwner = isOwner;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the \"operation user_account\" is the Pin owner.")
  @JsonProperty("is_owner")
  public Boolean getIsOwner() {
    return isOwner;
  }
  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }


  /**
   * Whether the Pin is a product Pin.
   **/
  public AggregatedPinComment isProduct(Boolean isProduct) {
    this.isProduct = isProduct;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the Pin is a product Pin.")
  @JsonProperty("is_product")
  public Boolean getIsProduct() {
    return isProduct;
  }
  public void setIsProduct(Boolean isProduct) {
    this.isProduct = isProduct;
  }


  /**
   * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
   **/
  public AggregatedPinComment isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.")
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }


  /**
   **/
  public AggregatedPinComment link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("link")
 @Size(max=2048)  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }


  /**
   **/
  public AggregatedPinComment media(PinMedia media) {
    this.media = media;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media")
  public PinMedia getMedia() {
    return media;
  }
  public void setMedia(PinMedia media) {
    this.media = media;
  }


  /**
   * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
   **/
  public AggregatedPinComment parentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
    return this;
  }

  
  @ApiModelProperty(value = "The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).")
  @JsonProperty("parent_pin_id")
 @Pattern(regexp="^\\d+$")  public String getParentPinId() {
    return parentPinId;
  }
  public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }


  /**
   * Pin metrics with associated time intervals if any.
   **/
  public AggregatedPinComment pinMetrics(Object pinMetrics) {
    this.pinMetrics = pinMetrics;
    return this;
  }

  
  @ApiModelProperty(example = "{\"90d\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3},\"lifetime_metrics\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3,\"reaction\":10,\"comment\":2}}", value = "Pin metrics with associated time intervals if any.")
  @JsonProperty("pin_metrics")
  public Object getPinMetrics() {
    return pinMetrics;
  }
  public void setPinMetrics(Object pinMetrics) {
    this.pinMetrics = pinMetrics;
  }


  /**
   **/
  public AggregatedPinComment title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
 @Size(max=100)  public String getTitle() {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

