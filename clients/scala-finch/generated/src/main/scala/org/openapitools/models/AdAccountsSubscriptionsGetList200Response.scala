package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdAccountGetSubscriptionResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class AdAccountsSubscriptionsGetList200Response(items: Seq[AdAccountGetSubscriptionResponse],
                bookmark: Option[String]
                )

object AdAccountsSubscriptionsGetList200Response {
    /**
     * Creates the codec for converting AdAccountsSubscriptionsGetList200Response from and to JSON.
     */
    implicit val decoder: Decoder[AdAccountsSubscriptionsGetList200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdAccountsSubscriptionsGetList200Response] = deriveEncoder
}
