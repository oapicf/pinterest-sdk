# CampaignResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Campaign ID. | [optional] 
**adAccountId** | **string** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] 
**name** | **string** | Campaign name. | [optional] 
**status** | [**OpenAPI\Server\Model\EntityStatus**](EntityStatus.md) |  | [optional] 
**lifetimeSpendCap** | **int** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] 
**dailySpendCap** | **int** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] 
**orderLineId** | **string** | Order line ID that appears on the invoice. | [optional] 
**trackingUrls** | [**OpenAPI\Server\Model\TrackingUrls**](TrackingUrls.md) |  | [optional] 
**startTime** | **int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**endTime** | **int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] 
**isFlexibleDailyBudgets** | **bool** | Determine if a campaign has flexible daily budgets setup. | [optional] 
**objectiveType** | [**OpenAPI\Server\Model\ObjectiveType**](ObjectiveType.md) |  | [optional] 
**createdTime** | **int** | Campaign creation time. Unix timestamp in seconds. | [optional] 
**updatedTime** | **int** | UTC timestamp. Last update time. | [optional] 
**type** | **string** | Always \&quot;campaign\&quot;. | [optional] 
**isCampaignBudgetOptimization** | **bool** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] 
**summaryStatus** | [**OpenAPI\Server\Model\CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


