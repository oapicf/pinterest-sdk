package apimodels;

import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinsSaveRequestCreate   {
  @JsonProperty("board_id")
  @Pattern(regexp="^\\d+$")

  private String boardId;

  @JsonProperty("board_section_id")
  @Pattern(regexp="^\\d+$")

  private String boardSectionId;

  public PinsSaveRequestCreate boardId(String boardId) {
    this.boardId = boardId;
    return this;
  }

   /**
   * Unique identifier of the board to which the pin will be saved.
   * @return boardId
  **/
  public String getBoardId() {
    return boardId;
  }

  public void setBoardId(String boardId) {
    this.boardId = boardId;
  }

  public PinsSaveRequestCreate boardSectionId(String boardSectionId) {
    this.boardSectionId = boardSectionId;
    return this;
  }

   /**
   * Unique identifier of the board section to which the pin will be saved.
   * @return boardSectionId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

