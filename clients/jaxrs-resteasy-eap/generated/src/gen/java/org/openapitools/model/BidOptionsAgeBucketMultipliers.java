package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BidOptionsAgeBucketMultipliers   {
  
  private BigDecimal _18_24;
  private BigDecimal _25_34;
  private BigDecimal _35_44;
  private BigDecimal _45_49;
  private BigDecimal _50_54;
  private BigDecimal _55_64;
  private BigDecimal _65plus;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("18-24")
  public BigDecimal get1824() {
    return _18_24;
  }
  public void set1824(BigDecimal _18_24) {
    this._18_24 = _18_24;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("25-34")
  public BigDecimal get2534() {
    return _25_34;
  }
  public void set2534(BigDecimal _25_34) {
    this._25_34 = _25_34;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("35-44")
  public BigDecimal get3544() {
    return _35_44;
  }
  public void set3544(BigDecimal _35_44) {
    this._35_44 = _35_44;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("45-49")
  public BigDecimal get4549() {
    return _45_49;
  }
  public void set4549(BigDecimal _45_49) {
    this._45_49 = _45_49;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("50-54")
  public BigDecimal get5054() {
    return _50_54;
  }
  public void set5054(BigDecimal _50_54) {
    this._50_54 = _50_54;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("55-64")
  public BigDecimal get5564() {
    return _55_64;
  }
  public void set5564(BigDecimal _55_64) {
    this._55_64 = _55_64;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("65+")
  public BigDecimal get65plus() {
    return _65plus;
  }
  public void set65plus(BigDecimal _65plus) {
    this._65plus = _65plus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidOptionsAgeBucketMultipliers bidOptionsAgeBucketMultipliers = (BidOptionsAgeBucketMultipliers) o;
    return Objects.equals(this._18_24, bidOptionsAgeBucketMultipliers._18_24) &&
        Objects.equals(this._25_34, bidOptionsAgeBucketMultipliers._25_34) &&
        Objects.equals(this._35_44, bidOptionsAgeBucketMultipliers._35_44) &&
        Objects.equals(this._45_49, bidOptionsAgeBucketMultipliers._45_49) &&
        Objects.equals(this._50_54, bidOptionsAgeBucketMultipliers._50_54) &&
        Objects.equals(this._55_64, bidOptionsAgeBucketMultipliers._55_64) &&
        Objects.equals(this._65plus, bidOptionsAgeBucketMultipliers._65plus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_18_24, _25_34, _35_44, _45_49, _50_54, _55_64, _65plus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidOptionsAgeBucketMultipliers {\n");
    
    sb.append("    _18_24: ").append(toIndentedString(_18_24)).append("\n");
    sb.append("    _25_34: ").append(toIndentedString(_25_34)).append("\n");
    sb.append("    _35_44: ").append(toIndentedString(_35_44)).append("\n");
    sb.append("    _45_49: ").append(toIndentedString(_45_49)).append("\n");
    sb.append("    _50_54: ").append(toIndentedString(_50_54)).append("\n");
    sb.append("    _55_64: ").append(toIndentedString(_55_64)).append("\n");
    sb.append("    _65plus: ").append(toIndentedString(_65plus)).append("\n");
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

