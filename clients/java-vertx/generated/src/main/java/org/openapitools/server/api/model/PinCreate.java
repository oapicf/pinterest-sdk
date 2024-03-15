package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.BoardOwner;
import org.openapitools.server.api.model.PinMediaSource;
import org.openapitools.server.api.model.SummaryPinMedia;

/**
 * Pin
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinCreate   {
  
  private String id;
  private OffsetDateTime createdAt;
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

  public PinCreate () {

  }

  public PinCreate (String id, OffsetDateTime createdAt, String link, String title, String description, String dominantColor, String altText, String boardId, String boardSectionId, BoardOwner boardOwner, SummaryPinMedia media, PinMediaSource mediaSource, String parentPinId, String note) {
    this.id = id;
    this.createdAt = createdAt;
    this.link = link;
    this.title = title;
    this.description = description;
    this.dominantColor = dominantColor;
    this.altText = altText;
    this.boardId = boardId;
    this.boardSectionId = boardSectionId;
    this.boardOwner = boardOwner;
    this.media = media;
    this.mediaSource = mediaSource;
    this.parentPinId = parentPinId;
    this.note = note;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("dominant_color")
  public String getDominantColor() {
    return dominantColor;
  }
  public void setDominantColor(String dominantColor) {
    this.dominantColor = dominantColor;
  }

    
  @JsonProperty("alt_text")
  public String getAltText() {
    return altText;
  }
  public void setAltText(String altText) {
    this.altText = altText;
  }

    
  @JsonProperty("board_id")
  public String getBoardId() {
    return boardId;
  }
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

    
  @JsonProperty("board_section_id")
  public String getBoardSectionId() {
    return boardSectionId;
  }
  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

    
  @JsonProperty("board_owner")
  public BoardOwner getBoardOwner() {
    return boardOwner;
  }
  public void setBoardOwner(BoardOwner boardOwner) {
    this.boardOwner = boardOwner;
  }

    
  @JsonProperty("media")
  public SummaryPinMedia getMedia() {
    return media;
  }
  public void setMedia(SummaryPinMedia media) {
    this.media = media;
  }

    
  @JsonProperty("media_source")
  public PinMediaSource getMediaSource() {
    return mediaSource;
  }
  public void setMediaSource(PinMediaSource mediaSource) {
    this.mediaSource = mediaSource;
  }

    
  @JsonProperty("parent_pin_id")
  public String getParentPinId() {
    return parentPinId;
  }
  public void setParentPinId(String parentPinId) {
    this.parentPinId = parentPinId;
  }

    
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
