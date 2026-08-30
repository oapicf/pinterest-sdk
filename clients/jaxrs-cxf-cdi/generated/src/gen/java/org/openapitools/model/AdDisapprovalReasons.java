package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ad disapproval reasons
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdDisapprovalReasons {

    @JsonProperty("HASHTAGS") HASHTAGS(String.valueOf("HASHTAGS")), @JsonProperty("PROMOTIONS_AND_PRICES") PROMOTIONS_AND_PRICES(String.valueOf("PROMOTIONS_AND_PRICES")), @JsonProperty("TARGETING") TARGETING(String.valueOf("TARGETING")), @JsonProperty("LANDING_PAGE") LANDING_PAGE(String.valueOf("LANDING_PAGE")), @JsonProperty("CAPS_AND_SYMBOLS") CAPS_AND_SYMBOLS(String.valueOf("CAPS_AND_SYMBOLS")), @JsonProperty("SHOCKING") SHOCKING(String.valueOf("SHOCKING")), @JsonProperty("WEIGHT_LOSS") WEIGHT_LOSS(String.valueOf("WEIGHT_LOSS")), @JsonProperty("PROHIBITED_PRODUCT") PROHIBITED_PRODUCT(String.valueOf("PROHIBITED_PRODUCT")), @JsonProperty("AUTHENTICITY") AUTHENTICITY(String.valueOf("AUTHENTICITY")), @JsonProperty("NUDITY") NUDITY(String.valueOf("NUDITY")), @JsonProperty("CONFUSING_DESIGN") CONFUSING_DESIGN(String.valueOf("CONFUSING_DESIGN")), @JsonProperty("URGENCY") URGENCY(String.valueOf("URGENCY")), @JsonProperty("RATINGS") RATINGS(String.valueOf("RATINGS")), @JsonProperty("APP") APP(String.valueOf("APP")), @JsonProperty("ALCOHOL") ALCOHOL(String.valueOf("ALCOHOL")), @JsonProperty("CONTESTS") CONTESTS(String.valueOf("CONTESTS")), @JsonProperty("POLITICAL") POLITICAL(String.valueOf("POLITICAL")), @JsonProperty("OTHER") OTHER(String.valueOf("OTHER")), @JsonProperty("IMAGE") IMAGE(String.valueOf("IMAGE")), @JsonProperty("NAR") NAR(String.valueOf("NAR")), @JsonProperty("INCONSISTENT") INCONSISTENT(String.valueOf("INCONSISTENT")), @JsonProperty("CLICKBAIT") CLICKBAIT(String.valueOf("CLICKBAIT")), @JsonProperty("NO_DESCRIPTION") NO_DESCRIPTION(String.valueOf("NO_DESCRIPTION")), @JsonProperty("LOW_QUALITY") LOW_QUALITY(String.valueOf("LOW_QUALITY")), @JsonProperty("EXAGGERATED_CLAIMS") EXAGGERATED_CLAIMS(String.valueOf("EXAGGERATED_CLAIMS")), @JsonProperty("PINTEREST_BRAND") PINTEREST_BRAND(String.valueOf("PINTEREST_BRAND")), @JsonProperty("ALCOHOL_NO_SALE") ALCOHOL_NO_SALE(String.valueOf("ALCOHOL_NO_SALE")), @JsonProperty("LANDING_PAGE_SPEED") LANDING_PAGE_SPEED(String.valueOf("LANDING_PAGE_SPEED")), @JsonProperty("LANDING_PAGE_HARDWALL") LANDING_PAGE_HARDWALL(String.valueOf("LANDING_PAGE_HARDWALL")), @JsonProperty("LANDING_PAGE_BROKEN") LANDING_PAGE_BROKEN(String.valueOf("LANDING_PAGE_BROKEN")), @JsonProperty("LANDING_PAGE_QUALITY") LANDING_PAGE_QUALITY(String.valueOf("LANDING_PAGE_QUALITY")), @JsonProperty("OUT_OF_STOCK") OUT_OF_STOCK(String.valueOf("OUT_OF_STOCK")), @JsonProperty("IMAGE_LOW_QUALITY") IMAGE_LOW_QUALITY(String.valueOf("IMAGE_LOW_QUALITY")), @JsonProperty("IMAGE_BUSY") IMAGE_BUSY(String.valueOf("IMAGE_BUSY")), @JsonProperty("IMAGE_POORLY_EDITED") IMAGE_POORLY_EDITED(String.valueOf("IMAGE_POORLY_EDITED")), @JsonProperty("IMAGE_BEFORE_AFTER") IMAGE_BEFORE_AFTER(String.valueOf("IMAGE_BEFORE_AFTER")), @JsonProperty("UGC") UGC(String.valueOf("UGC")), @JsonProperty("FAKE_BUTTONS") FAKE_BUTTONS(String.valueOf("FAKE_BUTTONS")), @JsonProperty("WEAPONS") WEAPONS(String.valueOf("WEAPONS")), @JsonProperty("SENSITIVE") SENSITIVE(String.valueOf("SENSITIVE")), @JsonProperty("UNACCEPTABLE_BUSINESS") UNACCEPTABLE_BUSINESS(String.valueOf("UNACCEPTABLE_BUSINESS")), @JsonProperty("SUSPICIOUS_CLAIMS") SUSPICIOUS_CLAIMS(String.valueOf("SUSPICIOUS_CLAIMS")), @JsonProperty("PHARMA") PHARMA(String.valueOf("PHARMA")), @JsonProperty("SUSPICIOUS_SUPPLEMENTS") SUSPICIOUS_SUPPLEMENTS(String.valueOf("SUSPICIOUS_SUPPLEMENTS")), @JsonProperty("ILLEGAL_RECREATIONAL_DRUG") ILLEGAL_RECREATIONAL_DRUG(String.valueOf("ILLEGAL_RECREATIONAL_DRUG")), @JsonProperty("LOW_QUALITY_LANDING_PAGE") LOW_QUALITY_LANDING_PAGE(String.valueOf("LOW_QUALITY_LANDING_PAGE")), @JsonProperty("RESTRICTED_HEALTHCARE") RESTRICTED_HEALTHCARE(String.valueOf("RESTRICTED_HEALTHCARE")), @JsonProperty("INCONSISTENT_LANG_FR") INCONSISTENT_LANG_FR(String.valueOf("INCONSISTENT_LANG_FR"));


    private String value;

    AdDisapprovalReasons(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdDisapprovalReasons fromValue(String value) {
        for (AdDisapprovalReasons b : AdDisapprovalReasons.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



