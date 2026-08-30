-module(openapi_attribution_match_type).

-include("openapi.hrl").

-export([openapi_attribution_match_type/0]).

-export_type([openapi_attribution_match_type/0]).

-type openapi_attribution_match_type() ::
  binary().

openapi_attribution_match_type() ->
  elements([<<"P">>, <<"D">>, <<"NA">>]).

