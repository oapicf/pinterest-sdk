package apimodels;

import apimodels.KeywordsCommon;
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
 * KeywordsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class KeywordsRequest   {
  @JsonProperty("keywords")
  @NotNull
@Valid

  private List<@Valid KeywordsCommon> keywords = new ArrayList<>();

  @JsonProperty("parent_id")
  @NotNull
@Pattern(regexp="^((AG)|C)?\\d+$")

  private String parentId;

  public KeywordsRequest keywords(List<@Valid KeywordsCommon> keywords) {
    this.keywords = keywords;
    return this;
  }

  public KeywordsRequest addKeywordsItem(KeywordsCommon keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Keyword JSON array. Each array element has 3 fields
   * @return keywords
  **/
  public List<@Valid KeywordsCommon> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<@Valid KeywordsCommon> keywords) {
    this.keywords = keywords;
  }

  public KeywordsRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   * @return parentId
  **/
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
    KeywordsRequest keywordsRequest = (KeywordsRequest) o;
    return Objects.equals(keywords, keywordsRequest.keywords) &&
        Objects.equals(parentId, keywordsRequest.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, parentId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordsRequest {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

