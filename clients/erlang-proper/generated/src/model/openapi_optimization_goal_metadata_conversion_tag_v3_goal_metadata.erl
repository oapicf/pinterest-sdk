-module(openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata).

-include("openapi.hrl").

-export([openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata/0]).

-export([openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata/1]).

-export_type([openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata/0]).

-type openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata() ::
  [ {'attribution_windows', openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows:openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows() }
  | {'conversion_event', binary() }
  | {'conversion_tag_id', binary() }
  | {'cpa_goal_value_in_micro_currency', binary() }
  | {'is_roas_optimized', boolean() }
  | {'learning_mode_type', binary() }
  ].


openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata() ->
    openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata([]).

openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata(Fields) ->
  Default = [ {'attribution_windows', openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows:openapi_optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows() }
            , {'conversion_event', elements([<<"PAGE_VISIT">>, <<"SIGNUP">>, <<"CHECKOUT">>, <<"CUSTOM">>, <<"VIEW_CATEGORY">>, <<"SEARCH">>, <<"ADD_TO_CART">>, <<"WATCH_VIDEO">>, <<"LEAD">>, <<"APP_INSTALL">>]) }
            , {'conversion_tag_id', binary() }
            , {'cpa_goal_value_in_micro_currency', binary() }
            , {'is_roas_optimized', boolean() }
            , {'learning_mode_type', elements([<<"NOT_ACTIVE">>, <<"ACTIVE">>, <<"">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

