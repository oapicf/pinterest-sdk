-module(openapi_conversion_access_token).

-include("openapi.hrl").

-export([openapi_conversion_access_token/0]).

-export([openapi_conversion_access_token/1]).

-export_type([openapi_conversion_access_token/0]).

-type openapi_conversion_access_token() ::
  [ {'access_token', binary() }
  | {'token_type', binary() }
  ].


openapi_conversion_access_token() ->
    openapi_conversion_access_token([]).

openapi_conversion_access_token(Fields) ->
  Default = [ {'access_token', binary() }
            , {'token_type', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

