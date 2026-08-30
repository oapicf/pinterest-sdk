
package org.openapitools.client.model


case class CatalogsAiContentDisclosure (
    /* Disclosure labels that apply to this asset. */
    _disclosure: List[CatalogsAiContentDisclosureLabel],
    /* URL of the asset. Must match one of image_link, additional_image_link, or video_link. */
    _url: String
)
object CatalogsAiContentDisclosure {
    def toStringBody(var_disclosure: Object, var_url: Object) =
        s"""
        | {
        | "disclosure":$var_disclosure,"url":$var_url
        | }
        """.stripMargin
}
