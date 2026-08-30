package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Keyword;
import org.openapitools.model.KeywordError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Keywords
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Keywords {

  @Valid
  private List<@Valid KeywordError> errors = new ArrayList<>();

  @Valid
  private List<@Valid Keyword> keywords = new ArrayList<>();

  public Keywords() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Keywords(List<@Valid KeywordError> errors, List<@Valid Keyword> keywords) {
    this.errors = errors;
    this.keywords = keywords;
  }

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
   */
  @Valid 
  @Schema(name = "errors", accessMode = Schema.AccessMode.READ_ONLY, description = "Keyword error", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errors")
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
   */
  @NotNull @Valid 
  @Schema(name = "keywords", description = "Keywords", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("keywords")
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

