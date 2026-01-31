package org.openapitools.server.model


/**
 * = catalogs_product_group_uint32_criteria =
 *
 * @param negated  for example: ''null''
 * @param operator  for example: ''null''
 * @param value  for example: ''null''
*/
final case class CatalogsProductGroupUint32Criteria (
  negated: Option[Boolean] = None,
  operator: String,
  value: Int
)

