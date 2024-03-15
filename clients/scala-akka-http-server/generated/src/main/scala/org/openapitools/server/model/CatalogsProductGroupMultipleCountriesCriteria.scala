package org.openapitools.server.model


/**
 * = catalogs_product_group_multiple_country_criteria =
 *
 * @param values  for example: ''null''
 * @param negated  for example: ''null''
*/
final case class CatalogsProductGroupMultipleCountriesCriteria (
  values: Seq[Country],
  negated: Option[Boolean] = None
)

