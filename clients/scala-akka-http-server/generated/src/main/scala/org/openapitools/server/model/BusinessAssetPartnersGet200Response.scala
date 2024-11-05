package org.openapitools.server.model


/**
 * @param items List of partners with permissions to the asset. for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class BusinessAssetPartnersGet200Response (
  items: Seq[UserSingleAssetBinding],
  bookmark: Option[String] = None
)

