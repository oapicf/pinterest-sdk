package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RelatedTermsRelatedTermsListInner  {
  
  @ApiModelProperty(example = "clothes", value = "")
  private String term;

  @ApiModelProperty(example = "[\"shoes\",\"cute clothes\"]", value = "")
  private List<String> relatedTerms;
 /**
  * Get term
  * @return term
  */
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }

  /**
   * Sets the <code>term</code> property.
   */
 public void setTerm(String term) {
    this.term = term;
  }

  /**
   * Sets the <code>term</code> property.
   */
  public RelatedTermsRelatedTermsListInner term(String term) {
    this.term = term;
    return this;
  }

 /**
  * Get relatedTerms
  * @return relatedTerms
  */
  @JsonProperty("related_terms")
  public List<String> getRelatedTerms() {
    return relatedTerms;
  }

  /**
   * Sets the <code>relatedTerms</code> property.
   */
 public void setRelatedTerms(List<String> relatedTerms) {
    this.relatedTerms = relatedTerms;
  }

  /**
   * Sets the <code>relatedTerms</code> property.
   */
  public RelatedTermsRelatedTermsListInner relatedTerms(List<String> relatedTerms) {
    this.relatedTerms = relatedTerms;
    return this;
  }

  /**
   * Adds a new item to the <code>relatedTerms</code> list.
   */
  public RelatedTermsRelatedTermsListInner addRelatedTermsItem(String relatedTermsItem) {
    this.relatedTerms.add(relatedTermsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

