package org.openapitools.model;

import org.openapitools.model.KeywordUpdateItem;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create or update operation model.
 */
public class KeywordsUpdate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Keywords
   */
  @JsonProperty("keywords")
  private List<KeywordUpdateItem> keywords = new ArrayList<>();

  /**
   * Keywords
   * @return keywords
   */
  public List<KeywordUpdateItem> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<KeywordUpdateItem> keywords) {
    this.keywords = keywords;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordsUpdate keywordsUpdate = (KeywordsUpdate) o;
    return Objects.equals(this.keywords, keywordsUpdate.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordsUpdate {\n");
    
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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
