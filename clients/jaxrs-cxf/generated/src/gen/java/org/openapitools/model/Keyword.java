package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchTypeResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Keyword  {
  
  @ApiModelProperty(value = "</p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.")
 /**
   * </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  **/
  private Integer bid;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MatchTypeResponse matchType;

  @ApiModelProperty(required = true, value = "Keyword value (120 chars max).")
 /**
   * Keyword value (120 chars max).
  **/
  private String value;

  @ApiModelProperty(example = "false", value = "")
  private Boolean archived;

  @ApiModelProperty(example = "383791336903426391", value = "Keyword ID .")
 /**
   * Keyword ID .
  **/
  private String id;

  @ApiModelProperty(example = "383791336903426391", value = "Keyword parent entity ID (advertiser, campaign, ad group).")
 /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
  **/
  private String parentId;

  @ApiModelProperty(example = "campaign", value = "Parent entity type")
 /**
   * Parent entity type
  **/
  private String parentType;

  @ApiModelProperty(example = "keyword", value = "Always keyword")
 /**
   * Always keyword
  **/
  private String type;
 /**
   * &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   * @return bid
  **/
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }

  public void setBid(Integer bid) {
    this.bid = bid;
  }

  public Keyword bid(Integer bid) {
    this.bid = bid;
    return this;
  }

 /**
   * Get matchType
   * @return matchType
  **/
  @JsonProperty("match_type")
  @NotNull
  public MatchTypeResponse getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
  }

  public Keyword matchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
    return this;
  }

 /**
   * Keyword value (120 chars max).
   * @return value
  **/
  @JsonProperty("value")
  @NotNull
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Keyword value(String value) {
    this.value = value;
    return this;
  }

 /**
   * Get archived
   * @return archived
  **/
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public Keyword archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

 /**
   * Keyword ID .
   * @return id
  **/
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Keyword id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   * @return parentId
  **/
  @JsonProperty("parent_id")
 @Pattern(regexp="^\\d+$")  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public Keyword parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
   * Parent entity type
   * @return parentType
  **/
  @JsonProperty("parent_type")
  public String getParentType() {
    return parentType;
  }

  public void setParentType(String parentType) {
    this.parentType = parentType;
  }

  public Keyword parentType(String parentType) {
    this.parentType = parentType;
    return this;
  }

 /**
   * Always keyword
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Keyword type(String type) {
    this.type = type;
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
    Keyword keyword = (Keyword) o;
    return Objects.equals(this.bid, keyword.bid) &&
        Objects.equals(this.matchType, keyword.matchType) &&
        Objects.equals(this.value, keyword.value) &&
        Objects.equals(this.archived, keyword.archived) &&
        Objects.equals(this.id, keyword.id) &&
        Objects.equals(this.parentId, keyword.parentId) &&
        Objects.equals(this.parentType, keyword.parentType) &&
        Objects.equals(this.type, keyword.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, matchType, value, archived, id, parentId, parentType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Keyword {\n");
    
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentType: ").append(toIndentedString(parentType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

