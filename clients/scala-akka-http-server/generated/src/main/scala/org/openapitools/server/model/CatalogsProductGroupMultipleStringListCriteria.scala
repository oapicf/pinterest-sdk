package org.openapitools.server.model


/**
 * = catalogs_product_group_multiple_string_list_criteria =
 *
 * @param negated  for example: ''null''
 * @param values  for example: ''null''
*/
final case class CatalogsProductGroupMultipleStringListCriteria (
  negated: Option[Boolean] = None,
  values: Seq[Seq[String]]
)

