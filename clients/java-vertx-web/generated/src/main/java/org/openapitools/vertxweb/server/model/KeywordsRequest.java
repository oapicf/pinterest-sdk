package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.KeywordsCommon;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeywordsRequest   {
  
  private List<KeywordsCommon> keywords = new ArrayList<>();
  private String parentId;

  public KeywordsRequest () {

  }

  public KeywordsRequest (List<KeywordsCommon> keywords, String parentId) {
    this.keywords = keywords;
    this.parentId = parentId;
  }

    
  @JsonProperty("keywords")
  public List<KeywordsCommon> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<KeywordsCommon> keywords) {
    this.keywords = keywords;
  }

    
  @JsonProperty("parent_id")
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
    return Objects.equals(keywords, keywordsRequest.keywords) &&
        Objects.equals(parentId, keywordsRequest.parentId);
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
