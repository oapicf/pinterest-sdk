package org.openapitools.server.model


/**
 * @param reportType  for example: ''null''
 * @param catalogId ID of the catalog entity. for example: ''null''
 * @param code The event code that a diagnostics aggregated number references for example: ''null''
 * @param codeLabel A human-friendly label for the event code (e.g, 'SPAM') for example: ''SPAM''
 * @param message Title message describing the diagnostic issue for example: ''null''
 * @param occurrences Number of occurrences of the issue for example: ''10''
 * @param ineligibleForAds Indicates if issue makes items ineligible for ads distribution for example: ''true''
 * @param ineligibleForOrganic Indicates if issue makes items ineligible for organic distribution for example: ''true''
*/
final case class CatalogsReportDistributionStats (
  reportType: Option[String] = None,
  catalogId: Option[String] = None,
  code: Option[Int] = None,
  codeLabel: Option[String] = None,
  message: Option[String] = None,
  occurrences: Option[Int] = None,
  ineligibleForAds: Option[Boolean] = None,
  ineligibleForOrganic: Option[Boolean] = None
)

