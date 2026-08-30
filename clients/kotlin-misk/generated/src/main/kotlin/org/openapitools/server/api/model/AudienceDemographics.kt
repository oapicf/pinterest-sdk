package org.openapitools.server.api.model

import org.openapitools.server.api.model.AudienceDemographicValue
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AudienceDemographics(
    /** Ages distribution. */
    val ages: kotlin.collections.List<AudienceDemographicValue>? = null,
    /** Country area distribution. */
    val countries: kotlin.collections.List<AudienceDemographicValue>? = null,
    /** Device usage distribution. */
    val devices: kotlin.collections.List<AudienceDemographicValue>? = null,
    /** Gender distribution. */
    val genders: kotlin.collections.List<AudienceDemographicValue>? = null,
    /** Geographic metro area distribution. */
    val metros: kotlin.collections.List<AudienceDemographicValue>? = null
)
