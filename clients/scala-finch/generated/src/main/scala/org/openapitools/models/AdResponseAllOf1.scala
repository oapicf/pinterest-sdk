package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PinPromotionSummaryStatus
import scala.collection.immutable.Seq

/**
 * 
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
case class AdResponseAllOf1(adUnderscoreaccountUnderscoreid: Option[String],
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

object AdResponseAllOf1 {
    /**
     * Creates the codec for converting AdResponseAllOf1 from and to JSON.
     */
    implicit val decoder: Decoder[AdResponseAllOf1] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdResponseAllOf1] = deriveEncoder
}
