package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConversionDeletionRequestEPIKTargets
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionDeletionRequestEPIKTargets {

  private List<String> epiks = new ArrayList<>();

  public ConversionDeletionRequestEPIKTargets() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionDeletionRequestEPIKTargets(List<String> epiks) {
    this.epiks = epiks;
  }

  public ConversionDeletionRequestEPIKTargets epiks(List<String> epiks) {
    this.epiks = epiks;
    return this;
  }

  public ConversionDeletionRequestEPIKTargets addEpiksItem(String epiksItem) {
    if (this.epiks == null) {
      this.epiks = new ArrayList<>();
    }
    this.epiks.add(epiksItem);
    return this;
  }

  /**
   * Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
   * @return epiks
   */
  @NotNull @Size(min = 1) 
  @Schema(name = "epiks", description = "Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("epiks")
  public List<String> getEpiks() {
    return epiks;
  }

  @JsonProperty("epiks")
  public void setEpiks(List<String> epiks) {
    this.epiks = epiks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionDeletionRequestEPIKTargets conversionDeletionRequestEPIKTargets = (ConversionDeletionRequestEPIKTargets) o;
    return Objects.equals(this.epiks, conversionDeletionRequestEPIKTargets.epiks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(epiks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionDeletionRequestEPIKTargets {\n");
    sb.append("    epiks: ").append(toIndentedString(epiks)).append("\n");
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

