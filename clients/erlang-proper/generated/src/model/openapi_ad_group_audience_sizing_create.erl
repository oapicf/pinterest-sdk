-module(openapi_ad_group_audience_sizing_create).

-include("openapi.hrl").

-export([openapi_ad_group_audience_sizing_create/0]).

-export([openapi_ad_group_audience_sizing_create/1]).

-export_type([openapi_ad_group_audience_sizing_create/0]).

-type openapi_ad_group_audience_sizing_create() ::
  [ {'auto_targeting_enabled', boolean() }
  | {'creative_types', list(openapi_ad_group_audience_sizing_creative_types:openapi_ad_group_audience_sizing_creative_types()) }
  | {'keywords', list(openapi_ad_group_audience_sizing_keyword:openapi_ad_group_audience_sizing_keyword()) }
  | {'placement_group', openapi_adgroup_placement_group_type:openapi_adgroup_placement_group_type() }
  | {'product_group_ids', list(binary()) }
  | {'targeting_spec', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
  ].


openapi_ad_group_audience_sizing_create() ->
    openapi_ad_group_audience_sizing_create([]).

openapi_ad_group_audience_sizing_create(Fields) ->
  Default = [ {'auto_targeting_enabled', boolean() }
            , {'creative_types', list(openapi_ad_group_audience_sizing_creative_types:openapi_ad_group_audience_sizing_creative_types()) }
            , {'keywords', list(openapi_ad_group_audience_sizing_keyword:openapi_ad_group_audience_sizing_keyword()) }
            , {'placement_group', openapi_adgroup_placement_group_type:openapi_adgroup_placement_group_type() }
            , {'product_group_ids', list(binary()) }
            , {'targeting_spec', openapi_targeting_spec_optimal:openapi_targeting_spec_optimal() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

