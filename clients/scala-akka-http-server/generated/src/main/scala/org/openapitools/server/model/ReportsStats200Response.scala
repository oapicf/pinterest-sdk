package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class ReportsStats200Response (
  items: Seq[CatalogsReportStats],
  bookmark: Option[String] = None
)

