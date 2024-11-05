package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BusinessMemberAssetsSummaryAdAccountsInner
import org.openapitools.models.BusinessMemberAssetsSummaryProfilesInner
import scala.collection.immutable.Seq

/**
 * Ad accounts and profiles the business member/partner has access to.
 * @param adUnderscoreaccounts List of ad account IDs and respective permission levels.
 * @param profiles List of profile IDs and respective permission levels.
 */
case class BusinessMemberAssetsSummary(adUnderscoreaccounts: Option[Seq[BusinessMemberAssetsSummaryAdAccountsInner]],
                profiles: Option[Seq[BusinessMemberAssetsSummaryProfilesInner]]
                )

object BusinessMemberAssetsSummary {
    /**
     * Creates the codec for converting BusinessMemberAssetsSummary from and to JSON.
     */
    implicit val decoder: Decoder[BusinessMemberAssetsSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[BusinessMemberAssetsSummary] = deriveEncoder
}
