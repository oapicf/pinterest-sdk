package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.MatchTypeResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeywordsCommon   {
  
  private Integer bid;
  private MatchTypeResponse matchType;
  private String value;

  public KeywordsCommon () {

  }

  public KeywordsCommon (Integer bid, MatchTypeResponse matchType, String value) {
    this.bid = bid;
    this.matchType = matchType;
    this.value = value;
  }

    
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }
  public void setBid(Integer bid) {
    this.bid = bid;
  }

    
  @JsonProperty("match_type")
  public MatchTypeResponse getMatchType() {
    return matchType;
  }
  public void setMatchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
  }

    
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
    KeywordsCommon keywordsCommon = (KeywordsCommon) o;
    return Objects.equals(bid, keywordsCommon.bid) &&
        Objects.equals(matchType, keywordsCommon.matchType) &&
        Objects.equals(value, keywordsCommon.value);
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
