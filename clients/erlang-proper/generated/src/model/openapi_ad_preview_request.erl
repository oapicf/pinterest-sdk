-module(openapi_ad_preview_request).

-include("openapi.hrl").

-export([openapi_ad_preview_request/0]).

-export([openapi_ad_preview_request/1]).

-export_type([openapi_ad_preview_request/0]).

-type openapi_ad_preview_request() ::
  [ {'image_url', binary() }
  | {'title', binary() }
  | {'pin_id', binary() }
  ].


openapi_ad_preview_request() ->
    openapi_ad_preview_request([]).

openapi_ad_preview_request(Fields) ->
  Default = [ {'image_url', binary() }
            , {'title', binary() }
            , {'pin_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

