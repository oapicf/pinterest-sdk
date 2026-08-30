package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Keyword;
import org.openapitools.model.KeywordError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Keywords  {
  
 /**
  * Keyword error
  */
  @ApiModelProperty(required = true, value = "Keyword error")
  @Valid
  private List<@Valid KeywordError> errors = new ArrayList<>();

 /**
  * Keywords
  */
  @ApiModelProperty(required = true, value = "Keywords")
  @Valid
  private List<@Valid Keyword> keywords = new ArrayList<>();
 /**
  * Keyword error
  * @return errors
  */
  @JsonProperty("errors")
  @NotNull
  public List<@Valid KeywordError> getErrors() {
    return errors;
  }

  /**
   * Sets the <code>errors</code> property.
   * <br><em>N.B. <code>errors</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setErrors(List<@Valid KeywordError> errors) {
    this.errors = errors;
  }

  /**
   * Sets the <code>errors</code> property.
   * <br><em>N.B. <code>errors</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Keywords errors(List<@Valid KeywordError> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Adds a new item to the <code>errors</code> list.
   * <br><em>N.B. <code>errors</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Keywords addErrorsItem(KeywordError errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
  * Keywords
  * @return keywords
  */
  @JsonProperty("keywords")
  @NotNull
  public List<@Valid Keyword> getKeywords() {
    return keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
 public void setKeywords(List<@Valid Keyword> keywords) {
    this.keywords = keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
  public Keywords keywords(List<@Valid Keyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * Adds a new item to the <code>keywords</code> list.
   */
  public Keywords addKeywordsItem(Keyword keywordsItem) {
    this.keywords.add(keywordsItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

