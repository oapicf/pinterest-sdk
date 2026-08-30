package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MatchType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class KeywordCreateItem  {
  
 /**
  * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
  */
  @ApiModelProperty(value = "**Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.")
  private Integer bid;

 /**
  * Keyword [match type](/docs/api-features/targeting-overview/)
  */
  @ApiModelProperty(required = true, value = "Keyword [match type](/docs/api-features/targeting-overview/)")
  @Valid
  private MatchType matchType;

 /**
  * Keyword value (120 chars max).
  */
  @ApiModelProperty(required = true, value = "Keyword value (120 chars max).")
  private String value;
 /**
  * **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
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
  public KeywordCreateItem bid(Integer bid) {
    this.bid = bid;
    return this;
  }

 /**
  * Keyword [match type](/docs/api-features/targeting-overview/)
  * @return matchType
  */
  @JsonProperty("match_type")
  @NotNull
  public MatchType getMatchType() {
    return matchType;
  }

  /**
   * Sets the <code>matchType</code> property.
   */
 public void setMatchType(MatchType matchType) {
    this.matchType = matchType;
  }

  /**
   * Sets the <code>matchType</code> property.
   */
  public KeywordCreateItem matchType(MatchType matchType) {
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
  public KeywordCreateItem value(String value) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

