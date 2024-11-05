-module(openapi_audience_share_type).

-include("openapi.hrl").

-export([openapi_audience_share_type/0]).

-export_type([openapi_audience_share_type/0]).

-type openapi_audience_share_type() ::
  binary().

openapi_audience_share_type() ->
  elements([<<"SHARED">>, <<"RECEIVED">>]).

