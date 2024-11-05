package org.openapitools.server.model


/**
 * @param reportStatus  for example: ''null''
 * @param url URL to download the report for example: ''null''
 * @param size Size of the report in bytes for example: ''null''
*/
final case class CatalogsReport (
  reportStatus: Option[String] = None,
  url: Option[String] = None,
  size: Option[Double] = None
)

