package org.openapitools.server.model


/**
 * @param objectiveType  for example: ''null''
 * @param createdTime Campaign creation time. Unix timestamp in seconds. for example: ''1432744744''
 * @param updatedTime UTC timestamp. Last update time. for example: ''1432744744''
 * @param `type` Always \"campaign\". for example: ''campaign''
*/
final case class CampaignResponseAllOf1 (
  objectiveType: Option[ObjectiveType],
  createdTime: Option[Int],
  updatedTime: Option[Int],
  `type`: Option[String]
)

