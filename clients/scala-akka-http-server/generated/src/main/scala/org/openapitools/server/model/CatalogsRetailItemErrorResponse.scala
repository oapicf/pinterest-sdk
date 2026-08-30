package org.openapitools.server.model


/**
 * = catalogs_retail_item_error_response =
 *
 * Object describing a retail item error
 *
 * @param catalogType  for example: ''null''
 * @param errors Array with the errors for the item id requested for example: ''null''
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload. for example: ''null''
*/
final case class CatalogsRetailItemErrorResponse (
  catalogType: String,
  errors: Seq[ItemValidationEvent],
  itemId: Option[String] = None,
  itemResponseKind: String
)

