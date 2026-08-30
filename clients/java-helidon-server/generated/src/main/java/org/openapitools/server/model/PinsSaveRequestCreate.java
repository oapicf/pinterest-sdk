package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class PinsSaveRequestCreate   {

    private String boardId;
    private String boardSectionId;

    /**
     * Default constructor.
     */
    public PinsSaveRequestCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create PinsSaveRequestCreate.
     *
     * @param boardId Unique identifier of the board to which the pin will be saved.
     * @param boardSectionId Unique identifier of the board section to which the pin will be saved.
     */
    public PinsSaveRequestCreate(
        String boardId, 
        String boardSectionId
    ) {
        this.boardId = boardId;
        this.boardSectionId = boardSectionId;
    }



    /**
     * Unique identifier of the board to which the pin will be saved.
     * @return boardId
     */
    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    /**
     * Unique identifier of the board section to which the pin will be saved.
     * @return boardSectionId
     */
    public String getBoardSectionId() {
        return boardSectionId;
    }

    public void setBoardSectionId(String boardSectionId) {
        this.boardSectionId = boardSectionId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinsSaveRequestCreate {\n");
        
        sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
        sb.append("    boardSectionId: ").append(toIndentedString(boardSectionId)).append("\n");
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

