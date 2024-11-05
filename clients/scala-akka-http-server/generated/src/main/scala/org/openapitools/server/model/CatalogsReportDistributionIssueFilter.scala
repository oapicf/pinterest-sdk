package org.openapitools.server.model


/**
 * @param reportType  for example: ''null''
 * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used for example: ''null''
*/
final case class CatalogsReportDistributionIssueFilter (
  reportType: String,
  catalogId: Option[String] = None
)

