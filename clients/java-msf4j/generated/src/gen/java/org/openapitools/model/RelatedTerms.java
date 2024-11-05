package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RelatedTermsRelatedTermsListInner;

/**
 * RelatedTerms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RelatedTerms   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("related_term_count")
  private Integer relatedTermCount;

  @JsonProperty("related_terms_list")
  private List<@Valid RelatedTermsRelatedTermsListInner> relatedTermsList = null;

  public RelatedTerms id(String id) {
    this.id = id;
    return this;
  }

   /**
   * First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
   * @return id
  **/
  @ApiModelProperty(example = "clothes", value = "First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"")
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
  @ApiModelProperty(example = "2", value = "Total number of related terms returned")
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
  @ApiModelProperty(value = "The id of the advertiser.")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

