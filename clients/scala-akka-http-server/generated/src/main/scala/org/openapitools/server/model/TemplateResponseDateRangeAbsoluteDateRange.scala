package org.openapitools.server.model


/**
 * The absolute date range of the template
 *
 * @param `type` The date range type for example: ''absolute''
 * @param startDate The start date of the date range for example: ''0.8008281904610115''
 * @param endDate The end date of the date range for example: ''6.027456183070403''
*/
final case class TemplateResponseDateRangeAbsoluteDateRange (
  `type`: Option[String] = None,
  startDate: Option[Double] = None,
  endDate: Option[Double] = None
)

