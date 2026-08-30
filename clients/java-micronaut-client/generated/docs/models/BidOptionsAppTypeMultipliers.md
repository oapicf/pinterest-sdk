

# BidOptionsAppTypeMultipliers

This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

The class is defined in **[BidOptionsAppTypeMultipliers.java](../../src/main/java/org/openapitools/model/BidOptionsAppTypeMultipliers.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**androidMobile** | `BigDecimal` |  |  [optional property]
**androidTablet** | `BigDecimal` |  |  [optional property]
**ipad** | `BigDecimal` |  |  [optional property]
**iphone** | `BigDecimal` |  |  [optional property]
**web** | `BigDecimal` |  |  [optional property]
**webMobile** | `BigDecimal` |  |  [optional property]








