-module(openapi_bid_floor_spec).

-export([encode/1]).

-export_type([openapi_bid_floor_spec/0]).

-type openapi_bid_floor_spec() ::
    #{ 'billable_event' := openapi_action_type:openapi_action_type(),
       'countries' => list(),
       'creative_type' => openapi_creative_type:openapi_creative_type(),
       'currency' := openapi_currency:openapi_currency(),
       'objective_type' => openapi_bid_floor_objective_type:openapi_bid_floor_objective_type(),
       'optimization_goal_metadata' => openapi_optimization_goal_metadata:openapi_optimization_goal_metadata()
     }.

encode(#{ 'billable_event' := BillableEvent,
          'countries' := Countries,
          'creative_type' := CreativeType,
          'currency' := Currency,
          'objective_type' := ObjectiveType,
          'optimization_goal_metadata' := OptimizationGoalMetadata
        }) ->
    #{ 'billable_event' => BillableEvent,
       'countries' => Countries,
       'creative_type' => CreativeType,
       'currency' => Currency,
       'objective_type' => ObjectiveType,
       'optimization_goal_metadata' => OptimizationGoalMetadata
     }.
