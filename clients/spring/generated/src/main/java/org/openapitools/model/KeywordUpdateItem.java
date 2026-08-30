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
 * KeywordUpdateItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeywordUpdateItem {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean archived;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> bid = JsonNullable.<Integer>undefined();

  private String id;

  public KeywordUpdateItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public KeywordUpdateItem(String id) {
    this.id = id;
  }

  public KeywordUpdateItem archived(@Nullable Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Get archived
   * @return archived
   */
  
  @Schema(name = "archived", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived")
  public @Nullable Boolean getArchived() {
    return archived;
  }

  @JsonProperty("archived")
  public void setArchived(@Nullable Boolean archived) {
    this.archived = archived;
  }

  public KeywordUpdateItem bid(Integer bid) {
    this.bid = JsonNullable.of(bid);
    return this;
  }

  /**
   * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   * @return bid
   */
  
  @Schema(name = "bid", description = "**Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid")
  public JsonNullable<Integer> getBid() {
    return bid;
  }

  public void setBid(JsonNullable<Integer> bid) {
    this.bid = bid;
  }

  public KeywordUpdateItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Keyword ID .
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "383791336903426391", description = "Keyword ID .", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordUpdateItem keywordUpdateItem = (KeywordUpdateItem) o;
    return Objects.equals(this.archived, keywordUpdateItem.archived) &&
        equalsNullable(this.bid, keywordUpdateItem.bid) &&
        Objects.equals(this.id, keywordUpdateItem.id);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(archived, hashCodeNullable(bid), id);
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
    sb.append("class KeywordUpdateItem {\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

