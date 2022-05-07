
package org.openapitools.client.model


case class CampaignResponseAllOf (
    /* Campaign ID. */
    _id: String
)
object CampaignResponseAllOf {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
