package org.openapitools.server.model


/**
 * The absolute date range of the template
 *
 * @param endDate The end date of the date range for example: ''6.027456183070403''
 * @param startDate The start date of the date range for example: ''0.8008281904610115''
 * @param `type` The date range type for example: ''absolute''
*/
final case class TemplateResponseDateRangeAbsoluteDateRange (
  endDate: Option[Double] = None,
  startDate: Option[Double] = None,
  `type`: Option[String] = None
)

