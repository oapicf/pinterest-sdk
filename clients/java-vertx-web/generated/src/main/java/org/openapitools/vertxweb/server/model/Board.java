package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.BoardMedia;
import org.openapitools.vertxweb.server.model.BoardOwner;
import org.openapitools.vertxweb.server.model.BoardPrivacy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Board   {
  
  private OffsetDateTime boardPinsModifiedAt;
  private Integer collaboratorCount;
  private OffsetDateTime createdAt;
  private String description;
  private Integer followerCount;
  private String id;
  private Boolean isAdsOnly = false;
  private BoardMedia media;
  private String name;
  private BoardOwner owner;
  private Integer pinCount;
  private BoardPrivacy privacy = BoardPrivacy.PUBLIC;

  public Board () {

  }

  public Board (OffsetDateTime boardPinsModifiedAt, Integer collaboratorCount, OffsetDateTime createdAt, String description, Integer followerCount, String id, Boolean isAdsOnly, BoardMedia media, String name, BoardOwner owner, Integer pinCount, BoardPrivacy privacy) {
    this.boardPinsModifiedAt = boardPinsModifiedAt;
    this.collaboratorCount = collaboratorCount;
    this.createdAt = createdAt;
    this.description = description;
    this.followerCount = followerCount;
    this.id = id;
    this.isAdsOnly = isAdsOnly;
    this.media = media;
    this.name = name;
    this.owner = owner;
    this.pinCount = pinCount;
    this.privacy = privacy;
  }

    
  @JsonProperty("board_pins_modified_at")
  public OffsetDateTime getBoardPinsModifiedAt() {
    return boardPinsModifiedAt;
  }
  public void setBoardPinsModifiedAt(OffsetDateTime boardPinsModifiedAt) {
    this.boardPinsModifiedAt = boardPinsModifiedAt;
  }

    
  @JsonProperty("collaborator_count")
  public Integer getCollaboratorCount() {
    return collaboratorCount;
  }
  public void setCollaboratorCount(Integer collaboratorCount) {
    this.collaboratorCount = collaboratorCount;
  }

    
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("follower_count")
  public Integer getFollowerCount() {
    return followerCount;
  }
  public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("is_ads_only")
  public Boolean getIsAdsOnly() {
    return isAdsOnly;
  }
  public void setIsAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
  }

    
  @JsonProperty("media")
  public BoardMedia getMedia() {
    return media;
  }
  public void setMedia(BoardMedia media) {
    this.media = media;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("owner")
  public BoardOwner getOwner() {
    return owner;
  }
  public void setOwner(BoardOwner owner) {
    this.owner = owner;
  }

    
  @JsonProperty("pin_count")
  public Integer getPinCount() {
    return pinCount;
  }
  public void setPinCount(Integer pinCount) {
    this.pinCount = pinCount;
  }

    
  @JsonProperty("privacy")
  public BoardPrivacy getPrivacy() {
    return privacy;
  }
  public void setPrivacy(BoardPrivacy privacy) {
    this.privacy = privacy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Board board = (Board) o;
    return Objects.equals(boardPinsModifiedAt, board.boardPinsModifiedAt) &&
        Objects.equals(collaboratorCount, board.collaboratorCount) &&
        Objects.equals(createdAt, board.createdAt) &&
        Objects.equals(description, board.description) &&
        Objects.equals(followerCount, board.followerCount) &&
        Objects.equals(id, board.id) &&
        Objects.equals(isAdsOnly, board.isAdsOnly) &&
        Objects.equals(media, board.media) &&
        Objects.equals(name, board.name) &&
        Objects.equals(owner, board.owner) &&
        Objects.equals(pinCount, board.pinCount) &&
        Objects.equals(privacy, board.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardPinsModifiedAt, collaboratorCount, createdAt, description, followerCount, id, isAdsOnly, media, name, owner, pinCount, privacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Board {\n");
    
    sb.append("    boardPinsModifiedAt: ").append(toIndentedString(boardPinsModifiedAt)).append("\n");
    sb.append("    collaboratorCount: ").append(toIndentedString(collaboratorCount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    followerCount: ").append(toIndentedString(followerCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAdsOnly: ").append(toIndentedString(isAdsOnly)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    pinCount: ").append(toIndentedString(pinCount)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
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
