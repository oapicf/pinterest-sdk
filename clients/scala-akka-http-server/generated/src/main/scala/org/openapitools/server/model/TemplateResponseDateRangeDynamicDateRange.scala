package org.openapitools.server.model


/**
 * The dynamic date range of the template
 *
 * @param range The dynamic range type for example: ''YEAR_TO_DATE''
 * @param `type` The date range type for example: ''dynamic''
*/
final case class TemplateResponseDateRangeDynamicDateRange (
  range: Option[String] = None,
  `type`: Option[String] = None
)

