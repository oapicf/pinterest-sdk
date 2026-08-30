# BidFloorSpec
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BillableEvent** | [**ActionType**](ActionType.md) | Ad group billable event type. | 
**Countries** | [**Country[]**](Country.md) | List of ISO 3166-1 alpha-2 country codes. | [optional] 
**CreativeType** | [**CreativeType**](CreativeType.md) | Creative type for the bid floor request. | [optional] 
**Currency** | [**Currency**](Currency.md) | Currency for the bid floor value. | 
**ObjectiveType** | [**BidFloorObjectiveType**](BidFloorObjectiveType.md) | Campaign objective type. | [optional] 
**OptimizationGoalMetadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) | Optimization goal metadata. | [optional] 

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

