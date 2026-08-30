package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ScrollupGoalMetadata
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScrollupGoalMetadata {

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> scrollupGoalValueInMicroCurrency = JsonNullable.<String>undefined();

  public ScrollupGoalMetadata scrollupGoalValueInMicroCurrency(String scrollupGoalValueInMicroCurrency) {
    this.scrollupGoalValueInMicroCurrency = JsonNullable.of(scrollupGoalValueInMicroCurrency);
    return this;
  }

  /**
   * Get scrollupGoalValueInMicroCurrency
   * @return scrollupGoalValueInMicroCurrency
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "scrollup_goal_value_in_micro_currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scrollup_goal_value_in_micro_currency")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getScrollupGoalValueInMicroCurrency() {
    return scrollupGoalValueInMicroCurrency;
  }

  public void setScrollupGoalValueInMicroCurrency(JsonNullable<String> scrollupGoalValueInMicroCurrency) {
    this.scrollupGoalValueInMicroCurrency = scrollupGoalValueInMicroCurrency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScrollupGoalMetadata scrollupGoalMetadata = (ScrollupGoalMetadata) o;
    return equalsNullable(this.scrollupGoalValueInMicroCurrency, scrollupGoalMetadata.scrollupGoalValueInMicroCurrency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(scrollupGoalValueInMicroCurrency));
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
    sb.append("class ScrollupGoalMetadata {\n");
    sb.append("    scrollupGoalValueInMicroCurrency: ").append(toIndentedString(scrollupGoalValueInMicroCurrency)).append("\n");
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

