package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AiDisclosures;
import org.openapitools.server.model.PinMediaSource;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class PinCreate   {

    private AiDisclosures aiDisclosures;
    private String altText;
    private String boardId;
    private String boardSectionId;
    private String description;
    private String dominantColor;
    private String link;
    private PinMediaSource mediaSource;
    private String parentPinId;
    private String sponsorId;
    private String title;

    /**
     * Default constructor.
     */
    public PinCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create PinCreate.
     *
     * @param aiDisclosures AI disclosure declarations the creator has made about this Pin.
     * @param altText altText
     * @param boardId The board to which this Pin belongs.
     * @param boardSectionId The board section to which this Pin belongs.
     * @param description description
     * @param dominantColor Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.
     * @param link link
     * @param mediaSource mediaSource
     * @param parentPinId The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
     * @param sponsorId The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
     * @param title title
     */
    public PinCreate(
        AiDisclosures aiDisclosures, 
        String altText, 
        String boardId, 
        String boardSectionId, 
        String description, 
        String dominantColor, 
        String link, 
        PinMediaSource mediaSource, 
        String parentPinId, 
        String sponsorId, 
        String title
    ) {
        this.aiDisclosures = aiDisclosures;
        this.altText = altText;
        this.boardId = boardId;
        this.boardSectionId = boardSectionId;
        this.description = description;
        this.dominantColor = dominantColor;
        this.link = link;
        this.mediaSource = mediaSource;
        this.parentPinId = parentPinId;
        this.sponsorId = sponsorId;
        this.title = title;
    }



    /**
     * AI disclosure declarations the creator has made about this Pin.
     * @return aiDisclosures
     */
    public AiDisclosures getAiDisclosures() {
        return aiDisclosures;
    }

    public void setAiDisclosures(AiDisclosures aiDisclosures) {
        this.aiDisclosures = aiDisclosures;
    }

    /**
     * Get altText
     * @return altText
     */
    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }

    /**
     * The board to which this Pin belongs.
     * @return boardId
     */
    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    /**
     * The board section to which this Pin belongs.
     * @return boardSectionId
     */
    public String getBoardSectionId() {
        return boardSectionId;
    }

    public void setBoardSectionId(String boardSectionId) {
        this.boardSectionId = boardSectionId;
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
     * Dominant pin color. Hex number, e.g. `#6E7874`.
     * @return dominantColor
     */
    public String getDominantColor() {
        return dominantColor;
    }

    public void setDominantColor(String dominantColor) {
        this.dominantColor = dominantColor;
    }

    /**
     * Get link
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Get mediaSource
     * @return mediaSource
     */
    public PinMediaSource getMediaSource() {
        return mediaSource;
    }

    public void setMediaSource(PinMediaSource mediaSource) {
        this.mediaSource = mediaSource;
    }

    /**
     * The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
     * @return parentPinId
     */
    public String getParentPinId() {
        return parentPinId;
    }

    public void setParentPinId(String parentPinId) {
        this.parentPinId = parentPinId;
    }

    /**
     * The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
     * @return sponsorId
     */
    public String getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(String sponsorId) {
        this.sponsorId = sponsorId;
    }

    /**
     * Get title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinCreate {\n");
        
        sb.append("    aiDisclosures: ").append(toIndentedString(aiDisclosures)).append("\n");
        sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
        sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
        sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dominantColor: ").append(toIndentedString(dominantColor)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    mediaSource: ").append(toIndentedString(mediaSource)).append("\n");
        sb.append("    parentPinId: ").append(toIndentedString(parentPinId)).append("\n");
        sb.append("    sponsorId: ").append(toIndentedString(sponsorId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

