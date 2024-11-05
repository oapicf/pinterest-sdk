package org.openapitools.server.model


/**
 * @param items List assets on which you granted access to your partner or assets on which your partner has granted you access. for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class BusinessPartnerAssetAccessGet200Response (
  items: Seq[GetPartnerAssetsResponse],
  bookmark: Option[String] = None
)

