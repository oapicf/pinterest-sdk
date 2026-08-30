package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordUpdateItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create or update operation model.
 */
@ApiModel(description="Resource create or update operation model.")

public class KeywordsUpdate  {
  
 /**
  * Keywords
  */
  @ApiModelProperty(value = "Keywords")

  @Valid

  private List<@Valid KeywordUpdateItem> keywords = new ArrayList<>();
 /**
   * Keywords
   * @return keywords
  **/
  @JsonProperty("keywords")
  public List<@Valid KeywordUpdateItem> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<@Valid KeywordUpdateItem> keywords) {
    this.keywords = keywords;
  }

  public KeywordsUpdate keywords(List<@Valid KeywordUpdateItem> keywords) {
    this.keywords = keywords;
    return this;
  }

  public KeywordsUpdate addKeywordsItem(KeywordUpdateItem keywordsItem) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

