# BidFloorSpec
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Countries** | [**Country[]**](Country.md) |  | [optional] 
**Currency** | [**Currency**](Currency.md) |  | 
**ObjectiveType** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**BillableEvent** | [**ActionType**](ActionType.md) |  | 
**OptimizationGoalMetadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] 
**CreativeType** | [**CreativeType**](CreativeType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BidFloorSpec = Initialize-PSOpenAPIToolsBidFloorSpec  -Countries null `
 -Currency null `
 -ObjectiveType null `
 -BillableEvent null `
 -OptimizationGoalMetadata null `
 -CreativeType null
```

- Convert the resource to JSON
```powershell
$BidFloorSpec | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

