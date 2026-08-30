package org.openapitools.model;

import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardMedia;
import org.openapitools.model.BoardOwner;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class BoardBase implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Date and time of last board pins modified.
   */
  @JsonProperty("board_pins_modified_at")
  private OffsetDateTime boardPinsModifiedAt;

  /**
   * Count of collaborators on the board.
   */
  @JsonProperty("collaborator_count")
  private Integer collaboratorCount;

  /**
   * Date and time of board creation.
   */
  @JsonProperty("created_at")
  private OffsetDateTime createdAt;

  @JsonProperty("description")
  private String description;

  /**
   * Board follower count.
   */
  @JsonProperty("follower_count")
  private Integer followerCount;

  @JsonProperty("id")
  private String id;

  /**
   * If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.
   */
  @JsonProperty("is_ads_only")
  private Boolean isAdsOnly = false;

  /**
   * Board media.
   */
  @JsonProperty("media")
  private BoardMedia media;

  /**
   *     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.
   */
  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private BoardOwner owner;

  /**
   * Count of Pins on the board.
   */
  @JsonProperty("pin_count")
  private Integer pinCount;

  /**
   * Date and time of last board pins modified.
   * @return boardPinsModifiedAt
   */
  public OffsetDateTime getBoardPinsModifiedAt() {
    return boardPinsModifiedAt;
  }

  public void setBoardPinsModifiedAt(OffsetDateTime boardPinsModifiedAt) {
    this.boardPinsModifiedAt = boardPinsModifiedAt;
  }

  /**
   * Count of collaborators on the board.
   * @return collaboratorCount
   */
  public Integer getCollaboratorCount() {
    return collaboratorCount;
  }

  public void setCollaboratorCount(Integer collaboratorCount) {
    this.collaboratorCount = collaboratorCount;
  }

  /**
   * Date and time of board creation.
   * @return createdAt
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * 
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Board follower count.
   * @return followerCount
   */
  public Integer getFollowerCount() {
    return followerCount;
  }

  public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

  /**
   * 
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.
   * @return isAdsOnly
   */
  public Boolean getIsAdsOnly() {
    return isAdsOnly;
  }

  public void setIsAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
  }

  /**
   * Board media.
   * @return media
   */
  public BoardMedia getMedia() {
    return media;
  }

  public void setMedia(BoardMedia media) {
    this.media = media;
  }

  /**
   *     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @return owner
   */
  public BoardOwner getOwner() {
    return owner;
  }

  public void setOwner(BoardOwner owner) {
    this.owner = owner;
  }

  /**
   * Count of Pins on the board.
   * @return pinCount
   */
  public Integer getPinCount() {
    return pinCount;
  }

  public void setPinCount(Integer pinCount) {
    this.pinCount = pinCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardBase boardBase = (BoardBase) o;
    return Objects.equals(this.boardPinsModifiedAt, boardBase.boardPinsModifiedAt) &&
        Objects.equals(this.collaboratorCount, boardBase.collaboratorCount) &&
        Objects.equals(this.createdAt, boardBase.createdAt) &&
        Objects.equals(this.description, boardBase.description) &&
        Objects.equals(this.followerCount, boardBase.followerCount) &&
        Objects.equals(this.id, boardBase.id) &&
        Objects.equals(this.isAdsOnly, boardBase.isAdsOnly) &&
        Objects.equals(this.media, boardBase.media) &&
        Objects.equals(this.name, boardBase.name) &&
        Objects.equals(this.owner, boardBase.owner) &&
        Objects.equals(this.pinCount, boardBase.pinCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardPinsModifiedAt, collaboratorCount, createdAt, description, followerCount, id, isAdsOnly, media, name, owner, pinCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardBase {\n");
    
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
