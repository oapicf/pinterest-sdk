package org.openapitools.model;

import org.openapitools.model.KeywordCreateItem;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class KeywordsCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Keywords
   */
  @JsonProperty("keywords")
  private List<KeywordCreateItem> keywords = new ArrayList<>();

  /**
   * Keyword data
   */
  @JsonProperty("parent_id")
  private String parentId;

  /**
   * Keywords
   * @return keywords
   */
  public List<KeywordCreateItem> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<KeywordCreateItem> keywords) {
    this.keywords = keywords;
  }

  /**
   * Keyword data
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
    KeywordsCreate keywordsCreate = (KeywordsCreate) o;
    return Objects.equals(this.keywords, keywordsCreate.keywords) &&
        Objects.equals(this.parentId, keywordsCreate.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordsCreate {\n");
    
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
