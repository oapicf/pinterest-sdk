# TargetingSpecShoppingRetargeting
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExclusionWindow** | **Int32** | Number of days ago to stop lookback timeframe for dynamic retargeting | [optional] 
**LookbackWindow** | **Int32** | Number of days ago to start lookback timeframe for dynamic retargeting | [optional] 
**TagTypes** | **Int32[]** | Event types to target for dynamic retargeting | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingSpecShoppingRetargeting = Initialize-PSOpenAPIToolsTargetingSpecShoppingRetargeting  -ExclusionWindow 14 `
 -LookbackWindow 30 `
 -TagTypes [0,6]
```

- Convert the resource to JSON
```powershell
$TargetingSpecShoppingRetargeting | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

