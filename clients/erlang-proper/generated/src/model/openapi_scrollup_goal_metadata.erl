-module(openapi_scrollup_goal_metadata).

-include("openapi.hrl").

-export([openapi_scrollup_goal_metadata/0]).

-export([openapi_scrollup_goal_metadata/1]).

-export_type([openapi_scrollup_goal_metadata/0]).

-type openapi_scrollup_goal_metadata() ::
  [ {'scrollup_goal_value_in_micro_currency', binary() }
  ].


openapi_scrollup_goal_metadata() ->
    openapi_scrollup_goal_metadata([]).

openapi_scrollup_goal_metadata(Fields) ->
  Default = [ {'scrollup_goal_value_in_micro_currency', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

