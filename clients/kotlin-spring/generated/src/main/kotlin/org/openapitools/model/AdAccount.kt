package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AdAccountOwner
import org.openapitools.model.BusinessAccessRole
import org.openapitools.model.Country
import org.openapitools.model.Currency
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
 * @param id 
 * @param country 
 * @param createdTime  Creation time. Unix timestamp in seconds.
 * @param currency 
 * @param name Ad account name.
 * @param owner Ad account owner
 * @param permissions 
 * @param timeZone The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
 * @param updatedTime 
 */
data class AdAccount(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=18)
    @Schema(required = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("country")
    @get:JsonProperty("country") val country: Country? = null,

    @Schema(readOnly = true, description = " Creation time. Unix timestamp in seconds.")
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("currency")
    @get:JsonProperty("currency") val currency: Currency? = null,

    @get:Size(max=256)
    @Schema(description = "Ad account name.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(readOnly = true, description = "Ad account owner")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("owner")
    @get:JsonProperty("owner") val owner: AdAccountOwner? = null,

    @field:Valid
    @Schema(readOnly = true, description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("permissions")
    @get:JsonProperty("permissions") val permissions: kotlin.collections.List<BusinessAccessRole>? = null,

    @Schema(example = "America/Los_Angeles", description = "The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("time_zone")
    @get:JsonProperty("time_zone") val timeZone: kotlin.String? = null,

    @Schema(readOnly = true, description = "")
    @param:JsonProperty("updated_time")
    @get:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null
) {

}

