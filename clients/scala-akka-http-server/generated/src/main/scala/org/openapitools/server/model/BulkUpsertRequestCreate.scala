package org.openapitools.server.model


/**
 * Request for creation of entities in bulk.
 *
 * @param adGroups  for example: ''null''
 * @param ads  for example: ''null''
 * @param campaigns  for example: ''null''
 * @param catalogProductGroups  for example: ''null''
 * @param keywords  for example: ''null''
 * @param labels  for example: ''null''
 * @param productGroups  for example: ''null''
*/
final case class BulkUpsertRequestCreate (
  adGroups: Option[Seq[AdGroupCreateRequest]] = None,
  ads: Option[Seq[AdCreateRequest]] = None,
  campaigns: Option[Seq[CampaignCreateRequest]] = None,
  catalogProductGroups: Option[Seq[MultipleProductGroupsInner]] = None,
  keywords: Option[Seq[KeywordsRequest]] = None,
  labels: Option[Seq[LabelCreateRequest]] = None,
  productGroups: Option[Seq[ProductGroupPromotionCreateRequest]] = None
)

