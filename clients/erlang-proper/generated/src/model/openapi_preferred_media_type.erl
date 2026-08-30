-module(openapi_preferred_media_type).

-include("openapi.hrl").

-export([openapi_preferred_media_type/0]).

-export_type([openapi_preferred_media_type/0]).

-type openapi_preferred_media_type() ::
  binary().

openapi_preferred_media_type() ->
  elements([<<"VIDEO">>, <<"IMAGE">>, <<"">>]).

