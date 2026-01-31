-module(openapi_content_type).

-include("openapi.hrl").

-export([openapi_content_type/0]).

-export_type([openapi_content_type/0]).

-type openapi_content_type() ::
  binary().

openapi_content_type() ->
  elements([<<"image/jpeg">>, <<"image/png">>]).

