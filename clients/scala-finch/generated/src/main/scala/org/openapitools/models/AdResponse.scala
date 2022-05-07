package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdResponseAllOf
import org.openapitools.models.AdResponseAllOf1
import org.openapitools.models.EntityStatus
import org.openapitools.models.PinPromotionSummaryStatus
import org.openapitools.models.TrackingUrls
import scala.collection.immutable.Seq

/**
 * 
 * @param adUnderscoregroupUnderscoreid ID of the ad group that contains the ad.
 * @param androidUnderscoredeepUnderscorelink Deep link URL for Android devices. Not currently available. Using this field will generate an error.
 * @param carouselUnderscoreandroidUnderscoredeepUnderscorelinks Comma-separated deep links for the carousel pin on Android.
 * @param carouselUnderscoredestinationUnderscoreurls Comma-separated destination URLs for the carousel pin to promote.
 * @param carouselUnderscoreiosUnderscoredeepUnderscorelinks Comma-separated deep links for the carousel pin on iOS.
 * @param clickUnderscoretrackingUnderscoreurl Tracking url for the ad clicks.
 * @param creativeUnderscoretype Ad creative type enum
 * @param destinationUnderscoreurl Destination URL.
 * @param iosUnderscoredeepUnderscorelink Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
 * @param isUnderscorepinUnderscoredeleted Is original pin deleted?
 * @param isUnderscoreremovable Is pin repinnable?
 * @param name Name of the ad - 255 chars max.
 * @param pinUnderscoreid Pin ID.
 * @param status 
 * @param trackingUnderscoreurls 
 * @param viewUnderscoretrackingUnderscoreurl Tracking URL for ad impressions.
 * @param adUnderscoreaccountUnderscoreid The ID of the advertiser that this ad belongs to.
 * @param campaignUnderscoreid ID of the ad campaign that contains this ad.
 * @param collectionUnderscoreitemsUnderscoredestinationUnderscoreurlUnderscoretemplate Destination URL template for all items within a collections drawer.
 * @param createdUnderscoretime Pin creation time. Unix timestamp in seconds.
 * @param id The ID of this ad.
 * @param rejectedUnderscorereasons Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
 * @param rejectionUnderscorelabels Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
 * @param reviewUnderscorestatus Ad review status
 * @param _type Always \"ad\".
 * @param updatedUnderscoretime Last update time. Unix timestamp in seconds.
 * @param summaryUnderscorestatus Ad summary status
 */
case class AdResponse(adUnderscoregroupUnderscoreid: Option[String],
                androidUnderscoredeepUnderscorelink: Option[String],
                carouselUnderscoreandroidUnderscoredeepUnderscorelinks: Option[Seq[String]],
                carouselUnderscoredestinationUnderscoreurls: Option[Seq[String]],
                carouselUnderscoreiosUnderscoredeepUnderscorelinks: Option[Seq[String]],
                clickUnderscoretrackingUnderscoreurl: Option[String],
                creativeUnderscoretype: Option[String],
                destinationUnderscoreurl: Option[String],
                iosUnderscoredeepUnderscorelink: Option[String],
                isUnderscorepinUnderscoredeleted: Option[Boolean],
                isUnderscoreremovable: Option[Boolean],
                name: Option[String],
                pinUnderscoreid: Option[String],
                status: Option[EntityStatus],
                trackingUnderscoreurls: Option[TrackingUrls],
                viewUnderscoretrackingUnderscoreurl: Option[String],
                adUnderscoreaccountUnderscoreid: Option[String],
                campaignUnderscoreid: Option[String],
                collectionUnderscoreitemsUnderscoredestinationUnderscoreurlUnderscoretemplate: Option[String],
                createdUnderscoretime: Option[Int],
                id: Option[String],
                rejectedUnderscorereasons: Option[Seq[String]],
                rejectionUnderscorelabels: Option[Seq[String]],
                reviewUnderscorestatus: Option[String],
                _type: Option[String],
                updatedUnderscoretime: Option[Int],
                summaryUnderscorestatus: Option[PinPromotionSummaryStatus]
                )

object AdResponse {
    /**
     * Creates the codec for converting AdResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdResponse] = deriveEncoder
}
