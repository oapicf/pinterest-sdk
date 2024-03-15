package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Board
 */
@ApiModel(description = "Board")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Board   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("created_at")
  private OffsetDateTime createdAt;

  @JsonProperty("board_pins_modified_at")
  private OffsetDateTime boardPinsModifiedAt;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("collaborator_count")
  private Integer collaboratorCount;

  @JsonProperty("pin_count")
  private Integer pinCount;

  @JsonProperty("follower_count")
  private Integer followerCount;

  @JsonProperty("media")
  private BoardMedia media;

  @JsonProperty("owner")
  private BoardOwner owner;

  /**
   * Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
   */
  public enum PrivacyEnum {
    PUBLIC("PUBLIC"),
    
    PROTECTED("PROTECTED"),
    
    SECRET("SECRET");

    private String value;

    PrivacyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PrivacyEnum fromValue(String text) {
      for (PrivacyEnum b : PrivacyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("privacy")
  private PrivacyEnum privacy = PrivacyEnum.PUBLIC;

  public Board id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "549755885175", readOnly = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Board createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date and time of board creation.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2020-01-01T20:10:40Z", readOnly = true, value = "Date and time of board creation.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Board boardPinsModifiedAt(OffsetDateTime boardPinsModifiedAt) {
    this.boardPinsModifiedAt = boardPinsModifiedAt;
    return this;
  }

   /**
   * Date and time of last board pins modified.
   * @return boardPinsModifiedAt
  **/
  @ApiModelProperty(example = "2020-01-01T20:10:40Z", readOnly = true, value = "Date and time of last board pins modified.")
  public OffsetDateTime getBoardPinsModifiedAt() {
    return boardPinsModifiedAt;
  }

  public void setBoardPinsModifiedAt(OffsetDateTime boardPinsModifiedAt) {
    this.boardPinsModifiedAt = boardPinsModifiedAt;
  }

  public Board name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Summer Recipes", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Board description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "My favorite summer recipes", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Board collaboratorCount(Integer collaboratorCount) {
    this.collaboratorCount = collaboratorCount;
    return this;
  }

   /**
   * Count of collaborators on the board.
   * minimum: 0
   * @return collaboratorCount
  **/
  @ApiModelProperty(example = "17", readOnly = true, value = "Count of collaborators on the board.")
  public Integer getCollaboratorCount() {
    return collaboratorCount;
  }

  public void setCollaboratorCount(Integer collaboratorCount) {
    this.collaboratorCount = collaboratorCount;
  }

  public Board pinCount(Integer pinCount) {
    this.pinCount = pinCount;
    return this;
  }

   /**
   * Count of pins on the board.
   * minimum: 0
   * @return pinCount
  **/
  @ApiModelProperty(example = "5", readOnly = true, value = "Count of pins on the board.")
  public Integer getPinCount() {
    return pinCount;
  }

  public void setPinCount(Integer pinCount) {
    this.pinCount = pinCount;
  }

  public Board followerCount(Integer followerCount) {
    this.followerCount = followerCount;
    return this;
  }

   /**
   * Board follower count.
   * minimum: 0
   * @return followerCount
  **/
  @ApiModelProperty(example = "13", readOnly = true, value = "Board follower count.")
  public Integer getFollowerCount() {
    return followerCount;
  }

  public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

  public Board media(BoardMedia media) {
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @ApiModelProperty(value = "")
  public BoardMedia getMedia() {
    return media;
  }

  public void setMedia(BoardMedia media) {
    this.media = media;
  }

  public Board owner(BoardOwner owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public BoardOwner getOwner() {
    return owner;
  }

  public void setOwner(BoardOwner owner) {
    this.owner = owner;
  }

  public Board privacy(PrivacyEnum privacy) {
    this.privacy = privacy;
    return this;
  }

   /**
   * Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
   * @return privacy
  **/
  @ApiModelProperty(value = "Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>")
  public PrivacyEnum getPrivacy() {
    return privacy;
  }

  public void setPrivacy(PrivacyEnum privacy) {
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
    return Objects.equals(this.id, board.id) &&
        Objects.equals(this.createdAt, board.createdAt) &&
        Objects.equals(this.boardPinsModifiedAt, board.boardPinsModifiedAt) &&
        Objects.equals(this.name, board.name) &&
        Objects.equals(this.description, board.description) &&
        Objects.equals(this.collaboratorCount, board.collaboratorCount) &&
        Objects.equals(this.pinCount, board.pinCount) &&
        Objects.equals(this.followerCount, board.followerCount) &&
        Objects.equals(this.media, board.media) &&
        Objects.equals(this.owner, board.owner) &&
        Objects.equals(this.privacy, board.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, boardPinsModifiedAt, name, description, collaboratorCount, pinCount, followerCount, media, owner, privacy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Board {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    boardPinsModifiedAt: ").append(toIndentedString(boardPinsModifiedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    collaboratorCount: ").append(toIndentedString(collaboratorCount)).append("\n");
    sb.append("    pinCount: ").append(toIndentedString(pinCount)).append("\n");
    sb.append("    followerCount: ").append(toIndentedString(followerCount)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

