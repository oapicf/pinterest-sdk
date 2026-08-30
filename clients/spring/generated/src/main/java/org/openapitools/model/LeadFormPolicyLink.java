package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LeadFormPolicyLink
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadFormPolicyLink {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String label;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String link;

  public LeadFormPolicyLink label(@Nullable String label) {
    this.label = label;
    return this;
  }

  /**
   * Policy label for an additional policy link.
   * @return label
   */
  
  @Schema(name = "label", description = "Policy label for an additional policy link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public @Nullable String getLabel() {
    return label;
  }

  @JsonProperty("label")
  public void setLabel(@Nullable String label) {
    this.label = label;
  }

  public LeadFormPolicyLink link(@Nullable String link) {
    this.link = link;
    return this;
  }

  /**
   * Policy link for an additional policy link.
   * @return link
   */
  
  @Schema(name = "link", description = "Policy link for an additional policy link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public @Nullable String getLink() {
    return link;
  }

  @JsonProperty("link")
  public void setLink(@Nullable String link) {
    this.link = link;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormPolicyLink leadFormPolicyLink = (LeadFormPolicyLink) o;
    return Objects.equals(this.label, leadFormPolicyLink.label) &&
        Objects.equals(this.link, leadFormPolicyLink.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormPolicyLink {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

