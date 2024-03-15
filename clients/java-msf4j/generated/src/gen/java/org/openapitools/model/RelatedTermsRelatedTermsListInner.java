package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * RelatedTermsRelatedTermsListInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RelatedTermsRelatedTermsListInner   {
  @JsonProperty("term")
  private String term;

  @JsonProperty("related_terms")
  private List<String> relatedTerms = null;

  public RelatedTermsRelatedTermsListInner term(String term) {
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @ApiModelProperty(example = "clothes", value = "")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public RelatedTermsRelatedTermsListInner relatedTerms(List<String> relatedTerms) {
    this.relatedTerms = relatedTerms;
    return this;
  }

  public RelatedTermsRelatedTermsListInner addRelatedTermsItem(String relatedTermsItem) {
    if (this.relatedTerms == null) {
      this.relatedTerms = ;
    }
    this.relatedTerms.add(relatedTermsItem);
    return this;
  }

   /**
   * Get relatedTerms
   * @return relatedTerms
  **/
  @ApiModelProperty(example = "[\"shoes\",\"cute clothes\"]", value = "")
  public List<String> getRelatedTerms() {
    return relatedTerms;
  }

  public void setRelatedTerms(List<String> relatedTerms) {
    this.relatedTerms = relatedTerms;
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

