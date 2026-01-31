package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * HTTP request details included in the log sent by the client.
 * @param host HTTP request host from host header.
 * @param method 
 * @param path HTTP request path.
 * @param requestUnderscoreheaders HTTP request headers as key-value pairs.
 * @param responseUnderscoreheaders HTTP response headers as key-value pairs.
 * @param responseUnderscorestatusUnderscorecode 
 */
case class IntegrationLogClientRequest(host: String,
                method: String,
                path: String,
                requestUnderscoreheaders: Option[Map[String, String]],
                responseUnderscoreheaders: Option[Map[String, String]],
                responseUnderscorestatusUnderscorecode: Option[Int]
                )

object IntegrationLogClientRequest {
    /**
     * Creates the codec for converting IntegrationLogClientRequest from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationLogClientRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationLogClientRequest] = deriveEncoder
}
