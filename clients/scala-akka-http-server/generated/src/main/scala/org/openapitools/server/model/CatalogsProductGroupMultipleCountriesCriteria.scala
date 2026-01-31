package org.openapitools.server.model


/**
 * = catalogs_product_group_multiple_country_criteria =
 *
 * @param negated  for example: ''null''
 * @param values  for example: ''null''
*/
final case class CatalogsProductGroupMultipleCountriesCriteria (
  negated: Option[Boolean] = None,
  values: Seq[Country]
)

