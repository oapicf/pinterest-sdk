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
 * @param name Audience name.
 * @param rule 
 * @param audienceType 
 * @param adAccountId Ad account ID.
 * @param description Audience description.
 */
object AudienceCreateRequests : BaseTable<AudienceCreateRequest>("AudienceCreateRequest") {
    val name = text("name") /* Audience name. */
    val rule = long("rule")
    val audienceType = long("audience_type")
    val adAccountId = text("ad_account_id") /* null */ /* Ad account ID. */
    val description = text("description") /* null */ /* Audience description. */

    /**
     * Create an entity of type AudienceCreateRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AudienceCreateRequest(
        name = row[name] ?: "" /* kotlin.String */ /* Audience name. */,
        rule = AudienceRules.createEntity(row, withReferences) /* AudienceRule */,
        audienceType = AudienceCreateRequest1AudienceTypes.createEntity(row, withReferences) /* AudienceCreateRequest1AudienceType */,
        adAccountId = row[adAccountId]  /* kotlin.String? */ /* Ad account ID. */,
        description = row[description]  /* kotlin.String? */ /* Audience description. */
    )

    /**
    * Assign all the columns from the entity of type AudienceCreateRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AudienceCreateRequest()
    * database.update(AudienceCreateRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AudienceCreateRequest) {
        this.apply {
            set(AudienceCreateRequests.name, entity.name)
            set(AudienceCreateRequests.rule, entity.rule)
            set(AudienceCreateRequests.audienceType, entity.audienceType)
            set(AudienceCreateRequests.adAccountId, entity.adAccountId)
            set(AudienceCreateRequests.description, entity.description)
        }
    }

}


