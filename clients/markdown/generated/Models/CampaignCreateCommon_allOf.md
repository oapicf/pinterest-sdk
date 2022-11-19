# CampaignCreateCommon_allOf
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to ACTIVE] |
| **is\_campaign\_budget\_optimization** | **Boolean** |  | [optional] [default to false] |
| **is\_flexible\_daily\_budgets** | **Boolean** |  | [optional] [default to false] |
| **default\_ad\_group\_budget\_in\_micro\_currency** | **Integer** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] [default to null] |
| **is\_automated\_campaign** | **Boolean** |  | [optional] [default to false] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

