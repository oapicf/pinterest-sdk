package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardMedia;
import org.openapitools.model.BoardOwner;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BoardBase   {
  @JsonProperty("board_pins_modified_at")
  private Date boardPinsModifiedAt;

  @JsonProperty("collaborator_count")
  private Integer collaboratorCount;

  @JsonProperty("created_at")
  private Date createdAt;

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

  /**
   * Date and time of last board pins modified.
   **/
  public BoardBase boardPinsModifiedAt(Date boardPinsModifiedAt) {
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
   **/
  public BoardBase collaboratorCount(Integer collaboratorCount) {
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
   **/
  public BoardBase createdAt(Date createdAt) {
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
   **/
  public BoardBase description(String description) {
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
   **/
  public BoardBase followerCount(Integer followerCount) {
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
   **/
  public BoardBase id(String id) {
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
   **/
  public BoardBase isAdsOnly(Boolean isAdsOnly) {
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
   **/
  public BoardBase media(BoardMedia media) {
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
   **/
  public BoardBase name(String name) {
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
   **/
  public BoardBase owner(BoardOwner owner) {
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
   **/
  public BoardBase pinCount(Integer pinCount) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardBase boardBase = (BoardBase) o;
    return Objects.equals(boardPinsModifiedAt, boardBase.boardPinsModifiedAt) &&
        Objects.equals(collaboratorCount, boardBase.collaboratorCount) &&
        Objects.equals(createdAt, boardBase.createdAt) &&
        Objects.equals(description, boardBase.description) &&
        Objects.equals(followerCount, boardBase.followerCount) &&
        Objects.equals(id, boardBase.id) &&
        Objects.equals(isAdsOnly, boardBase.isAdsOnly) &&
        Objects.equals(media, boardBase.media) &&
        Objects.equals(name, boardBase.name) &&
        Objects.equals(owner, boardBase.owner) &&
        Objects.equals(pinCount, boardBase.pinCount);
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

