package apimodels;

import apimodels.BoardMedia;
import apimodels.BoardOwner;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Board
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Board   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("created_at")
  @Valid

  private OffsetDateTime createdAt;

  @JsonProperty("board_pins_modified_at")
  @Valid

  private OffsetDateTime boardPinsModifiedAt;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("collaborator_count")
  @Min(0)

  private Integer collaboratorCount;

  @JsonProperty("pin_count")
  @Min(0)

  private Integer pinCount;

  @JsonProperty("follower_count")
  @Min(0)

  private Integer followerCount;

  @JsonProperty("media")
  @Valid

  private BoardMedia media;

  @JsonProperty("owner")
  @Valid

  private BoardOwner owner;

  /**
   * Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
   */
  public enum PrivacyEnum {
    PUBLIC("PUBLIC"),
    
    PROTECTED("PROTECTED"),
    
    SECRET("SECRET");

    private final String value;

    PrivacyEnum(String value) {
      this.value = value;
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
    return Objects.equals(id, board.id) &&
        Objects.equals(createdAt, board.createdAt) &&
        Objects.equals(boardPinsModifiedAt, board.boardPinsModifiedAt) &&
        Objects.equals(name, board.name) &&
        Objects.equals(description, board.description) &&
        Objects.equals(collaboratorCount, board.collaboratorCount) &&
        Objects.equals(pinCount, board.pinCount) &&
        Objects.equals(followerCount, board.followerCount) &&
        Objects.equals(media, board.media) &&
        Objects.equals(owner, board.owner) &&
        Objects.equals(privacy, board.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, boardPinsModifiedAt, name, description, collaboratorCount, pinCount, followerCount, media, owner, privacy);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

