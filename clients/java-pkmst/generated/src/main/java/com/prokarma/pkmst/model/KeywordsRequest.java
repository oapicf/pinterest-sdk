package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.KeywordsCommon;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * KeywordsRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class KeywordsRequest   {
  @JsonProperty("keywords")
  
  private List<KeywordsCommon> keywords = new ArrayList<>();

  @JsonProperty("parent_id")
  private String parentId;

  public KeywordsRequest keywords(List<KeywordsCommon> keywords) {
    this.keywords = keywords;
    return this;
  }

  public KeywordsRequest addKeywordsItem(KeywordsCommon keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Keyword JSON array. Each array element has 3 fields
   * @return keywords
  **/
  @ApiModelProperty(required = true, value = "Keyword JSON array. Each array element has 3 fields")
  public List<KeywordsCommon> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<KeywordsCommon> keywords) {
    this.keywords = keywords;
  }

  public KeywordsRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   * @return parentId
  **/
  @ApiModelProperty(example = "383791336903426391", required = true, value = "Keyword parent entity ID (advertiser, campaign, ad group).")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

