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
 * 
 * @param items 
 */
object CampaignCreateResponses : BaseTable<CampaignCreateResponse>("CampaignCreateResponse") {

    /**
     * Create an entity of type CampaignCreateResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CampaignCreateResponse(
        items = emptyList() /* kotlin.Array<CampaignCreateResponseItem>? */
    )

    /**
    * Assign all the columns from the entity of type CampaignCreateResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CampaignCreateResponse()
    * database.update(CampaignCreateResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CampaignCreateResponse) {
        this.apply {
        }
    }

}


object CampaignCreateResponseCampaignCreateResponseItem : BaseTable<Pair<kotlin.Long, kotlin.Long>>("CampaignCreateResponseCampaignCreateResponseItem") {
    val campaignCreateResponse = long("campaignCreateResponse")
    val campaignCreateResponseItem = long("campaignCreateResponseItem")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[campaignCreateResponse] ?: 0, row[campaignCreateResponseItem] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(CampaignCreateResponseCampaignCreateResponseItem.campaignCreateResponse, entity.first)
            set(CampaignCreateResponseCampaignCreateResponseItem.campaignCreateResponseItem, entity.second)
        }
    }

}
