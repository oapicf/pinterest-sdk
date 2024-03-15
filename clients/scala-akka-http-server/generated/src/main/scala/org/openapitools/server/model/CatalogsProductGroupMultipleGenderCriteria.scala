package org.openapitools.server.model


/**
 * = catalogs_product_group_multiple_gender_criteria =
 *
 * @param values  for example: ''null''
 * @param negated  for example: ''null''
*/
final case class CatalogsProductGroupMultipleGenderCriteria (
  values: Seq[Gender],
  negated: Option[Boolean] = None
)

