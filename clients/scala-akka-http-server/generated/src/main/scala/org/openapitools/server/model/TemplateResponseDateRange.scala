package org.openapitools.server.model


/**
 * @param dynamicDateRange  for example: ''null''
 * @param relativeDateRange  for example: ''null''
 * @param absoluteDateRange  for example: ''null''
*/
final case class TemplateResponseDateRange (
  dynamicDateRange: Option[TemplateResponseDateRangeDynamicDateRange] = None,
  relativeDateRange: Option[TemplateResponseDateRangeRelativeDateRange] = None,
  absoluteDateRange: Option[TemplateResponseDateRangeAbsoluteDateRange] = None
)

