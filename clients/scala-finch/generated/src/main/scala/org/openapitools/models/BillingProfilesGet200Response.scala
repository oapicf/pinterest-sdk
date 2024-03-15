package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BillingProfilesResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param items 
 * @param bookmark 
 */
case class BillingProfilesGet200Response(items: Seq[BillingProfilesResponse],
                bookmark: Option[String]
                )

object BillingProfilesGet200Response {
    /**
     * Creates the codec for converting BillingProfilesGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[BillingProfilesGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BillingProfilesGet200Response] = deriveEncoder
}
