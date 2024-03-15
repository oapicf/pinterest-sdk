-module(openapi_ad_group_audience_sizing_request).

-include("openapi.hrl").

-export([openapi_ad_group_audience_sizing_request/0]).

-export([openapi_ad_group_audience_sizing_request/1]).

-export_type([openapi_ad_group_audience_sizing_request/0]).

-type openapi_ad_group_audience_sizing_request() ::
  [ {'auto_targeting_enabled', boolean() }
  | {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
  | {'creative_types', list(binary()) }
  | {'targeting_spec', openapi_targeting_spec:openapi_targeting_spec() }
  | {'product_group_ids', list(binary()) }
  | {'keywords', list(openapi_ad_group_audience_sizing_request_keywords_inner:openapi_ad_group_audience_sizing_request_keywords_inner()) }
  ].


openapi_ad_group_audience_sizing_request() ->
    openapi_ad_group_audience_sizing_request([]).

openapi_ad_group_audience_sizing_request(Fields) ->
  Default = [ {'auto_targeting_enabled', boolean() }
            , {'placement_group', openapi_placement_group_type:openapi_placement_group_type() }
            , {'creative_types', list(binary()) }
            , {'targeting_spec', openapi_targeting_spec:openapi_targeting_spec() }
            , {'product_group_ids', list(binary()) }
            , {'keywords', list(openapi_ad_group_audience_sizing_request_keywords_inner:openapi_ad_group_audience_sizing_request_keywords_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

