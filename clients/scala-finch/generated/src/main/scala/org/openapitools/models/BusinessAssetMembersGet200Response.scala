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
 * @param items List of members with permissions to the asset.
 * @param bookmark 
 */
case class BusinessAssetMembersGet200Response(items: Seq[UserSingleAssetBinding],
                bookmark: Option[String]
                )

object BusinessAssetMembersGet200Response {
    /**
     * Creates the codec for converting BusinessAssetMembersGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[BusinessAssetMembersGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessAssetMembersGet200Response] = deriveEncoder
}
