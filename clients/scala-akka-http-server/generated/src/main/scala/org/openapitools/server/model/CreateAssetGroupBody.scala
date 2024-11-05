package org.openapitools.server.model


/**
 * @param assetGroupName Asset Group name for example: ''Canada Ad Accounts''
 * @param assetGroupDescription Asset group description for example: ''Asset groups that has ad accounts shared in Canada''
 * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. for example: ''["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"]''
*/
final case class CreateAssetGroupBody (
  assetGroupName: String,
  assetGroupDescription: String,
  assetGroupTypes: Seq[AssetGroupType]
)

