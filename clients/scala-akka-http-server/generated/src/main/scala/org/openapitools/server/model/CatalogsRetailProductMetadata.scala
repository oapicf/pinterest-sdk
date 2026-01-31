package org.openapitools.server.model


/**
 * Retail product metadata entity
 *
 * @param availability  for example: ''null''
 * @param currency  for example: ''null''
 * @param itemGroupId The parent ID of the product. for example: ''DS0294''
 * @param itemId The user-created unique ID that represents the product. for example: ''DS0294-L''
 * @param price The price of the product. for example: ''24.99''
 * @param salePrice The discounted price of the product. for example: ''14.99''
*/
final case class CatalogsRetailProductMetadata (
  availability: NonNullableProductAvailabilityType,
  currency: NonNullableCatalogsCurrency,
  itemGroupId: String,
  itemId: String,
  price: Double,
  salePrice: Double
)

