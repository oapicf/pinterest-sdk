-module(openapi_conversion_tag_v3_goal_metadata).

-include("openapi.hrl").

-export([openapi_conversion_tag_v3_goal_metadata/0]).

-export([openapi_conversion_tag_v3_goal_metadata/1]).

-export_type([openapi_conversion_tag_v3_goal_metadata/0]).

-type openapi_conversion_tag_v3_goal_metadata() ::
  [ {'attribution_windows', openapi_attribution_windows:openapi_attribution_windows() }
  | {'conversion_event', openapi_conversion_event:openapi_conversion_event() }
  | {'conversion_tag_id', binary() }
  | {'cpa_goal_value_in_micro_currency', binary() }
  | {'is_roas_optimized', boolean() }
  | {'reporting_event', binary() }
  ].


openapi_conversion_tag_v3_goal_metadata() ->
    openapi_conversion_tag_v3_goal_metadata([]).

openapi_conversion_tag_v3_goal_metadata(Fields) ->
  Default = [ {'attribution_windows', openapi_attribution_windows:openapi_attribution_windows() }
            , {'conversion_event', openapi_conversion_event:openapi_conversion_event() }
            , {'conversion_tag_id', binary() }
            , {'cpa_goal_value_in_micro_currency', binary() }
            , {'is_roas_optimized', boolean() }
            , {'reporting_event', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

