package org.openapitools.server.model


/**
 * @param adAccountsIds A list of ad account IDs under the asset group for example: ''["549755885175"]''
 * @param assetGroupDescription Asset group description for example: ''Asset group that has ad accounts used in Canada''
 * @param assetGroupName Asset Group name for example: ''Canada Ad Accounts''
 * @param assetGroupTypes Asset group types for example: ''["LOCATION_OR_LANGUAGE"]''
 * @param catalogsIds A list of catalog IDs under asset group for example: ''["4836859046874"]''
 * @param createdBy The data of the user that created the asset group. for example: ''null''
 * @param createdTime The creation time of the asset group for example: ''1646767577816''
 * @param id Asset Group ID. for example: ''666791336903426391''
 * @param owner The data of the business that owns the asset group. for example: ''null''
 * @param profilesIds A list of profile IDs under asset group for example: ''["630433785246278264"]''
 * @param updatedTime The last update time of the asset group for example: ''1646767577816''
*/
final case class AssetGroupBinding (
  adAccountsIds: Option[Seq[String]] = None,
  assetGroupDescription: Option[String] = None,
  assetGroupName: Option[String] = None,
  assetGroupTypes: Option[Seq[String]] = None,
  catalogsIds: Option[Seq[String]] = None,
  createdBy: Option[BusinessAccessUserSummary] = None,
  createdTime: Option[Int] = None,
  id: Option[String] = None,
  owner: Option[BusinessAccessUserSummary] = None,
  profilesIds: Option[Seq[String]] = None,
  updatedTime: Option[Int] = None
)

