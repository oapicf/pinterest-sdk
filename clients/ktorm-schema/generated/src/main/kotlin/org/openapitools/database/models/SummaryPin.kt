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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * Summarized pin information
 * @param media 
 * @param altText 
 * @param link 
 * @param title 
 * @param description 
 */
object SummaryPins : BaseTable<SummaryPin>("SummaryPin") {
    val media = long("media") /* null */
    val altText = text("alt_text") /* null */
    val link = text("link") /* null */
    val title = text("title") /* null */
    val description = text("description") /* null */

    /**
     * Create an entity of type SummaryPin from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = SummaryPin(
        media = PinMedias.createEntity(row, withReferences) /* PinMedia? */,
        altText = row[altText]  /* kotlin.String? */,
        link = row[link]  /* kotlin.String? */,
        title = row[title]  /* kotlin.String? */,
        description = row[description]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type SummaryPin to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = SummaryPin()
    * database.update(SummaryPins, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: SummaryPin) {
        this.apply {
            set(SummaryPins.media, entity.media)
            set(SummaryPins.altText, entity.altText)
            set(SummaryPins.link, entity.link)
            set(SummaryPins.title, entity.title)
            set(SummaryPins.description, entity.description)
        }
    }

}


