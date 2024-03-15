package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.IntegrationLogsInvalidLogResponseRejectedLogsInner
import scala.collection.immutable.Seq

/**
 * Schema describing the response when a log has invalid fields.
 * @param rejectedUnderscorelogs 
 */
case class IntegrationLogsInvalidLogResponse(rejectedUnderscorelogs: Option[Seq[IntegrationLogsInvalidLogResponseRejectedLogsInner]]
                )

object IntegrationLogsInvalidLogResponse {
    /**
     * Creates the codec for converting IntegrationLogsInvalidLogResponse from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationLogsInvalidLogResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationLogsInvalidLogResponse] = deriveEncoder
}
