/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * Pin
 * @param id 
 * @param createdAt 
 * @param link 
 * @param title 
 * @param description 
 * @param dominantColor Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
 * @param altText 
 * @param creativeType 
 * @param boardId The board to which this Pin belongs.
 * @param boardSectionId The board section to which this Pin belongs.
 * @param boardOwner 
 * @param isOwner Whether the \"operation user_account\" is the Pin owner.
 * @param media 
 * @param mediaSource 
 * @param parentPinId The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
 * @param isStandard Whether the Pin is standard or not. See documentation on <a href=\"https://developers.pinterest.com/docs/content/update/\">Changes to Pin creation</a> for more information.
 * @param hasBeenPromoted Whether the Pin has been promoted or not.
 * @param note Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
 * @param pinMetrics Pin metrics with associated time intervals if any.
 */
object Pins : BaseTable<Pin>("Pin") {
    val id = text("id") /* null */
    val createdAt = datetime("created_at") /* null */
    val link = text("link") /* null */
    val title = text("title") /* null */
    val description = text("description") /* null */
    val dominantColor = text("dominant_color") /* null */ /* Dominant pin color. Hex number, e.g. \\\"#6E7874\\\". */
    val altText = text("alt_text") /* null */
    val creativeType = long("creative_type") /* null */
    val boardId = text("board_id") /* null */ /* The board to which this Pin belongs. */
    val boardSectionId = text("board_section_id") /* null */ /* The board section to which this Pin belongs. */
    val boardOwner = long("board_owner") /* null */
    val isOwner = boolean("is_owner") /* null */ /* Whether the \"operation user_account\" is the Pin owner. */
    val media = long("media") /* null */
    val mediaSource = long("media_source") /* null */
    val parentPinId = text("parent_pin_id") /* null */ /* The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. */
    val isStandard = boolean("is_standard") /* null */ /* Whether the Pin is standard or not. See documentation on <a href=\"https://developers.pinterest.com/docs/content/update/\">Changes to Pin creation</a> for more information. */
    val hasBeenPromoted = boolean("has_been_promoted") /* null */ /* Whether the Pin has been promoted or not. */
    val note = text("note") /* null */ /* Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. */
    val pinMetrics = blob("pin_metrics") /* null */ /* Pin metrics with associated time intervals if any. */

    /**
     * Create an entity of type Pin from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Pin(
        id = row[id]  /* kotlin.String? */,
        createdAt = row[createdAt]  /* java.time.LocalDateTime? */,
        link = row[link]  /* kotlin.String? */,
        title = row[title]  /* kotlin.String? */,
        description = row[description]  /* kotlin.String? */,
        dominantColor = row[dominantColor]  /* kotlin.String? */ /* Dominant pin color. Hex number, e.g. \\\"#6E7874\\\". */,
        altText = row[altText]  /* kotlin.String? */,
        creativeType = CreativeTypes.createEntity(row, withReferences) /* CreativeType? */,
        boardId = row[boardId]  /* kotlin.String? */ /* The board to which this Pin belongs. */,
        boardSectionId = row[boardSectionId]  /* kotlin.String? */ /* The board section to which this Pin belongs. */,
        boardOwner = BoardOwners.createEntity(row, withReferences) /* BoardOwner? */,
        isOwner = row[isOwner]  /* kotlin.Boolean? */ /* Whether the \"operation user_account\" is the Pin owner. */,
        media = SummaryPinMedias.createEntity(row, withReferences) /* SummaryPinMedia? */,
        mediaSource = PinMediaSources.createEntity(row, withReferences) /* PinMediaSource? */,
        parentPinId = row[parentPinId]  /* kotlin.String? */ /* The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. */,
        isStandard = row[isStandard]  /* kotlin.Boolean? */ /* Whether the Pin is standard or not. See documentation on <a href=\"https://developers.pinterest.com/docs/content/update/\">Changes to Pin creation</a> for more information. */,
        hasBeenPromoted = row[hasBeenPromoted]  /* kotlin.Boolean? */ /* Whether the Pin has been promoted or not. */,
        note = row[note]  /* kotlin.String? */ /* Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. */,
        pinMetrics = row[pinMetrics]  /* kotlin.Any? */ /* Pin metrics with associated time intervals if any. */
    )

    /**
    * Assign all the columns from the entity of type Pin to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Pin()
    * database.update(Pins, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Pin) {
        this.apply {
            set(Pins.id, entity.id)
            set(Pins.createdAt, entity.createdAt)
            set(Pins.link, entity.link)
            set(Pins.title, entity.title)
            set(Pins.description, entity.description)
            set(Pins.dominantColor, entity.dominantColor)
            set(Pins.altText, entity.altText)
            set(Pins.creativeType, entity.creativeType)
            set(Pins.boardId, entity.boardId)
            set(Pins.boardSectionId, entity.boardSectionId)
            set(Pins.boardOwner, entity.boardOwner)
            set(Pins.isOwner, entity.isOwner)
            set(Pins.media, entity.media)
            set(Pins.mediaSource, entity.mediaSource)
            set(Pins.parentPinId, entity.parentPinId)
            set(Pins.isStandard, entity.isStandard)
            set(Pins.hasBeenPromoted, entity.hasBeenPromoted)
            set(Pins.note, entity.note)
            set(Pins.pinMetrics, entity.pinMetrics)
        }
    }

}

