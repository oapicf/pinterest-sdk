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
 * @param trends The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend.
 */
object TrendingKeywordsResponses : BaseTable<TrendingKeywordsResponse>("TrendingKeywordsResponse") {

    /**
     * Create an entity of type TrendingKeywordsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = TrendingKeywordsResponse(
        trends = emptyList() /* kotlin.Array<TrendingKeywordsResponseTrendsInner>? */ /* The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend. */
    )

    /**
    * Assign all the columns from the entity of type TrendingKeywordsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = TrendingKeywordsResponse()
    * database.update(TrendingKeywordsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: TrendingKeywordsResponse) {
        this.apply {
        }
    }

}


object TrendingKeywordsResponseTrendingKeywordsResponseTrendsInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("TrendingKeywordsResponseTrendingKeywordsResponseTrendsInner") {
    val trendingKeywordsResponse = long("trendingKeywordsResponse")
    val trendingKeywordsResponseTrendsInner = long("trendingKeywordsResponseTrendsInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[trendingKeywordsResponse] ?: 0, row[trendingKeywordsResponseTrendsInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(TrendingKeywordsResponseTrendingKeywordsResponseTrendsInner.trendingKeywordsResponse, entity.first)
            set(TrendingKeywordsResponseTrendingKeywordsResponseTrendsInner.trendingKeywordsResponseTrendsInner, entity.second)
        }
    }

}
