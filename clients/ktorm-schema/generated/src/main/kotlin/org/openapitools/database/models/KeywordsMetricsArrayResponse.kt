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
 * 
 * @param data 
 */
object KeywordsMetricsArrayResponses : BaseTable<KeywordsMetricsArrayResponse>("KeywordsMetricsArrayResponse") {

    /**
     * Create an entity of type KeywordsMetricsArrayResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = KeywordsMetricsArrayResponse(
        data = emptyList() /* kotlin.Array<KeywordMetricsResponse>? */
    )

    /**
    * Assign all the columns from the entity of type KeywordsMetricsArrayResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = KeywordsMetricsArrayResponse()
    * database.update(KeywordsMetricsArrayResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: KeywordsMetricsArrayResponse) {
        this.apply {
        }
    }

}


object KeywordsMetricsArrayResponseKeywordMetricsResponse : BaseTable<Pair<kotlin.Long, kotlin.Long>>("KeywordsMetricsArrayResponseKeywordMetricsResponse") {
    val keywordsMetricsArrayResponse = long("keywordsMetricsArrayResponse")
    val keywordMetricsResponse = long("keywordMetricsResponse")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[keywordsMetricsArrayResponse] ?: 0, row[keywordMetricsResponse] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(KeywordsMetricsArrayResponseKeywordMetricsResponse.keywordsMetricsArrayResponse, entity.first)
            set(KeywordsMetricsArrayResponseKeywordMetricsResponse.keywordMetricsResponse, entity.second)
        }
    }

}
