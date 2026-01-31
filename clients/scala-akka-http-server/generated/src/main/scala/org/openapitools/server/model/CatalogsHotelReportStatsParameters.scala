package org.openapitools.server.model


/**
 * Parameters for hotel report
 *
 * @param catalogType  for example: ''null''
 * @param report  for example: ''null''
*/
final case class CatalogsHotelReportStatsParameters (
  catalogType: String,
  report: CatalogsHotelReportStatsParametersReport
)

