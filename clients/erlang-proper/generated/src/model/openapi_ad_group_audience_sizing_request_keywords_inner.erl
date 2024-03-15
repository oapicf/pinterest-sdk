-module(openapi_ad_group_audience_sizing_request_keywords_inner).

-include("openapi.hrl").

-export([openapi_ad_group_audience_sizing_request_keywords_inner/0]).

-export([openapi_ad_group_audience_sizing_request_keywords_inner/1]).

-export_type([openapi_ad_group_audience_sizing_request_keywords_inner/0]).

-type openapi_ad_group_audience_sizing_request_keywords_inner() ::
  [ {'match_type', openapi_match_type_response:openapi_match_type_response() }
  | {'value', binary() }
  ].


openapi_ad_group_audience_sizing_request_keywords_inner() ->
    openapi_ad_group_audience_sizing_request_keywords_inner([]).

openapi_ad_group_audience_sizing_request_keywords_inner(Fields) ->
  Default = [ {'match_type', openapi_match_type_response:openapi_match_type_response() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

