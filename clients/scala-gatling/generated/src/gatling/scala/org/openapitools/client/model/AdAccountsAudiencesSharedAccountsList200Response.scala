
package org.openapitools.client.model


case class AdAccountsAudiencesSharedAccountsList200Response (
    _items: List[SharedAudienceAccount],
    _bookmark: Option[String]
)
object AdAccountsAudiencesSharedAccountsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
