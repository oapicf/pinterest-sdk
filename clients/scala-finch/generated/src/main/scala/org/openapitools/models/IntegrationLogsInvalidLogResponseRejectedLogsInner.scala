package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param logUnderscoreindex Index of the log in the batch.
 * @param field The field name containing an invalid value.
 * @param value The value that is invalid.
 * @param reason The reason the value is invalid.
 */
case class IntegrationLogsInvalidLogResponseRejectedLogsInner(logUnderscoreindex: Option[Int],
                field: String,
                value: String,
                reason: String
                )

object IntegrationLogsInvalidLogResponseRejectedLogsInner {
    /**
     * Creates the codec for converting IntegrationLogsInvalidLogResponseRejectedLogsInner from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationLogsInvalidLogResponseRejectedLogsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationLogsInvalidLogResponseRejectedLogsInner] = deriveEncoder
}
