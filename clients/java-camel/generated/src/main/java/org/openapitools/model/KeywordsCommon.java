package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchTypeResponse;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * KeywordsCommon
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class KeywordsCommon {

  private JsonNullable<Integer> bid = JsonNullable.<Integer>undefined();

  private JsonNullable<MatchTypeResponse> matchType = JsonNullable.<MatchTypeResponse>undefined();

  private String value;

  public KeywordsCommon() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public KeywordsCommon(MatchTypeResponse matchType, String value) {
    this.matchType = JsonNullable.of(matchType);
    this.value = value;
  }

  public KeywordsCommon bid(Integer bid) {
    this.bid = JsonNullable.of(bid);
    return this;
  }

  /**
   * Keyword custom bid in microcurrency - null if inherited from parent ad group.
   * @return bid
  */
  
  @Schema(name = "bid", example = "200000", description = "Keyword custom bid in microcurrency - null if inherited from parent ad group.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid")
  public JsonNullable<Integer> getBid() {
    return bid;
  }

  public void setBid(JsonNullable<Integer> bid) {
    this.bid = bid;
  }

  public KeywordsCommon matchType(MatchTypeResponse matchType) {
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

  public KeywordsCommon value(String value) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordsCommon keywordsCommon = (KeywordsCommon) o;
    return equalsNullable(this.bid, keywordsCommon.bid) &&
        Objects.equals(this.matchType, keywordsCommon.matchType) &&
        Objects.equals(this.value, keywordsCommon.value);
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
    sb.append("class KeywordsCommon {\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

