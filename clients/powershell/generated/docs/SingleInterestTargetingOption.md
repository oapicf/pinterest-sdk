# SingleInterestTargetingOption
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChildInterests** | **String[]** |  | 
**Id** | **String** |  | 
**Level** | **Int32** |  | 
**Name** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$SingleInterestTargetingOption = Initialize-PSOpenAPIToolsSingleInterestTargetingOption  -ChildInterests null `
 -Id 945391946569 `
 -Level 2 `
 -Name Dress
```

- Convert the resource to JSON
```powershell
$SingleInterestTargetingOption | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

