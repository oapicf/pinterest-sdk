package org.openapitools.server.model


/**
 * @param items List of assets the requesting business has access to. for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class BusinessAssetsGet200Response (
  items: Seq[GetBusinessAssetsResponse],
  bookmark: Option[String] = None
)

