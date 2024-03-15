
package org.openapitools.client.model


case class AdGroupsList200Response (
    _items: List[AdGroupResponse],
    _bookmark: Option[String]
)
object AdGroupsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
