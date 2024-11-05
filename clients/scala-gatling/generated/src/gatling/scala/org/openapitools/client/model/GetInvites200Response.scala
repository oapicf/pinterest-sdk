
package org.openapitools.client.model


case class GetInvites200Response (
    /* List of invite and request data. */
    _items: List[InviteResponse],
    _bookmark: Option[String]
)
object GetInvites200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
