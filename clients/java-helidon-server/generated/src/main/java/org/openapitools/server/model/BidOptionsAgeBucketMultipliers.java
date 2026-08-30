package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
public class BidOptionsAgeBucketMultipliers   {

    private BigDecimal _18_24;
    private BigDecimal _25_34;
    private BigDecimal _35_44;
    private BigDecimal _45_49;
    private BigDecimal _50_54;
    private BigDecimal _55_64;
    private BigDecimal _65plus;

    /**
     * Default constructor.
     */
    public BidOptionsAgeBucketMultipliers() {
    // JSON-B / Jackson
    }

    /**
     * Create BidOptionsAgeBucketMultipliers.
     *
     * @param _18_24 _18_24
     * @param _25_34 _25_34
     * @param _35_44 _35_44
     * @param _45_49 _45_49
     * @param _50_54 _50_54
     * @param _55_64 _55_64
     * @param _65plus _65plus
     */
    public BidOptionsAgeBucketMultipliers(
        BigDecimal _18_24, 
        BigDecimal _25_34, 
        BigDecimal _35_44, 
        BigDecimal _45_49, 
        BigDecimal _50_54, 
        BigDecimal _55_64, 
        BigDecimal _65plus
    ) {
        this._18_24 = _18_24;
        this._25_34 = _25_34;
        this._35_44 = _35_44;
        this._45_49 = _45_49;
        this._50_54 = _50_54;
        this._55_64 = _55_64;
        this._65plus = _65plus;
    }



    /**
     * Get _18_24
     * @return _18_24
     */
    public BigDecimal get1824() {
        return _18_24;
    }

    public void set1824(BigDecimal _18_24) {
        this._18_24 = _18_24;
    }

    /**
     * Get _25_34
     * @return _25_34
     */
    public BigDecimal get2534() {
        return _25_34;
    }

    public void set2534(BigDecimal _25_34) {
        this._25_34 = _25_34;
    }

    /**
     * Get _35_44
     * @return _35_44
     */
    public BigDecimal get3544() {
        return _35_44;
    }

    public void set3544(BigDecimal _35_44) {
        this._35_44 = _35_44;
    }

    /**
     * Get _45_49
     * @return _45_49
     */
    public BigDecimal get4549() {
        return _45_49;
    }

    public void set4549(BigDecimal _45_49) {
        this._45_49 = _45_49;
    }

    /**
     * Get _50_54
     * @return _50_54
     */
    public BigDecimal get5054() {
        return _50_54;
    }

    public void set5054(BigDecimal _50_54) {
        this._50_54 = _50_54;
    }

    /**
     * Get _55_64
     * @return _55_64
     */
    public BigDecimal get5564() {
        return _55_64;
    }

    public void set5564(BigDecimal _55_64) {
        this._55_64 = _55_64;
    }

    /**
     * Get _65plus
     * @return _65plus
     */
    public BigDecimal get65plus() {
        return _65plus;
    }

    public void set65plus(BigDecimal _65plus) {
        this._65plus = _65plus;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

