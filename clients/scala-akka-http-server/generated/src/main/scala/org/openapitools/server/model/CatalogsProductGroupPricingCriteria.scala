package org.openapitools.server.model


/**
 * = catalogs_product_group_pricing_criteria =
 *
 * @param inclusion  for example: ''null''
 * @param values  for example: ''null''
 * @param negated  for example: ''null''
*/
final case class CatalogsProductGroupPricingCriteria (
  inclusion: Option[Boolean] = None,
  values: Double,
  negated: Option[Boolean] = None
)

