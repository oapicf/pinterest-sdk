package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.PinMedia;
import org.openapitools.model.PinMediaSource;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Pin
 */
@ApiModel(description="Pin")

public class Pin  {
  
  @ApiModelProperty(example = "813744226420795884", value = "")
  private String id;

  @ApiModelProperty(example = "2020-01-01T20:10:40Z", value = "")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date createdAt;

  @ApiModelProperty(example = "https://www.pinterest.com/", value = "")
  private String link;

  @ApiModelProperty(value = "")
  private String title;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(value = "")
  private String altText;

 /**
  * The board to which this Pin belongs.
  */
  @ApiModelProperty(value = "The board to which this Pin belongs.")
  private String boardId;

 /**
  * The board section to which this Pin belongs.
  */
  @ApiModelProperty(value = "The board section to which this Pin belongs.")
  private String boardSectionId;

  @ApiModelProperty(value = "")
  @Valid
  private BoardOwner boardOwner;

  @ApiModelProperty(value = "")
  @Valid
  private PinMedia media;

  @ApiModelProperty(value = "")
  @Valid
  private PinMediaSource mediaSource;
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Pin id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get createdAt
  * @return createdAt
  */
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   * <br><em>N.B. <code>createdAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   * <br><em>N.B. <code>createdAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Pin createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Get link
  * @return link
  */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * Sets the <code>link</code> property.
   */
 public void setLink(String link) {
    this.link = link;
  }

  /**
   * Sets the <code>link</code> property.
   */
  public Pin link(String link) {
    this.link = link;
    return this;
  }

 /**
  * Get title
  * @return title
  */
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public Pin title(String title) {
    this.title = title;
    return this;
  }

 /**
  * Get description
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public Pin description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get altText
  * @return altText
  */
  @JsonProperty("alt_text")
  public String getAltText() {
    return altText;
  }

  /**
   * Sets the <code>altText</code> property.
   */
 public void setAltText(String altText) {
    this.altText = altText;
  }

  /**
   * Sets the <code>altText</code> property.
   */
  public Pin altText(String altText) {
    this.altText = altText;
    return this;
  }

 /**
  * The board to which this Pin belongs.
  * @return boardId
  */
  @JsonProperty("board_id")
 @Pattern(regexp="^\\d+$")  public String getBoardId() {
    return boardId;
  }

  /**
   * Sets the <code>boardId</code> property.
   */
 public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  /**
   * Sets the <code>boardId</code> property.
   */
  public Pin boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

 /**
  * The board section to which this Pin belongs.
  * @return boardSectionId
  */
  @JsonProperty("board_section_id")
 @Pattern(regexp="^\\d+$")  public String getBoardSectionId() {
    return boardSectionId;
  }

  /**
   * Sets the <code>boardSectionId</code> property.
   */
 public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  /**
   * Sets the <code>boardSectionId</code> property.
   */
  public Pin boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

 /**
  * Get boardOwner
  * @return boardOwner
  */
  @JsonProperty("board_owner")
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }

  /**
   * Sets the <code>boardOwner</code> property.
   * <br><em>N.B. <code>boardOwner</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setBoardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
  }

  /**
   * Sets the <code>boardOwner</code> property.
   * <br><em>N.B. <code>boardOwner</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Pin boardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
    return this;
  }

  /**
   * Puts a new item into the <code>boardOwner</code> map.
   * <br><em>N.B. <code>boardOwner</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Pin putBoardOwnerItem(String key,  boardOwnerItem) {
    this.boardOwner.put(key, boardOwnerItem);
    return this;
  }

 /**
  * Get media
  * @return media
  */
  @JsonProperty("media")
  public PinMedia getMedia() {
    return media;
  }

  /**
   * Sets the <code>media</code> property.
   * <br><em>N.B. <code>media</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setMedia(PinMedia media) {
    this.media = media;
  }

  /**
   * Sets the <code>media</code> property.
   * <br><em>N.B. <code>media</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Pin media(PinMedia media) {
    this.media = media;
    return this;
  }

  /**
   * Puts a new item into the <code>media</code> map.
   * <br><em>N.B. <code>media</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Pin putMediaItem(String key,  mediaItem) {
    this.media.put(key, mediaItem);
    return this;
  }

 /**
  * Get mediaSource
  * @return mediaSource
  */
  @JsonProperty("media_source")
  public PinMediaSource getMediaSource() {
    return mediaSource;
  }

  /**
   * Sets the <code>mediaSource</code> property.
   */
 public void setMediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
  }

  /**
   * Sets the <code>mediaSource</code> property.
   */
  public Pin mediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
    return this;
  }

  /**
   * Puts a new item into the <code>mediaSource</code> map.
   */
  public Pin putMediaSourceItem(String key,  mediaSourceItem) {
    this.mediaSource.put(key, mediaSourceItem);
    return this;
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
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
    sb.append("    boardOwner: ").append(toIndentedString(boardOwner)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    mediaSource: ").append(toIndentedString(mediaSource)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

