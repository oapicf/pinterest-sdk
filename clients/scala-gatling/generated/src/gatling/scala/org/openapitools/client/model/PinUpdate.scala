
package org.openapitools.client.model


case class PinUpdate (
    /* AI disclosure declarations the creator has made about this Pin. */
    _aiDisclosures: Option[AiDisclosuresUpdate],
    _altText: Option[String],
    /* The board to which this Pin belongs. */
    _boardId: Option[String],
    /* The board section to which this Pin belongs. */
    _boardSectionId: Option[String],
    /* Carousel Pin slots data. */
    _carouselSlots: Option[List[CarouselSlot]],
    _description: Option[String],
    _link: Option[String],
    _title: Option[String]
)
object PinUpdate {
    def toStringBody(var_aiDisclosures: Object, var_altText: Object, var_boardId: Object, var_boardSectionId: Object, var_carouselSlots: Object, var_description: Object, var_link: Object, var_title: Object) =
        s"""
        | {
        | "aiDisclosures":$var_aiDisclosures,"altText":$var_altText,"boardId":$var_boardId,"boardSectionId":$var_boardSectionId,"carouselSlots":$var_carouselSlots,"description":$var_description,"link":$var_link,"title":$var_title
        | }
        """.stripMargin
}
