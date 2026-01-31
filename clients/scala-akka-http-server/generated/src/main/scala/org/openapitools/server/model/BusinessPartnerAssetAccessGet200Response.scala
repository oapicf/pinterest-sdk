package org.openapitools.server.model


/**
 * @param bookmark  for example: ''null''
 * @param items List assets on which you granted access to your partner or assets on which your partner has granted you access. for example: ''null''
*/
final case class BusinessPartnerAssetAccessGet200Response (
  bookmark: Option[String] = None,
  items: Seq[GetPartnerAssetsResponse]
)

