package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\", \"VIDEO_COMPLETION\", \"CTV_CONSIDERATION\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] is DEPRECATED. `VIDEO_VIEW` is deprecated; use `VIDEO_COMPLETION` instead. `CTV_CONSIDERATION` is in BETA. For update, only draft campaigns may update objective type.
 */

public enum CampaignObjectiveType {

    AWARENESS("AWARENESS"),
    CONSIDERATION("CONSIDERATION"),
    VIDEO_VIEW("VIDEO_VIEW"),
    WEB_CONVERSION("WEB_CONVERSION"),
    CATALOG_SALES("CATALOG_SALES"),
    WEB_SESSIONS("WEB_SESSIONS"),
    VIDEO_COMPLETION("VIDEO_COMPLETION"),
    APP_INSTALL("APP_INSTALL"),
    SALES("SALES"),
    LEADS("LEADS"),
    CTV_CONSIDERATION("CTV_CONSIDERATION");

    private String value;

    CampaignObjectiveType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static CampaignObjectiveType fromValue(String text) {
        for (CampaignObjectiveType b : CampaignObjectiveType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

