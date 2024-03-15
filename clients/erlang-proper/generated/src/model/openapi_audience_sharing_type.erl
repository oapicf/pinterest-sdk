-module(openapi_audience_sharing_type).

-include("openapi.hrl").

-export([openapi_audience_sharing_type/0]).

-export_type([openapi_audience_sharing_type/0]).

-type openapi_audience_sharing_type() ::
  binary().

openapi_audience_sharing_type() ->
  elements([<<"CUSTOM">>, <<"SYNDICATED">>]).

