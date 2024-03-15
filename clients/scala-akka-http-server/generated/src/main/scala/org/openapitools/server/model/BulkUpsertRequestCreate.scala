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
final case class BulkUpsertRequestCreate (
  campaigns: Option[Seq[CampaignCreateRequest]] = None,
  adGroups: Option[Seq[AdGroupCreateRequest]] = None,
  ads: Option[Seq[AdCreateRequest]] = None,
  productGroups: Option[Seq[ProductGroupPromotionCreateRequest]] = None,
  keywords: Option[Seq[KeywordsRequest]] = None
)

