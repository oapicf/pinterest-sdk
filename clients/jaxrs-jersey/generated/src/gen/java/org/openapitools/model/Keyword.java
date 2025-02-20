/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MatchTypeResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Keyword
 */
@JsonPropertyOrder({
  Keyword.JSON_PROPERTY_BID,
  Keyword.JSON_PROPERTY_MATCH_TYPE,
  Keyword.JSON_PROPERTY_VALUE,
  Keyword.JSON_PROPERTY_ARCHIVED,
  Keyword.JSON_PROPERTY_ID,
  Keyword.JSON_PROPERTY_PARENT_ID,
  Keyword.JSON_PROPERTY_PARENT_TYPE,
  Keyword.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-05T02:20:07.425136412Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class Keyword   {
  public static final String JSON_PROPERTY_BID = "bid";
  @JsonProperty(JSON_PROPERTY_BID)
  private Integer bid;

  public static final String JSON_PROPERTY_MATCH_TYPE = "match_type";
  @JsonProperty(JSON_PROPERTY_MATCH_TYPE)
  private MatchTypeResponse matchType;

  public static final String JSON_PROPERTY_VALUE = "value";
  @JsonProperty(JSON_PROPERTY_VALUE)
  private String value;

  public static final String JSON_PROPERTY_ARCHIVED = "archived";
  @JsonProperty(JSON_PROPERTY_ARCHIVED)
  private Boolean archived;

  public static final String JSON_PROPERTY_ID = "id";
  @JsonProperty(JSON_PROPERTY_ID)
  private String id;

  public static final String JSON_PROPERTY_PARENT_ID = "parent_id";
  @JsonProperty(JSON_PROPERTY_PARENT_ID)
  private String parentId;

  public static final String JSON_PROPERTY_PARENT_TYPE = "parent_type";
  @JsonProperty(JSON_PROPERTY_PARENT_TYPE)
  private String parentType;

  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private String type;

  public Keyword bid(Integer bid) {
    this.bid = bid;
    return this;
  }

  /**
   * &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   * @return bid
   **/
  @JsonProperty(value = "bid")
  @ApiModelProperty(value = "</p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.")
  
  public Integer getBid() {
    return bid;
  }

  public void setBid(Integer bid) {
    this.bid = bid;
  }

  public Keyword matchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * Get matchType
   * @return matchType
   **/
  @JsonProperty(value = "match_type")
  @ApiModelProperty(required = true, value = "")
  @NotNull 
  public MatchTypeResponse getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
  }

  public Keyword value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Keyword value (120 chars max).
   * @return value
   **/
  @JsonProperty(value = "value")
  @ApiModelProperty(required = true, value = "Keyword value (120 chars max).")
  @NotNull 
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Keyword archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Get archived
   * @return archived
   **/
  @JsonProperty(value = "archived")
  @ApiModelProperty(example = "false", value = "")
  
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public Keyword id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Keyword ID .
   * @return id
   **/
  @JsonProperty(value = "id")
  @ApiModelProperty(example = "383791336903426391", value = "Keyword ID .")
   @Pattern(regexp="^\\d+$")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Keyword parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   * @return parentId
   **/
  @JsonProperty(value = "parent_id")
  @ApiModelProperty(example = "383791336903426391", value = "Keyword parent entity ID (advertiser, campaign, ad group).")
   @Pattern(regexp="^\\d+$")
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
   * Parent entity type
   * @return parentType
   **/
  @JsonProperty(value = "parent_type")
  @ApiModelProperty(example = "campaign", value = "Parent entity type")
  
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
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(example = "keyword", value = "Always keyword")
  
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

