package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchTypeResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class KeywordsCommon   {
  
  private Integer bid;

  private MatchTypeResponse matchType;

  private String value;

  /**
   * Keyword custom bid in microcurrency - null if inherited from parent ad group.
   **/
  public KeywordsCommon bid(Integer bid) {
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
   **/
  public KeywordsCommon matchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("match_type")
  @NotNull
  public MatchTypeResponse getMatchType() {
    return matchType;
  }
  public void setMatchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
  }


  /**
   * Keyword value (120 chars max).
   **/
  public KeywordsCommon value(String value) {
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
    KeywordsCommon keywordsCommon = (KeywordsCommon) o;
    return Objects.equals(this.bid, keywordsCommon.bid) &&
        Objects.equals(this.matchType, keywordsCommon.matchType) &&
        Objects.equals(this.value, keywordsCommon.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, matchType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordsCommon {\n");
    
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

