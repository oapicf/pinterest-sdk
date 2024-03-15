package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordsCommon;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KeywordsRequest  {
  
 /**
  * Keyword JSON array. Each array element has 3 fields
  */
  @ApiModelProperty(required = true, value = "Keyword JSON array. Each array element has 3 fields")
  @Valid
  private List<@Valid KeywordsCommon> keywords = new ArrayList<>();

 /**
  * Keyword parent entity ID (advertiser, campaign, ad group).
  */
  @ApiModelProperty(example = "383791336903426391", required = true, value = "Keyword parent entity ID (advertiser, campaign, ad group).")
  private String parentId;
 /**
  * Keyword JSON array. Each array element has 3 fields
  * @return keywords
  */
  @JsonProperty("keywords")
  @NotNull
  public List<@Valid KeywordsCommon> getKeywords() {
    return keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
 public void setKeywords(List<@Valid KeywordsCommon> keywords) {
    this.keywords = keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
  public KeywordsRequest keywords(List<@Valid KeywordsCommon> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * Adds a new item to the <code>keywords</code> list.
   */
  public KeywordsRequest addKeywordsItem(KeywordsCommon keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

 /**
  * Keyword parent entity ID (advertiser, campaign, ad group).
  * @return parentId
  */
  @JsonProperty("parent_id")
  @NotNull
 @Pattern(regexp="^((AG)|C)?\\d+$")  public String getParentId() {
    return parentId;
  }

  /**
   * Sets the <code>parentId</code> property.
   */
 public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * Sets the <code>parentId</code> property.
   */
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

