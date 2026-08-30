
# Table `BidFloorSpec`
(mapped from: BidFloorSpec)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**billableEvent** | billable_event | long NOT NULL |  | [**ActionType**](ActionType.md) | Ad group billable event type. |  [foreignkey]
**currency** | currency | long NOT NULL |  | [**Currency**](Currency.md) | Currency for the bid floor value. |  [foreignkey]
**countries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Country&gt;**](Country.md) | List of ISO 3166-1 alpha-2 country codes. |  [optional]
**creativeType** | creative_type | long |  | [**CreativeType**](CreativeType.md) | Creative type for the bid floor request. |  [optional] [foreignkey]
**objectiveType** | objective_type | long |  | [**BidFloorObjectiveType**](BidFloorObjectiveType.md) | Campaign objective type. |  [optional] [foreignkey]
**optimizationGoalMetadata** | optimization_goal_metadata | long |  | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) | Optimization goal metadata. |  [optional] [foreignkey]




# **Table `BidFloorSpecCountry`**
(mapped from: BidFloorSpecCountry)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
bidFloorSpec | bidFloorSpec | long | | kotlin.Long | Primary Key | *one*
country | country | long | | kotlin.Long | Foreign Key | *many*






