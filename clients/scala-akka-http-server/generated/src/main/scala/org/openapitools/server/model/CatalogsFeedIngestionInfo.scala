package org.openapitools.server.model


/**
 * @param inStock  for example: ''null''
 * @param outOfStock  for example: ''null''
 * @param preorder  for example: ''null''
*/
final case class CatalogsFeedIngestionInfo (
  inStock: Option[Int],
  outOfStock: Option[Int],
  preorder: Option[Int]
)

