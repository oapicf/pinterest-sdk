package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UserWebsiteSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class UserWebsitesGet200Response(items: Seq[UserWebsiteSummary],
                bookmark: Option[String]
                )

object UserWebsitesGet200Response {
    /**
     * Creates the codec for converting UserWebsitesGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[UserWebsitesGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserWebsitesGet200Response] = deriveEncoder
}
