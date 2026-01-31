
# Table `TargetingSpecShoppingRetargeting`
(mapped from: TargetingSpecShoppingRetargeting)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**exclusionWindow** | exclusion_window | int |  | **kotlin.Int** | Number of days ago to stop lookback timeframe for dynamic retargeting |  [optional]
**lookbackWindow** | lookback_window | int |  | **kotlin.Int** | Number of days ago to start lookback timeframe for dynamic retargeting |  [optional]
**tagTypes** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | Event types to target for dynamic retargeting |  [optional]




# **Table `TargetingSpecShoppingRetargetingTagTypes`**
(mapped from: TargetingSpecShoppingRetargetingTagTypes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecShoppingRetargeting | targetingSpecShoppingRetargeting | long | | kotlin.Long | Primary Key | *one*
tagTypes | tagTypes | int | | kotlin.Int | Foreign Key | *many*



