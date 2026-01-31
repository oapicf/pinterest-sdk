package org.openapitools.server.model


/**
 * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
 *
 * @param catalogType Catalog type for example: ''PRODUCT''
 * @param id Catalog ID. for example: ''4836859046874''
 * @param name Catalog name for example: ''Canada Catalog''
*/
final case class GetBusinessAssetsResponseCatalogInfo (
  catalogType: Option[String] = None,
  id: Option[String] = None,
  name: Option[String] = None
)

