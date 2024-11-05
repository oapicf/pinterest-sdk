package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* 
* Values: ADMIN,ANALYST,FINANCE_MANAGER,AUDIENCE_MANAGER,CAMPAIGN_MANAGER,CATALOGS_MANAGER,CATALOGS_VIEWER,PROFILE_PUBLISHER,OWNER
*/
enum class PermissionsWithOwner(@get:JsonValue val value: kotlin.String) {

    ADMIN("ADMIN"),
    ANALYST("ANALYST"),
    FINANCE_MANAGER("FINANCE_MANAGER"),
    AUDIENCE_MANAGER("AUDIENCE_MANAGER"),
    CAMPAIGN_MANAGER("CAMPAIGN_MANAGER"),
    CATALOGS_MANAGER("CATALOGS_MANAGER"),
    CATALOGS_VIEWER("CATALOGS_VIEWER"),
    PROFILE_PUBLISHER("PROFILE_PUBLISHER"),
    OWNER("OWNER");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): PermissionsWithOwner {
                return values().first{it -> it.value == value}
        }
    }
}

