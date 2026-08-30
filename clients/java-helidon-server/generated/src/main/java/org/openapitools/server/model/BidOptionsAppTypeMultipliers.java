package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
public class BidOptionsAppTypeMultipliers   {

    private BigDecimal androidMobile;
    private BigDecimal androidTablet;
    private BigDecimal ipad;
    private BigDecimal iphone;
    private BigDecimal web;
    private BigDecimal webMobile;

    /**
     * Default constructor.
     */
    public BidOptionsAppTypeMultipliers() {
    // JSON-B / Jackson
    }

    /**
     * Create BidOptionsAppTypeMultipliers.
     *
     * @param androidMobile androidMobile
     * @param androidTablet androidTablet
     * @param ipad ipad
     * @param iphone iphone
     * @param web web
     * @param webMobile webMobile
     */
    public BidOptionsAppTypeMultipliers(
        BigDecimal androidMobile, 
        BigDecimal androidTablet, 
        BigDecimal ipad, 
        BigDecimal iphone, 
        BigDecimal web, 
        BigDecimal webMobile
    ) {
        this.androidMobile = androidMobile;
        this.androidTablet = androidTablet;
        this.ipad = ipad;
        this.iphone = iphone;
        this.web = web;
        this.webMobile = webMobile;
    }



    /**
     * Get androidMobile
     * @return androidMobile
     */
    public BigDecimal getAndroidMobile() {
        return androidMobile;
    }

    public void setAndroidMobile(BigDecimal androidMobile) {
        this.androidMobile = androidMobile;
    }

    /**
     * Get androidTablet
     * @return androidTablet
     */
    public BigDecimal getAndroidTablet() {
        return androidTablet;
    }

    public void setAndroidTablet(BigDecimal androidTablet) {
        this.androidTablet = androidTablet;
    }

    /**
     * Get ipad
     * @return ipad
     */
    public BigDecimal getIpad() {
        return ipad;
    }

    public void setIpad(BigDecimal ipad) {
        this.ipad = ipad;
    }

    /**
     * Get iphone
     * @return iphone
     */
    public BigDecimal getIphone() {
        return iphone;
    }

    public void setIphone(BigDecimal iphone) {
        this.iphone = iphone;
    }

    /**
     * Get web
     * @return web
     */
    public BigDecimal getWeb() {
        return web;
    }

    public void setWeb(BigDecimal web) {
        this.web = web;
    }

    /**
     * Get webMobile
     * @return webMobile
     */
    public BigDecimal getWebMobile() {
        return webMobile;
    }

    public void setWebMobile(BigDecimal webMobile) {
        this.webMobile = webMobile;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BidOptionsAppTypeMultipliers {\n");
        
        sb.append("    androidMobile: ").append(toIndentedString(androidMobile)).append("\n");
        sb.append("    androidTablet: ").append(toIndentedString(androidTablet)).append("\n");
        sb.append("    ipad: ").append(toIndentedString(ipad)).append("\n");
        sb.append("    iphone: ").append(toIndentedString(iphone)).append("\n");
        sb.append("    web: ").append(toIndentedString(web)).append("\n");
        sb.append("    webMobile: ").append(toIndentedString(webMobile)).append("\n");
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

