
package org.openapitools.client.model


case class CatalogsLocalStoresDelete200ResponseInner (
    /* The ID of the local store. */
    _id: String,
    _status: CampaignAdPreviewDelete200ResponseInnerStatus
)
object CatalogsLocalStoresDelete200ResponseInner {
    def toStringBody(var_id: Object, var_status: Object) =
        s"""
        | {
        | "id":$var_id,"status":$var_status
        | }
        """.stripMargin
}
