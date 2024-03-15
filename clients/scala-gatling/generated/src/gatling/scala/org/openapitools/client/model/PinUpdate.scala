
package org.openapitools.client.model


case class PinUpdate (
    /* Pin's alternative text. */
    _altText: Option[String],
    /* The id of the board to move the Pin onto. */
    _boardId: Option[String],
    /* <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID. */
    _boardSectionId: Option[String],
    /* Pin description - 800 characters maximum. */
    _description: Option[String],
    /* URL viewer is taken to when they click pin. */
    _link: Option[String],
    /* The native pin title that creators explicitly prefer to display. */
    _title: Option[String],
    /* Carousel Pin slots data. */
    _carouselSlots: Option[List[PinUpdateCarouselSlotsInner]],
    /* Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. */
    _note: Option[String]
)
object PinUpdate {
    def toStringBody(var_altText: Object, var_boardId: Object, var_boardSectionId: Object, var_description: Object, var_link: Object, var_title: Object, var_carouselSlots: Object, var_note: Object) =
        s"""
        | {
        | "altText":$var_altText,"boardId":$var_boardId,"boardSectionId":$var_boardSectionId,"description":$var_description,"link":$var_link,"title":$var_title,"carouselSlots":$var_carouselSlots,"note":$var_note
        | }
        """.stripMargin
}
