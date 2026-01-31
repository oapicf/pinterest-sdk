package org.openapitools.server.model


/**
 * = catalogs_product_group_multiple_string_criteria =
 *
 * @param negated  for example: ''null''
 * @param values  for example: ''null''
*/
final case class CatalogsProductGroupMultipleStringCriteria (
  negated: Option[Boolean] = None,
  values: Seq[String]
)

