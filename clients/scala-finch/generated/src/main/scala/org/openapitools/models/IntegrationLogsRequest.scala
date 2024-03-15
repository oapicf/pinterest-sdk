package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.IntegrationLog
import scala.collection.immutable.Seq

/**
 * Batch of logs sent from an integration application.
 * @param logs 
 */
case class IntegrationLogsRequest(logs: Seq[IntegrationLog]
                )

object IntegrationLogsRequest {
    /**
     * Creates the codec for converting IntegrationLogsRequest from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationLogsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationLogsRequest] = deriveEncoder
}
