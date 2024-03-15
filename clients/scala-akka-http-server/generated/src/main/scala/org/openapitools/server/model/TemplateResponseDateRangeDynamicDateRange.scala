package org.openapitools.server.model


/**
 * The dynamic date range of the template
 *
 * @param `type` The date range type for example: ''dynamic''
 * @param range The dynamic range type for example: ''YEAR_TO_DATE''
*/
final case class TemplateResponseDateRangeDynamicDateRange (
  `type`: Option[String] = None,
  range: Option[String] = None
)

