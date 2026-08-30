package org.openapitools.model;

import org.openapitools.model.KeywordsCommon;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class KeywordsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Keyword JSON array. Each array element has 3 fields
   */
  @JsonProperty("keywords")
  private List<KeywordsCommon> keywords = new ArrayList<>();

  /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   */
  @JsonProperty("parent_id")
  private String parentId;

  /**
   * Keyword JSON array. Each array element has 3 fields
   * @return keywords
   */
  public List<KeywordsCommon> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<KeywordsCommon> keywords) {
    this.keywords = keywords;
  }

  /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   * @return parentId
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
