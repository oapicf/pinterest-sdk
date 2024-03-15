package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RelatedTermsRelatedTermsListInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RelatedTerms  {
  
 /**
  * First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
  */
  @ApiModelProperty(example = "clothes", value = "First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"")
  private String id;

 /**
  * Total number of related terms returned
  */
  @ApiModelProperty(example = "2", value = "Total number of related terms returned")
  private Integer relatedTermCount;

 /**
  * The id of the advertiser.
  */
  @ApiModelProperty(value = "The id of the advertiser.")
  @Valid
  private List<@Valid RelatedTermsRelatedTermsListInner> relatedTermsList;
 /**
  * First input term. For example, if you pass \&quot;?terms&#x3D;clothes,workout\&quot;, then id will be \&quot;clothes\&quot;
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public RelatedTerms id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Total number of related terms returned
  * @return relatedTermCount
  */
  @JsonProperty("related_term_count")
  public Integer getRelatedTermCount() {
    return relatedTermCount;
  }

  /**
   * Sets the <code>relatedTermCount</code> property.
   */
 public void setRelatedTermCount(Integer relatedTermCount) {
    this.relatedTermCount = relatedTermCount;
  }

  /**
   * Sets the <code>relatedTermCount</code> property.
   */
  public RelatedTerms relatedTermCount(Integer relatedTermCount) {
    this.relatedTermCount = relatedTermCount;
    return this;
  }

 /**
  * The id of the advertiser.
  * @return relatedTermsList
  */
  @JsonProperty("related_terms_list")
  public List<@Valid RelatedTermsRelatedTermsListInner> getRelatedTermsList() {
    return relatedTermsList;
  }

  /**
   * Sets the <code>relatedTermsList</code> property.
   */
 public void setRelatedTermsList(List<@Valid RelatedTermsRelatedTermsListInner> relatedTermsList) {
    this.relatedTermsList = relatedTermsList;
  }

  /**
   * Sets the <code>relatedTermsList</code> property.
   */
  public RelatedTerms relatedTermsList(List<@Valid RelatedTermsRelatedTermsListInner> relatedTermsList) {
    this.relatedTermsList = relatedTermsList;
    return this;
  }

  /**
   * Adds a new item to the <code>relatedTermsList</code> list.
   */
  public RelatedTerms addRelatedTermsListItem(RelatedTermsRelatedTermsListInner relatedTermsListItem) {
    this.relatedTermsList.add(relatedTermsListItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

