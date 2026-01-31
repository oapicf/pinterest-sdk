package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardMedia;
import org.openapitools.model.BoardOwner;
import org.openapitools.model.BoardPrivacy;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Board  {
  
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
  *      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
  */
  @ApiModelProperty(example = "Summer recipes", required = true, value = "     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".")
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
  *     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
  */
  @ApiModelProperty(value = "    Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. ")
  @Valid
  private BoardPrivacy privacy = BoardPrivacy.PUBLIC;
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
  public Board boardPinsModifiedAt(Date boardPinsModifiedAt) {
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
  public Board collaboratorCount(Integer collaboratorCount) {
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
  public Board createdAt(Date createdAt) {
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
  public Board description(String description) {
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
  public Board followerCount(Integer followerCount) {
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
  public Board id(String id) {
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
  public Board isAdsOnly(Boolean isAdsOnly) {
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
  public Board media(BoardMedia media) {
    this.media = media;
    return this;
  }

 /**
  *      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.
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
  public Board name(String name) {
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
  public Board owner(BoardOwner owner) {
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
  public Board pinCount(Integer pinCount) {
    this.pinCount = pinCount;
    return this;
  }

 /**
  *     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;. 
  * @return privacy
  */
  @JsonProperty("privacy")
  public BoardPrivacy getPrivacy() {
    return privacy;
  }

  /**
   * Sets the <code>privacy</code> property.
   */
 public void setPrivacy(BoardPrivacy privacy) {
    this.privacy = privacy;
  }

  /**
   * Sets the <code>privacy</code> property.
   */
  public Board privacy(BoardPrivacy privacy) {
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
    return Objects.equals(this.boardPinsModifiedAt, board.boardPinsModifiedAt) &&
        Objects.equals(this.collaboratorCount, board.collaboratorCount) &&
        Objects.equals(this.createdAt, board.createdAt) &&
        Objects.equals(this.description, board.description) &&
        Objects.equals(this.followerCount, board.followerCount) &&
        Objects.equals(this.id, board.id) &&
        Objects.equals(this.isAdsOnly, board.isAdsOnly) &&
        Objects.equals(this.media, board.media) &&
        Objects.equals(this.name, board.name) &&
        Objects.equals(this.owner, board.owner) &&
        Objects.equals(this.pinCount, board.pinCount) &&
        Objects.equals(this.privacy, board.privacy);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

