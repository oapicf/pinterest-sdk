
package org.openapitools.client.model


case class CatalogProductGroup (
    /* ID of the catalog product group. */
    _id: Option[String],
    /* Merchant ID pertaining to the owner of the catalog product group. */
    _merchantId: Option[String],
    /* Name of catalog product group */
    _name: Option[String],
    /* Object holding a list of filters */
    _filters: Option[Any],
    /* Object holding a list of filters */
    _filterV2: Option[Any],
    _type: Option[Board],
    _status: Option[EntityStatus],
    /* id of the feed profile belonging to this catalog product group */
    _feedProfileId: Option[String],
    /* Unix timestamp in seconds of when catalog product group was created. */
    _createdAt: Option[Integer],
    /* Unix timestamp in seconds of last time catalog product group was updated. */
    _lastUpdate: Option[Integer],
    /* Amount of products in the catalog product group */
    _productCount: Option[Integer],
    /* index of the featured position of the catalog product group */
    _featuredPosition: Option[Integer]
)
object CatalogProductGroup {
    def toStringBody(var_id: Object, var_merchantId: Object, var_name: Object, var_filters: Object, var_filterV2: Object, var_type: Object, var_status: Object, var_feedProfileId: Object, var_createdAt: Object, var_lastUpdate: Object, var_productCount: Object, var_featuredPosition: Object) =
        s"""
        | {
        | "id":$var_id,"merchantId":$var_merchantId,"name":$var_name,"filters":$var_filters,"filterV2":$var_filterV2,"type":$var_type,"status":$var_status,"feedProfileId":$var_feedProfileId,"createdAt":$var_createdAt,"lastUpdate":$var_lastUpdate,"productCount":$var_productCount,"featuredPosition":$var_featuredPosition
        | }
        """.stripMargin
}
