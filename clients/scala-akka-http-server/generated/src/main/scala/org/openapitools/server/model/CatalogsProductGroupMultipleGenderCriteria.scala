package org.openapitools.server.model


/**
 * = catalogs_product_group_multiple_gender_criteria =
 *
 * @param negated  for example: ''null''
 * @param values  for example: ''null''
*/
final case class CatalogsProductGroupMultipleGenderCriteria (
  negated: Option[Boolean] = None,
  values: Seq[Gender]
)

