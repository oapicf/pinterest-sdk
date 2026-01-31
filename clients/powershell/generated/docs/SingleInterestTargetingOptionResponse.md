# SingleInterestTargetingOptionResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChildInterests** | **String[]** |  | [optional] 
**Id** | **String** |  | [optional] 
**Level** | **Int32** |  | [optional] 
**Name** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SingleInterestTargetingOptionResponse = Initialize-PSOpenAPIToolsSingleInterestTargetingOptionResponse  -ChildInterests null `
 -Id 945391946569 `
 -Level 2 `
 -Name Dress
```

- Convert the resource to JSON
```powershell
$SingleInterestTargetingOptionResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

