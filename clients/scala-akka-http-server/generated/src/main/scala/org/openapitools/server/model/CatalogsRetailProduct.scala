package org.openapitools.server.model


/**
 * @param catalogType  for example: ''null''
 * @param metadata  for example: ''null''
 * @param pin  for example: ''null''
*/
final case class CatalogsRetailProduct (
  catalogType: String,
  metadata: CatalogsRetailProductMetadata,
  pin: Pin
)

