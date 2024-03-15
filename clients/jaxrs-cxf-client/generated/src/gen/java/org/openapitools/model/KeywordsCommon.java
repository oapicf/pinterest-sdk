package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchTypeResponse;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KeywordsCommon  {
  
  @ApiModelProperty(example = "200000", value = "Keyword custom bid in microcurrency - null if inherited from parent ad group.")
 /**
   * Keyword custom bid in microcurrency - null if inherited from parent ad group.
  **/
  private Integer bid;

  @ApiModelProperty(required = true, value = "")
  private MatchTypeResponse matchType;

  @ApiModelProperty(required = true, value = "Keyword value (120 chars max).")
 /**
   * Keyword value (120 chars max).
  **/
  private String value;
 /**
   * Keyword custom bid in microcurrency - null if inherited from parent ad group.
   * @return bid
  **/
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }

  public void setBid(Integer bid) {
    this.bid = bid;
  }

  public KeywordsCommon bid(Integer bid) {
    this.bid = bid;
    return this;
  }

 /**
   * Get matchType
   * @return matchType
  **/
  @JsonProperty("match_type")
  public MatchTypeResponse getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
  }

  public KeywordsCommon matchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
    return this;
  }

 /**
   * Keyword value (120 chars max).
   * @return value
  **/
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public KeywordsCommon value(String value) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

