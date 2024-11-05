# CampaignUpdateRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | Campaign ID. | [default to null] |
| **ad\_account\_id** | **String** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [default to null] |
| **name** | **String** | Campaign name. | [optional] [default to null] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to null] |
| **lifetime\_spend\_cap** | **Integer** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] [default to null] |
| **daily\_spend\_cap** | **Integer** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] [default to null] |
| **order\_line\_id** | **String** | Order line ID that appears on the invoice. | [optional] [default to null] |
| **tracking\_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to null] |
| **start\_time** | **Integer** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null] |
| **end\_time** | **Integer** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null] |
| **is\_flexible\_daily\_budgets** | **Boolean** | Determine if a campaign has flexible daily budgets setup. | [optional] [default to null] |
| **default\_ad\_group\_budget\_in\_micro\_currency** | **Integer** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] [default to null] |
| **is\_automated\_campaign** | **Boolean** | Specifies whether the campaign was created in the automated campaign flow | [optional] [default to null] |
| **is\_campaign\_budget\_optimization** | **Boolean** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] [default to null] |
| **objective\_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

