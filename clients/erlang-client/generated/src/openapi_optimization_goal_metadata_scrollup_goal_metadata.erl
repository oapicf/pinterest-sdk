-module(openapi_optimization_goal_metadata_scrollup_goal_metadata).

-export([encode/1]).

-export_type([openapi_optimization_goal_metadata_scrollup_goal_metadata/0]).

-type openapi_optimization_goal_metadata_scrollup_goal_metadata() ::
    #{ 'scrollup_goal_value_in_micro_currency' => binary()
     }.

encode(#{ 'scrollup_goal_value_in_micro_currency' := ScrollupGoalValueInMicroCurrency
        }) ->
    #{ 'scrollup_goal_value_in_micro_currency' => ScrollupGoalValueInMicroCurrency
     }.
