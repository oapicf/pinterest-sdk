package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoardUpdatePrivacy;
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
 * Resource create or update operation model.
 */

@Schema(name = "BoardWithUpdatePrivacyUpdate", description = "Resource create or update operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BoardWithUpdatePrivacyUpdate {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BoardUpdatePrivacy privacy;

  public BoardWithUpdatePrivacyUpdate description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", example = "My favorite summer recipes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public BoardWithUpdatePrivacyUpdate name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   *     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
   * @return name
   */
  
  @Schema(name = "name", example = "Summer recipes", description = "    Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public BoardWithUpdatePrivacyUpdate privacy(@Nullable BoardUpdatePrivacy privacy) {
    this.privacy = privacy;
    return this;
  }

  /**
   * Get privacy
   * @return privacy
   */
  @Valid 
  @Schema(name = "privacy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privacy")
  public @Nullable BoardUpdatePrivacy getPrivacy() {
    return privacy;
  }

  @JsonProperty("privacy")
  public void setPrivacy(@Nullable BoardUpdatePrivacy privacy) {
    this.privacy = privacy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardWithUpdatePrivacyUpdate boardWithUpdatePrivacyUpdate = (BoardWithUpdatePrivacyUpdate) o;
    return equalsNullable(this.description, boardWithUpdatePrivacyUpdate.description) &&
        Objects.equals(this.name, boardWithUpdatePrivacyUpdate.name) &&
        Objects.equals(this.privacy, boardWithUpdatePrivacyUpdate.privacy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(description), name, privacy);
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
    sb.append("class BoardWithUpdatePrivacyUpdate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
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

