package org.openapitools.model;

import org.openapitools.model.RelatedTermsRelatedTermsListItems;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class RelatedTerms implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot;
   */
  @JsonProperty("id")
  private String id;

  /**
   * Total number of related terms returned
   */
  @JsonProperty("related_term_count")
  private Integer relatedTermCount;

  /**
   * The id of the advertiser.
   */
  @JsonProperty("related_terms_list")
  private List<RelatedTermsRelatedTermsListItems> relatedTermsList = new ArrayList<>();

  /**
   * First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot;
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Total number of related terms returned
   * @return relatedTermCount
   */
  public Integer getRelatedTermCount() {
    return relatedTermCount;
  }

  public void setRelatedTermCount(Integer relatedTermCount) {
    this.relatedTermCount = relatedTermCount;
  }

  /**
   * The id of the advertiser.
   * @return relatedTermsList
   */
  public List<RelatedTermsRelatedTermsListItems> getRelatedTermsList() {
    return relatedTermsList;
  }

  public void setRelatedTermsList(List<RelatedTermsRelatedTermsListItems> relatedTermsList) {
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
    return Objects.equals(this.id, relatedTerms.id) &&
        Objects.equals(this.relatedTermCount, relatedTerms.relatedTermCount) &&
        Objects.equals(this.relatedTermsList, relatedTerms.relatedTermsList);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
