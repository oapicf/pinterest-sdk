package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CustomLabel1Filter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomLabel1Filter {

  private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1;

  public CustomLabel1Filter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomLabel1Filter(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }

  public CustomLabel1Filter CUSTOM_LABEL_1(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    return this;
  }

  /**
   * Get CUSTOM_LABEL_1
   * @return CUSTOM_LABEL_1
   */
  @NotNull @Valid 
  @Schema(name = "CUSTOM_LABEL_1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CUSTOM_LABEL_1")
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL1() {
    return CUSTOM_LABEL_1;
  }

  @JsonProperty("CUSTOM_LABEL_1")
  public void setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomLabel1Filter customLabel1Filter = (CustomLabel1Filter) o;
    return Objects.equals(this.CUSTOM_LABEL_1, customLabel1Filter.CUSTOM_LABEL_1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_LABEL_1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomLabel1Filter {\n");
    sb.append("    CUSTOM_LABEL_1: ").append(toIndentedString(CUSTOM_LABEL_1)).append("\n");
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

