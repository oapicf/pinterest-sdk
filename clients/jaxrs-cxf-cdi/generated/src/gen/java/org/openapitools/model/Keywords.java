package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Keyword;
import org.openapitools.model.KeywordError;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class Keywords   {
  
  private List<@Valid KeywordError> errors = new ArrayList<>();

  private List<@Valid Keyword> keywords = new ArrayList<>();

  /**
   * Keyword error
   **/
  public Keywords errors(List<@Valid KeywordError> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Keyword error")
  @JsonProperty("errors")
  @NotNull
  public List<@Valid KeywordError> getErrors() {
    return errors;
  }
  public void setErrors(List<@Valid KeywordError> errors) {
    this.errors = errors;
  }

  public Keywords addErrorsItem(KeywordError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }


  /**
   * Keywords
   **/
  public Keywords keywords(List<@Valid Keyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Keywords")
  @JsonProperty("keywords")
  @NotNull
  public List<@Valid Keyword> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<@Valid Keyword> keywords) {
    this.keywords = keywords;
  }

  public Keywords addKeywordsItem(Keyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

