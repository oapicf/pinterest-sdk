# Org.OpenAPITools.Model.ScheduleBidOptionsPlacementMultipliers
This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Browse** | **double** | Browse (home-feed and related surfaces) | [optional] 
**RelatedPins** | **double** | Related-Pins placement | [optional] 
**Search** | **double** | Search placement | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

