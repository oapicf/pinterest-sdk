-module(openapi_ad_group_audience_sizing_response).

-include("openapi.hrl").

-export([openapi_ad_group_audience_sizing_response/0]).

-export([openapi_ad_group_audience_sizing_response/1]).

-export_type([openapi_ad_group_audience_sizing_response/0]).

-type openapi_ad_group_audience_sizing_response() ::
  [ {'audience_size_lower_bound', integer() }
  | {'audience_size_upper_bound', integer() }
  ].


openapi_ad_group_audience_sizing_response() ->
    openapi_ad_group_audience_sizing_response([]).

openapi_ad_group_audience_sizing_response(Fields) ->
  Default = [ {'audience_size_lower_bound', integer() }
            , {'audience_size_upper_bound', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

