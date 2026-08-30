package org.openapitools.server.api.model

import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdAccountsCountry(
    val code: Country,
    /** Country currency. */
    val currency: kotlin.String,
    /** Country index */
    val index: java.math.BigDecimal,
    /** Country name */
    val name: kotlin.String
)
