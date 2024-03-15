package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PinsSaveRequest
 */

@JsonTypeName("pins_save_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinsSaveRequest {

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> boardId = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> boardSectionId = JsonNullable.<String>undefined();

  public PinsSaveRequest boardId(String boardId) {
    this.boardId = JsonNullable.of(boardId);
    return this;
  }

  /**
   * Unique identifier of the board to which the pin will be saved.
   * @return boardId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "board_id", description = "Unique identifier of the board to which the pin will be saved.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getBoardId() {
    return boardId;
  }

  public void setBoardId(JsonNullable<String> boardId) {
    this.boardId = boardId;
  }

  public PinsSaveRequest boardSectionId(String boardSectionId) {
    this.boardSectionId = JsonNullable.of(boardSectionId);
    return this;
  }

  /**
   * Unique identifier of the board section to which the pin will be saved.
   * @return boardSectionId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "board_section_id", description = "Unique identifier of the board section to which the pin will be saved.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board_section_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getBoardSectionId() {
    return boardSectionId;
  }

  public void setBoardSectionId(JsonNullable<String> boardSectionId) {
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
    PinsSaveRequest pinsSaveRequest = (PinsSaveRequest) o;
    return equalsNullable(this.boardId, pinsSaveRequest.boardId) &&
        equalsNullable(this.boardSectionId, pinsSaveRequest.boardSectionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(boardId), hashCodeNullable(boardSectionId));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

