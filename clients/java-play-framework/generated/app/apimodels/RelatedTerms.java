package apimodels;

import apimodels.RelatedTermsRelatedTermsListInner;
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
 * RelatedTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RelatedTerms   {
  @JsonProperty("id")
  
  private String id;

  @JsonProperty("related_term_count")
  
  private Integer relatedTermCount;

  @JsonProperty("related_terms_list")
  @Valid

  private List<@Valid RelatedTermsRelatedTermsListInner> relatedTermsList = null;

  public RelatedTerms id(String id) {
    this.id = id;
    return this;
  }

   /**
   * First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedTerms relatedTermCount(Integer relatedTermCount) {
    this.relatedTermCount = relatedTermCount;
    return this;
  }

   /**
   * Total number of related terms returned
   * @return relatedTermCount
  **/
  public Integer getRelatedTermCount() {
    return relatedTermCount;
  }

  public void setRelatedTermCount(Integer relatedTermCount) {
    this.relatedTermCount = relatedTermCount;
  }

  public RelatedTerms relatedTermsList(List<@Valid RelatedTermsRelatedTermsListInner> relatedTermsList) {
    this.relatedTermsList = relatedTermsList;
    return this;
  }

  public RelatedTerms addRelatedTermsListItem(RelatedTermsRelatedTermsListInner relatedTermsListItem) {
    if (this.relatedTermsList == null) {
      this.relatedTermsList = new ArrayList<>();
    }
    this.relatedTermsList.add(relatedTermsListItem);
    return this;
  }

   /**
   * The id of the advertiser.
   * @return relatedTermsList
  **/
  public List<@Valid RelatedTermsRelatedTermsListInner> getRelatedTermsList() {
    return relatedTermsList;
  }

  public void setRelatedTermsList(List<@Valid RelatedTermsRelatedTermsListInner> relatedTermsList) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

