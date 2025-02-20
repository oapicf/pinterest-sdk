/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.PinUpdateCarouselSlotsInner

/**
 * Pin fields for updates
 * @param altText Pin's alternative text.
 * @param boardId The id of the board to move the Pin onto.
 * @param boardSectionId <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
 * @param description Pin description - 800 characters maximum.
 * @param link URL viewer is taken to when they click pin.
 * @param title The native pin title that creators explicitly prefer to display.
 * @param carouselSlots Carousel Pin slots data.
 * @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
 */
data class PinUpdate(
    /* Pin's alternative text. */
    val altText: kotlin.String? = null,
    /* The id of the board to move the Pin onto. */
    val boardId: kotlin.String? = null,
    /* <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID. */
    val boardSectionId: kotlin.String? = null,
    /* Pin description - 800 characters maximum. */
    val description: kotlin.String? = null,
    /* URL viewer is taken to when they click pin. */
    val link: kotlin.String? = null,
    /* The native pin title that creators explicitly prefer to display. */
    val title: kotlin.String? = null,
    /* Carousel Pin slots data. */
    val carouselSlots: kotlin.collections.List<PinUpdateCarouselSlotsInner>? = null,
    /* Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. */
    val note: kotlin.String? = null
) 

