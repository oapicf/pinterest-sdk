package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Response when logs are successfully processed.
 * @param message 
 */
case class IntegrationLogsSuccessResponse(message: Option[String]
                )

object IntegrationLogsSuccessResponse {
    /**
     * Creates the codec for converting IntegrationLogsSuccessResponse from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationLogsSuccessResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationLogsSuccessResponse] = deriveEncoder
}
