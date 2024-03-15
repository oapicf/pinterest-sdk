package apimodels;

import apimodels.Keyword;
import apimodels.KeywordError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * KeywordsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class KeywordsResponse   {
  @JsonProperty("errors")
  @Valid

  private List<@Valid KeywordError> errors = null;

  @JsonProperty("keywords")
  @Valid

  private List<@Valid Keyword> keywords = null;

  public KeywordsResponse errors(List<@Valid KeywordError> errors) {
    this.errors = errors;
    return this;
  }

  public KeywordsResponse addErrorsItem(KeywordError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  public List<@Valid KeywordError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid KeywordError> errors) {
    this.errors = errors;
  }

  public KeywordsResponse keywords(List<@Valid Keyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public KeywordsResponse addKeywordsItem(Keyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  public List<@Valid Keyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<@Valid Keyword> keywords) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

