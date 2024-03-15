package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PinsSaveRequest  {
  
  @ApiModelProperty(value = "Unique identifier of the board to which the pin will be saved.")
 /**
   * Unique identifier of the board to which the pin will be saved.
  **/
  private String boardId;

  @ApiModelProperty(value = "Unique identifier of the board section to which the pin will be saved.")
 /**
   * Unique identifier of the board section to which the pin will be saved.
  **/
  private String boardSectionId;
 /**
   * Unique identifier of the board to which the pin will be saved.
   * @return boardId
  **/
  @JsonProperty("board_id")
  public String getBoardId() {
    return boardId;
  }

  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  public PinsSaveRequest boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

 /**
   * Unique identifier of the board section to which the pin will be saved.
   * @return boardSectionId
  **/
  @JsonProperty("board_section_id")
  public String getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  public PinsSaveRequest boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
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
    PinsSaveRequest pinsSaveRequest = (PinsSaveRequest) o;
    return Objects.equals(this.boardId, pinsSaveRequest.boardId) &&
        Objects.equals(this.boardSectionId, pinsSaveRequest.boardSectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardId, boardSectionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinsSaveRequest {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

