/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RelatedTerms   {
  
  private String id;
  private Integer relatedTermCount;
  private List<RelatedTermsRelatedTermsListInner> relatedTermsList = new ArrayList<>();

  /**
   * First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
   */
  public RelatedTerms id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "clothes", value = "First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Total number of related terms returned
   */
  public RelatedTerms relatedTermCount(Integer relatedTermCount) {
    this.relatedTermCount = relatedTermCount;
    return this;
  }

  
  @ApiModelProperty(example = "2", value = "Total number of related terms returned")
  @JsonProperty("related_term_count")
  public Integer getRelatedTermCount() {
    return relatedTermCount;
  }
  public void setRelatedTermCount(Integer relatedTermCount) {
    this.relatedTermCount = relatedTermCount;
  }

  /**
   * The id of the advertiser.
   */
  public RelatedTerms relatedTermsList(List<RelatedTermsRelatedTermsListInner> relatedTermsList) {
    this.relatedTermsList = relatedTermsList;
    return this;
  }

  
  @ApiModelProperty(value = "The id of the advertiser.")
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

