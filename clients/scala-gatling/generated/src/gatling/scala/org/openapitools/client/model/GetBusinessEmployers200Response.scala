
package org.openapitools.client.model


case class GetBusinessEmployers200Response (
    _bookmark: Option[String],
    /* List of employers. */
    _items: List[UserBusinessRoleBinding]
)
object GetBusinessEmployers200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
