-module(openapi_nullable_optimization_goal_metadata).

-include("openapi.hrl").

-export([openapi_nullable_optimization_goal_metadata/0]).

-export([openapi_nullable_optimization_goal_metadata/1]).

-export_type([openapi_nullable_optimization_goal_metadata/0]).

-type openapi_nullable_optimization_goal_metadata() ::
  [ {'conversion_tag_v3_goal_metadata', openapi_conversion_tag_v3_goal_metadata:openapi_conversion_tag_v3_goal_metadata() }
  | {'frequency_goal_metadata', openapi_frequency_goal_metadata:openapi_frequency_goal_metadata() }
  | {'scrollup_goal_metadata', openapi_scrollup_goal_metadata:openapi_scrollup_goal_metadata() }
  ].


openapi_nullable_optimization_goal_metadata() ->
    openapi_nullable_optimization_goal_metadata([]).

openapi_nullable_optimization_goal_metadata(Fields) ->
  Default = [ {'conversion_tag_v3_goal_metadata', openapi_conversion_tag_v3_goal_metadata:openapi_conversion_tag_v3_goal_metadata() }
            , {'frequency_goal_metadata', openapi_frequency_goal_metadata:openapi_frequency_goal_metadata() }
            , {'scrollup_goal_metadata', openapi_scrollup_goal_metadata:openapi_scrollup_goal_metadata() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

