package org.openapitools.server.model


/**
 * = BulkUpsertRequestUpdate =
 *
 * Request for creation of entities in bulk.
 *
 * @param adGroups  for example: ''null''
 * @param ads  for example: ''null''
 * @param campaigns  for example: ''null''
 * @param catalogProductGroups  for example: ''null''
 * @param keywords  for example: ''null''
 * @param labels  for example: ''null''
 * @param productGroups  for example: ''null''
 * @param schedules  for example: ''null''
*/
final case class BulkUpsertRequestUpdate (
  adGroups: Option[Seq[AdGroupUpdateRequest]] = None,
  ads: Option[Seq[AdUpdateRequest]] = None,
  campaigns: Option[Seq[CampaignUpdateRequest]] = None,
  catalogProductGroups: Option[Seq[BulkUpsertRequestUpdateCatalogProductGroupsItems]] = None,
  keywords: Option[Seq[KeywordUpdateGenerated]] = None,
  labels: Option[Seq[LabelBulkUpdateRequest]] = None,
  productGroups: Option[Seq[ProductGroupPromotionUpdateRequest]] = None,
  schedules: Option[Seq[ScheduleUpdateRequest]] = None
)

