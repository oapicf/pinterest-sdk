package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class PinsSaveRequestCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Unique identifier of the board to which the pin will be saved.
   */
  @JsonProperty("board_id")
  private String boardId;

  /**
   * Unique identifier of the board section to which the pin will be saved.
   */
  @JsonProperty("board_section_id")
  private String boardSectionId;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinsSaveRequestCreate pinsSaveRequestCreate = (PinsSaveRequestCreate) o;
    return Objects.equals(this.boardId, pinsSaveRequestCreate.boardId) &&
        Objects.equals(this.boardSectionId, pinsSaveRequestCreate.boardSectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boardId, boardSectionId);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
