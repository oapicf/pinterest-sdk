# AdsCreditRedeemResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Success** | **Boolean** | Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true). | [optional] 
**ErrorCode** | **Int32** | Error code type if error occurs | [optional] 
**ErrorMessage** | **String** | Reason for failure | [optional] 

## Examples

- Prepare the resource
```powershell
$AdsCreditRedeemResponse = Initialize-PSOpenAPIToolsAdsCreditRedeemResponse  -Success false `
 -ErrorCode 2708 `
 -ErrorMessage The offer has already been redeemed by this advertiser
```

- Convert the resource to JSON
```powershell
$AdsCreditRedeemResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

