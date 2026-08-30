# CustomerSegment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | The ID of the ad account that this customer segment belongs to. | [optional][readonly]
**audience_ids** | **Vec<String>** | Audience IDs included in the customer segment. | 
**created_time** | Option<**i32**> | Customer segment created time. Unix timestamp in seconds. | [optional][readonly]
**id** | Option<**String**> | Customer segment ID. | [optional][readonly]
**name** | **String** | Customer segment name. | 
**status** | Option<[**models::TargetingTemplateStatus**](TargetingTemplateStatus.md)> | Indicates whether the customer segment is active or deleted. | [optional][readonly]
**updated_time** | Option<**i32**> | Customer segment updated time. Unix timestamp in seconds. | [optional][readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


