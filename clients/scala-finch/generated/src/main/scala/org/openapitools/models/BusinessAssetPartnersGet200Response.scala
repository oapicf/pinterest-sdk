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
 * @param items List of partners with permissions to the asset.
 * @param bookmark 
 */
case class BusinessAssetPartnersGet200Response(items: Seq[UserSingleAssetBinding],
                bookmark: Option[String]
                )

object BusinessAssetPartnersGet200Response {
    /**
     * Creates the codec for converting BusinessAssetPartnersGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[BusinessAssetPartnersGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessAssetPartnersGet200Response] = deriveEncoder
}
