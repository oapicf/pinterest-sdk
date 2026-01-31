
package org.openapitools.client.model


case class LinkedBusiness (
    /* image_large_url */
    _imageLargeUrl: Option[String],
    /* image_medium_url */
    _imageMediumUrl: Option[String],
    /* image_small_url */
    _imageSmallUrl: Option[String],
    /* image_xlarge_url */
    _imageXlargeUrl: Option[String],
    /* Username */
    _username: Option[String]
)
object LinkedBusiness {
    def toStringBody(var_imageLargeUrl: Object, var_imageMediumUrl: Object, var_imageSmallUrl: Object, var_imageXlargeUrl: Object, var_username: Object) =
        s"""
        | {
        | "imageLargeUrl":$var_imageLargeUrl,"imageMediumUrl":$var_imageMediumUrl,"imageSmallUrl":$var_imageSmallUrl,"imageXlargeUrl":$var_imageXlargeUrl,"username":$var_username
        | }
        """.stripMargin
}
