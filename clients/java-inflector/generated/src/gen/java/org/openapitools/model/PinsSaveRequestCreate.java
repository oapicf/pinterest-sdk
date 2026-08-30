package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;



/**
 * Resource create operation model.
 **/

@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinsSaveRequestCreate   {
  @JsonProperty("board_id")
  private String boardId;

  @JsonProperty("board_section_id")
  private String boardSectionId;

  /**
   * Unique identifier of the board to which the pin will be saved.
   **/
  public PinsSaveRequestCreate boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the board to which the pin will be saved.")
  @JsonProperty("board_id")
  public String getBoardId() {
    return boardId;
  }
  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  /**
   * Unique identifier of the board section to which the pin will be saved.
   **/
  public PinsSaveRequestCreate boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the board section to which the pin will be saved.")
  @JsonProperty("board_section_id")
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
    return Objects.equals(boardId, pinsSaveRequestCreate.boardId) &&
        Objects.equals(boardSectionId, pinsSaveRequestCreate.boardSectionId);
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

