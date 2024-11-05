package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("RelatedTerms_related_terms_list_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RelatedTermsRelatedTermsListInner   {
  private String term;
  private @Valid List<String> relatedTerms = new ArrayList<>();

  /**
   **/
  public RelatedTermsRelatedTermsListInner term(String term) {
    this.term = term;
    return this;
  }

  
  @ApiModelProperty(example = "clothes", value = "")
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }

  @JsonProperty("term")
  public void setTerm(String term) {
    this.term = term;
  }

  /**
   **/
  public RelatedTermsRelatedTermsListInner relatedTerms(List<String> relatedTerms) {
    this.relatedTerms = relatedTerms;
    return this;
  }

  
  @ApiModelProperty(example = "[\"shoes\",\"cute clothes\"]", value = "")
  @JsonProperty("related_terms")
  public List<String> getRelatedTerms() {
    return relatedTerms;
  }

  @JsonProperty("related_terms")
  public void setRelatedTerms(List<String> relatedTerms) {
    this.relatedTerms = relatedTerms;
  }

  public RelatedTermsRelatedTermsListInner addRelatedTermsItem(String relatedTermsItem) {
    if (this.relatedTerms == null) {
      this.relatedTerms = new ArrayList<>();
    }

    this.relatedTerms.add(relatedTermsItem);
    return this;
  }

  public RelatedTermsRelatedTermsListInner removeRelatedTermsItem(String relatedTermsItem) {
    if (relatedTermsItem != null && this.relatedTerms != null) {
      this.relatedTerms.remove(relatedTermsItem);
    }

    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedTermsRelatedTermsListInner relatedTermsRelatedTermsListInner = (RelatedTermsRelatedTermsListInner) o;
    return Objects.equals(this.term, relatedTermsRelatedTermsListInner.term) &&
        Objects.equals(this.relatedTerms, relatedTermsRelatedTermsListInner.relatedTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(term, relatedTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedTermsRelatedTermsListInner {\n");
    
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    relatedTerms: ").append(toIndentedString(relatedTerms)).append("\n");
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

