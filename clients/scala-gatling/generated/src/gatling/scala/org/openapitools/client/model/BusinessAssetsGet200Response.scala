
package org.openapitools.client.model


case class BusinessAssetsGet200Response (
    _bookmark: Option[String],
    /* List of assets the requesting business has access to. */
    _items: List[GetBusinessAssetsResponse]
)
object BusinessAssetsGet200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
