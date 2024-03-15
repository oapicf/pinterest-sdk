package org.openapitools.server.model


/**
 * Request for creation of entities in bulk.
 *
 * @param campaigns  for example: ''null''
 * @param adGroups  for example: ''null''
 * @param ads  for example: ''null''
 * @param productGroups  for example: ''null''
 * @param keywords  for example: ''null''
*/
final case class BulkUpsertRequestUpdate (
  campaigns: Option[Seq[CampaignUpdateRequest]] = None,
  adGroups: Option[Seq[AdGroupUpdateRequest]] = None,
  ads: Option[Seq[AdUpdateRequest]] = None,
  productGroups: Option[Seq[ProductGroupPromotionUpdateRequest]] = None,
  keywords: Option[Seq[KeywordUpdate]] = None
)

