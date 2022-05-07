
# Table `CampaignResponse`
(mapped from: CampaignResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Campaign ID. | 
**adAccountId** | ad_account_id | text NOT NULL |  | **kotlin.String** | Campaign&#39;s Advertiser ID. | 
**name** | name | text |  | **kotlin.String** | Campaign name. |  [optional]
**status** | status | long |  | [**EntityStatus**](EntityStatus.md) |  |  [optional] [foreignkey]
**lifetimeSpendCap** | lifetime_spend_cap | int |  | **kotlin.Int** | Campaign total spending cap. |  [optional]
**dailySpendCap** | daily_spend_cap | int |  | **kotlin.Int** | Campaign daily spending cap. |  [optional]
**orderLineId** | order_line_id | text |  | **kotlin.String** | Order line ID that appears on the invoice. |  [optional]
**trackingUrls** | tracking_urls | long |  | [**TrackingUrls**](TrackingUrls.md) |  |  [optional] [foreignkey]
**startTime** | start_time | int |  | **kotlin.Int** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional]
**endTime** | end_time | int |  | **kotlin.Int** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. |  [optional]
**objectiveType** | objective_type | long |  | [**ObjectiveType**](ObjectiveType.md) |  |  [optional] [foreignkey]
**createdTime** | created_time | int |  | **kotlin.Int** | Campaign creation time. Unix timestamp in seconds. |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** | UTC timestamp. Last update time. |  [optional]
**type** | type | text |  | **kotlin.String** | Always \&quot;campaign\&quot;. |  [optional]
















