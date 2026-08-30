package org.openapitools.server.model


/**
 * = catalogs_product_group_filter_operator_type_criteria =
 *
 * @param filterOperatorType  for example: ''null''
 * @param negated  for example: ''null''
 * @param values  for example: ''null''
*/
final case class CatalogsProductGroupFilterOperatorTypeCriteria (
  filterOperatorType: Option[FilterOperatorType] = None,
  negated: Option[Boolean] = None,
  values: Seq[String]
)

