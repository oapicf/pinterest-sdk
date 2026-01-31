package org.openapitools.server.model


/**
 * The relative date range of the template
 *
 * @param endDaysInPast The end date of the date range for example: ''7''
 * @param startDaysInPast The start date of the date range for example: ''14''
 * @param `type` The date range type for example: ''relative''
*/
final case class TemplateResponseDateRangeRelativeDateRange (
  endDaysInPast: Option[Double] = None,
  startDaysInPast: Option[Double] = None,
  `type`: Option[String] = None
)

