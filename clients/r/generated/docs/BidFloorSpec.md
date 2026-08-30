# openapi::BidFloorSpec

Bid floor specification for a given campaign configuration.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billable_event** | [**ActionType**](ActionType.md) | Ad group billable event type. | [Enum: ] 
**countries** | [**array[Country]**](Country.md) | List of ISO 3166-1 alpha-2 country codes. | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) | Creative type for the bid floor request. | [optional] [Enum: ] 
**currency** | [**Currency**](Currency.md) | Currency for the bid floor value. | [Enum: ] 
**objective_type** | [**BidFloorObjectiveType**](BidFloorObjectiveType.md) | Campaign objective type. | [optional] [Enum: ] 
**optimization_goal_metadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) | Optimization goal metadata. | [optional] 


