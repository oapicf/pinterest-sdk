-module(openapi_ad_group_audience_sizing_keyword).

-include("openapi.hrl").

-export([openapi_ad_group_audience_sizing_keyword/0]).

-export([openapi_ad_group_audience_sizing_keyword/1]).

-export_type([openapi_ad_group_audience_sizing_keyword/0]).

-type openapi_ad_group_audience_sizing_keyword() ::
  [ {'match_type', openapi_match_type:openapi_match_type() }
  | {'value', binary() }
  ].


openapi_ad_group_audience_sizing_keyword() ->
    openapi_ad_group_audience_sizing_keyword([]).

openapi_ad_group_audience_sizing_keyword(Fields) ->
  Default = [ {'match_type', openapi_match_type:openapi_match_type() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

