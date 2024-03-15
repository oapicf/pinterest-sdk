package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KeywordsCommon;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class KeywordsRequest   {
  
  private List<@Valid KeywordsCommon> keywords = new ArrayList<>();
  private String parentId;

  /**
   * Keyword JSON array. Each array element has 3 fields
   **/
  
  @ApiModelProperty(required = true, value = "Keyword JSON array. Each array element has 3 fields")
  @JsonProperty("keywords")
  @NotNull
  public List<@Valid KeywordsCommon> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<@Valid KeywordsCommon> keywords) {
    this.keywords = keywords;
  }

  /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   **/
  
  @ApiModelProperty(example = "383791336903426391", required = true, value = "Keyword parent entity ID (advertiser, campaign, ad group).")
  @JsonProperty("parent_id")
  @NotNull
 @Pattern(regexp="^((AG)|C)?\\d+$")  public String getParentId() {
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
    return Objects.equals(this.keywords, keywordsRequest.keywords) &&
        Objects.equals(this.parentId, keywordsRequest.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywords, parentId);
  }

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

