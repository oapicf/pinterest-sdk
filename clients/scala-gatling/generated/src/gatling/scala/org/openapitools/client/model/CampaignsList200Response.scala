
package org.openapitools.client.model


case class CampaignsList200Response (
    _items: List[CampaignResponse],
    _bookmark: Option[String]
)
object CampaignsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
