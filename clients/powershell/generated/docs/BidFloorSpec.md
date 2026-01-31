# BidFloorSpec
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BillableEvent** | [**ActionType**](ActionType.md) |  | 
**Countries** | [**Country[]**](Country.md) |  | [optional] 
**CreativeType** | [**CreativeType**](CreativeType.md) |  | [optional] 
**Currency** | [**Currency**](Currency.md) |  | 
**ObjectiveType** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] 
**OptimizationGoalMetadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BidFloorSpec = Initialize-PSOpenAPIToolsBidFloorSpec  -BillableEvent null `
 -Countries null `
 -CreativeType null `
 -Currency null `
 -ObjectiveType null `
 -OptimizationGoalMetadata null
```

- Convert the resource to JSON
```powershell
$BidFloorSpec | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

