package org.openapitools.model;

import org.openapitools.model.Keyword;
import org.openapitools.model.KeywordError;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class Keywords implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Keyword error
   */
  @JsonProperty("errors")
  private List<KeywordError> errors = new ArrayList<>();

  /**
   * Keywords
   */
  @JsonProperty("keywords")
  private List<Keyword> keywords = new ArrayList<>();

  /**
   * Keyword error
   * @return errors
   */
  public List<KeywordError> getErrors() {
    return errors;
  }

  public void setErrors(List<KeywordError> errors) {
    this.errors = errors;
  }

  /**
   * Keywords
   * @return keywords
   */
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
    Keywords keywords = (Keywords) o;
    return Objects.equals(this.errors, keywords.errors) &&
        Objects.equals(this.keywords, keywords.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, keywords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Keywords {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
