
package org.openapitools.client.model


case class GetBusinessPartners200Response (
    /* List of business partners. */
    _items: List[UserBusinessRoleBinding],
    _bookmark: Option[String]
)
object GetBusinessPartners200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
