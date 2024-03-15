package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordsCommon;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KeywordsRequest  {
  
  @ApiModelProperty(required = true, value = "Keyword JSON array. Each array element has 3 fields")
 /**
   * Keyword JSON array. Each array element has 3 fields
  **/
  private List<KeywordsCommon> keywords = new ArrayList<>();

  @ApiModelProperty(example = "383791336903426391", required = true, value = "Keyword parent entity ID (advertiser, campaign, ad group).")
 /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
  **/
  private String parentId;
 /**
   * Keyword JSON array. Each array element has 3 fields
   * @return keywords
  **/
  @JsonProperty("keywords")
  public List<KeywordsCommon> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<KeywordsCommon> keywords) {
    this.keywords = keywords;
  }

  public KeywordsRequest keywords(List<KeywordsCommon> keywords) {
    this.keywords = keywords;
    return this;
  }

  public KeywordsRequest addKeywordsItem(KeywordsCommon keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

 /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   * @return parentId
  **/
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public KeywordsRequest parentId(String parentId) {
    this.parentId = parentId;
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
    KeywordsRequest keywordsRequest = (KeywordsRequest) o;
    return Objects.equals(this.keywords, keywordsRequest.keywords) &&
        Objects.equals(this.parentId, keywordsRequest.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordsRequest {\n");
    
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

