package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DetailedError
import org.openapitools.models.Error

/**
 * 
 * @param code 
 * @param message 
 * @param details 
 */
case class IntegrationsLogsPost400Response(code: Int,
                message: String,
                details: Object
                )

object IntegrationsLogsPost400Response {
    /**
     * Creates the codec for converting IntegrationsLogsPost400Response from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationsLogsPost400Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationsLogsPost400Response] = deriveEncoder
}
