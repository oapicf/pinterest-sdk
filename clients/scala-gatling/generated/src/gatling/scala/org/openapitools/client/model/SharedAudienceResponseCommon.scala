
package org.openapitools.client.model


case class SharedAudienceResponseCommon (
    /* Audience ID that was shared */
    _audienceId: Option[String],
    _permissions: Option[List[Role]]
)
object SharedAudienceResponseCommon {
    def toStringBody(var_audienceId: Object, var_permissions: Object) =
        s"""
        | {
        | "audienceId":$var_audienceId,"permissions":$var_permissions
        | }
        """.stripMargin
}
