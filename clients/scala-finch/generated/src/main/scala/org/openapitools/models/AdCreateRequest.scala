package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdCommonQuizPinData
import org.openapitools.models.AdCommonTrackingUrls
import org.openapitools.models.CreativeType
import org.openapitools.models.EntityStatus
import org.openapitools.models.GridClickType
import scala.collection.immutable.Seq

/**
 * 
 * @param adUnderscoregroupUnderscoreid ID of the ad group that contains the ad.
 * @param androidUnderscoredeepUnderscorelink Deep link URL for Android devices. Not currently available. Using this field will generate an error.
 * @param carouselUnderscoreandroidUnderscoredeepUnderscorelinks Comma-separated deep links for the carousel pin on Android.
 * @param carouselUnderscoredestinationUnderscoreurls Comma-separated destination URLs for the carousel pin to promote.
 * @param carouselUnderscoreiosUnderscoredeepUnderscorelinks Comma-separated deep links for the carousel pin on iOS.
 * @param clickUnderscoretrackingUnderscoreurl Tracking url for the ad clicks.
 * @param creativeUnderscoretype 
 * @param destinationUnderscoreurl Destination URL.
 * @param iosUnderscoredeepUnderscorelink Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
 * @param isUnderscorepinUnderscoredeleted Is original pin deleted?
 * @param isUnderscoreremovable Is pin repinnable?
 * @param name Name of the ad - 255 chars max.
 * @param status 
 * @param trackingUnderscoreurls 
 * @param viewUnderscoretrackingUnderscoreurl Tracking URL for ad impressions.
 * @param leadUnderscoreformUnderscoreid Lead form ID for lead ad generation.
 * @param gridUnderscoreclickUnderscoretype 
 * @param customizableUnderscorectaUnderscoretype Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
 * @param quizUnderscorepinUnderscoredata 
 * @param pinUnderscoreid Pin ID.
 */
case class AdCreateRequest(adUnderscoregroupUnderscoreid: String,
                androidUnderscoredeepUnderscorelink: Option[String],
                carouselUnderscoreandroidUnderscoredeepUnderscorelinks: Option[Seq[String]],
                carouselUnderscoredestinationUnderscoreurls: Option[Seq[String]],
                carouselUnderscoreiosUnderscoredeepUnderscorelinks: Option[Seq[String]],
                clickUnderscoretrackingUnderscoreurl: Option[String],
                creativeUnderscoretype: CreativeType,
                destinationUnderscoreurl: Option[String],
                iosUnderscoredeepUnderscorelink: Option[String],
                isUnderscorepinUnderscoredeleted: Option[Boolean],
                isUnderscoreremovable: Option[Boolean],
                name: Option[String],
                status: Option[EntityStatus],
                trackingUnderscoreurls: Option[AdCommonTrackingUrls],
                viewUnderscoretrackingUnderscoreurl: Option[String],
                leadUnderscoreformUnderscoreid: Option[String],
                gridUnderscoreclickUnderscoretype: Option[GridClickType],
                customizableUnderscorectaUnderscoretype: Option[String],
                quizUnderscorepinUnderscoredata: Option[AdCommonQuizPinData],
                pinUnderscoreid: String
                )

object AdCreateRequest {
    /**
     * Creates the codec for converting AdCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdCreateRequest] = deriveEncoder
}
