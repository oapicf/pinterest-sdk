-module(openapi_http_method).

-include("openapi.hrl").

-export([openapi_http_method/0]).

-export_type([openapi_http_method/0]).

-type openapi_http_method() ::
  binary().

openapi_http_method() ->
  elements([<<"GET">>, <<"HEAD">>, <<"POST">>, <<"PUT">>, <<"DELETE">>, <<"CONNECT">>, <<"OPTIONS">>, <<"TRACE">>, <<"PATCH">>]).

