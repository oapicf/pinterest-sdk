package org.openapitools.server.model


/**
 * Parameters for hotel report
 *
 * @param catalogType  for example: ''null''
 * @param report  for example: ''null''
*/
final case class CatalogsHotelReportParameters (
  catalogType: String,
  report: CatalogsHotelReportParametersReport
)

