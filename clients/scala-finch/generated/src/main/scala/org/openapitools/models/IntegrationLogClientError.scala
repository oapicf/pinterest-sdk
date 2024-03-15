package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * System error details included in the log sent by the client.
 * @param cause Original cause of the error.
 * @param columnUnderscorenumber Column number in the line of the file that raised the error.
 * @param fileUnderscorename Filename where the error happened.
 * @param lineUnderscorenumber Line number where the error happened.
 * @param message Human-readable description of the error.
 * @param messageUnderscoredetail More detail about the message.
 * @param name Filename where the error happened.
 * @param number Integer that specifies the error code.
 * @param stackUnderscoretrace Stack trace of where the error happened.
 */
case class IntegrationLogClientError(cause: Option[String],
                columnUnderscorenumber: Option[Int],
                fileUnderscorename: Option[String],
                lineUnderscorenumber: Option[Int],
                message: Option[String],
                messageUnderscoredetail: Option[String],
                name: Option[String],
                number: Option[Int],
                stackUnderscoretrace: Option[String]
                )

object IntegrationLogClientError {
    /**
     * Creates the codec for converting IntegrationLogClientError from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationLogClientError] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationLogClientError] = deriveEncoder
}
