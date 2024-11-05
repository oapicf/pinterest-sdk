package org.openapitools.server.model


/**
 * @param accountId Account ID (ad account or business ID). for example: ''549755885175''
 * @param accountName Account name. for example: ''Home Depot USA''
 * @param accountType account type for example: ''null''
 * @param sharedOnTimestamp Epoch timestamp in seconds for the shared audience event for example: ''1677003860''
*/
final case class SharedAudienceAccount (
  accountId: String,
  accountName: String,
  accountType: String,
  sharedOnTimestamp: Int
)

