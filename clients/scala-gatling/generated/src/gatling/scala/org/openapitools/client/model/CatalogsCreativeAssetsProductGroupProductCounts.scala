
package org.openapitools.client.model


case class CatalogsCreativeAssetsProductGroupProductCounts (
    _catalogType: String,
    _total: Number,
    _videos: Number
)
object CatalogsCreativeAssetsProductGroupProductCounts {
    def toStringBody(var_catalogType: Object, var_total: Object, var_videos: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"total":$var_total,"videos":$var_videos
        | }
        """.stripMargin
}
