package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchTypeResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
   **/
  
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
   **/
  
  @ApiModelProperty(example = "383791336903426391", value = "Keyword ID .")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   **/
  
  @ApiModelProperty(example = "383791336903426391", value = "Keyword parent entity ID (advertiser, campaign, ad group).")
  @JsonProperty("parent_id")
 @Pattern(regexp="^\\d+$")  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * Parent entity type
   **/
  
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
   **/
  
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
   **/
  
  @ApiModelProperty(example = "200000", value = "Keyword custom bid in microcurrency - null if inherited from parent ad group.")
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }
  public void setBid(Integer bid) {
    this.bid = bid;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("match_type")
  @NotNull
  @Valid
  public MatchTypeResponse getMatchType() {
    return matchType;
  }
  public void setMatchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
  }

  /**
   * Keyword value (120 chars max).
   **/
  
  @ApiModelProperty(required = true, value = "Keyword value (120 chars max).")
  @JsonProperty("value")
  @NotNull
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
    return Objects.equals(this.archived, keyword.archived) &&
        Objects.equals(this.id, keyword.id) &&
        Objects.equals(this.parentId, keyword.parentId) &&
        Objects.equals(this.parentType, keyword.parentType) &&
        Objects.equals(this.type, keyword.type) &&
        Objects.equals(this.bid, keyword.bid) &&
        Objects.equals(this.matchType, keyword.matchType) &&
        Objects.equals(this.value, keyword.value);
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

