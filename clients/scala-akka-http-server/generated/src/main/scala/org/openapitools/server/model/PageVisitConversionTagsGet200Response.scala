package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class PageVisitConversionTagsGet200Response (
  items: Seq[ConversionEventResponse],
  bookmark: Option[String] = None
)

