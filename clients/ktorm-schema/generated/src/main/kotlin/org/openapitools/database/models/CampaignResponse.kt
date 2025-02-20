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
 * @param id Campaign ID.
 * @param adAccountId Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
 * @param name Campaign name.
 * @param status 
 * @param lifetimeSpendCap Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
 * @param dailySpendCap Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
 * @param orderLineId Order line ID that appears on the invoice.
 * @param trackingUrls 
 * @param startTime Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @param endTime Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
 * @param isFlexibleDailyBudgets Determine if a campaign has flexible daily budgets setup.
 * @param objectiveType 
 * @param createdTime Campaign creation time. Unix timestamp in seconds.
 * @param updatedTime UTC timestamp. Last update time.
 * @param type Always \"campaign\".
 * @param isCampaignBudgetOptimization Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
 * @param summaryStatus 
 */
object CampaignResponses : BaseTable<CampaignResponse>("CampaignResponse") {
    val id = text("id") /* null */ /* Campaign ID. */
    val adAccountId = text("ad_account_id") /* null */ /* Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. */
    val name = text("name") /* null */ /* Campaign name. */
    val status = long("status") /* null */
    val lifetimeSpendCap = int("lifetime_spend_cap") /* null */ /* Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. */
    val dailySpendCap = int("daily_spend_cap") /* null */ /* Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. */
    val orderLineId = text("order_line_id") /* null */ /* Order line ID that appears on the invoice. */
    val trackingUrls = long("tracking_urls") /* null */
    val startTime = int("start_time") /* null */ /* Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
    val endTime = int("end_time") /* null */ /* Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */
    val isFlexibleDailyBudgets = boolean("is_flexible_daily_budgets") /* null */ /* Determine if a campaign has flexible daily budgets setup. */
    val objectiveType = long("objective_type") /* null */
    val createdTime = int("created_time") /* null */ /* Campaign creation time. Unix timestamp in seconds. */
    val updatedTime = int("updated_time") /* null */ /* UTC timestamp. Last update time. */
    val type = text("type") /* null */ /* Always \"campaign\". */
    val isCampaignBudgetOptimization = boolean("is_campaign_budget_optimization") /* null */ /* Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. */
    val summaryStatus = long("summary_status") /* null */

    /**
     * Create an entity of type CampaignResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CampaignResponse(
        id = row[id]  /* kotlin.String? */ /* Campaign ID. */,
        adAccountId = row[adAccountId]  /* kotlin.String? */ /* Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. */,
        name = row[name]  /* kotlin.String? */ /* Campaign name. */,
        status = EntityStatuss.createEntity(row, withReferences) /* EntityStatus? */,
        lifetimeSpendCap = row[lifetimeSpendCap]  /* kotlin.Int? */ /* Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. */,
        dailySpendCap = row[dailySpendCap]  /* kotlin.Int? */ /* Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. */,
        orderLineId = row[orderLineId]  /* kotlin.String? */ /* Order line ID that appears on the invoice. */,
        trackingUrls = TrackingUrlss.createEntity(row, withReferences) /* TrackingUrls? */,
        startTime = row[startTime]  /* kotlin.Int? */ /* Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */,
        endTime = row[endTime]  /* kotlin.Int? */ /* Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. */,
        isFlexibleDailyBudgets = row[isFlexibleDailyBudgets]  /* kotlin.Boolean? */ /* Determine if a campaign has flexible daily budgets setup. */,
        objectiveType = ObjectiveTypes.createEntity(row, withReferences) /* ObjectiveType? */,
        createdTime = row[createdTime]  /* kotlin.Int? */ /* Campaign creation time. Unix timestamp in seconds. */,
        updatedTime = row[updatedTime]  /* kotlin.Int? */ /* UTC timestamp. Last update time. */,
        type = row[type]  /* kotlin.String? */ /* Always \"campaign\". */,
        isCampaignBudgetOptimization = row[isCampaignBudgetOptimization]  /* kotlin.Boolean? */ /* Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. */,
        summaryStatus = CampaignSummaryStatuss.createEntity(row, withReferences) /* CampaignSummaryStatus? */
    )

    /**
    * Assign all the columns from the entity of type CampaignResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CampaignResponse()
    * database.update(CampaignResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CampaignResponse) {
        this.apply {
            set(CampaignResponses.id, entity.id)
            set(CampaignResponses.adAccountId, entity.adAccountId)
            set(CampaignResponses.name, entity.name)
            set(CampaignResponses.status, entity.status)
            set(CampaignResponses.lifetimeSpendCap, entity.lifetimeSpendCap)
            set(CampaignResponses.dailySpendCap, entity.dailySpendCap)
            set(CampaignResponses.orderLineId, entity.orderLineId)
            set(CampaignResponses.trackingUrls, entity.trackingUrls)
            set(CampaignResponses.startTime, entity.startTime)
            set(CampaignResponses.endTime, entity.endTime)
            set(CampaignResponses.isFlexibleDailyBudgets, entity.isFlexibleDailyBudgets)
            set(CampaignResponses.objectiveType, entity.objectiveType)
            set(CampaignResponses.createdTime, entity.createdTime)
            set(CampaignResponses.updatedTime, entity.updatedTime)
            set(CampaignResponses.type, entity.type)
            set(CampaignResponses.isCampaignBudgetOptimization, entity.isCampaignBudgetOptimization)
            set(CampaignResponses.summaryStatus, entity.summaryStatus)
        }
    }

}


