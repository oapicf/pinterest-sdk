/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardMedia;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.BoardPrivacy;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Board   {
  
  private Date boardPinsModifiedAt;
  private Integer collaboratorCount;
  private Date createdAt;
  private String description;
  private Integer followerCount;
  private String id;
  private Boolean isAdsOnly = false;
  private BoardMedia media;
  private String name;
  private BoardOwner owner;
  private Integer pinCount;
  private BoardPrivacy privacy;

  /**
   * Date and time of last board pins modified.
   */
  public Board boardPinsModifiedAt(Date boardPinsModifiedAt) {
    this.boardPinsModifiedAt = boardPinsModifiedAt;
    return this;
  }

  
  @ApiModelProperty(value = "Date and time of last board pins modified.")
  @JsonProperty("board_pins_modified_at")
  public Date getBoardPinsModifiedAt() {
    return boardPinsModifiedAt;
  }
  public void setBoardPinsModifiedAt(Date boardPinsModifiedAt) {
    this.boardPinsModifiedAt = boardPinsModifiedAt;
  }

  /**
   * Count of collaborators on the board.
   * minimum: 0
   */
  public Board collaboratorCount(Integer collaboratorCount) {
    this.collaboratorCount = collaboratorCount;
    return this;
  }

  
  @ApiModelProperty(example = "17", value = "Count of collaborators on the board.")
  @JsonProperty("collaborator_count")
  public Integer getCollaboratorCount() {
    return collaboratorCount;
  }
  public void setCollaboratorCount(Integer collaboratorCount) {
    this.collaboratorCount = collaboratorCount;
  }

  /**
   * Date and time of board creation.
   */
  public Board createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(value = "Date and time of board creation.")
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   */
  public Board description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "My favorite summer recipes", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Board follower count.
   * minimum: 0
   */
  public Board followerCount(Integer followerCount) {
    this.followerCount = followerCount;
    return this;
  }

  
  @ApiModelProperty(example = "13", value = "Board follower count.")
  @JsonProperty("follower_count")
  public Integer getFollowerCount() {
    return followerCount;
  }
  public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

  /**
   */
  public Board id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", required = true, value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * If set to `true`, the board will be ad-only and can store ad-only Pins.
   */
  public Board isAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "If set to `true`, the board will be ad-only and can store ad-only Pins.")
  @JsonProperty("is_ads_only")
  public Boolean getIsAdsOnly() {
    return isAdsOnly;
  }
  public void setIsAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
  }

  /**
   * Board media.
   */
  public Board media(BoardMedia media) {
    this.media = media;
    return this;
  }

  
  @ApiModelProperty(value = "Board media.")
  @JsonProperty("media")
  public BoardMedia getMedia() {
    return media;
  }
  public void setMedia(BoardMedia media) {
    this.media = media;
  }

  /**
   *     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
   */
  public Board name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Summer recipes", required = true, value = "    Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   */
  public Board owner(BoardOwner owner) {
    this.owner = owner;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("owner")
  public BoardOwner getOwner() {
    return owner;
  }
  public void setOwner(BoardOwner owner) {
    this.owner = owner;
  }

  /**
   * Count of Pins on the board.
   * minimum: 0
   */
  public Board pinCount(Integer pinCount) {
    this.pinCount = pinCount;
    return this;
  }

  
  @ApiModelProperty(example = "5", value = "Count of Pins on the board.")
  @JsonProperty("pin_count")
  public Integer getPinCount() {
    return pinCount;
  }
  public void setPinCount(Integer pinCount) {
    this.pinCount = pinCount;
  }

  /**
   *     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
   */
  public Board privacy(BoardPrivacy privacy) {
    this.privacy = privacy;
    return this;
  }

  
  @ApiModelProperty(value = "    Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. ")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

