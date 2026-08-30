package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AiDisclosures;
import org.openapitools.server.model.BoardOwner;
import org.openapitools.server.model.CreativeType;
import org.openapitools.server.model.PinMedia;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PinBase   {

    private AiDisclosures aiDisclosures;
    private String boardId;
    private BoardOwner boardOwner;
    private String boardSectionId;
    private OffsetDateTime createdAt;
    private CreativeType creativeType;
    private String dominantColor;
    private Boolean hasBeenPromoted;
    private String id;
    private Boolean isOwner;
    private Boolean isProduct;
    private Boolean isStandard;
    private PinMedia media;
    private String parentPinId;
    private Object pinMetrics;

    /**
     * Default constructor.
     */
    public PinBase() {
    // JSON-B / Jackson
    }

    /**
     * Create PinBase.
     *
     * @param aiDisclosures AI disclosure declarations the creator has made about this Pin.
     * @param boardId The board to which this Pin belongs.
     * @param boardOwner boardOwner
     * @param boardSectionId The board section to which this Pin belongs.
     * @param createdAt createdAt
     * @param creativeType creativeType
     * @param dominantColor Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;.
     * @param hasBeenPromoted Whether the Pin has been promoted or not.
     * @param id id
     * @param isOwner Whether the \&quot;operation user_account\&quot; is the Pin owner.
     * @param isProduct Whether the Pin is a product Pin.
     * @param isStandard Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
     * @param media media
     * @param parentPinId The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
     * @param pinMetrics Pin metrics with associated time intervals if any.
     */
    public PinBase(
        AiDisclosures aiDisclosures, 
        String boardId, 
        BoardOwner boardOwner, 
        String boardSectionId, 
        OffsetDateTime createdAt, 
        CreativeType creativeType, 
        String dominantColor, 
        Boolean hasBeenPromoted, 
        String id, 
        Boolean isOwner, 
        Boolean isProduct, 
        Boolean isStandard, 
        PinMedia media, 
        String parentPinId, 
        Object pinMetrics
    ) {
        this.aiDisclosures = aiDisclosures;
        this.boardId = boardId;
        this.boardOwner = boardOwner;
        this.boardSectionId = boardSectionId;
        this.createdAt = createdAt;
        this.creativeType = creativeType;
        this.dominantColor = dominantColor;
        this.hasBeenPromoted = hasBeenPromoted;
        this.id = id;
        this.isOwner = isOwner;
        this.isProduct = isProduct;
        this.isStandard = isStandard;
        this.media = media;
        this.parentPinId = parentPinId;
        this.pinMetrics = pinMetrics;
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
     * Get boardOwner
     * @return boardOwner
     */
    public BoardOwner getBoardOwner() {
        return boardOwner;
    }

    public void setBoardOwner(BoardOwner boardOwner) {
        this.boardOwner = boardOwner;
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
     * Get createdAt
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Get creativeType
     * @return creativeType
     */
    public CreativeType getCreativeType() {
        return creativeType;
    }

    public void setCreativeType(CreativeType creativeType) {
        this.creativeType = creativeType;
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
     * Whether the Pin has been promoted or not.
     * @return hasBeenPromoted
     */
    public Boolean getHasBeenPromoted() {
        return hasBeenPromoted;
    }

    public void setHasBeenPromoted(Boolean hasBeenPromoted) {
        this.hasBeenPromoted = hasBeenPromoted;
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
     * Whether the \"operation user_account\" is the Pin owner.
     * @return isOwner
     */
    public Boolean getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    /**
     * Whether the Pin is a product Pin.
     * @return isProduct
     */
    public Boolean getIsProduct() {
        return isProduct;
    }

    public void setIsProduct(Boolean isProduct) {
        this.isProduct = isProduct;
    }

    /**
     * Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
     * @return isStandard
     */
    public Boolean getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(Boolean isStandard) {
        this.isStandard = isStandard;
    }

    /**
     * Get media
     * @return media
     */
    public PinMedia getMedia() {
        return media;
    }

    public void setMedia(PinMedia media) {
        this.media = media;
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
     * Pin metrics with associated time intervals if any.
     * @return pinMetrics
     */
    public Object getPinMetrics() {
        return pinMetrics;
    }

    public void setPinMetrics(Object pinMetrics) {
        this.pinMetrics = pinMetrics;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinBase {\n");
        
        sb.append("    aiDisclosures: ").append(toIndentedString(aiDisclosures)).append("\n");
        sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
        sb.append("    boardOwner: ").append(toIndentedString(boardOwner)).append("\n");
        sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
        sb.append("    dominantColor: ").append(toIndentedString(dominantColor)).append("\n");
        sb.append("    hasBeenPromoted: ").append(toIndentedString(hasBeenPromoted)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
        sb.append("    isProduct: ").append(toIndentedString(isProduct)).append("\n");
        sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
        sb.append("    media: ").append(toIndentedString(media)).append("\n");
        sb.append("    parentPinId: ").append(toIndentedString(parentPinId)).append("\n");
        sb.append("    pinMetrics: ").append(toIndentedString(pinMetrics)).append("\n");
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

