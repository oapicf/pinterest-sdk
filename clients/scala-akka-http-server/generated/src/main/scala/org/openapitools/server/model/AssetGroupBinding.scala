package org.openapitools.server.model


/**
 * @param id Asset Group ID. for example: ''666791336903426391''
 * @param assetGroupName Asset Group name for example: ''Canada Ad Accounts''
 * @param assetGroupDescription Asset group description for example: ''Asset group that has ad accounts used in Canada''
 * @param assetGroupTypes Asset group types for example: ''["LOCATION_OR_LANGUAGE"]''
 * @param adAccountsIds A list of ad account IDs under the asset group for example: ''["549755885175"]''
 * @param profilesIds A list of profile IDs under asset group for example: ''["630433785246278264"]''
 * @param createdTime The creation time of the asset group for example: ''1646767577816''
 * @param updatedTime The last update time of the asset group for example: ''1646767577816''
 * @param owner The data of the business that owns the asset group. for example: ''null''
 * @param createdBy The data of the user that created the asset group. for example: ''null''
*/
final case class AssetGroupBinding (
  id: Option[String] = None,
  assetGroupName: Option[String] = None,
  assetGroupDescription: Option[String] = None,
  assetGroupTypes: Option[Seq[String]] = None,
  adAccountsIds: Option[Seq[String]] = None,
  profilesIds: Option[Seq[String]] = None,
  createdTime: Option[Int] = None,
  updatedTime: Option[Int] = None,
  owner: Option[BusinessAccessUserSummary] = None,
  createdBy: Option[BusinessAccessUserSummary] = None
)

