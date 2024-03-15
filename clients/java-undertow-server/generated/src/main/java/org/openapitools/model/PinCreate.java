/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.PinMediaSource;
import org.openapitools.model.SummaryPinMedia;



/**
 * Pin
 */

@ApiModel(description = "Pin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinCreate   {
  
  private String id;
  private Date createdAt;
  private String link;
  private String title;
  private String description;
  private String dominantColor;
  private String altText;
  private String boardId;
  private String boardSectionId;
  private BoardOwner boardOwner;
  private SummaryPinMedia media;
  private PinMediaSource mediaSource;
  private String parentPinId;
  private String note;

  /**
   */
  public PinCreate id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "813744226420795884", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   */
  public PinCreate createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "2020-01-01T20:10:40Z", value = "")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   */
  public PinCreate link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.pinterest.com/", value = "")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   */
  public PinCreate title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   */
  public PinCreate description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
   */
  public PinCreate dominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
    return this;
  }

  
  @ApiModelProperty(example = "#6E7874", value = "Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".")
  @JsonProperty("dominant_color")
  public String getDominantColor() {
    return dominantColor;
  }
  public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

  /**
   */
  public PinCreate altText(String altText) {
    this.altText = altText;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("alt_text")
  public String getAltText() {
    return altText;
  }
  public void setAltText(String altText) {
    this.altText = altText;
  }

  /**
   * The board to which this Pin belongs.
   */
  public PinCreate boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

  
  @ApiModelProperty(value = "The board to which this Pin belongs.")
  @JsonProperty("board_id")
  public String getBoardId() {
    return boardId;
  }
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  /**
   * The board section to which this Pin belongs.
   */
  public PinCreate boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

  
  @ApiModelProperty(value = "The board section to which this Pin belongs.")
  @JsonProperty("board_section_id")
  public String getBoardSectionId() {
    return boardSectionId;
  }
  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  /**
   */
  public PinCreate boardOwner(BoardOwner boardOwner) {
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
   */
  public PinCreate media(SummaryPinMedia media) {
    this.media = media;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media")
  public SummaryPinMedia getMedia() {
    return media;
  }
  public void setMedia(SummaryPinMedia media) {
    this.media = media;
  }

  /**
   */
  public PinCreate mediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media_source")
  public PinMediaSource getMediaSource() {
    return mediaSource;
  }
  public void setMediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
  }

  /**
   * The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
   */
  public PinCreate parentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
    return this;
  }

  
  @ApiModelProperty(value = "The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.")
  @JsonProperty("parent_pin_id")
  public String getParentPinId() {
    return parentPinId;
  }
  public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

  /**
   * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
   */
  public PinCreate note(String note) {
    this.note = note;
    return this;
  }

  
  @ApiModelProperty(value = "Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }
  public void setNote(String note) {
    this.note = note;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinCreate pinCreate = (PinCreate) o;
    return Objects.equals(id, pinCreate.id) &&
        Objects.equals(createdAt, pinCreate.createdAt) &&
        Objects.equals(link, pinCreate.link) &&
        Objects.equals(title, pinCreate.title) &&
        Objects.equals(description, pinCreate.description) &&
        Objects.equals(dominantColor, pinCreate.dominantColor) &&
        Objects.equals(altText, pinCreate.altText) &&
        Objects.equals(boardId, pinCreate.boardId) &&
        Objects.equals(boardSectionId, pinCreate.boardSectionId) &&
        Objects.equals(boardOwner, pinCreate.boardOwner) &&
        Objects.equals(media, pinCreate.media) &&
        Objects.equals(mediaSource, pinCreate.mediaSource) &&
        Objects.equals(parentPinId, pinCreate.parentPinId) &&
        Objects.equals(note, pinCreate.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, link, title, description, dominantColor, altText, boardId, boardSectionId, boardOwner, media, mediaSource, parentPinId, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinCreate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dominantColor: ").append(toIndentedString(dominantColor)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
    sb.append("    boardOwner: ").append(toIndentedString(boardOwner)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    mediaSource: ").append(toIndentedString(mediaSource)).append("\n");
    sb.append("    parentPinId: ").append(toIndentedString(parentPinId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

