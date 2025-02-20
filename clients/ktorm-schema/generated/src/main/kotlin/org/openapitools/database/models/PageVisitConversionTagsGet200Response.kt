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
 * 
 * @param items 
 * @param bookmark 
 */
object PageVisitConversionTagsGet200Responses : BaseTable<PageVisitConversionTagsGet200Response>("page_visit_conversion_tags_get_200_response") {
    val bookmark = text("bookmark") /* null */

    /**
     * Create an entity of type PageVisitConversionTagsGet200Response from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = PageVisitConversionTagsGet200Response(
        items = emptyList() /* kotlin.Array<ConversionEventResponse> */,
        bookmark = row[bookmark]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type PageVisitConversionTagsGet200Response to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = PageVisitConversionTagsGet200Response()
    * database.update(PageVisitConversionTagsGet200Responses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: PageVisitConversionTagsGet200Response) {
        this.apply {
            set(PageVisitConversionTagsGet200Responses.bookmark, entity.bookmark)
        }
    }

}


object PageVisitConversionTagsGet200ResponseConversionEventResponse : BaseTable<Pair<kotlin.Long, kotlin.Long>>("PageVisitConversionTagsGet200ResponseConversionEventResponse") {
    val pageVisitConversionTagsGet200Response = long("pageVisitConversionTagsGet200Response")
    val conversionEventResponse = long("conversionEventResponse")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[pageVisitConversionTagsGet200Response] ?: 0, row[conversionEventResponse] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(PageVisitConversionTagsGet200ResponseConversionEventResponse.pageVisitConversionTagsGet200Response, entity.first)
            set(PageVisitConversionTagsGet200ResponseConversionEventResponse.conversionEventResponse, entity.second)
        }
    }

}

