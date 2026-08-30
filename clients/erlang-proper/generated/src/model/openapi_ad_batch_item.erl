-module(openapi_ad_batch_item).

-include("openapi.hrl").

-export([openapi_ad_batch_item/0]).

-export([openapi_ad_batch_item/1]).

-export_type([openapi_ad_batch_item/0]).

-type openapi_ad_batch_item() ::
  [ {'data', openapi_ad:openapi_ad() }
  | {'exceptions', openapi_pinterest_lib_error:openapi_pinterest_lib_error() }
  ].


openapi_ad_batch_item() ->
    openapi_ad_batch_item([]).

openapi_ad_batch_item(Fields) ->
  Default = [ {'data', openapi_ad:openapi_ad() }
            , {'exceptions', openapi_pinterest_lib_error:openapi_pinterest_lib_error() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

