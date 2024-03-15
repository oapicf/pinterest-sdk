package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PinsSaveRequest  {
  
 /**
  * Unique identifier of the board to which the pin will be saved.
  */
  @ApiModelProperty(value = "Unique identifier of the board to which the pin will be saved.")
  private String boardId;

 /**
  * Unique identifier of the board section to which the pin will be saved.
  */
  @ApiModelProperty(value = "Unique identifier of the board section to which the pin will be saved.")
  private String boardSectionId;
 /**
  * Unique identifier of the board to which the pin will be saved.
  * @return boardId
  */
  @JsonProperty("board_id")
 @Pattern(regexp="^\\d+$")  public String getBoardId() {
    return boardId;
  }

  /**
   * Sets the <code>boardId</code> property.
   */
 public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  /**
   * Sets the <code>boardId</code> property.
   */
  public PinsSaveRequest boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

 /**
  * Unique identifier of the board section to which the pin will be saved.
  * @return boardSectionId
  */
  @JsonProperty("board_section_id")
 @Pattern(regexp="^\\d+$")  public String getBoardSectionId() {
    return boardSectionId;
  }

  /**
   * Sets the <code>boardSectionId</code> property.
   */
 public void setBoardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
  }

  /**
   * Sets the <code>boardSectionId</code> property.
   */
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

