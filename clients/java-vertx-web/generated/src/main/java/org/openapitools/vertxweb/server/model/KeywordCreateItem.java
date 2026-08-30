package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.MatchType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeywordCreateItem   {
  
  private Integer bid;
  private MatchType matchType;
  private String value;

  public KeywordCreateItem () {

  }

  public KeywordCreateItem (Integer bid, MatchType matchType, String value) {
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
  public MatchType getMatchType() {
    return matchType;
  }
  public void setMatchType(MatchType matchType) {
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
    KeywordCreateItem keywordCreateItem = (KeywordCreateItem) o;
    return Objects.equals(bid, keywordCreateItem.bid) &&
        Objects.equals(matchType, keywordCreateItem.matchType) &&
        Objects.equals(value, keywordCreateItem.value);
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
