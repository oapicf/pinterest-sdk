package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LeadFormCommonPolicyLinksInner
 */

@JsonTypeName("LeadFormCommon_policy_links_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadFormCommonPolicyLinksInner {

  private String label;

  private String link;

  public LeadFormCommonPolicyLinksInner label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Policy label for an additional policy link.
   * @return label
   */
  
  @Schema(name = "label", description = "Policy label for an additional policy link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LeadFormCommonPolicyLinksInner link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Policy link for an additional policy link.
   * @return link
   */
  
  @Schema(name = "link", description = "Policy link for an additional policy link.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
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
    LeadFormCommonPolicyLinksInner leadFormCommonPolicyLinksInner = (LeadFormCommonPolicyLinksInner) o;
    return Objects.equals(this.label, leadFormCommonPolicyLinksInner.label) &&
        Objects.equals(this.link, leadFormCommonPolicyLinksInner.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormCommonPolicyLinksInner {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

