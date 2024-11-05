package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 * @param inviteUnderscoreorUnderscorerequestUnderscoreid Unique identifier of the invite/request.
 * @param code Error code associated with the error in performing the action on the invite/request.
 * @param message Error message associated with the error in performing the action on the invite/request.
 * @param usersUnderscoreorUnderscorepartnerUnderscoreids A list of users' usernames or emails OR a list of partner ids that caused the error.
 */
case class InviteExceptionResponse(inviteUnderscoreorUnderscorerequestUnderscoreid: Option[String],
                code: Option[Int],
                message: Option[String],
                usersUnderscoreorUnderscorepartnerUnderscoreids: Option[Seq[String]]
                )

object InviteExceptionResponse {
    /**
     * Creates the codec for converting InviteExceptionResponse from and to JSON.
     */
    implicit val decoder: Decoder[InviteExceptionResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[InviteExceptionResponse] = deriveEncoder
}
