package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param assetUnderscoregroupUnderscoreid Asset group id of the exception.
 * @param code Error code associated with the error editing asset group.
 * @param message Error message associated with the error editing asset group.
 */
case class UpdateAssetGroupResponseExceptionsInner(assetUnderscoregroupUnderscoreid: Option[String],
                code: Option[Int],
                message: Option[String]
                )

object UpdateAssetGroupResponseExceptionsInner {
    /**
     * Creates the codec for converting UpdateAssetGroupResponseExceptionsInner from and to JSON.
     */
    implicit val decoder: Decoder[UpdateAssetGroupResponseExceptionsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[UpdateAssetGroupResponseExceptionsInner] = deriveEncoder
}
