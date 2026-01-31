
package org.openapitools.client.model


case class GetBusinessPartners200Response (
    _bookmark: Option[String],
    /* List of business partners. */
    _items: List[UserBusinessRoleBinding]
)
object GetBusinessPartners200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
