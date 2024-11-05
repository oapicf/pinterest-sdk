package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.RelatedTermsRelatedTermsListInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelatedTerms   {
  
  private String id;
  private Integer relatedTermCount;
  private List<RelatedTermsRelatedTermsListInner> relatedTermsList = new ArrayList<>();

  public RelatedTerms () {

  }

  public RelatedTerms (String id, Integer relatedTermCount, List<RelatedTermsRelatedTermsListInner> relatedTermsList) {
    this.id = id;
    this.relatedTermCount = relatedTermCount;
    this.relatedTermsList = relatedTermsList;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("related_term_count")
  public Integer getRelatedTermCount() {
    return relatedTermCount;
  }
  public void setRelatedTermCount(Integer relatedTermCount) {
    this.relatedTermCount = relatedTermCount;
  }

    
  @JsonProperty("related_terms_list")
  public List<RelatedTermsRelatedTermsListInner> getRelatedTermsList() {
    return relatedTermsList;
  }
  public void setRelatedTermsList(List<RelatedTermsRelatedTermsListInner> relatedTermsList) {
    this.relatedTermsList = relatedTermsList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedTerms relatedTerms = (RelatedTerms) o;
    return Objects.equals(id, relatedTerms.id) &&
        Objects.equals(relatedTermCount, relatedTerms.relatedTermCount) &&
        Objects.equals(relatedTermsList, relatedTerms.relatedTermsList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, relatedTermCount, relatedTermsList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedTerms {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relatedTermCount: ").append(toIndentedString(relatedTermCount)).append("\n");
    sb.append("    relatedTermsList: ").append(toIndentedString(relatedTermsList)).append("\n");
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
