
package org.openapitools.client.model


case class SharedAudienceCommon (
    /* Unique identifier of an audience */
    _audienceId: Option[String],
    _operationType: Option[OperationType]
)
object SharedAudienceCommon {
    def toStringBody(var_audienceId: Object, var_operationType: Object) =
        s"""
        | {
        | "audienceId":$var_audienceId,"operationType":$var_operationType
        | }
        """.stripMargin
}
