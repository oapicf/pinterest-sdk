
# Table `AdGroupResponse_allOf_1`
(mapped from: AdGroupResponseAllOf1)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**campaignId** | campaign_id | text |  | **kotlin.String** | Campaign ID of the ad group. |  [optional]
**billableEvent** | billable_event | long |  | [**ActionType**](ActionType.md) |  |  [optional] [foreignkey]
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Ad group ID. |  [optional]
**type** | type | text |  | **kotlin.String** | Always \&quot;adgroup\&quot;. |  [optional]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Advertiser ID. |  [optional]
**createdTime** | created_time | int |  | **kotlin.Int** | Ad group creation time. Unix timestamp in seconds. |  [optional]
**updatedTime** | updated_time | int |  | **kotlin.Int** | Ad group last update time. Unix timestamp in seconds. |  [optional]









