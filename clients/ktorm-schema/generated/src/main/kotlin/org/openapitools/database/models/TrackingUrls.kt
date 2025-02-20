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
 * Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 * @param impression 
 * @param click 
 * @param engagement 
 * @param buyableButton 
 * @param audienceVerification 
 */
object TrackingUrlss : BaseTable<TrackingUrls>("TrackingUrls") {

    /**
     * Create an entity of type TrackingUrls from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = TrackingUrls(
        impression = emptyList() /* kotlin.Array<kotlin.String>? */,
        click = emptyList() /* kotlin.Array<kotlin.String>? */,
        engagement = emptyList() /* kotlin.Array<kotlin.String>? */,
        buyableButton = emptyList() /* kotlin.Array<kotlin.String>? */,
        audienceVerification = emptyList() /* kotlin.Array<kotlin.String>? */
    )

    /**
    * Assign all the columns from the entity of type TrackingUrls to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = TrackingUrls()
    * database.update(TrackingUrlss, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: TrackingUrls) {
        this.apply {
        }
    }

}


object TrackingUrlsImpression : BaseTable<Pair<kotlin.Long, kotlin.String>>("TrackingUrlsImpression") {
    val trackingUrls = long("trackingUrls")
    val impression = text("impression")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[trackingUrls] ?: 0, row[impression] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TrackingUrlsImpression.trackingUrls, entity.first)
            set(TrackingUrlsImpression.impression, entity.second)
        }
    }

}

object TrackingUrlsClick : BaseTable<Pair<kotlin.Long, kotlin.String>>("TrackingUrlsClick") {
    val trackingUrls = long("trackingUrls")
    val click = text("click")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[trackingUrls] ?: 0, row[click] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TrackingUrlsClick.trackingUrls, entity.first)
            set(TrackingUrlsClick.click, entity.second)
        }
    }

}

object TrackingUrlsEngagement : BaseTable<Pair<kotlin.Long, kotlin.String>>("TrackingUrlsEngagement") {
    val trackingUrls = long("trackingUrls")
    val engagement = text("engagement")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[trackingUrls] ?: 0, row[engagement] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TrackingUrlsEngagement.trackingUrls, entity.first)
            set(TrackingUrlsEngagement.engagement, entity.second)
        }
    }

}

object TrackingUrlsBuyableButton : BaseTable<Pair<kotlin.Long, kotlin.String>>("TrackingUrlsBuyableButton") {
    val trackingUrls = long("trackingUrls")
    val buyableButton = text("buyableButton")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[trackingUrls] ?: 0, row[buyableButton] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TrackingUrlsBuyableButton.trackingUrls, entity.first)
            set(TrackingUrlsBuyableButton.buyableButton, entity.second)
        }
    }

}

object TrackingUrlsAudienceVerification : BaseTable<Pair<kotlin.Long, kotlin.String>>("TrackingUrlsAudienceVerification") {
    val trackingUrls = long("trackingUrls")
    val audienceVerification = text("audienceVerification")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[trackingUrls] ?: 0, row[audienceVerification] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(TrackingUrlsAudienceVerification.trackingUrls, entity.first)
            set(TrackingUrlsAudienceVerification.audienceVerification, entity.second)
        }
    }

}

