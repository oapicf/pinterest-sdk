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
 * @param keyword The keyword that is trending.
 * @param pctGrowthWow The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
 * @param pctGrowthMom The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
 * @param pctGrowthYoy The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
 * @param timeSeries 
 */
object TrendingKeywordsResponseTrendsInners : BaseTable<TrendingKeywordsResponseTrendsInner>("TrendingKeywordsResponse_trends_inner") {
    val keyword = text("keyword") /* null */ /* The keyword that is trending. */
    val pctGrowthWow = int("pct_growth_wow") /* null */ /* The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth. */
    val pctGrowthMom = int("pct_growth_mom") /* null */ /* The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth. */
    val pctGrowthYoy = int("pct_growth_yoy") /* null */ /* The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth. */
    val timeSeries = long("time_series") /* null */

    /**
     * Create an entity of type TrendingKeywordsResponseTrendsInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = TrendingKeywordsResponseTrendsInner(
        keyword = row[keyword]  /* kotlin.String? */ /* The keyword that is trending. */,
        pctGrowthWow = row[pctGrowthWow]  /* kotlin.Int? */ /* The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth. */,
        pctGrowthMom = row[pctGrowthMom]  /* kotlin.Int? */ /* The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth. */,
        pctGrowthYoy = row[pctGrowthYoy]  /* kotlin.Int? */ /* The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth. */,
        timeSeries = TrendingKeywordsResponseTrendsInnerTimeSeriess.createEntity(row, withReferences) /* TrendingKeywordsResponseTrendsInnerTimeSeries? */
    )

    /**
    * Assign all the columns from the entity of type TrendingKeywordsResponseTrendsInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = TrendingKeywordsResponseTrendsInner()
    * database.update(TrendingKeywordsResponseTrendsInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: TrendingKeywordsResponseTrendsInner) {
        this.apply {
            set(TrendingKeywordsResponseTrendsInners.keyword, entity.keyword)
            set(TrendingKeywordsResponseTrendsInners.pctGrowthWow, entity.pctGrowthWow)
            set(TrendingKeywordsResponseTrendsInners.pctGrowthMom, entity.pctGrowthMom)
            set(TrendingKeywordsResponseTrendsInners.pctGrowthYoy, entity.pctGrowthYoy)
            set(TrendingKeywordsResponseTrendsInners.timeSeries, entity.timeSeries)
        }
    }

}


