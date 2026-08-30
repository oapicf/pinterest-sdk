package org.openapitools.server.model


/**
 * = BulkUpsertRequestCreate =
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
final case class BulkUpsertRequestCreate (
  adGroups: Option[Seq[AdGroupCreateRequest]] = None,
  ads: Option[Seq[AdCreateRequest]] = None,
  campaigns: Option[Seq[CampaignCreateRequest]] = None,
  catalogProductGroups: Option[Seq[BulkUpsertRequestCreateCatalogProductGroupsItems]] = None,
  keywords: Option[Seq[KeywordsRequest]] = None,
  labels: Option[Seq[LabelBulkCreateRequest]] = None,
  productGroups: Option[Seq[ProductGroupPromotionCreateRequest]] = None,
  schedules: Option[Seq[ScheduleCreateRequest]] = None
)

