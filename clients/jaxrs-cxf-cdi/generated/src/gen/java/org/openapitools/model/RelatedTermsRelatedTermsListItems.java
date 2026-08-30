package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class RelatedTermsRelatedTermsListItems   {
  
  private List<String> relatedTerms = new ArrayList<>();

  private String term;

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

