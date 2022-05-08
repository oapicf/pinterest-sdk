package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.PinMedia;
import org.openapitools.model.PinMediaSource;
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
@JsonTypeName("Pin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class Pin   {
  
  private @Valid String id;
  private @Valid Date createdAt;
  private @Valid String link;
  private @Valid String title;
  private @Valid String description;
  private @Valid String altText;
  private @Valid String boardId;
  private @Valid String boardSectionId;
  private @Valid BoardOwner boardOwner;
  private @Valid PinMedia media;
  private @Valid PinMediaSource mediaSource;

  /**
   **/
  public Pin id(String id) {
    this.id = id;
    return this;
  }

  

  
  @ApiModelProperty(example = "813744226420795884", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

/**
   **/
  public Pin createdAt(Date createdAt) {
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
  public Pin link(String link) {
    this.link = link;
    return this;
  }

  

  
  @ApiModelProperty(example = "https://www.pinterest.com/", value = "")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  @JsonProperty("link")
  public void setLink(String link) {
    this.link = link;
  }

/**
   **/
  public Pin title(String title) {
    this.title = title;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

/**
   **/
  public Pin description(String description) {
    this.description = description;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

/**
   **/
  public Pin altText(String altText) {
    this.altText = altText;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("alt_text")
  public String getAltText() {
    return altText;
  }

  @JsonProperty("alt_text")
  public void setAltText(String altText) {
    this.altText = altText;
  }

/**
   * The board to which this Pin belongs.
   **/
  public Pin boardId(String boardId) {
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
  public Pin boardSectionId(String boardSectionId) {
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
  public Pin boardOwner(BoardOwner boardOwner) {
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

  public Pin putBoardOwnerItem(String key,  boardOwnerItem) {
    if (this.boardOwner == null) {
      this.boardOwner = ;
    }

    this.boardOwner.put(key, boardOwnerItem);
    return this;
  }

  public Pin removeBoardOwnerItem( boardOwnerItem) {
    if (boardOwnerItem != null && this.boardOwner != null) {
      this.boardOwner.remove(boardOwnerItem);
    }

    return this;
  }
/**
   **/
  public Pin media(PinMedia media) {
    this.media = media;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("media")
  public PinMedia getMedia() {
    return media;
  }

  @JsonProperty("media")
  public void setMedia(PinMedia media) {
    this.media = media;
  }

  public Pin putMediaItem(String key,  mediaItem) {
    if (this.media == null) {
      this.media = ;
    }

    this.media.put(key, mediaItem);
    return this;
  }

  public Pin removeMediaItem( mediaItem) {
    if (mediaItem != null && this.media != null) {
      this.media.remove(mediaItem);
    }

    return this;
  }
/**
   **/
  public Pin mediaSource(PinMediaSource mediaSource) {
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

  public Pin putMediaSourceItem(String key,  mediaSourceItem) {
    if (this.mediaSource == null) {
      this.mediaSource = ;
    }

    this.mediaSource.put(key, mediaSourceItem);
    return this;
  }

  public Pin removeMediaSourceItem( mediaSourceItem) {
    if (mediaSourceItem != null && this.mediaSource != null) {
      this.mediaSource.remove(mediaSourceItem);
    }

    return this;
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

