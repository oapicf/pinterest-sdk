package org.openapitools.server.model


/**
 * = catalogs_product_group_pricing_currency_criteria =
 *
 * @param operator  for example: ''null''
 * @param value  for example: ''null''
 * @param currency  for example: ''null''
 * @param negated  for example: ''null''
*/
final case class CatalogsProductGroupPricingCurrencyCriteria (
  operator: String,
  value: Double,
  currency: NonNullableCatalogsCurrency,
  negated: Option[Boolean] = None
)

