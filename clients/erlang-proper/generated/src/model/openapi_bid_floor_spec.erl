-module(openapi_bid_floor_spec).

-include("openapi.hrl").

-export([openapi_bid_floor_spec/0]).

-export([openapi_bid_floor_spec/1]).

-export_type([openapi_bid_floor_spec/0]).

-type openapi_bid_floor_spec() ::
  [ {'countries', list(openapi_country:openapi_country()) }
  | {'currency', openapi_currency:openapi_currency() }
  | {'objective_type', openapi_objective_type:openapi_objective_type() }
  | {'billable_event', openapi_action_type:openapi_action_type() }
  | {'optimization_goal_metadata', openapi_optimization_goal_metadata:openapi_optimization_goal_metadata() }
  | {'creative_type', openapi_creative_type:openapi_creative_type() }
  ].


openapi_bid_floor_spec() ->
    openapi_bid_floor_spec([]).

openapi_bid_floor_spec(Fields) ->
  Default = [ {'countries', list(openapi_country:openapi_country()) }
            , {'currency', openapi_currency:openapi_currency() }
            , {'objective_type', openapi_objective_type:openapi_objective_type() }
            , {'billable_event', openapi_action_type:openapi_action_type() }
            , {'optimization_goal_metadata', openapi_optimization_goal_metadata:openapi_optimization_goal_metadata() }
            , {'creative_type', openapi_creative_type:openapi_creative_type() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

