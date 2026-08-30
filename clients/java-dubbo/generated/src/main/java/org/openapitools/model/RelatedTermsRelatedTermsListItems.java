package org.openapitools.model;

import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class RelatedTermsRelatedTermsListItems implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("related_terms")
  private List<String> relatedTerms = new ArrayList<>();

  @JsonProperty("term")
  private String term;

  /**
   * 
   * @return relatedTerms
   */
  public List<String> getRelatedTerms() {
    return relatedTerms;
  }

  public void setRelatedTerms(List<String> relatedTerms) {
    this.relatedTerms = relatedTerms;
  }

  /**
   * 
   * @return term
   */
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
