package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchType;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class KeywordCreateItem   {
  
  private Integer bid;

  private MatchType matchType;

  private String value;

  /**
   * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
   **/
  public KeywordCreateItem bid(Integer bid) {
    this.bid = bid;
    return this;
  }

  
  @ApiModelProperty(value = "**Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.")
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }
  public void setBid(Integer bid) {
    this.bid = bid;
  }


  /**
   * Keyword [match type](/docs/api-features/targeting-overview/)
   **/
  public KeywordCreateItem matchType(MatchType matchType) {
    this.matchType = matchType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Keyword [match type](/docs/api-features/targeting-overview/)")
  @JsonProperty("match_type")
  @NotNull
  public MatchType getMatchType() {
    return matchType;
  }
  public void setMatchType(MatchType matchType) {
    this.matchType = matchType;
  }


  /**
   * Keyword value (120 chars max).
   **/
  public KeywordCreateItem value(String value) {
    this.value = value;
    return this;
  }

  
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
    KeywordCreateItem keywordCreateItem = (KeywordCreateItem) o;
    return Objects.equals(this.bid, keywordCreateItem.bid) &&
        Objects.equals(this.matchType, keywordCreateItem.matchType) &&
        Objects.equals(this.value, keywordCreateItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, matchType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordCreateItem {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

