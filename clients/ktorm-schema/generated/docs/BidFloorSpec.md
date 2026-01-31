
# Table `BidFloorSpec`
(mapped from: BidFloorSpec)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**billableEvent** | billable_event | long NOT NULL |  | [**ActionType**](ActionType.md) |  |  [foreignkey]
**currency** | currency | long NOT NULL |  | [**Currency**](Currency.md) |  |  [foreignkey]
**countries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Country&gt;**](Country.md) |  |  [optional]
**creativeType** | creative_type | long |  | [**CreativeType**](CreativeType.md) |  |  [optional] [foreignkey]
**objectiveType** | objective_type | long |  | [**ObjectiveType**](ObjectiveType.md) |  |  [optional] [foreignkey]
**optimizationGoalMetadata** | optimization_goal_metadata | long |  | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  |  [optional] [foreignkey]




# **Table `BidFloorSpecCountry`**
(mapped from: BidFloorSpecCountry)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bidFloorSpec | bidFloorSpec | long | | kotlin.Long | Primary Key | *one*
country | country | long | | kotlin.Long | Foreign Key | *many*






