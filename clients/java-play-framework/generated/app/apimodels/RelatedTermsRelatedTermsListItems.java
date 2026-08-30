package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RelatedTermsRelatedTermsListItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RelatedTermsRelatedTermsListItems   {
  @JsonProperty("related_terms")
  
  private List<String> relatedTerms = null;

  @JsonProperty("term")
  
  private String term;

  public RelatedTermsRelatedTermsListItems relatedTerms(List<String> relatedTerms) {
    this.relatedTerms = relatedTerms;
    return this;
  }

  public RelatedTermsRelatedTermsListItems addRelatedTermsItem(String relatedTermsItem) {
    if (this.relatedTerms == null) {
      this.relatedTerms = new ArrayList<>();
    }
    this.relatedTerms.add(relatedTermsItem);
    return this;
  }

   /**
   * Get relatedTerms
   * @return relatedTerms
  **/
  public List<String> getRelatedTerms() {
    return relatedTerms;
  }

  public void setRelatedTerms(List<String> relatedTerms) {
    this.relatedTerms = relatedTerms;
  }

  public RelatedTermsRelatedTermsListItems term(String term) {
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
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
    return Objects.equals(relatedTerms, relatedTermsRelatedTermsListItems.relatedTerms) &&
        Objects.equals(term, relatedTermsRelatedTermsListItems.term);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedTerms, term);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

