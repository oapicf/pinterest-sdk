package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.Keyword;
import org.openapitools.vertxweb.server.model.KeywordError;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeywordsResponse   {
  
  private List<KeywordError> errors;
  private List<Keyword> keywords;

  public KeywordsResponse () {

  }

  public KeywordsResponse (List<KeywordError> errors, List<Keyword> keywords) {
    this.errors = errors;
    this.keywords = keywords;
  }

    
  @JsonProperty("errors")
  public List<KeywordError> getErrors() {
    return errors;
  }
  public void setErrors(List<KeywordError> errors) {
    this.errors = errors;
  }

    
  @JsonProperty("keywords")
  public List<Keyword> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<Keyword> keywords) {
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
    KeywordsResponse keywordsResponse = (KeywordsResponse) o;
    return Objects.equals(errors, keywordsResponse.errors) &&
        Objects.equals(keywords, keywordsResponse.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordsResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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
