-module(openapi_ad_preview_url_response).

-include("openapi.hrl").

-export([openapi_ad_preview_url_response/0]).

-export([openapi_ad_preview_url_response/1]).

-export_type([openapi_ad_preview_url_response/0]).

-type openapi_ad_preview_url_response() ::
  [ {'url', binary() }
  ].


openapi_ad_preview_url_response() ->
    openapi_ad_preview_url_response([]).

openapi_ad_preview_url_response(Fields) ->
  Default = [ {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

