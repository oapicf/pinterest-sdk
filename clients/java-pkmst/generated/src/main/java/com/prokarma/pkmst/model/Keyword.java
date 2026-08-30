package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.MatchType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Keyword
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Keyword   {
  @JsonProperty("archived")
  private Boolean archived;

  @JsonProperty("bid")
  private Integer bid;

  @JsonProperty("id")
  private String id;

  @JsonProperty("match_type")
  private MatchType matchType;

  @JsonProperty("parent_id")
  private String parentId;

  @JsonProperty("parent_type")
  private String parentType;

  @JsonProperty("type")
  private String type;

  @JsonProperty("value")
  private String value;

  public Keyword archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Get archived
   * @return archived
   */
  @ApiModelProperty(example = "false", value = "")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public Keyword bid(Integer bid) {
    this.bid = bid;
    return this;
  }

  /**
   * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   * @return bid
   */
  @ApiModelProperty(value = "**Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.")
  public Integer getBid() {
    return bid;
  }

  public void setBid(Integer bid) {
    this.bid = bid;
  }

  public Keyword id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Keyword ID .
   * @return id
   */
  @ApiModelProperty(example = "383791336903426391", required = true, value = "Keyword ID .")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Keyword matchType(MatchType matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * Keyword [match type](/docs/api-features/targeting-overview/)
   * @return matchType
   */
  @ApiModelProperty(required = true, value = "Keyword [match type](/docs/api-features/targeting-overview/)")
  public MatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchType matchType) {
    this.matchType = matchType;
  }

  public Keyword parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   * @return parentId
   */
  @ApiModelProperty(example = "383791336903426391", required = true, readOnly = true, value = "Keyword parent entity ID (advertiser, campaign, ad group).")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Keyword parentType(String parentType) {
    this.parentType = parentType;
    return this;
  }

  /**
   * Parent entity type (advertiser, campaign, ad group).
   * @return parentType
   */
  @ApiModelProperty(example = "campaign", readOnly = true, value = "Parent entity type (advertiser, campaign, ad group).")
  public String getParentType() {
    return parentType;
  }

  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  public Keyword type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always keyword
   * @return type
   */
  @ApiModelProperty(example = "keyword", readOnly = true, value = "Always keyword")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Keyword value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Keyword value (120 chars max).
   * @return value
   */
  @ApiModelProperty(required = true, value = "Keyword value (120 chars max).")
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
        Objects.equals(this.bid, keyword.bid) &&
        Objects.equals(this.id, keyword.id) &&
        Objects.equals(this.matchType, keyword.matchType) &&
        Objects.equals(this.parentId, keyword.parentId) &&
        Objects.equals(this.parentType, keyword.parentType) &&
        Objects.equals(this.type, keyword.type) &&
        Objects.equals(this.value, keyword.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archived, bid, id, matchType, parentId, parentType, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Keyword {\n");
    
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

