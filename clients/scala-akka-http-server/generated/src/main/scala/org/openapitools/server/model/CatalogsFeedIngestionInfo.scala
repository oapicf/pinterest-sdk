package org.openapitools.server.model


/**
 * @param IN_STOCK The number of ingested products that are in stock. for example: ''null''
 * @param OUT_OF_STOCK The number of ingested products that are in out of stock. for example: ''null''
 * @param PREORDER The number of ingested products that are in preorder. for example: ''null''
*/
final case class CatalogsFeedIngestionInfo (
  IN_STOCK: Option[Int] = None,
  OUT_OF_STOCK: Option[Int] = None,
  PREORDER: Option[Int] = None
)

