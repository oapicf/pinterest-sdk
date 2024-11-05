
package org.openapitools.client.model


case class CatalogsRetailProductGroupProductCounts (
    _catalogType: String,
    _inStock: Number,
    _outOfStock: Number,
    _preorder: Number,
    _total: Number,
    _videos: Option[Number]
)
object CatalogsRetailProductGroupProductCounts {
    def toStringBody(var_catalogType: Object, var_inStock: Object, var_outOfStock: Object, var_preorder: Object, var_total: Object, var_videos: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"inStock":$var_inStock,"outOfStock":$var_outOfStock,"preorder":$var_preorder,"total":$var_total,"videos":$var_videos
        | }
        """.stripMargin
}
