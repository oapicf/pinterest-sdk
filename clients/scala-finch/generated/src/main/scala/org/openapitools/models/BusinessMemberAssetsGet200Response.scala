package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AssetIdPermissions
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items List asset permissions the given member was granted.
 */
case class BusinessMemberAssetsGet200Response(bookmark: Option[String],
                items: Seq[AssetIdPermissions]
                )

object BusinessMemberAssetsGet200Response {
    /**
     * Creates the codec for converting BusinessMemberAssetsGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[BusinessMemberAssetsGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessMemberAssetsGet200Response] = deriveEncoder
}
