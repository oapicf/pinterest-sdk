package org.openapitools.server.model


/**
 * Pinterest Performance+ campaign settings.
 *
 * @param boostProspectingAdGroupBid Whether to boost prospecting ad group bid. for example: ''null''
 * @param pinnerListExclusions List of campaign-level exclusion pinner list IDs. for example: ''null''
*/
final case class PerformancePlusCampaignSettings (
  boostProspectingAdGroupBid: Option[Boolean] = None,
  pinnerListExclusions: Option[Seq[String]] = None
)

