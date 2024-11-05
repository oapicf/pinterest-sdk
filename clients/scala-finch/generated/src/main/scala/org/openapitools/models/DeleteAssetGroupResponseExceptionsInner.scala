package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param code Error code associated with the error deleting asset group.
 * @param message Error message associated with the error deleting asset group.
 * @param assetUnderscoregroupUnderscoreid Asset group id of the exception.
 */
case class DeleteAssetGroupResponseExceptionsInner(code: Option[Int],
                message: Option[String],
                assetUnderscoregroupUnderscoreid: Option[String]
                )

object DeleteAssetGroupResponseExceptionsInner {
    /**
     * Creates the codec for converting DeleteAssetGroupResponseExceptionsInner from and to JSON.
     */
    implicit val decoder: Decoder[DeleteAssetGroupResponseExceptionsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[DeleteAssetGroupResponseExceptionsInner] = deriveEncoder
}
