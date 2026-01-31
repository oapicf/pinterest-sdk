package org.openapitools.server.model


/**
 * @param campaignObjectiveTypes List of values for filtering. [\"WEB_SESSIONS\"] in BETA. for example: ''["AWARENESS"]''
*/
final case class CampaignObjectivesFilter (
  campaignObjectiveTypes: Option[Seq[ObjectiveType]] = None
)

