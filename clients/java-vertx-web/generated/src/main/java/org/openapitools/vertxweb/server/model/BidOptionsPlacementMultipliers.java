package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * This represents a mapping from placement to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BidOptionsPlacementMultipliers   {
  
  private BigDecimal browse;
  private BigDecimal relatedPins;
  private BigDecimal search;

  public BidOptionsPlacementMultipliers () {

  }

  public BidOptionsPlacementMultipliers (BigDecimal browse, BigDecimal relatedPins, BigDecimal search) {
    this.browse = browse;
    this.relatedPins = relatedPins;
    this.search = search;
  }

    
  @JsonProperty("browse")
  public BigDecimal getBrowse() {
    return browse;
  }
  public void setBrowse(BigDecimal browse) {
    this.browse = browse;
  }

    
  @JsonProperty("related_pins")
  public BigDecimal getRelatedPins() {
    return relatedPins;
  }
  public void setRelatedPins(BigDecimal relatedPins) {
    this.relatedPins = relatedPins;
  }

    
  @JsonProperty("search")
  public BigDecimal getSearch() {
    return search;
  }
  public void setSearch(BigDecimal search) {
    this.search = search;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidOptionsPlacementMultipliers bidOptionsPlacementMultipliers = (BidOptionsPlacementMultipliers) o;
    return Objects.equals(browse, bidOptionsPlacementMultipliers.browse) &&
        Objects.equals(relatedPins, bidOptionsPlacementMultipliers.relatedPins) &&
        Objects.equals(search, bidOptionsPlacementMultipliers.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browse, relatedPins, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidOptionsPlacementMultipliers {\n");
    
    sb.append("    browse: ").append(toIndentedString(browse)).append("\n");
    sb.append("    relatedPins: ").append(toIndentedString(relatedPins)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
