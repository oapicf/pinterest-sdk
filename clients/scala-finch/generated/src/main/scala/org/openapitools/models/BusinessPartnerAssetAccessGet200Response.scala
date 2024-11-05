package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.GetPartnerAssetsResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param items List assets on which you granted access to your partner or assets on which your partner has granted you access.
 * @param bookmark 
 */
case class BusinessPartnerAssetAccessGet200Response(items: Seq[GetPartnerAssetsResponse],
                bookmark: Option[String]
                )

object BusinessPartnerAssetAccessGet200Response {
    /**
     * Creates the codec for converting BusinessPartnerAssetAccessGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[BusinessPartnerAssetAccessGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessPartnerAssetAccessGet200Response] = deriveEncoder
}
