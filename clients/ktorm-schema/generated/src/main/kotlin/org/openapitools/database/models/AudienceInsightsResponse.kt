/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * Audience interests and demographics.
 * @param categories Category interest distribution
 * @param demographics 
 * @param type 
 * @param date Generation date
 * @param propertySize Population count.
 * @param sizeIsUpperBound Indicates whether the audience size has been rounded up to the next highest upper boundary.
 */
object AudienceInsightsResponses : BaseTable<AudienceInsightsResponse>("AudienceInsightsResponse") {
    val demographics = long("demographics") /* null */
    val type = long("type") /* null */
    val date = text("date") /* null */ /* Generation date */
    val propertySize = int("size") /* null */ /* Population count. */
    val sizeIsUpperBound = boolean("size_is_upper_bound") /* null */ /* Indicates whether the audience size has been rounded up to the next highest upper boundary. */

    /**
     * Create an entity of type AudienceInsightsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AudienceInsightsResponse(
        categories = emptyList() /* kotlin.Array<AudienceCategory>? */ /* Category interest distribution */,
        demographics = AudienceDemographicss.createEntity(row, withReferences) /* AudienceDemographics? */,
        type = AudienceInsightTypes.createEntity(row, withReferences) /* AudienceInsightType? */,
        date = row[date]  /* kotlin.String? */ /* Generation date */,
        propertySize = row[propertySize]  /* kotlin.Int? */ /* Population count. */,
        sizeIsUpperBound = row[sizeIsUpperBound]  /* kotlin.Boolean? */ /* Indicates whether the audience size has been rounded up to the next highest upper boundary. */
    )

    /**
    * Assign all the columns from the entity of type AudienceInsightsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AudienceInsightsResponse()
    * database.update(AudienceInsightsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AudienceInsightsResponse) {
        this.apply {
            set(AudienceInsightsResponses.demographics, entity.demographics)
            set(AudienceInsightsResponses.type, entity.type)
            set(AudienceInsightsResponses.date, entity.date)
            set(AudienceInsightsResponses.propertySize, entity.propertySize)
            set(AudienceInsightsResponses.sizeIsUpperBound, entity.sizeIsUpperBound)
        }
    }

}


object AudienceInsightsResponseAudienceCategory : BaseTable<Pair<kotlin.Long, kotlin.Long>>("AudienceInsightsResponseAudienceCategory") {
    val audienceInsightsResponse = long("audienceInsightsResponse")
    val audienceCategory = long("audienceCategory")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[audienceInsightsResponse] ?: 0, row[audienceCategory] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(AudienceInsightsResponseAudienceCategory.audienceInsightsResponse, entity.first)
            set(AudienceInsightsResponseAudienceCategory.audienceCategory, entity.second)
        }
    }

}
