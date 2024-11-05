
package org.openapitools.client.model


case class GetBusinessEmployers200Response (
    /* List of employers. */
    _items: List[UserBusinessRoleBinding],
    _bookmark: Option[String]
)
object GetBusinessEmployers200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
