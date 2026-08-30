-module(openapi_amazon_connect_response).

-include("openapi.hrl").

-export([openapi_amazon_connect_response/0]).

-export([openapi_amazon_connect_response/1]).

-export_type([openapi_amazon_connect_response/0]).

-type openapi_amazon_connect_response() ::
  [ {'message', binary() }
  ].


openapi_amazon_connect_response() ->
    openapi_amazon_connect_response([]).

openapi_amazon_connect_response(Fields) ->
  Default = [ {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

