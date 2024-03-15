package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Budget type. If DAILY, an ad group&#39;s daily spend will not exceed the budget parameter value. If LIFETIME, the end_time parameter is **REQUIRED**, and the ad group spend is spread evenly between the ad group &#x60;start_time&#x60; and &#x60;end_time&#x60; range. A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. For CBO campaigns, only \&quot;CBO_ADGROUP\&quot; is allowed. For WEB_SESSIONS campaigns, only \&quot;LIFETIME\&quot; is allowed. For update, only draft ad groups may update budget type.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BudgetType {

    @JsonProperty("DAILY") DAILY(String.valueOf("DAILY")), @JsonProperty("LIFETIME") LIFETIME(String.valueOf("LIFETIME")), @JsonProperty("CBO_ADGROUP") CBO_ADGROUP(String.valueOf("CBO_ADGROUP"));


    private String value;

    BudgetType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BudgetType fromValue(String value) {
        for (BudgetType b : BudgetType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



