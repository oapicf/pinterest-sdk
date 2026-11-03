package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Resource create operation model.
 * @param country 
 * @param currency 
 * @param name Ad account name.
 * @param ownerUserId Advertiser's owning user ID.
 * @param timeZone The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
 */
data class AdAccountCreate(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("country")
    @get:JsonProperty("country") val country: Country? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("currency")
    @get:JsonProperty("currency") val currency: Currency? = null,

    @get:Size(max=256)
    @Schema(description = "Ad account name.")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Advertiser's owning user ID.")
    @param:JsonProperty("owner_user_id")
    @get:JsonProperty("owner_user_id") val ownerUserId: kotlin.String? = null,

    @Schema(example = "America/Los_Angeles", description = "The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.")
    @param:JsonProperty("time_zone")
    @get:JsonProperty("time_zone") val timeZone: kotlin.String? = null
) {

}

