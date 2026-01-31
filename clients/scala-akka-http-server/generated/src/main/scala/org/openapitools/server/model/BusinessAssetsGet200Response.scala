package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items List of assets the requesting business has access to. for example: ''null''
*/
final case class BusinessAssetsGet200Response (
  bookmark: Option[String] = None,
  items: Seq[GetBusinessAssetsResponse]
)

