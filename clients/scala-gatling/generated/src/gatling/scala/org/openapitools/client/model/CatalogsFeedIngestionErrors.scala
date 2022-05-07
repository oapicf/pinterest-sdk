
package org.openapitools.client.model


case class CatalogsFeedIngestionErrors (
    _imageDownloadError: Option[Integer],
    _imageDownloadConnectionTimeout: Option[Integer],
    _imageFormatUnrecognize: Option[Integer],
    _lineLevelInternalError: Option[Integer],
    _largeProductCountDecrease: Option[Integer]
)
object CatalogsFeedIngestionErrors {
    def toStringBody(var_imageDownloadError: Object, var_imageDownloadConnectionTimeout: Object, var_imageFormatUnrecognize: Object, var_lineLevelInternalError: Object, var_largeProductCountDecrease: Object) =
        s"""
        | {
        | "imageDownloadError":$var_imageDownloadError,"imageDownloadConnectionTimeout":$var_imageDownloadConnectionTimeout,"imageFormatUnrecognize":$var_imageFormatUnrecognize,"lineLevelInternalError":$var_lineLevelInternalError,"largeProductCountDecrease":$var_largeProductCountDecrease
        | }
        """.stripMargin
}
