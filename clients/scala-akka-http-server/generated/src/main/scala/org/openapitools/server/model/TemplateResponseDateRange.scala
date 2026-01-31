package org.openapitools.server.model


/**
 * @param absoluteDateRange  for example: ''null''
 * @param dynamicDateRange  for example: ''null''
 * @param relativeDateRange  for example: ''null''
*/
final case class TemplateResponseDateRange (
  absoluteDateRange: Option[TemplateResponseDateRangeAbsoluteDateRange] = None,
  dynamicDateRange: Option[TemplateResponseDateRangeDynamicDateRange] = None,
  relativeDateRange: Option[TemplateResponseDateRangeRelativeDateRange] = None
)

