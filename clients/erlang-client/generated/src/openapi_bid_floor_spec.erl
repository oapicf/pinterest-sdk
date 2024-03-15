-module(openapi_bid_floor_spec).

-export([encode/1]).

-export_type([openapi_bid_floor_spec/0]).

-type openapi_bid_floor_spec() ::
    #{ 'countries' => list(),
       'currency' := openapi_currency:openapi_currency(),
       'objective_type' => openapi_objective_type:openapi_objective_type(),
       'billable_event' := openapi_action_type:openapi_action_type(),
       'optimization_goal_metadata' => openapi_optimization_goal_metadata:openapi_optimization_goal_metadata(),
       'creative_type' => openapi_creative_type:openapi_creative_type()
     }.

encode(#{ 'countries' := Countries,
          'currency' := Currency,
          'objective_type' := ObjectiveType,
          'billable_event' := BillableEvent,
          'optimization_goal_metadata' := OptimizationGoalMetadata,
          'creative_type' := CreativeType
        }) ->
    #{ 'countries' => Countries,
       'currency' => Currency,
       'objective_type' => ObjectiveType,
       'billable_event' => BillableEvent,
       'optimization_goal_metadata' => OptimizationGoalMetadata,
       'creative_type' => CreativeType
     }.
