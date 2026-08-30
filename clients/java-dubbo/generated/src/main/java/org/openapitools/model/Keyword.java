package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class Keyword implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("archived")
  private Boolean archived;

  /**
   * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   */
  @JsonProperty("bid")
  private Integer bid;

  /**
   * Keyword ID .
   */
  @JsonProperty("id")
  private String id;

  /**
   * Keyword [match type](/docs/api-features/targeting-overview/)
   */
  @JsonProperty("match_type")
  private MatchType matchType;

  /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   */
  @JsonProperty("parent_id")
  private String parentId;

  /**
   * Parent entity type (advertiser, campaign, ad group).
   */
  @JsonProperty("parent_type")
  private String parentType;

  /**
   * Always keyword
   */
  @JsonProperty("type")
  private String type;

  /**
   * Keyword value (120 chars max).
   */
  @JsonProperty("value")
  private String value;

  /**
   * 
   * @return archived
   */
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  /**
   * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   * @return bid
   */
  public Integer getBid() {
    return bid;
  }

  public void setBid(Integer bid) {
    this.bid = bid;
  }

  /**
   * Keyword ID .
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Keyword [match type](/docs/api-features/targeting-overview/)
   * @return matchType
   */
  public MatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   * @return parentId
   */
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * Parent entity type (advertiser, campaign, ad group).
   * @return parentType
   */
  public String getParentType() {
    return parentType;
  }

  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  /**
   * Always keyword
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * Keyword value (120 chars max).
   * @return value
   */
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
