package org.openapitools.server.model


/**
 * Catalogs product for all verticals
 *
 * @param catalogType  for example: ''null''
 * @param metadata  for example: ''null''
 * @param pin  for example: ''null''
*/
final case class CatalogsProduct (
  catalogType: CatalogsType,
  metadata: CatalogsCreativeAssetsProductMetadata,
  pin: Pin
)

