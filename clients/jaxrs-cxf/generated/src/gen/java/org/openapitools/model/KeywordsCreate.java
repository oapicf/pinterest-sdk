package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordCreateItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class KeywordsCreate  {
  
 /**
  * Keywords
  */
  @ApiModelProperty(required = true, value = "Keywords")

  @Valid

  private List<@Valid KeywordCreateItem> keywords = new ArrayList<>();

 /**
  * Keyword data
  */
  @ApiModelProperty(required = true, value = "Keyword data")

  private String parentId;
 /**
   * Keywords
   * @return keywords
  **/
  @JsonProperty("keywords")
  @NotNull
  public List<@Valid KeywordCreateItem> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<@Valid KeywordCreateItem> keywords) {
    this.keywords = keywords;
  }

  public KeywordsCreate keywords(List<@Valid KeywordCreateItem> keywords) {
    this.keywords = keywords;
    return this;
  }

  public KeywordsCreate addKeywordsItem(KeywordCreateItem keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

 /**
   * Keyword data
   * @return parentId
  **/
  @JsonProperty("parent_id")
  @NotNull
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public KeywordsCreate parentId(String parentId) {
    this.parentId = parentId;
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
    KeywordsCreate keywordsCreate = (KeywordsCreate) o;
    return Objects.equals(this.keywords, keywordsCreate.keywords) &&
        Objects.equals(this.parentId, keywordsCreate.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordsCreate {\n");
    
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

