package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.BoardMedia;
import com.prokarma.pkmst.model.BoardOwner;
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
 * BoardBase
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BoardBase   {
  @JsonProperty("board_pins_modified_at")
  private OffsetDateTime boardPinsModifiedAt;

  @JsonProperty("collaborator_count")
  private Integer collaboratorCount;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt;

  @JsonProperty("description")
  private String description;

  @JsonProperty("follower_count")
  private Integer followerCount;

  @JsonProperty("id")
  private String id;

  @JsonProperty("is_ads_only")
  private Boolean isAdsOnly = false;

  @JsonProperty("media")
  private BoardMedia media;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private BoardOwner owner;

  @JsonProperty("pin_count")
  private Integer pinCount;

  public BoardBase boardPinsModifiedAt(OffsetDateTime boardPinsModifiedAt) {
    this.boardPinsModifiedAt = boardPinsModifiedAt;
    return this;
  }

  /**
   * Date and time of last board pins modified.
   * @return boardPinsModifiedAt
   */
  @ApiModelProperty(readOnly = true, value = "Date and time of last board pins modified.")
  public OffsetDateTime getBoardPinsModifiedAt() {
    return boardPinsModifiedAt;
  }

  public void setBoardPinsModifiedAt(OffsetDateTime boardPinsModifiedAt) {
    this.boardPinsModifiedAt = boardPinsModifiedAt;
  }

  public BoardBase collaboratorCount(Integer collaboratorCount) {
    this.collaboratorCount = collaboratorCount;
    return this;
  }

  /**
   * Count of collaborators on the board.
   * minimum: 0
   * @return collaboratorCount
   */
  @ApiModelProperty(example = "17", readOnly = true, value = "Count of collaborators on the board.")
  public Integer getCollaboratorCount() {
    return collaboratorCount;
  }

  public void setCollaboratorCount(Integer collaboratorCount) {
    this.collaboratorCount = collaboratorCount;
  }

  public BoardBase createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date and time of board creation.
   * @return createdAt
   */
  @ApiModelProperty(readOnly = true, value = "Date and time of board creation.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public BoardBase description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @ApiModelProperty(example = "My favorite summer recipes", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BoardBase followerCount(Integer followerCount) {
    this.followerCount = followerCount;
    return this;
  }

  /**
   * Board follower count.
   * minimum: 0
   * @return followerCount
   */
  @ApiModelProperty(example = "13", readOnly = true, value = "Board follower count.")
  public Integer getFollowerCount() {
    return followerCount;
  }

  public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

  public BoardBase id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @ApiModelProperty(example = "549755885175", required = true, readOnly = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BoardBase isAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
    return this;
  }

  /**
   * If set to `true`, the board will be ad-only and can store ad-only Pins.
   * @return isAdsOnly
   */
  @ApiModelProperty(example = "true", value = "If set to `true`, the board will be ad-only and can store ad-only Pins.")
  public Boolean getIsAdsOnly() {
    return isAdsOnly;
  }

  public void setIsAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
  }

  public BoardBase media(BoardMedia media) {
    this.media = media;
    return this;
  }

  /**
   * Board media.
   * @return media
   */
  @ApiModelProperty(readOnly = true, value = "Board media.")
  public BoardMedia getMedia() {
    return media;
  }

  public void setMedia(BoardMedia media) {
    this.media = media;
  }

  public BoardBase name(String name) {
    this.name = name;
    return this;
  }

  /**
   *      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
   * @return name
   */
  @ApiModelProperty(example = "Summer recipes", required = true, value = "     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BoardBase owner(BoardOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @ApiModelProperty(readOnly = true, value = "")
  public BoardOwner getOwner() {
    return owner;
  }

  public void setOwner(BoardOwner owner) {
    this.owner = owner;
  }

  public BoardBase pinCount(Integer pinCount) {
    this.pinCount = pinCount;
    return this;
  }

  /**
   * Count of Pins on the board.
   * minimum: 0
   * @return pinCount
   */
  @ApiModelProperty(example = "5", readOnly = true, value = "Count of Pins on the board.")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

