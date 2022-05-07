package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.EntityStatus
import org.openapitools.models.TrackingUrls
import scala.collection.immutable.Seq

/**
 * Creation fields
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
 */
case class AdResponseAllOf(adUnderscoregroupUnderscoreid: Option[String],
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
                viewUnderscoretrackingUnderscoreurl: Option[String]
                )

object AdResponseAllOf {
    /**
     * Creates the codec for converting AdResponseAllOf from and to JSON.
     */
    implicit val decoder: Decoder[AdResponseAllOf] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdResponseAllOf] = deriveEncoder
}
