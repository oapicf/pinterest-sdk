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
 * Creation fields
 * @param adGroupId ID of the ad group that contains the ad.
 * @param androidDeepLink Deep link URL for Android devices. Not currently available. Using this field will generate an error.
 * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
 * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
 * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
 * @param clickTrackingUrl Tracking url for the ad clicks.
 * @param creativeType Ad creative type enum
 * @param destinationUrl Destination URL.
 * @param iosDeepLink Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
 * @param isPinDeleted Is original pin deleted?
 * @param isRemovable Is pin repinnable?
 * @param name Name of the ad - 255 chars max.
 * @param pinId Pin ID.
 * @param status 
 * @param trackingUrls 
 * @param viewTrackingUrl Tracking URL for ad impressions.
 */
object AdResponseAllOfs : BaseTable<AdResponseAllOf>("AdResponse_allOf") {
    val adGroupId = text("ad_group_id") /* null */ /* ID of the ad group that contains the ad. */
    val androidDeepLink = text("android_deep_link") /* null */ /* Deep link URL for Android devices. Not currently available. Using this field will generate an error. */
    val clickTrackingUrl = text("click_tracking_url") /* null */ /* Tracking url for the ad clicks. */
    val creativeType = text("creative_type").transform({ AdResponseAllOf.CreativeType.valueOf(it ?: "REGULAR") }, { it.value }) /* null */ /* Ad creative type enum */

    val destinationUrl = text("destination_url") /* null */ /* Destination URL. */
    val iosDeepLink = text("ios_deep_link") /* null */ /* Deep link URL for iOS devices. Not currently available. Using this field will generate an error. */
    val isPinDeleted = boolean("is_pin_deleted") /* null */ /* Is original pin deleted? */
    val isRemovable = boolean("is_removable") /* null */ /* Is pin repinnable? */
    val name = text("name") /* null */ /* Name of the ad - 255 chars max. */
    val pinId = text("pin_id") /* null */ /* Pin ID. */
    val status = long("status") /* null */
    val trackingUrls = long("tracking_urls") /* null */
    val viewTrackingUrl = text("view_tracking_url") /* null */ /* Tracking URL for ad impressions. */

    /**
     * Create an entity of type AdResponseAllOf from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AdResponseAllOf(
        adGroupId = row[adGroupId]  /* kotlin.String? */ /* ID of the ad group that contains the ad. */,
        androidDeepLink = row[androidDeepLink]  /* kotlin.String? */ /* Deep link URL for Android devices. Not currently available. Using this field will generate an error. */,
        carouselAndroidDeepLinks = emptyList() /* kotlin.Array<kotlin.String>? */ /* Comma-separated deep links for the carousel pin on Android. */,
        carouselDestinationUrls = emptyList() /* kotlin.Array<kotlin.String>? */ /* Comma-separated destination URLs for the carousel pin to promote. */,
        carouselIosDeepLinks = emptyList() /* kotlin.Array<kotlin.String>? */ /* Comma-separated deep links for the carousel pin on iOS. */,
        clickTrackingUrl = row[clickTrackingUrl]  /* kotlin.String? */ /* Tracking url for the ad clicks. */,
        creativeType = row[creativeType]  /* kotlin.String? */ /* Ad creative type enum */,
        destinationUrl = row[destinationUrl]  /* kotlin.String? */ /* Destination URL. */,
        iosDeepLink = row[iosDeepLink]  /* kotlin.String? */ /* Deep link URL for iOS devices. Not currently available. Using this field will generate an error. */,
        isPinDeleted = row[isPinDeleted]  /* kotlin.Boolean? */ /* Is original pin deleted? */,
        isRemovable = row[isRemovable]  /* kotlin.Boolean? */ /* Is pin repinnable? */,
        name = row[name]  /* kotlin.String? */ /* Name of the ad - 255 chars max. */,
        pinId = row[pinId]  /* kotlin.String? */ /* Pin ID. */,
        status = EntityStatuss.createEntity(row, withReferences) /* EntityStatus? */,
        trackingUrls = TrackingUrlss.createEntity(row, withReferences) /* TrackingUrls? */,
        viewTrackingUrl = row[viewTrackingUrl]  /* kotlin.String? */ /* Tracking URL for ad impressions. */
    )

    /**
    * Assign all the columns from the entity of type AdResponseAllOf to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AdResponseAllOf()
    * database.update(AdResponseAllOfs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AdResponseAllOf) {
        this.apply {
            set(AdResponseAllOfs.adGroupId, entity.adGroupId)
            set(AdResponseAllOfs.androidDeepLink, entity.androidDeepLink)
            set(AdResponseAllOfs.clickTrackingUrl, entity.clickTrackingUrl)
            set(AdResponseAllOfs.creativeType, entity.creativeType)
            set(AdResponseAllOfs.destinationUrl, entity.destinationUrl)
            set(AdResponseAllOfs.iosDeepLink, entity.iosDeepLink)
            set(AdResponseAllOfs.isPinDeleted, entity.isPinDeleted)
            set(AdResponseAllOfs.isRemovable, entity.isRemovable)
            set(AdResponseAllOfs.name, entity.name)
            set(AdResponseAllOfs.pinId, entity.pinId)
            set(AdResponseAllOfs.status, entity.status)
            set(AdResponseAllOfs.trackingUrls, entity.trackingUrls)
            set(AdResponseAllOfs.viewTrackingUrl, entity.viewTrackingUrl)
        }
    }

}


object AdResponseAllOfCarouselAndroidDeepLinks : BaseTable<Pair<kotlin.Long, kotlin.String>>("AdResponseAllOfCarouselAndroidDeepLinks") {
    val adResponseAllOf = long("adResponseAllOf")
    val carouselAndroidDeepLinks = text("carouselAndroidDeepLinks")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[adResponseAllOf] ?: 0, row[carouselAndroidDeepLinks] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(AdResponseAllOfCarouselAndroidDeepLinks.adResponseAllOf, entity.first)
            set(AdResponseAllOfCarouselAndroidDeepLinks.carouselAndroidDeepLinks, entity.second)
        }
    }

}

object AdResponseAllOfCarouselDestinationUrls : BaseTable<Pair<kotlin.Long, kotlin.String>>("AdResponseAllOfCarouselDestinationUrls") {
    val adResponseAllOf = long("adResponseAllOf")
    val carouselDestinationUrls = text("carouselDestinationUrls")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[adResponseAllOf] ?: 0, row[carouselDestinationUrls] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(AdResponseAllOfCarouselDestinationUrls.adResponseAllOf, entity.first)
            set(AdResponseAllOfCarouselDestinationUrls.carouselDestinationUrls, entity.second)
        }
    }

}

object AdResponseAllOfCarouselIosDeepLinks : BaseTable<Pair<kotlin.Long, kotlin.String>>("AdResponseAllOfCarouselIosDeepLinks") {
    val adResponseAllOf = long("adResponseAllOf")
    val carouselIosDeepLinks = text("carouselIosDeepLinks")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[adResponseAllOf] ?: 0, row[carouselIosDeepLinks] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(AdResponseAllOfCarouselIosDeepLinks.adResponseAllOf, entity.first)
            set(AdResponseAllOfCarouselIosDeepLinks.carouselIosDeepLinks, entity.second)
        }
    }

}
