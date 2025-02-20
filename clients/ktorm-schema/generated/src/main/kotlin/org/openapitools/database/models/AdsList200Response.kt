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
object AdsList200Responses : BaseTable<AdsList200Response>("ads_list_200_response") {
    val bookmark = text("bookmark") /* null */

    /**
     * Create an entity of type AdsList200Response from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AdsList200Response(
        items = emptyList() /* kotlin.Array<AdResponse> */,
        bookmark = row[bookmark]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type AdsList200Response to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AdsList200Response()
    * database.update(AdsList200Responses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AdsList200Response) {
        this.apply {
            set(AdsList200Responses.bookmark, entity.bookmark)
        }
    }

}


object AdsList200ResponseAdResponse : BaseTable<Pair<kotlin.Long, kotlin.Long>>("AdsList200ResponseAdResponse") {
    val adsList200Response = long("adsList200Response")
    val adResponse = long("adResponse")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[adsList200Response] ?: 0, row[adResponse] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(AdsList200ResponseAdResponse.adsList200Response, entity.first)
            set(AdsList200ResponseAdResponse.adResponse, entity.second)
        }
    }

}

