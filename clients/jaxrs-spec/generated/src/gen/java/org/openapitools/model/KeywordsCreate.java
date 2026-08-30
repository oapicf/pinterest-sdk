package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordCreateItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("KeywordsCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeywordsCreate   {
  private @Valid List<@Valid KeywordCreateItem> keywords = new ArrayList<>();
  private String parentId;

  public KeywordsCreate() {
  }

  @JsonCreator
  public KeywordsCreate(
    @JsonProperty(required = true, value = "keywords") List<@Valid KeywordCreateItem> keywords,
    @JsonProperty(required = true, value = "parent_id") String parentId
  ) {
    this.keywords = keywords;
    this.parentId = parentId;
  }

  /**
   * Keywords
   **/
  public KeywordsCreate keywords(List<@Valid KeywordCreateItem> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Keywords")
  @JsonProperty(required = true, value = "keywords")
  @NotNull @Valid public List<@Valid KeywordCreateItem> getKeywords() {
    return keywords;
  }

  @JsonProperty(required = true, value = "keywords")
  public void setKeywords(List<@Valid KeywordCreateItem> keywords) {
    this.keywords = keywords;
  }

  public KeywordsCreate addKeywordsItem(KeywordCreateItem keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }

    this.keywords.add(keywordsItem);
    return this;
  }

  public KeywordsCreate removeKeywordsItem(KeywordCreateItem keywordsItem) {
    if (keywordsItem != null && this.keywords != null) {
      this.keywords.remove(keywordsItem);
    }

    return this;
  }
  /**
   * Keyword data
   **/
  public KeywordsCreate parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Keyword data")
  @JsonProperty(required = true, value = "parent_id")
  @NotNull public String getParentId() {
    return parentId;
  }

  @JsonProperty(required = true, value = "parent_id")
  public void setParentId(String parentId) {
    this.parentId = parentId;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
