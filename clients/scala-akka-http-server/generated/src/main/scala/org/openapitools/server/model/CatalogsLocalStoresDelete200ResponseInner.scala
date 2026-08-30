package org.openapitools.server.model


/**
 * @param id The ID of the local store. for example: ''1234567890''
 * @param status  for example: ''null''
*/
final case class CatalogsLocalStoresDelete200ResponseInner (
  id: String,
  status: CampaignAdPreviewDelete200ResponseInnerStatus
)

