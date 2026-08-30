package org.openapitools.server.api.model

import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.Currency
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdAccountCreate(
    val country: Country? = null,
    val currency: Currency? = null,
    /** Ad account name. */
    val name: kotlin.String? = null,
    /** Advertiser&#39;s owning user ID. */
    val ownerUserId: kotlin.String? = null,
    /** The time zone of the ad account, in IANA format (e.g., \&quot;America/Los_Angeles\&quot;). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. */
    val timeZone: kotlin.String? = null
)
