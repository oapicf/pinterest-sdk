package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchType;
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
 * Keyword
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Keyword {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean archived;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> bid = JsonNullable.<Integer>undefined();

  private String id;

  private JsonNullable<MatchType> matchType = JsonNullable.<MatchType>undefined();

  private String parentId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String parentType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String type;

  private String value;

  public Keyword() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Keyword(String id, MatchType matchType, String parentId, String value) {
    this.id = id;
    this.matchType = JsonNullable.of(matchType);
    this.parentId = parentId;
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

  @JsonProperty("archived")
  public void setArchived(@Nullable Boolean archived) {
    this.archived = archived;
  }

  public Keyword bid(Integer bid) {
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

  public Keyword id(String id) {
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

  public Keyword matchType(MatchType matchType) {
    this.matchType = JsonNullable.of(matchType);
    return this;
  }

  /**
   * Keyword [match type](/docs/api-features/targeting-overview/)
   * @return matchType
   */
  @NotNull @Valid 
  @Schema(name = "match_type", description = "Keyword [match type](/docs/api-features/targeting-overview/)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("match_type")
  public JsonNullable<MatchType> getMatchType() {
    return matchType;
  }

  @JsonProperty("match_type")
  public void setMatchType(JsonNullable<MatchType> matchType) {
    this.matchType = matchType;
  }

  public Keyword parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   * @return parentId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "parent_id", accessMode = Schema.AccessMode.READ_ONLY, example = "383791336903426391", description = "Keyword parent entity ID (advertiser, campaign, ad group).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }

  @JsonProperty("parent_id")
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Keyword parentType(@Nullable String parentType) {
    this.parentType = parentType;
    return this;
  }

  /**
   * Parent entity type (advertiser, campaign, ad group).
   * @return parentType
   */
  
  @Schema(name = "parent_type", accessMode = Schema.AccessMode.READ_ONLY, example = "campaign", description = "Parent entity type (advertiser, campaign, ad group).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parent_type")
  public @Nullable String getParentType() {
    return parentType;
  }

  @JsonProperty("parent_type")
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
  
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, example = "keyword", description = "Always keyword", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable String type) {
    this.type = type;
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

  @JsonProperty("value")
  public void setValue(String value) {
    this.value = value;
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
    return Objects.equals(this.archived, keyword.archived) &&
        equalsNullable(this.bid, keyword.bid) &&
        Objects.equals(this.id, keyword.id) &&
        Objects.equals(this.matchType, keyword.matchType) &&
        Objects.equals(this.parentId, keyword.parentId) &&
        Objects.equals(this.parentType, keyword.parentType) &&
        Objects.equals(this.type, keyword.type) &&
        Objects.equals(this.value, keyword.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(archived, hashCodeNullable(bid), id, matchType, parentId, parentType, type, value);
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
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

