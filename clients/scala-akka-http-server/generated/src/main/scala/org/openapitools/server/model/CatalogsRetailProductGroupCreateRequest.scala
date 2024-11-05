package org.openapitools.server.model


/**
 * = retail_product_groups_create_request =
 *
 * Request object for creating a product group.
 *
 * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. for example: ''null''
 * @param name  for example: ''null''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param catalogId Catalog id pertaining to the retail product group. for example: ''2680059592705''
 * @param country  for example: ''null''
 * @param locale  for example: ''null''
*/
final case class CatalogsRetailProductGroupCreateRequest (
  catalogType: String,
  name: String,
  description: Option[String] = None,
  filters: CatalogsProductGroupFiltersRequest,
  catalogId: String,
  country: Country,
  locale: CatalogsLocale
)

