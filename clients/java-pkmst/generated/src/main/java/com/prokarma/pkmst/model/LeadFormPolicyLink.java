package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * LeadFormPolicyLink
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadFormPolicyLink   {
  @JsonProperty("label")
  private String label;

  @JsonProperty("link")
  private String link;

  public LeadFormPolicyLink label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Policy label for an additional policy link.
   * @return label
   */
  @ApiModelProperty(value = "Policy label for an additional policy link.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public LeadFormPolicyLink link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Policy link for an additional policy link.
   * @return link
   */
  @ApiModelProperty(value = "Policy link for an additional policy link.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

