
package org.openapitools.client.model


case class CatalogsCreativeAssetsProductGroupProductCounts (
    _appLinks: Number,
    _catalogType: String,
    _images: Number,
    _total: Number,
    _videos: Number
)
object CatalogsCreativeAssetsProductGroupProductCounts {
    def toStringBody(var_appLinks: Object, var_catalogType: Object, var_images: Object, var_total: Object, var_videos: Object) =
        s"""
        | {
        | "appLinks":$var_appLinks,"catalogType":$var_catalogType,"images":$var_images,"total":$var_total,"videos":$var_videos
        | }
        """.stripMargin
}
