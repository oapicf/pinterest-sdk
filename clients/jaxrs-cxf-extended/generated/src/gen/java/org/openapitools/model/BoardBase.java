package org.openapitools.model;

import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardMedia;
import org.openapitools.model.BoardOwner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BoardBase  {
  
 /**
  * Date and time of last board pins modified.
  */
  @ApiModelProperty(value = "Date and time of last board pins modified.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date boardPinsModifiedAt;

 /**
  * Count of collaborators on the board.
  */
  @ApiModelProperty(example = "17", value = "Count of collaborators on the board.")
  private Integer collaboratorCount;

 /**
  * Date and time of board creation.
  */
  @ApiModelProperty(value = "Date and time of board creation.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date createdAt;

  @ApiModelProperty(example = "My favorite summer recipes", value = "")
  private String description;

 /**
  * Board follower count.
  */
  @ApiModelProperty(example = "13", value = "Board follower count.")
  private Integer followerCount;

  @ApiModelProperty(example = "549755885175", required = true, value = "")
  private String id;

 /**
  * If set to `true`, the board will be ad-only and can store ad-only Pins.
  */
  @ApiModelProperty(example = "true", value = "If set to `true`, the board will be ad-only and can store ad-only Pins.")
  private Boolean isAdsOnly = false;

 /**
  * Board media.
  */
  @ApiModelProperty(value = "Board media.")
  @Valid
  private BoardMedia media;

 /**
  *     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
  */
  @ApiModelProperty(example = "Summer recipes", required = true, value = "    Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private BoardOwner owner;

 /**
  * Count of Pins on the board.
  */
  @ApiModelProperty(example = "5", value = "Count of Pins on the board.")
  private Integer pinCount;
 /**
  * Date and time of last board pins modified.
  * @return boardPinsModifiedAt
  */
  @JsonProperty("board_pins_modified_at")
  public Date getBoardPinsModifiedAt() {
    return boardPinsModifiedAt;
  }

  /**
   * Sets the <code>boardPinsModifiedAt</code> property.
   * <br><em>N.B. <code>boardPinsModifiedAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setBoardPinsModifiedAt(Date boardPinsModifiedAt) {
    this.boardPinsModifiedAt = boardPinsModifiedAt;
  }

  /**
   * Sets the <code>boardPinsModifiedAt</code> property.
   * <br><em>N.B. <code>boardPinsModifiedAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BoardBase boardPinsModifiedAt(Date boardPinsModifiedAt) {
    this.boardPinsModifiedAt = boardPinsModifiedAt;
    return this;
  }

 /**
  * Count of collaborators on the board.
  * minimum: 0
  * @return collaboratorCount
  */
  @JsonProperty("collaborator_count")
 @Min(0)  public Integer getCollaboratorCount() {
    return collaboratorCount;
  }

  /**
   * Sets the <code>collaboratorCount</code> property.
   * <br><em>N.B. <code>collaboratorCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCollaboratorCount(Integer collaboratorCount) {
    this.collaboratorCount = collaboratorCount;
  }

  /**
   * Sets the <code>collaboratorCount</code> property.
   * <br><em>N.B. <code>collaboratorCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BoardBase collaboratorCount(Integer collaboratorCount) {
    this.collaboratorCount = collaboratorCount;
    return this;
  }

 /**
  * Date and time of board creation.
  * @return createdAt
  */
  @JsonProperty("created_at")
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   * <br><em>N.B. <code>createdAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   * <br><em>N.B. <code>createdAt</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BoardBase createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * Get description
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public BoardBase description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Board follower count.
  * minimum: 0
  * @return followerCount
  */
  @JsonProperty("follower_count")
 @Min(0)  public Integer getFollowerCount() {
    return followerCount;
  }

  /**
   * Sets the <code>followerCount</code> property.
   * <br><em>N.B. <code>followerCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

  /**
   * Sets the <code>followerCount</code> property.
   * <br><em>N.B. <code>followerCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BoardBase followerCount(Integer followerCount) {
    this.followerCount = followerCount;
    return this;
  }

 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BoardBase id(String id) {
    this.id = id;
    return this;
  }

 /**
  * If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.
  * @return isAdsOnly
  */
  @JsonProperty("is_ads_only")
  public Boolean getIsAdsOnly() {
    return isAdsOnly;
  }

  /**
   * Sets the <code>isAdsOnly</code> property.
   */
 public void setIsAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
  }

  /**
   * Sets the <code>isAdsOnly</code> property.
   */
  public BoardBase isAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
    return this;
  }

 /**
  * Board media.
  * @return media
  */
  @JsonProperty("media")
  public BoardMedia getMedia() {
    return media;
  }

  /**
   * Sets the <code>media</code> property.
   * <br><em>N.B. <code>media</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setMedia(BoardMedia media) {
    this.media = media;
  }

  /**
   * Sets the <code>media</code> property.
   * <br><em>N.B. <code>media</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BoardBase media(BoardMedia media) {
    this.media = media;
    return this;
  }

 /**
  *     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public BoardBase name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get owner
  * @return owner
  */
  @JsonProperty("owner")
  public BoardOwner getOwner() {
    return owner;
  }

  /**
   * Sets the <code>owner</code> property.
   * <br><em>N.B. <code>owner</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setOwner(BoardOwner owner) {
    this.owner = owner;
  }

  /**
   * Sets the <code>owner</code> property.
   * <br><em>N.B. <code>owner</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BoardBase owner(BoardOwner owner) {
    this.owner = owner;
    return this;
  }

 /**
  * Count of Pins on the board.
  * minimum: 0
  * @return pinCount
  */
  @JsonProperty("pin_count")
 @Min(0)  public Integer getPinCount() {
    return pinCount;
  }

  /**
   * Sets the <code>pinCount</code> property.
   * <br><em>N.B. <code>pinCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPinCount(Integer pinCount) {
    this.pinCount = pinCount;
  }

  /**
   * Sets the <code>pinCount</code> property.
   * <br><em>N.B. <code>pinCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BoardBase pinCount(Integer pinCount) {
    this.pinCount = pinCount;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

