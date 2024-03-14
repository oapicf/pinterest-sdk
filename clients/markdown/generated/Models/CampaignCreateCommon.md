# CampaignCreateCommon
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String** | Campaign&#39;s Advertiser ID. | [optional] [default to null] |
| **name** | **String** | Campaign name. | [optional] [default to null] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to ACTIVE] |
| **lifetime\_spend\_cap** | **Integer** | Campaign total spending cap. | [optional] [default to null] |
| **daily\_spend\_cap** | **Integer** | Campaign daily spending cap. | [optional] [default to null] |
| **order\_line\_id** | **String** | Order line ID that appears on the invoice. | [optional] [default to null] |
| **tracking\_urls** | [**AdCommon_tracking_urls**](AdCommon_tracking_urls.md) |  | [optional] [default to null] |
| **start\_time** | **Integer** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null] |
| **end\_time** | **Integer** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to null] |
| **is\_campaign\_budget\_optimization** | **Boolean** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] [default to false] |
| **is\_flexible\_daily\_budgets** | **Boolean** | Determine if a campaign has flexible daily budgets setup. | [optional] [default to false] |
| **default\_ad\_group\_budget\_in\_micro\_currency** | **Integer** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] [default to null] |
| **is\_automated\_campaign** | **Boolean** | Specifies whether the campaign was created in the automated campaign flow | [optional] [default to false] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

