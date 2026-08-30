package org.openapitools.server.model


/**
 * @param clickWindowDays  for example: ''null''
 * @param engagementWindowDays  for example: ''null''
 * @param viewWindowDays  for example: ''null''
*/
final case class AttributionWindows (
  clickWindowDays: Option[Int] = None,
  engagementWindowDays: Option[Int] = None,
  viewWindowDays: Option[Int] = None
)

