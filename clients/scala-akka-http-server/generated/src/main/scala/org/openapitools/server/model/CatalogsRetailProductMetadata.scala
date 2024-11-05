package org.openapitools.server.model


/**
 * Retail product metadata entity
 *
 * @param itemId The user-created unique ID that represents the product. for example: ''DS0294-L''
 * @param itemGroupId The parent ID of the product. for example: ''DS0294''
 * @param availability  for example: ''null''
 * @param price The price of the product. for example: ''24.99''
 * @param salePrice The discounted price of the product. for example: ''14.99''
 * @param currency  for example: ''null''
*/
final case class CatalogsRetailProductMetadata (
  itemId: String,
  itemGroupId: String,
  availability: NonNullableProductAvailabilityType,
  price: Double,
  salePrice: Double,
  currency: NonNullableCatalogsCurrency
)

