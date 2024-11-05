package org.openapitools.server.model


/**
 * Report parameters
 *
 * @param catalogType  for example: ''null''
 * @param report  for example: ''null''
*/
final case class CatalogsReportParameters (
  catalogType: CatalogsType,
  report: CatalogsHotelReportParametersReport
)

