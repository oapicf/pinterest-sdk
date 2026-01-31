package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Currency
import scala.collection.immutable.Seq

/**
 * Object containing the MSOT conversion events.
 * @param actionUnderscoretimestamps Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
 * @param adUnderscoregroupUnderscoreid The ID of the ad group that was attributed to the conversion event.
 * @param attributionUnderscoremodel The attribution model used to attribute the conversion event.
 * @param attributionUnderscorescope Ad event type.
 * @param attributionUnderscorescore Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
 * @param campaignUnderscoreid The ID of the campaign that was attributed to the conversion event.
 * @param currency 
 * @param eventUnderscoreid A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
 * @param eventUnderscorename Type of user event.
 * @param eventUnderscoretimestamp The time when the event occurred. Unix timestamp in seconds.
 * @param totalUnderscoreeventUnderscoretouchpoints Total number of ad events including other non-Pinterest ad platforms.
 * @param totalUnderscoreevents Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
 * @param value Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
 */
case class ConversionMSOTEvents(actionUnderscoretimestamps: Option[Seq[Long]],
                adUnderscoregroupUnderscoreid: String,
                attributionUnderscoremodel: Option[String],
                attributionUnderscorescope: String,
                attributionUnderscorescore: Option[Double],
                campaignUnderscoreid: Option[String],
                currency: Option[Currency],
                eventUnderscoreid: String,
                eventUnderscorename: String,
                eventUnderscoretimestamp: Long,
                totalUnderscoreeventUnderscoretouchpoints: Option[Int],
                totalUnderscoreevents: Option[Int],
                value: Option[Double]
                )

object ConversionMSOTEvents {
    /**
     * Creates the codec for converting ConversionMSOTEvents from and to JSON.
     */
    implicit val decoder: Decoder[ConversionMSOTEvents] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionMSOTEvents] = deriveEncoder
}
