/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchTypeResponse;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Keyword   {
  
  private Boolean archived;
  private String id;
  private String parentId;
  private String parentType;
  private String type;
  private Integer bid;
  private MatchTypeResponse matchType;
  private String value;

  /**
   */
  public Keyword archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }
  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  /**
   * Keyword ID .
   */
  public Keyword id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "383791336903426391", value = "Keyword ID .")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   */
  public Keyword parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(example = "383791336903426391", value = "Keyword parent entity ID (advertiser, campaign, ad group).")
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * Parent entity type
   */
  public Keyword parentType(String parentType) {
    this.parentType = parentType;
    return this;
  }

  
  @ApiModelProperty(example = "campaign", value = "Parent entity type")
  @JsonProperty("parent_type")
  public String getParentType() {
    return parentType;
  }
  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  /**
   * Always keyword
   */
  public Keyword type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "keyword", value = "Always keyword")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Keyword custom bid in microcurrency - null if inherited from parent ad group.
   */
  public Keyword bid(Integer bid) {
    this.bid = bid;
    return this;
  }

  
  @ApiModelProperty(example = "200000", value = "Keyword custom bid in microcurrency - null if inherited from parent ad group.")
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }
  public void setBid(Integer bid) {
    this.bid = bid;
  }

  /**
   */
  public Keyword matchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("match_type")
  public MatchTypeResponse getMatchType() {
    return matchType;
  }
  public void setMatchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
  }

  /**
   * Keyword value (120 chars max).
   */
  public Keyword value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Keyword value (120 chars max).")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Keyword keyword = (Keyword) o;
    return Objects.equals(archived, keyword.archived) &&
        Objects.equals(id, keyword.id) &&
        Objects.equals(parentId, keyword.parentId) &&
        Objects.equals(parentType, keyword.parentType) &&
        Objects.equals(type, keyword.type) &&
        Objects.equals(bid, keyword.bid) &&
        Objects.equals(matchType, keyword.matchType) &&
        Objects.equals(value, keyword.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archived, id, parentId, parentType, type, bid, matchType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Keyword {\n");
    
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

