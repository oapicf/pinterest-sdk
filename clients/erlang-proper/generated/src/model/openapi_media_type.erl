-module(openapi_media_type).

-include("openapi.hrl").

-export([openapi_media_type/0]).

-export_type([openapi_media_type/0]).

-type openapi_media_type() ::
  binary().

openapi_media_type() ->
  elements([<<"IMAGE">>, <<"VIDEO">>]).

