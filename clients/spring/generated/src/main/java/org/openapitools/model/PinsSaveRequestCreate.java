package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "PinsSaveRequestCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinsSaveRequestCreate {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<@Pattern(regexp = "^\\d+$") String> boardId = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<@Pattern(regexp = "^\\d+$") String> boardSectionId = JsonNullable.<String>undefined();

  public PinsSaveRequestCreate boardId(String boardId) {
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

  public PinsSaveRequestCreate boardSectionId(String boardSectionId) {
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
    PinsSaveRequestCreate pinsSaveRequestCreate = (PinsSaveRequestCreate) o;
    return equalsNullable(this.boardId, pinsSaveRequestCreate.boardId) &&
        equalsNullable(this.boardSectionId, pinsSaveRequestCreate.boardSectionId);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

