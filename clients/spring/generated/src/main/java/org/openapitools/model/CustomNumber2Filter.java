package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsProductGroupUint32Criteria;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CustomNumber2Filter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CustomNumber2Filter {

  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2;

  public CustomNumber2Filter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomNumber2Filter(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
  }

  public CustomNumber2Filter CUSTOM_NUMBER_2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
    return this;
  }

  /**
   * Get CUSTOM_NUMBER_2
   * @return CUSTOM_NUMBER_2
   */
  @NotNull @Valid 
  @Schema(name = "CUSTOM_NUMBER_2", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CUSTOM_NUMBER_2")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER2() {
    return CUSTOM_NUMBER_2;
  }

  public void setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNumber2Filter customNumber2Filter = (CustomNumber2Filter) o;
    return Objects.equals(this.CUSTOM_NUMBER_2, customNumber2Filter.CUSTOM_NUMBER_2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_NUMBER_2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNumber2Filter {\n");
    sb.append("    CUSTOM_NUMBER_2: ").append(toIndentedString(CUSTOM_NUMBER_2)).append("\n");
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

