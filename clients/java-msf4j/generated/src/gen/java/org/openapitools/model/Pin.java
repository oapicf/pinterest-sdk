package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.PinMedia;
import org.openapitools.model.PinMediaSource;

/**
 * Pin
 */
@ApiModel(description = "Pin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-05-07T06:39:19.282212Z[Etc/UTC]")
public class Pin   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("created_at")
  private Date createdAt;

  @JsonProperty("link")
  private String link;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("alt_text")
  private String altText;

  @JsonProperty("board_id")
  private String boardId;

  @JsonProperty("board_section_id")
  private String boardSectionId;

  @JsonProperty("board_owner")
  private BoardOwner boardOwner;

  @JsonProperty("media")
  private PinMedia media;

  @JsonProperty("media_source")
  private PinMediaSource mediaSource;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "813744226420795884", value = "")
  public String getId() {
    return id;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "2020-01-01T20:10:40Z", value = "")
  public Date getCreatedAt() {
    return createdAt;
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

   /**
   * Get boardOwner
   * @return boardOwner
  **/
  @ApiModelProperty(value = "")
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }

   /**
   * Get media
   * @return media
  **/
  @ApiModelProperty(value = "")
  public PinMedia getMedia() {
    return media;
  }

  public Pin mediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
    return this;
  }

  public Pin putMediaSourceItem(String key,  mediaSourceItem) {
    if (this.mediaSource == null) {
      this.mediaSource = ;
    }
    this.mediaSource.put(key, mediaSourceItem);
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
        Objects.equals(this.altText, pin.altText) &&
        Objects.equals(this.boardId, pin.boardId) &&
        Objects.equals(this.boardSectionId, pin.boardSectionId) &&
        Objects.equals(this.boardOwner, pin.boardOwner) &&
        Objects.equals(this.media, pin.media) &&
        Objects.equals(this.mediaSource, pin.mediaSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, link, title, description, altText, boardId, boardSectionId, boardOwner, media, mediaSource);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

