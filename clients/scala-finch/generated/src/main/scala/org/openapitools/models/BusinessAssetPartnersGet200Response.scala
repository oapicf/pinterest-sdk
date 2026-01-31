package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UserSingleAssetBinding
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items List of partners with permissions to the asset.
 */
case class BusinessAssetPartnersGet200Response(bookmark: Option[String],
                items: Seq[UserSingleAssetBinding]
                )

object BusinessAssetPartnersGet200Response {
    /**
     * Creates the codec for converting BusinessAssetPartnersGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[BusinessAssetPartnersGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessAssetPartnersGet200Response] = deriveEncoder
}
