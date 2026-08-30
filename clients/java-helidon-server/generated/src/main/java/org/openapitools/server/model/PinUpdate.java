package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AiDisclosuresUpdate;
import org.openapitools.server.model.CarouselSlot;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create or update operation model.
 */
public class PinUpdate   {

    private AiDisclosuresUpdate aiDisclosures;
    private String altText;
    private String boardId;
    private String boardSectionId;
    private List<@Valid CarouselSlot> carouselSlots = new ArrayList<>();
    private String description;
    private String link;
    private String title;

    /**
     * Default constructor.
     */
    public PinUpdate() {
    // JSON-B / Jackson
    }

    /**
     * Create PinUpdate.
     *
     * @param aiDisclosures AI disclosure declarations the creator has made about this Pin.
     * @param altText altText
     * @param boardId The board to which this Pin belongs.
     * @param boardSectionId The board section to which this Pin belongs.
     * @param carouselSlots Carousel Pin slots data.
     * @param description description
     * @param link link
     * @param title title
     */
    public PinUpdate(
        AiDisclosuresUpdate aiDisclosures, 
        String altText, 
        String boardId, 
        String boardSectionId, 
        List<@Valid CarouselSlot> carouselSlots, 
        String description, 
        String link, 
        String title
    ) {
        this.aiDisclosures = aiDisclosures;
        this.altText = altText;
        this.boardId = boardId;
        this.boardSectionId = boardSectionId;
        this.carouselSlots = carouselSlots;
        this.description = description;
        this.link = link;
        this.title = title;
    }



    /**
     * AI disclosure declarations the creator has made about this Pin.
     * @return aiDisclosures
     */
    public AiDisclosuresUpdate getAiDisclosures() {
        return aiDisclosures;
    }

    public void setAiDisclosures(AiDisclosuresUpdate aiDisclosures) {
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
     * Carousel Pin slots data.
     * @return carouselSlots
     */
    public List<@Valid CarouselSlot> getCarouselSlots() {
        return carouselSlots;
    }

    public void setCarouselSlots(List<@Valid CarouselSlot> carouselSlots) {
        this.carouselSlots = carouselSlots;
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
        sb.append("class PinUpdate {\n");
        
        sb.append("    aiDisclosures: ").append(toIndentedString(aiDisclosures)).append("\n");
        sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
        sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
        sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
        sb.append("    carouselSlots: ").append(toIndentedString(carouselSlots)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

