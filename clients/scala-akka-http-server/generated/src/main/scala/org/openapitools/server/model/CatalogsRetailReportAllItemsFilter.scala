package org.openapitools.server.model


/**
 * ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.
 *
 * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used for example: ''null''
 * @param productGroupId Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. for example: ''null''
 * @param reportType  for example: ''null''
*/
final case class CatalogsRetailReportAllItemsFilter (
  catalogId: Option[String] = None,
  productGroupId: Option[String] = None,
  reportType: String
)

