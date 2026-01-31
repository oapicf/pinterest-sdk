
package org.openapitools.client.model


case class CarouselSlot (
    /* Carousel Pin slot description. */
    _description: Option[String],
    /* Carousel Pin slot link. */
    _link: Option[String],
    /* Carousel Pin slot title. */
    _title: Option[String]
)
object CarouselSlot {
    def toStringBody(var_description: Object, var_link: Object, var_title: Object) =
        s"""
        | {
        | "description":$var_description,"link":$var_link,"title":$var_title
        | }
        """.stripMargin
}
