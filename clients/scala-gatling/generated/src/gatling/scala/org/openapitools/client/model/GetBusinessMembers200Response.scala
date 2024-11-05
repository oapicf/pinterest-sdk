
package org.openapitools.client.model


case class GetBusinessMembers200Response (
    /* List of business members. */
    _items: List[UserBusinessRoleBinding],
    _bookmark: Option[String]
)
object GetBusinessMembers200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
