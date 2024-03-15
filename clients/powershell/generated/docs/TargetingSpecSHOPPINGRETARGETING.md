# TargetingSpecSHOPPINGRETARGETING
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LookbackWindow** | **Int32** | Number of days ago to start lookback timeframe for dynamic retargeting | [optional] 
**TagTypes** | **Int32[]** | Event types to target for dynamic retargeting | [optional] 
**ExclusionWindow** | **Int32** | Number of days ago to stop lookback timeframe for dynamic retargeting | [optional] 

## Examples

- Prepare the resource
```powershell
$TargetingSpecSHOPPINGRETARGETING = Initialize-PSOpenAPIToolsTargetingSpecSHOPPINGRETARGETING  -LookbackWindow 30 `
 -TagTypes [0,6] `
 -ExclusionWindow 14
```

- Convert the resource to JSON
```powershell
$TargetingSpecSHOPPINGRETARGETING | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

