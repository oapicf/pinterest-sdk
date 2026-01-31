package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardMedia;
import org.openapitools.model.BoardOwner;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BoardBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BoardBase {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime boardPinsModifiedAt;

  private @Nullable Integer collaboratorCount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime createdAt;

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private @Nullable Integer followerCount;

  private String id;

  private Boolean isAdsOnly = false;

  private @Nullable BoardMedia media;

  private String name;

  private @Nullable BoardOwner owner;

  private @Nullable Integer pinCount;

  public BoardBase() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BoardBase(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public BoardBase boardPinsModifiedAt(@Nullable OffsetDateTime boardPinsModifiedAt) {
    this.boardPinsModifiedAt = boardPinsModifiedAt;
    return this;
  }

  /**
   * Date and time of last board pins modified.
   * @return boardPinsModifiedAt
   */
  @Valid 
  @Schema(name = "board_pins_modified_at", accessMode = Schema.AccessMode.READ_ONLY, description = "Date and time of last board pins modified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board_pins_modified_at")
  public @Nullable OffsetDateTime getBoardPinsModifiedAt() {
    return boardPinsModifiedAt;
  }

  public void setBoardPinsModifiedAt(@Nullable OffsetDateTime boardPinsModifiedAt) {
    this.boardPinsModifiedAt = boardPinsModifiedAt;
  }

  public BoardBase collaboratorCount(@Nullable Integer collaboratorCount) {
    this.collaboratorCount = collaboratorCount;
    return this;
  }

  /**
   * Count of collaborators on the board.
   * minimum: 0
   * @return collaboratorCount
   */
  @Min(value = 0) 
  @Schema(name = "collaborator_count", accessMode = Schema.AccessMode.READ_ONLY, example = "17", description = "Count of collaborators on the board.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collaborator_count")
  public @Nullable Integer getCollaboratorCount() {
    return collaboratorCount;
  }

  public void setCollaboratorCount(@Nullable Integer collaboratorCount) {
    this.collaboratorCount = collaboratorCount;
  }

  public BoardBase createdAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date and time of board creation.
   * @return createdAt
   */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, description = "Date and time of board creation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public @Nullable OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(@Nullable OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public BoardBase description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", example = "My favorite summer recipes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public BoardBase followerCount(@Nullable Integer followerCount) {
    this.followerCount = followerCount;
    return this;
  }

  /**
   * Board follower count.
   * minimum: 0
   * @return followerCount
   */
  @Min(value = 0) 
  @Schema(name = "follower_count", accessMode = Schema.AccessMode.READ_ONLY, example = "13", description = "Board follower count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("follower_count")
  public @Nullable Integer getFollowerCount() {
    return followerCount;
  }

  public void setFollowerCount(@Nullable Integer followerCount) {
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
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "549755885175", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
  
  @Schema(name = "is_ads_only", example = "true", description = "If set to `true`, the board will be ad-only and can store ad-only Pins.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_ads_only")
  public Boolean getIsAdsOnly() {
    return isAdsOnly;
  }

  public void setIsAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
  }

  public BoardBase media(@Nullable BoardMedia media) {
    this.media = media;
    return this;
  }

  /**
   * Board media.
   * @return media
   */
  @Valid 
  @Schema(name = "media", accessMode = Schema.AccessMode.READ_ONLY, description = "Board media.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media")
  public @Nullable BoardMedia getMedia() {
    return media;
  }

  public void setMedia(@Nullable BoardMedia media) {
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
  @NotNull 
  @Schema(name = "name", example = "Summer recipes", description = "     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BoardBase owner(@Nullable BoardOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
   */
  @Valid 
  @Schema(name = "owner", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public @Nullable BoardOwner getOwner() {
    return owner;
  }

  public void setOwner(@Nullable BoardOwner owner) {
    this.owner = owner;
  }

  public BoardBase pinCount(@Nullable Integer pinCount) {
    this.pinCount = pinCount;
    return this;
  }

  /**
   * Count of Pins on the board.
   * minimum: 0
   * @return pinCount
   */
  @Min(value = 0) 
  @Schema(name = "pin_count", accessMode = Schema.AccessMode.READ_ONLY, example = "5", description = "Count of Pins on the board.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_count")
  public @Nullable Integer getPinCount() {
    return pinCount;
  }

  public void setPinCount(@Nullable Integer pinCount) {
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
        equalsNullable(this.description, boardBase.description) &&
        Objects.equals(this.followerCount, boardBase.followerCount) &&
        Objects.equals(this.id, boardBase.id) &&
        Objects.equals(this.isAdsOnly, boardBase.isAdsOnly) &&
        Objects.equals(this.media, boardBase.media) &&
        Objects.equals(this.name, boardBase.name) &&
        Objects.equals(this.owner, boardBase.owner) &&
        Objects.equals(this.pinCount, boardBase.pinCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardPinsModifiedAt, collaboratorCount, createdAt, hashCodeNullable(description), followerCount, id, isAdsOnly, media, name, owner, pinCount);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

