/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.3.0
* Contact: pinterest-api@pinterest.com
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
 * @param adAccountId The ID of the advertiser that this ad belongs to.
 * @param campaignId ID of the ad campaign that contains this ad.
 * @param collectionItemsDestinationUrlTemplate Destination URL template for all items within a collections drawer.
 * @param createdTime Pin creation time. Unix timestamp in seconds.
 * @param id The ID of this ad.
 * @param rejectedReasons Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
 * @param rejectionLabels Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
 * @param reviewStatus Ad review status
 * @param type Always \"ad\".
 * @param updatedTime Last update time. Unix timestamp in seconds.
 * @param summaryStatus Ad summary status
 */
object AdResponseAllOf1s : BaseTable<AdResponseAllOf1>("AdResponse_allOf_1") {
    val adAccountId = text("ad_account_id") /* null */ /* The ID of the advertiser that this ad belongs to. */
    val campaignId = text("campaign_id") /* null */ /* ID of the ad campaign that contains this ad. */
    val collectionItemsDestinationUrlTemplate = text("collection_items_destination_url_template") /* null */ /* Destination URL template for all items within a collections drawer. */
    val createdTime = int("created_time") /* null */ /* Pin creation time. Unix timestamp in seconds. */
    val id = text("id") /* null */ /* The ID of this ad. */
    val reviewStatus = text("review_status").transform({ AdResponseAllOf1.ReviewStatus.valueOf(it ?: "OTHER") }, { it.value }) /* null */ /* Ad review status */

    val type = text("type") /* null */ /* Always \"ad\". */
    val updatedTime = int("updated_time") /* null */ /* Last update time. Unix timestamp in seconds. */
    val summaryStatus = long("summary_status") /* null */ /* Ad summary status */

    /**
     * Create an entity of type AdResponseAllOf1 from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AdResponseAllOf1(
        adAccountId = row[adAccountId]  /* kotlin.String? */ /* The ID of the advertiser that this ad belongs to. */,
        campaignId = row[campaignId]  /* kotlin.String? */ /* ID of the ad campaign that contains this ad. */,
        collectionItemsDestinationUrlTemplate = row[collectionItemsDestinationUrlTemplate]  /* kotlin.String? */ /* Destination URL template for all items within a collections drawer. */,
        createdTime = row[createdTime]  /* kotlin.Int? */ /* Pin creation time. Unix timestamp in seconds. */,
        id = row[id]  /* kotlin.String? */ /* The ID of this ad. */,
        rejectedReasons = emptyList() /* kotlin.Array<kotlin.String>? */ /* Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */,
        rejectionLabels = emptyList() /* kotlin.Array<kotlin.String>? */ /* Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */,
        reviewStatus = row[reviewStatus]  /* kotlin.String? */ /* Ad review status */,
        type = row[type]  /* kotlin.String? */ /* Always \"ad\". */,
        updatedTime = row[updatedTime]  /* kotlin.Int? */ /* Last update time. Unix timestamp in seconds. */,
        summaryStatus = PinPromotionSummaryStatuss.createEntity(row, withReferences) /* PinPromotionSummaryStatus? */ /* Ad summary status */
    )

    /**
    * Assign all the columns from the entity of type AdResponseAllOf1 to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AdResponseAllOf1()
    * database.update(AdResponseAllOf1s, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AdResponseAllOf1) {
        this.apply {
            set(AdResponseAllOf1s.adAccountId, entity.adAccountId)
            set(AdResponseAllOf1s.campaignId, entity.campaignId)
            set(AdResponseAllOf1s.collectionItemsDestinationUrlTemplate, entity.collectionItemsDestinationUrlTemplate)
            set(AdResponseAllOf1s.createdTime, entity.createdTime)
            set(AdResponseAllOf1s.id, entity.id)
            set(AdResponseAllOf1s.reviewStatus, entity.reviewStatus)
            set(AdResponseAllOf1s.type, entity.type)
            set(AdResponseAllOf1s.updatedTime, entity.updatedTime)
            set(AdResponseAllOf1s.summaryStatus, entity.summaryStatus)
        }
    }

}


object AdResponseAllOf1RejectedReasons : BaseTable<Pair<kotlin.Long, kotlin.String>>("AdResponseAllOf1RejectedReasons") {
    val adResponseAllOf1 = long("adResponseAllOf1")
    val rejectedReasons = text("rejectedReasons")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[adResponseAllOf1] ?: 0, row[rejectedReasons] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(AdResponseAllOf1RejectedReasons.adResponseAllOf1, entity.first)
            set(AdResponseAllOf1RejectedReasons.rejectedReasons, entity.second)
        }
    }

}

object AdResponseAllOf1RejectionLabels : BaseTable<Pair<kotlin.Long, kotlin.String>>("AdResponseAllOf1RejectionLabels") {
    val adResponseAllOf1 = long("adResponseAllOf1")
    val rejectionLabels = text("rejectionLabels")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[adResponseAllOf1] ?: 0, row[rejectionLabels] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(AdResponseAllOf1RejectionLabels.adResponseAllOf1, entity.first)
            set(AdResponseAllOf1RejectionLabels.rejectionLabels, entity.second)
        }
    }

}
