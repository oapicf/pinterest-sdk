package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardMedia;
import org.openapitools.model.BoardOwner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Board
 **/
@ApiModel(description="Board")

public class Board  {
  
  @ApiModelProperty(example = "549755885175", value = "")
  private String id;

  @ApiModelProperty(example = "2020-01-01T20:10:40Z", value = "Date and time of board creation.")
 /**
   * Date and time of board creation.
  **/
  private Date createdAt;

  @ApiModelProperty(example = "2020-01-01T20:10:40Z", value = "Date and time of last board pins modified.")
 /**
   * Date and time of last board pins modified.
  **/
  private Date boardPinsModifiedAt;

  @ApiModelProperty(example = "Summer Recipes", required = true, value = "")
  private String name;

  @ApiModelProperty(example = "My favorite summer recipes", value = "")
  private String description;

  @ApiModelProperty(example = "17", value = "Count of collaborators on the board.")
 /**
   * Count of collaborators on the board.
  **/
  private Integer collaboratorCount;

  @ApiModelProperty(example = "5", value = "Count of pins on the board.")
 /**
   * Count of pins on the board.
  **/
  private Integer pinCount;

  @ApiModelProperty(example = "13", value = "Board follower count.")
 /**
   * Board follower count.
  **/
  private Integer followerCount;

  @ApiModelProperty(value = "")
  @Valid
  private BoardMedia media;

  @ApiModelProperty(value = "")
  @Valid
  private BoardOwner owner;

public enum PrivacyEnum {

PUBLIC(String.valueOf("PUBLIC")), PROTECTED(String.valueOf("PROTECTED")), SECRET(String.valueOf("SECRET"));


    private String value;

    PrivacyEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static PrivacyEnum fromValue(String value) {
        for (PrivacyEnum b : PrivacyEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>")
 /**
   * Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
  **/
  private PrivacyEnum privacy = PrivacyEnum.PUBLIC;
 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * Date and time of board creation.
   * @return createdAt
  **/
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }


 /**
   * Date and time of last board pins modified.
   * @return boardPinsModifiedAt
  **/
  @JsonProperty("board_pins_modified_at")
  public Date getBoardPinsModifiedAt() {
    return boardPinsModifiedAt;
  }


 /**
   * Get name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Board name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Board description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Count of collaborators on the board.
   * minimum: 0
   * @return collaboratorCount
  **/
  @JsonProperty("collaborator_count")
 @Min(0)  public Integer getCollaboratorCount() {
    return collaboratorCount;
  }


 /**
   * Count of pins on the board.
   * minimum: 0
   * @return pinCount
  **/
  @JsonProperty("pin_count")
 @Min(0)  public Integer getPinCount() {
    return pinCount;
  }


 /**
   * Board follower count.
   * minimum: 0
   * @return followerCount
  **/
  @JsonProperty("follower_count")
 @Min(0)  public Integer getFollowerCount() {
    return followerCount;
  }


 /**
   * Get media
   * @return media
  **/
  @JsonProperty("media")
  public BoardMedia getMedia() {
    return media;
  }

  public void setMedia(BoardMedia media) {
    this.media = media;
  }

  public Board media(BoardMedia media) {
    this.media = media;
    return this;
  }

 /**
   * Get owner
   * @return owner
  **/
  @JsonProperty("owner")
  public BoardOwner getOwner() {
    return owner;
  }

  public void setOwner(BoardOwner owner) {
    this.owner = owner;
  }

  public Board owner(BoardOwner owner) {
    this.owner = owner;
    return this;
  }

 /**
   * Privacy setting for a board. Learn more about &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/article/secret-boards\&quot;&gt;secret boards&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/protected-boards\&quot;&gt;protected boards&lt;/a&gt;
   * @return privacy
  **/
  @JsonProperty("privacy")
  public String getPrivacy() {
    if (privacy == null) {
      return null;
    }
    return privacy.value();
  }

  public void setPrivacy(PrivacyEnum privacy) {
    this.privacy = privacy;
  }

  public Board privacy(PrivacyEnum privacy) {
    this.privacy = privacy;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

