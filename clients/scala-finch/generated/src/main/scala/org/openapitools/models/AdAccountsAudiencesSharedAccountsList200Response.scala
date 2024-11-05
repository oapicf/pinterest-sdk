package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.SharedAudienceAccount
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class AdAccountsAudiencesSharedAccountsList200Response(items: Seq[SharedAudienceAccount],
                bookmark: Option[String]
                )

object AdAccountsAudiencesSharedAccountsList200Response {
    /**
     * Creates the codec for converting AdAccountsAudiencesSharedAccountsList200Response from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountsAudiencesSharedAccountsList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountsAudiencesSharedAccountsList200Response] = deriveEncoder
}
