package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BusinessAccessUserSummary
import scala.collection.immutable.Seq

/**
 * An object containing the permissions a business member/partner has on the asset.
 * @param permissions Permission levels member or partner has on an asset.
 * @param user 
 */
case class UserSingleAssetBinding(permissions: Option[Seq[String]],
                user: Option[BusinessAccessUserSummary]
                )

object UserSingleAssetBinding {
    /**
     * Creates the codec for converting UserSingleAssetBinding from and to JSON.
     */
    implicit val decoder: Decoder[UserSingleAssetBinding] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserSingleAssetBinding] = deriveEncoder
}
