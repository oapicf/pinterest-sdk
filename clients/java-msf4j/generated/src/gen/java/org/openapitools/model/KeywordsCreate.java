package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordCreateItem;

/**
 * Resource create operation model.
 */
@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeywordsCreate   {
  @JsonProperty("keywords")
  private List<@Valid KeywordCreateItem> keywords = new ArrayList<>();

  @JsonProperty("parent_id")
  private String parentId;

  public KeywordsCreate keywords(List<@Valid KeywordCreateItem> keywords) {
    this.keywords = keywords;
    return this;
  }

  public KeywordsCreate addKeywordsItem(KeywordCreateItem keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Keywords
   * @return keywords
  **/
  @ApiModelProperty(required = true, value = "Keywords")
  public List<@Valid KeywordCreateItem> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<@Valid KeywordCreateItem> keywords) {
    this.keywords = keywords;
  }

  public KeywordsCreate parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Keyword data
   * @return parentId
  **/
  @ApiModelProperty(required = true, value = "Keyword data")
  public String getParentId() {
    return parentId;
  }

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

