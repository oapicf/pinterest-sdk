package org.openapitools.server.model


/**
 * = catalogs_product_group_pricing_currency_criteria =
 *
 * @param currency  for example: ''null''
 * @param negated  for example: ''null''
 * @param operator  for example: ''null''
 * @param value  for example: ''null''
*/
final case class CatalogsProductGroupPricingCurrencyCriteria (
  currency: NonNullableCatalogsCurrency,
  negated: Option[Boolean] = None,
  operator: String,
  value: Double
)

