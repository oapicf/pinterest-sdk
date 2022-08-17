# CampaignResponse_allOf
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **objective\_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] [default to null] |
| **created\_time** | **Integer** | Campaign creation time. Unix timestamp in seconds. | [optional] [default to null] |
| **updated\_time** | **Integer** | UTC timestamp. Last update time. | [optional] [default to null] |
| **type** | **String** | Always \&quot;campaign\&quot;. | [optional] [default to null] |
| **is\_flexible\_daily\_budgets** | **Boolean** | Determines if a campaign has flexible daily budgets setup. | [optional] [default to null] |
| **is\_campaign\_budget\_optimization** | **Boolean** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

