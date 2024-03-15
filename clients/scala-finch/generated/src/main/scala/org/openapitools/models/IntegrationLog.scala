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
 * @param clientUnderscoretimestamp Timestamp in milliseconds of when the log was executed at the client.
 * @param eventUnderscoretype Log event type
 * @param logUnderscorelevel Log level type
 * @param externalUnderscorebusinessUnderscoreid 
 * @param advertiserUnderscoreid 
 * @param merchantUnderscoreid 
 * @param tagUnderscoreid 
 * @param feedUnderscoreprofileUnderscoreid 
 * @param message Explanation of the event that occured.
 * @param appUnderscoreversionUnderscorenumber Version number of the integration application.
 * @param platformUnderscoreversionUnderscorenumber Version number of the platform the integration application is running on.
 * @param error 
 * @param request 
 */
case class IntegrationLog(clientUnderscoretimestamp: Int,
                eventUnderscoretype: String,
                logUnderscorelevel: String,
                externalUnderscorebusinessUnderscoreid: Option[String],
                advertiserUnderscoreid: Option[String],
                merchantUnderscoreid: Option[String],
                tagUnderscoreid: Option[String],
                feedUnderscoreprofileUnderscoreid: Option[String],
                message: Option[String],
                appUnderscoreversionUnderscorenumber: Option[String],
                platformUnderscoreversionUnderscorenumber: Option[String],
                error: Option[IntegrationLogClientError],
                request: Option[IntegrationLogClientRequest]
                )

object IntegrationLog {
    /**
     * Creates the codec for converting IntegrationLog from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationLog] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationLog] = deriveEncoder
}
