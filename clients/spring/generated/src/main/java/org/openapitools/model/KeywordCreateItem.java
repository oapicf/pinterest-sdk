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
 * KeywordCreateItem
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeywordCreateItem {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> bid = JsonNullable.<Integer>undefined();

  private JsonNullable<MatchType> matchType = JsonNullable.<MatchType>undefined();

  private String value;

  public KeywordCreateItem() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public KeywordCreateItem(MatchType matchType, String value) {
    this.matchType = JsonNullable.of(matchType);
    this.value = value;
  }

  public KeywordCreateItem bid(Integer bid) {
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

  public KeywordCreateItem matchType(MatchType matchType) {
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

  public KeywordCreateItem value(String value) {
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
    KeywordCreateItem keywordCreateItem = (KeywordCreateItem) o;
    return equalsNullable(this.bid, keywordCreateItem.bid) &&
        Objects.equals(this.matchType, keywordCreateItem.matchType) &&
        Objects.equals(this.value, keywordCreateItem.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(bid), matchType, value);
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
    sb.append("class KeywordCreateItem {\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
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

