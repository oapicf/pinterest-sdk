package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordCreateItem;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "KeywordsCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class KeywordsCreate {

  private List<@Valid KeywordCreateItem> keywords = new ArrayList<>();

  private String parentId;

  public KeywordsCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public KeywordsCreate(List<@Valid KeywordCreateItem> keywords, String parentId) {
    this.keywords = keywords;
    this.parentId = parentId;
  }

  public KeywordsCreate keywords(List<@Valid KeywordCreateItem> keywords) {
    this.keywords = keywords;
    return this;
  }

  public KeywordsCreate addKeywordsItem(KeywordCreateItem keywordsItem) {
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
  public List<@Valid KeywordCreateItem> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
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
   */
  @NotNull 
  @Schema(name = "parent_id", description = "Keyword data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }

  @JsonProperty("parent_id")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

