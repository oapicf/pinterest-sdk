package org.openapitools.model;

import java.util.Date;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardMedia;
import org.openapitools.model.BoardOwner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BoardBase  {
  
 /**
  * Date and time of last board pins modified.
  */
  @ApiModelProperty(value = "Date and time of last board pins modified.")

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

  private BoardMedia media;

 /**
  *      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
  */
  @ApiModelProperty(example = "Summer recipes", required = true, value = "     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".")

  private String name;

  @ApiModelProperty(value = "")

  private BoardOwner owner;

 /**
  * Count of Pins on the board.
  */
  @ApiModelProperty(example = "5", value = "Count of Pins on the board.")

  private Integer pinCount;
 /**
   * Date and time of last board pins modified.
   * @return boardPinsModifiedAt
  **/
  @JsonProperty("board_pins_modified_at")
  public Date getBoardPinsModifiedAt() {
    return boardPinsModifiedAt;
  }


 /**
   * Count of collaborators on the board.
   * minimum: 0
   * @return collaboratorCount
  **/
  @JsonProperty("collaborator_count")
  public Integer getCollaboratorCount() {
    return collaboratorCount;
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

  public BoardBase description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Board follower count.
   * minimum: 0
   * @return followerCount
  **/
  @JsonProperty("follower_count")
  public Integer getFollowerCount() {
    return followerCount;
  }


 /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.
   * @return isAdsOnly
  **/
  @JsonProperty("is_ads_only")
  public Boolean getIsAdsOnly() {
    return isAdsOnly;
  }

  public void setIsAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
  }

  public BoardBase isAdsOnly(Boolean isAdsOnly) {
    this.isAdsOnly = isAdsOnly;
    return this;
  }

 /**
   * Board media.
   * @return media
  **/
  @JsonProperty("media")
  public BoardMedia getMedia() {
    return media;
  }


 /**
   *      Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BoardBase name(String name) {
    this.name = name;
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


 /**
   * Count of Pins on the board.
   * minimum: 0
   * @return pinCount
  **/
  @JsonProperty("pin_count")
  public Integer getPinCount() {
    return pinCount;
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

