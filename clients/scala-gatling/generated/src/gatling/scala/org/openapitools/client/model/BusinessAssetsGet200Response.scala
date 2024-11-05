
package org.openapitools.client.model


case class BusinessAssetsGet200Response (
    /* List of assets the requesting business has access to. */
    _items: List[GetBusinessAssetsResponse],
    _bookmark: Option[String]
)
object BusinessAssetsGet200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
