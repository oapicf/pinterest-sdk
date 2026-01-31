package org.openapitools.server.model


/**
 * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used for example: ''null''
 * @param reportType  for example: ''null''
*/
final case class CatalogsReportDistributionIssueFilter (
  catalogId: Option[String] = None,
  reportType: String
)

