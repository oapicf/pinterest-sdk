package org.openapitools.server.model


/**
 * = catalogs_product_group_multiple_string_list_criteria =
 *
 * @param values  for example: ''null''
 * @param negated  for example: ''null''
*/
final case class CatalogsProductGroupMultipleStringListCriteria (
  values: Seq[Seq[String]],
  negated: Boolean
)

