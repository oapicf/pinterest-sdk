package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * This represents a mapping from placement to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BidOptionsPlacementMultipliers   {
  @JsonProperty("browse")
  @Valid

  private BigDecimal browse;

  @JsonProperty("related_pins")
  @Valid

  private BigDecimal relatedPins;

  @JsonProperty("search")
  @Valid

  private BigDecimal search;

  public BidOptionsPlacementMultipliers browse(BigDecimal browse) {
    this.browse = browse;
    return this;
  }

   /**
   * Get browse
   * @return browse
  **/
  public BigDecimal getBrowse() {
    return browse;
  }

  public void setBrowse(BigDecimal browse) {
    this.browse = browse;
  }

  public BidOptionsPlacementMultipliers relatedPins(BigDecimal relatedPins) {
    this.relatedPins = relatedPins;
    return this;
  }

   /**
   * Get relatedPins
   * @return relatedPins
  **/
  public BigDecimal getRelatedPins() {
    return relatedPins;
  }

  public void setRelatedPins(BigDecimal relatedPins) {
    this.relatedPins = relatedPins;
  }

  public BidOptionsPlacementMultipliers search(BigDecimal search) {
    this.search = search;
    return this;
  }

   /**
   * Get search
   * @return search
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

