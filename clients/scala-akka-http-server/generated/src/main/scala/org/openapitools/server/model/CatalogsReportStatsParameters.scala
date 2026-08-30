package org.openapitools.server.model


/**
 * Report stats parameters
 *
 * @param catalogType  for example: ''null''
 * @param report  for example: ''null''
*/
final case class CatalogsReportStatsParameters (
  catalogType: String,
  report: CatalogsHotelReportStatsParametersReport
)

