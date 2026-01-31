
package org.openapitools.client.model


case class CampaignObjectivesFilter (
    /* List of values for filtering. [\"WEB_SESSIONS\"] in BETA. */
    _campaignObjectiveTypes: Option[List[ObjectiveType]]
)
object CampaignObjectivesFilter {
    def toStringBody(var_campaignObjectiveTypes: Object) =
        s"""
        | {
        | "campaignObjectiveTypes":$var_campaignObjectiveTypes
        | }
        """.stripMargin
}
