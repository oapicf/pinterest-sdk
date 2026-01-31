
package org.openapitools.client.model

import java.util.HashMap

case class CampaignAudienceMultipliers (
    _AUDIENCE_ID: Option[String]
)
object CampaignAudienceMultipliers {
    def toStringBody(var_AUDIENCE_ID: Object) =
        s"""
        | {
        | "AUDIENCE_ID":$var_AUDIENCE_ID
        | }
        """.stripMargin
}
