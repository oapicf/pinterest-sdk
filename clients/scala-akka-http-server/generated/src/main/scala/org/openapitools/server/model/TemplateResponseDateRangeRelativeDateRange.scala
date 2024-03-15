package org.openapitools.server.model


/**
 * The relative date range of the template
 *
 * @param `type` The date range type for example: ''relative''
 * @param startDaysInPast The start date of the date range for example: ''14''
 * @param endDaysInPast The end date of the date range for example: ''7''
*/
final case class TemplateResponseDateRangeRelativeDateRange (
  `type`: Option[String] = None,
  startDaysInPast: Option[Double] = None,
  endDaysInPast: Option[Double] = None
)

