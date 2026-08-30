package org.openapitools.server.model


/**
 * = catalogs_product_group_multiple_pinterest_product_category_criteria =
 *
 * @param negated  for example: ''null''
 * @param values  for example: ''null''
*/
final case class CatalogsProductGroupMultiplePinterestProductCategoryCriteria (
  negated: Option[Boolean] = None,
  values: Seq[ProductCategoryEnum]
)

