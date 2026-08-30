package org.openapitools.server.model


/**
 * = retail_product_groups_update_request =
 *
 * Request object for updating a retail product group.
 *
 * @param catalogType Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. for example: ''null''
 * @param country  for example: ''null''
 * @param description  for example: ''null''
 * @param filters  for example: ''null''
 * @param locale  for example: ''null''
 * @param name Name of catalog product group for example: ''Most Popular''
*/
final case class CatalogsRetailProductGroupUpdateRequest (
  catalogType: Option[String] = None,
  country: Option[Country] = None,
  description: Option[String] = None,
  filters: Option[CatalogsProductGroupFiltersRequest] = None,
  locale: Option[CatalogsLocale] = None,
  name: Option[String] = None
)

