package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
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
* Permission role for business access.
* Values: OWNER,ADMIN,ANALYST,SOS_READER,FINANCE_MANAGER,AUDIENCE_MANAGER,CAMPAIGN_MANAGER,CATALOGS_MANAGER,RESTRICTED_OWNER,PROFILE_MANAGER,PROFILE_PUBLISHER,RESOURCE_PINNER_LIST_OWNER,RESOURCE_PINNER_LIST_READER,BIZ_PINNER_LIST_SHARER,RESOURCE_CONVERSION_TAGS_READER
*/
enum class BusinessAccessRole(val value: kotlin.String) {

    @JsonProperty("OWNER") OWNER("OWNER"),
    @JsonProperty("ADMIN") ADMIN("ADMIN"),
    @JsonProperty("ANALYST") ANALYST("ANALYST"),
    @JsonProperty("SOS_READER") SOS_READER("SOS_READER"),
    @JsonProperty("FINANCE_MANAGER") FINANCE_MANAGER("FINANCE_MANAGER"),
    @JsonProperty("AUDIENCE_MANAGER") AUDIENCE_MANAGER("AUDIENCE_MANAGER"),
    @JsonProperty("CAMPAIGN_MANAGER") CAMPAIGN_MANAGER("CAMPAIGN_MANAGER"),
    @JsonProperty("CATALOGS_MANAGER") CATALOGS_MANAGER("CATALOGS_MANAGER"),
    @JsonProperty("RESTRICTED_OWNER") RESTRICTED_OWNER("RESTRICTED_OWNER"),
    @JsonProperty("PROFILE_MANAGER") PROFILE_MANAGER("PROFILE_MANAGER"),
    @JsonProperty("PROFILE_PUBLISHER") PROFILE_PUBLISHER("PROFILE_PUBLISHER"),
    @JsonProperty("RESOURCE_PINNER_LIST_OWNER") RESOURCE_PINNER_LIST_OWNER("RESOURCE_PINNER_LIST_OWNER"),
    @JsonProperty("RESOURCE_PINNER_LIST_READER") RESOURCE_PINNER_LIST_READER("RESOURCE_PINNER_LIST_READER"),
    @JsonProperty("BIZ_PINNER_LIST_SHARER") BIZ_PINNER_LIST_SHARER("BIZ_PINNER_LIST_SHARER"),
    @JsonProperty("RESOURCE_CONVERSION_TAGS_READER") RESOURCE_CONVERSION_TAGS_READER("RESOURCE_CONVERSION_TAGS_READER")
}

