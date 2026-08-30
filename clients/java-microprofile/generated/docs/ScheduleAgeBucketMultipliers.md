

# ScheduleAgeBucketMultipliers

This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**AGE_BUCKET** | [**AGEBUCKETEnum**](#AGEBUCKETEnum) |  |  [optional] |



## Enum: AGEBUCKETEnum

| Name | Value |
|---- | -----|
| _18_24 | &quot;18-24&quot; |
| _25_34 | &quot;25-34&quot; |
| _35_44 | &quot;35-44&quot; |
| _45_49 | &quot;45-49&quot; |
| _50_54 | &quot;50-54&quot; |
| _55_64 | &quot;55-64&quot; |
| _65_ | &quot;65+&quot; |



