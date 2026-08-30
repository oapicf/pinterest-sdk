

# BidOptionsAgeBucketMultipliers

This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_18_24** | **BigDecimal** |  |  [optional] |
|**_25_34** | **BigDecimal** |  |  [optional] |
|**_35_44** | **BigDecimal** |  |  [optional] |
|**_45_49** | **BigDecimal** |  |  [optional] |
|**_50_54** | **BigDecimal** |  |  [optional] |
|**_55_64** | **BigDecimal** |  |  [optional] |
|**_65plus** | **BigDecimal** |  |  [optional] |



