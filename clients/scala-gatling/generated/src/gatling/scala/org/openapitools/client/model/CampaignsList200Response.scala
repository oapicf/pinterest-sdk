
package org.openapitools.client.model


case class CampaignsList200Response (
    _bookmark: Option[String],
    _items: List[Campaign]
)
object CampaignsList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
