package apimodels;

import apimodels.BoardMedia;
import apimodels.BoardOwner;
import apimodels.BoardPrivacy;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Board   {
  @JsonProperty("board_pins_modified_at")
  @Valid

  private OffsetDateTime boardPinsModifiedAt;

  @JsonProperty("collaborator_count")
  @Min(0)

  private Integer collaboratorCount;

  @JsonProperty("created_at")
  @Valid

  private OffsetDateTime createdAt;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("follower_count")
  @Min(0)

  private Integer followerCount;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("is_ads_only")
  
  private Boolean isAdsOnly = false;

  @JsonProperty("media")
  @Valid

  private BoardMedia media;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("owner")
  @Valid

  private BoardOwner owner;

  @JsonProperty("pin_count")
  @Min(0)

  private Integer pinCount;

  @JsonProperty("privacy")
  @Valid

  private BoardPrivacy privacy;

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

  public Board isAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
    return this;
  }

   /**
   * If set to `true`, the board will be ad-only and can store ad-only Pins.
   * @return isAdsOnly
  **/
  public Boolean getIsAdsOnly() {
    return isAdsOnly;
  }

  public void setIsAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
  }

  public Board media(BoardMedia media) {
    this.media = media;
    return this;
  }

   /**
   * Board media.
   * @return media
  **/
  public BoardMedia getMedia() {
    return media;
  }

  public void setMedia(BoardMedia media) {
    this.media = media;
  }

  public Board name(String name) {
    this.name = name;
    return this;
  }

   /**
   *     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public Board pinCount(Integer pinCount) {
    this.pinCount = pinCount;
    return this;
  }

   /**
   * Count of Pins on the board.
   * minimum: 0
   * @return pinCount
  **/
  public Integer getPinCount() {
    return pinCount;
  }

  public void setPinCount(Integer pinCount) {
    this.pinCount = pinCount;
  }

  public Board privacy(BoardPrivacy privacy) {
    this.privacy = privacy;
    return this;
  }

   /**
   *     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
   * @return privacy
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

