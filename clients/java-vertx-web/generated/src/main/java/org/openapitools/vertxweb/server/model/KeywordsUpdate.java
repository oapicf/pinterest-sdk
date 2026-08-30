package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.KeywordUpdateItem;

/**
 * Resource create or update operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeywordsUpdate   {
  
  private List<KeywordUpdateItem> keywords = new ArrayList<>();

  public KeywordsUpdate () {

  }

  public KeywordsUpdate (List<KeywordUpdateItem> keywords) {
    this.keywords = keywords;
  }

    
  @JsonProperty("keywords")
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
    return Objects.equals(keywords, keywordsUpdate.keywords);
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
