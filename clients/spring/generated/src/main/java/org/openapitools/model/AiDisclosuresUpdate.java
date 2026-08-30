package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AiDisclosureItem;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AI disclosure declarations the creator has made about the Pin.
 */

@Schema(name = "AiDisclosuresUpdate", description = "AI disclosure declarations the creator has made about the Pin.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AiDisclosuresUpdate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<AiDisclosureItem> values = new ArrayList<>();

  public AiDisclosuresUpdate values(List<AiDisclosureItem> values) {
    this.values = values;
    return this;
  }

  public AiDisclosuresUpdate addValuesItem(AiDisclosureItem valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * List of AI disclosure declarations the creator has made about this Pin.
   * @return values
   */
  @Valid 
  @Schema(name = "values", description = "List of AI disclosure declarations the creator has made about this Pin.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public List<AiDisclosureItem> getValues() {
    return values;
  }

  @JsonProperty("values")
  public void setValues(List<AiDisclosureItem> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiDisclosuresUpdate aiDisclosuresUpdate = (AiDisclosuresUpdate) o;
    return Objects.equals(this.values, aiDisclosuresUpdate.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiDisclosuresUpdate {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

