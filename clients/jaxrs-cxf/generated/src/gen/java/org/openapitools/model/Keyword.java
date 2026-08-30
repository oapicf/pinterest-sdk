package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Keyword  {
  
  @ApiModelProperty(example = "false", value = "")

  private Boolean archived;

 /**
  * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  */
  @ApiModelProperty(value = "**Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.")

  private Integer bid;

 /**
  * Keyword ID .
  */
  @ApiModelProperty(example = "383791336903426391", required = true, value = "Keyword ID .")

  private String id;

 /**
  * Keyword [match type](/docs/api-features/targeting-overview/)
  */
  @ApiModelProperty(required = true, value = "Keyword [match type](/docs/api-features/targeting-overview/)")

  @Valid

  private MatchType matchType;

 /**
  * Keyword parent entity ID (advertiser, campaign, ad group).
  */
  @ApiModelProperty(example = "383791336903426391", required = true, value = "Keyword parent entity ID (advertiser, campaign, ad group).")

  private String parentId;

 /**
  * Parent entity type (advertiser, campaign, ad group).
  */
  @ApiModelProperty(example = "campaign", value = "Parent entity type (advertiser, campaign, ad group).")

  private String parentType;

 /**
  * Always keyword
  */
  @ApiModelProperty(example = "keyword", value = "Always keyword")

  private String type;

 /**
  * Keyword value (120 chars max).
  */
  @ApiModelProperty(required = true, value = "Keyword value (120 chars max).")

  private String value;
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
   * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
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
   * Keyword ID .
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
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
   * Keyword [match type](/docs/api-features/targeting-overview/)
   * @return matchType
  **/
  @JsonProperty("match_type")
  @NotNull
  public MatchType getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchType matchType) {
    this.matchType = matchType;
  }

  public Keyword matchType(MatchType matchType) {
    this.matchType = matchType;
    return this;
  }

 /**
   * Keyword parent entity ID (advertiser, campaign, ad group).
   * @return parentId
  **/
  @JsonProperty("parent_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getParentId() {
    return parentId;
  }


 /**
   * Parent entity type (advertiser, campaign, ad group).
   * @return parentType
  **/
  @JsonProperty("parent_type")
  public String getParentType() {
    return parentType;
  }


 /**
   * Always keyword
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

