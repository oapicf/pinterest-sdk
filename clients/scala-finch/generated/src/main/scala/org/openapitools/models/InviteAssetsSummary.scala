package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.InviteAssetsSummaryAdAccountsInner
import org.openapitools.models.InviteAssetsSummaryProfilesInner
import scala.collection.immutable.Seq

/**
 * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
 * @param adUnderscoreaccounts List of ad account IDs and respective permission levels that will be assigned.
 * @param profiles List of profile IDs and respective permission levels that will be assigned.
 */
case class InviteAssetsSummary(adUnderscoreaccounts: Option[Seq[InviteAssetsSummaryAdAccountsInner]],
                profiles: Option[Seq[InviteAssetsSummaryProfilesInner]]
                )

object InviteAssetsSummary {
    /**
     * Creates the codec for converting InviteAssetsSummary from and to JSON.
     */
    implicit val decoder: Decoder[InviteAssetsSummary] = deriveDecoder
    implicit val encoder: ObjectEncoder[InviteAssetsSummary] = deriveEncoder
}
