package apimodels;

import apimodels.BoardMedia;
import apimodels.BoardOwner;
import apimodels.BoardUpdatePrivacy;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BoardWithUpdatePrivacy
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BoardWithUpdatePrivacy   {
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

  private BoardUpdatePrivacy privacy;

  public BoardWithUpdatePrivacy boardPinsModifiedAt(OffsetDateTime boardPinsModifiedAt) {
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

  public BoardWithUpdatePrivacy collaboratorCount(Integer collaboratorCount) {
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

  public BoardWithUpdatePrivacy createdAt(OffsetDateTime createdAt) {
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

  public BoardWithUpdatePrivacy description(String description) {
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

  public BoardWithUpdatePrivacy followerCount(Integer followerCount) {
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

  public BoardWithUpdatePrivacy id(String id) {
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

  public BoardWithUpdatePrivacy isAdsOnly(Boolean isAdsOnly) {
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

  public BoardWithUpdatePrivacy media(BoardMedia media) {
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

  public BoardWithUpdatePrivacy name(String name) {
    this.name = name;
    return this;
  }

   /**
   *      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BoardWithUpdatePrivacy owner(BoardOwner owner) {
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

  public BoardWithUpdatePrivacy pinCount(Integer pinCount) {
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

  public BoardWithUpdatePrivacy privacy(BoardUpdatePrivacy privacy) {
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  public BoardUpdatePrivacy getPrivacy() {
    return privacy;
  }

  public void setPrivacy(BoardUpdatePrivacy privacy) {
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
    BoardWithUpdatePrivacy boardWithUpdatePrivacy = (BoardWithUpdatePrivacy) o;
    return Objects.equals(boardPinsModifiedAt, boardWithUpdatePrivacy.boardPinsModifiedAt) &&
        Objects.equals(collaboratorCount, boardWithUpdatePrivacy.collaboratorCount) &&
        Objects.equals(createdAt, boardWithUpdatePrivacy.createdAt) &&
        Objects.equals(description, boardWithUpdatePrivacy.description) &&
        Objects.equals(followerCount, boardWithUpdatePrivacy.followerCount) &&
        Objects.equals(id, boardWithUpdatePrivacy.id) &&
        Objects.equals(isAdsOnly, boardWithUpdatePrivacy.isAdsOnly) &&
        Objects.equals(media, boardWithUpdatePrivacy.media) &&
        Objects.equals(name, boardWithUpdatePrivacy.name) &&
        Objects.equals(owner, boardWithUpdatePrivacy.owner) &&
        Objects.equals(pinCount, boardWithUpdatePrivacy.pinCount) &&
        Objects.equals(privacy, boardWithUpdatePrivacy.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardPinsModifiedAt, collaboratorCount, createdAt, description, followerCount, id, isAdsOnly, media, name, owner, pinCount, privacy);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardWithUpdatePrivacy {\n");
    
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

