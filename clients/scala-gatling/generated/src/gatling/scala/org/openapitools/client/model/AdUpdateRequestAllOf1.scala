
package org.openapitools.client.model


case class AdUpdateRequestAllOf1 (
    /* The ID of this ad. */
    _id: String,
    /* Pin ID. This field may only be updated for draft ads. */
    _pinId: Option[String]
)
object AdUpdateRequestAllOf1 {
    def toStringBody(var_id: Object, var_pinId: Object) =
        s"""
        | {
        | "id":$var_id,"pinId":$var_pinId
        | }
        """.stripMargin
}
