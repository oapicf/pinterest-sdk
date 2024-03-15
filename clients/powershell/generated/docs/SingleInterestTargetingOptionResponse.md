# SingleInterestTargetingOptionResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | [optional] 
**Name** | **String** |  | [optional] 
**ChildInterests** | **String[]** |  | [optional] 
**Level** | **Int32** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SingleInterestTargetingOptionResponse = Initialize-PSOpenAPIToolsSingleInterestTargetingOptionResponse  -Id 945391946569 `
 -Name Dress `
 -ChildInterests null `
 -Level 2
```

- Convert the resource to JSON
```powershell
$SingleInterestTargetingOptionResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

