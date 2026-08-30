-module(openapi_audience_ownership_type).

-include("openapi.hrl").

-export([openapi_audience_ownership_type/0]).

-export_type([openapi_audience_ownership_type/0]).

-type openapi_audience_ownership_type() ::
  binary().

openapi_audience_ownership_type() ->
  elements([<<"OWNED">>, <<"RECEIVED">>]).

