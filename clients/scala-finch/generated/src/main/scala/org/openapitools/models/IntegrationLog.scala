package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.IntegrationLogClientError
import org.openapitools.models.IntegrationLogClientRequest

/**
 * Schema for log sent from an integration application.
 * @param advertiserUnderscoreid 
 * @param appUnderscoreversionUnderscorenumber Version number of the integration application.
 * @param clientUnderscoretimestamp Timestamp in milliseconds of when the log was executed at the client.
 * @param error 
 * @param eventUnderscoretype Log event type
 * @param externalUnderscorebusinessUnderscoreid 
 * @param feedUnderscoreprofileUnderscoreid 
 * @param logUnderscorelevel Log level type
 * @param merchantUnderscoreid 
 * @param message Explanation of the event that occured.
 * @param platformUnderscoreversionUnderscorenumber Version number of the platform the integration application is running on.
 * @param request 
 * @param tagUnderscoreid 
 */
case class IntegrationLog(advertiserUnderscoreid: Option[String],
                appUnderscoreversionUnderscorenumber: Option[String],
                clientUnderscoretimestamp: Int,
                error: Option[IntegrationLogClientError],
                eventUnderscoretype: String,
                externalUnderscorebusinessUnderscoreid: Option[String],
                feedUnderscoreprofileUnderscoreid: Option[String],
                logUnderscorelevel: String,
                merchantUnderscoreid: Option[String],
                message: Option[String],
                platformUnderscoreversionUnderscorenumber: Option[String],
                request: Option[IntegrationLogClientRequest],
                tagUnderscoreid: Option[String]
                )

object IntegrationLog {
    /**
     * Creates the codec for converting IntegrationLog from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationLog] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationLog] = deriveEncoder
}
