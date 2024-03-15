
package org.openapitools.client.model


case class CampaignId (
    /* Campaign ID. */
    _id: Option[String]
)
object CampaignId {
    def toStringBody(var_id: Object) =
        s"""
        | {
        | "id":$var_id
        | }
        """.stripMargin
}
