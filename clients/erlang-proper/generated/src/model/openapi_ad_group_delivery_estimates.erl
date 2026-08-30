-module(openapi_ad_group_delivery_estimates).

-include("openapi.hrl").

-export([openapi_ad_group_delivery_estimates/0]).

-export([openapi_ad_group_delivery_estimates/1]).

-export_type([openapi_ad_group_delivery_estimates/0]).

-type openapi_ad_group_delivery_estimates() ::
  [ {'auto_targeting_enabled', boolean() }
  | {'creative_types', list(openapi_ad_group_audience_sizing_creative_types:openapi_ad_group_audience_sizing_creative_types()) }
  | {'keywords', list(openapi_ad_group_delivery_estimates_keywords_items:openapi_ad_group_delivery_estimates_keywords_items()) }
  | {'monthly_frequency_cap', integer() }
  | {'optimization_goal_metadata', openapi_optimization_goal_metadata:openapi_optimization_goal_metadata() }
  | {'optimization_type', openapi_optimization_type:openapi_optimization_type() }
  | {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
  | {'product_group_ids', list(binary()) }
  | {'targeting_spec', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
  ].


openapi_ad_group_delivery_estimates() ->
    openapi_ad_group_delivery_estimates([]).

openapi_ad_group_delivery_estimates(Fields) ->
  Default = [ {'auto_targeting_enabled', boolean() }
            , {'creative_types', list(openapi_ad_group_audience_sizing_creative_types:openapi_ad_group_audience_sizing_creative_types()) }
            , {'keywords', list(openapi_ad_group_delivery_estimates_keywords_items:openapi_ad_group_delivery_estimates_keywords_items()) }
            , {'monthly_frequency_cap', integer(0) }
            , {'optimization_goal_metadata', openapi_optimization_goal_metadata:openapi_optimization_goal_metadata() }
            , {'optimization_type', openapi_optimization_type:openapi_optimization_type() }
            , {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
            , {'product_group_ids', list(binary()) }
            , {'targeting_spec', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

