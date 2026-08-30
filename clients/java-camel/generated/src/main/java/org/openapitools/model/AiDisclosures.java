package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AiDisclosureItem;
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

@Schema(name = "AiDisclosures", description = "AI disclosure declarations the creator has made about the Pin.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AiDisclosures {

  @Valid
  private List<AiDisclosureItem> values = new ArrayList<>();

  public AiDisclosures() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AiDisclosures(List<AiDisclosureItem> values) {
    this.values = values;
  }

  public AiDisclosures values(List<AiDisclosureItem> values) {
    this.values = values;
    return this;
  }

  public AiDisclosures addValuesItem(AiDisclosureItem valuesItem) {
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
  @NotNull @Valid 
  @Schema(name = "values", description = "List of AI disclosure declarations the creator has made about this Pin.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("values")
  public List<AiDisclosureItem> getValues() {
    return values;
  }

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
    AiDisclosures aiDisclosures = (AiDisclosures) o;
    return Objects.equals(this.values, aiDisclosures.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiDisclosures {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

