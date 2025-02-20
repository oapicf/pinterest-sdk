/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
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
 * 
 * @param matchType 
 * @param value Keyword value (120 chars max).
 */
object AdGroupAudienceSizingRequestKeywordsInners : BaseTable<AdGroupAudienceSizingRequestKeywordsInner>("AdGroupAudienceSizingRequest_keywords_inner") {
    val matchType = long("match_type")
    val value = text("value") /* Keyword value (120 chars max). */

    /**
     * Create an entity of type AdGroupAudienceSizingRequestKeywordsInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AdGroupAudienceSizingRequestKeywordsInner(
        matchType = MatchTypeResponses.createEntity(row, withReferences) /* MatchTypeResponse */,
        value = row[value] ?: "" /* kotlin.String */ /* Keyword value (120 chars max). */
    )

    /**
    * Assign all the columns from the entity of type AdGroupAudienceSizingRequestKeywordsInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AdGroupAudienceSizingRequestKeywordsInner()
    * database.update(AdGroupAudienceSizingRequestKeywordsInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AdGroupAudienceSizingRequestKeywordsInner) {
        this.apply {
            set(AdGroupAudienceSizingRequestKeywordsInners.matchType, entity.matchType)
            set(AdGroupAudienceSizingRequestKeywordsInners.value, entity.value)
        }
    }

}


