package org.openapitools.model;

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
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("RelatedTermsRelatedTermsListItems")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RelatedTermsRelatedTermsListItems   {
  private @Valid List<String> relatedTerms = new ArrayList<>();
  private String term;

  public RelatedTermsRelatedTermsListItems() {
  }

  /**
   **/
  public RelatedTermsRelatedTermsListItems relatedTerms(List<String> relatedTerms) {
    this.relatedTerms = relatedTerms;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("related_terms")
  public List<String> getRelatedTerms() {
    return relatedTerms;
  }

  @JsonProperty("related_terms")
  public void setRelatedTerms(List<String> relatedTerms) {
    this.relatedTerms = relatedTerms;
  }

  public RelatedTermsRelatedTermsListItems addRelatedTermsItem(String relatedTermsItem) {
    if (this.relatedTerms == null) {
      this.relatedTerms = new ArrayList<>();
    }

    this.relatedTerms.add(relatedTermsItem);
    return this;
  }

  public RelatedTermsRelatedTermsListItems removeRelatedTermsItem(String relatedTermsItem) {
    if (relatedTermsItem != null && this.relatedTerms != null) {
      this.relatedTerms.remove(relatedTermsItem);
    }

    return this;
  }
  /**
   **/
  public RelatedTermsRelatedTermsListItems term(String term) {
    this.term = term;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }

  @JsonProperty("term")
  public void setTerm(String term) {
    this.term = term;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedTermsRelatedTermsListItems relatedTermsRelatedTermsListItems = (RelatedTermsRelatedTermsListItems) o;
    return Objects.equals(this.relatedTerms, relatedTermsRelatedTermsListItems.relatedTerms) &&
        Objects.equals(this.term, relatedTermsRelatedTermsListItems.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedTerms, term);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedTermsRelatedTermsListItems {\n");
    
    sb.append("    relatedTerms: ").append(toIndentedString(relatedTerms)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
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
