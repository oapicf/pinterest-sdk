package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConversionDeletionRequestTargets;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "ConversionDeletionRequestCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionDeletionRequestCreate {

  private ConversionDeletionRequestTargets deletionTargets;

  public ConversionDeletionRequestCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionDeletionRequestCreate(ConversionDeletionRequestTargets deletionTargets) {
    this.deletionTargets = deletionTargets;
  }

  public ConversionDeletionRequestCreate deletionTargets(ConversionDeletionRequestTargets deletionTargets) {
    this.deletionTargets = deletionTargets;
    return this;
  }

  /**
   * Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
   * @return deletionTargets
   */
  @NotNull @Valid 
  @Schema(name = "deletion_targets", description = "Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deletion_targets")
  public ConversionDeletionRequestTargets getDeletionTargets() {
    return deletionTargets;
  }

  public void setDeletionTargets(ConversionDeletionRequestTargets deletionTargets) {
    this.deletionTargets = deletionTargets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionDeletionRequestCreate conversionDeletionRequestCreate = (ConversionDeletionRequestCreate) o;
    return Objects.equals(this.deletionTargets, conversionDeletionRequestCreate.deletionTargets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletionTargets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionDeletionRequestCreate {\n");
    sb.append("    deletionTargets: ").append(toIndentedString(deletionTargets)).append("\n");
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

