# CustomerSegment
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | The ID of the ad account that this customer segment belongs to. | [optional] [readonly] 
**AudienceIds** | **String[]** | Audience IDs included in the customer segment. | 
**CreatedTime** | **Int32** | Customer segment created time. Unix timestamp in seconds. | [optional] [readonly] 
**Id** | **String** | Customer segment ID. | [optional] [readonly] 
**Name** | **String** | Customer segment name. | 
**Status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicates whether the customer segment is active or deleted. | [optional] [readonly] 
**UpdatedTime** | **Int32** | Customer segment updated time. Unix timestamp in seconds. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$CustomerSegment = Initialize-PSOpenAPIToolsCustomerSegment  -AdAccountId null `
 -AudienceIds null `
 -CreatedTime null `
 -Id null `
 -Name null `
 -Status null `
 -UpdatedTime null
```

- Convert the resource to JSON
```powershell
$CustomerSegment | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

