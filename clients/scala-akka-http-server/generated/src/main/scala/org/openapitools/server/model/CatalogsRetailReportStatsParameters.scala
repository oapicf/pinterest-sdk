package org.openapitools.server.model


/**
 * Parameters for retail report
 *
 * @param catalogType  for example: ''null''
 * @param report  for example: ''null''
*/
final case class CatalogsRetailReportStatsParameters (
  catalogType: String,
  report: CatalogsRetailReportStatsParametersReport
)

