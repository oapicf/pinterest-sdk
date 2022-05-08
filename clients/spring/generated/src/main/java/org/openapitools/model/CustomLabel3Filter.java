package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CustomLabel3Filter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-08T00:42:02.037116Z[Etc/UTC]")
public class CustomLabel3Filter   {

  @JsonProperty("CUSTOM_LABEL_3")
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3;

  public CustomLabel3Filter CUSTOM_LABEL_3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    return this;
  }

  /**
   * Get CUSTOM_LABEL_3
   * @return CUSTOM_LABEL_3
  */
  @NotNull @Valid 
  @Schema(name = "CUSTOM_LABEL_3", required = true)
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL3() {
    return CUSTOM_LABEL_3;
  }

  public void setCUSTOMLABEL3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomLabel3Filter customLabel3Filter = (CustomLabel3Filter) o;
    return Objects.equals(this.CUSTOM_LABEL_3, customLabel3Filter.CUSTOM_LABEL_3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_LABEL_3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomLabel3Filter {\n");
    sb.append("    CUSTOM_LABEL_3: ").append(toIndentedString(CUSTOM_LABEL_3)).append("\n");
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

