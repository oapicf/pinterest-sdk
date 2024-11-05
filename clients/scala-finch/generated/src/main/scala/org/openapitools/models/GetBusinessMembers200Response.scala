package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UserBusinessRoleBinding
import scala.collection.immutable.Seq

/**
 * 
 * @param items List of business members.
 * @param bookmark 
 */
case class GetBusinessMembers200Response(items: Seq[UserBusinessRoleBinding],
                bookmark: Option[String]
                )

object GetBusinessMembers200Response {
    /**
     * Creates the codec for converting GetBusinessMembers200Response from and to JSON.
     */
    implicit val decoder: Decoder[GetBusinessMembers200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetBusinessMembers200Response] = deriveEncoder
}
