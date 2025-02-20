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
object TemplatesList200Responses : BaseTable<TemplatesList200Response>("templates_list_200_response") {
    val bookmark = text("bookmark") /* null */

    /**
     * Create an entity of type TemplatesList200Response from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = TemplatesList200Response(
        items = emptyList() /* kotlin.Array<TemplateResponse> */,
        bookmark = row[bookmark]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type TemplatesList200Response to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = TemplatesList200Response()
    * database.update(TemplatesList200Responses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: TemplatesList200Response) {
        this.apply {
            set(TemplatesList200Responses.bookmark, entity.bookmark)
        }
    }

}


object TemplatesList200ResponseTemplateResponse : BaseTable<Pair<kotlin.Long, kotlin.Long>>("TemplatesList200ResponseTemplateResponse") {
    val templatesList200Response = long("templatesList200Response")
    val templateResponse = long("templateResponse")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[templatesList200Response] ?: 0, row[templateResponse] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(TemplatesList200ResponseTemplateResponse.templatesList200Response, entity.first)
            set(TemplatesList200ResponseTemplateResponse.templateResponse, entity.second)
        }
    }

}

