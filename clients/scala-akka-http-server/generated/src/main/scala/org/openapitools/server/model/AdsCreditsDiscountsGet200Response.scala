package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class AdsCreditsDiscountsGet200Response (
  items: Seq[AdsCreditDiscountsResponse],
  bookmark: Option[String] = None
)

