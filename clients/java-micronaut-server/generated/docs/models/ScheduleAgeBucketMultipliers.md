

# ScheduleAgeBucketMultipliers

This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

The class is defined in **[ScheduleAgeBucketMultipliers.java](../../src/main/java/org/openapitools/model/ScheduleAgeBucketMultipliers.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AGE_BUCKET** | [**AGEBUCKETEnum**](#AGEBUCKETEnum) |  |  [optional property]

## AGEBUCKETEnum

Name | Value
---- | -----
_18_24 | `"18-24"`
_25_34 | `"25-34"`
_35_44 | `"35-44"`
_45_49 | `"45-49"`
_50_54 | `"50-54"`
_55_64 | `"55-64"`
_65_ | `"65+"`


