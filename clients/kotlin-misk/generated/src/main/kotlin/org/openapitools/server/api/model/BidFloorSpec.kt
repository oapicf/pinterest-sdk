package org.openapitools.server.api.model

import org.openapitools.server.api.model.ActionType
import org.openapitools.server.api.model.BidFloorObjectiveType
import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.CreativeType
import org.openapitools.server.api.model.Currency
import org.openapitools.server.api.model.OptimizationGoalMetadata
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BidFloorSpec(
    /** Ad group billable event type. */
    val billableEvent: ActionType,
    /** Currency for the bid floor value. */
    val currency: Currency,
    /** List of ISO 3166-1 alpha-2 country codes. */
    val countries: kotlin.collections.List<Country>? = null,
    /** Creative type for the bid floor request. */
    val creativeType: CreativeType? = null,
    /** Campaign objective type. */
    val objectiveType: BidFloorObjectiveType? = null,
    /** Optimization goal metadata. */
    val optimizationGoalMetadata: OptimizationGoalMetadata? = null
)
