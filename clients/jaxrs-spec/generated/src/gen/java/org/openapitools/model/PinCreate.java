package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.PinMediaSource;
import org.openapitools.model.SummaryPinMedia;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Pin
 **/
@ApiModel(description = "Pin")
@JsonTypeName("PinCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinCreate   {
  private @Valid String id;
  private @Valid Date createdAt;
  private @Valid String link;
  private @Valid String title;
  private @Valid String description;
  private @Valid String dominantColor;
  private @Valid String altText;
  private @Valid String boardId;
  private @Valid String boardSectionId;
  private @Valid BoardOwner boardOwner;
  private @Valid SummaryPinMedia media;
  private @Valid PinMediaSource mediaSource;
  private @Valid String parentPinId;
  private @Valid String note;

  /**
   **/
  public PinCreate id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "813744226420795884", value = "")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public PinCreate createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(example = "2020-01-01T20:10:40Z", value = "")
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
  public PinCreate link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.pinterest.com/", value = "")
  @JsonProperty("link")
 @Size(max=2048)  public String getLink() {
    return link;
  }

  @JsonProperty("link")
  public void setLink(String link) {
    this.link = link;
  }

  /**
   **/
  public PinCreate title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
 @Size(max=100)  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public PinCreate description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
 @Size(max=800)  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Dominant pin color. Hex number, e.g. \\\&quot;#6E7874\\\&quot;.
   **/
  public PinCreate dominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
    return this;
  }

  
  @ApiModelProperty(example = "#6E7874", value = "Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".")
  @JsonProperty("dominant_color")
  public String getDominantColor() {
    return dominantColor;
  }

  @JsonProperty("dominant_color")
  public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

  /**
   **/
  public PinCreate altText(String altText) {
    this.altText = altText;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("alt_text")
 @Size(max=500)  public String getAltText() {
    return altText;
  }

  @JsonProperty("alt_text")
  public void setAltText(String altText) {
    this.altText = altText;
  }

  /**
   * The board to which this Pin belongs.
   **/
  public PinCreate boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

  
  @ApiModelProperty(value = "The board to which this Pin belongs.")
  @JsonProperty("board_id")
 @Pattern(regexp="^\\d+$")  public String getBoardId() {
    return boardId;
  }

  @JsonProperty("board_id")
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  /**
   * The board section to which this Pin belongs.
   **/
  public PinCreate boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

  
  @ApiModelProperty(value = "The board section to which this Pin belongs.")
  @JsonProperty("board_section_id")
 @Pattern(regexp="^\\d+$")  public String getBoardSectionId() {
    return boardSectionId;
  }

  @JsonProperty("board_section_id")
  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  /**
   **/
  public PinCreate boardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("board_owner")
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }

  @JsonProperty("board_owner")
  public void setBoardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
  }

  /**
   **/
  public PinCreate media(SummaryPinMedia media) {
    this.media = media;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media")
  public SummaryPinMedia getMedia() {
    return media;
  }

  @JsonProperty("media")
  public void setMedia(SummaryPinMedia media) {
    this.media = media;
  }

  /**
   **/
  public PinCreate mediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("media_source")
  public PinMediaSource getMediaSource() {
    return mediaSource;
  }

  @JsonProperty("media_source")
  public void setMediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
  }

  /**
   * The source pin id if this pin was saved from another pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/article/save-pins-on-pinterest\&quot;&gt;Learn more&lt;/a&gt;.
   **/
  public PinCreate parentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
    return this;
  }

  
  @ApiModelProperty(value = "The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.")
  @JsonProperty("parent_pin_id")
 @Pattern(regexp="^\\d+$")  public String getParentPinId() {
    return parentPinId;
  }

  @JsonProperty("parent_pin_id")
  public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

  /**
   * Private note for this Pin. &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/add-notes-to-your-pins\&quot;&gt;Learn more&lt;/a&gt;.
   **/
  public PinCreate note(String note) {
    this.note = note;
    return this;
  }

  
  @ApiModelProperty(value = "Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.")
  @JsonProperty("note")
  public String getNote() {
    return note;
  }

  @JsonProperty("note")
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
    return Objects.equals(this.id, pinCreate.id) &&
        Objects.equals(this.createdAt, pinCreate.createdAt) &&
        Objects.equals(this.link, pinCreate.link) &&
        Objects.equals(this.title, pinCreate.title) &&
        Objects.equals(this.description, pinCreate.description) &&
        Objects.equals(this.dominantColor, pinCreate.dominantColor) &&
        Objects.equals(this.altText, pinCreate.altText) &&
        Objects.equals(this.boardId, pinCreate.boardId) &&
        Objects.equals(this.boardSectionId, pinCreate.boardSectionId) &&
        Objects.equals(this.boardOwner, pinCreate.boardOwner) &&
        Objects.equals(this.media, pinCreate.media) &&
        Objects.equals(this.mediaSource, pinCreate.mediaSource) &&
        Objects.equals(this.parentPinId, pinCreate.parentPinId) &&
        Objects.equals(this.note, pinCreate.note);
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

