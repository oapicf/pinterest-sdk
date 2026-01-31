package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchTypeResponse;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Keyword
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-26T05:48:22.520185154Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Keyword {

  private JsonNullable<Integer> bid = JsonNullable.<Integer>undefined();

  private JsonNullable<MatchTypeResponse> matchType = JsonNullable.<MatchTypeResponse>undefined();

  private String value;

  private @Nullable Boolean archived;

  private @Nullable String id;

  private @Nullable String parentId;

  private @Nullable String parentType;

  private @Nullable String type;

  public Keyword() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Keyword(MatchTypeResponse matchType, String value) {
    this.matchType = JsonNullable.of(matchType);
    this.value = value;
  }

  public Keyword bid(Integer bid) {
    this.bid = JsonNullable.of(bid);
    return this;
  }

  /**
   * </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   * @return bid
   */
  
  @Schema(name = "bid", description = "</p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid")
  public JsonNullable<Integer> getBid() {
    return bid;
  }

  public void setBid(JsonNullable<Integer> bid) {
    this.bid = bid;
  }

  public Keyword matchType(MatchTypeResponse matchType) {
    this.matchType = JsonNullable.of(matchType);
    return this;
  }

  /**
   * Get matchType
   * @return matchType
   */
  @NotNull @Valid 
  @Schema(name = "match_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("match_type")
  public JsonNullable<MatchTypeResponse> getMatchType() {
    return matchType;
  }

  public void setMatchType(JsonNullable<MatchTypeResponse> matchType) {
    this.matchType = matchType;
  }

  public Keyword value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Keyword value (120 chars max).
   * @return value
   */
  @NotNull 
  @Schema(name = "value", description = "Keyword value (120 chars max).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Keyword archived(@Nullable Boolean archived) {
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

  public void setArchived(@Nullable Boolean archived) {
    this.archived = archived;
  }

  public Keyword id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Keyword ID .
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "383791336903426391", description = "Keyword ID .", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public Keyword parentId(@Nullable String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   * @return parentId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "parent_id", example = "383791336903426391", description = "Keyword parent entity ID (advertiser, campaign, ad group).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_id")
  public @Nullable String getParentId() {
    return parentId;
  }

  public void setParentId(@Nullable String parentId) {
    this.parentId = parentId;
  }

  public Keyword parentType(@Nullable String parentType) {
    this.parentType = parentType;
    return this;
  }

  /**
   * Parent entity type
   * @return parentType
   */
  
  @Schema(name = "parent_type", example = "campaign", description = "Parent entity type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_type")
  public @Nullable String getParentType() {
    return parentType;
  }

  public void setParentType(@Nullable String parentType) {
    this.parentType = parentType;
  }

  public Keyword type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Always keyword
   * @return type
   */
  
  @Schema(name = "type", example = "keyword", description = "Always keyword", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Keyword keyword = (Keyword) o;
    return equalsNullable(this.bid, keyword.bid) &&
        Objects.equals(this.matchType, keyword.matchType) &&
        Objects.equals(this.value, keyword.value) &&
        Objects.equals(this.archived, keyword.archived) &&
        Objects.equals(this.id, keyword.id) &&
        Objects.equals(this.parentId, keyword.parentId) &&
        Objects.equals(this.parentType, keyword.parentType) &&
        Objects.equals(this.type, keyword.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(bid), matchType, value, archived, id, parentId, parentType, type);
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
    sb.append("class Keyword {\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

