package org.openapitools.server.model


/**
 * Derived metrics for an ad campaign.
 *
 * @param cpc Estimated cost per click. for example: ''0.56''
 * @param cpcLower Lower estimate of the cost per click. for example: ''0.47''
 * @param cpcUpper Upper estimate of the cost per click. for example: ''0.65''
 * @param cpm Estimated cost per thousand impressions. for example: ''10''
 * @param cpmLower Lower estimate of cost per thousand impressions. for example: ''8''
 * @param cpmUpper Upper estimate of cost per thousand impressions. for example: ''12''
 * @param lifetimeFrequency Estimated lifetime frequency. for example: ''null''
 * @param lifetimeFrequencyLower Lower estimate of lifetime frequency. for example: ''null''
 * @param lifetimeFrequencyUpper Upper estimate of lifetime frequency. for example: ''null''
 * @param lifetimeImpression Estimated lifetime impressions. for example: ''null''
 * @param lifetimeImpressionLower Lower estimate of lifetime impressions. for example: ''null''
 * @param lifetimeImpressionUpper Upper estimate of lifetime impressions. for example: ''null''
 * @param lifetimeReach Estimated lifetime reach. for example: ''null''
 * @param lifetimeReachLower Lower estimate of lifetime reach. for example: ''null''
 * @param lifetimeReachUpper Upper estimate of lifetime reach. for example: ''null''
 * @param weeklyClick Estimated weekly clicks. for example: ''1000''
 * @param weeklyClickLower Lower estimate of weekly clicks. for example: ''800''
 * @param weeklyClickUpper Upper estimate of weekly clicks. for example: ''1200''
 * @param weeklyFrequency Estimated weekly frequency. for example: ''3''
 * @param weeklyFrequencyLower Lower estimate of weekly frequency. for example: ''2.5''
 * @param weeklyFrequencyUpper Upper estimate of weekly frequency. for example: ''3.5''
 * @param weeklyImpression Estimated weekly impressions. for example: ''400000''
 * @param weeklyImpressionLower Lower estimate of weekly impressions. for example: ''350000''
 * @param weeklyImpressionUpper Upper estimate of weekly impressions. for example: ''450000''
 * @param weeklyReach Estimated weekly reach. for example: ''102074.85050444445''
 * @param weeklyReachLower Lower estimate of weekly reach. for example: ''90000''
 * @param weeklyReachUpper Upper estimate of weekly reach. for example: ''150000''
*/
final case class CampaignDeliveryEstimatesDerivedMetrics (
  cpc: Option[Float] = None,
  cpcLower: Option[Float] = None,
  cpcUpper: Option[Float] = None,
  cpm: Option[Float] = None,
  cpmLower: Option[Float] = None,
  cpmUpper: Option[Float] = None,
  lifetimeFrequency: Option[Float] = None,
  lifetimeFrequencyLower: Option[Float] = None,
  lifetimeFrequencyUpper: Option[Float] = None,
  lifetimeImpression: Option[Float] = None,
  lifetimeImpressionLower: Option[Float] = None,
  lifetimeImpressionUpper: Option[Float] = None,
  lifetimeReach: Option[Float] = None,
  lifetimeReachLower: Option[Float] = None,
  lifetimeReachUpper: Option[Float] = None,
  weeklyClick: Option[Float] = None,
  weeklyClickLower: Option[Float] = None,
  weeklyClickUpper: Option[Float] = None,
  weeklyFrequency: Option[Float] = None,
  weeklyFrequencyLower: Option[Float] = None,
  weeklyFrequencyUpper: Option[Float] = None,
  weeklyImpression: Option[Float] = None,
  weeklyImpressionLower: Option[Float] = None,
  weeklyImpressionUpper: Option[Float] = None,
  weeklyReach: Option[Float] = None,
  weeklyReachLower: Option[Float] = None,
  weeklyReachUpper: Option[Float] = None
)

