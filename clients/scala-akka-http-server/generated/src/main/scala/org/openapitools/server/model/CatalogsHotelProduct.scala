package org.openapitools.server.model


/**
 * @param catalogType  for example: ''null''
 * @param metadata  for example: ''null''
 * @param pin  for example: ''null''
*/
final case class CatalogsHotelProduct (
  catalogType: String,
  metadata: CatalogsHotelProductMetadata,
  pin: Pin
)

