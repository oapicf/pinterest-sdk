# Org.OpenAPITools.Model.BidOptionsAppTypeMultipliers
This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AndroidMobile** | **decimal** |  | [optional] 
**AndroidTablet** | **decimal** |  | [optional] 
**Ipad** | **decimal** |  | [optional] 
**Iphone** | **decimal** |  | [optional] 
**Web** | **decimal** |  | [optional] 
**WebMobile** | **decimal** |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

