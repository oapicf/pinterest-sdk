
package org.openapitools.client.model


case class CatalogsHotelMainImage (
    /* <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://. */
    _link: Option[String],
    /* Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image */
    _tag: Option[List[String]]
)
object CatalogsHotelMainImage {
    def toStringBody(var_link: Object, var_tag: Object) =
        s"""
        | {
        | "link":$var_link,"tag":$var_tag
        | }
        """.stripMargin
}
