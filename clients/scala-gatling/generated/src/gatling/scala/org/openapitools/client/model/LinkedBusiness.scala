
package org.openapitools.client.model


case class LinkedBusiness (
    /* Username */
    _username: Option[String],
    /* image_small_url */
    _imageSmallUrl: Option[String],
    /* image_medium_url */
    _imageMediumUrl: Option[String],
    /* image_large_url */
    _imageLargeUrl: Option[String],
    /* image_xlarge_url */
    _imageXlargeUrl: Option[String]
)
object LinkedBusiness {
    def toStringBody(var_username: Object, var_imageSmallUrl: Object, var_imageMediumUrl: Object, var_imageLargeUrl: Object, var_imageXlargeUrl: Object) =
        s"""
        | {
        | "username":$var_username,"imageSmallUrl":$var_imageSmallUrl,"imageMediumUrl":$var_imageMediumUrl,"imageLargeUrl":$var_imageLargeUrl,"imageXlargeUrl":$var_imageXlargeUrl
        | }
        """.stripMargin
}
