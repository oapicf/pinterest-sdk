
package org.openapitools.client.model


case class GetBusinessMembers200Response (
    _bookmark: Option[String],
    /* List of business members. */
    _items: List[UserBusinessRoleBinding]
)
object GetBusinessMembers200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
