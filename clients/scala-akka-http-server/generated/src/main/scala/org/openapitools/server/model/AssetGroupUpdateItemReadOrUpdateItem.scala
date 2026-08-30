package org.openapitools.server.model


/**
 * @param assetGroupId Unique identifier of the asset group to update. for example: ''null''
 * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. for example: ''["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"]''
 * @param assetsToAdd A list of asset ids to add to the asset group. for example: ''null''
 * @param assetsToRemove A list of asset ids to remove from the asset group. for example: ''null''
 * @param description Asset group description. for example: ''null''
 * @param name Asset Group name. for example: ''null''
*/
final case class AssetGroupUpdateItemReadOrUpdateItem (
  assetGroupId: String,
  assetGroupTypes: Option[Seq[AssetGroupType]] = None,
  assetsToAdd: Option[Seq[String]] = None,
  assetsToRemove: Option[Seq[String]] = None,
  description: Option[String] = None,
  name: Option[String] = None
)

