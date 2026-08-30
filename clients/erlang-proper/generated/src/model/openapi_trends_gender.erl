-module(openapi_trends_gender).

-include("openapi.hrl").

-export([openapi_trends_gender/0]).

-export_type([openapi_trends_gender/0]).

-type openapi_trends_gender() ::
  binary().

openapi_trends_gender() ->
  elements([<<"male">>, <<"female">>, <<"unspecified">>]).

