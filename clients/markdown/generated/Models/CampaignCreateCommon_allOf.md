# CampaignCreateCommon_allOf
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **is\_campaign\_budget\_optimization** | **Boolean** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] [default to null] |
| **is\_flexible\_daily\_budgets** | **Boolean** | Determine if a campaign has flexible daily budgets setup. | [optional] [default to null] |
| **default\_ad\_group\_budget\_in\_micro\_currency** | **Integer** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] [default to null] |
| **is\_automated\_campaign** | **Boolean** | Specifies whether the campaign was created in the automated campaign flow | [optional] [default to null] |
| **objective\_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

