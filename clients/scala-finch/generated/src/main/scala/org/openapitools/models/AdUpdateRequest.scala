package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreativeType
import org.openapitools.models.CustomizableCTAType
import org.openapitools.models.DisclosureType
import org.openapitools.models.EntityStatus
import org.openapitools.models.GridClickType
import org.openapitools.models.QuizPinData
import org.openapitools.models.TrackingUrls
import scala.collection.immutable.Seq

/**
 * 
 * @param adUnderscoregroupUnderscoreid ID of the ad group that contains the ad.
 * @param androidUnderscoredeepUnderscorelink Deep link URL for Android devices.
 * @param carouselUnderscoreandroidUnderscoredeepUnderscorelinks Comma-separated deep links for the carousel pin on Android.
 * @param carouselUnderscoredestinationUnderscoreurls Comma-separated destination URLs for the carousel pin to promote.
 * @param carouselUnderscoreiosUnderscoredeepUnderscorelinks Comma-separated deep links for the carousel pin on iOS.
 * @param clickUnderscoretrackingUnderscoreurl Tracking url for the ad clicks.
 * @param creativeUnderscoretype 
 * @param customizableUnderscorectaUnderscoretype 
 * @param destinationUnderscoreurl Destination URL.
 * @param disclosureUnderscoretype 
 * @param disclosureUnderscoreurl URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
 * @param gridUnderscoreclickUnderscoretype 
 * @param iosUnderscoredeepUnderscorelink Deep link URL for iOS devices.
 * @param isUnderscorepinUnderscoredeleted Is original pin deleted?
 * @param isUnderscoreremovable Is pin repinnable?
 * @param leadUnderscoreformUnderscoreid Lead form ID for lead ad generation.
 * @param name Name of the ad - 255 chars max.
 * @param quizUnderscorepinUnderscoredata Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 * @param status 
 * @param trackingUnderscoreurls 
 * @param viewUnderscoretrackingUnderscoreurl Tracking URL for ad impressions.
 * @param id The ID of this ad.
 * @param pinUnderscoreid Pin ID. This field may only be updated for draft ads.
 */
case class AdUpdateRequest(adUnderscoregroupUnderscoreid: Option[String],
                androidUnderscoredeepUnderscorelink: Option[String],
                carouselUnderscoreandroidUnderscoredeepUnderscorelinks: Option[Seq[String]],
                carouselUnderscoredestinationUnderscoreurls: Option[Seq[String]],
                carouselUnderscoreiosUnderscoredeepUnderscorelinks: Option[Seq[String]],
                clickUnderscoretrackingUnderscoreurl: Option[String],
                creativeUnderscoretype: Option[CreativeType],
                customizableUnderscorectaUnderscoretype: Option[CustomizableCTAType],
                destinationUnderscoreurl: Option[String],
                disclosureUnderscoretype: Option[DisclosureType],
                disclosureUnderscoreurl: Option[String],
                gridUnderscoreclickUnderscoretype: Option[GridClickType],
                iosUnderscoredeepUnderscorelink: Option[String],
                isUnderscorepinUnderscoredeleted: Option[Boolean],
                isUnderscoreremovable: Option[Boolean],
                leadUnderscoreformUnderscoreid: Option[String],
                name: Option[String],
                quizUnderscorepinUnderscoredata: Option[QuizPinData],
                status: Option[EntityStatus],
                trackingUnderscoreurls: Option[TrackingUrls],
                viewUnderscoretrackingUnderscoreurl: Option[String],
                id: String,
                pinUnderscoreid: Option[String]
                )

object AdUpdateRequest {
    /**
     * Creates the codec for converting AdUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdUpdateRequest] = deriveEncoder
}
