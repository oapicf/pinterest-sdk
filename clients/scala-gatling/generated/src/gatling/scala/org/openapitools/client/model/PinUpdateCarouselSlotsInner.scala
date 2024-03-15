
package org.openapitools.client.model


case class PinUpdateCarouselSlotsInner (
    /* Carousel Pin slot title. */
    _title: Option[String],
    /* Carousel Pin slot description. */
    _description: Option[String],
    /* Carousel Pin slot link. */
    _link: Option[String]
)
object PinUpdateCarouselSlotsInner {
    def toStringBody(var_title: Object, var_description: Object, var_link: Object) =
        s"""
        | {
        | "title":$var_title,"description":$var_description,"link":$var_link
        | }
        """.stripMargin
}
