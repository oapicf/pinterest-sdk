package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.BoardOwner;
import com.prokarma.pkmst.model.CreativeType;
import com.prokarma.pkmst.model.PinMediaSource;
import com.prokarma.pkmst.model.SummaryPinMedia;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Pin
 */
@ApiModel(description = "Pin")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Pin   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt;

  @JsonProperty("link")
  private String link;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("dominant_color")
  private String dominantColor;

  @JsonProperty("alt_text")
  private String altText;

  @JsonProperty("creative_type")
  private CreativeType creativeType;

  @JsonProperty("board_id")
  private String boardId;

  @JsonProperty("board_section_id")
  private String boardSectionId;

  @JsonProperty("board_owner")
  private BoardOwner boardOwner;

  @JsonProperty("is_owner")
  private Boolean isOwner;

  @JsonProperty("media")
  private SummaryPinMedia media;

  @JsonProperty("media_source")
  private PinMediaSource mediaSource;

  @JsonProperty("parent_pin_id")
  private String parentPinId;

  @JsonProperty("is_standard")
  private Boolean isStandard;

  @JsonProperty("has_been_promoted")
  private Boolean hasBeenPromoted;

  @JsonProperty("note")
  private String note;

  @JsonProperty("pin_metrics")
  private Object pinMetrics;

  public Pin id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "813744226420795884", readOnly = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Pin createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2020-01-01T20:10:40Z", readOnly = true, value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Pin link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(example = "https://www.pinterest.com/", value = "")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Pin title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Pin description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Pin dominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
    return this;
  }

   /**
   * Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
   * @return dominantColor
  **/
  @ApiModelProperty(example = "#6E7874", value = "Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".")
  public String getDominantColor() {
    return dominantColor;
  }

  public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

  public Pin altText(String altText) {
    this.altText = altText;
    return this;
  }

   /**
   * Get altText
   * @return altText
  **/
  @ApiModelProperty(value = "")
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
  }

  public Pin creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Get creativeType
   * @return creativeType
  **/
  @ApiModelProperty(readOnly = true, value = "")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public Pin boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

   /**
   * The board to which this Pin belongs.
   * @return boardId
  **/
  @ApiModelProperty(value = "The board to which this Pin belongs.")
  public String getBoardId() {
    return boardId;
  }

  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  public Pin boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

   /**
   * The board section to which this Pin belongs.
   * @return boardSectionId
  **/
  @ApiModelProperty(value = "The board section to which this Pin belongs.")
  public String getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  public Pin boardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
    return this;
  }

   /**
   * Get boardOwner
   * @return boardOwner
  **/
  @ApiModelProperty(value = "")
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }

  public void setBoardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
  }

  public Pin isOwner(Boolean isOwner) {
    this.isOwner = isOwner;
    return this;
  }

   /**
   * Whether the \"operation user_account\" is the Pin owner.
   * @return isOwner
  **/
  @ApiModelProperty(readOnly = true, value = "Whether the \"operation user_account\" is the Pin owner.")
  public Boolean getIsOwner() {
    return isOwner;
  }

  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }

  public Pin media(SummaryPinMedia media) {
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @ApiModelProperty(value = "")
  public SummaryPinMedia getMedia() {
    return media;
  }

  public void setMedia(SummaryPinMedia media) {
    this.media = media;
  }

  public Pin mediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
    return this;
  }

   /**
   * Get mediaSource
   * @return mediaSource
  **/
  @ApiModelProperty(value = "")
  public PinMediaSource getMediaSource() {
    return mediaSource;
  }

  public void setMediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
  }

  public Pin parentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
    return this;
  }

   /**
   * The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
   * @return parentPinId
  **/
  @ApiModelProperty(value = "The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.")
  public String getParentPinId() {
    return parentPinId;
  }

  public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

  public Pin isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

   /**
   * Whether the Pin is standard or not. See documentation on <a href=\"https://developers.pinterest.com/docs/content/update/\">Changes to Pin creation</a> for more information.
   * @return isStandard
  **/
  @ApiModelProperty(value = "Whether the Pin is standard or not. See documentation on <a href=\"https://developers.pinterest.com/docs/content/update/\">Changes to Pin creation</a> for more information.")
  public Boolean getIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  public Pin hasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
    return this;
  }

   /**
   * Whether the Pin has been promoted or not.
   * @return hasBeenPromoted
  **/
  @ApiModelProperty(readOnly = true, value = "Whether the Pin has been promoted or not.")
  public Boolean getHasBeenPromoted() {
    return hasBeenPromoted;
  }

  public void setHasBeenPromoted(Boolean hasBeenPromoted) {
    this.hasBeenPromoted = hasBeenPromoted;
  }

  public Pin note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
   * @return note
  **/
  @ApiModelProperty(value = "Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Pin pinMetrics(Object pinMetrics) {
    this.pinMetrics = pinMetrics;
    return this;
  }

   /**
   * Pin metrics with associated time intervals if any.
   * @return pinMetrics
  **/
  @ApiModelProperty(example = "{\"pin_metrics\":[{\"90d\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3},\"all_time\":{\"pin_click\":7,\"impression\":2,\"clickthrough\":3,\"reaction\":10,\"comment\":2}},null]}", value = "Pin metrics with associated time intervals if any.")
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
    Pin pin = (Pin) o;
    return Objects.equals(this.id, pin.id) &&
        Objects.equals(this.createdAt, pin.createdAt) &&
        Objects.equals(this.link, pin.link) &&
        Objects.equals(this.title, pin.title) &&
        Objects.equals(this.description, pin.description) &&
        Objects.equals(this.dominantColor, pin.dominantColor) &&
        Objects.equals(this.altText, pin.altText) &&
        Objects.equals(this.creativeType, pin.creativeType) &&
        Objects.equals(this.boardId, pin.boardId) &&
        Objects.equals(this.boardSectionId, pin.boardSectionId) &&
        Objects.equals(this.boardOwner, pin.boardOwner) &&
        Objects.equals(this.isOwner, pin.isOwner) &&
        Objects.equals(this.media, pin.media) &&
        Objects.equals(this.mediaSource, pin.mediaSource) &&
        Objects.equals(this.parentPinId, pin.parentPinId) &&
        Objects.equals(this.isStandard, pin.isStandard) &&
        Objects.equals(this.hasBeenPromoted, pin.hasBeenPromoted) &&
        Objects.equals(this.note, pin.note) &&
        Objects.equals(this.pinMetrics, pin.pinMetrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, link, title, description, dominantColor, altText, creativeType, boardId, boardSectionId, boardOwner, isOwner, media, mediaSource, parentPinId, isStandard, hasBeenPromoted, note, pinMetrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pin {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dominantColor: ").append(toIndentedString(dominantColor)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
    sb.append("    boardOwner: ").append(toIndentedString(boardOwner)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    mediaSource: ").append(toIndentedString(mediaSource)).append("\n");
    sb.append("    parentPinId: ").append(toIndentedString(parentPinId)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    hasBeenPromoted: ").append(toIndentedString(hasBeenPromoted)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    pinMetrics: ").append(toIndentedString(pinMetrics)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

