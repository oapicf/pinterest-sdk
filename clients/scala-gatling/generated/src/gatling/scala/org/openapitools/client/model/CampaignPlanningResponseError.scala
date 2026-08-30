
package org.openapitools.client.model


case class CampaignPlanningResponseError (
    _code: Option[CampaignPlanningResponseErrorCode],
    /* Human-readable error message. */
    _message: Option[String]
)
object CampaignPlanningResponseError {
    def toStringBody(var_code: Object, var_message: Object) =
        s"""
        | {
        | "code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
