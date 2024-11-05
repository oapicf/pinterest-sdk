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
case class BusinessMemberAssetsSummaryAdAccountsInner(id: Option[String],
                permissions: Option[Seq[String]]
                )

object BusinessMemberAssetsSummaryAdAccountsInner {
    /**
     * Creates the codec for converting BusinessMemberAssetsSummaryAdAccountsInner from and to JSON.
     */
    implicit val decoder: Decoder[BusinessMemberAssetsSummaryAdAccountsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessMemberAssetsSummaryAdAccountsInner] = deriveEncoder
}
