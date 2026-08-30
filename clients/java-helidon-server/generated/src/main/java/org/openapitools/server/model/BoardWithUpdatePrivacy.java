package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BoardMedia;
import org.openapitools.server.model.BoardOwner;
import org.openapitools.server.model.BoardUpdatePrivacy;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BoardWithUpdatePrivacy   {

    private OffsetDateTime boardPinsModifiedAt;
    private Integer collaboratorCount;
    private OffsetDateTime createdAt;
    private String description;
    private Integer followerCount;
    private String id;
    private Boolean isAdsOnly = false;
    private BoardMedia media;
    private String name;
    private BoardOwner owner;
    private Integer pinCount;
    private BoardUpdatePrivacy privacy;

    /**
     * Default constructor.
     */
    public BoardWithUpdatePrivacy() {
    // JSON-B / Jackson
    }

    /**
     * Create BoardWithUpdatePrivacy.
     *
     * @param boardPinsModifiedAt Date and time of last board pins modified.
     * @param collaboratorCount Count of collaborators on the board.
     * @param createdAt Date and time of board creation.
     * @param description description
     * @param followerCount Board follower count.
     * @param id id
     * @param isAdsOnly If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins.
     * @param media Board media.
     * @param name     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;.
     * @param owner owner
     * @param pinCount Count of Pins on the board.
     * @param privacy privacy
     */
    public BoardWithUpdatePrivacy(
        OffsetDateTime boardPinsModifiedAt, 
        Integer collaboratorCount, 
        OffsetDateTime createdAt, 
        String description, 
        Integer followerCount, 
        String id, 
        Boolean isAdsOnly, 
        BoardMedia media, 
        String name, 
        BoardOwner owner, 
        Integer pinCount, 
        BoardUpdatePrivacy privacy
    ) {
        this.boardPinsModifiedAt = boardPinsModifiedAt;
        this.collaboratorCount = collaboratorCount;
        this.createdAt = createdAt;
        this.description = description;
        this.followerCount = followerCount;
        this.id = id;
        this.isAdsOnly = isAdsOnly;
        this.media = media;
        this.name = name;
        this.owner = owner;
        this.pinCount = pinCount;
        this.privacy = privacy;
    }



    /**
     * Date and time of last board pins modified.
     * @return boardPinsModifiedAt
     */
    public OffsetDateTime getBoardPinsModifiedAt() {
        return boardPinsModifiedAt;
    }

    public void setBoardPinsModifiedAt(OffsetDateTime boardPinsModifiedAt) {
        this.boardPinsModifiedAt = boardPinsModifiedAt;
    }

    /**
     * Count of collaborators on the board.
     * minimum: 0
     * @return collaboratorCount
     */
    public Integer getCollaboratorCount() {
        return collaboratorCount;
    }

    public void setCollaboratorCount(Integer collaboratorCount) {
        this.collaboratorCount = collaboratorCount;
    }

    /**
     * Date and time of board creation.
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Board follower count.
     * minimum: 0
     * @return followerCount
     */
    public Integer getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * If set to `true`, the board will be ad-only and can store ad-only Pins.
     * @return isAdsOnly
     */
    public Boolean getIsAdsOnly() {
        return isAdsOnly;
    }

    public void setIsAdsOnly(Boolean isAdsOnly) {
        this.isAdsOnly = isAdsOnly;
    }

    /**
     * Board media.
     * @return media
     */
    public BoardMedia getMedia() {
        return media;
    }

    public void setMedia(BoardMedia media) {
        this.media = media;
    }

    /**
     *     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get owner
     * @return owner
     */
    public BoardOwner getOwner() {
        return owner;
    }

    public void setOwner(BoardOwner owner) {
        this.owner = owner;
    }

    /**
     * Count of Pins on the board.
     * minimum: 0
     * @return pinCount
     */
    public Integer getPinCount() {
        return pinCount;
    }

    public void setPinCount(Integer pinCount) {
        this.pinCount = pinCount;
    }

    /**
     * Get privacy
     * @return privacy
     */
    public BoardUpdatePrivacy getPrivacy() {
        return privacy;
    }

    public void setPrivacy(BoardUpdatePrivacy privacy) {
        this.privacy = privacy;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

