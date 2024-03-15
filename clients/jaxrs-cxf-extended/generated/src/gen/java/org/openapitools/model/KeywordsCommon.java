package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchTypeResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KeywordsCommon  {
  
 /**
  * Keyword custom bid in microcurrency - null if inherited from parent ad group.
  */
  @ApiModelProperty(example = "200000", value = "Keyword custom bid in microcurrency - null if inherited from parent ad group.")
  private Integer bid;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MatchTypeResponse matchType;

 /**
  * Keyword value (120 chars max).
  */
  @ApiModelProperty(required = true, value = "Keyword value (120 chars max).")
  private String value;
 /**
  * Keyword custom bid in microcurrency - null if inherited from parent ad group.
  * @return bid
  */
  @JsonProperty("bid")
  public Integer getBid() {
    return bid;
  }

  /**
   * Sets the <code>bid</code> property.
   */
 public void setBid(Integer bid) {
    this.bid = bid;
  }

  /**
   * Sets the <code>bid</code> property.
   */
  public KeywordsCommon bid(Integer bid) {
    this.bid = bid;
    return this;
  }

 /**
  * Get matchType
  * @return matchType
  */
  @JsonProperty("match_type")
  @NotNull
  public MatchTypeResponse getMatchType() {
    return matchType;
  }

  /**
   * Sets the <code>matchType</code> property.
   */
 public void setMatchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
  }

  /**
   * Sets the <code>matchType</code> property.
   */
  public KeywordsCommon matchType(MatchTypeResponse matchType) {
    this.matchType = matchType;
    return this;
  }

 /**
  * Keyword value (120 chars max).
  * @return value
  */
  @JsonProperty("value")
  @NotNull
  public String getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(String value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
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

