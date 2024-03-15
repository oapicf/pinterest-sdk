package org.openapitools.server.model


/**
 * = catalogs_product_group_currency_criteria =
 *
 * A currency filter. This filter cannot be negated
 *
 * @param values  for example: ''null''
 * @param negated  for example: ''null''
*/
final case class CatalogsProductGroupCurrencyCriteria (
  values: NonNullableCatalogsCurrency,
  negated: Option[Boolean] = None
)

