
package org.openapitools.client.model


case class CampaignIdFilter (
    /* List of campaign ids */
    _campaignIds: Option[List[String]]
)
object CampaignIdFilter {
    def toStringBody(var_campaignIds: Object) =
        s"""
        | {
        | "campaignIds":$var_campaignIds
        | }
        """.stripMargin
}
