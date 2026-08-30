package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Campaign objective type. If set as one of [\&quot;AWARENESS\&quot;, \&quot;CONSIDERATION\&quot;, \&quot;WEB_CONVERSION\&quot;, \&quot;CATALOG_SALES\&quot;, \&quot;VIDEO_COMPLETION\&quot;, \&quot;CTV_CONSIDERATION\&quot;] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\&quot;WEB_SESSIONS\&quot;] is DEPRECATED. &#x60;VIDEO_VIEW&#x60; is deprecated; use &#x60;VIDEO_COMPLETION&#x60; instead. &#x60;CTV_CONSIDERATION&#x60; is in BETA. For update, only draft campaigns may update objective type.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CampaignObjectiveType {

    @JsonProperty("AWARENESS") AWARENESS(String.valueOf("AWARENESS")), @JsonProperty("CONSIDERATION") CONSIDERATION(String.valueOf("CONSIDERATION")), @JsonProperty("VIDEO_VIEW") VIDEO_VIEW(String.valueOf("VIDEO_VIEW")), @JsonProperty("WEB_CONVERSION") WEB_CONVERSION(String.valueOf("WEB_CONVERSION")), @JsonProperty("CATALOG_SALES") CATALOG_SALES(String.valueOf("CATALOG_SALES")), @JsonProperty("WEB_SESSIONS") WEB_SESSIONS(String.valueOf("WEB_SESSIONS")), @JsonProperty("VIDEO_COMPLETION") VIDEO_COMPLETION(String.valueOf("VIDEO_COMPLETION")), @JsonProperty("APP_INSTALL") APP_INSTALL(String.valueOf("APP_INSTALL")), @JsonProperty("SALES") SALES(String.valueOf("SALES")), @JsonProperty("LEADS") LEADS(String.valueOf("LEADS")), @JsonProperty("CTV_CONSIDERATION") CTV_CONSIDERATION(String.valueOf("CTV_CONSIDERATION"));


    private String value;

    CampaignObjectiveType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CampaignObjectiveType fromValue(String value) {
        for (CampaignObjectiveType b : CampaignObjectiveType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



