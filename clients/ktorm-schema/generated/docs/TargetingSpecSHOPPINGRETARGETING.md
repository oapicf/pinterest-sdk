
# Table `TargetingSpec_SHOPPING_RETARGETING`
(mapped from: TargetingSpecSHOPPINGRETARGETING)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**lookbackWindow** | lookback_window | int |  | **kotlin.Int** | Number of days ago to start lookback timeframe for dynamic retargeting |  [optional]
**tagTypes** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Int&gt;** | Event types to target for dynamic retargeting |  [optional]
**exclusionWindow** | exclusion_window | int |  | **kotlin.Int** | Number of days ago to stop lookback timeframe for dynamic retargeting |  [optional]



# **Table `TargetingSpecSHOPPINGRETARGETINGTagTypes`**
(mapped from: TargetingSpecSHOPPINGRETARGETINGTagTypes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingSpecSHOPPINGRETARGETING | targetingSpecSHOPPINGRETARGETING | long | | kotlin.Long | Primary Key | *one*
tagTypes | tagTypes | int | | kotlin.Int | Foreign Key | *many*




