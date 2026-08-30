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
 * Keywords
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Keywords   {
  @JsonProperty("errors")
  @NotNull
@Valid

  private List<@Valid KeywordError> errors = new ArrayList<>();

  @JsonProperty("keywords")
  @NotNull
@Valid

  private List<@Valid Keyword> keywords = new ArrayList<>();

  public Keywords errors(List<@Valid KeywordError> errors) {
    this.errors = errors;
    return this;
  }

  public Keywords addErrorsItem(KeywordError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Keyword error
   * @return errors
  **/
  public List<@Valid KeywordError> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid KeywordError> errors) {
    this.errors = errors;
  }

  public Keywords keywords(List<@Valid Keyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public Keywords addKeywordsItem(Keyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Keywords
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
    Keywords keywords = (Keywords) o;
    return Objects.equals(errors, keywords.errors) &&
        Objects.equals(keywords, keywords.keywords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, keywords);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

