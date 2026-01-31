package org.openapitools.server.model


/**
 * = catalogs_product_group_currency_criteria =
 *
 * A currency filter. This filter cannot be negated
 *
 * @param negated  for example: ''null''
 * @param values  for example: ''null''
*/
final case class CatalogsProductGroupCurrencyCriteria (
  negated: Option[Boolean] = None,
  values: NonNullableCatalogsCurrency
)

