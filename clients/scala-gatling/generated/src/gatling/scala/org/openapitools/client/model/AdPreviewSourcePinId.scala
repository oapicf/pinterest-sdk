
package org.openapitools.client.model


case class AdPreviewSourcePinId (
    /* Creative type of the ad preview. */
    _creativeType: Option[AdPinPreviewCreativeType],
    /* Pin ID. */
    _pinId: String
)
object AdPreviewSourcePinId {
    def toStringBody(var_creativeType: Object, var_pinId: Object) =
        s"""
        | {
        | "creativeType":$var_creativeType,"pinId":$var_pinId
        | }
        """.stripMargin
}
