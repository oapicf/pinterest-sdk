package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param id Unique identifier of a business ad account.
 * @param permissions Permission levels member or partner has on an asset.
 */
case class InviteAssetsSummaryAdAccountsInner(id: Option[String],
                permissions: Option[Seq[String]]
                )

object InviteAssetsSummaryAdAccountsInner {
    /**
     * Creates the codec for converting InviteAssetsSummaryAdAccountsInner from and to JSON.
     */
    implicit val decoder: Decoder[InviteAssetsSummaryAdAccountsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[InviteAssetsSummaryAdAccountsInner] = deriveEncoder
}
