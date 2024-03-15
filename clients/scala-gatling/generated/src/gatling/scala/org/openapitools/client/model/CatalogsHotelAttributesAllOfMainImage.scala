
package org.openapitools.client.model


case class CatalogsHotelAttributesAllOfMainImage (
    /* <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p> */
    _link: Option[String],
    /* Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image */
    _tag: Option[List[String]]
)
object CatalogsHotelAttributesAllOfMainImage {
    def toStringBody(var_link: Object, var_tag: Object) =
        s"""
        | {
        | "link":$var_link,"tag":$var_tag
        | }
        """.stripMargin
}
